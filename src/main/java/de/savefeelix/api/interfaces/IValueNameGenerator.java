package de.savefeelix.api.interfaces;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface IValueNameGenerator {
    <T> List<String> generate(@NotNull T value);
}
