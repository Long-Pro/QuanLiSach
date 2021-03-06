/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsach2;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Long CaCa
 */
public class SACH extends javax.swing.JFrame {

    /**
     * Creates new form SACH
     */
    public SACH() {
        initComponents();
        cb_LoaiSach.setEditable(rootPaneCheckingEnabled);
        cb_TacGia.setEditable(rootPaneCheckingEnabled);
        loadComboBox("TENTACGIA", "TACGIA");
        loadComboBox("LOAISACH", "LOAISACH");
        
    }
    String url="";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_TenSach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_GiaTien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_NXB = new javax.swing.JTextField();
        txt_SoLuong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_KichThuoc = new javax.swing.JTextField();
        txt_SoTrang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_SKU = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cb_TacGia = new javax.swing.JComboBox<>();
        cb_LoaiSach = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_MoTa = new javax.swing.JTextArea();
        hinhAnh = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_Xoa = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_HinhAnh = new javax.swing.JButton();
        txt_LinkAnh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÍ SÁCH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("THÔNG TIN ");

        jLabel3.setText("TÊN SACH :");

        jLabel4.setText("TÁC GIẢ :");

        jLabel5.setText("GIÁ TIỀN :");

        jLabel6.setText("LOẠI SACH :");

        jLabel7.setText("SỐ LƯỢNG :");

        jLabel8.setText("NGÀY XB :");

        jLabel9.setText("KÍCH THƯỚC :");

        jLabel10.setText("SỐ TRANG :");

        jLabel11.setText("SKU :");

        jLabel12.setText("HÌNH ẢNH :");

        jLabel13.setText("MÔ TẢ :");

        txt_MoTa.setColumns(20);
        txt_MoTa.setRows(5);
        jScrollPane2.setViewportView(txt_MoTa);

        hinhAnh.setText("HINH ANH");
        hinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hinhAnh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("CHỨC NĂNG");

