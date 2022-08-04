package de.savefeelix.api.utils;

import de.savefeelix.api.base.BaseValueNameGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MySqlValueNameGenerator extends BaseValueNameGenerator {
    public MySqlValueNameGenerator(ClassNameRelation... classNameRelations) {
        super(
                new ClassNameRelation(Byte.class, "byte"),
                new ClassNameRelation(Byte[].class, "blob"),
                new ClassNameRelation(String.class, "varchar"),
                new ClassNameRelation(Short.class, "smallint"),
                new ClassNameRelation(Integer.class, "int"),
                new ClassNameRelation(Long.class, "bigint"),
                new ClassNameRelation(Float.class, "float"),
                new ClassNameRelation(Double.class, "double")
        );
    }

    @Override
    public <T> List<String> generate(@NotNull T t) {
        return null;
    }


}
