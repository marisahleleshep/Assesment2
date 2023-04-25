fun main() {
    println(randomString("Begins with vowels"))
    var currentAccount=CurrentAccount("0712345612","school",123)
    println(currentAccount.deposit(12.9))
    println(currentAccount.withdraw(23.0))
    println(currentAccount.details("Hello",45))

    var savingAccount=SavingAccount("712329876","student",78,65)
    println(savingAccount.withdrawals)
    println(savingAccount.withdraw(39.0))

}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.

fun randomString(str: String){
    val firstChar = str.first()
    val lastChar = str.last()
    val length = str.length
    val vowel = firstChar in listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
//    return Triple(firstChar, lastChar, length, Vowel)
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

fun validPassword(password:String){
    var sum=0
    for (i in password){
        if (i<=password )
           sum+=1
    }
    return sum

}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiplication(str: Int):Int{
    var result=0
    for (i in str){
        if (i %6 && i%8<=1000){
            result+=1
        }
        else{
            return result
        }
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
open class CurrentAccount(var number:String,var name:String,var balance:Int){
    fun deposit(amount:Double){
        amount+balance

    }
    open fun withdraw(amount: Double){
        balance-amount

    }
    fun details(x:String,y:Int){
        println("Account number $x and balance $y")

    }

}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingAccount( number:String, name:String, balance:Int,var withdrawals:Int):CurrentAccount(number,name,balance){
    fun withdrawals(){

        println("Is it less than 4")
    }
    override fun withdraw(amount: Double){
        balance-amount

    }

}












