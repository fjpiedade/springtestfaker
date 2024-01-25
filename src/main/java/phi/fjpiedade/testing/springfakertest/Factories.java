package phi.fjpiedade.testing.springfakertest;

import com.github.javafaker.Faker;

public class Factories {
    private static Faker faker = new Faker();

    public static User createNewUser(){
        return new User(
            faker.name().username(), 
            faker.internet().password(), 
            //faker.name().fullName(), 
            faker.lordOfTheRings().character(), 
            faker.internet().emailAddress()
            );
    }
}
