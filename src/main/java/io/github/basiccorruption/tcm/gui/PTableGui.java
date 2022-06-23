package io.github.basiccorruption.tcm.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import net.minecraft.util.Identifier;

public class PTableGui extends LightweightGuiDescription {
    public PTableGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(1377, 764);
        // add the image to the root panel
        root.add(new WSprite(new Identifier("tcm:gui/periodic_table.png")), 0, 0);
    }
}
