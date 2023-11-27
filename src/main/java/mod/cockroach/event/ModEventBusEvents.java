package mod.cockroach.event;

import mod.cockroach.CockroachMod;
import mod.cockroach.entity.ModEntities;
import mod.cockroach.entity.custom.CockroachEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CockroachMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), CockroachEntity.createAttributes().build());
    }
}
