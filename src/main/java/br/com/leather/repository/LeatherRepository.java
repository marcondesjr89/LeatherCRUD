package br.com.leather.repository;

import br.com.leather.model.Leather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LeatherRepository extends JpaRepository<Leather, Long> {

    public List<Leather> findByIdGreaterThan(Long id);

    public List<Leather> findByQualidadeIgnoreCase(String qualidade);

    // public void deleteById(Long id);

}
