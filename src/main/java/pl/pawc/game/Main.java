package pl.pawc.game;

import com.jme3.animation.AnimChannel;
import com.jme3.animation.AnimControl;
import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

public class Main extends SimpleApplication{
	
	private AnimControl control;
	private AnimChannel channel;
	
    public static void main(String[] args){
    	 Main app = new Main();
         app.start();
    }

	@Override
	public void simpleInitApp(){
		
		viewPort.setBackgroundColor(ColorRGBA.Blue);
		flyCam.setMoveSpeed(50);
		       
		DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-1.0f, -1.0f, -1.0f));
        rootNode.addLight(sun);

		Node dog = (Node) assetManager.loadModel("assets/Dog/Dog.j3o");	
		
		Node armature = (Node) dog.getChild("Armature");
	    Node Dog = (Node) armature.getChild(("Dog"));
	    control = Dog.getControl(AnimControl.class);
		
	    channel = control.createChannel();
	    channel.setAnim("ArmatureAction");
	    channel.setLoopMode(LoopMode.Loop);
	    
        rootNode.attachChild(dog);
	
	}
    
}