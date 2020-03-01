package com.it;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.omg.CosNaming.IstringHelper;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.nextLine();
//        System.out.println(next);


//public class Main {
//    public static void main(String[] args) throws IOException {
//        int i = 7;
//        int i1 = 2;
//        System.out.println(i / i1);
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        float a = .1f;
//        System.out.println(.3f + .4f);
//        System.out.println(.1 + .2);
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        System.out.println(100.0 / -0);
//    }
//
//    }

//public class Main {
//    public static void main(String[] args) throws IOException {
//        System.out.println(Double.NEGATIVE_INFINITY * 0);
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        System.out.println("\u00A9");
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        for (int i = 'A'; i < 'Z'; i++) {
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String s = "Hi \n \"all\"!!!";
//        s += 1;
//        System.out.println(s);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        byte a = 50;
//        byte b = -99;
//        short c = 0;
//        c = (short) (a + b);
//        System.out.println(c);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        byte a = 50;
//        byte b = 99;
//        short c = 0;
//        c = (byte) (a + b);
//        System.out.println(c);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//    int i = 10 > 5 ? 100 - 30 : 200;
//        System.out.println(i);
//    }
//    }

//public class Main {
//    public static void main(String[] args) {
//        if (10 < 5) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int age = 17;
//        if (age >= 3 && age < 6) {
//            System.out.println("a");
//        } else if (age >= 7 & age < 17) {
//            System.out.println("b");
//        } else if (age >= 18 & age < 22) {
//            System.out.println("c");
//        } else if (age >= 23 & age < 60)
//
//            System.out.println("hi");
//        else {
//            System.out.println("bad");
//        }
//
//        }
//    }

//    public class Main {
//        public static void main(String[] args) {
//            int age = 3;
//            switch (age) {
//                case 1:
//                    System.out.println(1);
//                    break;
//                case 2:
//                    System.out.println(2);
//                    break;
//                default:
//                    System.out.println("default");
//            }
//
//            }
//        }

//public class Main {
//    public static void main(String[] args) {
//        int age = 3;
//        switch (age) {
//            case 1:
//                System.out.println("WORK DAY");
//                break;
//            case 2:
//                System.out.println("WORK DAY");
//                break;
//            case 3:
//                System.out.println("WORK DAY");
//            case 4:
//                System.out.println("WORK DAY");
//            case 5:
//                System.out.println("WORK DAY");
//            case 6:
//                System.out.println("WORK DAY");
//                break;
//            case 7:
//                System.out.println("Hi DAY");
//                break;
//            default:
//            System.out.println("default");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

//public class Main {
//
//    public static void main(String[] args) {
//        String s = "jfhkdg";
//        String sl = "lkg";
//        System.out.println(s.equals(sl));
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        String strInt = "123";
//        String strDouble = "123.456";
//        int x;
//        int y;
//        x = Integer.parseInt(strInt);
//        y = Integer.parseInt(strInt);
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        strInt = String.valueOf(x + 1);
//        s
//    }

//public class Main {
//
//    public static void main(String[] args) {
//        int a = 12;
//        int a1[] = {1, 2, 3, 4, 5};
//        for (int i = 0; i < a1.length; i++) {
//            System.out.println(a1[i]);
//        }
//        for (int i : a1) {
//            System.out.println(i);
//            for (int i = a1.length - 1; i >=0; i --){
//                System.out.println(a1[1]);
//            }
//        }
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        int a=12;
//        int a1[][]= {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//        int sum = 0;
//        int sum1 =0;
//        System.out.println(Arrays.deepToString(a1));
//        System.out.println(a1[2][2]);
//for (int[] ints : a1) {
//
//}
//
//        public class Main {
//
//            public static void main(String[] args) {
//                int a[] = {1, 2, 3, 4, 5, 6, 7};
//                reversArr(a);
//                System.out.println(a);
//
//            }
//
//            private static void reversArr(int[] a) {
//                for (int i = 0; i < a.length/2; i++) {
//                    int temp=a[i];
//                    a[1] = a[a.length -1 - i];
//                    a[a.length - 1 - i] = temp;
//                }
//            }
//        }
public class Main {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = a1.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) ;
            if (a1[j] > a[j + 1]) {
                int temp = a1[j];
                a1[j] = a1[j + 1];
                a1[j + 1] = temp;
            }

        }
    }
}

