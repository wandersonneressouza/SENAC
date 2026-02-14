//parseInt - tranforma a entrada NUMERO em Numero inteiro. (expl  1,5 --- 1)
//



let prompt = require("prompt-sync")()
let resposta = 0
let numero 
let tentativa = 0 

    resposta = Math.floor(Math.random()*10);

while(tentativa != 3){
    
    

    tentativa ++ 
    
    numero = parseInt (prompt (" \n DIGITE UM NUMERO : "))

    if(numero == resposta){
        console.log("\n PARABENS, VC ACERTOU 👍 \n ")
        break
    }else if( tentativa == 3){
        console.log ( "\n TENTATIVAS ACABARAM \n ")
        console.log (`\n O NUMERO ERA ${resposta} \n `)
        break
    }else{
        console.log("\n VC ERROU 👎 \n ")
    }
             
}