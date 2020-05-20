package com.jd.platform.hotkey.common.configcenter;

/**
 * @author wuweifeng wrote on 2019-12-06
 * @version 1.0
 */
public interface ConfigConstant {
    /**
     * 所有的app名字，存这里
     */
    String appsPath = "/jd/apps/";
    /**
     * 所有的workers，存这里
     */
    String workersPath = "/jd/workers/";
    /**
     * 该app所有的workers地址的path。需要手工分配，默认每个app都用所有的worker
     */
    String appWorkerPath = null;
    /**
     * 所有的客户端规则（譬如哪个app的哪些前缀的才参与计算）
     */
    String rulePath = "/jd/rules/";
    /**
     * 客户端数量，如/jd/count/cartsoa = 2900
     */
    String clientCountPath = "/jd/count/";
    /**
     * 每个app的热key放这里。格式如：jd/hotkeys/app1/userA
     */
    String hotKeyPath = "/jd/hotkeys/";
    /**
     * caffeine的size
     */
    String caffeineSizePath = "/jd/caffeineSize/";
    /**
     * totalReceiveKeyCount该worker接收到的key总量，每10秒上报一次
     */
    String totalReceiveKeyCount = "/jd/totalKeyCount/";
    /**
     * bufferPool直接内存
     */
    String bufferPoolPath = "/jd/bufferPool/";
}
