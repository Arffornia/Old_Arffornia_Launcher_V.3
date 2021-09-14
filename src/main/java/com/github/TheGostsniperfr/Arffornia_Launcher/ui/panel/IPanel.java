package com.github.TheGostsniperfr.Arffornia_Launcher.ui.panel;

import com.github.TheGostsniperfr.Arffornia_Launcher.ui.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {
    void init(PanelManager panelManager);
    GridPane getLayout();
    void onShow();
    String getName();
    String getStylesheetPath();
}