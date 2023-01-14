package kotlinTips

import java.lang.Exception
import java.lang.NumberFormatException

enum class GameState {
    PAUSED, STARTED
}

enum class Button {
    RESUME_BUTTON, PAUSE_BUTTON
}

enum class GameDifficulty {
    NOOB, EASY, MEDIUM, HARD, EXPERT
}

fun main() {

    //Returning value with if-else
    val currentState = GameState.STARTED
    val visibleButton = if (currentState == GameState.PAUSED) Button.RESUME_BUTTON else Button.PAUSE_BUTTON

    println("VISIBLE BUTTON: $visibleButton")


    //Returning value with when
    val currentGameScore = 50;
    val gameDifficulty = when{
        currentGameScore<=10 -> GameDifficulty.NOOB
        currentGameScore<=25 -> GameDifficulty.EASY
        currentGameScore<=50 -> GameDifficulty.MEDIUM
        currentGameScore<=80 -> GameDifficulty.HARD
        else-> GameDifficulty.EXPERT
    }

    println("GAME DIFFICULTY: $gameDifficulty")


    //Returning Value with try catch
    val score = "20.0"

    val result:Any = try {
        score.toInt()
    }catch (e:NumberFormatException){
        score.toFloat()
    }catch (e:Exception){
        e
    }
    println("Result = $result")

}