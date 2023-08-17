package net.minecraft.src;

import net.minecraft.client.Minecraft;

public class NukerApi extends PlayerControllerSP
{
public NukerApi(Minecraft minecraft1) {
		super(minecraft1);
	}

public void napi5x4x1ud(int i1, int i2, int i3, int i4)
{
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

public void napi5x4x1ns(int i1, int i2, int i3, int i4)
{
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

public void napi5x4x1nsf(int i1, int i2, int i3, int i4)
{
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


public void napi3x3x3(int i1, int i2, int i3, int i4)
{
	for (int xOffset = -1; xOffset <= 1; xOffset++) {
	    for (int yOffset = -1; yOffset <= 1; yOffset++) {
	        for (int zOffset = -1; zOffset <= 1; zOffset++) {
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
public void napi3x3x1ud(int i1, int i2, int i3, int i4)
{
	 for (int xOffset = -1; xOffset <= 1; xOffset++) {
         for (int yOffset = -1; yOffset <= 1; yOffset++) {
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
public void napi3x3x1ns(int i1, int i2, int i3, int i4)
{
	for (int xOffset = -1; xOffset <= 1; xOffset++) {
	    for (int yOffset = -1; yOffset <= 1; yOffset++) {
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

public void napi3x3x1nsf(int i1, int i2, int i3, int i4)
{
	for (int xOffset = -1; xOffset <= 1; xOffset++) {
	    for (int yOffset = -1; yOffset <= 1; yOffset++) {
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
