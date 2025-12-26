package com.github.driss2003costa.sunlauncher.ui.panel;

import com.github.driss2003costa.sunlauncher.Launcher;
import com.github.driss2003costa.sunlauncher.ui.PanelManager;
import fr.flowarg.flowlogger.ILogger;
import javafx.animation.FadeTransition;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public abstract class Panel  implements IPanel, IMovable, ITakePlace{
    protected final ILogger logger;
    protected GridPane layout = new GridPane();
    protected PanelManager manager;

    protected Panel() {
        this.logger = Launcher.getInstance().getLogger();
    }

    @Override
    public void init(PanelManager manager) {
        this.manager = manager;
        setCanTakeAllSize(this.layout);
    }

    @Override
    public void onShow() {
        FadeTransition fadeIn = new FadeTransition(Duration.millis(500), this.layout);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.setAutoReverse(true);
        fadeIn.play();
    }

    @Override
    public abstract String getName();

    public void setLeft(Node node){
        GridPane.setHalignment(node, HPos.LEFT);

    }

    public void setRight(Node node){
        GridPane.setHalignment(node, HPos.RIGHT);

    }

    public void setTop(Node node){
        GridPane.setValignment(node, VPos.TOP);
    }

    public void setBottom(Node node){
        GridPane.setValignment(node, VPos.BOTTOM);
    }

    public void setBaseline(Node node){
        GridPane.setValignment(node, VPos.BASELINE);
    }

    public void setCenterV(Node node){
        GridPane.setValignment(node, VPos.CENTER);
    }

    public void setCenterH(Node node){
        GridPane.setHalignment(node, HPos.CENTER);
    }

}
