enum class Gender{male , female}
abstract open class Employee {
    protected var name : String? = null
    protected var Ssn : Int ? = null
    protected var address : String? = null
    var gender : Gender? = null

    constructor()
    constructor(name2 : String , ssn2 : Int , address2 : String , gender1 : Gender){
        name = name2
        Ssn = ssn2
        address = address2
        gender = gender1!!
    }

    fun set_name (name1 : String){
        name = name1!!
    }

    fun set_SSN (ssn : Int){
        Ssn = ssn!!
    }

    fun set_address (address1 : String){
        address = address1!!
    }

    fun get_name () : String {
        return name!!
    }

    fun get_SSN () : Int{
        return Ssn!!
    }

    fun get_address () : String {
        return address!!
    }


    override fun toString(): String {
//        return "Employee(name=$name, Ssn=$Ssn, address=$address, gender=$gender)"
        return """
            Name : ${name}
            SSN : ${Ssn}
            Address : ${address}
        """.trimIndent()
    }

    abstract fun earning() : Double
}