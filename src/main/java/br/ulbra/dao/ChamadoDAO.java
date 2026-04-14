/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.dao;

/**
 *
 * @author rafael
 */
import br.ulbra.model.Chamado;
import java.util.List;

public interface ChamadoDAO {

    void salvar(Chamado chamado_tecnico);

    List<Chamado> listar();

    Chamado buscarPorId(Long id);

    void atualizar(Chamado chamado_tecnico);

    void deletar(Long id);
}


