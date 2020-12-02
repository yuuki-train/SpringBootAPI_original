package com.example.original.app.resource;
import java.io.Serializable;

public class OsakaMetro implements Serializable {
    private static final long serialVersionUID = 1L;

    //フィールド
    private String name;
    private String color;
    private String start;
    private String finish;

    //コンストラクタ
    public OsakaMetro(String name, String color, String start, String finish){
        this.name = name;
        this.color = color;
        this.start = start;
        this.finish = finish;
    }

    // getter/setter
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public String getStart(){
        return this.start;
    }
    public String getFinish(){
        return this.finish;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setStart(String start){
        this.start = start;
    }
    public void setFinish(String finish){
        this.finish = finish;
    }

}
