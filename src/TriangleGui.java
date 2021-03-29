import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TriangleGui extends Application implements EventHandler<ActionEvent> {
	private Button createButton = new Button("Create");
	private Button endButton = new Button("End");
	private TextField fieldForX1 = new TextField();
	private TextField fieldForY1 = new TextField();
	private Text labelForPoint1 = new Text(" Point 1   ");
	private TextField fieldForX2 = new TextField();
	private TextField fieldForY2 = new TextField();
	private Text labelForPoint2 = new Text(" Point 2   ");
	private TextField fieldForX3 = new TextField();
	private TextField fieldForY3 = new TextField();
	private Text labelForPoint3 = new Text(" Point 3   ");
	private Text columnHeaderForX = new Text("x");
	private Text columnHeaderForY = new Text("y");

	private Canvas triangleCanvas = new Canvas(400, 400);

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane windowPane = new GridPane();
		BorderPane borderPane = new BorderPane();
		//windowPane.add(triangleCanvas, 0, 0);
		windowPane.add(columnHeaderForX, 1, 1);
		windowPane.add(columnHeaderForY, 2, 1);
		windowPane.add(labelForPoint1, 0, 2);
		windowPane.add(labelForPoint2, 0, 3);
		windowPane.add(labelForPoint3, 0, 4);
		fieldForX1.setPrefWidth(200);
		fieldForY1.setPrefWidth(200);
		windowPane.add(fieldForX1, 1, 2);
		windowPane.add(fieldForY1, 2, 2);
		windowPane.add(fieldForX2, 1, 3);
		windowPane.add(fieldForY2, 2, 3);
		windowPane.add(fieldForX3, 1, 4);
		windowPane.add(fieldForY3, 2, 4);
		createButton.setStyle("-fx-background-color: yellow");
		endButton.setStyle("-fx-background-color: yellow");
		windowPane.add(createButton, 0, 5);
		windowPane.add(endButton, 1, 5);
		windowPane.setStyle("-fx-background-color: pink");
		borderPane.setStyle("-fx-background-color: green");
		borderPane.setTop(triangleCanvas);
		borderPane.setCenter(windowPane);
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Assignment 2");
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(null);
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}

}