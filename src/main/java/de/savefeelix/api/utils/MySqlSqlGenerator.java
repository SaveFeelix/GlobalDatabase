package de.savefeelix.api.utils;

import de.savefeelix.api.interfaces.ISqlGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MySqlSqlGenerator implements ISqlGenerator {
    @Override
    public <T> String generate(@NotNull DataBaseActionType dataBaseActionType, @Nullable T t, @Nullable Object... objects) {
        return null;
    }
}
