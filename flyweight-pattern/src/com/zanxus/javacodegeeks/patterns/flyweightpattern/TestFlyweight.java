package com.zanxus.javacodegeeks.patterns.flyweightpattern;

/**
 * @author root
 * @create 2016-12-14 9:33 PM
 */
public class TestFlyweight {

    public static void main(String[] args) {
        Code code = new Code();
        code.setCode("C Code...");
        Platform platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println();
        code.setCode("C Code2");
        platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println();
        code.setCode("JAVA Code");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println();
        code.setCode("JAVA Code2");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println();
        code.setCode("RUBY Code");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
        System.out.println();
        code.setCode("RUBY Code2");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);

    }
}
