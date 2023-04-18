import java.util.*;
public class Notebook {
    private String manufacturer;
    private String model;
    private String displaySize;
    private String displayResolution;
    private int ramSize;
    private int hddSize;
    private String os;
    private String color;
    private double price;

    public Notebook(String manufacturer, String model, String displaySize, String displayResolution, int ramSize, int hddSize, String os, String color, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    // геттеры и сеттеры для всех полей
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplaySize() {
        return displaySize;
    }
    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }
    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public int getRamSize() {
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }
    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }



    public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filters) {
        Set<Notebook> result = new HashSet<>();
        for (Notebook notebook : notebooks) {
            boolean matchFilter = true;
            for (Map.Entry<String, Object> filter : filters.entrySet()) {
                String key = filter.getKey();
                Object value = filter.getValue();
                if (key.equals("manufacturer") && !notebook.getManufacturer().equals(value)) {
                    matchFilter = false;
                }
                if (key.equals("model") && !notebook.getModel().equals(value)) {
                    matchFilter = false;
                }
                if(key.equals("displaySize") && !notebook.getDisplaySize().equals(value)) {
                    matchFilter = false;
                }
                if (key.equals("displayResolution") && !notebook.getDisplayResolution().equals(value)) {
                    matchFilter = false;
                }
                if (key.equals("ramSize") && notebook.getRamSize() != (int) value) {
                    matchFilter = false;
                }
                if (key.equals("hddSize") && notebook.getHddSize() != (int) value) {
                    matchFilter = false;
                }
                if (key.equals("os") && !notebook.getOs().equals(value)) {
                    matchFilter = false;
                }
                if (key.equals("color") && !notebook.getColor().equals(value)) {
                    matchFilter = false;
                }
                if (key.equals("price") && notebook.getPrice() != (double) value) {
                    matchFilter = false;
                }
            }
            if (matchFilter) {
                result.add(notebook);
            }
        }
        return result;
    }

    public String toString() {
        return "Model: " + manufacturer + " , " + model + ", DisplaySize " + displaySize + ", displayResolution " +
                displayResolution +  ", RAM: " + ramSize + "GB, HDD: " + hddSize + "GB, OS: " + os +
                ", Color: " + color + ", Price " + price;
    }

    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Lenovo", "ThinkPad X1 Carbon", "14 дюймов", "1920x1080", 8, 512, "Windows 10", "Черный", 100000));
        notebooks.add(new Notebook("Asus", "ZenBook Flip S", "13 дюймов", "1920x1080", 16, 512, "Windows 10", "Золотой", 200000));
        notebooks.add(new Notebook("Apple", "MacBook Pro 15", "15 дюймов", "2880x1800", 16, 256, "macOS", "Серый", 300000));

        Scanner scanner = new Scanner(System.in);

        Map<String, Object> filters = new HashMap<>();
        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - Производитель");
        System.out.println("2 - Модель");
        System.out.println("3 - Размер дисплея");
        System.out.println("4 - Разрешение дисплея");
        System.out.println("5 - Объем оперативной памяти");
        System.out.println("6 - Объем жесткого диска");
        System.out.println("7 - Операционная система");
        System.out.println("8 - Цвет");
        System.out.println("9 - Цена");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите производителя: ");
                String manufacturer = scanner.next();
                filters.put("manufacturer", manufacturer);
                break;
            case 2:
                System.out.println("Введите модель: ");
                String model = scanner.next();
                filters.put("model", model);
                break;
            case 3:
                System.out.println("Введите размер дисплея: ");
                String displaySize = scanner.next();
                filters.put("displaySize", displaySize);
                break;
            case 4:
                System.out.println("Введите разрешение дисплея: ");
                String displayResolution = scanner.next();
                filters.put("displayResolution", displayResolution);
                break;
            case 5:
                System.out.println("Введите объем оперативной памяти: ");
                int ramSize = scanner.nextInt();
                filters.put("ramSize", ramSize);
                break;
            case 6:
                System.out.println("Введите объем жесткого диска: ");
                int hddSize = scanner.nextInt();
                filters.put("hddSize", hddSize);
                break;
            case 7:
                System.out.println("Введите операционную систему: ");
                String os = scanner.next();
                filters.put("os", os);
                break;
            case 8:
                System.out.println("Введите цвет: ");
                String color = scanner.next();
                filters.put("color", color);
                break;
            case 9:
                System.out.println("Введите цену: ");
                double price = scanner.nextDouble();
                filters.put("price", price);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        Set<Notebook> filteredNotebooks = Notebook.filterNotebooks(notebooks, filters);

        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook.toString());
        }
    }
}

