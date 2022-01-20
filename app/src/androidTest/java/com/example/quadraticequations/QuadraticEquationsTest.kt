package com.example.quadraticequations


import junit.framework.Assert.*

import org.junit.Test




class QuadraticEquationsTest {

    val quadraticEquations = QuadraticEquations()

   @Test
   fun ZeroA1() {
       quadraticEquations.setABC(0.0,0.0,2.0)
       assertEquals(0.0,quadraticEquations.getAC_4(),)
       assertEquals(0.0,quadraticEquations.getQuadrD())
       assertFalse(quadraticEquations.solved)
       assertEquals(0.0,quadraticEquations.getDiscriminant())
       assertEquals(0.0,quadraticEquations.getRoot1())
       assertEquals(0.0,quadraticEquations.getRoot2())
   }

    @Test
    fun ZeroA2() {
        quadraticEquations.setABC(0.0,4.0,0.0)
        assertEquals(0.0,quadraticEquations.getAC_4(),)
        assertEquals(0.0,quadraticEquations.getQuadrD())
        assertTrue(quadraticEquations.solved)
        assertEquals(0.0,quadraticEquations.getDiscriminant())
        assertEquals(0.0,quadraticEquations.getRoot1())
        assertEquals(0.0,quadraticEquations.getRoot2())
    }
    @Test
    fun ZeroA3() {
        quadraticEquations.setABC(0.0,0.0,4.0)
        assertEquals(0.0,quadraticEquations.getAC_4(),)
        assertEquals(0.0,quadraticEquations.getQuadrD())
        assertFalse(quadraticEquations.solved)
        assertEquals(0.0,quadraticEquations.getDiscriminant())
        assertEquals(0.0,quadraticEquations.getRoot1())
        assertEquals(0.0,quadraticEquations.getRoot2())
    }

    @Test
    fun ZeroA4() {
        quadraticEquations.setABC(0.0,4.0,1.0)
        assertEquals(0.0,quadraticEquations.getAC_4(),)
        assertEquals(0.0,quadraticEquations.getQuadrD())
        assertTrue(quadraticEquations.solved)
        assertEquals(0.0,quadraticEquations.getDiscriminant())
        assertEquals(-0.25,quadraticEquations.getRoot1())
        assertEquals(-0.25,quadraticEquations.getRoot2())
    }

   @Test
    fun NegativeDiscriminant() {
        quadraticEquations.setABC(1.0,1.0,4.0)
        assertEquals(16.0,quadraticEquations.getAC_4())
        assertEquals(1.0,quadraticEquations.getQuadrD())
        assertFalse(quadraticEquations.solved)
        assertEquals(-15.0,quadraticEquations.getDiscriminant())
        assertEquals(0.0,quadraticEquations.getRoot1())
        assertEquals(0.0,quadraticEquations.getRoot2())
    }

    @Test
    fun ZeroDiscriminant() {
        quadraticEquations.setABC(1.0,2.0,1.0)
        assertEquals(4.0,quadraticEquations.getAC_4(),)
        assertEquals(4.0,quadraticEquations.getQuadrD())
        assertTrue(quadraticEquations.solved)
        assertEquals(0.0,quadraticEquations.getDiscriminant())
        assertEquals(-1.0,quadraticEquations.getRoot1())
        assertEquals(-1.0,quadraticEquations.getRoot2())
    }
}