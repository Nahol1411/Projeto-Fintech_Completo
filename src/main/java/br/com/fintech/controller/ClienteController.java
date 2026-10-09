package br.com.fintech.controller;

// Importa a classe Cliente do pacote model
import br.com.fintech.model.Cliente;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        System.out.println("\n--- NOVO CLIENTE RECEBIDO ---");

        // Forma 1: Imprime direto usando o método toString() do Cliente
        System.out.println(cliente);

        // Forma 2: Imprime campo por campo usando os getters
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Data Nacimento: " + cliente.getDataNascimento());
        System.out.println("Idade Calculada: " + cliente.getIdade() + " anos");
        System.out.println("-------------------------------\n");

        return cliente;
    }
}