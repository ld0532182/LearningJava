package com.javalessons.homeworkpoker;

import java.util.Scanner;
import java.util.TreeSet;
/** Этот код создает колоду, выдает карты в руки игроков и считает наибольшую по ценности комбинацию карт.
 * Первым делом создается колодка объектов "Card", с помощью класса "Deck". Сама колода представляет из себя HashMap,
 * где ключем выступает строка формата "XY", где X- тип карты, а Y - ее масть, прим: 2H - двойка червей.
 * !ошибка, возникающая в случае выбора игроком двух одинаковых карт не обрабатываетя!
 * После создания колоды предлагается ввести строку с пятью ключами карт (функция "getFormatString").
 * Конструктор класса Hand присваивает игроку имя и формирует список карт. Класс Card имплементирует Comparable,
 * поэтому все сортируются по возрастанию.
 * Также конструктор Hand определяет ценность руки с помощью метода "defineHandCombination".
 * После инициализации первой и второй руки, производится вычисление наибольшей комбинации и имя победителя выводится
 * в консоль */
public class PokerMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Deck deck = new Deck();

        String[] formattedInput;
        formattedInput = getFormatString();
        Hand hand1 = new Hand("Biba", formattedInput, deck);
        formattedInput = getFormatString();
        Hand hand2 = new Hand("Boba", formattedInput, deck);
        TreeSet<Hand> allHands = new TreeSet<Hand>();
        allHands.add(hand1);
        allHands.add(hand2);
        System.out.println(allHands.last());
    }

    private static String[] getFormatString() {
        String input;
        String[] formattedInput;
        do {
            System.out.println("Enter five cards in the format: '1D 1D 1D 1D 1D'\n");
            input = scanner.nextLine();
            formattedInput = input.split(" ");
        } while (formattedInput.length != 5);
        return formattedInput;
    }
}
