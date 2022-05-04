module com.example.kodillagoodpatterns {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodillagoodpatterns to javafx.fxml;
    exports com.example.kodillagoodpatterns;
}