// 4. Desconto por valor da compra (switch(true) com faixas)
// Crie um programa que peça o valor total da compra (totalCompra).
// 1.	Se totalCompra >= 100: "Desconto de 20% aplicado."
// 2.	Se totalCompra >= 50 && totalCompra < 100: "Desconto de 10% aplicado."
// 3.	Se totalCompra >= 20 && totalCompra < 50: "Desconto de 5% aplicado."
// 4.	default: "Sem desconto, valor muito baixo."
// 5.	Mostre o valor final já com o desconto aplicado.
// 


const input = require("../input");

(async () => {

    console.log("OLA, QUAL O VALOR DA SUA COMPRA: ")
    let compra = Number( await input());



switch(true){
        case compra >= 100:
            console.log("Desconto de 20% aplicado "+ (compra - compra * 20/100) );
        break
        
        case compra >= 50:
            console.log("Desconto de 10% aplicado " + (compra - compra * 10/100) );
        break
        case compra >= 20:
            console.log("Desconto de 5% aplicado " + (compra - compra * 5/100) );
        break    
        default:
            console.log("Sem desconto, valor muito baixo");

}


})();