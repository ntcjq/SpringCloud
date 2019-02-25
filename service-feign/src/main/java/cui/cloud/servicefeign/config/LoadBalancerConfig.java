package cui.cloud.servicefeign.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cuijq
 */
@Configuration
public class LoadBalancerConfig {
    @Bean
    public IRule getRule() {
        //默认是轮询的负载均衡机制（不推荐），修改为随机的负载均衡机制
        return new RandomRule();
    }
}
