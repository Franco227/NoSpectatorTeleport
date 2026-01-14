package com.franco227.no_spectator_teleport.mixin;

import net.minecraft.network.protocol.game.ServerboundTeleportToEntityPacket;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerGamePacketListenerImpl.class)
public abstract class ServerGamePacketListenerImplMixin {

    @Inject(at = @At("HEAD"), method = "handleTeleportToEntityPacket", cancellable = true)
    private void onSpectatorTeleport(ServerboundTeleportToEntityPacket packet, CallbackInfo ci) {
        ci.cancel();
    }
}
