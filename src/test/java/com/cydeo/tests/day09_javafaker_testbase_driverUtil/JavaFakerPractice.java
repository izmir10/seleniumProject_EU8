package com.cydeo.tests.day09_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());

        //will return random numbers where we pass #
        System.out.println("faker.numerify(\"##-###-####\") = " + faker.numerify("##-###-####"));
        System.out.println("faker.numerify(\"+90-532-###-####\") = " + faker.numerify("+90-532-###-####"));

        //will return random letters where we pass ?
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        //will return random (letters --> ?) and (numbers ---> #)
        System.out.println("faker.bothify(\"???-###-#?#?#?\") = " + faker.bothify("???-###-#?#?#?"));

        System.out.println("faker.medical().symptoms() = " + faker.medical().symptoms());

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));

    }


}
