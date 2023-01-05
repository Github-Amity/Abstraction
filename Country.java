public abstract class Country {

    // 1️⃣ FIRST
    // 🔴 Create a String attribute named 'continent' and set it to a continent of your choice. Example: "Asia"
    // 🔴 Create an abstract method named 'sayHello()'
    // ⬇️------------Write your code below (approx. 2 lines of code)-----------⬇️



    // ⬆️--------------------------------END HERE------------------------------⬆️


    void welcome() {    // Non-abstract method, need not be implemented by subclasses
    // Method will be inherited by subclasses, so if not overriden, this will be run when this method is called:
        System.out.println("Welcome to this country!");
    }

    public static void main(String[] args) {
        // 4️⃣ FOURTH
        // 🔴 Create an instance of both the countries that you created.
        // 🔴 Call all the methods of the first country (sayHello() and welcome()) 
        // 🔴 Then print all its attributes (continent and capital)
        // 🔴 Do the same for the other country
        // MAKE SURE THE OUTPUT MATCHES THE FORMAT OF THE ONE GIVEN IN THE INSTRUCTIONS
        // ⬇️------------Write your code below (approx. 10 lines of code)-----------⬇️















        // ⬆️--------------------------------END HERE------------------------------⬆️
    }

}



// 2️⃣ SECOND
// 🔴 Create a class with the name of a country (example: India) that extends the class Country
// 🔴 Create an attribute 'capital' and set it to the capital of the chosen country
// 🔴 Implement the 'sayHello()' method that you created in the Country class earlier.
// Inside the body of the method, print "Hello!" in the language of the chosen country. (example: "Namaste!")
// 🔴 Implement (and therefore override) the 'welcome()' method that is given in the Country class.
// Inside the body of the method, print a welcome message in the language of the chosen country. (example: "Is desh me aapka swagat hai!")
// ⬇️------------Write your code below (approx. 7 lines of code)-----------⬇️









// ⬆️--------------------------------END HERE------------------------------⬆️




// 3️⃣ THIRD
// 🔴 Create another class extending country just like above with an attribute 'capital' and method 'sayHello()' but NOT the method 'welcome()'.
// ⬇️------------Write your code below (approx. 5 lines of code)-----------⬇️









// ⬆️--------------------------------END HERE------------------------------⬆️
