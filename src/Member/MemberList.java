package Member;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberList {
    public static void main(String[] args) {

        Member student1 = new Member("김태준", 27, "010-6256-7334", "kim19911211@gmail.com");
        Member student2 = new Member("이가원", 25, "01064395943", "dlrkdnjs1211@gmail.com");
        Member student3 = new Member("임준성", 20, "010-9972-8210", "wnstjd9972@gmail.com");
        Member student4 = new Member("류관리", 25, "010-2478-1378", "sona.ria.sss@gmail.com");
        Member student5 = new Member("류승아", 25, "010-9377-6928", "loveyou_06@naver.com");
        Member student6 = new Member("김세원", 27, "01047346373", "sewon0613@naver.com");
        Member student7 = new Member("이진석", 26, "010-2979-0767", " jins920409@gmail.com");
        Member student8 = new Member("박태준", 23, "010-6256-7334", "kim19911211@gmail.com");
        Member student9 = new Member("신태준", 22, "010-6256-7334", "kim19911211@gmail.com");
        Member student10 = new Member("오태준", 21, "010-6256-7334", "kim19911211@gmail.com");
        Member student11 = new Member("강태준", 24, "010-6256-7334", "kim19911211@gmail.com");

        List<Member> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);

        System.out.println(student1.getName());

        MemberService result1 = new MemberService();
        double howAverageOld = result1.calcAverageAge(list);
        System.out.println("나이의 평균은 =" + howAverageOld + "입니다.");

        MemberService result2 = new MemberService();
        String name = "류";
        int howMany = result2.howManyMembersWithLastName(list,name);
        System.out.println("성이 "+name+"씨인 사람 수의 합은 =" + howMany + "입니다.");

        MemberService result3 = new MemberService();
        double average = result3.calcAverageIdChar(list);
        System.out.println("Id길이의 평균의 합은= " + average);
    }


}
