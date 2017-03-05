package com.zhouwei.platform.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhouwei on 2017/3/5.
 */
@Component
public class AppInfo {

    @Value("${app.version}")
    private String version;

    @Value("${app.name}")
    private String name;

    @Override
    public String toString() {
        return "AppInfo{" +
                "version='" + version + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
