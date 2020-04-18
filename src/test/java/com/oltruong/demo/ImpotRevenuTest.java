package com.oltruong.demo;

import org.assertj.core.data.Offset;
import org.junit.Test;

import static com.oltruong.demo.ImpotRevenu.calculImpots;
import static org.assertj.core.api.Assertions.assertThat;

public class ImpotRevenuTest {


    @Test
    public void calculImpotsCelibataire() throws Exception {
        assertThat(calculImpots(36000, 1)).isCloseTo(3737.75, Offset.offset(0.009));
    }

    @Test
    public void calculImpotsEnfants() throws Exception {
        assertThat(calculImpots(62000, 3)).isCloseTo(2816.88, Offset.offset(0.009));
        assertThat(calculImpots(40000, 3)).isCloseTo(638.88, Offset.offset(0.009));
    }

}