package com.iLoong;
import com.coco.launcher.R;

public final class RR {
    public static R.anim anim;
    public static R.array array;
    public static R.attr attr;
    public static R.bool bool;
    public static R.color color;
    public static R.dimen dimen;
    public static R.drawable drawable;
    public static  R.id id;
    public static R.integer integer;
    public static R.layout layout;
    public static R.string string;
    public static R.style style;
    public static R.styleable styleable;
    public static R.xml xml;
    public static R.raw raw;
    
    public static Class getStringClass()
    {
    	return R.string.class;
    }
    
    public static final String getDBAuthority()
    {
    	return "com.coco.launcher.app";
    }
    public static final String getPackageName()
    {
    	return "com.coco.launcher";
    }
}