class  BankAccount(private var balance: Double, var accountHolder: String) {
    fun deposit(amount: Double){
        balance += amount
    }
    fun withdraw(amount: Double){
        if(amount < balance){
            balance -= amount
        }else {
            println("Não foi possível fazer a retirada")
        }
    }
    fun get_balance(){
        println("O valor disponível na conta do(a) $accountHolder: $balance")
    }
    fun set_balance(setAmount: Double){
        println("Você deseja fazer uma retirada ou um depósito?")
        var type: String = readln()
        if(type == "Depósito" || type == "deposito" || type == "depósito"){
            deposit(setAmount)
            println("Novo saldo: $balance")
        }else if(type == "retirada" || type == "Retirada" || type == "RETIRADA"){
            withdraw(setAmount)
            println("Novo saldo: $balance")
        }else {
            println("Opção inválida")
        }
    }
}

fun main() {
    val accountUser: BankAccount = BankAccount(10000.0, "Rogério")
    accountUser.get_balance()
    accountUser.set_balance(3000.0)
}