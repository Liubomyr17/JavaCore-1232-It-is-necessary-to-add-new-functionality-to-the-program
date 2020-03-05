package com.company;

/*

1232 New functionality must be added to the program
Make a Pegas class based on the Horse class and the Fly interface.

Requirements:
1. The Solution class must contain a Fly () method using the Fly interface.
2. The Solution class must contain a Horse class with the run () method.
3. The Solution class must contain the Pegas class.
4. The Pegas class must inherit from the Horse class.
5. The Pegas class must implement the Fly interface.



 */


public class Main {
    public static void main(String[] args) {

        Pegas horse = new Pegas();
    }

    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        @Override
        public void fly() {
        }
    }
}


