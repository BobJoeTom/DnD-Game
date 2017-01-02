package com.brendenbrusberg.graphics;

import static org.lwjgl.glfw.GLFW.*;

import com.brendenbrusberg.Main;
import com.brendenbrusberg.graphics.Shader;
import com.brendenbrusberg.graphics.Texture;
import com.brendenbrusberg.graphics.VertexArray;
import com.brendenbrusberg.input.Input;
import com.brendenbrusberg.math.Matrix4f;
import com.brendenbrusberg.math.Vector3f;

public class Image {
	
	private Vector3f posistion = new Vector3f();
	private Matrix4f ml_matrix;
	
	private float width, height;
	private String texturePath;
	private Texture texture;
	private VertexArray mesh;
	private Shader shader;
	private float rot = 0f;
	
	public void create(){
		
		float[]vertices = new float[]{
			//x, y, z
				0.0f,  0.0f, 0.1f,
				0.0f, height, 0.1f,
				width, height, 0.1f,
				width,  0.0f, 0.1f,
				 
		};
		//Basically everything in gaming is made out of triangles, so indices stops from repeating vertices because their will be matching vertices with 2 triangles making 1 rectangle
		byte[] indicies = new byte[]{
				0, 1, 2,
				2, 3, 0
				//The triangles made^ with the vertices above
		};
		
		float[] tcs = new float[]{
				//Texture Coordinates of the vertices above
				0, 1,//For vertices 0
				0, 0,//For vertices 1
				1, 0,//For vertices 2
				1, 1 //For vertices 3
		};
		
		//Takes the values above passed into VertexArray class to create an openGL object for the texture
		mesh = new VertexArray(vertices, indicies, tcs);
		texture = new Texture(texturePath);
	}
	
	public void update(){
		
		/*if(Input.keys[GLFW.GLFW_KEY_LEFT])
			posistion.x -=0.1f;
		if(Input.keys[GLFW.GLFW_KEY_RIGHT])
			posistion.x +=0.1f;*/
		
		/*
		if (Input.isKeyDown(GLFW_KEY_SPACE)){
			//delta = -0.15f;
		}else{ 
			//delta += 0.01f;
		}
		
		if(Input.keys[GLFW.GLFW_KEY_UP])
			posistion.y +=0.1f;
		if(Input.keys[GLFW.GLFW_KEY_DOWN])
			posistion.y -=0.1f;
		
	
		if(Main.control ==true){
		if(Input.isKeyDown(GLFW_KEY_UP)){
			delta -=0.01f;
		}else if(!(Input.isKeyDown(GLFW_KEY_UP)) && delta < 0){
			delta +=0.01f;
		}
		
		if(Input.isKeyDown(GLFW_KEY_DOWN)){
			delta +=0.01f;
		}else if(!(Input.isKeyDown(GLFW_KEY_DOWN)) && delta > 0){
			delta -=0.01f;
		}
		}
		rot = -delta * 90.0f;
		
		posistion.y -= delta;
		
		if(Main.control == false){
			
		}
		*/
	}
	public void render(int x, int y){//x and y are grid locations on screen to render, used by map rendering:Intaking xStep and yStep
		setPosistion(new Vector3f(x,y,0));
		render();
	}
	
	public void render(){
		
		shader.enable();
		shader.setUniformMat4f("ml_matrix", Matrix4f.translate(posistion).multiply(Matrix4f.rotate(rot)));
		texture.bind();
		mesh.render();
		shader.disable();
		
	}
	
	public void render(Shader selectedShader){
		
		selectedShader.enable();
		selectedShader.setUniformMat4f("ml_matrix", Matrix4f.translate(posistion).multiply(Matrix4f.rotate(rot)));
		texture.bind();
		mesh.render();
		selectedShader.disable();
		
	}
	
	public Image(float x, float y){
		create();
		posistion.x = x;
		posistion.y = y;
		ml_matrix = Matrix4f.translate(posistion);
	}
	
	public String getTexturePath(){
		return texturePath;
	}
	
	public void setTeturePath(String texturePath){
		this.texturePath=texturePath;
		setTexture(texturePath);
	}
	public float getX(){
		return posistion.x;
	}
	
	public float getY(){
		return posistion.y;
	}
	
	public Matrix4f getModelMatrix(){
		return ml_matrix;
	}
	
	public VertexArray getMesh(){
		return mesh;
	}
	
	public Texture getTexture(){
		return texture;
	}
	
	public float getWidth(){
		return width;
	}
	
	public float getHeight(){
		return height;
	}

	public Vector3f getPosistion() {
		return posistion;
	}

	public void setPosistion(Vector3f posistion) {
		this.posistion = posistion;
	}

	public float getRot() {
		return rot;
	}

	public void setRot(float rot) {
		this.rot = rot;
	}

	public void setTexture(String texture) {
		this.texture = new Texture(texture);
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}
	
	public void setMesh(VertexArray mesh) {
		this.mesh = mesh;
	}
	
}
