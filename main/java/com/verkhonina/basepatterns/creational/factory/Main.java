package main.java.com.verkhonina.basepatterns.creational.factory;

import main.java.com.verkhonina.basepatterns.creational.factory.blocksFactory.DirtBlockFactory;
import main.java.com.verkhonina.basepatterns.creational.factory.blocksFactory.SandBlockFactory;
import main.java.com.verkhonina.basepatterns.creational.factory.blocksFactory.StoneBlockFactory;

public class Main {

    static BlockFactory createBlockFactory(BlockType type) {
        if (type == BlockType.Dirt) {
            return new DirtBlockFactory();
        } else if (type == BlockType.Sand) {
            return new SandBlockFactory();
        } else if (type == BlockType.Stone) {
            return new StoneBlockFactory();
        } else {
            throw new RuntimeException(type.toString() + "нельзя создать");
        }
    }


    public static void main(String[] args) {
        BlockFactory blockFactory = createBlockFactory(BlockType.Dirt);
        Block block = blockFactory.createBlock();
        block.put();
        block.move();
        block.destroy();
    }
}