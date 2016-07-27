/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfactory;

import frameworkinterfaces.IDocument;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class TextDocument implements IDocument {

    @Override
    public void openDocument() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readDocument() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeDocument() {
        String file;
        file = new String();
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(file));
            //buffer.write();
        } catch (IOException ex) {
            Logger.getLogger(TextDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void saveDocument() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
