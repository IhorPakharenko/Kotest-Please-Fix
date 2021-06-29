package com.example.kotestpleasefix

import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest : FreeSpec({
    "Pythag triples tests" - {
        withData(
            nameFn = { "s" },
            Triple(3, 4, 5),
            Triple(6, 8, 10),
            Triple(8, 1, 17),
            Triple(7, 2, 28), // This line fails
        ) { (a, b, c) ->
            a * a + b * b shouldBe c * c
        }
    }

    "square roots" - {
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