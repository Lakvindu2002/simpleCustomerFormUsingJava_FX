import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//            primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/hello.fxml"))));
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/customer_form.fxml"))));

            primaryStage.show();

    }
}

