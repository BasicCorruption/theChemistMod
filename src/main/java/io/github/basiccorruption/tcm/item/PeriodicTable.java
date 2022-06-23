package io.github.basiccorruption.tcm.item;

import io.github.basiccorruption.tcm.gui.PTableGui;
import io.github.basiccorruption.tcm.gui.PTableScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PeriodicTable extends Item {
    public PeriodicTable(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // display the periodic table gui to the player with cottonmc libgui framework
        user.openHandledScreen(new NamedScreenHandlerFactory() {
            @Nullable
            @Override
            public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
                return null;
            }

            @Override
            public Text getDisplayName() {
                return null;
            }

            public PTableScreen createMenu(int syncId, PlayerEntity player) {
                return new PTableScreen(new PTableGui());
            }
        });
        return super.use(world, user, hand);
    }
}
