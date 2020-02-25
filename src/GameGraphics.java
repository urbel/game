import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameGraphics extends Application {
    public void init() throws Exception {
        System.out.println ("Initializing...");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Welcome to the game");
        primaryStage.setScene(new Scene (root, 900, 675));
        primaryStage.show();
        VBox vBox=new VBox ();
        VBox RightColumn= new VBox ();
        ObservableList<Node> RightColumnNodes= RightColumn.getChildren ();
        RightColumnNodes.add (new Label ("Label on right"));
    }

    @Override
    public void stop() throws Exception {
        System.out.println ("Exiting...");
    }

 public static void main(String[] args){
        launch (args);
 }
}
