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
public class CompraView extends javax.swing.JFrame {

    /** Creates new form ClienteView */
    public CompraView() {
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
        btnEliminarCompra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnBuscarDetalle = new javax.swing.JLabel();
        txtBuscarId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        btnNuevaCompra = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificaCompra = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtcCodigoProducto = new javax.swing.JTextField();
        txtIdCompra = new javax.swing.JTextField();
        txtCatidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 199, 215));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TAWAQUI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Detalle Compra");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_customer_64px.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarCompra.setBackground(new java.awt.Color(255, 199, 215));
        btnEliminarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cliente.png"))); // NOI18N
        btnEliminarCompra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ELIMINAR");
        btnEliminarCompra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 50));

        jPanel2.add(btnEliminarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 230, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 199, 215), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarDetalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        btnBuscarDetalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 199, 215), 2, true));
        jPanel5.add(btnBuscarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 50, 50));

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

        tblCompra.setBackground(new java.awt.Color(255, 199, 215));
        tblCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 199, 215), 2));
        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "CODIGO DE PRODUCTO", "CODIGO DE CLIENTE", "CANTIDAD"
            }
        ));
        jScrollPane1.setViewportView(tblCompra);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 810, 170));

        btnNuevaCompra.setBackground(new java.awt.Color(255, 199, 215));
        btnNuevaCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cliente.png"))); // NOI18N
        btnNuevaCompra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NUEVO");
        btnNuevaCompra.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 50));

        jPanel2.add(btnNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 230, 50));

        btnModificaCompra.setBackground(new java.awt.Color(255, 199, 215));
        btnModificaCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cliente.png"))); // NOI18N
        btnModificaCompra.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MODIFICAR");
        btnModificaCompra.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 50));

        jPanel2.add(btnModificaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 230, 50));
        jPanel2.add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 30));
        jPanel2.add(txtcCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 30));
        jPanel2.add(txtIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 30));
        jPanel2.add(txtCatidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 870, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscarDetalle;
    private javax.swing.JPanel btnEliminarCompra;
    private javax.swing.JPanel btnModificaCompra;
    private javax.swing.JPanel btnNuevaCompra;
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
    private javax.swing.JTable tblCompra;
    private javax.swing.JTextField txtBuscarId;
    private javax.swing.JTextField txtCatidad;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtIdCompra;
    private javax.swing.JTextField txtcCodigoProducto;
    // End of variables declaration//GEN-END:variables

}