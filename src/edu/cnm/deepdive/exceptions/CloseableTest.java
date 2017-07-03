/**
 * 
 */
package edu.cnm.deepdive.exceptions;

import java.io.IOException;

/**
 * @author davem
 *
 */
public class CloseableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (CloseableDemo demo = new CloseableDemo(false)) {
			System.out.println("Using first closeableDemo Instance");
		} catch (IOException ex ){
			System.out.println("Caught IOException from first CloseableDemo instance close() method.");
		} finally {
			System.out.println("Done with first closeableDemo instance." );
			
		}
		
		try (CloseableDemo demo = new CloseableDemo(true)) {
			System.out.println("Using second CloseableDemo Instance");
		} catch (IOException ex ){
			System.out.println("Caught IOException from second CloseableDemo instance close() method.");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Done with first closeableDemo instance." );
		}
	}

}
