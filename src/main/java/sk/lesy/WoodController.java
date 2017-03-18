package sk.lesy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.lesy.entity.ConfigurationBean;
import sk.lesy.entity.WoodCountBean;
import sk.lesy.entity.Woods;

import java.util.ArrayList;

/**
 * Created by osk11072 on 14. 2. 2017.
 */
@RestController
public class WoodController {

    @Autowired
    private ConfigurationBean configurationBean;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/configuration")
    private Woods getConfiguration(){
        Woods conf;
        conf = configurationBean.getConf();
        return conf;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(path = "/saveCount", method = RequestMethod.POST)
    private void saveCount( @RequestParam("params") ArrayList<WoodCountBean> params){
        int a = 0;
        a++;
}



}
