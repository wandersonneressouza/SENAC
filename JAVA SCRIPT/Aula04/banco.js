const input = require("../input");

// atividade bancaria

(async () => {

    let saldo = 300

    console.log("Bem-vindo ao NERES'BANK 💸 ");
    console.log(" Digite 1 para DEPOSITA ou 2 para SACAR: ");
    let resposta = await input()

    console.log("Digite o valor: ")
    let valor = Number(await input())

    if (resposta == "1") {
        if (valor <= 0.99) {
            console.log("VALOR NEGADO");
            return
        }
        else {
            saldo += valor 
        }        
            }
    else if (resposta == "2") {
        if(valor => saldo ){
            saldo -= valor
        }
        else{
            console.log("SALDO INSULFICIENTE")
            return
        }
        
    }

    console.log("Operaçao realizada com sucesso!")
    console.log(`Valor atual na conta: R$ ${saldo}`)


})();