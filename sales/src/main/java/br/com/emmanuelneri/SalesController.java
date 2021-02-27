package br.com.emmanuelneri;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sales")
public class SalesController {

    private static final Map<Long, String> SALES = ImmutableMap.of(
            1L, "Sale 1",
            2L, "Sale 2",
            3L, "Sale 3",
            4L, "Sale 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(SALES.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return SALES.get(id);
    }

}
