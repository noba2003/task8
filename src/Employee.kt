class Employee {
    private var name: String = ""
    private var age: Int = 0
    private var salary: Double = 0.0
    private var socialStatus: Boolean = false
    private var numChildren = 0

    //val jobTitle: String=""
    //عدد السنوات الخدمة
    private var hireDate: Int = 0
    private val taxes: Double = 0.10
    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }

    fun setAge(age: Int) {}
    fun getAge(): Int {
        return age
    }

    fun setSalary(salary: Double, idManger: String): String {
        if (idManger == "ahmed") {
            if (this.hireDate > 5) {
                this.salary += 1000.0
            }
            if (this.numChildren >= 2) {
                this.salary += 1000.0
            }
            if (this.socialStatus) {
                this.salary += 500.0
            }
            this.salary -=(this.salary*this.taxes)
        }
        return "You do not have permission"
    }

    fun getSalary(): Double {
        return salary
    }

    fun setHireDate(hireDate: Int) {
        this.hireDate = hireDate
    }

    fun getHireDate(): Int {
        return hireDate
    }

    fun setSocialStatus(socialStatus: Boolean) {
        this.socialStatus = socialStatus
    }
    fun getSocialStatus(): Boolean {
        return socialStatus
    }

    fun setnumChildren(numChildren: Int) {
        this.numChildren = numChildren
    }
    fun getnumChildren(): Int {
        return numChildren
    }


}