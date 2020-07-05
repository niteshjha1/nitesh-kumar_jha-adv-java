package fr.epita.exam.nitesh_kumar_jha_adv_java;

import java.util.Comparator;

public class WeightComparator implements Comparator {
    public int compare(Object o1,Object o2)
    {
        Person person=(Person) o1;
        Person person1=(Person) o2;
        if(person.getWeight()==person1.getWeight())
            return 0;
        else if(person.getWeight()>person1.getWeight())
            return 1;
        else
            return -1;
    }
}
