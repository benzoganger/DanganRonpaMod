
package benzoganger.sxcred.danganronpa.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import benzoganger.sxcred.danganronpa.ElementsBenzogangedSxredDanganronpaMod;

@ElementsBenzogangedSxredDanganronpaMod.ModElement.Tag
public class TabDanganRonpaFloor extends ElementsBenzogangedSxredDanganronpaMod.ModElement {
	public TabDanganRonpaFloor(ElementsBenzogangedSxredDanganronpaMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdangan_ronpa_floor") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.END_CRYSTAL, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
