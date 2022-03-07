package client;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Book;
import model.Magazines;
import model.News;
import sever.DocumentUpdateService;
import sever.GetDocumentByIdService;

public class DocumentViewById extends javax.swing.JFrame {

    GetDocumentByIdService getDocumentByIdService;
    Book book = null;
    News news = null;
    Magazines magazines = null;
    int id_loai;
    DocumentUpdateService documentUpdateService;

    public DocumentViewById(int id) throws SQLException {
        getDocumentByIdService = new GetDocumentByIdService(id);

        initComponents();

        editButton.setVisible(false);

        id_loai = getDocumentByIdService.getIdLoai();
        switch (id_loai) {
            case 1:
                book = getDocumentByIdService.getBook();

                hidden();
                tenTGTextField.setVisible(true);
                tenTGLabel.setVisible(true);
                trangTextField.setVisible(true);
                trangLabel.setVisible(true);

                maTLTextField.setText(String.valueOf(book.getId()));
                tenTLTextField.setText(book.getTenTaiLieu());
                tenNXBTextField.setText(book.getTenNXB());
                soLuongTextField.setText(String.valueOf(book.getSoLuong()));
                loaiTextField.setText("Sách");
                tenTGTextField.setText(book.getTenTacGia());
                trangTextField.setText(String.valueOf(book.getSoTrang()));

                break;

            case 2:
                news = getDocumentByIdService.getNews();

                hidden();
                ngayPhatHanhTextField.setVisible(true);
                ngayPhatHanhLabel.setVisible(true);

                maTLTextField.setText(String.valueOf(news.getId()));
                tenTLTextField.setText(news.getTenTaiLieu());
                tenNXBTextField.setText(news.getTenNXB());
                soLuongTextField.setText(String.valueOf(news.getSoLuong()));
                loaiTextField.setText("Báo");
                ngayPhatHanhTextField.setText(news.getNgayPhatHanh());

                break;

            case 3:
                magazines = getDocumentByIdService.getMagazines();

                hidden();
                soPhatHanhTextField.setVisible(true);
                soPhatHanhLabel.setVisible(true);
                thangPhatHanhTextField.setVisible(true);
                thangPhatHanhLabel.setVisible(true);
                namPhatHanhTextField.setVisible(true);
                namPhatHanhLabel.setVisible(true);

                maTLTextField.setText(String.valueOf(magazines.getId()));
                tenTLTextField.setText(magazines.getTenTaiLieu());
                tenNXBTextField.setText(magazines.getTenNXB());
                soLuongTextField.setText(String.valueOf(magazines.getSoLuong()));
                loaiTextField.setText("Tạp chí");
                soPhatHanhTextField.setText(magazines.getSoPhatHanh());
                thangPhatHanhTextField.setText(String.valueOf(magazines.getThangPhatHanh()));
                namPhatHanhTextField.setText(String.valueOf(magazines.getNamPhatHanh()));

                break;
        }
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

        jLabel5 = new javax.swing.JLabel();
        namPhatHanhLabel = new javax.swing.JLabel();
        ngayPhatHanhTextField = new javax.swing.JFormattedTextField();
        tenTGTextField = new javax.swing.JTextField();
        ngayPhatHanhLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        tenTGLabel = new javax.swing.JLabel();
        editViewButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        trangTextField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        trangLabel = new javax.swing.JLabel();
        tenTLTextField = new javax.swing.JTextField();
        soPhatHanhTextField = new javax.swing.JTextField();
        tenNXBTextField = new javax.swing.JTextField();
        soPhatHanhLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        thangPhatHanhTextField = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        thangPhatHanhLabel = new javax.swing.JLabel();
        soLuongTextField = new javax.swing.JFormattedTextField();
        namPhatHanhTextField = new javax.swing.JFormattedTextField();
        maTLTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        loaiTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Loại");

        namPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namPhatHanhLabel.setText("Năm phát hành");

        ngayPhatHanhTextField.setEditable(false);
        ngayPhatHanhTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));
        ngayPhatHanhTextField.setEnabled(false);
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

        tenTGTextField.setEditable(false);
        tenTGTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenTGTextField.setEnabled(false);
        tenTGTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        ngayPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ngayPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ngayPhatHanhLabel.setText("Ngày phát hành");

        backButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        backButton.setText("Quay lại");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        tenTGLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenTGLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tenTGLabel.setText("Tên tác giả");

        editViewButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        editViewButton.setText("Sửa thông tin");
        editViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editViewButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TIẾT");

        trangTextField.setEditable(false);
        trangTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        trangTextField.setEnabled(false);
        trangTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trangTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tên tài liệu");

        trangLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trangLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        trangLabel.setText("Số trang");

        tenTLTextField.setEditable(false);
        tenTLTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenTLTextField.setEnabled(false);
        tenTLTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        soPhatHanhTextField.setEditable(false);
        soPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        soPhatHanhTextField.setEnabled(false);
        soPhatHanhTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        tenNXBTextField.setEditable(false);
        tenNXBTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tenNXBTextField.setEnabled(false);
        tenNXBTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        soPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        soPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soPhatHanhLabel.setText("Số phát hành");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tên NXB");

        thangPhatHanhTextField.setEditable(false);
        thangPhatHanhTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        thangPhatHanhTextField.setEnabled(false);
        thangPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        thangPhatHanhTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Số lượng");

        thangPhatHanhLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        thangPhatHanhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thangPhatHanhLabel.setText("Tháng phát hành");

        soLuongTextField.setEditable(false);
        soLuongTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        soLuongTextField.setEnabled(false);
        soLuongTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        soLuongTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        namPhatHanhTextField.setEditable(false);
        namPhatHanhTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        namPhatHanhTextField.setEnabled(false);
        namPhatHanhTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namPhatHanhTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        maTLTextField.setEditable(false);
        maTLTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        maTLTextField.setEnabled(false);
        maTLTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mã tài liệu");

        loaiTextField.setEditable(false);
        loaiTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        loaiTextField.setEnabled(false);
        loaiTextField.setMargin(new java.awt.Insets(2, 5, 2, 5));

        editButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        editButton.setText("Sửa");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ngayPhatHanhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ngayPhatHanhTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(maTLTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 322, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loaiTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(editViewButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(editButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maTLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addComponent(editViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ngayPhatHanhTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ngayPhatHanhTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayPhatHanhTextFieldFocusGained

    private void ngayPhatHanhTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ngayPhatHanhTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayPhatHanhTextFieldFocusLost

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

    private void editViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editViewButtonActionPerformed
        // TODO add your handling code here:
        editButton.setVisible(true);
        editViewButton.setVisible(false);

        tenTLTextField.setEditable(true);
        tenNXBTextField.setEditable(true);
        soLuongTextField.setEditable(true);

        tenTLTextField.setEnabled(true);
        tenNXBTextField.setEnabled(true);
        soLuongTextField.setEnabled(true);
        switch (id_loai) {
            case 1:
                tenTGTextField.setEditable(true);
                trangTextField.setEditable(true);

                tenTGTextField.setEnabled(true);
                trangTextField.setEnabled(true);

                break;

            case 2:
                ngayPhatHanhTextField.setEditable(true);
                ngayPhatHanhTextField.setEnabled(true);

                break;

            case 3:
                soPhatHanhTextField.setEditable(true);
                thangPhatHanhTextField.setEditable(true);
                namPhatHanhTextField.setEditable(true);

                soPhatHanhTextField.setEnabled(true);
                thangPhatHanhTextField.setEnabled(true);
                namPhatHanhTextField.setEnabled(true);

                break;
        }
    }//GEN-LAST:event_editViewButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        if (tenTLTextField.getText().equals("") || tenNXBTextField.getText().equals("") || soLuongTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Lỗi rồi bạn ei", JOptionPane.ERROR_MESSAGE);
        } else {
            switch (id_loai) {
                case 1:
                    book = new Book();
                    book.setId(Integer.valueOf(maTLTextField.getText()));
                    book.setTenTaiLieu(tenTLTextField.getText());
                    book.setTenNXB(tenNXBTextField.getText());
                    book.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    book.setTenTacGia(tenTGTextField.getText());
                    book.setSoTrang(Integer.valueOf(trangTextField.getText()));
                    try {
                        documentUpdateService = new DocumentUpdateService(book);
                    } catch (SQLException ex) {
                        Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                case 2:
                    News news = new News();
                    news.setId(Integer.valueOf(maTLTextField.getText()));
                    news.setTenTaiLieu(tenTLTextField.getText());
                    news.setTenNXB(tenNXBTextField.getText());
                    news.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    news.setNgayPhatHanh(ngayPhatHanhTextField.getText());
                    try {
                        documentUpdateService = new DocumentUpdateService(news);
                    } catch (SQLException ex) {
                        Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                case 3:
                    Magazines magazines = new Magazines();
                    magazines.setId(Integer.valueOf(maTLTextField.getText()));
                    magazines.setTenTaiLieu(tenTLTextField.getText());
                    magazines.setTenNXB(tenNXBTextField.getText());
                    magazines.setSoLuong(Integer.valueOf(soLuongTextField.getText()));
                    magazines.setSoPhatHanh(soPhatHanhTextField.getText());
                    magazines.setThangPhatHanh(Integer.valueOf(thangPhatHanhTextField.getText()));
                    magazines.setNamPhatHanh(Integer.valueOf(namPhatHanhTextField.getText()));
                    try {
                        documentUpdateService = new DocumentUpdateService(magazines);
                    } catch (SQLException ex) {
                        Logger.getLogger(DocumentAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            }
            if (documentUpdateService.getRs() == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thông tin thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
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
    }//GEN-LAST:event_editButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField loaiTextField;
    private javax.swing.JTextField maTLTextField;
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
