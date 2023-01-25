package org.hypermedea;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.semanticweb.owlapi.model.parameters.Imports;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModlFormulaTest {

    @BeforeAll
    public static void initLogger() throws IOException {
        FileInputStream in = new FileInputStream("logging.properties");
        LogManager.getLogManager().readConfiguration(in);
    }

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

        assertEquals(3, phi.getOWLAxioms().getLogicalAxioms(Imports.EXCLUDED).size());
    }

    @Test
    public void testBuildQuantification() throws IOException {
        InputStream in = ModlFormulaTest.class.getClassLoader().getResourceAsStream("ctl.txt");

        ModlFormula phi = ModlFormula.build(in);

        assertEquals(3, phi.getOWLAxioms().getLogicalAxioms(Imports.EXCLUDED).size());
    }

}
