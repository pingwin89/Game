package pl.pawc.game;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

public class Main extends SimpleApplication{
	
    public static void main(String[] args){
    	 Main app = new Main();
         app.start();
    }

	@Override
	public void simpleInitApp(){
		       
		DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-0.1f, -0.7f, -1.0f));
        rootNode.addLight(sun);
        
		Spatial dog = assetManager.loadModel("assets/Dog/Dog.j3o");	
        rootNode.attachChild(dog);
	
	}
    
}