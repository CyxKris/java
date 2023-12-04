module com.cyx.anewjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cyx.anewjavafx to javafx.fxml;
    exports com.cyx.anewjavafx;
}
