/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.service;
/**
 * @author rafae
 */

import br.ulbra.dao.ChamadoDAO;
import br.ulbra.model.Chamado;
import java.util.List;


public class ChamadoService {
    
     private ChamadoDAO dao;

    public ChamadoService(ChamadoDAO dao) {
        this.dao = dao;
    }

    public void cadastrar(Chamado chamado_tecnico) {

        if (chamado_tecnico.getSolicitante()== null || chamado_tecnico.getSolicitante().isEmpty()) {
            throw new RuntimeException("Solicitante é obrigatorio");
        }

        if (chamado_tecnico.getProblema_relatado()== null || chamado_tecnico.getProblema_relatado().isEmpty()) {
            throw new RuntimeException("Tenque exixtir um problema relatado");
        }
        

        dao.salvar(chamado_tecnico);
    }

    public List<Chamado> listar() {
        return dao.listar();
    }

    public void atualizar(Chamado chamado_tecnico) {
        dao.atualizar(chamado_tecnico);
    }

    public void deletar(Long id) {
        dao.deletar(id);
    }

    public Chamado buscar(Long id) {
        return dao.buscarPorId(id);
    }
}

