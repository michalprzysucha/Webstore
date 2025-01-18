package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Cart;
import com.packt.webstore.domain.repository.CartRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryCartRepository implements CartRepository {
    private Map<String, Cart> listOfCarts;

    public InMemoryCartRepository() {
        this.listOfCarts = new HashMap<>();
    }

    @Override
    public Cart create(Cart cart) {
        if (listOfCarts.containsKey(cart.getCartId())){
            throw new IllegalArgumentException((("Nie można utworzyć koszyka. Koszyk o wskazanym " +
                    "id (%s) już istnieje.").formatted(cart.getCartId())));
        }
        listOfCarts.put(cart.getCartId(), cart);
        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        if (!listOfCarts.containsKey(cartId)){
            throw new IllegalArgumentException((("Nie można zaktualizować koszyka. Koszyk o wskazanym " +
                    "id (%s) nie istnieje.").formatted(cartId)));
        }
        listOfCarts.put(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
        if (!listOfCarts.containsKey(cartId)){
            throw new IllegalArgumentException((("Nie można usunąć koszyka. Koszyk o wskazanym " +
                    "id (%s) nie istnieje.").formatted(cartId)));
        }
        listOfCarts.remove(cartId);
    }
}
