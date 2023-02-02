public class Friend {
    private String username;
    private boolean status; // true - online , false - offline

    public Friend (String name, boolean online){
        this.username = name;
        this.status = online;
    }


    public Friend (String name ) {
        this(name, false);
    }

    public void setStatue(boolean online){
        this.status = online;
    }

    @Override
    public String toString(){ // extending the object class without telling you
        String s = this.status ? "Online" : "Offline"; // is a simplier if statement if true- online ,  false - offline
        return username + " " + s;
    }

}// end of friend class
