package net.minecraft.src;

import net.minecraft.client.Minecraft;

public class napi_5x4x1_test extends PlayerControllerSP {

    public napi_5x4x1_test(Minecraft minecraft) {
        super(minecraft);
    }
    
public void lookup(  int i1, int i2, int i3, int i4) {
	 for (int xOffset = -2; xOffset <= 2; xOffset++) {
         for (int yOffset = -2; yOffset <= 2; yOffset++) {
             for (int zOffset = 0; zOffset <= 0; zOffset++) {
                 int x = i1 + xOffset;
                 int y = i2 + zOffset;
                 int z = i3 + yOffset;
                 if (this.mc.theWorld.getBlockId(x, y, z) != 0) {
                     Block block = Block.blocksList[this.mc.theWorld.getBlockId(x, y, z)];
                     Material material = block.blockMaterial;
                     if (block != Block.bedrock && material != Material.air && block != Block.lavaMoving && block != Block.lavaStill && block != Block.waterMoving && block != Block.waterStill) {
                         this.sendBlockRemoved(x, y, z, i4);
                     }
                 }
             }
         }
     }
}
public void lookdown(  int i1, int i2, int i3, int i4) {
	 for (int xOffset = -2; xOffset <= 2; xOffset++) {
         for (int yOffset = -2; yOffset <= 2; yOffset++) {
             for (int zOffset = 0; zOffset <= 0; zOffset++) {
                 int x = i1 + xOffset;
                 int y = i2 + zOffset;
                 int z = i3 + yOffset;
                 if (this.mc.theWorld.getBlockId(x, y, z) != 0) {
                     Block block = Block.blocksList[this.mc.theWorld.getBlockId(x, y, z)];
                     Material material = block.blockMaterial;
                     if (block != Block.bedrock && material != Material.air && block != Block.lavaMoving && block != Block.lavaStill && block != Block.waterMoving && block != Block.waterStill) {
                         this.sendBlockRemoved(x, y, z, i4);
                     }
                 }
             }
         }
     }
}

public void lookfoward(  int i1, int i2, int i3, int i4) {
	for (int xOffset = -2; xOffset <= 2; xOffset++) {
	    for (int yOffset = -1; yOffset <= 2; yOffset++) {
	        for (int zOffset = 0; zOffset <= 0; zOffset++) {
	            int x = i1 + xOffset;
	            int y = i2 + yOffset;
	            int z = i3 + zOffset;
	            if (this.mc.theWorld.getBlockId(x, y, z) != 0) {
	                Block block = Block.blocksList[this.mc.theWorld.getBlockId(x, y, z)];
	                Material material = block.blockMaterial;
	                if (block != Block.bedrock && material != Material.air && block != Block.lavaMoving && block != Block.lavaStill && block != Block.waterMoving && block != Block.waterStill) {
	                    this.sendBlockRemoved(x, y, z, i4);
	                }
	            }
	        }
	    }
	}
}
public void lookback(  int i1, int i2, int i3, int i4) {
	for (int xOffset = -2; xOffset <= 2; xOffset++) {
	    for (int yOffset = -1; yOffset <= 2; yOffset++) {
	        for (int zOffset = 0; zOffset <= 0; zOffset++) {
	            int x = i1 + xOffset;
	            int y = i2 + yOffset;
	            int z = i3 + zOffset;
	            if (this.mc.theWorld.getBlockId(x, y, z) != 0) {
	                Block block = Block.blocksList[this.mc.theWorld.getBlockId(x, y, z)];
	                Material material = block.blockMaterial;
	                if (block != Block.bedrock && material != Material.air && block != Block.lavaMoving && block != Block.lavaStill && block != Block.waterMoving && block != Block.waterStill) {
	                    this.sendBlockRemoved(x, y, z, i4);
	                }
	            }
	        }
	    }
	}
}

public void lookleft(  int i1, int i2, int i3, int i4) {
	for (int xOffset = -2; xOffset <= 2; xOffset++) {
	    for (int yOffset = -1; yOffset <= 2; yOffset++) {
	        for (int zOffset = 0; zOffset <= 0; zOffset++) {
	            int x = i1 + zOffset;
	            int y = i2 + yOffset;
	            int z = i3 + xOffset;
	            if (this.mc.theWorld.getBlockId(x, y, z) != 0) {
	                Block block = Block.blocksList[this.mc.theWorld.getBlockId(x, y, z)];
	                Material material = block.blockMaterial;
	                if (block != Block.bedrock && material != Material.air && block != Block.lavaMoving && block != Block.lavaStill && block != Block.waterMoving && block != Block.waterStill) {
	                    this.sendBlockRemoved(x, y, z, i4);
	                }
	            }
	        }
	    }
	}
}
public void lookright(  int i1, int i2, int i3, int i4) {
	for (int xOffset = -2; xOffset <= 2; xOffset++) {
	    for (int yOffset = -1; yOffset <= 2; yOffset++) {
	        for (int zOffset = 0; zOffset <= 0; zOffset++) {
	            int x = i1 + zOffset;
	            int y = i2 + yOffset;
	            int z = i3 + xOffset;
	            if (this.mc.theWorld.getBlockId(x, y, z) != 0) {
	                Block block = Block.blocksList[this.mc.theWorld.getBlockId(x, y, z)];
	                Material material = block.blockMaterial;
	                if (block != Block.bedrock && material != Material.air && block != Block.lavaMoving && block != Block.lavaStill && block != Block.waterMoving && block != Block.waterStill) {
	                    this.sendBlockRemoved(x, y, z, i4);
	                }
	            }
	        }
	    }
	}
}




}
