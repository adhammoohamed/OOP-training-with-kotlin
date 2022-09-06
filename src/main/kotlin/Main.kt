fun main(args: Array<String>) {
    var d1 = Department(1 , "Android")
    var se = Salaried_Employee(
        "Adham",
        235 ,
        "Cairo" ,
        Gender.male ,
        10000.0 ,
        500.0 ,
        200.0)

    d1.add_emp(se)

    var hourly = Hourly_Employee("Amr" , 564 , "Giza" , Gender.male , 30.0 , 160)
    d1.add_emp(hourly)

    var commission = Commission_Employee("Mai" , 6876 , "Cairo" , Gender.female , 200.0, 100.0)
    d1.add_emp(commission)

    d1.print_all_details()
    d1.print_all_earnings()
}