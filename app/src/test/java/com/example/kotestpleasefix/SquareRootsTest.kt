package com.example.kotestpleasefix

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SquareRootsTest : FunSpec({
    context("square roots") {
        forAll(
            row(2, 4),
            row(3, 9),
            row(4, 17), // This line fails
            row(5, 25),
        ) { root, square ->
            root * root shouldBe square
        }
    }
})