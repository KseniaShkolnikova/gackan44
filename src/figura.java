abstract class Chet{
    public  abstract double Perimetr();
    public  abstract double Ploshad();
}
class crug extends Chet{
    private double radius;
    public crug(double radius) {
        this.radius = radius;
    }
    public double Ploshad() {
        return Math.PI * Math.pow(radius,2);
    }
    public double Perimetr() {
        return 2*Math.PI *radius;
    }
}
class cvadrat extends Chet {
    private double dlina;

    public cvadrat(double dlina) {
        this.dlina = dlina;
    }

    public double Ploshad() {
        return Math.pow(dlina, 2);
    }

    public double Perimetr() {
        return dlina * 4;
    }
}
class treugol extends Chet{
    private double _1storona;
    private double visota;
    private double _2storona;
    private double _3storonа;
    public treugol(double _1storona,double visota,double _2storona,double _3storonа) {
        this._1storona = _1storona;
        this.visota = visota;
        this._2storona = _2storona;
        this._3storonа = _3storonа;
    }
    public double Ploshad() {
        return 0.5*_1storona*visota;
    }
    public double Perimetr() {
        return _1storona+_2storona+_3storonа;
    }
}
class patiugol extends Chet{
    private double visota;
    private double _1storona;
    private double Perimetr;
    public patiugol(double visota,double _1storona) {
        this.visota = visota;
        this._1storona = _1storona;
    }
    public double Perimetr() {
        Perimetr = _1storona*5;
        return Perimetr;
    }
    public double Ploshad() {
        return 0.5 + Perimetr+visota;
    }
}
class trap extends Chet{
    private double _1storona;
    private double _2storona;
    private double _3storona;
    private double _4storona;
    private double visota;
    public trap(double _1storona,double _2storona,double _3storona,double _4storona,double visota) {
        this._1storona = _1storona;
        this._2storona = _2storona;
        this._3storona = _3storona;
        this._4storona = _4storona;
        this.visota = visota;
    }
    public double Ploshad() {
        return 0.5 * (_1storona + _2storona)*visota;
    }
    public double Perimetr() {
        return _1storona+_2storona+_3storona+_4storona;
    }
}
class pramug extends Chet{
    private double _1storona;
    private double _2storona;
    public pramug(double _1storona,double _2storona) {
        this._1storona = _1storona;
        this._2storona = _2storona;
    }
    public double Ploshad() {
        return _1storona* _2storona;
    }
    public double Perimetr() {
        return _1storona*2+_2storona*2;
    }
}
class paralel extends Chet{
    private double visota;
    private double _1storona;
    private double _2storona;
    public paralel(double visota,double _1storona,double _2storona) {
        this.visota = visota;
        this._1storona = _1storona;
        this._2storona = _2storona;
    }
    public double Ploshad() {
        return _1storona*visota;
    }
    public double Perimetr() {
        return 2*(_1storona+_2storona);
    }
}
class paralelepip extends Chet{
    private double dlina;
    private double shirina;
    private double visota;
    public paralelepip(double dlina,double shirina,double visota) {
        this.dlina = dlina;
        this.shirina = shirina;
        this.visota = visota;
    }
    public double Ploshad() {
        return 2*(dlina*shirina+shirina*visota+ visota*dlina);
    }
    public double Perimetr() {
        return (dlina+shirina+visota)*4;
    }
}
class cilindr extends Chet{
    private double radius;
    private double visota;
    public cilindr(double radius,double visota) {
        this.radius = radius;
        this.visota = visota;
    }
    public double Ploshad() {
        return 2*Math.PI*Math.pow(radius,2)+2*Math.PI*radius*visota;
    }
    public double Perimetr() {
        return 2*visota+4*radius;
    }
}
class sfera extends Chet{
    private double radius;
    public sfera(double radius) {
        this.radius = radius;
    }
    public double Ploshad() {
        return 4*Math.PI * Math.pow(radius,2);
    }
    public double Perimetr() {
        return 0;
    }
}
class romb extends Chet{
    private double _1storona;
    private double _1diag;
    private double _2diag;
    public romb(double _1storona,double _1diag,double _2diag) {
        this._1storona = _1storona;
        this._1diag = _1diag;
        this._2diag = _2diag;
    }
    public double Ploshad() {
        return 0.5*_1diag*_2diag;
    }
    public double Perimetr() {
        return 4*_1storona;
    }
}
class konus extends Chet{
    private double radius;
    private double obraz;
    public konus(double radius,double obraz) {
        this.radius = radius;
        this.obraz = obraz;
    }
    public double Ploshad() {
        return Math.PI*Math.pow(radius,2)+Math.PI*radius*obraz;
    }
    public double Perimetr() {
        return 0;
    }
}


