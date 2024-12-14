package ru.yandex.practicum.contacts.presentation.main;

import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;

public class ContactUi implements ListDiffInterface<ContactUi> {
    @Override
    public boolean theSameAs(ContactUi element) {
        return this.hashCode() == element.hashCode();
    }
}
