package sk.lesy.entity;

/**
 * Created by osk11072 on 17. 3. 2017.
 */
public class WoodCountBean {
    private String wood;
    private String count;

    public WoodCountBean() {
    }

    public WoodCountBean(String wood, String count) {
        this.wood = wood;
        this.count = count;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
