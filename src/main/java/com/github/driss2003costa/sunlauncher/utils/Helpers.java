package com.github.driss2003costa.sunlauncher.utils;

import fr.flowarg.flowcompat.Platform;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helpers {
    public static File generateGamePath(String gameName) {
        Path path = null;

        switch (Platform.getCurrentPlatform()) {
            case WINDOWS:
                path = Paths.get(System.getenv("APPDATA"));
                break;
            case MAC:
                path = Paths.get(System.getProperty("user.home"), "/Library/Application Support");
                break;
        }
        String folderName;
        path = Paths.get(path.toString(), gameName);
        return path.toFile();
    }
}
