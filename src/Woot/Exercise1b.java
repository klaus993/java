package Woot;

/**
 * Created by Klaus on 3/4/2017.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercise1b extends Application {
    @Override
    public void start( Stage primaryStage ) {
        Button btn = new Button();
        btn.setText( "Say 'Hello JavaFX World'" );
        btn.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                System.out.println( "Hello JavaFX World!" );
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add( btn );

        Scene scene = new Scene( root, 300, 250 );

        primaryStage.setTitle( "Hello JavaFX World!" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
