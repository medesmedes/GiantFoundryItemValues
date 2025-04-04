package com.speshkitty.giantsfoundryitemvalues;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("giants-foundry-item-values")
public interface ItemBarValuesConfig extends Config {
    @ConfigItem(
            keyName = "showInGF",
            name = "Show in Giants' Foundry",
            description = "Shows the bar value of items inside Giants' Foundry"
    )
    default boolean showInGF() {
        return true;
    }

    @ConfigItem(
            keyName = "showEverywhere",
            name = "Show everywhere",
            description = "Shows the bar value of items everywhere"
    )
    default boolean showEverywhere() {
        return false;
    }

    @ConfigItem(
            keyName = "showTotalValue",
            name = "Show total bar value",
            description = "Shows the total bar value of item stacks"
    )
    default boolean showTotalValue() {
        return false;
    }

    @ConfigItem(
            keyName = "displayPosition",
            name = "Display Position",
            description = "The position where the overlay text is drawn"
    )
    default DisplayPosition textDisplayPosition() {
        return DisplayPosition.BOTTOM_RIGHT;
    }

    @Alpha
    @ConfigItem(
            position = 10,
            keyName = "textColor",
            name = "Text color",
            description = "Color of the item value text."
    )
    default Color textColor() {
        return Color.WHITE;
    }
}
