package com.cooee.widget3D.JewelWeather.View;

import android.content.Context;
import android.util.Log;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.cooee.widget3D.JewelWeather.Common.WeatherHelper;
import com.iLoong.launcher.UI3DEngine.adapter.CooGdx;
import com.iLoong.launcher.UI3DEngine.adapter.Mesh;
import com.iLoong.launcher.Widget3D.Cache;
import com.iLoong.launcher.Widget3D.MainAppContext;
import com.iLoong.launcher.min3d.Object3DBase;

public class ClockMarkView extends PluginViewObject3D {
	private static final String WATCH_MARK_OBJ = "widget_clock_mark.obj";
	private Cache<String, Mesh> mMeshCache = null;
	private MainAppContext mAppContext;
	public CooGdx cooGdx;
	
	public ClockMarkView(String name, MainAppContext appContext,
			TextureRegion region) {
		super(appContext, name, region, WATCH_MARK_OBJ);
		mAppContext = appContext;
		this.setSize(WidgetWeather.MODEL_WIDTH,WidgetWeather.MODEL_HEIGHT);
		this.setMoveOffset(WidgetWeather.MODEL_WIDTH /2 +WidgetWeather.mClock_Center_Offset_X, 
				WidgetWeather.MODEL_HEIGHT /2,
				0);
		this.setDepthMode(true);
		this.build();
	}

	/*
	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		if (shader == null) {
			shader = createDefaultShader();
		}
		shader.begin();
		combinedMatrix.set(batch.getProjectionMatrix()).mul(
				batch.getTransformMatrix());
		shader.setUniformMatrix("u_projTrans", combinedMatrix);
		shader.setUniformi("u_texture", 0);
		Color cur_color = new Color(color);
		cur_color.a *= parentAlpha;
		shader.setUniformf("u_color", cur_color);

		if (true) {
			Gdx.gl.glDepthMask(true);
			Gdx.gl.glEnable(GL10.GL_DEPTH_TEST);
			// Gdx.gl.glClear(GL10.GL_DEPTH_BUFFER_BIT); // 清除屏幕及深度缓存
			Gdx.gl.glDepthFunc(GL10.GL_LEQUAL);
		}
		
		if (region.getTexture() != null) {
			region.getTexture().bind();
		}
		Gdx.gl.glEnable(GL10.GL_BLEND);
		Gdx.gl.glBlendFunc(1,GL10.GL_ONE_MINUS_SRC_ALPHA);
	

		if (faces != null)
			mesh.setIndices(faces.getIndices());
		if (vertices != null)
			mesh.setVertices(vertices.getVertices());
		if (Gdx.graphics.isGL20Available()) {
			mesh.render(shader, GL10.GL_TRIANGLES);
		} else {
			mesh.render(GL10.GL_TRIANGLES);
		}
		
		if (true) {
			Gdx.gl.glDisable(GL10.GL_DEPTH_TEST);
			// Gdx.gl.glClear(GL10.GL_DEPTH_BUFFER_BIT); // 清除屏幕及深度缓存
			Gdx.gl.glDepthMask(false);
		}
		shader.end();	
	}
	*/
	
	
}
