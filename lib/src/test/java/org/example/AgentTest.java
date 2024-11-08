/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AgentTest {
    @Test public void agentInitializedFirstTest() {
		System.out.println("test enter: "+Agent.countDownLatch.getCount());

		try {
			Agent.countDownLatch.await();
		} catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("test exit: "+Agent.countDownLatch.getCount());
    }
}
