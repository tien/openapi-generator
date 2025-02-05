package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Category
import org.openapitools.model.Tag
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * A pet for sale in the pet store
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */
data class Pet(

    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:JsonProperty("photoUrls", required = true) val photoUrls: kotlin.collections.List<kotlin.String>,

    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @get:JsonProperty("category") val category: Category? = null,

    @field:Valid
    @get:JsonProperty("tags") val tags: kotlin.collections.List<Tag>? = null,

    @get:JsonProperty("status") val status: org.openapitools.model.Pet.Status? = null
) {

    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("available") available("available"),
        @JsonProperty("pending") pending("pending"),
        @JsonProperty("sold") sold("sold")
    }

}

