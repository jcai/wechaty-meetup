trait Cat
trait Bird
trait Catch
trait FullTummy
def catch(hunter: Cat, prey: Bird): Cat with Catch
def eat(consumer: Cat with Catch): Cat with FullTummy
val story = (catch _) andThen (eat _)
story(new Cat, new Bird)