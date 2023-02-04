plot     'ltl-det/times.tsv' u 1:2 w lines, \
     'ltl-non-det/times.tsv' u 1:12:13 w filledcurves fc rgb '#80E0A080', \
                          '' u 1:14 w lines, \
             'ctl/times.tsv' u 1:2 w lines