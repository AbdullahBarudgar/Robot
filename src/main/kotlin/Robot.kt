class Robot(var name : String = "Jerry" ,var time : Int =8 , var day : String ="Monday") {

    // Task : Ring The Alarm

fun ringTheAlarm(day : String , time : Int) {
    this.time = time
    this.day=day
    println(
        when (day) {
            "Saturday" -> "\nAlarm is not ringing"
            "Sunday" -> "\nAlarm is not ringing"
            else -> {
                "\nAlarm is ringing"
            }
        }
    )
}

// Task : Make Coffee
fun makeCoffee(day : String ){
var blackcoffeeingridient=listOf("Hot Water","1.5 teaspoon Sugar","Coffee Beans")
var    milkcoffeeingridient=listOf("Hot Water","1.0 teaspoon Sugar","Coffee Beans","Milk")
println(when(day){
"Monday","Tuesday","Wednesday","Thursday" ->"\nSir, Your Black Coffee make using ${blackcoffeeingridient.toString()} is ready,Serving Hot"
"Friday","Saturday","Sunday" ->"\nSir,Your MilkCoffee make using ${milkcoffeeingridient.toString()} is ready,Serving Hot"
else -> {"\nSir , Please Suggest Which type of coffee you need"}
})
}

//Task : Heat the water
fun heatTheWater(watertemp : Double ,day : String) {
    this.day = day
    println(
        when (day) {
            "Sunday" -> "\nNot taking bath"
            "Saturday" -> "\nNot taking bath"
            else -> {
                "\nSir , Your water is ready with $watertemp C"
            }
        }
    )
}
//Task : Pack Your Bag
fun packYourBag( day : String ) {
    this.day=day
var monday=mutableListOf("Computer Network","Compiler Design","Spoken English")
    var tuesday=mutableListOf("Computer Network","Compiler Design","Spoken English")
    var wednesday=mutableListOf("Deep Learning","Artificial Intelligence","Sports")
    var thursday=mutableListOf("Computer Network ","Cyber Law","Spoken English")
    var friday=mutableListOf("Cyber Law","Compiler Design","Artificial Intelligence")

println(when(day){
"Monady" ->"\nSir , Today is $day ,Your timetable is : ${monday.toString()} so according that I pack your bag"
"Tuesday" ->"\nSir , Today is $day ,Your timetable is : ${tuesday.toString()} so according that I pack your bag"
"Wednesday" ->"\nSir , Today is $day ,Your timetable is : ${wednesday.toString()} so according that I pack your bag"
"Thursday" ->"\nSir , Today is $day ,Your timetable is : ${thursday.toString()} so according that I pack your bag"
"Friday" ->"\nSir , Today is $day ,Your timetable is : ${friday.toString()} so according that I pack your bag"
else->{"\nSir , Today is $day , Holiday"}
})
}

// Task :Cook BreakFast and Lunch

fun cookBreakfastAndLunch(time : Int){
this.time=time
var breakfast=mutableListOf("Bread and Omelet","Aloo ka paratha","Tea and Biscuit","Poha and Tea","Pav Bhaji","Pizza and Pasta")
var lunch=mutableListOf("Dal and Rice","Meat","Chicken","Vegetable and Fruits","PotatoCapsicum with tortilla","Swarma")

println(when(time){
in 6..12 -> "\nSir , Your Breakfast is ready with ${breakfast.random() }, ENJOY !!!"
in 12..17->  "\nSir , Your Lunch is ready with ${lunch.random() }, ENJOY !!!"
else->{"\nBreakfast and Lunchtime is over"}
})
}

// Task : Iron the cloths

fun ironTheCloths(day : String){
this.day=day
println(when(day){
"Monday","Tuesday","Wednesday","Thursday","Friday" -> "\nSir,Your Cloth Formal Suite is ready with iron , what you suggest before bath"
else ->{"\nSir,Your Casual Cloth  is ready with iron , which you suggest before bath"}
})
}
}