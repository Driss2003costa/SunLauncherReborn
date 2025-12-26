package com.github.driss2003costa.sunlauncher.ui;

import com.github.driss2003costa.sunlauncher.Launcher;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PanelManager {
    private final Stage stage;
    private final Launcher launcher;
    private GridPane layout;
    public PanelManager( Launcher launcher, Stage stage ){
        this.launcher = launcher;
        this.stage = stage;
    }

    public void init(){
        this.stage.setTitle("SunLauncher");
        this.stage.setResizable(false);
        this.stage.setWidth(800);
        this.stage.setHeight(600);
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.centerOnScreen();
  //      this.stage.getIcons().add(new Image("images/icon.png"));

        this.layout = new GridPane();
        Scene scene = new Scene(this.layout);
        this.stage.setScene(scene);
        this.stage.show();


    }
}
