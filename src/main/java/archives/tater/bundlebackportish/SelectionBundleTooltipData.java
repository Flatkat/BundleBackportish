package archives.tater.bundlebackportish;

import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.BundleTooltipData;
import net.minecraft.util.collection.DefaultedList;

public class SelectionBundleTooltipData extends BundleTooltipData {
    private final int selected;

    public SelectionBundleTooltipData(DefaultedList<ItemStack> inventory, int bundleOccupancy, int selected) {
        super(inventory, bundleOccupancy);
        this.selected = selected;
    }

    public int getSelected() {
        return selected;
    }
}
