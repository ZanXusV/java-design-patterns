package com.zanxus.javacodegeeks.patterns.chainofresponsibility;

/**
 * @author zanxus
 * @description
 * @create 2016-12-15-上午10:22
 */
public class ImageFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public ImageFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("image")) {
            System.out.println("Process and saving  image... by "+handlerName);
        } else if (handler!=null) {
            System.out.println(handlerName+"fowards request to "+handler.getHandlerName());
            handler.process(file);
        }else {
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
