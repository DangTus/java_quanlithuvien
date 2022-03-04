package client;

import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Document;
import sever.DocumentService;

public class DocumentView extends javax.swing.JFrame {
    DocumentService documentService;
    DefaultTableModel defaultTableModel;

    public DocumentView() throws ClassNotFoundException, SQLException{
        initComponents();
        documentService = new DocumentService();        
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) { //Cái này là để k cho sửa trực tiếp trên bảng
                return false;
            }
        };
        userTable.setModel(defaultTableModel);   
        // Tạo hàng tiêu đề
        defaultTableModel.addColumn("id");
        defaultTableModel.addColumn("Tên tài liệu");
        defaultTableModel.addColumn("Tên nhà xuất bản");
        defaultTableModel.addColumn("Số lượng");        
        showTableData(0); // Đổ dữ liệu vào bảng
        
        // select thể loại
        chonLoaiCombobox.addItem("Tất cả");
        List<String> categories = documentService.getCategori();
        for(String categori : categories) {
            chonLoaiCombobox.addItem(categori);
        }
    }
    // Hàm này dùng để đổ dữ liệu vào bảng
    private void showTableData(int idLoai) throws ClassNotFoundException, SQLException {
        if(documentService.getAll(idLoai).size() == 0) { // Kiểm tra xem có dữ liệu không
            defaultTableModel.addRow(new Object[]{"Không có sách"});
        } else {
            setTableData(documentService.getAll(idLoai));
        }
    }
    // Hàm này dùng để đổ dữ liệu từng dòng
    private void setTableData(List<Document> documents) {
        for(Document document : documents) {
            defaultTableModel.addRow(new Object[]{document.getId(), document.getTenTaiLieu()
                                                , document.getTenNXB(), document.getSoLuong()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        chonLoaiCombobox = new javax.swing.JComboBox<>();
        exitButton = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thư viện");

        addButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addButton.setText("Thêm mới");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        refreshButton.setText("Làm mới");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ SÁCH");

        userTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(userTable);

        viewButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        viewButton.setText("Xem chi tiết");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        deleteButton.setText("Xóa");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        chonLoaiCombobox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chonLoaiCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonLoaiComboboxActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        exitButton.setText("Thoát");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(refreshButton)
                        .addGap(143, 143, 143)
                        .addComponent(chonLoaiCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewButton)
                        .addGap(116, 116, 116)
                        .addComponent(deleteButton)
                        .addGap(139, 139, 139)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(chonLoaiCombobox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        chonLoaiCombobox.setSelectedItem("Tất cả");
        JOptionPane.showMessageDialog(this, "Làm mới thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        new DocumentAdd().setVisible(true); // Chuyển qua trang add
        this.dispose(); // Đóng trang hiện tại
    }//GEN-LAST:event_addButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int row = userTable.getSelectedRow(); //Xác định hàng mà mình đã chọn
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn tài liệu cần xem trước đi bạn ei", "Lỗi rồi bạn ei", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = Integer.valueOf(String.valueOf(userTable.getValueAt(row, 0)));
            
            try {
                new DocumentViewById(id).setVisible(true); // Chuyển qua trang xem
                this.dispose(); // Đóng trang hiện tại
            } catch (SQLException ex) {
                Logger.getLogger(DocumentView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
//        int row = userTable.getSelectedRow(); //Xác định hàng mà mình đã chọn
//        if(row == -1) {
//            JOptionPane.showMessageDialog(this, "Chọn user cần xóa trước đi bạn ei", "Lỗi rồi bạn ei", JOptionPane.ERROR_MESSAGE);
//        } else {
//            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?"); //Xác nhận xóa
//            
//            if(confirm == JOptionPane.YES_OPTION) {
//                int id = Integer.valueOf(String.valueOf(userTable.getValueAt(row, 0)));
//                
//                try {
//                    if(documentService.deleteUser(id) == 1) { //nếu hàm bên service trả về 1 thì là xóa thành công
//                        JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.CLOSED_OPTION);                        
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Xóa không thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
//                    }
//                    defaultTableModel.setRowCount(0); // reset dữ liệu về 0
//                    showTableData(); // Gọi hàm đổ dữ liệu vào bảng
//                } catch (SQLException ex) {
//                    Logger.getLogger(DocumentView.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(DocumentView.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void chonLoaiComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonLoaiComboboxActionPerformed
        // TODO add your handling code here:
        String loai = chonLoaiCombobox.getSelectedItem().toString();
        int idLoai = 0;
        switch(loai) {
            case "Tất cả":
                idLoai = 0;
                break;
            case "Sách":
                idLoai = 1;
                break;
            case "Báo":
                idLoai = 2;
                break;
            case "Tạp chí":
                idLoai = 3;
                break;
        }
        defaultTableModel.setRowCount(0);
        try {
            showTableData(idLoai);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocumentView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DocumentView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chonLoaiComboboxActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        int q = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if(q==0) {
            exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DocumentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocumentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocumentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocumentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new DocumentView().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DocumentView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(DocumentView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> chonLoaiCombobox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable userTable;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
