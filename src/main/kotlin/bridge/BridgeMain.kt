package bridge

import bridge.practice.FileDisplayImpl
import bridge.practice.RandomDisplay
import kotlin.random.Random

fun main(args: Array<String>) {
    val d1: Display = Display(StringDisplayImpl("Display - Display"))
    val d2: Display = CountDisplay(StringDisplayImpl("Display - Count Display"))
    val d3: CountDisplay = CountDisplay(StringDisplayImpl("Count Display - Count Display"))
    val d4: RandomDisplay = RandomDisplay(StringDisplayImpl("Random Display"))
    val d5: Display = Display(FileDisplayImpl("/Users/ho2ri/IdeaProjects/design-pettern/src/main/kotlin/bridge/practice/file.txt"))
    d1.display()
    d2.display()
    d3.multiDisplay(5)
    d4.randomDisplay(5)
    d5.display()
}

// 課題1 このプログラムに追加する形でランダム回数表示する処理を実現してください。
// 課題2 このプログラムにテキストファイルの内容を表示する処理を追加してください。

/**
 * 抽象
 *  どういう風に具体的に○○するか -> 実装
 *  何をするか -> 機能
 * 現状
 *  渡された文字列を+と-で囲む（具体） -> 実装
 *  表示する -> 機能
 */