const input = require("../input");
const {validaCPF} = require ("./marcius");


(async () => {

   console.log("OLA, QUAL É SEU NOME: ");
   let nome = await input();
    
   console.log("QUAL SEU CPF: ");
   let cpf = await input();

   if (validaCPF(cpf)){
      console.log ("CPF VALIDO");
      }
      else {
          console.log("CPF INVALIDO");
      }  
   
    
        
})();