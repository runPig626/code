package com.taigu.code;

import com.taigu.code.eunm.BusinessEnum;
import org.junit.jupiter.api.Test;

class CodeApplicationTests {

    @Test
    void contextLoads() {
        Integer i = 1;
        BusinessEnum.SHA_WAN_YI.assertNotNull(i);
    }

}
