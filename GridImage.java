import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GridImage extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane to hold the image views
    GridPane pane = new GridPane();
    Image image1 = new Image("image.jpg");
    for( int y = 0;y < 3; y++){
      for(int x = 0;x < 3; x++){
        ImageView im = new ImageView(image1);
        im.setFitHeight(200);
        im.setFitWidth(260);
        pane.add(im,x,y);
      }
    }
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("GridImage"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}