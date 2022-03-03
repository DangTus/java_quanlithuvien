package client;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Book;
import model.News;
import sever.DocumentService;

public class DocumentAdd extends javax.swing.JFrame {
    DocumentService documentService;
    
    public DocumentAdd() { 
        documentService = new DocumentService();

        initComponents();
        
        hidden();        
        tenTGTextField.setVisible(true);
        tenTGLabel.setVisible(true);        
        trangTextField.setVisible(true);
        trangLabel.setVisible(true);
        
        //select loại
        List<String> categories;
        try {
            categories = documentService.getCategori();
            for(String categori : categories) {
                loaiComboBox.addItem(categori);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Gán pattern cho các input
        //Gán cho số lượng

    }
    public void hidden() {
        tenTGTextField.setVisible(false);
        tenTGLabel.setVisible(false);
        
        trangTextField.setVisible(false);
        trangLabel.setVisible(false);
        
        soPhatHanhTextField.setVisible(false);
        soPhatHanhLabel.setVisible(false);
        
        thangPhatHanhTextField.setVisible(false);
        thangPhatHanhLabel.setVisible(false);
        
        namPhatHanhTextField.setVisible(false);
        namPhatHanhLabel.setVisible(false);
        
        ngayPhatHanhTextField.setVisible(false);
        ngayPhatHanhLabel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tenTLTextField = new javax.swing.JTextField();
        tenNXBTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soLuongTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loaiComboBox = new javax.swing.JComboBox<>();
        tenTGLabel = new javax.swing.JLabel();
        tenTGTextField = new javax.swing.JTextField();
        trangLabel = new javax.swing.JLabel();
        trangTextField = new javax.swing.JTextField();
        taoButton = new javax.swing.JButton();
        soPhatHanhTextField = new javax.swing.JTextField();
        soPhatHanhLabel = new javax.swing.JLabel();
        thangPhatHanhTextField = new javax.swing.JTextField();
        thangPhatHanhLabel = new javax.swing.JLabel();
        namPhatHanhTextField = new javax.swing.JTextField();
        namPhatHanhLabel = new javax.swing.JLabel();
        ngayPhatHanhTextField = new javax.swing.JTextField();
        ngayPhatHanhLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM TÀI LIỆU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tên tài liệu");

        tenTLTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        tenNXBTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tên NXB");

        soLuongTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Loại");

        loaiComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        loaiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaiComboBoxActionPerformed(evt);
            }
        });

        tenTGLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenTGLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tenTGLabel.setText("Tên tác giả");

        tenTGTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        trangLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trangLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        trangLabel.setText("Số trang");

        trangTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        taoButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        taoButton.setText("Tạo");
        taoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taoButtonActionPerformed(evt);
            }
        });

        soPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        soPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        soPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soPhatHanhLabel.setText("Số phát hành");

        thangPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        thangPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        thangPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thangPhatHanhLabel.setText("Tháng phát hành");

        namPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        namPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namPhatHanhLabel.setText("Năm phát hành");

        ngayPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        ngayPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ngayPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ngayPhatHanhLabel.setText("Ngày phát hành");

        backButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        backButton.setText("Trở về");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(thangPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ngayPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tenTGLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(trangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ngayPhatHanhTextField)
                                    .addComponent(namPhatHanhTextField)
                                    .addComponent(thangPhatHanhTextField)
                                    .addComponent(trangTextField)
                                    .addComponent(tenTGTextField)
                                    .addComponent(soLuongTextField)
                                    .addComponent(tenNXBTextField)
                                    .addComponent(loaiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tenTLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(taoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenTLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenNXBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soLuongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loaiComboBox)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenTGLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenTGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(soPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thangPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thangPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ngayPhatHanhLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngayPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(taoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loaiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaiComboBoxActionPerformed
        // TODO add your handling code here:
        hidden();
        String loai = loaiComboBox.getSelectedItem().toString();
        switch(loai) {
            case "Sách":
                tenTGTextField.setVisible(true);
                tenTGLabel.setVisible(true);

                trangTextField.setVisible(true);
                trangLabel.setVisible(true);
                break;
            
            case "Tạp chí":
                soPhatHanhTextField.setVisible(true);
                soPhatHanhLabel.setVisible(true);

                thangPhatHanhTextField.setVisible(true);
                thangPhatHanhLabel.setVisible(true);

                namPhatHanhTextField.setVisible(true);
                namPhatHanhLabel.setVisible(true);
                break;
                
            case "Báo":
                ngayPhatHanhTextField.setVisible(true);
                ngayPhatHanhLabel.setVisible(true);
                break;
        }
    }//GEN-LAST:event_loaiComboBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            new DocumentView().setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void taoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taoButtonActionPerformed
        // TODO add your handling code here:        
        if(tenTLTextField.getText().equals("") || tenNXBTextField.getText().equals("") || soLuongTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Lỗi rồi bạn ei", JOptionPane.ERROR_MESSAGE);
        } else {
            String loai = loaiComboBox.getSelectedItem().toString();
            switch(loai) {                
                case "Sách":
                    Book book = new Book();
                    book.setTenTaiLieu(tenTLTextField.getText());
                    book.setTenNXB(tenNXBTextField.getText());
                    book.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    book.setTenTacGia(tenTGTextField.getText());
                    book.setSoTrang(Integer.valueOf(trangTextField.getText()));
                    break;
                    
                case "Báo":
                    News news = new News();
                    news.setTenTaiLieu(tenTLTextField.getText());
                    news.setTenNXB(tenNXBTextField.getText());
                    news.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    news.setNgayPhatHanh(ngayPhatHanhTextField.getText());
                    break;
                    
//                case "Sách":
//                    Book book = new Book();
//                    book.setTenTaiLieu(tenTLTextField.getText());
//                    book.setTenNXB(tenNXBTextField.getText());
//                    book.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
//                    book.setTenTacGia(tenTGTextField.getText());
//                    book.setSoTrang(Integer.valueOf(trangTextField.getText()));
//                    break;
            }
        }
    }//GEN-LAST:event_taoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> loaiComboBox;
    private javax.swing.JLabel namPhatHanhLabel;
    private javax.swing.JTextField namPhatHanhTextField;
    private javax.swing.JLabel ngayPhatHanhLabel;
    private javax.swing.JTextField ngayPhatHanhTextField;
    private javax.swing.JTextField soLuongTextField;
    private javax.swing.JLabel soPhatHanhLabel;
    private javax.swing.JTextField soPhatHanhTextField;
    private javax.swing.JButton taoButton;
    private javax.swing.JTextField tenNXBTextField;
    private javax.swing.JLabel tenTGLabel;
    private javax.swing.JTextField tenTGTextField;
    private javax.swing.JTextField tenTLTextField;
    private javax.swing.JLabel thangPhatHanhLabel;
    private javax.swing.JTextField thangPhatHanhTextField;
    private javax.swing.JLabel trangLabel;
    private javax.swing.JTextField trangTextField;
    // End of variables declaration//GEN-END:variables
}
