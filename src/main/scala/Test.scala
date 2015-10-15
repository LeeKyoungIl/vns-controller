import org.hibernate._
import models.Link

object Test extends App{

  val session: Session = HibernateUtil.getSessionFactory.openSession();

  session.beginTransaction();
  val link= new Link("abc")
  link.status = "1"
  session.save(link);
  session.getTransaction().commit();
  println("FINISHED")
}