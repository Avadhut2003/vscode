class variabledemo {
    int id;         //Instance variable , also we can define statice too, had default value
    String name;
    //id = 100 not possible 
    void fun(){
        id = 100; //local variable no default value
        System.out.println(id +" "+ name);
    }

    public static void main(String[] args) {
        variabledemo obj = new variabledemo();
        obj.fun();
    }
}
