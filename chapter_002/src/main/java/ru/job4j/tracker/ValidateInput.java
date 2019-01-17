package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuException e) {
                System.out.println("Выберите значение из диапазона меню:");

            } catch (NumberFormatException e) {
                System.out.println("Выберите корректное действие из списка:");
            }

        }
        while (invalid);
        return value;
    }
}