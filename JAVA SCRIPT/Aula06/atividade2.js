function div(n1, n2=1){
    return n1 / n2
}

function mult(n1, n2=1){
    return n1 * n2
}

const input = require('../input');

(async ()=>{
    console.log(`O que você deseja fazer?
       1 - multiplicação
       2 - divisão
       3 - soma
       4 - subtração
    `);
    let opcao = await input();

    let func;
    
    switch(opcao){
        case '1': func = mult; break;
        case '2': func = div; break;
        default: console.log("Em desenvolvimento")
    }

    if(Number(opcao)>2) return

    let e1 =Number( await input())
    let e2 =Number( await input())

    let resposta = func(e1, e2)
    console.log("REsposta: "+resposta)
})()