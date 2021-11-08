package SistemaRH

import kotlin.math.min

abstract class Funcionario (val primeiroNome: String, val ultimoNome: String,
                            val registro: Int, var idade: Int, var diasTrabalhados: Int,
                            var diasFerias: Int, var salario: Double, var anosTrabalhados: Int
) {

    fun tempoAteAposentadoria(): Int {
        return min(60 - idade, 40 - anosTrabalhados)
    }

    fun tempoAteFimDasFerias(): Int {
        return (diasTrabalhados/360)*(30 - diasFerias)
    }

    fun calcularBonus(): Double {
        return 2.2*salario
    }
}
