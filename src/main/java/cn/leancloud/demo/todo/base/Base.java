package cn.leancloud.demo.todo.base;

import cn.leancloud.demo.todo.app.AppInitListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Base {
    Logger logger = LogManager.getLogger(AppInitListener.class);
}
