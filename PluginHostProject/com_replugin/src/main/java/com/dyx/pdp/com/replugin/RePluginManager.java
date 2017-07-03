package com.dyx.pdp.com.replugin;

import com.qihoo360.replugin.RePlugin;

/**
 * project name：PluginHostProject
 * class describe：
 * create person：dayongxin
 * create time：2017/7/3 下午9:54
 * alter person：dayongxin
 * alter time：2017/7/3 下午9:54
 * alter remark：
 */
public class RePluginManager {
    private volatile static RePluginManager mInstance = null;

    private RePluginManager() {
    }

    public static RePluginManager getInstance() {
        if (mInstance == null) {
            synchronized (RePluginManager.class) {
                if (mInstance == null) {
                    mInstance = new RePluginManager();
                }
            }
        }
        return mInstance;
    }

    /**
     * 安装插件
     *
     * @param path
     */
    public static void installRePlugin(String path) {
        RePlugin.install(path);
    }

    /**
     * 卸载插件
     *
     * @param name
     */
    public static void unstallRePlugin(String name) {
        RePlugin.uninstall(name);
    }

    /**
     * 添加签名信息
     *
     * @param sign
     */
    public static void addCertSignatureRePlugin(String sign) {
        RePlugin.addCertSignature(sign);
    }

    /**
     * 预加载插件
     *
     * @param pluginName
     */
    public static void preloadRePlugin(String pluginName) {
        RePlugin.preload(pluginName);
    }
}
