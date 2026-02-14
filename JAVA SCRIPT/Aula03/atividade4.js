const input = require("../input");

(async () => {
    console.log("quer ganhar um presente misterioso ( sim ou não)? ");
    let resposta = await input();
    
    if(resposta.toLowerCase() == "sim"){
        console.log("voce recebeu um abraço")
    }else{
        if(resposta.toLowerCase() == "nao"){
        console.log("voce ganha 50,00")
        }else{
         console.log("digite somente ( sim ou não )")
        }
}    
})();