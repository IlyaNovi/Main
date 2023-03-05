public class Main {
    public static void main(String[] args) {
        int eaters = 5; // сколько людей будет есть
        int woter = 3000; // миллилитров воды
        int potatoes = 5; // картофелин
        int chiken = 6; // куриных бёдер
        int spices = 10; // ложек специй


        System.out.println(" Сварили суп. На одного человека вышло:");
        System.out.println((woter/eaters)+ " миллилитров(а) воды");
        System.out.println((potatoes/eaters) + " картофелин (а/ы)");
        System.out.println((chiken/eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices/eaters) + " ложек(ки/ка) специй");

    }
}