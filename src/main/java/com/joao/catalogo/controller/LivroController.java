package com.joao.catalogo.controller;

import com.joao.catalogo.model.Livro;
import com.joao.catalogo.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    // LISTAR TODOS
    @GetMapping
    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    // CRIAR
    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    // ATUALIZAR
    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        Livro livro = livroRepository.findById(id).orElse(null);

        if (livro == null) return null;

        livro.setTitulo(livroAtualizado.getTitulo());
        livro.setAutor(livroAtualizado.getAutor());
        livro.setAno(livroAtualizado.getAno());

        return livroRepository.save(livro);
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }
}
