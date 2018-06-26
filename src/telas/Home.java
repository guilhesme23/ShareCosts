/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import app.Principal;
import dweller.Person;
import files.FileHandler;
import household.Republic;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author guilherme
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Republic republic;
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Root = new javax.swing.JPanel();
        homeCard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        formPerson = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameEntry = new javax.swing.JTextField();
        emailEntry = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        incomeEntry = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        formEditPerson = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        newName = new javax.swing.JTextField();
        newEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        newIncome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        namesList = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadButton = new javax.swing.JRadioButtonMenuItem();
        saveButton = new javax.swing.JRadioButtonMenuItem();
        exportTxt = new javax.swing.JRadioButtonMenuItem();
        newMenu = new javax.swing.JMenu();
        homeButton = new javax.swing.JRadioButtonMenuItem();
        newPersonButton = new javax.swing.JRadioButtonMenuItem();
        editMenu = new javax.swing.JMenu();
        editPerson = new javax.swing.JRadioButtonMenuItem();
        showMenu = new javax.swing.JMenu();
        showDwellers = new javax.swing.JRadioButtonMenuItem();
        showCosts = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        Root.setBackground(new java.awt.Color(226, 242, 243));
        Root.setLayout(new java.awt.CardLayout());

        homeCard.setBackground(new java.awt.Color(226, 242, 243));
        homeCard.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 108, 103));
        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout homeCardLayout = new javax.swing.GroupLayout(homeCard);
        homeCard.setLayout(homeCardLayout);
        homeCardLayout.setHorizontalGroup(
            homeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        homeCardLayout.setVerticalGroup(
            homeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeCardLayout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        Root.add(homeCard, "home");

        formPerson.setBackground(new java.awt.Color(226, 242, 243));
        formPerson.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(31, 108, 103));
        jLabel2.setText("Add Person");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel5.setText("Income:");

        jButton1.setBackground(new java.awt.Color(134, 205, 205));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPersonLayout = new javax.swing.GroupLayout(formPerson);
        formPerson.setLayout(formPersonLayout);
        formPersonLayout.setHorizontalGroup(
            formPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameEntry)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailEntry)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(incomeEntry))
                    .addComponent(jButton1))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        formPersonLayout.setVerticalGroup(
            formPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomeEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        Root.add(formPerson, "newPerson");

        formEditPerson.setBackground(new java.awt.Color(226, 242, 243));
        formEditPerson.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(31, 108, 103));
        jLabel6.setText("Edit Person");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel9.setText("Income:");

        jButton2.setBackground(new java.awt.Color(134, 205, 205));
        jButton2.setText("Apply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel10.setText("Select Person:");

        jButton3.setBackground(new java.awt.Color(134, 205, 205));
        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(134, 205, 205));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        namesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "item1", "item2", "item3", "item4", "item5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        namesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(namesList);

        javax.swing.GroupLayout formEditPersonLayout = new javax.swing.GroupLayout(formEditPerson);
        formEditPerson.setLayout(formEditPersonLayout);
        formEditPersonLayout.setHorizontalGroup(
            formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEditPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newName)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newEmail)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newIncome))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(formEditPersonLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(formEditPersonLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        formEditPersonLayout.setVerticalGroup(
            formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formEditPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formEditPersonLayout.createSequentialGroup()
                        .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(formEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        Root.add(formEditPerson, "editPerson");

        jMenuBar1.setBackground(new java.awt.Color(134, 205, 205));
        jMenuBar1.setBorder(null);

        fileMenu.setForeground(new java.awt.Color(31, 108, 103));
        fileMenu.setText("File");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        loadButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loadButton.setBackground(new java.awt.Color(182, 224, 224));
        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        fileMenu.add(loadButton);

        saveButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveButton.setBackground(new java.awt.Color(182, 224, 224));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        fileMenu.add(saveButton);

        exportTxt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exportTxt.setBackground(new java.awt.Color(182, 224, 224));
        exportTxt.setText("Export txt");
        exportTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportTxtActionPerformed(evt);
            }
        });
        fileMenu.add(exportTxt);

        jMenuBar1.add(fileMenu);

        newMenu.setForeground(new java.awt.Color(31, 108, 103));
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });

        homeButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        homeButton.setBackground(new java.awt.Color(182, 224, 224));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        newMenu.add(homeButton);

        newPersonButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newPersonButton.setBackground(new java.awt.Color(182, 224, 224));
        newPersonButton.setText("New Person");
        newPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonButtonActionPerformed(evt);
            }
        });
        newMenu.add(newPersonButton);

        jMenuBar1.add(newMenu);

        editMenu.setForeground(new java.awt.Color(31, 108, 103));
        editMenu.setText("Edit");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        editPerson.setBackground(new java.awt.Color(182, 224, 224));
        editPerson.setText("Edit Person");
        editPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPersonActionPerformed(evt);
            }
        });
        editMenu.add(editPerson);

        jMenuBar1.add(editMenu);

        showMenu.setForeground(new java.awt.Color(31, 108, 103));
        showMenu.setText("Show");
        showMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMenuActionPerformed(evt);
            }
        });

        showDwellers.setBackground(new java.awt.Color(182, 224, 224));
        showDwellers.setText("Dwellers");
        showDwellers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDwellersActionPerformed(evt);
            }
        });
        showMenu.add(showDwellers);

        showCosts.setBackground(new java.awt.Color(182, 224, 224));
        showCosts.setText("Costs");
        showCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCostsActionPerformed(evt);
            }
        });
        showMenu.add(showCosts);

        jMenuBar1.add(showMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        CardLayout card = (CardLayout) Root.getLayout();
        card.show(Root,"home");
    }//GEN-LAST:event_newMenuActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        CardLayout card = (CardLayout) Root.getLayout();
        card.show(Root,"home");
    }//GEN-LAST:event_homeButtonActionPerformed

    private void newPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonButtonActionPerformed
        CardLayout card = (CardLayout) Root.getLayout();
        card.show(Root,"newPerson");
    }//GEN-LAST:event_newPersonButtonActionPerformed

    private void showDwellersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDwellersActionPerformed
        Principal.republic.showResidents();
    }//GEN-LAST:event_showDwellersActionPerformed

    private void showCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showCostsActionPerformed

    private void showMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = nameEntry.getText();
        String email = emailEntry.getText();
        String income = incomeEntry.getText();
        
        try {
            Principal.republic.addPerson(name, email, income);
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
        } catch(IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Dados inválidos\nPor favor repita a operação");
        }
        
        nameEntry.setText("");
        emailEntry.setText("");
        incomeEntry.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "It will override the actual saved file. Are you sure?");
        
        if (showConfirmDialog == JOptionPane.YES_OPTION) {
            FileHandler.saveObject(Principal.republic, "alunos.bin");
            JOptionPane.showMessageDialog(null, "Saved succefully!");
        } else {
            JOptionPane.showMessageDialog(null, "Aborted!");
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        Principal.republic = (Republic) FileHandler.loadObject("alunos.bin");
        JOptionPane.showMessageDialog(null, "Loaded file");
    }//GEN-LAST:event_loadButtonActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    private void exportTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportTxtActionPerformed
        try {
            FileHandler.exportObject(Principal.republic, "alunos.txt");
            JOptionPane.showMessageDialog(null, "Exportado com sucesso!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha na exportação!");
        }
    }//GEN-LAST:event_exportTxtActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Resolvendo aqui irmão
        String selected = namesList.getSelectedValue();
        Republic r = Principal.republic;
        LinkedList<Person> residents = r.getResidents();
        int index = namesList.getSelectedIndex();
        if (selected != null) {
            Person p = r.searchPerson(selected);
            String name = newName.getText();
            String email = newEmail.getText();
            String income = newIncome.getText();
            Person newPerson;
            
            try {
                newPerson = new Person(name,email,income);
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Insira dados válidos!");
                newName.setText(p.getName());
                newEmail.setText(p.getEmail());
                newIncome.setText(Float.toString(p.getIncome()));
                
                return;
            }
            
            residents.set(index, newPerson);
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma pessoa primeiro!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPersonActionPerformed
        DefaultListModel model = new DefaultListModel();
        model.clear();

        for(Person p: Principal.republic.getResidents()) {
            model.addElement(p.getName());
        }
        
        namesList.setModel(model);
        CardLayout card = (CardLayout) Root.getLayout();
        card.show(Root,"editPerson");
    }//GEN-LAST:event_editPersonActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String selected = namesList.getSelectedValue();
        Republic r = Principal.republic;
        if(selected != null) {
            Person p = r.searchPerson(selected);
            newName.setText(p.getName());
            newEmail.setText(p.getEmail());
            newIncome.setText(Float.toString(p.getIncome()));
           
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma Pessoa!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout card = (CardLayout) Root.getLayout();
        card.show(Root,"home");
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Root;
    private javax.swing.JMenu editMenu;
    private javax.swing.JRadioButtonMenuItem editPerson;
    private javax.swing.JTextField emailEntry;
    private javax.swing.JRadioButtonMenuItem exportTxt;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel formEditPerson;
    private javax.swing.JPanel formPerson;
    private javax.swing.JRadioButtonMenuItem homeButton;
    private javax.swing.JPanel homeCard;
    private javax.swing.JTextField incomeEntry;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButtonMenuItem loadButton;
    private javax.swing.JTextField nameEntry;
    private javax.swing.JList<String> namesList;
    private javax.swing.JTextField newEmail;
    private javax.swing.JTextField newIncome;
    private javax.swing.JMenu newMenu;
    private javax.swing.JTextField newName;
    private javax.swing.JRadioButtonMenuItem newPersonButton;
    private javax.swing.JRadioButtonMenuItem saveButton;
    private javax.swing.JRadioButtonMenuItem showCosts;
    private javax.swing.JRadioButtonMenuItem showDwellers;
    private javax.swing.JMenu showMenu;
    // End of variables declaration//GEN-END:variables
}
