package com.company;

 class ChildClass extends BasicClass {
    String name;

    public void set_name(String name){
        this.name = name;
    }

    @Override public String get_age(){
        return  name;
    }

    public ChildClass(){super();}
}
