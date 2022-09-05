package org.xw.door.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: StarterServiceProperties
 * @Author: MaxWell
 * @Description:
 * @Date: 2022/9/5 16:02
 * @Version: 1.0
 */
@ConfigurationProperties("xw.door")
public class StarterServiceProperties {
    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
