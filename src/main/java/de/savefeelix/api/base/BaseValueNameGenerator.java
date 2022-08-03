package de.savefeelix.api.base;

import de.savefeelix.api.interfaces.IValueNameGenerator;
import de.savefeelix.api.utils.ClassNameRelation;
import de.savefeelix.api.utils.ClassNameRelationCollection;

public abstract class BaseValueNameGenerator implements IValueNameGenerator {
    public ClassNameRelationCollection relationCollection;

    public BaseValueNameGenerator(ClassNameRelation... classNameRelations) {
        relationCollection = new ClassNameRelationCollection();
        for (ClassNameRelation classNameRelation : classNameRelations)
            relationCollection.add(classNameRelation, true);
    }

    @Override
    public ClassNameRelationCollection getClassNameRelations() {
        return relationCollection;
    }
}
