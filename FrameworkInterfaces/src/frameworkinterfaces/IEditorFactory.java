/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkinterfaces;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface IEditorFactory {
    public IEditor createEditor();
    public IToolbar createToolbar();    
    public IDocument createDocument();
    public ArrayList<String> setSupportedExtensions();

}
