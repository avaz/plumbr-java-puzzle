package slow;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Accumulator {

  private transient BigInteger result = BigInteger.ZERO;

  public BigInteger sum( List<BigInteger> numbers ) {
    ExecutorService executorService = Executors.newFixedThreadPool( 8 );
    final Object lock = new Object();
    List<Future<BigInteger>> futures = new ArrayList<>();
    for ( final BigInteger number : numbers ) {
      futures.add(executorService.submit( new Runnable() {
        @Override
        public void run() {
          synchronized(lock) {
            result = result.add( number );
          }
        }
      }, result ));
    }
    futures.forEach( (f) -> {
      try {
        f.get();
      }
      catch ( InterruptedException | ExecutionException ex ) {
        ex.printStackTrace();
      }
    } );
    executorService.shutdown();
    return result;
  }
}
