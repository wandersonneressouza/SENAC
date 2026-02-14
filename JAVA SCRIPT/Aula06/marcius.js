function random(inferior=0, superior=1, tipo='float'){
    if(superior<inferior)
    {
        console
            .error("Numero superior deve ser maior que o numero");
        return;
    }

    switch(tipo){
        case 'float': 
            return Math.random()
                *(superior+1-inferior)+(inferior);
        case 'int': 
            return Math.floor(Math.random()
                *(superior+1-inferior))+(inferior);
    }   
}

function validaCPF(cpf){

    // 1. Remover caracteres não numéricos (pontos, traços, etc.)
    cpf = cpf.replace(/[^\d]+/g, '');

    // 2. Verificar se o CPF tem 11 dígitos e não é uma sequência de dígitos iguais
    if (cpf.length !== 11 || /^(\d)\1{10}$/.test(cpf)) return false;

    // 3. Calcular o primeiro dígito verificador
    let soma = 0;
    for (let i = 0; i < 9; i++) {
        soma += parseInt(cpf.charAt(i)) * (10 - i);
    }
    let primeiroDigito = (soma * 10) % 11;
    if (primeiroDigito === 10) primeiroDigito = 0;
    if (primeiroDigito !== parseInt(cpf.charAt(9))) return false;

    // 4. Calcular o segundo dígito verificador
    soma = 0;
    for (let i = 0; i < 10; i++) {
        soma += parseInt(cpf.charAt(i)) * (11 - i);
    }
    let segundoDigito = (soma * 10) % 11;
    if (segundoDigito === 10) segundoDigito = 0;
    if (segundoDigito !== parseInt(cpf.charAt(10))) return false;

    // 5. Se os dois dígitos verificadores forem válidos, o CPF é válido
    return true;

    
}

function ValTel(telefone) {
    // Remove tudo que não for número
    const num = telefone.replace(/\D/g, "");

    // Deve ter 10 (fixo) ou 11 (celular) dígitos
    if (num.length !== 10 && num.length !== 11) return false;

    // Valida DDD (válidos 11–99 no Brasil)
    const ddd = parseInt(num.substring(0, 2), 10);
    if (ddd < 11 || ddd > 99) return false;

    // Se tiver 11 dígitos → celular deve começar com 9
    if (num.length === 11 && num[2] !== "9") return false;

    // Se tiver 10 dígitos → fixo deve começar com 2,3,4,5
    if (num.length === 10 && !["2","3","4","5"].includes(num[2])) return false;

    return true;
}

function ValEmail(email) {
    // Remove espaços acidentais
    const e = email.trim();

    // Regex simples e segura para validar formato de email
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/;

    return regex.test(e);
}


module.exports = {
    random, validaCPF, ValTel, ValEmail, 
}