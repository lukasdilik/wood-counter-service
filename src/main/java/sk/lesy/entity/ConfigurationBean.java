package sk.lesy.entity;

/**
 * Created by osk11072 on 14. 2. 2017.
 */
public class ConfigurationBean {
    private Woods conf;

    public Woods getConf() {
        return conf;
    }

    public void setConf(Woods conf) {
        this.conf = conf;
    }

    @Override
    public String toString() {
        return "ConfigurationBean{" +
                "conf=" + conf +
                '}';
    }
}
