package io.github.alkyaly.dfascf.mixin;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFireBlock.class)
public class AbstractFireBlockMixin {

    @Inject(at = @At("HEAD"), method = "method_30033", cancellable = true)
    private static void dFASCF_fireBlockPlacing(World world, BlockPos blockPos, Direction direction, CallbackInfoReturnable<Boolean> info) {
        if(direction == Direction.DOWN || direction == Direction.UP) info.setReturnValue(false);
    }
}
