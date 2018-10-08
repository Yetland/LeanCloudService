package cn.leancloud.demo.todo.cloud;

import cn.leancloud.EngineFunction;
import cn.leancloud.EngineFunctionParam;
import cn.leancloud.demo.todo.base.BaseCloud;

public class Cloud extends BaseCloud {

    @EngineFunction("hello")
    public static String hello(@EngineFunctionParam("name") String name) {
        if (name == null) {
            return "What is your name?";
        }
        return String.format("Hello %s!", name);
    }

}
