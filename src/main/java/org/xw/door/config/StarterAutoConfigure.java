package org.xw.door.config;

/**
 * @ClassName: StarterAutoConfigure
 * @Author: MaxWell
 * @Description:
 * @Date: 2022/9/2 15:25
 * @Version: 1.0
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {
}
