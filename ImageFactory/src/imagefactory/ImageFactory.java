/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagefactory;

import frameworkinterfaces.IDocument;
import frameworkinterfaces.IEditor;
import frameworkinterfaces.IEditorFactory;
import frameworkinterfaces.IToolbar;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ImageFactory implements IEditorFactory {

    @Override
    public IEditor createEditor() {
        return new ImageEditor();
    }

    @Override
    public IToolbar createToolbar() {
        return new ImageToolbar();
    }

    @Override
    public IDocument createDocument() {
        return new ImageDocument();
    }
    
    @Override
    public ArrayList<String> setSupportedExtensions() {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add(".jpg");
        list.add(".png");
        list.add(".gif");
        list.add(".jpeg");
        
        return list;
    }

    
}
