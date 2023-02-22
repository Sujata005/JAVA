ABC.cpp -> g++
abc.out
abc.exe
./abc.outabc.exe


abc.java -> javac abc.java [PC1]
abs.obj, abc.class[Byte]

JRE [Byte->M/C code]

java abc.obj[PC2]   //Integrated with JRE

c/c++ are dependent on system architecture
Meanwhile java is platform independent

c:Program file->java->JRE

// Miltiple Inheritance in c++ uses colon(:) meanwhile java uses keyword 'extends'

ABC extends P[class]
ABC implements A,B,C[interfaces]




Features of Java:
    - Simple
        ~ Syntax is quite simple, clean and easy to understand
        ~ Based on cpp programming
        ~ Removed pointers and operator overloading
        ~ Automatic garbage collection
  
    - Object Oriented
        ~ Object
        ~ Class
        ~ Inheritance
        ~ Polymorphism
        ~ Abstraction
        ~ Encapsulation
        ~ Everything in Java is an object
        
    - Robust
        ~ Compile time error checking and runtime checking
        ~ Provide automatic Garbage collector which gets rid of object which are not being used
        ~ Uses strong memory management
        ~ Lack of pointers avoids security problems
        ~ Exception handling and type checking mechanism
        
    -Platform Independent 
      ~ Unlike other programming language like c,cpp etc. which are compiled into platform specific machines. Java is gauranteed to be write once and run anywhere language.
      ~ On complilation java program is compiled into byte code.
      ~ This byte code is platform independent and can be run in any machine, plus this byte code format also provide security.
      ~ Any machine with JRE can run java code.
      ~         PLATFORMS                                     CLASS FILE
               /        \                                   /     |     \
             /            \                                /      |       \
        HARDWARE       SOFTWARE                       MAC/OS   WINDOWS    LINUX
        BASED           BASED                         JVM       JVM         JVM
       /      \
      /        \
   RUNTIME    API(Application Programming Interface)
 ENVIRONMENT
      
    
   - Secured
      ~ It is secure because 
          1. No explicit pointer
          2. Programs runs inside JVM sandbox.
      ~ Class loader : A part of JRE load java class in JVM dynamically
      ~ Byte code verifier : Check code fragments for illegal code that can violate access to objects
      ~ Security manager : Determines what resources a class can access such as reading and wriing to local disk
        
  - Architecture Neutral
      ~ Size of primitive data type is fixed
      ~ In c/cpp int requires 2 bytes for 32 bit architecture 4 bytes fir 64 bit architecture but in java for both 32 and 64 bit architecture 4 bytes are required
      
 - Poratble
    ~ It facilates to carry java byte code to any platform
    ~ Do not require any implementation
    
 - High performance
     ~ Faster than any interpreted language because java byte code is close to native code
     ~ Java is interpreted language that is why slower than compiled language like c/cpp etc.
        
 - Distributed
    ~ we can access file by calling method from any machine on the internet 
    
 - Multithreaded
    ~ Do not occupy memory for each thread
    ~ Share common memory area
    ~ Thread are important for multimedia, web etc.
      
 - Dynamic
    ~ Supports dynamic loading of classes
  
