package pl.bykowski.demobestpractices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    public Controller(Repository repository) {
        this.repository = repository;
    }

    private final Repository repository;

    @GetMapping
    public List<Person> get() {
        return repository.findAll();
    }
}
