# TestUI
Данное проект предоставляет решение по данным кейсам
### Кейс 1 Разница двух целых чисел
* Открыть сайт https://testsheepnz.github.io/BasicCalculator.html 
* Проскроллить вниз до конца
* Выбрать сборку (Build) «Prototype»
* Ввести в поле First number значение «2»
* Ввести в поле Second number значение «3»
* Выбрать операцию (Operation) «Subtract»
* Нажать на кнопку «Calculate»
* Проверить, что в поле ответа (Answer) значение равно «-1»

### Кейс 2 Конкатенация двух строк.
* Открыть сайт https://testsheepnz.github.io/BasicCalculator.html 
* Проскроллить вниз до конца
* Выбрать сборку (Build) «Prototype»
* Ввести в поле First number значение «gs»
* Ввести в поле Second number значение «bu»
* Выбрать операцию (Operation) «Concatenate»
* Нажать на кнопку «Calculate»
* Проверить, что в поле ответа (Answer) значение равно «gsbu»

### Кейс 3 Появление сообщения при вводе строки в поле
* Открыть сайт https://testsheepnz.github.io/random-number.html 
* Проскроллить вниз до конца
* Выбрать сборку (Select Build) «Demo»
* Нажать на кнопку «Roll the dice»
* Ввести в поле значение «string»
* Нажать на кнопку «Submit»
* Проверить, что появилось сообщение «string: Not a number!»

### Был использован следующий стек для разработки
* Java
* Junit
* Maven
* Selenium/Selenide
* PageObject

### Описание работы тестов
Для того чтобы заставить работать тесты достаточно зайти в пакет тестов и запустить класс *SubtractTest* (будет произвелено тестирование первых двух кейсов), класс *GameTest* отвечает за 3 кейс. Также существует абстрактный класс *BaseTest.java*(основной класс для всех тестов). И два класса *MainPage* и *GamePage* для работы с вебстраницами сайта.
