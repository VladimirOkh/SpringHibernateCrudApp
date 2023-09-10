package ru.okhremenko.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.okhremenko.springcourse.models.Item;
import ru.okhremenko.springcourse.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<> {

    List<Person> findByOwner(Person owner);

    List<Item> findByItemName(String itemName);

}
