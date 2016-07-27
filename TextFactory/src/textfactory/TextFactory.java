/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfactory;

import frameworkinterfaces.IDocument;
import frameworkinterfaces.IEditor;
import frameworkinterfaces.IEditorFactory;
import frameworkinterfaces.IToolbar;
import java.util.ArrayList;



/**
 *
 * @author aluno
 */
public class TextFactory implements IEditorFactory {

    @Override
    public IEditor createEditor() {
        return new TextEditor();
    }

    @Override
    public IToolbar createToolbar() {
        return new TextToolbar();
    }

    @Override
    public IDocument createDocument() {
        return new TextDocument();
    }

    @Override
    public ArrayList<String> setSupportedExtensions() {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add(".txt");
        list.add(".doc");
        
        return list;
    }

    
    
}
