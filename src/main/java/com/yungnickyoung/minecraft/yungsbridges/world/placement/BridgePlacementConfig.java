package com.yungnickyoung.minecraft.yungsbridges.world.placement;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.gen.placement.IPlacementConfig;

public class BridgePlacementConfig implements IPlacementConfig {
    public static final Codec<BridgePlacementConfig> CODEC = RecordCodecBuilder.create((codec) ->
        codec.group(
            Codec.INT.fieldOf("length").forGetter((config) -> config.length),
            Codec.INT.fieldOf("width").forGetter((config) -> config.width),
            Codec.INT.fieldOf("minWaterZ").forGetter((config) -> config.minWaterZ),
            Codec.INT.fieldOf("maxWaterZ").forGetter((config) -> config.maxWaterZ)
        ).apply(codec, BridgePlacementConfig::new));

    public final int length;
    public final int width;
    public final int minWaterZ;
    public final int maxWaterZ;

    public BridgePlacementConfig(int length, int width, int minWaterZ, int maxWaterZ) {
        this.length = length;
        this.width = width;
        this.minWaterZ = minWaterZ;
        this.maxWaterZ = maxWaterZ;
    }
}
