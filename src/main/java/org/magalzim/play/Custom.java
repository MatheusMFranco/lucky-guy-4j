package org.magalzim.play;

import java.util.List;

public class Custom extends Play {

    private final List<String> list;

    public Custom(List<String> list) {
        this.list = list;
    }

    public String play() {
        if (list.isEmpty()) {
            throw new IndexOutOfBoundsException("Index 0 out of bounds for length 0");
        }
        return list.get(randomize(list.size()));
    }
}
