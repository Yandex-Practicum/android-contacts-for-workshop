package ru.yandex.practicum.contacts.presentation.sort;

import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;

class SortTypeUI implements ListDiffInterface<SortTypeUI> {

    public int getSortType() {
        // Предположительная реализация, замените на свою
        return 0;
    }

    @Override
    public boolean theSameAs(SortTypeUI element) {
        return this.getSortType() == element.getSortType();
    }
}

