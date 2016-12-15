package com.zanxus.javacodegeeks.patterns.chainofresponsibility;

/**
 * @author zanxus
 * @create 2016-12-14-下午4:17
 */
public interface Handler {

    public void setHandler(Handler handler);

    public void process(File file);

    public String getHandlerName();
}
