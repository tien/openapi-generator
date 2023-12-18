/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * An order for a pets from the pet store
 *
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */


data class Order (

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("petId")
    val petId: kotlin.Long? = null,

    @field:JsonProperty("quantity")
    val quantity: kotlin.Int? = null,

    @field:JsonProperty("shipDate")
    val shipDate: java.time.OffsetDateTime? = null,

    /* Order Status */
    @field:JsonProperty("status")
    val status: org.openapitools.client.models.Order.Status? = null,

    @field:JsonProperty("complete")
    val complete: kotlin.Boolean? = false

) {

    /**
     * Order Status
     *
     * Values: placed,approved,delivered,unknownDefaultOpenApi
     */
    enum class Status(val value: kotlin.String) {
        @JsonProperty(value = "placed") placed("placed"),
        @JsonProperty(value = "approved") approved("approved"),
        @JsonProperty(value = "delivered") delivered("delivered"),
        @JsonProperty(value = "unknown_default_open_api") unknownDefaultOpenApi("unknown_default_open_api");
    }
}

