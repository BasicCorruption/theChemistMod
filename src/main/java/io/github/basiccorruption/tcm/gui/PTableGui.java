package io.github.basiccorruption.tcm.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;

public class PTableGui extends LightweightGuiDescription {
    public PTableGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(1377, 764);
    }
}
