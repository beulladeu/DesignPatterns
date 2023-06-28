package main.java.com.verkhonina.basepatterns.creational.factory.blocksFactory;

import main.java.com.verkhonina.basepatterns.creational.factory.Block;
import main.java.com.verkhonina.basepatterns.creational.factory.BlockFactory;
import main.java.com.verkhonina.basepatterns.creational.factory.blocks.DirtBlock;

public class DirtBlockFactory implements BlockFactory {

    @Override
    public Block createBlock() {
        return new DirtBlock();
    }
}
