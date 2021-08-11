/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.date.util;

import com.fu.date.CheckDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckDateTest {

    @Test
    public void UTCID01() {
        assertEquals(true, CheckDate.CheckDate("29/2/2000"));

    }
     @Test
    public void UTCID02() {
        assertEquals(false, CheckDate.CheckDate("29/2/2009"));

    }
    @Test
    public void UTCID03() {
        assertEquals(false, CheckDate.CheckDate("31/2/2020"));

    }
    @Test
    public void UTCID04() {
        assertEquals(false, CheckDate.CheckDate("30/2/2000"));

    }
    @Test
    public void UTCID05() {
        assertEquals(true, CheckDate.CheckDate("30/4/2000"));

    }
    public void UTCID06() {
          assertEquals(false, CheckDate.CheckDate("311/4/2020"));

    }
    @Test
    public void UTCID07() {
        assertEquals(false, CheckDate.CheckDate("32/4/2009"));

    }
    @Test
    public void UTCID08() {
        assertEquals(true, CheckDate.CheckDate("31/3/2020"));

    }
    @Test
    public void UTCID09() {
        assertEquals(false, CheckDate.CheckDate("32/3/2020"));

    }
    @Test
    public void UTCID10() {
        assertEquals(false, CheckDate.CheckDate("0/3/2000"));

    }

}
