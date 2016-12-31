package com.zanxus.javacodegeeks.patterns.visitorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author root
 * @create 2016-12-31 2:41 PM
 */
public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }


    @Override
    public String getStartTag() {
        return startTag;
    }

    @Override
    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    @Override
    public String getEndTag() {
        return endTag;
    }

    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childrenTag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        childrenTag.stream().forEach(htmlTag -> htmlTag.generateHtml());
        System.out.println(endTag);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
