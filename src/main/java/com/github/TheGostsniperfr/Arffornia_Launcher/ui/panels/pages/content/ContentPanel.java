package com.github.TheGostsniperfr.Arffornia_Launcher.ui.panels.pages.content;

import com.github.TheGostsniperfr.Arffornia_Launcher.ui.panel.Panel;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

public abstract class ContentPanel extends Panel {
    @Override
    public void onShow() {
        FadeTransition transition = new FadeTransition(Duration.millis(250), this.layout);
        transition.setFromValue(0);
        transition.setToValue(1);
        transition.setAutoReverse(true);
        transition.play();
    }
}