package com.franco227.no_spectator_teleport.mixin;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.SpectatorTeleportC2SPacket;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayNetworkHandler.class)
public abstract class ServerPlayNetworkHandlerMixin {

    @Inject(at = @At("RETURN"), method = "accepts", cancellable = true)
    private void accepts(Packet<?> packet, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue() && (packet instanceof SpectatorTeleportC2SPacket)) {
            cir.setReturnValue(false);
        }
    }
}
