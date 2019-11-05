//package imt2018083;

//import imt2018083.animation.Scene;
//import imt2018083.animation.SceneObject;
//import imt2018083.animation.BBox;
import java.util.Iterator;
import java.util.ArrayList;
public class Scene_d extends Scene{
    public Scene_d(){
        super();
    }
    protected void checkScene(){
        ArrayList<SceneObject> actors=this.getActors();
        ArrayList<SceneObject> obstacles=this.getObstacles();
        Iterator<SceneObject> iterator_actor1=actors.iterator();
        for(;iterator_actor1.hasNext();){
            SceneObject sceneobject1= iterator_actor1.next();
            BBox bbox1=sceneobject1.getBBox();
            Iterator<SceneObject> iterator_actor2=actors.iterator();
            for(;iterator_actor2.hasNext();){
                SceneObject sceneobject2 = iterator_actor2.next();
                if(!sceneobject2.equals(sceneobject1)){
                    BBox bbox2 =sceneobject2.getBBox();
                    if(bbox2.intersects(bbox1)){
                        //sceneobject1.flagit();
                        //sceneobject2.flagit();
                    }
                }
            }
            Iterator<SceneObject> iterator_obstacles=obstacles.iterator();
            for(;iterator_obstacles.hasNext();){
                SceneObject sceneobject3 = iterator_obstacles.next();
                if(!sceneobject3.equals(sceneobject1)){
                    BBox bbox3 = sceneobject3.getBBox();
                    if(bbox3.intersects(bbox1)){
                        //sceneobject1.flagit();
                        //sceneobject3.flagit();
                    }
                }
            }
        }
        Iterator<SceneObject> iterator_obstacles1=obstacles.iterator();
        for(;iterator_obstacles1.hasNext();){
            SceneObject sceneobject1= iterator_obstacles1.next();
            BBox bbox1=sceneobject1.getBBox();
            Iterator<SceneObject> iterator_actor2=actors.iterator();
            for(;iterator_actor2.hasNext();){
                SceneObject sceneobject2 = iterator_actor2.next();
                if(!sceneobject2.equals(sceneobject1)){
                    BBox bbox2 =sceneobject2.getBBox();
                    if(bbox2.intersects(bbox1)){
                        //sceneobject1.flagit();
                        //sceneobject2.flagit();
                    }
                }
            }
            Iterator<SceneObject> iterator_obstacles=obstacles.iterator();
            for(;iterator_obstacles.hasNext();){
                SceneObject sceneobject3 = iterator_obstacles.next();
                if(!sceneobject3.equals(sceneobject1)){
                    BBox bbox3 = sceneobject3.getBBox();
                    if(bbox3.intersects(bbox1)){
                        //sceneobject1.flagit();
                        //sceneobject3.flagit();
                    }
                }
            }
        }
    }
}
