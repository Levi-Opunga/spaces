package com.example.application.endpoints.helloreact;


import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;
import com.example.application.models.Note;

import java.util.Date;

@Endpoint
@AnonymousAllowed
public class HelloReactEndpoint {

    @Nonnull
    public String sayHello(@Nonnull String name) {
        if (name.isEmpty()) {
            return "Hello stranger";
        } else {
            return "Hello " + name;
        }
    }

    @Nonnull
    public Note getNote(){
        return new Note("I'M A NOTE CRETAED IN THE SERVER","I AM THE NOTE'S TITLE", new Date(),null, "high".toUpperCase());
    }


}