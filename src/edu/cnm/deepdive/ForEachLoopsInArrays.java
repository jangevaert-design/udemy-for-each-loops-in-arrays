package edu.cnm.deepdive;

public class ForEachLoopsInArrays {

  public static void main(String[] args) {

    String[] names = {"Jimmy", "John", "Tom", "Anthony"};
    //regular for loop
    for (int i = 0; i < names.length ; i++) {
      System.out.println("name = " + names[i]);
    }
    System.out.println();
    //for each loop
    for (String name : names) {
      System.out.println("name = " + name);
    }
    System.out.println();
    StringBuilder[] builders = {
        new StringBuilder("For"),
        new StringBuilder("Loop")
    };

    for (StringBuilder builder : builders) {
      System.out.println(builder);
    }

    for (StringBuilder builder : builders) {
      builder.append("123");
    }
    System.out.println();
    for (StringBuilder builder : builders) {
      System.out.println(builder);
    }

    String pets = "Parrot";

//    for (pet : pets) { will not compile because pets is a String and not an array of Strings.
//
//    }

//    for (int name : names) {} will not compile because of incompatible types (names is an array of Strings.
    System.out.println();
    for (char c : pets.toCharArray()) {
      System.out.println(c);
    }//this will compile because we made pets a charArray

    }
  }


