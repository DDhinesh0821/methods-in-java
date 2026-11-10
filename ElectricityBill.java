package methodAssignments;


class ElectricityBill {

    void calculateBill(int units) {

        int bill = 0;

        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        }
        else {
            bill = (100 * 2) + (100 * 3)
                   + (units - 200) * 5;
        }

        System.out.println("Units: " + units);
        System.out.println("Total Bill: Rs." + bill);
    }

    public static void main(String[] args) {

        ElectricityBill eb = new ElectricityBill();

        eb.calculateBill(80);
        eb.calculateBill(150);
        eb.calculateBill(250);
    }
}

