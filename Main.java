package Apteca;

//https://github.com/AntonTokmakov/oop-seminar2.git
// telegram @hypnoZzz
/*Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

    Создайте несколько экземпляров Pharmacy, причем, чтобы среди них было хотя бы два экземпляра с полностью идентичными значениями полей.

    Сделать так, чтобы после выполнения кода ниже, в сете result были только уникальные объекты.
    Set<Pharmacy> result = new HashSet<>(множество из нескольких лекарств);
    System.out.println(result.size()); // тут вывод должен быть равен количеству УНИКАЛЬНЫХ экземпляров Pharmacy!

    Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo()
    подсказка: можно добавить, а можно не добавлять в класс поля;
ссылка на статью о equals и hashCode: https://javarush.com/groups/posts/2179-metodih-equals--hashcode-praktika-ispoljhzovanija
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PharmancyComponent azitroment = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmancyComponent water = new Water("Water", "10 Мг", 20);
        PharmancyComponent water2 = new Water("Water", "10 Мг", 20);

        List<PharmancyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);
        System.out.println(pharmancyComponents);
        Collections.sort(pharmancyComponents);
        System.out.println(pharmancyComponents);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(water);

        for (PharmancyComponent comp: pharmacy1) {
            System.out.println(comp.getName());
        }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);

//        Iterator<PharmancyComponent> iterator = pharmacy1;

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        while (((Iterator<PharmancyComponent>) pharmacy1).hasNext()) {
//            System.out.println(((Iterator<PharmancyComponent>) pharmacy1).next());
//        }

    }
}