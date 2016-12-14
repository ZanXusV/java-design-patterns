package com.zanxus.javacodegeeks.patterns.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author root
 * @create 2016-12-14 9:23 PM
 */
public final class PlatformFactory {
    private static Map<String, Platform> map = new HashMap<>();

    public PlatformFactory() {
        throw new AssertionError("Can't instantiate the class");
    }

    public static synchronized Platform getPlatformInstance(String platformType) {
        Platform platform = map.get(platformType);
        if (platform == null) {
            switch (platformType) {
                case "C":
                    platform = new CPlatform();
                    break;
                case "CPP":
                    platform = new CPPPlatform();
                    break;
                case "JAVA":
                    platform = new JavaPlatform();
                    break;
                case "RUBY":
                    platform = new RubyPlatform();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }
}
