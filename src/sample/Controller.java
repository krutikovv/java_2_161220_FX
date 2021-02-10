package sample;

import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    @FXML
    private Button btnSend;

    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        textArea.appendText("Hello World!\n");
    }

    @FXML
    public void clickBtnSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }

    @FXML
    public void onEnter(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }

}
