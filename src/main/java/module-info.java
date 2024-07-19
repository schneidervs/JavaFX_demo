module org.schneider_v_s.demo.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.schneider_v_s.demo.demo to javafx.fxml;
    exports org.schneider_v_s.demo.demo;
}