/**
 * 
 */
package edu.cnm.deepdive.exceptions;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author davem
 *
 */
public class CloseableDemo implements Closeable {

	private final boolean throwSomething;
	
		public CloseableDemo (boolean throwSomething) {
			this.throwSomething = throwSomething;
			
		}
	/* (non-Javadoc)
	 * @see java.io.Closeable#close()
	 */
	@Override
	public void close() throws IOException {
		System.out.println("Closing the CloseableDemo Instance.");
		if (throwSomething) {
			throw new IOException("ha ha, it broke");
		}

	}

}
