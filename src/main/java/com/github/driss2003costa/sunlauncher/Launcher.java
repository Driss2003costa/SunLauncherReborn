package com.github.driss2003costa.sunlauncher;

import com.github.driss2003costa.sunlauncher.ui.PanelManager;
import com.github.driss2003costa.sunlauncher.utils.Helpers;
import fr.flowarg.flowlogger.ILogger;
import fr.flowarg.flowlogger.Logger;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;

public class Launcher extends Application {

    private PanelManager manager;
    private static Launcher instance;
    private ILogger logger;
    private final File launcherDir = Helpers.generateGamePath("sunlauncher");

    // REQUIRED by JavaFX
    public Launcher() {
        this.launcherDir.mkdirs();
        this.logger = new Logger(
                "[sunlauncher]",
                new File(this.launcherDir, "launcher.log").toPath()
        );
        instance = this;
    }

    public static Launcher getInstance() {
        return instance;
    }

    public ILogger getLogger() {
        return logger;
    }

    @Override
    public void start(Stage stage) {
        this.logger.info("Starting Launcher");
        this.manager = new PanelManager(this, stage);
        this.manager.init();
    }
}
