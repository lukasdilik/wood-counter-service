package sk.lesy.entity;

/**
 * Created by osk11072 on 14. 2. 2017.
 */
public class Range {
    private int from;
    private int to;
    private int step;

    public Range(int from, int to, int strp) {
        this.from = from;
        this.to = to;
        this.step = strp;
    }

    public Range() {
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
