package com.example.defaultMethod;

public interface ISample {
     public default String newMethod()
     {
          return "new method value";
     }

     void check();

     void enforce();


}
