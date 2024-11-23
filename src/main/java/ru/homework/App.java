package ru.homework;

import com.google.gson.Gson;

/**
 * Домашнее задание
 * Условие:
 * Создать проект с использованием Maven или Gradle, добавить в него несколько
 * зависимостей и написать код, использующий эти зависимости.
 * Пример решения:
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или
 * блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и
 * com.google.code.gson:gson:2.8.6.
 * 3. Создайте класс Person с полями rstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString,
 * equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов
 * класса Person в формат JSON.
 * Рекомендации для преподавателей по оценке задания:
 * • Проверьте правильность структуры проекта
 * • Убедитесь в корректности указания зависимостей в файлах pom.xml или
 * build.gradle
 * • Оцените правильность использования библиотек в коде
 * • Проверьте работоспособность кода
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Person person = new Person("Иван", "Петров", 30);
        Person person1 = new Person("Василий", "Петров", 35);
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());

        // Сериализация в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Серелизованный JSON: " + json);

        // Десериализация из JSON
        String jsonInput = json;
        Person deserializedPerson = gson.fromJson(jsonInput, Person.class);
        System.out.println("Десерелизованный Person: " + deserializedPerson);

    }
}
