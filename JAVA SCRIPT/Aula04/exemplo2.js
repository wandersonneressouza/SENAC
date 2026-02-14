function tigrinho (){
    return Math.floor(Math.random()*10);
}

let sorteado = tigrinho()

switch(true){
        case sorteado > 3:
            console.log("parabéns, vc ganhou o premio maximo");
        
        case sorteado == 2:
            console.log("vc ganhou uma lata de leite");
            
        default:
            console.log("ganhou nada");

}