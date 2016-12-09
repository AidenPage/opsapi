package services.Item

import Item.ItemClassification
import com.websudos.phantom.dsl._
import io.netty.util.concurrent.Future
import services.Item.Impl.ItemClassificationServiceImpl

/**
  * Created by AidenP on 2016/12/07.
  */
trait ItemClassificationService {
  def createOrUpdate(itemClassification: ItemClassification): Future[ResultSet]

  def getItemClassificationById(ItemId: String, Classification: String): Future[Option[ItemClassification]]

  def deleteById(ItemId: String, Classification: String): Future[ResultSet]

  def getAllItemClassifications(): Future[Seq[ItemClassification]]

}
object ItemClassificationService{
  def apply: ItemClassificationService = new ItemClassificationServiceImpl()
}