public class Second {
    public static void main(String[] args) {
        int catet1 = 3;
        int catet2 = 4;
        double c = Math.sqrt((catet1*catet1)+(catet2*catet2));
        double P = catet1 + catet2 + c;
        double S = 0.5 * catet1 * catet2;
        System.out.println("площа прмокутного трикутника: " + S);
        System.out.println("периметр прямокутного трикутника: " + P);
    }
}
