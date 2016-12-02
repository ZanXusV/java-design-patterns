# Singleton Design Pattern
## 1   Singleton Pattern
Sometimes it’s important for some classes to have exactly one instance. There are many objects we only need one instance
of them and if we, instantiate more than one, we’ll run into all sorts of problems like incorrect program behavior, overuse of
resources, or inconsistent results.

You may require only one object of a class, for example, when you are a creating the context of an application, or a thread
manageable pool, registry settings, a driver to connect to the input or output console etc. More than one object of that type
clearly will cause inconsistency to your program.

The Singleton Pattern ensures that a class has only one instance, and provides a global point of access to it. However, although
the Singleton is the simplest in terms of its class diagram because there is only one single class, its implementation is a bit trickier.

<div align="center"><img src="images/singleton1.png"></div>

In this lesson, we will try different ways to create only a single object of the class and will also see how one way is better than
the other.

## 2   How to create a class using the Singleton Pattern
There could be many ways to create such type of class, but still, we will see how one way is better than the other.

Let’s start with a simple way.

What if, we provide a global variable that makes an object accessible? For example:

```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 9:49 PM
 */
public class SingletonEager {

    public static SingletonEager sc = new SingletonEager();

}
```

As we know, there is only one copy of the static variables of a class, we can apply this. As far as, the client code is using this sc
static variable its fine. But, if the client uses a new operator there would be a new instance of this class.

To stop the class to get instantiated outside the class, let’s make the constructor of the class as private.

```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 9:49 PM
 */
public class SingletonEager {

    public static SingletonEager sc = new SingletonEager();
    private SingletonEager() {
    }
    
}
```

Is this going to work? I think yes. By keeping the constructor private, no other class can instantiate this class. The only way to
get the object of this class is using the sc static variable which ensures only one object is there.

But as we know, providing a direct access to a class member is not a good idea. We will provide a method through which the sc
variable will get access, not directly.

```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 9:49 PM
 */
public class SingletonEager {

    private static SingletonEager sc = new SingletonEager();
    private SingletonEager() {}
    public static SingletonEager getInstance(){
        return sc;
    }
}
```

So, this is our singleton class which makes sure that only one object of the class gets created and even if there are several requests,
only the same instantiated object will be returned.

The one problem with this approach is that, the object would get created as soon as the class gets loaded into the JVM. If the
object is never requested, there would be an object useless inside the memory.

It’s always a good approach that an object should get created when it is required. So, we will create an object on the first call and
then will return the same object on other successive calls.

```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 10:21 PM
 */
public class SingletonLazy {

    private static SingletonLazy sc = null;
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        if (sc==null){
            sc=new SingletonLazy();
        }
        return sc;
    }
}
```

In the getInstance() method, we check if the static variable sc is null, then instantiate the object and return it. So, on the
first call when sc would be null the object gets created and on the next successive calls it will return the same object.

This surely looks good, doesn’t it? But this code will fail in a [multi-threaded environment](https://www.javacodegeeks.com/2015/09/java-concurrency-essentials.html). Imagine two threads concurrently
accessing the class, thread t1 gives the first call to the getInstance() method, it checks if the static variable sc is null and
then gets interrupted due to some reason. Another thread t2 calls the getInstance() method successfully passes the if check
and instantiates the object. Then, thread t1 gets awake and it also creates the object. At this time, there would be two objects of
this class.

To avoid this, we will use the synchronized keyword to the getInstance() method. With this way, we force every thread
to wait its turn before it can enter the method. So, no two threads will enter the method at the same time. The synchronizedJava Design Patterns
comes with a price, it will decrease the performance, but if the call to the getInstance() method isn’t causing a substantial
overhead for your application, forget about it. The other workaround is to move to eager instantiation approach as shown in the
previous example.

```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 10:28 PM
 */
public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded sc = null;
    private SingletonLazyMultithreaded(){}
    public static synchronized SingletonLazyMultithreaded getInstance(){
        if (sc==null){
            sc=new SingletonLazyMultithreaded();
        }
        return sc;
    }
}
```

But if you want to use synchronization, there is another technique known as “double-checked locking” to reduce the use of
synchronization. With the double-checked locking, we first check to see if an instance is created, and if not, then we synchronize.
This way, we only synchronize the first time.

```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 10:31 PM
 */
public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if (sc==null){
            synchronized (SingletonLazyDoubleCheck.class){
                if (sc==null){
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}
```

Apart from this, there are some other ways to break the singleton pattern.

* If the class is Serializable.
* If it’s Clonable.
* It can be break by Reflection.
* And also if, the class is loaded by multiple class loaders.

The following example shows how you can protect your class from getting instantiated more than once.
```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author root
 * @create 2016-12-02 11:11 PM
 */
public class Singleton implements Serializable {

    private static Singleton sc = new Singleton();
    private Singleton(){
        if (sc!=null){
            throw new IllegalStateException("Already created");
        }
    }

    public static Singleton getInstance(){
        return sc;
    }

    private Object readResolve() throws ObjectStreamException{
        return sc;
    }

    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, can't be cloned");
    }

    private static Class getClass(String className) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader==null){
            classLoader = Singleton.class.getClassLoader();
        }
        return classLoader.loadClass(className);

    }

}
```

* Implement the readResolve() and writeReplace() methods in your singleton class and return the same object through
them.
* You should also implement the clone() method and throw an exception so that the singleton cannot be cloned.
* An "if condition" inside the constructor can prevent the singleton from getting instantiated more than once using reflection.
* To prevent the singleton getting instantiated from different class loaders, you can implement the getClass() method. The
   above getClass() method associates the classloader with the current thread; if that classloader is null, the method uses the
   same classloader that loaded the singleton class.
   
Although we can use all these techniques, there is one simple and easier way of creating a singleton class. As of JDK 1.5, you
can create a singleton class using enums. The Enum constants are implicitly static and final and you cannot change their values
once created.

```java
package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 11:22 PM
 */
public class SingletonEnum {

    public enum SingleEnum{
        SINGLE_ENUM;
    }
}
```

You will get a compile time error when you attempt to explicitly instantiate an Enum object. As Enum gets loaded statically, it is
thread-safe. The clone method in Enum is final which ensures that enum constants never get cloned. Enum is inherently serial-
izable, the serialization mechanism ensures that duplicate instances are never created as a result of deserialization. Instantiation
using reflection is also prohibited. These things ensure that no instance of an enum exists beyond the one defined by the enum
constants.

## 3   When to use Singleton
* There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point.
* When the sole instance should be extensible by sub-classing, and clients should be able to use an extended instance without
  modifying their code.