package com.example.udemytodo;

import com.example.udemytodo.datamodel.TodoData;
import com.example.udemytodo.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Controller {
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private Label dueDateLabel;
    @FXML
    private TextArea todoTextArea;
    private List<TodoItem> todoItems;
    public void initialize() {
//        TodoItem item1 = new TodoItem(
//                "Pay Bills",
//                "Pay the power bill, amount $680",
//                LocalDate.of(2022, Month.NOVEMBER, 1));
//        TodoItem item2 = new TodoItem(
//                "Go to Store",
//                "Buy toothpaste, paper towels, and beef jerky",
//                LocalDate.of(2022, Month.OCTOBER, 28));
//        TodoItem item3 = new TodoItem(
//                "Walk Dog",
//                "Give the dog a long walk",
//                LocalDate.of(2022, Month.OCTOBER, 25));
//        TodoItem item4 = new TodoItem(
//                "Sort Cards",
//                "Sort all of my loose magic cards before new set comes out",
//                LocalDate.of(2022, Month.DECEMBER, 15));
//        TodoItem item5 = new TodoItem(
//                "Halloween Parties",
//                "Attend Mason Bar, and Manse Street Halloween parties",
//                LocalDate.of(2022, Month.OCTOBER, 30));
//
//        todoItems = new ArrayList<TodoItem>();
//        todoItems.add(0, item1);
//        todoItems.add(1, item2);
//        todoItems.add(2, item3);
//        todoItems.add(3, item4);
//        todoItems.add(4, item5);
//
//        TodoData.getInstance().setTodoItems(todoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
                if (t1 != null) {
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    todoTextArea.setText(item.getFullDescription());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    dueDateLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }


//    @FXML
//    public void handleClickListView() {
//        TodoItem item = (TodoItem) todoListView.getSelectionModel().getSelectedItem();
//        todoTextArea.setText(item.getFullDescription());
//        dueDateLabel.setText(item.getDeadline().toString());
//    }
}