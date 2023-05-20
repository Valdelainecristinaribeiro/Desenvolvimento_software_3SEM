package fatec.araras.f290_dsm_tp2_suggestionbox_ht.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fatec.araras.f290_dsm_tp2_suggestionbox_ht.model.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}