class Hourly_Employee : Employee , Displayable {
    private var hour_rate : Double? = null
    private var num_of_hours : Int? = null
    override var fax: Int? = null
    override var company_name: String? = null
    constructor()

    constructor(
        name2: String,
        ssn2: Int,
        address2: String,
        gender1: Gender,
        hour_rate: Double?,
        num_of_hours: Int?,
    ) : super(name2, ssn2, address2, gender1) {
        this.hour_rate = hour_rate
        this.num_of_hours = num_of_hours

    }

    fun set_hour_rate(hour_rate: Double){
        this.hour_rate = hour_rate
    }

    fun set_num_of_hours(num_of_hours: Int){
        this.num_of_hours = num_of_hours
    }

    fun get_hour_rate() : Double{
        return hour_rate!!
    }

    fun get_num_of_hours() : Int{
        return num_of_hours!!
    }

    override fun earning(): Double {
        return (num_of_hours!! * hour_rate!!).toDouble()
    }

    override fun display_all_data() {
        println(super.toString())
        println("""
            Hour rate = $hour_rate
            Number of hours = $num_of_hours
            ------------------
        """.trimIndent())
    }

    override fun display_earing() {
        println(earning())
    }

}