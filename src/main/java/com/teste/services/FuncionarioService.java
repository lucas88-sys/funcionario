package com.teste.services;

import com.teste.entities.Funcionario;
import com.teste.repositories.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FuncionarioService{

    private final FuncionarioRepository funcionarioRepository;


    public List<Funcionario> listarTodos()
    {

        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> buscarPorId(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario salvar(Funcionario funcionario) {
        Funcionario novoFuncionario = new Funcionario();

        novoFuncionario.setId(funcionario.getId());
        novoFuncionario.setNome(funcionario.getNome());
        novoFuncionario.setCargo(funcionario.getCargo());
        novoFuncionario.setCpf( funcionario.getCpf());
        novoFuncionario.setSalario(funcionario.getSalario());
        return funcionarioRepository.save(novoFuncionario);
    }

    public void deletar(Long id) {
        funcionarioRepository.deleteById(id);
    }



    public Funcionario atualizar(Funcionario funcionario) throws BadRequestException {
        Optional<Funcionario> editado = funcionarioRepository.findById(funcionario.getId());

         if (editado.isPresent()) {
             editado.get().setNome(funcionario.getNome());
             editado.get().setCargo(funcionario.getCargo());
             editado.get().setCpf(funcionario.getCpf());
             editado.get().setSalario(funcionario.getSalario());
             funcionarioRepository.save(editado.get());
             return editado.get();
        }
       else {
             throw new RuntimeException("funcionario nao encontrado");
         }
    }
}