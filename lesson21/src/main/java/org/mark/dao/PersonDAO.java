package org.mark.dao;

import org.mark.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    //Вместо базы данных
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Sasha"));
        people.add(new Person(++PEOPLE_COUNT, "Nikita"));
        people.add(new Person(++PEOPLE_COUNT, "Oleg"));
        people.add(new Person(++PEOPLE_COUNT, "Mark"));
    }



    public List<Person> index(){

        return people;
    }

    public Person show(int id){

        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}
