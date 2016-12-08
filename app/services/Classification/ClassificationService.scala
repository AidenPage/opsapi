package services.Classification

import com.websudos.phantom.dsl._
import domain.Classification.Classification
import io.netty.util.concurrent.Future
import services.Classification.Impl.ClassificationServiceImpl

/**
  * Created by AidenP on 2016/12/07.
  */
trait ClassificationService {

  def createOrUpdate(classification: Classification): Future[ResultSet]

  def getClassificationById(id: String): Future[Option[Classification]]

  def deleteById(id: String): Future[ResultSet]

  def getAllClassifications(): Future[Seq[Classification]]

}
object ClassificationService{
  def apply: ClassificationService = new ClassificationServiceImpl()
}
