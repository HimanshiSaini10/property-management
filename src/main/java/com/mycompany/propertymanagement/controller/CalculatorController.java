package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.CalculatorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam("num11") Double num1,
                      @RequestParam("num22") Double num2) {
        return "Your acc balance is: " + (num1+num2);
    }

    @GetMapping("/subtract/{num1}/{num2}") 
    public Double subtract(@PathVariable("num1") Double num1,
                           @PathVariable("num2") Double num2) {
        return num1>num2?num1-num2:num2-num1;
    }

    @PostMapping("/mul")
    public Integer multiply(@RequestBody CalculatorDTO calculatorDTO) {
        Integer result = null;
        result = calculatorDTO.getN1() * calculatorDTO.getN2()
                * calculatorDTO.getN3() * calculatorDTO.getN4();
        return result;
    }

}
