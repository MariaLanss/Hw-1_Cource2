import java.util.Random;
public class Main {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindor harry = generateGryffindorStudent("Гарри Поттер");
        Gryffindor hermione = generateGryffindorStudent("Гермиона Грейнджер");
        Gryffindor ron = generateGryffindorStudent("Рон Уизли");

        Slytherin draco = generateSlytherinStudent("Драко Малфой");
        Slytherin graham = generateSlytherinStudent("Грэхэм Монтегю");
        Slytherin gregory = generateSlytherinStudent("Грегори Гойл");

        Hufflepuff zechariah = generateHufflepuffStudent("Захария Смит");
        Hufflepuff cedric = generateHufflepuffStudent("Седрик Диггори");
        Hufflepuff justin = generateHufflepuffStudent("Джастин Финч-Флетчли");

        Ravenclaw zhou = generateRavenclawStudent("Чжоу Чанг");
        Ravenclaw padma = generateRavenclawStudent("Падма Патил");
        Ravenclaw marcus = generateRavenclawStudent("Маркус Белби");

        harry.print();
        hermione.print();
        ron.print();

        draco.print();
        graham.print();
        gregory.print();

        zechariah.print();
        cedric.print();
        justin.print();

        zhou.print();
        padma.print();
        marcus.print();

        harry.compareGryffindor(hermione);
        hermione.compareGryffindor(ron);
        harry.compareGryffindor(ron);

        draco.compareSlytherin(graham);
        draco.compareSlytherin(gregory);
        graham.compareSlytherin(gregory);

        zechariah.compareHufflepuff(cedric);
        zechariah.compareHufflepuff(justin);
        cedric.compareHufflepuff(justin);

        zhou.compareRavenclaw(padma);
        marcus.compareRavenclaw(padma);
        padma.compareRavenclaw(zhou);

        harry.compareHogwarts(cedric);
    }

    private static Gryffindor generateGryffindorStudent(String name) {
        return new Gryffindor (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slytherin generateSlytherinStudent(String name) {
        return new Slytherin (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Hufflepuff generateHufflepuffStudent(String name) {
        return new Hufflepuff (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Ravenclaw generateRavenclawStudent(String name) {
        return new Ravenclaw (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}