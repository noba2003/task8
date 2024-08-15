class Account {

    private var id: String = ""
    private var name: String = ""
    private var email: String = ""
    private var phone: String = ""
    private var address: String = ""
    private var balance: Double = 0.0
    private var password: String = ""
    private var isLogin: Boolean = false
    fun getId(): String {
        return this.id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getEmail(): String {
        return this.email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getPhone(): String {
        return this.phone
    }

    fun setPhone(phone: String) {
        this.phone = phone
    }

    fun getAddress(): String {
        return this.address
    }

    fun setAddress(address: String) {
        this.address = address
    }

    fun getPassword(): String {
        return this.password
    }

    fun setPassword(password: String) {
        this.password = password
    }

     fun getBalane(): String {
        var message = ""
        if (!isLogin) {
            return "Login failed. Please check your username and password"
        }
        return "Your balance is: ${this.balance}"
    }



    fun loginSystem(id: String, password: String): String {
        // check id and password in database

        if (id.isNotEmpty() && password.length == 4) {
            this.isLogin = true

        }

        return "You are logged in. Your balance is: ${this.balance} "
    }

    fun logoutSystem() {
        this.isLogin = false
    }

    private fun addBalane(balane: Double) {
        this.balance += balane
    }

    private fun debitBalance(balance: Double): String {
        var message = ""
        if (this.balance > balance) {
            this.balance += balance
            message = "your balance is: ${this.balance}"
        } else {
            message = "sorry Insufficient balance"
        }
        return message
    }

    fun transfer(amount: Double): String {
        if (!isLogin) {
            return "Login failed. Please check your username and password"
        } else
            if (amount > 0.0) {
                addBalane(amount)

            } else
                if (amount <= 0.0) {
                    debitBalance(amount)

                }
        return "your balance is: $balance"
    }


}