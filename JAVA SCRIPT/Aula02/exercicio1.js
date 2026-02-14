const input = require("../input");

(async () => {
    console.log (" Qual seu nome ? ");
    let nome = await input();
    console.log (" Qual seu sobrenome ? ");
    let sobrenome = await input();

    let letra = sobrenome[0].toUpperCase();
    let minusculo = nome.toLowerCase();
    let restonome = minusculo [0].toUpperCase() + minusculo.slice(1);


    console.log (`Ola ${letra}. ${restonome}.`);


})();


//let palavra = "neres";
//let maiusculo = palavra.toUpperCase()

//console.log (maiusculo)