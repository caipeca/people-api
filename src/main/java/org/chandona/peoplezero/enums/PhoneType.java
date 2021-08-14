package org.chandona.peoplezero.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBile("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

}
