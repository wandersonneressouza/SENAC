const input = require("../input");

(async () =>{
    console.log ("coloque um saldo na conta");
    let saldo  = Number ( await input());
    
    if(isNaN(saldo)){
        console.log("Saldo deve ser um número");
    }else{
        console.log ("coloque um número do produto");
        let produto = Number ( await input()) 

        if(isNaN(produto)){//isso não é um número
            console.log("isso é uma letra")
        }else if(saldo > 5 && produto == 42 ){
            console.log ("voce ganhou uma coca-cola");
        }else{
            console.log ("vai embora.. vou devolver o seu dinheiro");
        }
    }
})();