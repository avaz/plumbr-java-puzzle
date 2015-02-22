package slow;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cache {
  private static final int DEFAULT_SIZE = 50;

  private final Map<CacheKey, Object> holder = new HashMap<>();
  private int maxSize;

  public Cache() {
    this( DEFAULT_SIZE );
  }

  public Cache( int maxSize ) {
    this.maxSize = maxSize;
  }

  public void put( Object key, Object value ) {
    synchronized ( holder ) {
      while ( holder.size() > maxSize ) {
        holder.remove( holder.keySet().iterator().next() );
      }
      holder.put( new CacheKey( key ), value );
    }
  }

  public Object get( Object key ) {
    synchronized ( holder ) {
      return holder.get( new CacheKey( key ) );
    }
  }


  public static class CacheKey {

    public Object key;

    public CacheKey( Object key ) {
      this.key = key;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode( this.key.toString() );
    }

    @Override
    public boolean equals( Object obj ) {
      return Objects.equals( this.key.toString(), ( (CacheKey) obj ).key.toString() );
    }

    @Override
    public String toString() {
      return Objects.toString( key );
    }
  }
}
