package com.example.udemytodo;

import com.example.udemytodo.datamodel.TodoData;
import com.example.udemytodo.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescription;
    @FXML
    private TextArea longDescription;
    @FXML
    private DatePicker datePicker;

    public void processResults() {
        String shortD = shortDescription.getText().trim();
        String details = longDescription.getText().trim();
        LocalDate deadLine = datePicker.getValue();

        TodoData.getInstance().addTodoItem(new TodoItem(shortD, details, deadLine));
    }
}
