package mod.cockroach.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import mod.cockroach.CockroachMod;
import mod.cockroach.entity.custom.CockroachEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CockroachRenderer extends MobRenderer<CockroachEntity, CockroachModel<CockroachEntity>> {
    public CockroachRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CockroachModel<>(pContext.bakeLayer(ModModelLayers.COCKROACH_LAYER)), 0.125f);
    }

    @Override
    public ResourceLocation getTextureLocation(CockroachEntity pEntity) {
        return new ResourceLocation(CockroachMod.MOD_ID, "textures/entity/cockroach.png");
    }

    @Override
    public void render(CockroachEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
            MultiBufferSource pBuffer, int pPackedLight) {
        if (!pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            pMatrixStack.scale(0.25f, 0.25f, 0.25f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
