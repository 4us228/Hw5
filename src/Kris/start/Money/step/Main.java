package Kris.start.Money.step;

public class Main {

    public static void main(String[] args) {
        Employee worker = new Employee("Putin Vladimir Vladimirovich", "Federation manager", "Putin@mail.kreml", 79035024200l, 2147483647, 68);
        worker.info();
        System.out.println();


        Employee[] workers = new Employee[5];
        workers[0] = new Employee("Putin Vladimir Vladimirovich", "Federation manager", "Putin@mail.kreml", 79035024200l, 2147483647, 68);
        workers[1] = new Employee("Medvedev Dmitry Anatolievich","Vladimirs right hand","Medvedev@mail.kreml",79035054200l,50000000,55);
        workers[2] = new Employee("Lenin Vladimir Ilyich","Communism maker","revolution@mail.comunism",790306101917l,191700,50);
        workers[3] = new Employee("Captain Jack Sparrow","Captain","blackperl@mail.pirate",790345745811l, 15000,35);
        workers[4] = new Employee("Mavrodi Sergey Panteleivich","Money maker","MMMcool@mail.mmm",790354618742l,9999999,50);
        for (int i = 0; i <workers.length; i++) {
            if (workers[i].age>40) {

            System.out.println(workers[i]);
        }
    }

}
}
