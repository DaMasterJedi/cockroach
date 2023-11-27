package mod.cockroach.entity;

import mod.cockroach.CockroachMod;
import mod.cockroach.entity.custom.CockroachEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister
            .create(ForgeRegistries.ENTITY_TYPES, CockroachMod.MOD_ID);

    public static final RegistryObject<EntityType<CockroachEntity>> RHINO = ENTITY_TYPES.register("cockroach",
            () -> EntityType.Builder.of(CockroachEntity::new, MobCategory.CREATURE)
                    .sized(0.125f, 0.125f).build("cockroach"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
