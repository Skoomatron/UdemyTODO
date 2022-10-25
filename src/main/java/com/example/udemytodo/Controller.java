package com.example.udemytodo;

import com.example.udemytodo.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private ListView todoListView;
    private List<TodoItem> todoItems;
    public void initialize() {
        TodoItem item1 = new TodoItem(
                "Pay Bills",
                "Pay the power bill, amount $680",
                LocalDate.of(2022, Month.NOVEMBER, 1));
        TodoItem item2 = new TodoItem(
                "Go to Store",
                "Buy toothpaste, paper towels, and beef jerky",
                LocalDate.of(2022, Month.OCTOBER, 28));
        TodoItem item3 = new TodoItem(
                "Walk Dog",
                "Give the dog a long walk",
                LocalDate.of(2022, Month.OCTOBER, 25));
        TodoItem item4 = new TodoItem(
                "Sort Cards",
                "Sort all of my loose magic cards before new set comes out",
                LocalDate.of(2022, Month.DECEMBER, 15));
        TodoItem item5 = new TodoItem(
                "Halloween Parties",
                "Attend Mason Bar, Manse Street, and Scayola Halloween parties",
                LocalDate.of(2022, Month.OCTOBER, 30));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(0, item1);
        todoItems.add(1, item1);
        todoItems.add(2, item3);
        todoItems.add(3, item4);
        todoItems.add(4, item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

}