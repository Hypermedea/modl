const fs = require('fs');
const { exit } = require('process');

if (process.argv.length != 3) {
    console.log('Parameter <n> is required');
    exit(1);
}

const n = Number(process.argv[2]);
const range = Array.from({ length: n }, (v, i) => i);

const f = `${n}-dining-philosophers.modl`;
// erase content if the file exists
fs.writeFileSync(f, '');
// define an alias for appending data to file
const wf = str => fs.writeFileSync(f, str, { flag: 'a' });

// every philosopher has a state
wf('G(' + range.map(i => `philosopher${i}`).join(' ∧ ') + ') .\n');

wf('\n');

// every philosopher state is one of certain states
range.forEach(i => {
    wf(`G(philosopher${i} ↔ { 
        philosopher${i}Thinking
        philosopher${i}HoldingLeftFork
        philosopher${i}HoldingBothForks
        philosopher${i}Eating
        philosopher${i}ReleasingRightFork
        philosopher${i}ReleasingLeftFork
    }) .\n`);

    wf('\n');
});

// some states are mutually exclusive across philosophers
range.forEach(i => {
    if (i == range.length - 1) return;
    else wf(`G(philosopher${i}HoldingBothForks → ¬philosopher${i+1}HoldingBothForks) .\n`);
});

wf('\n');

// every philosopher deterministically triggers transitions
range.forEach(i => {
    wf(`G(philosopher${i}Thinking → X philosopher${i}HoldingLeftFork) .\n`);
    wf(`G(philosopher${i}HoldingLeftFork → X philosopher${i}HoldingBothForks) .\n`);
    wf(`G(philosopher${i}HoldingBothForks → X philosopher${i}Eating) .\n`);
    wf(`G(philosopher${i}Eating → X philosopher${i}ReleasingRightFork) .\n`);
    wf(`G(philosopher${i}ReleasingRightFork → X philosopher${i}ReleasingLeftFork) .\n`);
    wf(`G(philosopher${i}ReleasingLeftFork → X philosopher${i}Thinking) .\n`);

    wf('\n');
});

// all philosophers are initially thinking
wf('(' + range.map(i => `philosopher${i}Thinking`).join(' ∧ ') + ') .\n');