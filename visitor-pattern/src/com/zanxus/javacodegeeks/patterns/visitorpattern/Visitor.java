package com.zanxus.javacodegeeks.patterns.visitorpattern;

/**
 * @author root
 * @create 2016-12-31 2:29 PM
 */
public interface Visitor {

    public void visit(HtmlElement element);

    public void visit(HtmlParentElement parentElement);
}
