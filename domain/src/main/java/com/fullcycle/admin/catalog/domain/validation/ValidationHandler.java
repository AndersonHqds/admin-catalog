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

    default Error firstError() {
        if(getErrors() != null && !getErrors().isEmpty()) {
            return getErrors().get(0);
        }
        return null;
    }

    interface Validation {
        void validate();
    }
}
