public  class RegExClass {
    public static String Template;
    public RegExClass(String Template){
        this.Template = Template;
    }
    public static void IsMatchTemplate(String Input){
        System.out.println(Input.matches(Template));
    }
    public static void main(String[] args) {
        RegExClass CapWord = new RegExClass("^[A-Z]+$");
        CapWord.IsMatchTemplate("BMW");

        RegExClass PhoneReg = new RegExClass("^\\s*(?:\\+?(\\d{1,3}))?([-. (]*(\\d{3})[-. )]*)?((\\d{3})[-. ]*(\\d{2,4})(?:[-.x ]*(\\d+))?)\\s*$");
        PhoneReg.IsMatchTemplate("+380963602200");
    }

}