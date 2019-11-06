package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class Hello extends Application {
    // method
    @Override public void start (Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 200, 100);
        root.getChildren().add(new Text(50,50, "Hello World"));
        stage.setScene(scene);
        stage.show();
    }
}
