module com.example.catan_vyzhlov10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.catan_vyzhlov10 to javafx.fxml;
    exports com.example.catan_vyzhlov10;
}