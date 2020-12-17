package com.carfi.servicefeign.fallback;

import com.carfi.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * com.carfi.servicefeign.fallback$
 *
 * @author ll
 * @date 2020-12-17 17:37:51
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
