
/**
 * Christopher Lara-Betancourt
 * Point GUI-Will accept 6 numbers from the user. That will be in the range of 0-400.
 * With those 6 numbers it will make 3 points. That then will be connected to form a triangle.
 * The triangle will be drawn when the user clicks on the create button. When the user clicks the end button the program will end.
 * ICS 372
 * Dathan Brahma 
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application implements EventHandler<ActionEvent> {
	private Button createButton = new Button("Create");
	private Button endButton = new Button("End");
	private Text point1 = new Text("Point 1");
	private Text point2 = new Text("Point 2");
	private Text point3 = new Text("Point 3");
	private Text xLabel = new Text("x");
	private Text yLabel = new Text("y");
	private TextField x1TextField = new TextField();
	private TextField x2TextField = new TextField();
	private TextField x3TextField = new TextField();
	private TextField y1TextField = new TextField();
	private TextField y2TextField = new TextField();
	private TextField y3TextField = new TextField();
	private Canvas canvas = new Canvas(400, 400);
	private GraphicsContext triangleGraphics = canvas.getGraphicsContext2D();

	public static void main(String[] args) {
		Application.launch(null);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		BorderPane borderPane = new BorderPane();
		gridPane.add(point1, 0, 1);
		gridPane.add(point2, 0, 2);
		gridPane.add(point3, 0, 3);
		gridPane.add(createButton, 0, 4);
		gridPane.add(endButton, 1, 4);
		x1TextField.setPrefWidth(200);
		y1TextField.setPrefWidth(200);
		gridPane.add(xLabel, 1, 0);
		gridPane.add(yLabel, 2, 0);
		gridPane.add(x1TextField, 1, 1);
		gridPane.add(x2TextField, 1, 2);
		gridPane.add(x3TextField, 1, 3);
		gridPane.add(y1TextField, 2, 1);
		gridPane.add(y2TextField, 2, 2);
		gridPane.add(y3TextField, 2, 3);
		borderPane.setTop(canvas);
		borderPane.setCenter(gridPane);
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Assignment 2");
		primaryStage.setScene(scene);
		createButton.setOnAction(this);
		endButton.setOnAction(this);
		primaryStage.show();

	}

	/**
	 * Will determine if the create button is clicked. Then it will create 3 points
	 * from the 6 inputs the user typed. It will draw a triangle. If the end button
	 * is clicked it will close the application.
	 */
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == createButton) {
			Point firstPoint = new Point(Integer.parseInt(x1TextField.getText()),
					Integer.parseInt(y1TextField.getText()));
			Point secondPoint = new Point(Integer.parseInt(x2TextField.getText()),
					Integer.parseInt(y2TextField.getText()));
			Point thirdPoint = new Point(Integer.parseInt(x3TextField.getText()),
					Integer.parseInt(y3TextField.getText()));
			triangleGraphics.strokeLine(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY());
			triangleGraphics.strokeLine(secondPoint.getX(), secondPoint.getY(), thirdPoint.getX(), thirdPoint.getY());
			triangleGraphics.strokeLine(thirdPoint.getX(), thirdPoint.getY(), firstPoint.getX(), firstPoint.getY());

		} else if (event.getSource() == endButton) {
			System.exit(0);

		}

	}

}
