package Model;


public class Customer {
        private int id;
        private String name;
        private String lastName;
        private String number;
        private String plate;
        private String time;

        public Customer() {
        }

        public Customer(int id, String name, String lastName, String number, String plate, String time) {
                this.id = id;
                this.name = name;
                this.lastName = lastName;
                this.number = number;
                this.plate = plate;
                this.time = time;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
        }

        public String getPlate() {
                return plate;
        }

        public void setPlate(String plate) {
                this.plate = plate;
        }

        public String getTime() {
                return time;
        }

        public void setTime(String time) {
                this.time = time;
        }

        
        
         
}
