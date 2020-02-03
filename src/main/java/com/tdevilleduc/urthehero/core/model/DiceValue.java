package com.tdevilleduc.urthehero.core.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DiceValue {

    @NonNull
    private Integer value;
    @NonNull
    private Dice dice;

}
