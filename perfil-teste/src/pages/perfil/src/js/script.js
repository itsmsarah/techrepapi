let cpf = document.getElementById("cpf")
let nome = document.getElementById("nome")
let datanasc = document.getElementById("data_nasc")
let email = document.getElementById("email")
let endereco = document.getElementById("endereco")
let telefone = document.getElementById("telefone")


window.addEventListener('DOMContentLoaded', ()=>{
    fetch("https://techrpsearch-hpccewfuaxfph6dc.eastus-01.azurewebsites.net/api/perfil")
    .then((res) => res.json())

    .then((data) => {
        console.log(data)
        cpf.innerText = data[0].cpf
        nome.innerText = data[0].nome
        datanasc.innerText = data[0].datanasc
        email.innerText = data[0].email
        endereco.innerText = data[0].endereco
        telefone.innerText = data[0].telefone


    })

    .catch((err)=>{
        nome.innerText = "Cliente não encontrado"
        

    })

    
})


