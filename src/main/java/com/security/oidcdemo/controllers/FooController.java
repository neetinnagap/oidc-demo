package com.security.oidcdemo.controllers;

import com.security.oidcdemo.domain.Foo;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class FooController {

    @GetMapping(value="/foo")
    public Foo getFoo() {
        return new Foo("Neetin");
    }

    @PostMapping(value="/foo")
    public Foo saveFoo(@RequestBody Foo foo) {
        return foo;
    }

    @GetMapping(value="/principal")
    public Object getPrincipal() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
