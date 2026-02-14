//  3. Tamanho do lanche / combo (trabalhar com strings)
//  Crie um programa que peça o tamanho do combo: P, M ou G.
//  Converta a entrada para maiúsculo (ex.: tamanho.toUpperCase()).
//  Use switch(tamanho) para:
//  ○	P: "Combo Pequeno escolhido (R$ 15.00)."
//  ○	M: "Combo Médio escolhido (R$ 20.00)."
//  ○	G: "Combo Grande escolhido (R$ 25.00)."
//  ○	default: "Tamanho inválido."


const input = require("../input");

(async () => {

    console.log("🍽️    SEJA BEM VINDO, ESCOLHA O TAMANHO DA SUA FOME    🍴\n            😊    P, M ou G    😂")
    let tamanho = await input();
    
    switch(tamanho.toUpperCase()){
        case "P":
            console.log (" VC ESCOLHEU P (R$ 15.00) ");
        break
        case "M":
            console.log (" VC ESCOLHEU M (R$ 20.00) ");
        break
        case "G":
            console.log (" VC ESCOLHEU G (R$ 25.00) ");
        break
        default:
            console.log("OPÇÃO INVALIDA ");

        }

})();