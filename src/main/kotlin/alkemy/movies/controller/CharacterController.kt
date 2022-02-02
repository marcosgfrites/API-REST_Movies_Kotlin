package alkemy.movies.controller

import alkemy.movies.dto.CharacterDTO
import alkemy.movies.model.Character
import alkemy.movies.service.CharacterService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("characterController")
@RequestMapping("characters")
@Tag(name = "Characters", description = "Characters API")
class CharacterController (service: CharacterService) :
    CrudController<CharacterDTO, Character, Long> (service) {
}