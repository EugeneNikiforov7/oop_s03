package Apteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class  IteratorComponent implements Iterator<PharmancyComponent>{
    private List<PharmancyComponent> components;
    private int index;
    private Pharmacy pharmacy;

    public IteratorComponent(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        components = pharmacy.getComponents();
        index = pharmacy.getIndex();

    }
    //    private List<PharmancyComponent> components = new ArrayList<>();
//    private int index = 0;

//    @Override
//    public Iterator iterator() {
//        return new Iterator() {
//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//            }
//
//            @Override
//            public Object next() {
//                return components.get(index++);
//            }
//        };
//    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public PharmancyComponent next() {
        return components.get(index++);
    }
}
