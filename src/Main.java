import Clients.*;
import ClinicInfo.Doctor;
import ClinicInfo.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Кузя", new Owner("Смоляков Дмитрий"),
                LocalDate.of(2019, 7, 12), new Illness("Панлейкопения"));

        Animal dog = new Dog("Арчи", new Owner("Иванов Александр"),
                LocalDate.of(2021, 7, 1), new Illness("Аденовироз"));

        Animal duck = new Duck("Чеппи", new Owner("Хорина Татьяна"),
                LocalDate.of(2023, 5, 13), new Illness("Паратиф"));

        Animal fish = new Fish(("Бусинка"), new Owner("Васильев Андрей"),
                LocalDate.of(2023, 8, 17), new Illness("Сапролегниоз"));

        Animal gull = new Gull(("Чарли"), new Owner("Семёнов Семён"),
                LocalDate.of(2020, 3, 23), new Illness("Перелом крыла"));

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(fish);
        animals.add(gull);

        Doctor doctor = new Doctor("Петров Иван Иванович",
                LocalDate.of(1986, 4, 6), "Хирург", 731);
        Doctor doctor1 = new Doctor("Петрова Мария Васильевна",
                LocalDate.of(1973, 9, 13), "Травмотолог", 561);
        Doctor doctor2 = new Doctor("Кузьмин Роман Андреевич",
                LocalDate.of(1988, 10, 12), "УЗИст", 671);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor);
        doctors.add(doctor1);
        doctors.add(doctor2);

        Nurse nurse = new Nurse("Криворот Елена Владимировна",
                LocalDate.of(1981, 12, 30), "Медсестра", 144);
        Nurse nurse1 = new Nurse("Баринова Светлана Евгеньевна",
                LocalDate.of(1989, 1, 17), "Медсестра", 149);
        List<Nurse> nurses = new ArrayList<>();
        nurses.add(nurse);
        nurses.add(nurse1);

        System.out.println("Пациент " + dog + " доктор " + doctor + " диагноз " + doctor.getDiagnos(dog));
        System.out.println();
        System.out.println("Пациент " + cat + " медсестра " + nurses + " диагноз " + nurse.getProcedure(cat));
    }

}