package org.hypermedea;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Translator {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void translate(String filename) throws IOException, OWLOntologyStorageException {
        FileInputStream input = new FileInputStream(filename);
        ModlFormula phi = ModlFormula.build(input);

        OWLOntology o = phi.getOWLAxioms();

        OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        m.saveOntology(o, new FileOutputStream("out.ttl"));
    }

}