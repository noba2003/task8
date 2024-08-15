//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var account1 = Account().apply {
        setName("ahmed")
        setAddress("cairo")
        setPhone("0101121552")
        setEmail("ahmed@example.com")
        setId("1212")
        setPassword("1235")
    }
// يشيك علي الحساب في قواعد البيانات ثم يدخلة علي السييتم عن طريق تغيير قيمة isLogin
    account1.loginSystem(account1.getName(), account1.getPassword())

// يشيك علي القيمة ان كانت موجبه فهو ايداع ان كانت سالبة سحب

    account1.transfer(10.0)
    // عرض الرصيد بعد الايداع
    println(account1.getBalane())
    account1.transfer(-3.0)
    // عرض الرصيد بعد الخصم

    println(account1.getBalane())
    account1.logoutSystem()
    println(account1.getBalane())
    println("===============")
    val emp =Employee().apply {
        setName("ali")
        setAge(25)

        setnumChildren(3)
        setSocialStatus(true)
        setHireDate(6)
    }
    //الصلاحية للمدير فقط الاسم ahmed
    emp.setSalary(1000.0,"ahmed")
    println(emp.getSalary())

}