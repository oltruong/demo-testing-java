package com.oltruong.demo.propertiesbased;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

@RunWith(JUnitQuickcheck.class)
public class IntProperties {
    @Property
    public void concatenationLength(int a1, int b1) {

        assumeThat(b1, greaterThan(0));


        //will fail because of overflow
        assertTrue(a1 + b1 > a1);
    }

}
