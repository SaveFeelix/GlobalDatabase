package de.savefeelix.api.utils;

import de.savefeelix.api.interfaces.IValueNameGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MySqlValueTypeGenerator implements IValueNameGenerator {
    @Override
    public <T> List<String> generate(@NotNull T t) {
        return null;
    }
}
