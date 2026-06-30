module com.u.studentconnect {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports com.u.studentconnect.infrastructure;

    opens com.u.studentconnect.infrastructure to javafx.graphics;
    opens com.u.studentconnect.infrastructure.controllers to javafx.fxml;
}