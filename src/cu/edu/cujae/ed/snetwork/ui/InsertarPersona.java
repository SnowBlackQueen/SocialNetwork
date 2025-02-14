/*
 * Copyright (C) 2022 Jose
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cu.edu.cujae.ed.snetwork.ui;

import cu.edu.cujae.ed.snetwork.logic.ApplicationController;
import cu.edu.cujae.ed.snetwork.logic.Person;
import cu.edu.cujae.ed.snetwork.utils.FileManager;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jose
 */
public class InsertarPersona extends javax.swing.JFrame
{

    private MainWindow mw;
    private File selectedPicture;

    /**
     * Creates new form InsertarPersona
     */
    public InsertarPersona(MainWindow mw)
    {
        initComponents();
        this.mw = mw;

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jTextPais = new javax.swing.JTextField();
        jTextProfesion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insertar Usuario");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos personales"));
        jPanel1.setToolTipText("Datos personales");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("ID:");

        jLabel4.setText("País:");

        jLabel5.setText("Profesión:");

        jTextNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTextNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTextNombreKeyTyped(evt);
            }
        });

        jTextApellidos.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTextApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTextApellidosKeyTyped(evt);
            }
        });

        jTextID.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTextIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTextIDKeyTyped(evt);
            }
        });

        jTextPais.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTextPaisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTextPaisKeyTyped(evt);
            }
        });

        jTextProfesion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTextProfesionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTextProfesionKeyTyped(evt);
            }
        });

        jLabel7.setText("Contraseña:");

        jTextPassword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTextPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombre)
                            .addComponent(jTextID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextPais, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextProfesion)
                            .addComponent(jTextApellidos))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonCrear.setText("Crear");
        jButtonCrear.setEnabled(false);
        jButtonCrear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCrearActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(3);
        jTextArea1.setText("Bienvenido a la nueva red profesional SocialNetWork \npara compartir amistad en el plano profesional, complete \nlos siguientes datos para pertenecer a nuestra comunidad.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setIcon(UIManager.getIcon("FileView.fileIcon")
        );
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 128, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAtras))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras)
                    .addComponent(jButtonCrear))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAtrasActionPerformed
    {//GEN-HEADEREND:event_jButtonAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextNombreKeyTyped
    {//GEN-HEADEREND:event_jTextNombreKeyTyped
        char key = evt.getKeyChar();

        if (!Character.isAlphabetic(key) && !Character.isSpaceChar(key))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextIDKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextIDKeyTyped
    {//GEN-HEADEREND:event_jTextIDKeyTyped
        if (jTextID.getText().length() > 10)
        {
            evt.consume();
        }

        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextIDKeyTyped

    private void jTextApellidosKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextApellidosKeyTyped
    {//GEN-HEADEREND:event_jTextApellidosKeyTyped
        char key = evt.getKeyChar();

        if (!Character.isAlphabetic(key) && !Character.isSpaceChar(key))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextApellidosKeyTyped

    private void jTextPaisKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextPaisKeyTyped
    {//GEN-HEADEREND:event_jTextPaisKeyTyped
        char key = evt.getKeyChar();

        if (!Character.isAlphabetic(key) && !Character.isSpaceChar(key))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextPaisKeyTyped

    private void jTextProfesionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextProfesionKeyTyped
    {//GEN-HEADEREND:event_jTextProfesionKeyTyped
        char key = evt.getKeyChar();

        if (!Character.isAlphabetic(key) && !Character.isSpaceChar(key))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextProfesionKeyTyped

    private void jTextNombreKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextNombreKeyReleased
    {//GEN-HEADEREND:event_jTextNombreKeyReleased
        activarCrear();
    }//GEN-LAST:event_jTextNombreKeyReleased

    private void jTextApellidosKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextApellidosKeyReleased
    {//GEN-HEADEREND:event_jTextApellidosKeyReleased
        activarCrear();
    }//GEN-LAST:event_jTextApellidosKeyReleased

    private void jTextIDKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextIDKeyReleased
    {//GEN-HEADEREND:event_jTextIDKeyReleased
        activarCrear();
    }//GEN-LAST:event_jTextIDKeyReleased

    private void jTextPaisKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextPaisKeyReleased
    {//GEN-HEADEREND:event_jTextPaisKeyReleased
        activarCrear();
    }//GEN-LAST:event_jTextPaisKeyReleased

    private void jTextProfesionKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextProfesionKeyReleased
    {//GEN-HEADEREND:event_jTextProfesionKeyReleased
        activarCrear();
    }//GEN-LAST:event_jTextProfesionKeyReleased

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCrearActionPerformed
    {//GEN-HEADEREND:event_jButtonCrearActionPerformed
        boolean result = false;
        if (!jTextNombre.getText().isEmpty() && !jTextApellidos.getText().isEmpty() && !jTextID.getText().isEmpty() && !jTextPais.
            getText().isEmpty() && !jTextProfesion.getText().isEmpty())
        {
            if (validarID() && validarNombre() && validarApellidos() && validarPais() && validarProfesion())
            {
                String ID = jTextID.getText();
                if (!ApplicationController.getInstance().existProfile(ID))
                {
                    try
                {
                    String fileName = FileManager.PPIC_NAME;

                    String nombre = jTextNombre.getText();
                    String apellidos = jTextApellidos.getText();
                    String pais = jTextPais.getText();
                    String profesion = jTextProfesion.getText();
                    String contrasena = jTextPassword.getText();

                    if (selectedPicture != null)
                    {
                        try
                        {
                            mw.getFileManager().addProfile(ID);
                            Path path
                                     = Paths.get(mw.getFileManager().getProfileDir(ID).
                                    getAbsolutePath(), fileName);
                            if (path.toFile().exists() == false)
                            {
                                Files.copy(selectedPicture.toPath(), path);
                            }
                        }
                        catch (IOException ex)
                        {
                            // Logger.getLogger(InsertarPersona.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), ex.toString(),
                                                          JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        mw.getFileManager().addProfile(ID);
                            Path path
                                     = Paths.get(mw.getFileManager().getProfileDir(ID).
                                    getAbsolutePath(), fileName);
                            if (path.toFile().exists() == false)
                            {
                                Files.copy(Path.of("snet/data/ppic.jpg"), path);
                        }
                    }

                    FileManager fm = mw.getFileManager();
                    Person p = new Person(nombre, apellidos, ID, pais, profesion, contrasena, fm.getPictureInProfile(ID,
                                                                                                                     fileName));
                    result = ApplicationController.getInstance().addPerson(p);
                    mw.getSidePanel().addPerson(p);
                    mw.revalidate();
                }
                catch (IOException ex)
                {
                    // Logger.getLogger(InsertarPersona.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), ex.toString(),
                                                  JOptionPane.ERROR_MESSAGE);
                }
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Ya existe un perfil con este ID", "No se puede añadir",
                                                  JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Complete todos los datos", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Fotos", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            selectedPicture = chooser.getSelectedFile();

            ImageIcon icon = new ImageIcon(selectedPicture.getAbsolutePath());
            Image img = icon.getImage();
            Image scaled = img.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);

            jLabel6.setIcon(new ImageIcon(scaled));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextNombreActionPerformed
    {//GEN-HEADEREND:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextPasswordKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextPasswordKeyReleased
    {//GEN-HEADEREND:event_jTextPasswordKeyReleased
        activarCrear();
    }//GEN-LAST:event_jTextPasswordKeyReleased

    /**
     * @param args the command line arguments
     */
    public void activarCrear()
    {
        if (!jTextNombre.getText().isEmpty() && !jTextApellidos.getText().isEmpty() && !jTextID.getText().isEmpty() && !jTextPais.
            getText().isEmpty() && !jTextProfesion.getText().isEmpty() && !jTextPassword.getText().isEmpty())
        {
            jButtonCrear.setEnabled(true);
        }
        else
        {
            jButtonCrear.setEnabled(false);
        }
    }

    public boolean validarID()
    {
        boolean val = true;
        boolean flag;
        String CI = jTextID.getText();
        String diaA, mesA, anoA;
        int diaB, mesB, anoB;
        if (CI.length() == 11)
        {
            for (int i = 0; i < CI.length() && val; i++)
            {
                flag = Character.isDigit(CI.charAt(i));
                if (flag)
                {
                    diaA = CI.substring(4, 6);
                    mesA = CI.substring(2, 4);
                    anoA = CI.substring(0, 2);
                    diaB = Integer.parseInt(diaA);
                    mesB = Integer.parseInt(mesA);
                    anoB = Integer.parseInt(anoA);

                    if ((anoB > 50 && anoB < 100) || (anoB >= 0 && anoB < 5))
                    {
                        if (mesB > 0 && mesB <= 12)
                        {
                            if (mesB == 1 || mesB == 3 || mesB == 5 || mesB == 7 || mesB == 8 || mesB == 10 || mesB == 12)
                            {
                                if (diaB > 31)
                                {
                                    val = false;
                                    JOptionPane.showMessageDialog(null, "Fecha no válida", "CI no válido",
                                                                  JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else if (mesB == 4 || mesB == 6 || mesB == 9 || mesB == 11)
                            {
                                if (diaB > 30)
                                {
                                    val = false;
                                    JOptionPane.showMessageDialog(null, "Fecha no válida", "CI no válido",
                                                                  JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else if (mesB == 2)
                            {
                                if (anoB % 4 != 0 && diaB > 28)
                                {
                                    val = false;
                                    JOptionPane.showMessageDialog(null, "Fecha no válida", "CI no válido",
                                                                  JOptionPane.ERROR_MESSAGE);
                                }
                                else if (anoB % 4 == 0 && diaB > 29)
                                {
                                    val = false;
                                    JOptionPane.showMessageDialog(null, "Fecha no válida", "CI no válido",
                                                                  JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        else
                        {
                            val = false;
                            JOptionPane.showMessageDialog(null, "Mes no válido", "CI no válido",
                                                          JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                    {
                        val = false;
                        JOptionPane.showMessageDialog(null, "Año no válido", "CI no válido", JOptionPane.ERROR_MESSAGE);
                    }
                }

                else
                {
                    val = false;
                    JOptionPane.showMessageDialog(null, "El CI solo puede contener dígitos", "CI no válido",
                                                  JOptionPane.ERROR_MESSAGE);
                }

            }
        }
        else
        {
            val = false;
            JOptionPane.
                showMessageDialog(null, "El CI debe tener 11 dígitos", "CI no válido", JOptionPane.ERROR_MESSAGE);
        }
        return val;
    }

    public boolean validarNombre()
    {
        boolean result = true;
        boolean flag;
        String nombre = jTextNombre.getText();
        for (int i = 0; i < nombre.length() && result; i++)
        {
            flag = Character.isUpperCase(nombre.charAt(0)) && nombre.charAt(0) != ' ' && (Character.isLetter(nombre.
                                                                                          charAt(i)) || nombre.charAt(i) == ' ');
            if (!flag)
            {
                result = false;
                JOptionPane.showMessageDialog(null, "El nombre debe iniciar con letra mayúscula", "Nombre incorrecto",
                                              JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;

    }

    public boolean validarApellidos()
    {
        boolean result = true;
        boolean flag;
        String apellidos = jTextApellidos.getText();
        for (int i = 0; i < apellidos.length() && result; i++)
        {
            flag = Character.isUpperCase(apellidos.charAt(0)) && apellidos.charAt(0) != ' ' && (Character.isLetter(
                                                                                                apellidos.charAt(i)) || apellidos.
                                                                                                charAt(i) == ' ');
            if (!flag)
            {
                result = false;
                JOptionPane.showMessageDialog(null, "Los apellidos deben iniciar con letra mayúscula",
                                              "Apellidos incorrectos", JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;
    }

    public boolean validarPais()
    {
        boolean result = true;
        boolean flag;
        String apellidos = jTextPais.getText();
        for (int i = 0; i < apellidos.length() && result; i++)
        {
            flag = Character.isUpperCase(apellidos.charAt(0)) && apellidos.charAt(0) != ' ' && (Character.isLetter(
                                                                                                apellidos.charAt(i)) || apellidos.
                                                                                                charAt(i) == ' ');
            if (!flag)
            {
                result = false;
                JOptionPane.showMessageDialog(null, "El país debe iniciar con letra mayúscula", "País incorrecto",
                                              JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;
    }

    public boolean validarProfesion()
    {
        boolean result = true;
        boolean flag;
        String apellidos = jTextProfesion.getText();
        for (int i = 0; i < apellidos.length() && result; i++)
        {
            flag = Character.isUpperCase(apellidos.charAt(0)) && apellidos.charAt(0) != ' ' && (Character.isLetter(
                                                                                                apellidos.charAt(i)) || apellidos.
                                                                                                charAt(i) == ' ');
            if (!flag)
            {
                result = false;
                JOptionPane.showMessageDialog(null, "La profesión debe iniciar con letra mayúscula",
                                              "Profesión incorrecta", JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPais;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextProfesion;
    // End of variables declaration//GEN-END:variables
}
