/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public interface Barang {
    public void insert(Barang1 Aplikasi_Origami);

    public void update(int index, Barang1 Aplikasi_Origami);

    public void delete(int index);

    public DefaultTableModel view();
}
