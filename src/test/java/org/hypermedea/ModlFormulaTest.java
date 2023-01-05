package org.hypermedea;

import org.junit.jupiter.api.Test;
import org.semanticweb.owlapi.model.parameters.Imports;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModlFormulaTest {

    @Test
    public void testBuildBooleanFormula() throws IOException {
        InputStream in = ModlFormulaTest.class.getClassLoader().getResourceAsStream("p.txt");

        ModlFormula phi = ModlFormula.build(in);

        assertEquals(1, phi.getOWLAxioms().getABoxAxioms(Imports.EXCLUDED).size());
    }

    @Test
    public void testBuildTemporalFormula() throws IOException {
        InputStream in = ModlFormulaTest.class.getClassLoader().getResourceAsStream("ltl.txt");

        ModlFormula phi = ModlFormula.build(in);

        assertEquals(2, phi.getOWLAxioms().getLogicalAxioms(Imports.EXCLUDED).size());
    }

}
