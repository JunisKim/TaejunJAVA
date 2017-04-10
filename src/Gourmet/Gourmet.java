package Gourmet;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class  Gourmet {

    private String title;
    private String mainMenu;
    private int score;

    public Gourmet(String title, String mainMenu, int score){
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
    }

    //getter, accessor
    public String getTitle() {
        return this.title;
    }
    //setter, mutator
    public void setTitle(String t){
        this.title = t;
    }

    public String getMainMenu() {
        return this.mainMenu;
    }
    public void setMainMenu(String e){
        this.mainMenu = e;
    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int n){
        this.score = n;
    }
}
