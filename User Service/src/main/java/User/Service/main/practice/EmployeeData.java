package User.Service.main.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee(1L, "Aman", "aman@company.com", "IT", "Software Engineer", 850000L, 28, "Mumbai", LocalDate.of(2021, 6, 14), true);
        Employee e2 = new Employee(2L, "MC", "MC@company.com", "IT", "Senior Software Engineer", 150000L, 32, "Pune", LocalDate.of(2019, 4, 10), true);
        Employee e3 = new Employee(3L, "Priya", "priya@company.com", "HR", "HR Executive", 650000L, 27, "Mumbai", LocalDate.of(2022, 2, 15), true);
        Employee e4 = new Employee(4L, "Sneha", "sneha@company.com", "Finance", "Financial Analyst", 900000L, 30, "Bangalore", LocalDate.of(2020, 8, 20), true);
        Employee e5 = new Employee(5L, "Vikram", "vikram@company.com", "IT", "Tech Lead", 1800000L, 38, "Hyderabad", LocalDate.of(2017, 3, 12), true);
        Employee e6 = new Employee(6L, "Neha", "neha@company.com", "Marketing", "Marketing Manager", 1100000L, 35, "Delhi", LocalDate.of(2018, 7, 5), true);
        Employee e7 = new Employee(7L, "Rohan", "rohan@company.com", "IT", "Software Engineer", 780000L, 26, "Mumbai", LocalDate.of(2023, 1, 16), true);
        Employee e8 = new Employee(8L, "Ananya", "ananya@company.com", "HR", "HR Manager", 1350000L, 37, "Pune", LocalDate.of(2016, 11, 8), true);
        Employee e9 = new Employee(9L, "Karan", "karan@company.com", "Finance", "Accountant", 550000L, 25, "Mumbai", LocalDate.of(2023, 6, 19), true);
        Employee e10 = new Employee(10L, "Pooja", "pooja@company.com", "IT", "Software Engineer", 950000L, 29, "Bangalore", LocalDate.of(2020, 10, 12), false);

        Employee e11 = new Employee(11L, "Arjun", "arjun@company.com", "Sales", "Sales Executive", 700000L, 28, "Delhi", LocalDate.of(2021, 9, 25), true);
        Employee e12 = new Employee(12L, "Meera", "meera@company.com", "IT", "Architect", 2200000L, 42, "Pune", LocalDate.of(2015, 5, 18), true);
        Employee e13 = new Employee(13L, "Nikhil", "nikhil@company.com", "Operations", "Operations Manager", 2200000L, 36, "Mumbai", LocalDate.of(2018, 2, 10), true);
        Employee e14 = new Employee(14L, "Isha", "isha@company.com", "IT", "Software Engineer", 820000L, 27, "Hyderabad", LocalDate.of(2022, 8, 1), true);
        Employee e15 = new Employee(15L, "Varun", "varun@company.com", "Finance", "Finance Manager", 1600000L, 40, "Bangalore", LocalDate.of(2016, 4, 22), true);
        Employee e16 = new Employee(16L, "Riya", "riya@company.com", "Marketing", "Marketing Executive", 600000L, 24, "Mumbai", LocalDate.of(2024, 1, 8), true);
        Employee e17 = new Employee(17L, "Siddharth", "siddharth@company.com", "IT", "Senior Developer", 1450000L, 34, "Pune", LocalDate.of(2019, 12, 2), true);
        Employee e18 = new Employee(18L, "Kavya", "kavya@company.com", "HR", "Recruiter", 580000L, 26, "Delhi", LocalDate.of(2023, 3, 14), false);
        Employee e19 = new Employee(19L, "Aditya", "aditya@company.com", "IT", "DevOps Engineer", 1350000L, 31, "Bangalore", LocalDate.of(2019, 7, 29), true);
        Employee e20 = new Employee(20L, "Shreya", "shreya@company.com", "Sales", "Sales Manager", 1500000L, 39, "Mumbai", LocalDate.of(2017, 10, 6), true);

        Employee e21 = new Employee(21L, "Ravi", "ravi@company.com", "IT", "Backend Developer", 980000L, 29, "Pune", LocalDate.of(2021, 2, 11), true);
        Employee e22 = new Employee(22L, "Nisha", "nisha@company.com", "HR", "HR Executive", 720000L, 28, "Bangalore", LocalDate.of(2022, 5, 19), true);
        Employee e23 = new Employee(23L, "Kunal", "kunal@company.com", "Finance", "Senior Accountant", 1050000L, 33, "Mumbai", LocalDate.of(2019, 3, 22), true);
        Employee e24 = new Employee(24L, "Divya", "divya@company.com", "IT", "Full Stack Developer", 1150000L, 30, "Hyderabad", LocalDate.of(2020, 1, 15), true);
        Employee e25 = new Employee(25L, "Manish", "manish@company.com", "Operations", "Operations Executive", 680000L, 27, "Delhi", LocalDate.of(2022, 9, 5), true);
        Employee e26 = new Employee(26L, "Swati", "swati@company.com", "Marketing", "Marketing Analyst", 750000L, 26, "Pune", LocalDate.of(2023, 2, 17), true);
        Employee e27 = new Employee(27L, "Akash", "akash@company.com", "IT", "Java Developer", 1020000L, 29, "Mumbai", LocalDate.of(2021, 7, 12), true);
        Employee e28 = new Employee(28L, "Komal", "komal@company.com", "HR", "Recruiter", 620000L, 25, "Bangalore", LocalDate.of(2023, 8, 21), true);
        Employee e29 = new Employee(29L, "Saurabh", "saurabh@company.com", "Sales", "Sales Executive", 730000L, 30, "Pune", LocalDate.of(2020, 11, 9), true);
        Employee e30 = new Employee(30L, "Tanvi", "tanvi@company.com", "IT", "QA Engineer", 880000L, 28, "Hyderabad", LocalDate.of(2021, 4, 6), false);

        Employee e31 = new Employee(31L, "Harsh", "harsh@company.com", "IT", "Software Engineer", 920000L, 27, "Mumbai", LocalDate.of(2022, 1, 24), true);
        Employee e32 = new Employee(32L, "Pallavi", "pallavi@company.com", "Finance", "Finance Executive", 710000L, 29, "Delhi", LocalDate.of(2021, 8, 16), true);
        Employee e33 = new Employee(33L, "Mohit", "mohit@company.com", "Operations", "Operations Manager", 1280000L, 37, "Pune", LocalDate.of(2017, 6, 13), true);
        Employee e34 = new Employee(34L, "Ayesha", "ayesha@company.com", "IT", "Senior Developer", 1550000L, 35, "Bangalore", LocalDate.of(2018, 9, 20), true);
        Employee e35 = new Employee(35L, "Deepak", "deepak@company.com", "Sales", "Sales Executive", 690000L, 26, "Mumbai", LocalDate.of(2023, 4, 11), true);
        Employee e36 = new Employee(36L, "Simran", "simran@company.com", "HR", "HR Manager", 1400000L, 39, "Hyderabad", LocalDate.of(2016, 2, 8), true);
        Employee e37 = new Employee(37L, "Yash", "yash@company.com", "IT", "DevOps Engineer", 1300000L, 32, "Pune", LocalDate.of(2019, 10, 14), true);
        Employee e38 = new Employee(38L, "Mansi", "mansi@company.com", "Marketing", "Marketing Executive", 640000L, 25, "Mumbai", LocalDate.of(2024, 3, 18), true);
        Employee e39 = new Employee(39L, "Tarun", "tarun@company.com", "Finance", "Financial Analyst", 970000L, 31, "Delhi", LocalDate.of(2020, 6, 25), true);
        Employee e40 = new Employee(40L, "Sakshi", "sakshi@company.com", "IT", "Backend Developer", 1080000L, 30, "Bangalore", LocalDate.of(2021, 11, 7), false);

        Employee e41 = new Employee(41L, "Abhishek", "abhishek@company.com", "IT", "Tech Lead", 1750000L, 40, "Mumbai", LocalDate.of(2016, 8, 19), true);
        Employee e42 = new Employee(42L, "Payal", "payal@company.com", "HR", "HR Executive", 670000L, 27, "Pune", LocalDate.of(2022, 7, 4), true);
        Employee e43 = new Employee(43L, "Naveen", "naveen@company.com", "Finance", "Accountant", 590000L, 26, "Hyderabad", LocalDate.of(2023, 5, 15), true);
        Employee e44 = new Employee(44L, "Ritika", "ritika@company.com", "IT", "Software Engineer", 890000L, 28, "Delhi", LocalDate.of(2021, 3, 21), true);
        Employee e45 = new Employee(45L, "Gaurav", "gaurav@company.com", "Sales", "Sales Manager", 1420000L, 38, "Mumbai", LocalDate.of(2017, 12, 1), true);
        Employee e46 = new Employee(46L, "Preeti", "preeti@company.com", "Marketing", "Marketing Manager", 1180000L, 36, "Pune", LocalDate.of(2018, 5, 10), true);
        Employee e47 = new Employee(47L, "Rakesh", "rakesh@company.com", "IT", "Java Developer", 990000L, 29, "Bangalore", LocalDate.of(2020, 9, 17), true);
        Employee e48 = new Employee(48L, "Monika", "monika@company.com", "HR", "Recruiter", 610000L, 24, "Mumbai", LocalDate.of(2024, 2, 12), true);
        Employee e49 = new Employee(49L, "Vivek", "vivek@company.com", "Operations", "Operations Executive", 760000L, 30, "Delhi", LocalDate.of(2021, 10, 23), true);
        Employee e50 = new Employee(50L, "Juhi", "juhi@company.com", "IT", "Software Engineer", 930000L, 27, "Hyderabad", LocalDate.of(2022, 4, 18), false);

        Employee e51 = new Employee(51L, "Raj", "raj@company.com", "IT", "Architect", 2100000L, 43, "Pune", LocalDate.of(2014, 8, 11), true);
        Employee e52 = new Employee(52L, "Alisha", "alisha@company.com", "Finance", "Finance Manager", 1550000L, 39, "Mumbai", LocalDate.of(2017, 2, 20), true);
        Employee e53 = new Employee(53L, "Sahil", "sahil@company.com", "Sales", "Sales Executive", 680000L, 25, "Bangalore", LocalDate.of(2023, 7, 3), true);
        Employee e54 = new Employee(54L, "Muskan", "muskan@company.com", "HR", "HR Executive", 2100000L, 26, "Pune", LocalDate.of(2022, 10, 9), true);
        Employee e55 = new Employee(55L, "Rohit", "rohit@company.com", "IT", "Senior Developer", 1480000L, 34, "Mumbai", LocalDate.of(2019, 1, 28), true);
        Employee e56 = new Employee(56L, "Sonia", "sonia@company.com", "Marketing", "Marketing Analyst", 790000L, 29, "Delhi", LocalDate.of(2021, 5, 16), true);
        Employee e57 = new Employee(57L, "Dev", "dev@company.com", "IT", "DevOps Engineer", 1380000L, 33, "Hyderabad", LocalDate.of(2018, 11, 6), true);
        Employee e58 = new Employee(58L, "Rashmi", "rashmi@company.com", "Finance", "Financial Analyst", 910000L, 31, "Bangalore", LocalDate.of(2020, 2, 13), true);
        Employee e59 = new Employee(59L, "Ashish", "ashish@company.com", "Operations", "Operations Manager", 1250000L, 37, "Mumbai", LocalDate.of(2017, 7, 22), true);
        Employee e60 = new Employee(60L, "Nandini", "nandini@company.com", "IT", "QA Engineer", 840000L, 28, "Pune", LocalDate.of(2021, 12, 15), false);

        Employee e61 = new Employee(61L, "Varsha", "varsha@company.com", "HR", "HR Manager", 1320000L, 38, "Mumbai", LocalDate.of(2018, 3, 19), true);
        Employee e62 = new Employee(62L, "Manav", "manav@company.com", "IT", "Backend Developer", 1040000L, 30, "Bangalore", LocalDate.of(2020, 7, 8), true);
        Employee e63 = new Employee(63L, "Ankit", "ankit@company.com", "Finance", "Accountant", 570000L, 25, "Delhi", LocalDate.of(2023, 9, 12), true);
        Employee e64 = new Employee(64L, "Bhavna", "bhavna@company.com", "Marketing", "Marketing Executive", 660000L, 27, "Mumbai", LocalDate.of(2022, 6, 17), true);
        Employee e65 = new Employee(65L, "Sameer", "sameer@company.com", "IT", "Software Engineer", 870000L, 29, "Hyderabad", LocalDate.of(2021, 1, 5), true);
        Employee e66 = new Employee(66L, "Tanya", "tanya@company.com", "Sales", "Sales Executive", 720000L, 26, "Pune", LocalDate.of(2023, 2, 9), true);
        Employee e67 = new Employee(67L, "Rajiv", "rajiv@company.com", "IT", "Tech Lead", 1720000L, 41, "Mumbai", LocalDate.of(2015, 10, 12), true);
        Employee e68 = new Employee(68L, "Aditi", "aditi@company.com", "HR", "Recruiter", 590000L, 25, "Bangalore", LocalDate.of(2024, 4, 2), true);
        Employee e69 = new Employee(69L, "Pankaj", "pankaj@company.com", "Operations", "Operations Executive", 740000L, 30, "Delhi", LocalDate.of(2021, 8, 24), true);
        Employee e70 = new Employee(70L, "Shruti", "shruti@company.com", "IT", "Full Stack Developer", 1170000L, 32, "Pune", LocalDate.of(2019, 6, 14), false);

        Employee e71 = new Employee(71L, "Sachin", "sachin@company.com", "Finance", "Finance Manager", 1580000L, 42, "Mumbai", LocalDate.of(2016, 1, 18), true);
        Employee e72 = new Employee(72L, "Reena", "reena@company.com", "Marketing", "Marketing Manager", 1130000L, 35, "Hyderabad", LocalDate.of(2018, 10, 5), true);
        Employee e73 = new Employee(73L, "Nitin", "nitin@company.com", "IT", "Java Developer", 1010000L, 28, "Bangalore", LocalDate.of(2021, 6, 7), true);
        Employee e74 = new Employee(74L, "Garima", "garima@company.com", "HR", "HR Executive", 690000L, 29, "Mumbai", LocalDate.of(2022, 3, 11), true);
        Employee e75 = new Employee(75L, "Suraj", "suraj@company.com", "Sales", "Sales Manager", 1480000L, 40, "Pune", LocalDate.of(2017, 5, 22), true);
        Employee e76 = new Employee(76L, "Kriti", "kriti@company.com", "IT", "Senior Software Engineer", 1280000L, 33, "Delhi", LocalDate.of(2019, 9, 16), true);
        Employee e77 = new Employee(77L, "Ajay", "ajay@company.com", "Operations", "Operations Manager", 1210000L, 37, "Mumbai", LocalDate.of(2018, 4, 9), true);
        Employee e78 = new Employee(78L, "Sonal", "sonal@company.com", "Finance", "Financial Analyst", 880000L, 30, "Bangalore", LocalDate.of(2020, 12, 14), true);
        Employee e79 = new Employee(79L, "Vishal", "vishal@company.com", "IT", "DevOps Engineer", 1410000L, 34, "Pune", LocalDate.of(2019, 2, 26), true);
        Employee e80 = new Employee(80L, "Ritu", "ritu@company.com", "Marketing", "Marketing Executive", 620000L, 24, "Mumbai", LocalDate.of(2024, 5, 6), false);

        Employee e81 = new Employee(81L, "Suresh", "suresh@company.com", "IT", "Architect", 2050000L, 44, "Hyderabad", LocalDate.of(2014, 11, 20), true);
        Employee e82 = new Employee(82L, "Kiran", "kiran@company.com", "HR", "HR Manager", 1370000L, 39, "Pune", LocalDate.of(2017, 8, 15), true);
        Employee e83 = new Employee(83L, "Mayank", "mayank@company.com", "Finance", "Senior Accountant", 1090000L, 32, "Mumbai", LocalDate.of(2019, 5, 10), true);
        Employee e84 = new Employee(84L, "Rachna", "rachna@company.com", "IT", "Software Engineer", 910000L, 27, "Bangalore", LocalDate.of(2022, 11, 3), true);
        Employee e85 = new Employee(85L, "Dinesh", "dinesh@company.com", "Sales", "Sales Executive", 710000L, 29, "Delhi", LocalDate.of(2021, 4, 27), true);
        Employee e86 = new Employee(86L, "Priti", "priti@company.com", "Marketing", "Marketing Analyst", 770000L, 28, "Mumbai", LocalDate.of(2022, 1, 13), true);
        Employee e87 = new Employee(87L, "Harshit", "harshit@company.com", "IT", "Backend Developer", 1120000L, 31, "Pune", LocalDate.of(2020, 6, 8), true);
        Employee e88 = new Employee(88L, "Sonali", "sonali@company.com", "HR", "Recruiter", 600000L, 26, "Hyderabad", LocalDate.of(2023, 10, 17), true);
        Employee e89 = new Employee(89L, "Pranav", "pranav@company.com", "Operations", "Operations Executive", 730000L, 28, "Bangalore", LocalDate.of(2022, 7, 25), true);
        Employee e90 = new Employee(90L, "Deepika", "deepika@company.com", "IT", "QA Engineer", 860000L, 30, "Mumbai", LocalDate.of(2021, 9, 14), false);

        Employee e91 = new Employee(91L, "Rajat", "rajat@company.com", "IT", "Senior Developer", 1520000L, 36, "Pune", LocalDate.of(2018, 6, 18), true);
        Employee e92 = new Employee(92L, "Shalini", "shalini@company.com", "Finance", "Finance Executive", 780000L, 29, "Delhi", LocalDate.of(2020, 3, 9), true);
        Employee e93 = new Employee(93L, "Abhay", "abhay@company.com", "Sales", "Sales Manager", 1460000L, 41, "Mumbai", LocalDate.of(2016, 12, 5), true);
        Employee e94 = new Employee(94L, "Divyanshi", "divyanshi@company.com", "HR", "HR Executive", 680000L, 27, "Bangalore", LocalDate.of(2022, 5, 23), true);
        Employee e95 = new Employee(95L, "Lokesh", "lokesh@company.com", "IT", "Java Developer", 1030000L, 30, "Hyderabad", LocalDate.of(2021, 2, 17), true);
        Employee e96 = new Employee(96L, "Nikita", "nikita@company.com", "Marketing", "Marketing Manager", 1190000L, 37, "Pune", LocalDate.of(2018, 8, 29), true);
        Employee e97 = new Employee(97L, "Prakash", "prakash@company.com", "Finance", "Finance Manager", 1650000L, 43, "Mumbai", LocalDate.of(2015, 4, 16), true);
        Employee e98 = new Employee(98L, "Suman", "suman@company.com", "IT", "Software Engineer", 940000L, 28, "Bangalore", LocalDate.of(2022, 9, 12), true);
        Employee e99 = new Employee(99L, "Viveka", "viveka@company.com", "Operations", "Operations Manager", 1260000L, 35, "Delhi", LocalDate.of(2019, 11, 4), true);
        Employee e100 = new Employee(100L, "Aarav", "aarav@company.com", "IT", "Tech Lead", 1850000L, 39, "Mumbai", LocalDate.of(2017, 1, 23), true);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

        employees.add(e11);
        employees.add(e12);
        employees.add(e13);
        employees.add(e14);
        employees.add(e15);
        employees.add(e16);
        employees.add(e17);
        employees.add(e18);
        employees.add(e19);
        employees.add(e20);

        employees.add(e21);
        employees.add(e22);
        employees.add(e23);
        employees.add(e24);
        employees.add(e25);
        employees.add(e26);
        employees.add(e27);
        employees.add(e28);
        employees.add(e29);
        employees.add(e30);

        employees.add(e31);
        employees.add(e32);
        employees.add(e33);
        employees.add(e34);
        employees.add(e35);
        employees.add(e36);
        employees.add(e37);
        employees.add(e38);
        employees.add(e39);
        employees.add(e40);

        employees.add(e41);
        employees.add(e42);
        employees.add(e43);
        employees.add(e44);
        employees.add(e45);
        employees.add(e46);
        employees.add(e47);
        employees.add(e48);
        employees.add(e49);
        employees.add(e50);

        employees.add(e51);
        employees.add(e52);
        employees.add(e53);
        employees.add(e54);
        employees.add(e55);
        employees.add(e56);
        employees.add(e57);
        employees.add(e58);
        employees.add(e59);
        employees.add(e60);

        employees.add(e61);
        employees.add(e62);
        employees.add(e63);
        employees.add(e64);
        employees.add(e65);
        employees.add(e66);
        employees.add(e67);
        employees.add(e68);
        employees.add(e69);
        employees.add(e70);

        employees.add(e71);
        employees.add(e72);
        employees.add(e73);
        employees.add(e74);
        employees.add(e75);
        employees.add(e76);
        employees.add(e77);
        employees.add(e78);
        employees.add(e79);
        employees.add(e80);

        employees.add(e81);
        employees.add(e82);
        employees.add(e83);
        employees.add(e84);
        employees.add(e85);
        employees.add(e86);
        employees.add(e87);
        employees.add(e88);
        employees.add(e89);
        employees.add(e90);

        employees.add(e91);
        employees.add(e92);
        employees.add(e93);
        employees.add(e94);
        employees.add(e95);
        employees.add(e96);
        employees.add(e97);
        employees.add(e98);
        employees.add(e99);
        employees.add(e100);

        return employees;
    }
}