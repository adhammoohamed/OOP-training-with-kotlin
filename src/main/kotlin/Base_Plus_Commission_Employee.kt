class Base_Plus_Commission_Employee : Commission_Employee {
    private var base : Double? = null

    constructor()
    constructor(
        name2: String,
        ssn2: Int,
        address2: String,
        gender1: Gender,
        gross_sales: Double?,
        commission_rate: Double?,
        base: Double?
    ) : super(name2, ssn2, address2, gender1, gross_sales, commission_rate) {
        this.base = base
    }

    fun set_base(base : Double){
        this.base = base
    }

    fun get_base () : Double{
        return base!!
    }

    override fun earning() : Double{
        return (base!! + super.earning())
    }

    override fun display_earing() {
        println(earning())
    }

    override fun display_all_data() {
        println(super.display_all_data())
        println("""
            Base = $base 
            --------------------
        """.trimIndent())
    }
}