package org.xw.door.config;

import org.springframework.util.StringUtils;

/**
 * @ClassName: StarterService
 * @Author: MaxWell
 * @Description:
 * @Date: 2022/9/5 16:02
 * @Version: 1.0
 */
public class StarterService {
    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
