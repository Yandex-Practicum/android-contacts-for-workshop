package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T element);
    @Override
    boolean equals(Object obj);
}
