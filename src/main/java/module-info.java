module com.omiekue.trivia3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.omiekue.trivia3 to javafx.fxml;
    exports com.omiekue.trivia3;
}