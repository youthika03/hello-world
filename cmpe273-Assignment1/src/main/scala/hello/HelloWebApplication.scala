package hello

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Calendar;
import java.text.SimpleDateFormat;

@RestController
@EnableAutoConfiguration
@ComponentScan
class HelloWebApplication {
  @RequestMapping(Array("/"))
  def home() : String = {
	"Hello World"
  }
 
 @RequestMapping(Array("/abc"))
  def newHome() : String = {
        "This is a new mapping page"
  }


}
 
object HelloWebApplication {
  def main(args: Array[String]) {
    val configuration : Array[Object] = Array(classOf[HelloWebApplication])
    SpringApplication.run(configuration, args)
  }
}
