package de.savefeelix.api.interfaces;

import de.savefeelix.api.utils.DataBaseActionType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ISqlGenerator {
    <T> String generate(@NotNull DataBaseActionType type, @Nullable T value, @Nullable Object... values);
}