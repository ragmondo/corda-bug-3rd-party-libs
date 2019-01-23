package com.template.states

import com.template.contracts.TemplateContract
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.ContractState
import net.corda.core.identity.AbstractParty
import org.joda.money.Money

// *********
// * State *
// *********
@BelongsToContract(TemplateContract::class)
data class TemplateState(val data: String, val money: Money = Money.parse("USD 0"),  override val participants: List<AbstractParty> = listOf()) : ContractState
