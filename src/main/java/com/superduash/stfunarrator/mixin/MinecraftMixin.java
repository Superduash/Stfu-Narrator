package com.superduash.stfunarrator.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MinecraftMixin {

    @Shadow @Final public Options options;

    @Inject(method = "onGameLoadFinished", at = @At("HEAD"))
    private void stfuNarrator$onGameLoadFinished(CallbackInfo ci) {
        this.options.onboardAccessibility = false;
        this.options.narratorHotkey().set(false);
        this.options.save();
    }
}
