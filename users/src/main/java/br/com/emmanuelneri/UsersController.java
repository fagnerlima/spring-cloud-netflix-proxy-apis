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
@RequestMapping("/users")
public class UsersController {

    private static final Map<Long, String> USERS = ImmutableMap.of(
            1L, "User 1",
            2L, "User 2",
            3L, "User 3",
            4L, "User 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(USERS.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return USERS.get(id);
    }

}
