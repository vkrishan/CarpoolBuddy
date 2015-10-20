package model;

/**
 * Created by vkrishax on 9/30/15.
 * This is a POJO class for Navigation drawer Items
 */
public class NavDrawerItem {

    private boolean Notify;
    private String Title;

    // Constructor1
    public NavDrawerItem(){
    }

    // Constructor2
    public NavDrawerItem(boolean Notify, String Title){
        this.Notify = Notify;
        this.Title = Title;
    }

    // Setters and Getters

    public void setNotify(boolean Notify){
        this.Notify = Notify;
    }

    public boolean isNotify(){
        return Notify;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public String getTitle(){
        return Title;
    }

}
