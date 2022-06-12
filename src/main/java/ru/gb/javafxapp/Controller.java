package ru.gb.javafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.BreakIterator;
import java.util.Optional;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userAnswer;
    private MeChat meChat;
    public Controller() {
        MeChat meChat = new MeChat();
    }


    public void clickCheckButton(ActionEvent actionEvent) {
        String answer = userAnswer.getText();
        historyArea.appendText(answer + "\n");
        userAnswer.clear();
        userAnswer.requestFocus();
    }

    public void Exit() {
        System.exit(0);
    }
}
