package fZero.fZero99TT.repository

import org.hibernate.engine.spi.SharedSessionContractImplementor
import org.hibernate.id.IdentifierGenerator
import java.io.Serializable
import kotlin.random.Random.Default.nextLong

class MyGenerator: IdentifierGenerator {
    val name: String = "randomGenerator"
    override fun generate(p0: SharedSessionContractImplementor?, p1: Any?): Serializable {
        return nextLong()
    }
}