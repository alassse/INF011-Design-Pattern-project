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
public interface IPluginController {
    public boolean loadPlugins();
    public ArrayList<IPlugin> getLoadedPlugins();
    public IEditorFactory getFactoryBySupportedExtensions(String extension);
}
