package org.aion.wallet.events;

import org.aion.wallet.dto.AccountDTO;

public class AccountEvent extends AbstractAccountEvent<AccountDTO> {
    protected AccountEvent(final Type eventType, final AccountDTO payload) {
        super(eventType, payload);
    }
}
