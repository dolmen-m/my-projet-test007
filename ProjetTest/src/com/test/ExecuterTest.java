package com.test;
import junit.framework.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = {
		// liste des classes de test à exécuter
		TypeChargeTest.class,
		BorneTest.class,
		StationTest.class,
		ParcTest.class,
		AccesDataTest.class,
})

public class ExecuterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		org.junit.runner.JUnitCore.main("ExecuterTest");
	}

}
