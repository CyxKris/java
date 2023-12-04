module com.cyx.simplejavafxprojectstart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cyx.simplejavafxprojectstart to javafx.fxml;
    exports com.cyx.simplejavafxprojectstart;
}