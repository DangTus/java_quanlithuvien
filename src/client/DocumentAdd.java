package client;

import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Book;
import model.Magazines;
import model.News;
import sever.DocumentAddService;
import sever.DocumentService;

public class DocumentAdd extends javax.swing.JFrame {

    DocumentService documentService;
    DocumentAddService documentAddService;
    String ngayHienTai = String.valueOf(java.time.LocalDate.now());

    public DocumentAdd() {
        documentService = new DocumentService();

        initComponents();

        hidden();
        tenTGTextField.setVisible(true);
        tenTGLabel.setVisible(true);
        soLuongTextField.setVisible(true);
        trangLabel.setVisible(true);

        //select loại
        List<String> categories;
        try {
            categories = documentService.getCategori();
            for (String categori : categories) {
                loaiComboBox.addItem(categori);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Gán ngày hiện tại cho input
        ngayPhatHanhTextField.setText(ngayHienTai);

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

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tenTLTextField = new javax.swing.JTextField();
        tenNXBTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soLuongTextField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        loaiComboBox = new javax.swing.JComboBox<>();
        tenTGTextField = new javax.swing.JTextField();
        tenTGLabel = new javax.swing.JLabel();
        trangTextField = new javax.swing.JFormattedTextField();
        trangLabel = new javax.swing.JLabel();
        soPhatHanhTextField = new javax.swing.JTextField();
        soPhatHanhLabel = new javax.swing.JLabel();
        thangPhatHanhTextField = new javax.swing.JFormattedTextField();
        thangPhatHanhLabel = new javax.swing.JLabel();
        namPhatHanhTextField = new javax.swing.JFormattedTextField();
        namPhatHanhLabel = new javax.swing.JLabel();
        ngayPhatHanhTextField = new javax.swing.JFormattedTextField();
        ngayPhatHanhLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        backButton.setText("Quay lại");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM MỚI TÀI LIỆU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tên tài liệu");

        tenTLTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenTLTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        tenNXBTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenNXBTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tên NXB");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Số lượng");

        soLuongTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        soLuongTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        soLuongTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Loại");

        loaiComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        loaiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaiComboBoxActionPerformed(evt);
            }
        });

        tenTGTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenTGTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        tenTGLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenTGLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tenTGLabel.setText("Tên tác giả");

        trangTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        trangTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trangTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        trangLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trangLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        trangLabel.setText("Số trang");

        soPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        soPhatHanhTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        soPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        soPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soPhatHanhLabel.setText("Số phát hành");

        thangPhatHanhTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        thangPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        thangPhatHanhTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        thangPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        thangPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thangPhatHanhLabel.setText("Tháng phát hành");

        namPhatHanhTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        namPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namPhatHanhTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        namPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namPhatHanhLabel.setText("Năm phát hành");

        ngayPhatHanhTextField.setForeground(new java.awt.Color(153, 153, 153));
        ngayPhatHanhTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));
        ngayPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ngayPhatHanhTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));
        ngayPhatHanhTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ngayPhatHanhTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ngayPhatHanhTextFieldFocusLost(evt);
            }
        });

        ngayPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ngayPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ngayPhatHanhLabel.setText("Ngày phát hành");

        createButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        createButton.setText("Tạo");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tenTLTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tenNXBTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(soLuongTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tenTGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tenTGTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(trangLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trangTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(soPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(soPhatHanhTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thangPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thangPhatHanhTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(namPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(namPhatHanhTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loaiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ngayPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ngayPhatHanhTextField)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(createButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenTLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenNXBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenTGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenTGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trangLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thangPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thangPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngayPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayPhatHanhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loaiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaiComboBoxActionPerformed
        // TODO add your handling code here:
        hidden();
        String loai = loaiComboBox.getSelectedItem().toString();
        switch (loai) {
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
        // TODO add your handling code here:
        try {
            new DocumentView().setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        if (tenTLTextField.getText().equals("") || tenNXBTextField.getText().equals("") || soLuongTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Lỗi rồi bạn ei", JOptionPane.ERROR_MESSAGE);
        } else {
            String loai = loaiComboBox.getSelectedItem().toString();
            switch (loai) {
                case "Sách":
                    Book book = new Book();
                    book.setTenTaiLieu(tenTLTextField.getText());
                    book.setTenNXB(tenNXBTextField.getText());
                    book.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    book.setIdLoai(1);
                    book.setTenTacGia(tenTGTextField.getText());
                    book.setSoTrang(Integer.valueOf(trangTextField.getText()));
                    try {
                        documentAddService = new DocumentAddService(book);
                    } catch (SQLException ex) {
                        Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                case "Báo":
                    News news = new News();
                    news.setTenTaiLieu(tenTLTextField.getText());
                    news.setTenNXB(tenNXBTextField.getText());
                    news.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    news.setIdLoai(2);
                    news.setNgayPhatHanh(ngayPhatHanhTextField.getText());
                    try {
                        documentAddService = new DocumentAddService(news);
                    } catch (SQLException ex) {
                        Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                case "Tạp chí":
                    Magazines magazines = new Magazines();
                    magazines.setTenTaiLieu(tenTLTextField.getText());
                    magazines.setTenNXB(tenNXBTextField.getText());
                    magazines.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    magazines.setIdLoai(3);
                    magazines.setSoPhatHanh(soPhatHanhTextField.getText());
                    magazines.setThangPhatHanh(Integer.valueOf(thangPhatHanhTextField.getText()));
                    magazines.setNamPhatHanh(Integer.valueOf(namPhatHanhTextField.getText()));
                    try {
                        documentAddService = new DocumentAddService(magazines);
                    } catch (SQLException ex) {
                        Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            }
            if (documentAddService.getRs() == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
                try {
                    new DocumentView().setVisible(true);
                    this.dispose();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void ngayPhatHanhTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ngayPhatHanhTextFieldFocusGained
        // TODO add your handling code here:        
        if (ngayHienTai.equals(ngayPhatHanhTextField.getText())) {
            ngayPhatHanhTextField.setText("");
            ngayPhatHanhTextField.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_ngayPhatHanhTextFieldFocusGained

    private void ngayPhatHanhTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ngayPhatHanhTextFieldFocusLost
        // TODO add your handling code here:
        if (ngayPhatHanhTextField.getText().equals("")) {
            ngayPhatHanhTextField.setText(ngayHienTai);
            ngayPhatHanhTextField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_ngayPhatHanhTextFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> loaiComboBox;
    private javax.swing.JLabel namPhatHanhLabel;
    private javax.swing.JFormattedTextField namPhatHanhTextField;
    private javax.swing.JLabel ngayPhatHanhLabel;
    private javax.swing.JFormattedTextField ngayPhatHanhTextField;
    private javax.swing.JFormattedTextField soLuongTextField;
    private javax.swing.JLabel soPhatHanhLabel;
    private javax.swing.JTextField soPhatHanhTextField;
    private javax.swing.JTextField tenNXBTextField;
    private javax.swing.JLabel tenTGLabel;
    private javax.swing.JTextField tenTGTextField;
    private javax.swing.JTextField tenTLTextField;
    private javax.swing.JLabel thangPhatHanhLabel;
    private javax.swing.JFormattedTextField thangPhatHanhTextField;
    private javax.swing.JLabel trangLabel;
    private javax.swing.JFormattedTextField trangTextField;
    // End of variables declaration//GEN-END:variables
}
