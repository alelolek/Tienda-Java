/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

/**
 *
 * @author USER
 */
public class ProductoView extends javax.swing.JFrame {

    /** Creates new form ClienteView */
    public ProductoView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEliminarProducto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnBuscarProducto = new javax.swing.JLabel();
        txtBuscarId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnNuevoProducto = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificaProducto = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCategoriaProducto = new javax.swing.JTextField();
        txtDescripcionProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 199, 215));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TAWAQUI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRODUCTOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_customer_64px.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarProducto.setBackground(new java.awt.Color(255, 199, 215));
        btnEliminarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cliente.png"))); // NOI18N
        btnEliminarProducto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ELIMINAR");
        btnEliminarProducto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 50));

        jPanel2.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 230, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 199, 215), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        btnBuscarProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 199, 215), 2, true));
        jPanel5.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 50, 50));

        txtBuscarId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarId.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarId.setText("Buscar...");
        txtBuscarId.setBorder(null);
        txtBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarIdActionPerformed(evt);
            }
        });
        jPanel5.add(txtBuscarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 230, 50));

        tblProducto.setBackground(new java.awt.Color(255, 199, 215));
        tblProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 199, 215), 2));
        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CATEGORIA", "PRECIO", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 810, 170));

        btnNuevoProducto.setBackground(new java.awt.Color(255, 199, 215));
        btnNuevoProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cliente.png"))); // NOI18N
        btnNuevoProducto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NUEVO");
        btnNuevoProducto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 50));

        jPanel2.add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 230, 50));

        btnModificaProducto.setBackground(new java.awt.Color(255, 199, 215));
        btnModificaProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cliente.png"))); // NOI18N
        btnModificaProducto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MODIFICAR");
        btnModificaProducto.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 50));

        jPanel2.add(btnModificaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 230, 50));
        jPanel2.add(txtCategoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 30));
        jPanel2.add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 140, 30));

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 30));
        jPanel2.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 30));
        jPanel2.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 870, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIdActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscarProducto;
    private javax.swing.JPanel btnEliminarProducto;
    private javax.swing.JPanel btnModificaProducto;
    private javax.swing.JPanel btnNuevoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtBuscarId;
    private javax.swing.JTextField txtCategoriaProducto;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables

}
