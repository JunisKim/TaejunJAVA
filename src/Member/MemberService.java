package Member;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberService {
    public double calcAverageAge(List<Member> list) {


        int sumAge =0;
        for(Member a : list){
            sumAge += a.getAge();
        }
        return sumAge/list.size();
    }


    public static int howManyMembersWithLastName(List<Member> list, String name) {
        int count = 0;
        for (Member e : list) {


            if (e.getName().substring(0, 1).equals(name)) {
                //count += 1;
                count++;
            }
        }
        return count;
    }

    public static double calcAverageIdChar(List<Member> list) {
        int sum = 0;
        double average = 0;
        for (Member e : list) {
            sum += e.getEmail().length();
            average = sum / list.size();
        }

        return average;
    }
}

