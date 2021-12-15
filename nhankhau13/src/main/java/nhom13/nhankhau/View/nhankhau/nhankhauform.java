package nhom13.nhankhau.View.nhankhau;



import javafx.beans.property.SimpleStringProperty;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import nhom13.nhankhau.Dao.NhankhauDao;
import nhom13.nhankhau.Model.Nhankhau;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.*;

public class nhankhauform implements Initializable {
    @FXML
    private TableColumn<Nhankhau, String> Manhankhau;
    @FXML
    private TableColumn<Nhankhau, String> Hovaten;
    @FXML
    private TableColumn<Nhankhau, String> CCCD;
    @FXML
    private TableColumn<Nhankhau, Date> Ngaysinh;
    @FXML
    private TableColumn<Nhankhau, String> Noisinh;
    @FXML
    private TableColumn<Nhankhau, String> Dantoc;
    @FXML
    private TableColumn<Nhankhau, String> Tongiao;
    @FXML
    private TableColumn<Nhankhau, String> Gioitinh;
    @FXML
    private TableColumn<Nhankhau, String> Trinhdovanhoa;
    @FXML
    private TableColumn<Nhankhau, Date> Ngaydangkithuongtru;
    @FXML
    private TableColumn<Nhankhau, Integer> Mahokhau;
    @FXML
    private TableColumn<Nhankhau, String> Quanhevoichuho;
    @FXML
    private TableColumn<Nhankhau, String> Ghichu;
    @FXML
    private TextField searchText;
    @FXML
    private TableView<Nhankhau> table;
    @FXML
    private Button search;


    private final NhankhauDao NhankhauDao = new NhankhauDao();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Nhankhau> list1 = FXCollections.observableArrayList(NhankhauDao.getAll());
        table.setItems(list1);

        Manhankhau.setCellValueFactory(new PropertyValueFactory<>("Hovaten"));
        Hovaten.setCellValueFactory(new PropertyValueFactory<>("Hovaten"));
        CCCD.setCellValueFactory(new PropertyValueFactory<>("CCCD"));
        Ngaysinh.setCellValueFactory(new PropertyValueFactory<>("Ngaysinh"));
        Noisinh.setCellValueFactory(new PropertyValueFactory<>("Noisinh"));
        Dantoc.setCellValueFactory(new PropertyValueFactory<>("Dantoc"));
        Tongiao.setCellValueFactory(new PropertyValueFactory<>("Tongiao"));


        Gioitinh.setCellValueFactory(data -> {
            Nhankhau nhankhau = data.getValue();
            SimpleStringProperty Gioitinh = new SimpleStringProperty();
            if (nhankhau.getGioitinh())
                Gioitinh.setValue("Nam");
            else
                Gioitinh.setValue("Nữ");
            return Gioitinh;
        });


        Trinhdovanhoa.setCellValueFactory(new PropertyValueFactory<>("Trinhdovanhoa"));
        Ngaydangkithuongtru.setCellValueFactory(new PropertyValueFactory<>("Ngaydangkithuongtru"));
        Mahokhau.setCellValueFactory(new PropertyValueFactory<>("Mahokhau"));
        Quanhevoichuho.setCellValueFactory(new PropertyValueFactory<>("Quanhevoichuho"));
        Ghichu.setCellValueFactory(new PropertyValueFactory<>("Ghichu"));
    }

    public void search(ActionEvent event) {
        List<Nhankhau> list = NhankhauDao.getAll();
        Nhankhau nhankhau = null;
        List<Nhankhau> listsearch = new ArrayList<>();

        if (searchText.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error ");
            alert.setHeaderText("Không có nhân khẩu trên");
            alert.setContentText("Vui lòng nhập thông tin!");
            alert.showAndWait();
        }
        String str = searchText.getText().toLowerCase();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHovaten().toLowerCase().contains(str)) {
                listsearch.add(list.get(i));
            }
        }
        if (!listsearch.isEmpty()) {
            ObservableList<Nhankhau> list2 = FXCollections.observableArrayList(listsearch);
            table.setItems(list2);
            list.clear();
        } else {
            if (isStringInteger(searchText.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);

                alert.setTitle("Error ");
                alert.setHeaderText("Không có nhân khẩu trên");
                alert.setContentText("Vui lòng kiểm tra laị thông tin!");
                alert.showAndWait();
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getManhankhau() == Integer.parseInt(searchText.getText())) {
                        nhankhau = list.get(i);
                    }
                }
                if (nhankhau == null) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);

                    alert.setTitle("Error ");
                    alert.setHeaderText("Không có nhân khẩu trên");
                    alert.setContentText("Kiểm tra lại mã nhân khẩu!");
                    alert.showAndWait();
                } else {
                    ObservableList<Nhankhau> list2
                            = FXCollections.observableArrayList(nhankhau);
                    table.setItems(list2);
                }
            }
        }
        searchText.clear();
    }

    public void back(ActionEvent event) {
        NhankhauDao dao = new NhankhauDao();
        ObservableList<Nhankhau> list2
                = FXCollections.observableArrayList(dao.getAll());
        table.setItems(list2);
    }

    public static boolean isStringInteger(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    @FXML
    Button btn1;
    @FXML
    Button btn2;


    public void switchtTothemnhankhau() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("nhankhau.fxml"));
        Stage window = (Stage) btn1.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void switchTosuanhankhau(ActionEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("suanhankhau.fxml"));
        Stage window = (Stage) btn2.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}








