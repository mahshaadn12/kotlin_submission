class Hero(val name: String) {
    var age: Int = 0
    var height: Double = 0.0

    fun setProfile(age: Int, height: Double) {
        this.age = age
        this.height = height
    }

    fun printProfile() {
        println("Name: $name, Age: $age, Height: $height")
    }

    fun performActivity(activity: String, count: Int) {
        repeat(count) {
            println("$name is $activity")
        }
    }
}

fun main() {
    val hero1 = Hero("Superman")
    val hero2 = Hero("Spider-Man")
    val hero3 = Hero("Batman")
    val hero4 = Hero("Wonder Woman")
    val hero5 = Hero("Iron Man")
    val hero6 = Hero("Hulk")

    hero1.setProfile(30, 190.5)
    hero2.setProfile(25, 180.0)
    hero3.setProfile(35, 175.0)
    hero4.setProfile(28, 170.0)
    hero5.setProfile(40, 185.0)
    hero6.setProfile(33, 200.0)

    println("Profile of Heroes:")
    hero1.printProfile()
    hero2.printProfile()
    hero3.printProfile()
    hero4.printProfile()
    hero5.printProfile()
    hero6.printProfile()

    val activities = mapOf(
        hero1.name to "walk",
        hero2.name to "run",
        hero3.name to "eat",
        hero4.name to "drink",
        hero5.name to "jump",
        hero6.name to "sit"
    )

    activities.forEach { (heroName, activity) ->
        when (heroName) {
            hero1.name -> hero1.performActivity(activity, 2)
            hero2.name -> hero2.performActivity(activity, 4)
            hero3.name -> hero3.performActivity(activity, 2)
            hero4.name -> hero4.performActivity(activity, 2)
            hero5.name -> hero5.performActivity(activity, 7)
            hero6.name -> hero6.performActivity(activity, 4)
        }
    }

    println("\nCurrent Profiles:")
    hero1.printProfile()
    hero2.printProfile()
    hero3.printProfile()
    hero4.printProfile()
    hero5.printProfile()
    hero6.printProfile()
}