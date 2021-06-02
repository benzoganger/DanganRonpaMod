
public static class Modelssda extends ModelBase {
	public Modelssda() {
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 2, 1, 0F);
		Shape1.setRotationPoint(-8F, 38F, 7F);
		Shape1.rotateAngleX = 0F;
		Shape1.rotateAngleY = 0F;
		Shape1.rotateAngleZ = 0F;
		Shape1.mirror = false;
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 16, 1, 1, 0F);
		Shape2.setRotationPoint(-8F, 39F, 6F);
		Shape2.rotateAngleX = 0F;
		Shape2.rotateAngleY = 0F;
		Shape2.rotateAngleZ = 0F;
		Shape2.mirror = false;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape2.render(f5);
	}

	// fields
	public ModelRenderer Shape1;
	public ModelRenderer Shape2;
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
