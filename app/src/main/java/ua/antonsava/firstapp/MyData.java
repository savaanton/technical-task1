package ua.antonsava.firstapp;

/**
 * Created by Apple on 01.04.2016.
 */
public class MyData { //[Comment] You don't need this class. Use List of Integers, or int[]
    int myPic; //[Comment] Your pic? Use correct names. Wrong visibility modifier.

    public MyData(int myPic) {
        this.myPic = myPic;
    }

    public void setMyPic(int myPic) {
        this.myPic = myPic;
    }

    public int getMyPic() {
        return myPic;
    }
}
