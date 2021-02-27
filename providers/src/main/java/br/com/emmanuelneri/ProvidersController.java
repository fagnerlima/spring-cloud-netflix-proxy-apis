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
@RequestMapping("/providers")
public class ProvidersController {

    private static final Map<Long, String> PROVIDERS = ImmutableMap.of(
            1L, "Provider 1",
            2L, "Provider 2",
            3L, "Provider 3",
            4L, "Provider 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(PROVIDERS.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return PROVIDERS.get(id);
    }

}
