package com.teste.controllers;

import com.teste.entities.Funcionario;
import com.teste.repositories.FuncionarioRepository;
import com.teste.services.FuncionarioService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
       return funcionarioService.listarTodos();

    }

    @GetMapping("/novo")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "form_funcionario";
    }

    @PostMapping("/salvar")
    public ResponseEntity<Funcionario> salvarFuncionario(@ModelAttribute Funcionario funcionario) {
        return ResponseEntity.ok(funcionarioService.salvar(funcionario));
    }

    @PutMapping ("editar")
    public Funcionario funcionarioEditado(@ModelAttribute Funcionario funcionario) throws BadRequestException {
        return funcionarioService.atualizar(funcionario);

    }

    @GetMapping("buscarPorId")
    public Optional<Funcionario> buscarPorId(@RequestParam Long id) {
        return funcionarioService.buscarPorId(id);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarFuncionario(@PathVariable Long id) {
        funcionarioService.deletar(id);
        return "redirect:/funcionarios";
    }
}
