package cn.leancloud.demo.todo.cloud;

import cn.leancloud.EngineFunction;
import cn.leancloud.EngineFunctionParam;
import cn.leancloud.demo.todo.base.BaseCloud;

public class SearchCloud extends BaseCloud {

    @EngineFunction("search")
    public static String search(@EngineFunctionParam("key") String key,
                                @EngineFunctionParam("userId") String userId) {
        logger.debug("key = " + key + " , userId = " + userId);
        return "search test";
    }
}
