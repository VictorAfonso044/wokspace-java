package com.example.teste.ejbremote;

import javax.ejb.Remote;

@Remote
public interface HelloStatefulWorld {
    int howManyTimes();
    String getHelloWorld();
}
 
