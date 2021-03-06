package com.iLoong.launcher.Widget3D;

import android.content.Context;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidApplication;

public class MainAppContext {
	public Context mContainerContext;
	public Context mWidgetContext;
	public AndroidApplication mGdxApplication;
	public Gdx gdx;
	public String mThemeName = "";
	public MainAppContext(Context containerContext, Context widgetContext,
			AndroidApplication gdxApplication, Gdx gdx) {
		this.mContainerContext = containerContext;
		this.mWidgetContext = widgetContext;
		this.mGdxApplication = gdxApplication;
		this.gdx = gdx;
	}
}
