package examples.generics_types;

public class GenericsType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {

        GenericsType<String> genericsType = new GenericsType<>();
        genericsType.set("GauravK"); //valid

        System.out.println(genericsType.get());

        GenericsType genericsType1 = new GenericsType(); //raw type
        genericsType1.set("Gaurav"); //valid
        System.out.println(genericsType1.get());
        genericsType1.set(10); //valid and autoboxing support
        System.out.println(genericsType1.get());
    }
}