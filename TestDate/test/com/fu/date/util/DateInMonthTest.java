/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.date.util;

import com.fu.date.DateInMonth;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 *
 * @author DELL
 */
public class DateInMonthTest {
    
    
  
    @Test
    public void UTCID01(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(1, 2020));
       
    }
     @Test
    public void UTCID02(){
      
        assertEquals(28, DateInMonth.checkDateInMonth(2, 2021));
       
    }
     @Test
      public void UTCID03(){
      
        assertEquals(28, DateInMonth.checkDateInMonth(2, 2019));
       
    }
       @Test
      public void UTCID04(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(3, 2022));
       
    }
       @Test
      public void UTCID05(){
      
        assertEquals(30, DateInMonth.checkDateInMonth(9, 2020));
       
    }
       @Test(expected = IllegalArgumentException.class)
      public void UTCID06(){
      
        DateInMonth.checkDateInMonth(13, 10);
       
    }
     @Test
     public void UTCID08(){
      
       assertEquals(29, DateInMonth.checkDateInMonth(2, 2020));
       
    }
      @Test
     public void UTCID09(){
      
       assertEquals(30, DateInMonth.checkDateInMonth(9, 2021));
       
    }
     @Test(expected = IllegalArgumentException.class)
     public void UTCID10(){
      
       DateInMonth.checkDateInMonth(0, 2019);
       
    }
     @Test
        (expected = IllegalArgumentException.class)
     public void UTCID11(){
      
       DateInMonth.checkDateInMonth(1, 10);
       
    }
}
