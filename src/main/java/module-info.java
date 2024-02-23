module com.example.cs4076projectclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cs4076projectclient to javafx.fxml;
    exports com.example.cs4076projectclient;
}