class Salaried_Employee : Employee , Displayable{
    private var salary : Double ? = null
    private var bonus : Double ? = null
    private var deductions : Double ? = null

    constructor()

    constructor(
        na : String ,
        ssn : Int ,
        add : String ,
        gen :Gender ,
        salary1 : Double ,
        bonus1 : Double ,
        deductions1 : Double
    ) : super(na , ssn , add ,gen){
        salary = salary1
        bonus = bonus1
        deductions = deductions1

    }

    constructor(
        name2: String,
        ssn2: Int,
        address2: String,
        gender1: Gender,
        salary: Double?,
        bonus: Double?,
        deductions: Double?,
        company_name: String?,
        fax: Int?
    ) : super(name2, ssn2, address2, gender1) {
        this.salary = salary
        this.bonus = bonus
        this.deductions = deductions
        this.company_name = company_name
        this.fax = fax
    }

    override var company_name: String? = null
    override var fax: Int? = null

    fun set_company_name(name:String){
        company_name = name
    }

    fun get_company_name():String{
    return company_name!!
    }

    fun set_fax(fax1 : Int){
        fax = fax1
    }

    fun get_fax ():Int {
        return fax!!
    }

    override fun display_all_data() {
        println(super.toString())
        println("""
            Bonus : $bonus
            Deductions : $deductions
            -----------------
        """.trimIndent())
    }



    override fun display_earing() {
        println(earning())
    }

    override fun earning() : Double {
        var calc : Double = (salary!! + bonus!!) - deductions!!
        return calc
    }


}