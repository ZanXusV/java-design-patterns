package com.zanxus.javacodegeeks.patterns.visitorpattern;

/**
 * @author root
 * @create 2016-12-31 2:54 PM
 */
public class CssClassVisitor implements Visitor {

    @Override
    public void visit(HtmlElement element) {
        element.setStartTag(element.getStartTag().replace(">", " class='visitor'>"));
    }

    @Override
    public void visit(HtmlParentElement parentElement) {
        parentElement.setStartTag(parentElement.getStartTag().replace(">", " class='visitor'>"));
    }
}
