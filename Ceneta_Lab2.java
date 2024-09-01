import java.util.Scanner;

//Create Cylinder Class
class Cylinder {
    double radius, height, area;

//Requesting input from the user
    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of cylinder: ");
        radius = scanner.nextDouble();

        System.out.print("Enter the height of cylinder: ");
        height = scanner.nextDouble();

        scanner.close();
    }

//Calculate the Area of the Cylinder
    void calculateArea() {
        area = 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }
}

class CylinderVol extends Cylinder {
    double volume;

//Calculate the Volume of the Cylinder
    void calculateVolume() {
        volume = Math.PI * Math.pow(radius, 2) * height;
    }

//Display results of the calculation of Area and Volume
    void displayResults() {
        System.out.println("Area of cylinder: " + area);
        System.out.println("Volume of  cylinder: " + volume);
    }

    public static void main(String[] args) {
        System.out.println("**VOLUME AND AREA OF CYLINDER**");
        CylinderVol cylinder = new CylinderVol();
        cylinder.getInput();
        cylinder.calculateArea();
        cylinder.calculateVolume();
        cylinder.displayResults();
    }
}
