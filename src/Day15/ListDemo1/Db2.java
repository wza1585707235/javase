package Day15.ListDemo1;

class DbTest2 extends Db{
    int i = 30;


    int k = 40;


    void f() {


        System.out.print("" + i);


    }


    void g() {


        System.out.print("" + k);


    }


    public static void main(String[] args) {


        Db d = new DbTest2();


        System.out.println(d.i);


        d.f();


        DbTest2 d2 = (DbTest2) d;


        System.out.println(d2.i);


        d2.f();


    }
}
