package net.vicp.fyhui.vmweb.controller;

import net.vicp.fyhui.vmweb.config.ProjectParameter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.management.ManagementFactory;
import java.util.UUID;

@Controller("/")
public class WebController {

    private final static Logger logger = LogManager.getLogger();

    @Autowired
    private ProjectParameter projectParameter;

    @RequestMapping
    @ResponseBody
    public String index(){
        String uuid = UUID.randomUUID().toString();
        String result;
        if(projectParameter.isShowAppId()){
            result = String.format("[ %s ]-[ %s ]-[ %s ]-[ %s ]",uuid,ManagementFactory.getRuntimeMXBean().getName(), projectParameter.getAppId(), projectParameter.getServerPort());
        } else {
            result = String.format("[ %s ]-[ %s ]",uuid,ManagementFactory.getRuntimeMXBean().getName());
        }
        logger.info(result);
        return result;
    }
}
