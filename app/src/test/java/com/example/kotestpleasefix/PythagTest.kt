package com.example.kotestpleasefix

import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*

class PythagTest : FunSpec({
    context("Pythag triples tests") {
        withData(
            Triple(3, 4, 5),
            Triple(6, 8, 10),
            Triple(8, 1, 16), // This line fails
            Triple(7, 2, 28), // This line fails
        ) { (a, b, c) ->
            a * a + b * b shouldBe c * c
        }
    }
})