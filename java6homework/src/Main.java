import java.util.Scanner;
// Задание 1: Класс "Человек"
class Person {
    private String fullName;
    private String dateOfBirth;
    private String contactPhone;
    private String city;
    private String country;
    private String homeAddress;

    // Метод для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        fullName = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        dateOfBirth = scanner.nextLine();
        System.out.print("Введите контактный телефон: ");
        contactPhone = scanner.nextLine();
        System.out.print("Введите город: ");
        city = scanner.nextLine();
        System.out.print("Введите страну: ");
        country = scanner.nextLine();
        System.out.print("Введите домашний адрес: ");
        homeAddress = scanner.nextLine();
    }

    // Метод для вывода данных
    public void displayData() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Контактный телефон: " + contactPhone);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
        System.out.println("Домашний адрес: " + homeAddress);
    }

    // Методы для доступа к отдельным полям
    public String getFullName() { return fullName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getContactPhone() { return contactPhone; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getHomeAddress() { return homeAddress; }
}

// Задание 2: Класс "Город"
class City {
    private String cityName;
    private String region;
    private String country;
    private int population;
    private String postalCode;
    private String phoneCode;

    // Метод для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название города: ");
        cityName = scanner.nextLine();
        System.out.print("Введите название региона: ");
        region = scanner.nextLine();
        System.out.print("Введите название страны: ");
        country = scanner.nextLine();
        System.out.print("Введите количество жителей: ");
        population = scanner.nextInt();
        System.out.print("Введите почтовый индекс: ");
        postalCode = scanner.next();
        System.out.print("Введите телефонный код: ");
        phoneCode = scanner.next();
    }

    // Метод для вывода данных
    public void displayData() {
        System.out.println("Название города: " + cityName);
        System.out.println("Регион: " + region);
        System.out.println("Страна: " + country);
        System.out.println("Количество жителей: " + population);
        System.out.println("Почтовый индекс: " + postalCode);
        System.out.println("Телефонный код: " + phoneCode);
    }

    // Методы для доступа к отдельным полям
    public String getCityName() { return cityName; }
    public String getRegion() { return region; }
    public String getCountry() { return country; }
    public int getPopulation() { return population; }
    public String getPostalCode() { return postalCode; }
    public String getPhoneCode() { return phoneCode; }
}

// Задание 3: Класс "Страна"
class Country {
    private String countryName;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private String cities;

    // Метод для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название страны: ");
        countryName = scanner.nextLine();
        System.out.print("Введите название континента: ");
        continent = scanner.nextLine();
        System.out.print("Введите количество жителей: ");
        population = scanner.nextInt();
        System.out.print("Введите телефонный код: ");
        phoneCode = scanner.next();
        scanner.nextLine(); // Чистим буфер
        System.out.print("Введите название столицы: ");
        capital = scanner.nextLine();
        System.out.print("Введите названия городов в стране (через запятую): ");
        cities = scanner.nextLine();
    }

    // Метод для вывода данных
    public void displayData() {
        System.out.println("Название страны: " + countryName);
        System.out.println("Континент: " + continent);
        System.out.println("Количество жителей: " + population);
        System.out.println("Телефонный код: " + phoneCode);
        System.out.println("Столица: " + capital);
        System.out.println("Города: " + cities);
    }

    // Методы для доступа к отдельным полям
    public String getCountryName() { return countryName; }
    public String getContinent() { return continent; }
    public int getPopulation() { return population; }
    public String getPhoneCode() { return phoneCode; }
    public String getCapital() { return capital; }
    public String getCities() { return cities; }
}

// Задание 4: Класс "Дробь"
class Fraction {
    private int numerator;
    private int denominator;

    // Метод для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        numerator = scanner.nextInt();
        System.out.print("Введите знаменатель: ");
        denominator = scanner.nextInt();
    }

    // Метод для вывода данных
    public void displayData() {
        System.out.println("Дробь: " + numerator + "/" + denominator);
    }

    // Методы для доступа к отдельным полям
    public int getNumerator() { return numerator; }
    public int getDenominator() { return denominator; }

    // Арифметические операции
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Конструктор для создания дроби с числителем и знаменателем
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
}

// Основной класс
public class Main {
    public static void main(String[] args) {
        // Задание 1
        Person person = new Person();
        person.inputData();
        person.displayData();
        System.out.println(); // Пустая строка между заданиями

        // Задание 2
        City city = new City();
        city.inputData();
        city.displayData();
        System.out.println(); // Пустая строка между заданиями

        // Задание 3
        Country country = new Country();
        country.inputData();
        country.displayData();
        System.out.println(); // Пустая строка между заданиями

        // Задание 4
        Fraction fraction = new Fraction(0, 1);  // Создание дроби с начальным значением
        fraction.inputData();
        fraction.displayData();
    }
}