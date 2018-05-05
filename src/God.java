import java.lang.reflect.Array;

public class God {
    public static Human[] create(){
        Man Adam = new Man();
        Woman Eve = new Woman();
        Human[] persons = new Human[2];
        persons[0] = Adam;
        persons[1] = Eve;
        return persons;
    }
}

abstract class Human {

}

class Man extends Human {

}

class Woman extends Human {

}

