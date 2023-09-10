package ru.okhremenko.springcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.okhremenko.springcourse.models.Item;
import ru.okhremenko.springcourse.models.Person;
import ru.okhremenko.springcourse.repositories.ItemsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemsService {

    private final ItemsRepository itemsRepository;

    @Autowired
    public ItemsService(ItemsRepository itemsRepository){
        this.itemsRepository = itemsRepository;
    }

    public List<Item> findByItemName(String itemName) {
        return itemsRepository.findByItemName(itemName);
    }

    public List<Person> findByOwner(Person owner) {
        return itemsRepository.findByOwner(owner);
    }

    public void test() {
        System.out.println("Testing here with debug. Inside Hibernate Transaction");
    }
}
