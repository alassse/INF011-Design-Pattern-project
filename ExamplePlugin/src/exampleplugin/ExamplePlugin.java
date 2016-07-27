/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleplugin;

import frameworkinterfaces.ICore;
import frameworkinterfaces.IPlugin;
import frameworkinterfaces.IUiController;
import javax.swing.JMenuItem;

/**
 *
 * @author aluno
 */
public class ExamplePlugin implements IPlugin {

    @Override
    public boolean initialize(ICore core) {
        IUiController uiController = core.getUiController();
        JMenuItem jMenuItem1 = uiController.addMenuItem("File", "Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExitClicked(evt);
            }
        });
        
        JMenuItem jMenuItem2 = uiController.addMenuItem("Edit", "Copy");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCopyClicked(evt);
            }
        });

        return true;
    }
    
    private void editCopyClicked(java.awt.event.ActionEvent evt) {
        System.out.println("Copy clicked!");
    }
    
    private void fileExitClicked(java.awt.event.ActionEvent evt) {
        System.out.println("Exit clicked!");
        System.exit(0);
    }
}
