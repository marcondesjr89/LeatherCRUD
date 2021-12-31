package br.com.leather.controllers;

import br.com.leather.model.Leather;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/leathers")
public class LeatherController {

    List<Leather> leathers = new ArrayList<>();

    @GetMapping("/{id}")
    public Leather leather(@PathVariable("id") Long id){
        Optional<Leather> leatherFind = leathers.stream().filter(leather -> leather.getId() == id).findFirst();
        if (leatherFind.isPresent()){
            return leatherFind.get();
        }
        return null;

    }

    @PostMapping("/")
    public Leather leather(@RequestBody Leather leather){
        leathers.add(leather);
        return leather;
    }

    @GetMapping("/list")
    public List<Leather> list(){
        return leathers;
    }

}
