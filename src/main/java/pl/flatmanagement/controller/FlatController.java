package pl.flatmanagement.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.flatmanagement.model.Flat;
import pl.flatmanagement.repositories.DetailsRepository;
import pl.flatmanagement.repositories.FlatRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/flat")
public class FlatController {



    private final FlatRepository flatRepository;

    private final DetailsRepository detailsRepository;


    public FlatController(FlatRepository flatRepository, DetailsRepository detailsRepository) {
        this.flatRepository = flatRepository;
        this.detailsRepository = detailsRepository;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addFlat(Model model) {
        model.addAttribute("flat", new Flat());
        return "flat/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@Valid Flat flat, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "flat/add";
        }
        flatRepository.save(flat);

        return "redirect:/flat/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("flats", flatRepository.findAll());
        return "flat/list";
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editBook(@RequestParam Long id, Model model) {
        model.addAttribute("flat", flatRepository.findById(id));
        return "flat/edit";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String update(Flat flat, Model model) {
        flatRepository.save(flat);
        //    flatRepository.save(flat);

        return "redirect:/flat/list";
    }

    //    @RequestMapping(value = "/confirm", method = RequestMethod.GET)
//    public String confirm(@RequestParam Long id, Model model) {
//        model.addAttribute("id", id);
//        return "confirm";
//    }
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam Long id) {
        flatRepository.deleteById(id);
        return "redirect:/flat/list";
    }

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public String details(@RequestParam Long id, Model model){
        model.addAttribute("details", detailsRepository.findById(id));
        return "flat/details";
    }


}
