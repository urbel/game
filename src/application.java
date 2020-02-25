import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class application extends MainGame{

    application(GamePresenter gamePresenter, MoveSet moveSet) {
        super (gamePresenter, moveSet);
    }

    @Override
public void init() throws Exception{
    System.out.println ("Initializing...");
}

@Override

public void  start(Stage primaryStage) throws Exception{
    VBox vBox=new VBox ();
    Label label=new Label ("Welcome to the game ");
    Label label1= new Label ("Avoid monster. It is quite hungry.");


}
    public static void main(String[] args) throws IOException {


    }
}
