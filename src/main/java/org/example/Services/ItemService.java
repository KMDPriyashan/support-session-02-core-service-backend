package org.example.Services;

import org.example.Model.ItemDTO;

import java.util.List;

public interface ItemService {
    public boolean addItem(ItemDTO itemDTO);
    List<ItemDTO> getAllItem();
    ItemDTO searchById(Integer id);
    boolean deleteById(Integer id);

}
