package alkemy.movies.controller.operation

import alkemy.movies.utils.CompanionLogger
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid

interface Put<D, E : Any, ID : Any> : APIOperation<D, E, ID> {

    @PutMapping("/{id}")
    @Operation(
        summary = "Updates an element",
        description = "Fully updates an element with the given state"
    )
    fun update(@Valid @RequestBody dto: D, @PathVariable id: ID) =
        service
            .log { info("Updating entity with id $id") }
            .save(dto)
            .log { info("Update successful") }

    companion object : CompanionLogger()
}
