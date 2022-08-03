package de.savefeelix.api.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassNameRelationCollection {

    public List<ClassNameRelation> collection = new ArrayList<>();

    public void add(Class<?> clazz, String value, Boolean overrideExisting) {
        ClassNameRelation relation = findRelation(clazz);
        if (relation != null) {
            if (!overrideExisting)
                return;
            collection.remove(relation);
        }
        collection.add(new ClassNameRelation(clazz, value));
    }
    public void add(Class<?> clazz, String value) {
        this.add(clazz, value, false);
    }
    public void add(ClassNameRelation relation, Boolean overrideExisting) {
        this.add(relation.clazz(), relation.value(), overrideExisting);
    }
    public void add(ClassNameRelation relation) {
        this.add(relation, false);
    }

    public void remove(Class<?> clazz) {
        for (ClassNameRelation relation : collection) {
            if (!relation.clazz().equals(clazz))
                continue;
            collection.remove(relation);
            return;
        }
    }

    public @Nullable ClassNameRelation findRelation(Class<?> clazz) {
        for (ClassNameRelation relation : collection) {
            if (relation.clazz().equals(clazz))
                return relation;
        }
        return null;
    }

    public @NotNull Collection<ClassNameRelation> findRelation(String value) {
        List<ClassNameRelation> foundRelations = new ArrayList<>();
        for (ClassNameRelation relation : collection)
            if (relation.value().equalsIgnoreCase(value))
                foundRelations.add(relation);
        return foundRelations;
    }

    public @Nullable ClassNameRelation findRelation(ClassNameRelation relation) {
        return findRelation(relation.clazz());
    }
}
