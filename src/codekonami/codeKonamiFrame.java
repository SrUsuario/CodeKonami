package codekonami;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Interfaz gráfica del programa
 *
 * @author SrUsuario
 */
public class codeKonamiFrame extends JFrame {

    /**
     * Creates new form CodeKonamiFrame
     */
    public codeKonamiFrame() {
        initComponents();
        jLblKeys.setVisible(false);
        jBtnKonami.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * Getter de jLblInformation
     *
     * @return Devuelve jLblInformation
     */
    public JLabel getjLblInformation() {
        return jLblInformation;
    }

    /**
     * Getter de jBtnKonami
     *
     * @return Devuelve jBtnKonami
     */
    public JButton getjBtnKonami() {
        return jBtnKonami;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlMain = new javax.swing.JPanel();
        jBtnAlways = new javax.swing.JButton();
        jLblInformation = new javax.swing.JLabel();
        jBtnKonami = new javax.swing.JButton();
        jPnlInformation = new javax.swing.JPanel();
        jLblKeys = new javax.swing.JLabel();
        jMBar = new javax.swing.JMenuBar();
        jMnu = new javax.swing.JMenu();
        AboutJMnuItem = new javax.swing.JMenuItem();
        ExitJMnuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeKonami");
        setLocation(new java.awt.Point(0, 0));
        setName("frame"); // NOI18N
        setResizable(false);

        jPnlMain.setFocusable(false);
        jPnlMain.setLayout(new java.awt.GridLayout(3, 1));

        jBtnAlways.setBackground(new java.awt.Color(0, 120, 215));
        jBtnAlways.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAlways.setText("Mostrar teclas");
        jBtnAlways.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAlways.setFocusable(false);
        jBtnAlways.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlwaysActionPerformed(evt);
            }
        });
        jPnlMain.add(jBtnAlways);

        jLblInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblInformation.setText("Presiona el botón y intenta ejecutar el Code Konami");
        jLblInformation.setToolTipText("");
        jLblInformation.setFocusable(false);
        jPnlMain.add(jLblInformation);

        jBtnKonami.setBackground(new java.awt.Color(239, 184, 16));
        jBtnKonami.setForeground(new java.awt.Color(255, 255, 255));
        jBtnKonami.setText("Code Konami activado");
        jBtnKonami.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnKonami.setFocusable(false);
        jBtnKonami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnKonamiActionPerformed(evt);
            }
        });
        jPnlMain.add(jBtnKonami);

        jPnlInformation.setLayout(new java.awt.GridLayout(1, 0));

        jLblKeys.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblKeys.setText("Combinación: Up, up, down, down, left, right, left, right, B, A");
        jPnlInformation.add(jLblKeys);

        jMnu.setText("Menu");

        AboutJMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AboutJMnuItem.setText("Acerca de");
        AboutJMnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutJMnuItemActionPerformed(evt);
            }
        });
        jMnu.add(AboutJMnuItem);

        ExitJMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ExitJMnuItem.setText("Salir");
        ExitJMnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitJMnuItemActionPerformed(evt);
            }
        });
        jMnu.add(ExitJMnuItem);

        jMBar.add(jMnu);

        setJMenuBar(jMBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPnlInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jPnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPnlInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnKonamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnKonamiActionPerformed
        JOptionPane.showMessageDialog(this, "Felicidades has descubierto un secreto",
                "Secreto", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnKonamiActionPerformed

    private void jBtnAlwaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlwaysActionPerformed
        jLblKeys.setVisible(true);
    }//GEN-LAST:event_jBtnAlwaysActionPerformed

    private void ExitJMnuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitJMnuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitJMnuItemActionPerformed

    private void AboutJMnuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutJMnuItemActionPerformed
        AboutDialog dialog = new AboutDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_AboutJMnuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutJMnuItem;
    private javax.swing.JMenuItem ExitJMnuItem;
    private javax.swing.JButton jBtnAlways;
    private javax.swing.JButton jBtnKonami;
    private javax.swing.JLabel jLblInformation;
    private javax.swing.JLabel jLblKeys;
    private javax.swing.JMenuBar jMBar;
    private javax.swing.JMenu jMnu;
    private javax.swing.JPanel jPnlInformation;
    private javax.swing.JPanel jPnlMain;
    // End of variables declaration//GEN-END:variables
}
