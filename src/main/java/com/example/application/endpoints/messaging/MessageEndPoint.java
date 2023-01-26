package com.example.application.endpoints.messaging;

import com.example.application.models.Message;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

@Endpoint()
@AnonymousAllowed
public class MessageEndPoint {
@Nonnull
    public String name(@Nonnull Message message) {
     return "MESSAGE SENT";
}

}
