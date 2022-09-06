class Department {
    private var department_num : Int? = null
    private var department_name : String? = null
    var emp_list : ArrayList<Employee> = ArrayList<Employee>()

    constructor()
    constructor(department_num: Int, department_name: String ) {
        this.department_num = department_num
        this.department_name = department_name
    }

    fun add_emp(e : Employee){
        emp_list.add(e)
    }
    fun remove_emp (idx : Int){
        emp_list.removeAt(idx)
    }
    fun emp_count(){
        println(emp_list.size)
    }
    fun print_basic_data(){
        for (i in emp_list){
            println(i.toString())
        }
    }

    fun print_all_details(){
        for (i in emp_list){
            if (i is Salaried_Employee){
                i as Salaried_Employee
                i.display_all_data()
            }else if (i is Hourly_Employee){
                i as Hourly_Employee
                i.display_all_data()
            }else if (i is Commission_Employee){
                i as Commission_Employee
                i.display_all_data()
            }else if (i is Base_Plus_Commission_Employee){
                i as Base_Plus_Commission_Employee
                i.display_all_data()
            }
        }
    }



    fun print_all_earnings(){
        for (i in emp_list){
            if (i is Salaried_Employee){
                i as Salaried_Employee
                println(i.earning())
            }else if (i is Hourly_Employee){
                i as Hourly_Employee
                println(i.earning())
            }else if (i is Commission_Employee){
                i as Commission_Employee
                println(i.earning())
            }else if (i is Base_Plus_Commission_Employee){
                i as Base_Plus_Commission_Employee
                println(i.earning())
            }
        }
    }

}