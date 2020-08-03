package Home;

import com.sun.jdi.Value;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {


    public static void main(String[] args) {

        //Первое задание
/*
        String text = "Hello world,  andrey! Avocado, almost, Andrei, by";

        List<String> stringList = Arrays.stream(text.split("\\W")).collect(Collectors.toList());
        List<String> stringListFilter = new ArrayList<>();

        stringList.stream()
                .map(String::toLowerCase)
                .filter(words -> words.startsWith("a"))
                .forEach(stringListFilter::add);

        stringListFilter.forEach(System.out::println);
*/

        //Второе задание


        Model model = new Model("model");
        Model model1 = new Model("model1");
        Model model2 = new Model("model2");
        Model model3 = new Model("model3");

        List<Model> models1 = new ArrayList<>();
        models1.add(model);
        List<Model> models2 = new ArrayList<>();
        models2.add(model1);

        List<Model> models3 = new ArrayList<>();
        models3.add(model2);
        List<Model> models4 = new ArrayList<>();
        models4.add(model3);

        ContainerB containerB1 = new ContainerB(models1);
        ContainerB containerB2 = new ContainerB(models2);

        List<ContainerB> containerBList = new ArrayList<>();
        containerBList.add(containerB1);
        containerBList.add(containerB2);

        ContainerA containerA = new ContainerA(models3, containerB1);
        ContainerA containerA1 = new ContainerA(models4, containerB2);
        List<ContainerA> containerAList = new ArrayList<>();
        containerAList.add(containerA);
        containerAList.add(containerA1);
        containerAList.forEach(System.out::println);


        //Третье задание


        User user1 = new User("Tom","123455677@mail.com");
        User user2 = new User(null,null);
        List<User> users = Arrays.asList(user1, user2, null);
        User.userOrGuest(users);


    }


}


