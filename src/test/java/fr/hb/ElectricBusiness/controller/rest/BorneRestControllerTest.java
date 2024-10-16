package fr.hb.ElectricBusiness.controller.rest;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.hb.ElectricBusiness.business.Borne;
import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.dto.BorneDto;
import fr.hb.ElectricBusiness.dto.LieuDto;
import fr.hb.ElectricBusiness.service.BorneService;
import fr.hb.ElectricBusiness.service.LieuService;

/**
 * Test traversant : il teste le contrôleur REST qui fait appel au vrai service, etc
 */
@SpringBootTest
@AutoConfigureMockMvc
public class BorneRestControllerTest {

    @Autowired
    MockMvc mockMvc; // cet objet imite ce que fait Postman, Hoppscotch, Insomnia, Swagger ou le front Angular, React ou Vue

    @Autowired
    BorneService borneService;
    @Autowired
    LieuService lieuService;

    @Autowired
    ObjectMapper objectMapper; // cet objet va sérialiser des objets DTO

    @BeforeEach
    void beforeEach() {
        List<Borne> bornes = borneService.getBornes();
        for (Borne borne : bornes) {
            borneService.deleteBorne(borne.getId());
        }
    }

    @Test
    void testPostBorne() throws Exception {

        String nom = "test";
        LieuDto lieuDto= new LieuDto();
        Lieu lieu = new Lieu();
        lieu.setVille("Dijon");
        Lieu savedLieu = lieuService.saveLieu(lieu);
        lieuDto.setId(savedLieu.getId());
        lieuDto.setVille(savedLieu.getVille());
        BorneDto borneDto = new BorneDto();
        borneDto.setId(4L);
        borneDto.setNom(nom);
        borneDto.setLieu(lieuDto);
        System.out.println(lieuDto);

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/api/bornes")
                // On place dans le corps de la requête la version Json de l'objet borneDto
                .content(objectMapper.writeValueAsString(borneDto))
                .contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nom").value(nom))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lieu.ville").value("Dijon"))
                .andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}