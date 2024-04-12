public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(4, 5);
        Triangolo triangolo = new Triangolo(3,4);

        System.out.println("L'area del rettangolo è : " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è : " + triangolo.calcolaArea());

    }
}