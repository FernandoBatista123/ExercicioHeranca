import SistemaRH.GerenteDeVendas
import SistemaRH.RepresentanteDeVendas

fun main(args: Array<String>) {

    val fernando = RepresentanteDeVendas("Fernando", "Batista", 456, 21, 15, 30, 2500.00, 5, 450.0)

    val jose = RepresentanteDeVendas("José", "da Silva", 123, 54, 16, 30, 2600.00, 5, 600.00)

    val reginaldo = RepresentanteDeVendas("Reginaldo", "da Silva", 789, 35, 15, 30, 2800.00, 5, 800.00)

    val felipe = GerenteDeVendas("Felipe", "Batista", 789, 27, 15, 30, 2800.00, 5)

    println("***INFORMAÇÕES FERNANDO***")
    println(fernando.tempoAteAposentadoria())
    println(fernando.tempoAteFimDasFerias())
    println(fernando.calcularBonus())
    println(fernando.calculateComission())
    println("--------------------------")

    felipe.addRepresentanteDeVendas(fernando)
    felipe.addRepresentanteDeVendas(jose)
    felipe.addRepresentanteDeVendas(reginaldo)

    println("\nComissão da equipe toda:")
    felipe.calculateComission()

}

