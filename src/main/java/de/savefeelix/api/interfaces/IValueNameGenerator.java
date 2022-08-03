package de.savefeelix.api.interfaces;

import de.savefeelix.api.utils.ClassNameRelationCollection;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface IValueNameGenerator {
    <T> List<String> generate(@NotNull T value);

    ClassNameRelationCollection getClassNameRelations();
}
