package fr.hb.ElectricBusiness.repository;

import fr.hb.ElectricBusiness.business.Borne;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class BorneRepositoryTest {

    @Autowired
    BorneRepository borneRepository;

    @Test
    void testSave() {
        String nom = "Borne 1";
        Borne borne = new Borne(nom, 0, null, null, null, 0, 0, 0, null, null, null);
        Borne borneEnregistree = borneRepository.save(new Borne(nom, 0, null, null, null, 0, 0, 0, null, null, null));

        // On vérifie que le nom de la borne enregistrée est égale au nom utilisé pour instancier la borne
        assertEquals(nom, borneEnregistree.getNom());
        assertThat(borneEnregistree.getNom()).isEqualTo(borne.getNom());
        assertThat(borneEnregistree.getId()).isPositive();
    }
    
    @Test
    void testGet() {
        String nom = "Borne 1";
        Borne borne = borneRepository.save(new Borne(nom, 0, null, null, null, 0, 0, 0, null, null, null));
        Borne borneRecup = borneRepository.findById(borne.getId()).get();
        // On vérifie que le nom de la borne enregistrée est égale au nom utilisé pour instancier la borne
        assertEquals(nom, borneRecup.getNom());
        assertThat(borneRecup.getNom()).isEqualTo(borne.getNom());
        assertThat(borneRecup.getId()).isPositive();
    }
}