package arcade.chess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Executes a {@code Chess} game.
 *
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox();
        Board board = new Board();
        vbox.getChildren().addAll(board);

        Scene scene = new Scene(vbox);
        stage.setTitle("Chess Application");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args ) {
        launch();
    }
}