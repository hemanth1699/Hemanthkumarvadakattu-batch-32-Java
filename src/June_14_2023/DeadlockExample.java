package June_14_2023;

public class DeadlockExample {
        public static class Person {
            private String name;

            public Person(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public synchronized void exchangeItems(Person otherPerson) {
                System.out.println(this.name + " is waiting to receive items from " + otherPerson.getName());
                otherPerson.giveItems(this);
                System.out.println(this.name + " received items from " + otherPerson.getName());
            }

            public synchronized void giveItems(Person otherPerson) {
                System.out.println(this.name + " is giving items to " + otherPerson.getName());
            }
        }

        public static void main(String[] args) {
            Person person1 = new Person("Person 1");
            Person person2 = new Person("Person 2");

            Thread thread1 = new Thread(() -> person1.exchangeItems(person2));
            Thread thread2 = new Thread(() -> person2.exchangeItems(person1));

            thread1.start();
            thread2.start();
        }
    }

