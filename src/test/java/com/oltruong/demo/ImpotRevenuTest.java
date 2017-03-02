package com.oltruong.demo;

import org.assertj.core.data.Offset;
import org.junit.Test;

import static com.oltruong.demo.ImpotRevenu.calculImpots;
import static org.assertj.core.api.Assertions.assertThat;

public class ImpotRevenuTest {


    @Test
    public void calculImpotsCelibataire() throws Exception {
        assertThat(calculImpots(30000, 1)).isCloseTo(2449.72, Offset.offset(0.009));
    }

    @Test
    public void calculImpotsEnfants() throws Exception {
        assertThat(calculImpots(60000, 3)).isEqualTo(3481.8);
        assertThat(calculImpots(40000, 3)).isCloseTo(961.8, Offset.offset(0.009));
    }

}