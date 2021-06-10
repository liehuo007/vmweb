package net.vicp.fyhui.vmweb.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.management.ManagementFactory;
import java.util.UUID;

@Controller("/")
public class WebController {

    private final static Logger logger = LogManager.getLogger();

    @Value("${server.port}")
    private String serverPort;

    @Value("${appId}")
    private String appId;

    @RequestMapping
    @ResponseBody
    public String index(){
        String uuid = UUID.randomUUID().toString();
        String result = String.format("[ %s ]-[ %s ]-[ %s ]-[ %s ]",uuid,ManagementFactory.getRuntimeMXBean().getName(),appId,serverPort);
        logger.info(result);
        return result;
    }
}
