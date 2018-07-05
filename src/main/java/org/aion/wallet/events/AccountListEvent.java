package org.aion.wallet.events;

import java.util.Set;

public class AccountListEvent extends AbstractAccountEvent<Set<String>> {
    protected AccountListEvent(final Type eventType, final Set<String> addresses) {
        super(eventType, addresses);
    }
}
