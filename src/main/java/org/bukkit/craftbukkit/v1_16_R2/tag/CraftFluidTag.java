package org.bukkit.craftbukkit.v1_16_R2.tag;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.ITagCollection;
import net.minecraft.util.ResourceLocation;
import org.bukkit.craftbukkit.v1_16_R2.util.CraftMagicNumbers;

public class CraftFluidTag extends CraftTag<Fluid, org.bukkit.Fluid> {

    public CraftFluidTag(ITagCollection<Fluid> registry, ResourceLocation tag) {
        super(registry, tag);
    }

    @Override
    public boolean isTagged(org.bukkit.Fluid fluid) {
        return getHandle().func_230235_a_(CraftMagicNumbers.getFluid(fluid));

    }

    @Override
    public Set<org.bukkit.Fluid> getValues() {
        return Collections.unmodifiableSet(getHandle().func_230236_b_().stream().map(CraftMagicNumbers::getFluid).collect(Collectors.toSet()));
    }
}