public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax() {
        if (salary >= 1000) {
            double price = salary * 0.03;
            return price;
        } else {
        } return 0;

    }
    double bonus() {
        if (workHours > 40) {
            this.workHours = (workHours - 40) * 30;
            return this.workHours;
        }
        return 0;
    }
    double raiseSalary() {
        if ((2021 - hireYear ) < 10){
             double newSalary = salary * 5/100;
            return newSalary;
        }
        else if (9 < (2021 - hireYear) && (2021 - hireYear) < 20){
            double newSalary = salary * 10/100;
            return newSalary;
        }
        else  {
           double newSalary = salary * 15 / 100;
            return newSalary;

        }

    }
    void toPersonel(){
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        double totalTax = tax();
        double totalBonus = bonus();
        double totalRaiseSalary = raiseSalary();
        double bonusTaxSalary = salary - totalTax + totalBonus;
        double totalSalary = salary + totalRaiseSalary;
        System.out.println("Vergi : " + totalTax);
        System.out.println("Bonus : " + totalBonus);
        System.out.println("Maaş Artışı : " + totalRaiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + bonusTaxSalary);
        System.out.println("Toplam Maaş: " + totalSalary);
    }





}
