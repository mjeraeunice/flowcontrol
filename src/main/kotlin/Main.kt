fun main() {
    oddNumbers(arrayOf())
    println(peopleNames(arrayOf("branded","office","oats","tunnel","fashion")))
    party(4)
    party(30)
    party(14)
    buzz(arrayOf())


}
//Create a function that prints out all the odd numbers between 1 and 100.
fun oddNumbers(nums:Array<Int>){
    for(num in 1..100) {
        if (num % 2 != 0) {
            println("$num odd")
        }
    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun peopleNames(names:Array<String>):Int{
    var z = 0
    names.forEach{a->
        if(a.length>5) {
            z++
        }
        }
        return z
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun party(age:Int){
    if(age in 0..6){
        println("serve milk")
    }
    else if(age in 7..15){
        println("serve bottle of fanta")
    }
    else{
        println("coca cola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun buzz(numbers: Array<Int>) {
    for (num in 0..100) {
        if (num % 3 == 0 && num%5==0) {
            println("FizzBuzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else if ( num % 5 == 0) {
            println("Buzz")
        } else {
            println(num)
        }
    }
}

