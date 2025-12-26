package com.github.driss2003costa.sunlauncher.ui.panel;

import org.w3c.dom.Node;

public interface IMovable {
    void setLeft(Node node);
    void setRight(Node node);
    void setTop(Node node);
    void setBottom(Node node);
    void setBase(Node node);
    void setCenterH(Node node);
    void setCenterV(Node node);
}
