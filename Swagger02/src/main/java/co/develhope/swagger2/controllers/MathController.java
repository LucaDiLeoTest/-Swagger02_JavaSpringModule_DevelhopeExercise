package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/")
    public String mathControllerMsg(){
        return "welcome to math controller";
    }

    @GetMapping("/division-info")
    /**
     * this method return the info about division operation
     */
    public ArithmeticOperation divisionInfo(){
        return new ArithmeticOperation("division", 2, "The division with remainder or" +
                " Euclidean division of two natural numbers provides an integer quotient, which is the number of times " +
                "the second number is completely contained in the first number", new String[]{"invariant"});
        }

    @GetMapping("/multiplication")
    /**
     * multiplication operation
     */
    public Integer multiplication(@RequestParam Integer m1,@RequestParam Integer m2) {
        return m1*m2;
    }

    @GetMapping("/square/{n}")
    /**
     * this method make the square of a number
     */
    public Integer square(@RequestParam Integer n){
        return n*n;
    }

}