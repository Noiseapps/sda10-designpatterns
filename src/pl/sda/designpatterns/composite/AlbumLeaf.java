package pl.sda.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class AlbumLeaf implements Leaf {

    private final List<Leaf> children = new ArrayList<>();

    void add(Leaf leaf) {

    }

    @Override
    public int songCount() {
        return 0;
    }

    @Override
    public int duration() {
        return 0;
    }
}
