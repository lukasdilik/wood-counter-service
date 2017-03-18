package sk.lesy.entity;

import sk.lesy.entity.Range;

import java.util.List;

/**
 * Created by osk11072 on 14. 2. 2017.
 */
public class Woods {
    private List<String> woods;
    private Range range;

    public Woods(List<String> woods, Range range) {
        this.woods = woods;
        this.range = range;
    }

    public Woods() {
    }

    public List<String> getWoods() {
        return woods;
    }

    public void setWoods(List<String> woods) {
        this.woods = woods;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }
}
