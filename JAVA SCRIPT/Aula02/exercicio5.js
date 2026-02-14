//  Contar Caracteres da Frase
//  
//  Peça ao usuário uma frase e mostre quantos caracteres ela tem.
//
//  Exemplo:
//  Entrada: "Shinier acelera startups"
//  Saída: "Sua frase tem 26 caracteres."

//  Método útil: .length


const input = require("../input");

(async () => {

    console.log ("DIGITE UMA FRASE: ");
    let f1 = await input();

    let frase = f1.length

   
    console.log ( `A FRASE: \t ${f1}, \n TEM ${frase} CARACTERES.`);

})();