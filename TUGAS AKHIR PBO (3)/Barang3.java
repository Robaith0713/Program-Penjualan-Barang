/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class Barang3 implements Barang {
     @Override
    public void insert(Barang1 Origami) {
        Barang2.listorigami.add(Origami);
        JOptionPane.showMessageDialog(null, "Data Pengguna Baru tersimpan!");
    }
    @Override
    public void update(int index, Barang1 Origami) {
        Barang2.listorigami.set(index, Origami);
        JOptionPane.showMessageDialog(null, "Data Pengguna Berhasil diubah!");
    }
    @Override
    public void delete(int index) {
        Barang2.listorigami.remove(index);
        JOptionPane.showMessageDialog(null, "Data Pengguna Berhasil dihapus!");
    }
    @Override
    public DefaultTableModel view() {
        String[] kolom = { "Nama", "No HP", "Alamat", "Jenis Kelamin", 
		"Kelas", "Harga", "Jumlah", "Kode", "Hari", "Waktu", "Total" };
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (Barang1 a : Barang2.listorigami) {
            Object[] o = new Object[11];
            double total = 0, harga, jumlah;
            o[0] = a.getnama();
            o[1] = a.gethp();
            o[2] = a.getalamat();
            o[3] = a.getjk();
            o[4] = a.getbarang();
            o[5] = a.getharga();
            harga = a.getharga();
            o[6] = a.getjumlah();
            jumlah = a.getjumlah();
            total = harga*jumlah;
            o[7] = a.getkode();
            o[8] = a.gethari();
            o[9] = a.getwaktu();
            o[10] = total;
            dtm.addRow(o);
        }
        return dtm;
    }
}
