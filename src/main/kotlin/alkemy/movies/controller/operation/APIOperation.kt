package alkemy.movies.controller.operation

import alkemy.movies.service.AbstractService

interface APIOperation<D, E : Any, ID : Any> {
    val service: AbstractService<D, E, ID>
}