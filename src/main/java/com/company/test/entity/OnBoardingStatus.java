package com.company.test.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum OnBoardingStatus implements EnumClass<Integer> {

    NOT_STARTED(10),
    IN_PROGRESS(20),
    COMPLETED(30);

    private final Integer id;

    OnBoardingStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static OnBoardingStatus fromId(Integer id) {
        for (OnBoardingStatus at : OnBoardingStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}