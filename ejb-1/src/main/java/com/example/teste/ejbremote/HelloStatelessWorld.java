package com.example.teste.ejbremote;

import javax.ejb.Remote;

@Remote
public interface HelloStatelessWorld {
    String getHelloWorld();
}
