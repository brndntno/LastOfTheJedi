public class Main {
    public static void main(String[] args) {
        ForceUser user = new ForceUser("Anakin", 20000, 10000);
        ForceUser user2 = new ForceUser("Ahsoka", 15000, 10000);

        user.forcePush(1000, user2);
        System.out.println(user2.getHealth());
    }
}
