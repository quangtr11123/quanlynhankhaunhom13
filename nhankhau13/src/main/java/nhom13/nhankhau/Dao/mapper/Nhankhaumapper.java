package nhom13.nhankhau.Dao.mapper;

import nhom13.nhankhau.Model.Nhankhau;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Nhankhaumapper implements RowMapper<Nhankhau> {

    @Override
    public Nhankhau mapRow(ResultSet resultSet) {
        try {

            Nhankhau nhankhau = new Nhankhau();


            nhankhau.setManhankhau(resultSet.getInt("Manhankhau"));
            nhankhau.setHovaten(resultSet.getString("Hovaten"));
            nhankhau.setCCCD(resultSet.getString("CCCD"));
            nhankhau.setNgaysinh(resultSet.getDate("Ngaysinh"));
            nhankhau.setNoisinh(resultSet.getString("Noisinh"));
            nhankhau.setDantoc(resultSet.getString("Dantoc"));
            nhankhau.setTongiao(resultSet.getString("Tongiao"));
            nhankhau.setGioitinh(resultSet.getBoolean("Gioitinh"));
            nhankhau.setTrinhdovanhoa(resultSet.getString("Trinhdovanhoa"));
            nhankhau.setNghenghiep(resultSet.getString("Nghenghiep"));
            nhankhau.setNoilamviec(resultSet.getString("Noilamviec"));
            nhankhau.setNgaydangkythuongtru(resultSet.getDate("Ngaydangkithuongtru"));
            nhankhau.setQuanhevoichuho(resultSet.getString("Quanhevoichuho"));
            nhankhau.setMahokhau(resultSet.getInt("Mahokhau"));
            nhankhau.setGhichu(resultSet.getString("Ghichu"));

            return nhankhau;
        } catch (SQLException e) {
            return null;
        }
    }
}