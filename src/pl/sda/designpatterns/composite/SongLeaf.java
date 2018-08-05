package pl.sda.designpatterns.composite;

public class SongLeaf implements Leaf {
    @Override
    public int songCount() {
        return 1;
    }

    @Override
    public int duration() {
        return 0;
    }
}
