package com.company;

public interface AbstractFactory<P> {
  P getProduct(String typeProduct) ;
}
