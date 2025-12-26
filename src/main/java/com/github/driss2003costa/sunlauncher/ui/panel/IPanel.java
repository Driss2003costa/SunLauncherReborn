package com.github.driss2003costa.sunlauncher.ui.panel;

import com.github.driss2003costa.sunlauncher.ui.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {

    void init(PanelManager pm);
    GridPane getLayout();
    void onShow();
    String getName();
}
