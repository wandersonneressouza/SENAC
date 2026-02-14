const input = require("../input");

(async () =>{
    console.log ("digite um número");
    let num  = Number ( await input());
    
    if(isNaN(num)){
        console.log("digite apenas um número");
    }else if(num == 0){
        console.log ("zero é zero");
    }else if(num % 2 === 1){    
        console.log ("É impar");
    }else{
        console.log ("É par");
    }  
        
})();