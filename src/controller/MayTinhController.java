package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MayTinhController {

    @GetMapping(name = "/maytinh")
    public String mayTinh() {
        return "index";
    }

    @PostMapping(name = "/result")
    public String tinh(@RequestParam float num1, @RequestParam float num2, @RequestParam String operator, Model model) {
        switch (operator) {
            case "Addition(+)":
                model.addAttribute("result", num1 + num2);
                break;
            case "Subtraction(-)":
                model.addAttribute("result", num1 - num2);
                break;
            case "Multiplication(X)":
                model.addAttribute("result", num1 * num2);
                break;
            case "Division(/)":
                model.addAttribute("result", num1 / num2);
                break;
        }
        return "result";
    }
}
