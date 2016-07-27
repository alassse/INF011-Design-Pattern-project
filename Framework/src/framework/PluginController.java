/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import frameworkinterfaces.IEditorFactory;
import frameworkinterfaces.IPlugin;
import frameworkinterfaces.IPluginController;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class PluginController implements IPluginController {

    public PluginController(Core core) {
        loadedPlugins = new ArrayList<IPlugin>();
        this.core = core;
    }
    
    @Override
    public boolean loadPlugins() {
        boolean ret = true;
        loadedPlugins.clear();

        File currentDir = new File("./plugins");
        String []plugins = currentDir.list();
        int i;
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                ret = false;
            }
        }

        URLClassLoader ulc = new URLClassLoader(jars);
        for (i = 0; i < plugins.length; i++) {
            String pluginName = plugins[i].split("\\.")[0];
            try {
                IPlugin plugin = (IPlugin) Class.forName(pluginName.toLowerCase() + "." + pluginName, true, ulc).newInstance();
                if (plugin != null) {
                    loadedPlugins.add(plugin);
                    plugin.initialize(core);
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                ret = false;
            }
        }

        return ret;
    }

    @Override
    public ArrayList<IPlugin> getLoadedPlugins() {
        return loadedPlugins;
    }
    private ArrayList<IPlugin> loadedPlugins;
    private Core core;

    @Override
    public IEditorFactory getFactoryBySupportedExtensions(String extension) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
