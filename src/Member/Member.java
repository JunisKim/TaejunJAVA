package Member;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Member {
    private String name;
    private int age;
    private String hpnum;
    private String email;

    public Member() {}

    public Member(String name, int age, String hpnum, String email){
            this.setName(name);
            this.setAge(age);
            this.setHpnum(hpnum);
            this.setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHpnum() {
        return hpnum;
    }

    public void setHpnum(String hpnum) {
        this.hpnum = hpnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}