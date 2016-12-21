package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    @RequestMapping("/add")
    public Addition addition(@RequestParam(value="num1", defaultValue="5") float num1, @RequestParam(value="num2", defaultValue="5") float num2) {
        return new Addition(num1, num2);
    }
	
	@RequestMapping("/minus")
    public Subtraction subtraction(@RequestParam(value="num1", defaultValue="5") float num1, @RequestParam(value="num2", defaultValue="5") float num2) {
        return new Subtraction(num1, num2);
    }
	
	@RequestMapping("/multiply")
    public Multiplication multiplication(@RequestParam(value="num1", defaultValue="5") float num1, @RequestParam(value="num2", defaultValue="5") float num2) {
        return new Multiplication(num1, num2);
    }
	
	@RequestMapping("/divide")
    public Division division(@RequestParam(value="num1", defaultValue="5") float num1, @RequestParam(value="num2", defaultValue="5") float num2) {
        return new Division(num1, num2);
    }
	
	@RequestMapping("/factorial")
    public Factorial factorial(@RequestParam(value="num", defaultValue="5") int num) {
        return new Factorial(num);
    }
	
}