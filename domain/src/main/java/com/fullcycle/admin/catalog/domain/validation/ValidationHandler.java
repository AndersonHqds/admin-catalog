package com.fullcycle.admin.catalog.domain.validation;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(final Error anError);

    ValidationHandler append(final ValidationHandler anHandler);

    ValidationHandler validate(final Validation aValidation);

    List<Error> getErrors();

    default boolean hasErrors() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    public interface Validation {
        void validate();
    }
}
