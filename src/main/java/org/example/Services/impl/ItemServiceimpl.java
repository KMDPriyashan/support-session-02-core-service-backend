package org.example.Services.impl;

import org.example.Entity.ItemEntity;
import org.example.Model.ItemDTO;
import org.example.Repository.ItemRepository;
import org.example.Services.ItemService;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ItemServiceimpl implements ItemService {

    ItemRepository repository;


    @Override
    public boolean addItem(ItemDTO itemDTO) {
        ModelMapper modelMapper = new ModelMapper();
        ItemEntity entity = modelMapper.map(itemDTO, ItemEntity.class);
        repository.save(entity);
        return true;
    }

    @Override
    public List<ItemDTO> getAllItem() {
        Iterable<ItemEntity> all = repository.findAll();
        List<ItemDTO> itemDTOList = new ArrayList<>();
        all.forEach(itemEntity ->
                itemDTOList.add(new ModelMapper().map(itemEntity, ItemDTO.class)));
        return itemDTOList;
    }

    @Override
    public ItemDTO searchById(Integer id) {
        return new ModelMapper().map(repository.findById(id), ItemDTO.class);
    }

    @Override
    public boolean deleteById(Integer id) {
        repository.deleteById(id);
        return false;
    }
}
