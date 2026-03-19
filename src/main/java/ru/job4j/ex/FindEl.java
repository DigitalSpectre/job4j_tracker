package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element " + key + " not found in storage");
        }
        return result;
    }

    public static void main(String[] args) {
        String key = "7";
        String[] value = {"2", "4", "6", "8"};
        try {
            System.out.println(FindEl.indexOf(value, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}