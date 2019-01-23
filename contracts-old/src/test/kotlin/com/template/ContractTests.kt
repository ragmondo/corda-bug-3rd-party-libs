package com.template

import com.template.states.TemplateState
import net.corda.testing.node.MockServices
import org.joda.money.Money
import org.junit.Test
import kotlin.test.assertEquals

class ContractTests {
    private val ledgerServices = MockServices()

    // The VES currency exists in 1.0.1 but not in 0.9
    @Test(expected = org.joda.money.IllegalCurrencyException::class)
    fun VESCurrencyTest() {
        val m = Money.parse("VES 1")
    }
}