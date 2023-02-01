package org.hypermedea;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.LogManager;

import static java.lang.System.exit;

public class Translator {

    private static final Logger logger = LoggerFactory.getLogger(Translator.class);

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("logging.properties");
        LogManager.getLogManager().readConfiguration(in);

        if (args.length != 1) {
            logger.error("Filename argument is missing: a formula must be provided");
            exit(1);
        }

        String f = args[0];

        try {
            new Translator().translate(f);
        } catch (OWLOntologyStorageException e) {
            logger.error("Could not save OWL ontology", e);
        }
    }

    public void translate(String filename) throws IOException, OWLOntologyStorageException {
        FileInputStream input = new FileInputStream(filename);
        ModlFormula phi = ModlFormula.build(input);

        OWLOntology o = phi.getOWLAxioms();

        // TODO helpers to add deadlock and other useful properties.

        OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        m.saveOntology(o, new TurtleDocumentFormat(), new FileOutputStream("out.ttl"));
    }

}