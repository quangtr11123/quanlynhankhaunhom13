package nhom13.nhankhau.Dao;


import nhom13.nhankhau.Dao.mapper.Nhankhaumapper;
import nhom13.nhankhau.Model.Nhankhau;

import java.util.List;

public class NhankhauDao extends AbstractDao<Nhankhau> {
    public List<Nhankhau> getAll() {
        String query = "Select * FROM NhanKhau";
        return super.query(query, new Nhankhaumapper());
    }

    public Nhankhau getManhankhau(int ManhanKhau) {
        String query = "Select * FROM Nhankhau WHERE Manhankhau = ?";
        List<Nhankhau> Nhankhaulist = super.query(query, new Nhankhaumapper(), ManhanKhau, ManhanKhau);
        if (Nhankhaulist == null || Nhankhaulist.isEmpty())
            return null;
        else
            return Nhankhaulist.get(0);
    }
}
