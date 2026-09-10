package com.preps.designpatterns;

public class Singleton {
    public static void main(String[] args) {
        SingletonNormal s = SingletonNormal.getInstance();
        SingletonNormal s2 = SingletonNormal.getInstance();
        String singletonMessage = s.doSomething();
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(singletonMessage);
    }
}

// This implementation gives singleton instance but this is not thread safe
class SingletonNormal {
    private static SingletonNormal instance;

    private SingletonNormal() {
        System.out.println("Singleton now initialized");
    }

    public static SingletonNormal getInstance() {
        if (instance == null) {
            instance = new SingletonNormal();
        }
        return instance;
    }

    public String doSomething() {
        return "Doing something!!";
    }
}

// This implementation of singleton gives a thread safe result
class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null)
            instance = new SingletonThreadSafe();
        return instance;
    }

    public static String message() {
        return "This is thread safe implementation";
    }
}

// This is a thread safe double check implementation
class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
