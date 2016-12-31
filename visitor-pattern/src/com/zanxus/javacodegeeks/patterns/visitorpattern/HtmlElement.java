package com.zanxus.javacodegeeks.patterns.visitorpattern;

/**
 * @author root
 * @create 2016-12-31 2:32 PM
 */
public class HtmlElement extends HtmlTag {

    private String tagName;

    private String startTag;

    private String endTag;

    private String tagBody;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
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
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag + "" + tagBody + "" + endTag);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