        btn_Xoa.setText("XÓA");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Them.setText("THÊM");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setText("SỬA");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_HinhAnh.setText("THÊM HÌNH ẢNH");
        btn_HinhAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HinhAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cb_LoaiSach, 0, 170, Short.MAX_VALUE)
                                        .addComponent(txt_TenSach))
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_GiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cb_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(69, 69, 69)
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_SKU, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(69, 69, 69)
                                            .addComponent(jLabel10)
                                            .addGap(9, 9, 9)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_SoTrang)
                                        .addComponent(txt_NXB, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                                .addComponent(btn_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_LinkAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hinhAnh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cb_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txt_GiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_LoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_SoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_SKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_HinhAnh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_LinkAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Sua)
                            .addComponent(btn_Them)
                            .addComponent(btn_Xoa))
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private ArrayList<String> batNgoaiLe(String suKien){
        ArrayList<String>ds=new ArrayList<>();
        
        String mS=timIdTiepTheo("MASACH", "SACH");                              ds.add(mS);
        
        
        String tS=txt_TenSach.getText();    
        if(suKien.equals("them"))
            if(!timIdCuaX(tS, "MASACH","TENSACH", "SACH").equals("00000")){
                JOptionPane.showMessageDialog(this, "Ten sach da ton tai");
                return ds;
            }                                                                   ds.add(tS);
                                                                                
                                                                                
        
        String tG=(String) cb_TacGia.getEditor().getItem();
        String mTG=timIdCuaX(tG, "MATACGIA", "TENTACGIA", "TACGIA");
        if(mTG.equals("00000")){
            mTG=timIdTiepTheo("MATACGIA", "TACGIA");
            them(mTG, tG, "TACGIA");
        }                                                                       ds.add(mTG);
                                                                              
        
        String lS=cb_LoaiSach.getEditor().getItem().toString();
        String mLS=timIdCuaX(lS, "MALOAISACH", "LOAISACH", "LOAISACH");
        if(mLS.equals("00000")){
            mLS=timIdTiepTheo("MALOAISACH", "LOAISACH");
            them(mLS, lS, "LOAISACH");
        }                                                                       ds.add(mLS);
        
        
        if(url.equals("")){
            JOptionPane.showMessageDialog(this, "hinh anh khong dung ");
            return ds;
        }   
        String duoiFile=url.substring(url.length()-3);
        if(!duoiFile.equals("png")&&!duoiFile.equals("jpg")){
            JOptionPane.showMessageDialog(this, "hinh anh khong dung ");
            return ds;
        }                                                                       ds.add(url);
        
        
        
        
        String gT=txt_GiaTien.getText();
        if(!gT.matches("\\d+")){
            JOptionPane.showMessageDialog(this, "tien khong dung ");
            return ds;
        }                                                                       ds.add(gT);
        
        String sL=txt_SoLuong.getText();
        if(!sL.matches("\\d+")){
            JOptionPane.showMessageDialog(this, "so luong khong dung ");
            return ds;
        }                                                                       ds.add(sL);
        
        String nXB=txt_NXB.getText();
        String dd_NXB=dinhDangNgay(nXB);
        if(dd_NXB.equals("0")) {
            JOptionPane.showMessageDialog(this, "ngay khong dung");
            return ds;
        }                                                                       ds.add(dd_NXB);                                       
                
        
        String kT=txt_KichThuoc.getText();
        if(!kT.matches("\\d*")){
            JOptionPane.showMessageDialog(this, "kich thuoc khong dung ");
            return ds;
        }                                                                       ds.add(kT);
        
        String sT=txt_SoTrang.getText();
        if(!sT.matches("\\d*")){
            JOptionPane.showMessageDialog(this, "so trang khong dung ");
            return ds;
        }                                                                       ds.add(sT);
        
        String sKU=txt_SKU.getText();
        if(!sKU.matches("\\d+")){
            JOptionPane.showMessageDialog(this, "SKU khong dung ");
            return ds;
        }                                                                       ds.add(sKU);
        
        String mT=txt_MoTa.getText();                                           
        if(mT.equals("")){
            JOptionPane.showMessageDialog(this, "mo ta khong dung ");
            return ds;
        }                                                                       ds.add(mT);
        
        return ds;
    }
    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        ArrayList<String> ds=new ArrayList<>();
        ds=batNgoaiLe("them");
        if(ds.size()!=12) return;
        loadComboBox("TENTACGIA", "TACGIA");
        loadComboBox("LOAISACH", "LOAISACH");  
        themSach(ds);
        JOptionPane.showMessageDialog(this, "them thanh cong");   
    }//GEN-LAST:event_btn_ThemActionPerformed
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        String tS=JOptionPane.showInputDialog(this,"nhap ten sach can xoa ");
        if(timIdCuaX(tS, "MASACH", "TENSACH", "SACH").equals("00000")){
            JOptionPane.showMessageDialog(this, "ten sach chua ton tai");
            return;
        }
        xoaSach(tS);
        JOptionPane.showMessageDialog(this, "da xoa SACH");   
    }//GEN-LAST:event_btn_XoaActionPerformed
    private void btn_HinhAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HinhAnhActionPerformed
        // TODO add your handling code here:
        url="";
        JFileChooser fileChooser=new JFileChooser();
        int choose=fileChooser.showDialog(this, "chon");
        if(choose==JFileChooser.APPROVE_OPTION){
            url=fileChooser.getCurrentDirectory().toString()+"\\"+fileChooser.getSelectedFile().getName();
            ImageIcon icon=new ImageIcon(url);
            hinhAnh.setIcon(icon);
            txt_LinkAnh.setText(url);
        }   
    }//GEN-LAST:event_btn_HinhAnhActionPerformed
    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
        suaSach();
    }//GEN-LAST:event_btn_SuaActionPerformed

    /**
     * @param args the command line arguments
     */
    private String dinhDangNgay(String ngay){
        String reNgay="\\d{2}/\\d{2}/\\d{4}";
        int ng,th,na;
        if(ngay.matches(reNgay)){
            String[] x=ngay.split("/");
            ng=Integer.valueOf(x[0]);
            th=Integer.valueOf(x[1]);
            na=Integer.valueOf(x[2]);
            if(th>12) return "0";
            if(th==1||th==3||th==5||th==7||th==8||th==10|th==12){
                if(ng>31) return "0";
            }else{
                if(ng>30) return "0";
            }
            
        }else{
            return "0";
        }
        return  String.format("%s/%s/%s",th,ng,na);
    }
    private String timIdCuaX(String X ,String id,String value,String tenBang){
        String kq="00000";
        Connection ketNoi=QLSACH2.layKetNoi();
        String sql="select "+id+" from "+tenBang+" where "+value+" =?";
        try {
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            ps.setString(1, X);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                kq=rs.getString(id);
                System.out.println(kq);
                rs.close();ps.close();ketNoi.close();
                System.out.println("tim id cua X");
            }
            return kq;
        } catch (Exception e) {
            System.out.println(e+" loi tim id cua X");
        }
        return kq; 
    }
    private String timIdTiepTheo(String tenMa,String tenBang){
        Connection ketNoi=QLSACH2.layKetNoi();
        String kq="00000";
        String sql="select MAX("+tenMa+") as X from "+tenBang;
        try {
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs.next())   kq=rs.getString("X");
            if(kq==null) kq="00000";
            rs.close();ps.close();ketNoi.close();
            System.out.println("tim ID tiep theo "+kq);
            
        } catch (Exception e) {
            System.out.println(e+" loi tim ma");
        }
        String dau=kq.substring(0,2),duoi=kq.substring(2);
        if(tenBang.equals("SACH")) dau="SA";
        int duoiso=Integer.valueOf(duoi)+1;
        kq=dau+String.format("%03d",duoiso);
        System.out.println(kq);
        return kq;
    }
    private void loadComboBox(String tenCot,String tenBang){
        Connection ketNoi=QLSACH2.layKetNoi();
        String sql="select "+tenCot+" from "+tenBang;
        try {
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(tenBang=="TACGIA"){
                cb_TacGia.removeAllItems();
                while(rs.next()){
                    cb_TacGia.addItem(rs.getString(tenCot));
                }
            }
            if(tenBang=="LOAISACH"){
                cb_LoaiSach.removeAllItems();
                while(rs.next()){
                    cb_LoaiSach.addItem(rs.getString(tenCot));
                }
            }
            rs.close();ps.close();ketNoi.close();
            System.out.println("load comboBox "+tenBang);
            
        } catch (Exception e) {
            System.out.println(e+" loi load comboBox "+tenBang);
        }
    }
    
    private void them(String id,String value,String tenBang){
        Connection ketNoi=QLSACH2.layKetNoi();
        String sql="insert into "+tenBang+" values(?,?)";
        try {
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, value);
            ps.executeUpdate();
            ps.close();ketNoi.close();
            System.out.printf("\ninsert %s + %s vao %s",id,value,tenBang);
        } catch (Exception e) {
            System.out.printf("\n"+e+" loi insert %s + %s vao %s",id,value,tenBang);
        }
    }
    private void themSach(ArrayList<String> ds){
        Connection ketNoi=QLSACH2.layKetNoi();
        String sql="insert into SACH values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            for(int i =0;i<ds.size();i++){
                ps.setString(i+1, ds.get(i));
            }           
            ps.executeUpdate();
            ps.close();ketNoi.close();
            System.out.println("them sach");
        } catch (Exception e) {
            System.out.println(e+" loi them sach");
        }   
    }
    private void xoaSach(String tS){
        Connection ketNoi=QLSACH2.layKetNoi();
        String sql="delete SACH where TENSACH=?";
        try {
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            ps.setString(1, tS);
            ps.executeUpdate();
            ps.close();ketNoi.close();
            System.out.println("xoa sach");
        } catch (Exception e) {
            System.out.println(e+" loi xoa sach");
        }
    }
    private void suaSach(){
        String tS=txt_TenSach.getText();
        if(timIdCuaX(tS, "MASACH", "TENSACH", "SACH").equals("00000")){
            JOptionPane.showMessageDialog(this, "ten sach chua ton tai");
            return;
        }
        ArrayList<String> ds=new ArrayList<>();
        ds=batNgoaiLe("sua");
        if(ds.size()==12){
            String mS=timIdCuaX(tS, "MASACH", "TENSACH", "SACH");
            xoaSach(tS);
            ds.set(0, mS);
            ds.set(1, tS);
            themSach(ds);
            JOptionPane.showMessageDialog(this, "da sua sach");
        }  
    }
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
            java.util.logging.Logger.getLogger(SACH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SACH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SACH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SACH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SACH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_HinhAnh;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cb_LoaiSach;
    private javax.swing.JComboBox<String> cb_TacGia;
    private javax.swing.JLabel hinhAnh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_GiaTien;
    private javax.swing.JTextField txt_KichThuoc;
    private javax.swing.JLabel txt_LinkAnh;
    private javax.swing.JTextArea txt_MoTa;
    private javax.swing.JTextField txt_NXB;
    private javax.swing.JTextField txt_SKU;
    private javax.swing.JTextField txt_SoLuong;
    private javax.swing.JTextField txt_SoTrang;
    private javax.swing.JTextField txt_TenSach;
    // End of variables declaration//GEN-END:variables
}
