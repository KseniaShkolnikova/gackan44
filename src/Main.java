import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vibor = 0;
        System.out.println("----------------- Математика -----------------\n");
        while (vibor != 13){
            System.out.println("Выберите фигуру: \n  1.Круг\n  2.Квадрат\n  3.Треугольник\n  4.Пятиугольник\n  5.Трапеция\n  6.Прямоугольник\n  7.Параллелограмм\n  8.Параллелепипед\n  9.Цилиндр\n  10.Сфера\n  11.Ромб\n  12.Конус \n  13.Выйти");
            vibor = scanner.nextInt();
            Chet Chet = null;
            switch (vibor) {
                case 1:
                    System.out.println("Введите радиус: ");
                    double radius = scanner.nextDouble();
                    Chet = new crug(radius);
                    break;
                case 2:
                    System.out.println("Введите сторону: ");
                    double dlina = scanner.nextDouble();
                    Chet = new cvadrat(dlina);
                    break;
                case 3:
                    System.out.println("Введите сторону: ");
                    double _1storona = scanner.nextDouble();
                    System.out.println("Введите высоту: ");
                    double visota = scanner.nextDouble();
                    System.out.println("Введите 2 сторону: ");
                    double _2storona = scanner.nextDouble();
                    System.out.println("Введите 3 сторону: ");
                    double _3storonа = scanner.nextDouble();
                    Chet = new treugol(_1storona, visota, _2storona, _3storonа);
                    break;
                case 4:
                    System.out.println("Введите высоту: ");
                    visota = scanner.nextDouble();
                    System.out.println("Введите сторону: ");
                    _1storona = scanner.nextDouble();
                    Chet = new patiugol(visota, _1storona);
                    break;
                case 10:
                    System.out.println("Введите радиус: ");
                    radius = scanner.nextDouble();
                    Chet = new sfera(radius);
                    break;
                case 5:
                    System.out.println("Введите 1 сторону: ");
                    _1storona = scanner.nextDouble();
                    System.out.println("Введите 2 сторону: ");
                    _2storona = scanner.nextDouble();
                    System.out.println("Введите 3 сторону: ");
                    double _3storona = scanner.nextDouble();
                    System.out.println("Введите 4 сторону: ");
                    double _4storona = scanner.nextDouble();
                    System.out.println("Введите высоту: ");
                    visota = scanner.nextDouble();
                    Chet = new trap(_1storona, _2storona, _3storona, _4storona, visota);
                    break;
                case 6:
                    System.out.println("Введите 1 сторону: ");
                    _1storona = scanner.nextDouble();
                    System.out.println("Введите 2 сторону: ");
                    _2storona = scanner.nextDouble();
                    Chet = new pramug(_1storona, _2storona);
                    break;
                case 7:
                    System.out.println("Введите высоту: ");
                    visota = scanner.nextDouble();
                    System.out.println("Введите 1 сторону: ");
                    _1storona = scanner.nextDouble();
                    System.out.println("Введите 2 сторону: ");
                    _2storona = scanner.nextDouble();
                    Chet = new paralel(visota, _1storona, _2storona);
                    break;
                case 11:
                    System.out.println("Введите 1 сторону: ");
                    _1storona = scanner.nextDouble();
                    System.out.println("Введите 1 диагональ: ");
                    double _1diag = scanner.nextDouble();
                    System.out.println("Введите 2 диагональ: ");
                    double _2diag = scanner.nextDouble();
                    Chet = new romb(_1storona, _1diag, _2diag);
                    break;
                case 8:
                    System.out.println("Введите длину: ");
                    dlina = scanner.nextDouble();
                    System.out.println("Введите ширину: ");
                    double shirina = scanner.nextDouble();
                    System.out.println("Введите высоту: ");
                    visota = scanner.nextDouble();
                    Chet = new paralelepip(dlina, shirina, visota);
                    break;
                case 9:
                    System.out.println("Введите радиус: ");
                    radius = scanner.nextDouble();
                    System.out.println("Введите высоту: ");
                    visota = scanner.nextDouble();
                    Chet = new cilindr(radius, visota);
                    break;
                case 12:
                    System.out.println("Введите радиус: ");
                    radius = scanner.nextDouble();
                    System.out.println("Введите образующую: ");
                    double obraz = scanner.nextDouble();
                    Chet = new konus(radius, obraz);
                    break;
                case 13:
                    System.out.println("-------------Пока-------------");
                    System.exit(0);
                default:
                    break;
            }
            if (Chet != null){
                System.out.println("Площадь: "+ Chet.Ploshad() +"\nПериметр: "+ Chet.Perimetr()+"\n----------------------------------------------\n");
            }

        }

    }
}