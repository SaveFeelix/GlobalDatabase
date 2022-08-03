
package de.savefeelix.api.base;

import de.savefeelix.api.interfaces.ISqlGenerator;
import de.savefeelix.api.interfaces.IValueNameGenerator;

public abstract class BaseSqlGenerator implements ISqlGenerator {
    protected IValueNameGenerator nameGenerator;

    public BaseSqlGenerator(IValueNameGenerator nameGenerator) {
        this.nameGenerator = nameGenerator;
    }
}
