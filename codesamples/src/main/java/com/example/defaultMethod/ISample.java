package com.example.defaultMethod;

public interface ISample {
      default String newMethod()
     {
          return "new method value";
     }

     void check();

     void enforce();


}
