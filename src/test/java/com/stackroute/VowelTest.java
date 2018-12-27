package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest
{
    Vowel vowel=new Vowel();
    @Test

    public void removeVowel1()
    {
        String[] result = vowel.removeVowel(new String[] {"India","United States","Germany","Egypt","czechoslovakia"});
        assertArrayEquals(new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},result);
    }

    @Test
    public void removeVowel2()
    {
        String[] result = vowel.removeVowel(new String[]{"Egypt,czechoslovakia,India,United States,Germany"});
        assertArrayEquals(new String[]{"Egypt,czchslvk,Ind,Untd Stts,Grmny"},result);
    }
    @Test
    public void removeVowelFail()
    {
        String[] result = vowel.removeVowel(new String[]{"India,czechoslovakia"});
        assertNotEquals(new String[]{"India,czechslvk"},result);
    }

}