package domain

import play.api.libs.json.Json

/**
  * Created by Mzuvukile Lawana on 11/18/2016.
  */
case class Bid(
              tenderers : List[Organization],
              date : String = Date,
              id : SerialVersionUID,
              status : String,
              value : Value,
              documents : List[Document],
              parameters : List[Parameter],
              lotValues : List[LotValue],
              participation : url
         )

object Bid{
  implicit val bidFmt = Json.format[Bid]
}


