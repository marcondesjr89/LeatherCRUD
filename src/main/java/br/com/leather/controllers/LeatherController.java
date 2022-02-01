package br.com.leather.controllers;

import br.com.leather.model.Leather;
import br.com.leather.repository.LeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/leathers")
public class LeatherController {

    /* List<Leather> leathers = new ArrayList<>(); */

    @Autowired
    private LeatherRepository leatherRepository;

    @GetMapping("/{id}")
    public Leather leather(@PathVariable("id") Long id){

        Optional<Leather> leatherFind = this.leatherRepository.findById(id);
        if (leatherFind.isPresent()){
            return leatherFind.get();
        }
        return null;
    }

    @PostMapping("/")
    public Leather leather(@RequestBody Leather leather){
        return this.leatherRepository.save(leather);

    }

    @GetMapping("/list")
    public List<Leather> list(){
        return this.leatherRepository.findAll();
    }

   @GetMapping("/list/{id}")
    public List<Leather> listMoreThan(@PathVariable("id") Long id){
        return this.leatherRepository.findByIdGreaterThan(id);
    }

    @GetMapping("/findByQualidade/{qualidade}")
    public List<Leather> findByQualidadeIgnoreCase(@PathVariable("qualidade") String qualidade){
        return this.leatherRepository.findByQualidadeIgnoreCase(qualidade);
    }


    @DeleteMapping("/{id}")
    public void deleteLeather(@PathVariable("id") Long id){
        this.leatherRepository.deleteById(id);

    }


}
