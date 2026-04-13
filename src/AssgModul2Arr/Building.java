package AssgModul2Arr;

    public class Building {

        private String name;
        private String address;
        private int numberFloor;

        public Building(String name, String address, int numberFloor) {
            this.name = name;
            this.address = address;
            this.numberFloor = numberFloor;
        }

        public void displayBuildInfo() {
            System.out.println("--- Building Information ---");
            System.out.println("Name of the building: " + name);
            System.out.println("Address of the building: " + address);
            System.out.println("Number of floors: " + numberFloor);
            System.out.println("===========================");
        }

        // Getter (opsional, kalau nanti mau dipakai)
        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public int getNumberFloor() {
            return numberFloor;
        }
    }

