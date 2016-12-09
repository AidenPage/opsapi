package services.Lot

import com.websudos.phantom.dsl._
import domain.Lot.LotMinimalStep
import io.netty.util.concurrent.Future
import services.Lot.Impl.LotMinimalStepServiceImpl

/**
  * Created by AidenP on 2016/12/07.
  */
trait LotMinimalStepService {
  def createOrUpdate(lotMinimalStep: LotMinimalStep): Future[ResultSet]

  def getLotMinimalStepById(id: String): Future[Option[LotMinimalStep]]

  def deleteById(id: String): Future[ResultSet]

  def getAllLotMinimalSteps(): Future[Seq[LotMinimalStep]]

}
object LotMinimalStepService{
  def apply: LotMinimalStepService = new LotMinimalStepServiceImpl()
}