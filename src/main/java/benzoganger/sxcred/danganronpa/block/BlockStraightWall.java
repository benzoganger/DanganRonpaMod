
package benzoganger.sxcred.danganronpa.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import benzoganger.sxcred.danganronpa.creativetab.TabDanganRonpaWalls;
import benzoganger.sxcred.danganronpa.ElementsBenzogangedSxredDanganronpaMod;

@ElementsBenzogangedSxredDanganronpaMod.ModElement.Tag
public class BlockStraightWall extends ElementsBenzogangedSxredDanganronpaMod.ModElement {
	@GameRegistry.ObjectHolder("benzoganged_sxred_danganronpa:straight_wall")
	public static final Block block = null;
	public BlockStraightWall(ElementsBenzogangedSxredDanganronpaMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("straight_wall"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("benzoganged_sxred_danganronpa:straight_wall", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("straight_wall");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabDanganRonpaWalls.tab);
		}
	}
}
