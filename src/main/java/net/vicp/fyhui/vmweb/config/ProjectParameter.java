package net.vicp.fyhui.vmweb.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ProjectParameter {

    @Value("${server.port}")
    private String serverPort;

    @Value("${appId}")
    private String appId;

    @Value("${isShowAppId}")
    private boolean isShowAppId;
}
