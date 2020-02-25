import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class MainGame extends Application {
    private GamePresenter gamePresenter;
    private MoveSet moveSet;

    MainGame(GamePresenter gamePresenter, MoveSet moveSet) {
        this.gamePresenter = gamePresenter;
        this.moveSet = moveSet;

    }


   /* public MainGame() {
        try {
            MainGame.start ();

        } catch (Exception ex) {
            ex.printStackTrace ();
        }
    }
*/

    // TODO  mängija ja arvuti liikumine , nägemiskoonus, võidu kontroll, (raskusastmed??, graafika??)
    //tehtud: juhunumbri generaator, tutvustus, käiguloendur
    private static int getRandom(int min, int max) {

        if (min > max) {
            throw new IllegalArgumentException (" Max must be greater than min");
        }
        Random getRandom = new Random ();
        return getRandom.nextInt ((max - min) + min);

    }



    @Override
    public void init() throws Exception {

            System.out.println ("Initializing...");
}

    public void  start(Stage primaryStage) throws Exception {
        System.out.println ("Starting...");
        VBox TitleField = new VBox ();
        javafx.scene.control.Label label = new javafx.scene.control.Label (" Welcome to the game!");

        Stage stage = new Stage ();
        Group root = new Group ();
        Scene scene = new Scene (root, 900, 600);
        stage.setScene (scene);

    }
    public static void main(String[] args) throws IOException {
        System.out.println (" Welcome to the game.\n Use q,w,e,a,s,d to move around.\n Avoid the monster, it's quite hungry ");
        int turnTimer = 10;

        //drawBoard function


        System.out.println (getRandom (0, 60));
        System.out.println ();
        System.out.println ();
        do {



                Scanner PlayerMove = new Scanner (System.in);


                String Move = String.valueOf (PlayerMove.findInLine ("/[a]|[s]|[d]|[q]|[w]|[e] /ig]"));
                while("q".equalsIgnoreCase (PlayerMove.findInLine ("q")) ||
                      "w".equalsIgnoreCase (PlayerMove.findInLine ("w")) ||
                      "e".equalsIgnoreCase (PlayerMove.findInLine ("e").trim ()) ||
                      "a".equalsIgnoreCase (PlayerMove.findInLine ("a").trim ()) ||
                      "s".equalsIgnoreCase (PlayerMove.findInLine ("s").trim ()) ||
                      "d".equalsIgnoreCase (PlayerMove.findInLine ("d").trim ()))
                {
                    System.out.println (" Please use q, w, e, a, s or d to move");
                   String AskAgain= String.valueOf (PlayerMove.hasNextLine ());
                }

               // Move = String.valueOf (PlayerMove.next (" ").trim ().charAt (0));
                PlayerMove.close ();

                int MoveDirection = getRandom (0, 60);

                System.out.print (turnTimer+" turns left");
                System.out.print (MoveDirection + " ");
                MoveDirection = getRandom (0, 60);
                if (MoveDirection < 10) {
                    MoveSet a = MoveSet.A;
                    System.out.print ("a");

                } else if (MoveDirection < 20) {
                    MoveSet s = MoveSet.S;
                    System.out.print ("s");

                } else if (MoveDirection < 30) {
                    MoveSet d = MoveSet.D;
                    System.out.print ("d");
                } else if (MoveDirection < 40) {
                    MoveSet e = MoveSet.E;
                    System.out.print ("e");
                } else if (MoveDirection < 50) {
                    MoveSet w = MoveSet.W;
                    System.out.print ("w");
                } else if (MoveDirection < 60) {
                    MoveSet q = MoveSet.Q;
                    System.out.print (" q");
                }

                System.out.println ();




            turnTimer--;
        }
            while (turnTimer >= 0) ;

        }

            public void stop() throws Exception {

                VBox vBox= new VBox ();
                TextArea textArea= new TextArea (" Do you want to play again?");
                javafx.scene.control.Button NoButton=new javafx.scene.control.Button ("No");
                NoButton.setOnAction (actionEvent -> Platform.exit ());
                javafx.scene.control.Button YesButton=new javafx.scene.control.Button ("Yes");
                YesButton.setOnAction (actionEvent -> Platform.startup ((Runnable) new Main ()));


                                }
                            }



