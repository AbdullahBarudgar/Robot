import java.util.*
fun main() {
    try {
     println("\n------====HI!! My Name is Jerry , I am your robot====---------\n")

        // Robot will automatically take current time ,date and day , Take decision according to it

        val currentDate = Calendar.getInstance()
        var date = currentDate.get(Calendar.DAY_OF_MONTH)
        var day = when (date) {
            1, 8, 16, 23, 30 -> "Sunday"
            2, 9, 17, 24, 31 -> "Monday"
            3, 10, 18, 25 -> "Tuesday"
            4, 7, 11, 19, 26 -> "Wednesday"
            5, 12, 20, 27 -> "Thursday"
            6, 13, 21, 28 -> "Friday"
            else -> {
                "Saturday"
            }
        }
        var timee = currentDate.get(Calendar.HOUR_OF_DAY)

// Now we initialise the robot class

        val robot = Robot(day, timee)

// Now we call the functions from using object we declared above

        robot.ringTheAlarm(day, timee)
        robot.makeCoffee(day)
        robot.heatTheWater(80.00, day)
        robot.packYourBag(day)
        robot.cookBreakfastAndLunch(timee)
        robot.ironTheCloths(day)
    }catch(e : Exception) {
        println("ERROR !!!---Battery is Low ")
    }
}