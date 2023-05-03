import java.util.*;

class Members implements Comparable<Members> {
    private String member;
    private int age;

    public Members(int age, String member ) {
        this.age = age;
        this.member = member;
    }
    @Override
    public int compareTo(Members members) {
        if(members.age < age) {
            return 1;
        }else if (members.age > age) {
            return -1;
        }
        return 0;
    }
    @Override
    public String toString() {

        return age + "" + member;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter  = sc.nextInt();

        ArrayList<Members> list = new ArrayList<>();
        for(int i= 0; i < counter; i++) {
            int age = sc.nextInt();
            String name = sc.nextLine();
            list.add(new Members(age, name));
        }



        Collections.sort(list);
        for (Members member : list) {
            System.out.println(member);
        }



    }
}