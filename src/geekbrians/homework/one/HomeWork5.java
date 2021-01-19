package geekbrians.homework.one;

public class HomeWork5 {

    public static class colleague {

        String name;
        String position;
        String email;
        String phone_number;
        int salary;
        int age;


        public colleague(String name, String position, String email, String phone_number, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone_number = phone_number;
            this.salary = salary;
            this.age = age;
        }



        public String toString(){
            return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                    name, position, email, phone_number, salary, age);}


        public void print(){
            System.out.println(this);
        }


        public static void main(String[] args)  {

            colleague[] persArray = new colleague[5];
            persArray[0] = new colleague("Вячеслав Кобрин", "Генеральный директор", "vk@primer,ru", "+79996665544", 250000, 55);
            persArray[1] = new colleague("Иван Зайцев", "Директор по развитию", "vz@primer,ru", "+79998884455", 127000, 42);
            persArray[2] = new colleague("Дмитрий Медведев", "Охранник", "dm@primer,ru", "+79997771234", 19000, 21);
            persArray[3] = new colleague("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554789", 120000, 28);
            persArray[4] = new colleague("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445896", 138000, 48);

            // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
            for (int i=0; i < persArray.length; i++)
                if (persArray[i].age > 40) persArray[i].print();

        }
    }
}