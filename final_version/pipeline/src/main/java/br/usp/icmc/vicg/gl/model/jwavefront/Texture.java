package br.usp.icmc.vicg.gl.model.jwavefront;


public class Texture {

    public Texture(String name) {
        this.name = name;
    }

    public void dump() {
        System.out.println("Texture name: " + name);
    }

    public String name;
    public com.jogamp.opengl.util.texture.Texture texturedata; //texture
}
