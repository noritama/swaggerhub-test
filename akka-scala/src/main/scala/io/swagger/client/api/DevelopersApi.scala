/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.InventoryItem
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DevelopersApi {

  /**
   * By passing in the appropriate options, you can search for available inventory in the system 
   * 
   * Expected answers:
   *   code 200 : Seq[InventoryItem] (search results matching criteria)
   *   code 400 :  (bad input parameter)
   * 
   * @param searchString pass an optional search string for looking up inventory
   * @param skip number of records to skip for pagination
   * @param limit maximum number of records to return
   */
  def searchInventory(searchString: Option[String] = None, skip: Option[Int] = None, limit: Option[Int] = None): ApiRequest[Seq[InventoryItem]] =
    ApiRequest[Seq[InventoryItem]](ApiMethods.GET, "https://virtserver.swaggerhub.com/noritama/test/1.0.0", "/inventory", "application/json")
      .withQueryParam("searchString", searchString)
      .withQueryParam("skip", skip)
      .withQueryParam("limit", limit)
      .withSuccessResponse[Seq[InventoryItem]](200)
      .withErrorResponse[Unit](400)
      

}

