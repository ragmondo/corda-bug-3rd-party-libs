package com.template.contracts

import com.template.states.TemplateState
import net.corda.core.contracts.*
import net.corda.core.transactions.LedgerTransaction
import com.template.states.TemplateState as OldTemplateState
// ************
// * Contract *
// ************
class TemplateContract : Contract, UpgradedContractWithLegacyConstraint<OldTemplateState, TemplateState> {
    override val legacyContractConstraint: AttachmentConstraint
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val legacyContract: ContractClassName
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun upgrade(state: OldTemplateState): TemplateState {
        val ts = TemplateState(state.data, state.money)
        ts.javaClass.`package`.implementationVersion
        return ts
    }

    companion object {
        // Used to identify our contract when building a transaction.
        const val ID = "com.template.contracts.TemplateContract"
    }

    // A transaction is valid if the verify() function of the contract of all the transaction's input and output states
    // does not throw an exception.
    override fun verify(tx: LedgerTransaction) {
        // Verification logic goes here.
    }

    // Used to indicate the transaction's intent.
    interface Commands : CommandData {
        class Action : Commands
    }
}