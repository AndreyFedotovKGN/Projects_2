public class Projects_2 {
    public static void main(String[] args) {

//Задание 1
        System.out.println("Задание 1");
        byte a = 100;
        short b = 10_500;
        int c = 3_450_500;
        long d = 5000L;
        float f = 10.565148f;
        double g = 8.5698462145843;
        System.out.println("А = " + a + " B = " + b + " C = " + c + " D = " + d + " F = " + f + " G = " + g);

//Задание 2
        System.out.println("Задание 2");
        float russianBoxer = 78.2f;
        float americanBoxer = 82.7f;
        float totalWeight = russianBoxer + americanBoxer;
        float weightDifference = americanBoxer - russianBoxer;
        System.out.println("Вес русского боксера = " + russianBoxer + " кг");
        System.out.println("Вес американского боксера = " + americanBoxer + " кг");
        System.out.println("Общий вес бойцов = " + totalWeight + " кг");
        System.out.println("Разница между весами бойцов = " + weightDifference + " кг");

// Задание 3
        System.out.println("Задание 3");
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eeg = 4;

        short weightOfBananas = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        int cocktailWeightGr = weightOfBananas + milkWeight + iceCreamWeight + eggWeight;
        System.out.println("Рецепт коктейля: смешать в блендере 5 бананов, 200 мл молока, 2 брикета мороженого, 4 яйца.");
        System.out.println("Общий вес коктейля " + cocktailWeightGr + " гр.");
        int grPerKg = 1000;
        float cocktailWeightKg = cocktailWeightGr / (float) grPerKg;
        System.out.println("Общий вес коктейля " + cocktailWeightKg + " кг.");

// Задание 4
        System.out.println("Задание 4");
        byte weightLossKg = 7;
        short GrPerKg = 1000;
        int weightLossGr = weightLossKg * GrPerKg;
        short lossInOneDayMin = 250;
        short lossInOneDayMax = 500;
        double numberOfDaysMin = weightLossGr * 1.0 / lossInOneDayMin;
        double numberOfDaysMax = weightLossGr * 1.0 / lossInOneDayMax;
        System.out.println("Колличество дней при потере 250 гр. в день = " + numberOfDaysMin);
        System.out.println("Колличество дней при потере 500 гр. в день = " + numberOfDaysMax);
        double lossInOneDaySr = (lossInOneDayMax + lossInOneDayMin) * 1.0/2;
        System.out.println("Потеря веса в среднем = " + lossInOneDaySr);
        double numberOfDaysSr = weightLossGr / lossInOneDaySr;
        int x = (int) Math.round (numberOfDaysSr);
        System.out.println("Количество дней в среднем = " + x);

//Задание 5
        System.out.println("Задание 5");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryPerYearMasha = salaryMasha*12; //годовая ЗП Маша
        int salaryPerYearDenis = salaryDenis*12; //годовая ЗП Денис
        int salaryPerYearKristina = salaryKristina*12; // годовая ЗП Кристина
        System.out.println("Зарплата Маши в месяц " + salaryMasha + " рублей");
        System.out.println("Зарплата Дениса в месяц " + salaryDenis + " рублей");
        System.out.println("Зарплата Кристины в месяц " + salaryKristina + " рублей");
        System.out.println("Годовой доход Маши = " + salaryPerYearMasha + " рублей");
        System.out.println("Годовой доход Дениса = " + salaryPerYearDenis + " рублей");
        System.out.println("Годовой доход Кристины = " + salaryPerYearKristina + " рублей");
        double salaryUp = 0.1; // увеличение ЗП на 10%
        double salaryMashaUp = ((salaryMasha * salaryUp) + salaryMasha)*12;
        double salaryDenisUp = ((salaryDenis * salaryUp) + salaryDenis)*12;
        double salaryKristinaUp = ((salaryKristina * salaryUp) + salaryKristina)*12;
        System.out.println("Маша теперь получает в год = " + salaryMashaUp + " рублей");
        System.out.println("Денис теперь получает в год = " + salaryDenisUp + " рублей");
        System.out.println("Кристина теперь получает в год = " + salaryKristinaUp + " рублей");
        double salaryGrowthMasha = salaryMashaUp - salaryPerYearMasha;
        double salaryGrowthDenis = salaryDenisUp - salaryPerYearDenis;
        double salaryGrowthKristina = salaryKristinaUp - salaryPerYearKristina;
        System.out.println("Рост зарплаты Маши на " + salaryGrowthMasha + " рублей");
        System.out.println("Рост зарплаты Дениса на " + salaryGrowthDenis + " рублей");
        System.out.println("Рост зарплаты Кристины на " + salaryGrowthKristina + " рублей");





    }
}