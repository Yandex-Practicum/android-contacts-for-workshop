package ru.yandex.practicum.contacts.presentation.sort;

import androidx.annotation.NonNull;

import java.util.Objects;

import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;
import ru.yandex.practicum.contacts.presentation.sort.model.SortType;

public class SortTypeUI implements ListDiffInterface<SortTypeUI> {

    private final SortType sortType;
    private final boolean selected;

    public SortTypeUI(@NonNull SortType sortType, boolean selected) {
        this.sortType = sortType;
        this.selected = selected;
    }

    public SortType getSortType() {
        return sortType;
    }

    public boolean isSelected() {
        return selected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortTypeUI that = (SortTypeUI) o;
        return selected == that.selected && sortType == that.sortType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortType, selected);
    }
    public boolean theSameAs(SortTypeUI newItem) {
        return this.sortType == newItem.sortType;
    }
}
