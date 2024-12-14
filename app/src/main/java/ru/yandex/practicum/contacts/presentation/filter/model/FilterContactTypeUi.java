package ru.yandex.practicum.contacts.presentation.filter.model;

import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;

class FilterContactTypeUi implements ListDiffInterface<FilterContactTypeUi> {
    public int getContactType() {
        // Предположительная реализация, замените на свою
        return 0;
    }
    @Override
    public boolean theSameAs(FilterContactTypeUi element) {
        return this.getContactType() == element.getContactType();
    }
}