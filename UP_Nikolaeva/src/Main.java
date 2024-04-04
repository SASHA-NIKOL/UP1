import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static ArrayList<Talon> Tal = new ArrayList<>();
    static ArrayList<Pathient> Path = new ArrayList<>();

    public static void main(String[] args) {

        Administraator administraator = new Administraator();
        administraator.addPath(1, "Ivan", "Ivanov", "Ivanovich", "88005553535", "1234567876543", Path);
        administraator.addPath(2, "Danil", "Danilov", "Danilovich", "89533846838", "5678987654234", Path);
        administraator.addPath(3, "Ilya", "Nikitin", "Olegovich", "89505401272", "567899876545689", Path);
        administraator.addPath(4, "Sasha", "Nikolaeva", "Vladimirovna", "89533846838", "456788765876", Path);
        System.out.println("Количество зарегистрированных пациентов: " + Path.size());

        System.out.println("Удаляем пациента: " + Path.get(1).getName_path() + " " +Path.get(1).getSurname_path());
        administraator.DelPath(1, Path);
        System.out.println("Удаление успешно");
        System.out.println("Количество зарегистрированных пациентов: " + Path.size());



        administraator.addTal(1, 1, 1, "21.03.2024 16:00", Tal);
        administraator.addTal(2, 2, 2, "28.03.2024 15:00", Tal);
        administraator.addTal(3, 1, 3, "21.04.2024 12:00", Tal);
        System.out.println("Количество зарегистрированных талонов: " + Tal.size());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество талонов: ");
        int count = scanner.nextInt();
        int[] id_path = new int[count];
        int[] id_spech = new int[count];
        System.out.println("Введите данные для каждого человека:");
        for (int i = 0; i < count; i++) {

            System.out.print("Введите  id пациента " + (i+1) + ": ");
            id_path[i] = Integer.parseInt(scanner.next());

            System.out.print("Введите id врача специалиста " + (i+1) + ": ");
            id_spech[i] = Integer.parseInt(scanner.next());

        }

        System.out.println("Зарегистрированные талоны:");
        for (int i = 0; i < count; i++) {
            System.out.println("Талон " + (i+1) + ": Пациент - "  + id_path[i] + ", Врач - " + id_spech[i] + ", Время, когла был зарегистрирован талон: " + new Date());
        }
        System.out.println("Количество зарегистрированных талонов: " + (Tal.size() + count));
    }


}