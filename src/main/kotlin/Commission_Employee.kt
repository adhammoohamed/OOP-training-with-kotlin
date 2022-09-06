open class Commission_Employee : Employee , Displayable{
    private var gross_sales : Double? = null
    private var commission_rate : Double? = null
    override var fax: Int? = null
    override var company_name: String? = null

    constructor()
    constructor(
        name2: String,
        ssn2: Int,
        address2: String,
        gender1: Gender,
        gross_sales: Double?,
        commission_rate: Double?,
    ) : super(name2, ssn2, address2, gender1) {
        this.gross_sales = gross_sales
        this.commission_rate = commission_rate

    }

    override fun earning(): Double {
        return (gross_sales!! * commission_rate!!)
    }

    override fun display_all_data() {
        println(super.toString())
        println("""
            Gross sales = $gross_sales
            Commission rate = $commission_rate
            ----------------------
        """.trimIndent())
    }

    override fun display_earing() {
        println(earning())
    }

    fun set_com_rate(cr : Double){
        commission_rate = cr
    }
    fun get_com_rate() : Double{
        return commission_rate!!
    }
    fun set_gross(gross : Double){
        gross_sales = gross
    }

    fun get_gross() : Double{
        return gross_sales!!
    }
}