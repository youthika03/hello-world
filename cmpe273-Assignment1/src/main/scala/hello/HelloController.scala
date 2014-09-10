import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model

@RestController
@RequestMapping(Array("/"))
class HelloController  {

  @RequestMapping(value=Array("/"))
  def get(): String = {
    "hello world"
  }
}
