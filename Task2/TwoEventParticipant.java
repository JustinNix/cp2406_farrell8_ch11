public class TwoEventParticipant {
    public static void main(String[] args) {
        Participant p1 = new Participant("alex", 18, "rupertswood");
        Participant p2 = new Participant("alex", 18, "rupertswood");

        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
    }
}
