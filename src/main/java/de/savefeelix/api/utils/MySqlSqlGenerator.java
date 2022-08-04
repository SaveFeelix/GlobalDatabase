package de.savefeelix.api.utils;

import de.savefeelix.api.base.BaseSqlGenerator;
import de.savefeelix.api.interfaces.IValueNameGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MySqlSqlGenerator extends BaseSqlGenerator {

    public MySqlSqlGenerator(IValueNameGenerator nameGenerator) {
        super(new MySqlValueNameGenerator());
    }

    @Override
    public <T> String generate(@NotNull DataBaseActionType dataBaseActionType, @Nullable T t, @Nullable Object... objects) {
        switch (dataBaseActionType) {
            case Read:

                return null;
            case Create:
                if (t != null) {
                    List<String> nameTypes = nameGenerator.generate(t);
                    return null;
                }
                throw new NullPointerException("Value of 't' cannot be null!");
            case Delete:
                return null;
            case Update:
                return null;
        }
        return null;
    }
}
