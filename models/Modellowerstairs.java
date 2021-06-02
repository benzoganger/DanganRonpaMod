
public static class Modellowerstairs extends ModelBase {
	public Modellowerstairs() {
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 16, 16, 0F);
		Shape1.setRotationPoint(-8F, 8F, -8F);
		Shape1.rotateAngleX = 0F;
		Shape1.rotateAngleY = 0F;
		Shape1.rotateAngleZ = 0F;
		Shape1.mirror = false;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
	}

	// fields
	public ModelRenderer Shape1;

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
