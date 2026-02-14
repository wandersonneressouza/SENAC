//  3) Substituir Palavras
//
//  Peça ao usuário digitar uma frase contendo a palavra "startup" e substitua por "empresa".
//
//  Exemplo:
//  Entrada: Estou montando uma startup de tecnologia
//  Saída: Estou montando uma empresa de tecnologia
//  
//  Método útil: replace("busca", "troca")

const input = require(`../input`);

(async () => {

    console.log ("Digite uma frase com a palavra startup:");
    let frase = await input();

    console.log (frase.replace("startup","empresa"));
    

})();