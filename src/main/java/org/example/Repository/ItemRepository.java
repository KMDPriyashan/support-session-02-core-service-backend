package org.example.Repository;

import org.example.Entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends
        CrudRepository<ItemEntity, Integer> {
}
