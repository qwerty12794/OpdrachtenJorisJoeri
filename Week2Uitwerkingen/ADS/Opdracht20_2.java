import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by MSI on 7-3-2017.
 */
public class Opdracht20_2 extends Application{
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("GEEF ANTWOORD~~~!");
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        Text text = new Text("Wat een mooi programma");
        gridPane.add(text,0,0);

        Label invoer = new Label("Voer je invoer in: ");
        gridPane.add(invoer,0,2);

        TextField textField = new TextField();
        gridPane.add(textField,1,2);

        Button button_sort = new Button("SORT");
        Button button_shuffle = new Button("SHUFFLE");
        Button button_reverse = new Button("REVERSE");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(button_sort);
        hBox.getChildren().add(button_shuffle);
        hBox.getChildren().add(button_reverse);
        gridPane.add(hBox,1,3);

        button_sort.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String[] array = textField.getText().split(" ");
                LinkedList<Integer>  linked = arrayToLinked(array);
                System.out.println("test" + linked);
            }
        });
        TextArea textArea = new TextArea();
        gridPane.add(textArea,1,4);

        button_sort.setOnAction(event -> {
            Opdracht20_2Mathmatics.sort(textField.getText());
//            String[] input = textField.getText().split(" ");
        });
        button_shuffle.setOnAction(event -> System.out.println(textField.getText()));

        button_shuffle.setOnAction(event -> System.out.println(textField.getText()));

        button_reverse.setOnAction(event -> System.out.println(textField.getText()));

        Scene scene = new Scene(gridPane,550,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public LinkedList<Integer> arrayToLinked(String[] array) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++) {
            linkedList.add(Integer.parseInt(array[i]));
        }
        return linkedList;
    }
}
