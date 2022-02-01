package alkemy.movies.controller.operation

import alkemy.movies.utils.CompanionLogger
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid

interface Post<D, E : Any, ID : Any> : APIOperation<D, E, ID> {

    @PostMapping
    @Operation(
        summary = "Creates an element",
        description = "Given a representation it creates an entity with it's information"
    )
    fun create(@Valid @RequestBody dto: D) =
        service
            .log { info("Creating entity") }
            .save(dto)
            .log { info("Entity successfully created") }

    companion object : CompanionLogger()
}
