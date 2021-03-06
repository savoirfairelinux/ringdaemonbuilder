/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cx.ring.daemon;

public class IntVect {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntVect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RingserviceJNI.delete_IntVect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntVect() {
    this(RingserviceJNI.new_IntVect__SWIG_0(), true);
  }

  public IntVect(long n) {
    this(RingserviceJNI.new_IntVect__SWIG_1(n), true);
  }

  public long size() {
    return RingserviceJNI.IntVect_size(swigCPtr, this);
  }

  public long capacity() {
    return RingserviceJNI.IntVect_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    RingserviceJNI.IntVect_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return RingserviceJNI.IntVect_isEmpty(swigCPtr, this);
  }

  public void clear() {
    RingserviceJNI.IntVect_clear(swigCPtr, this);
  }

  public void add(int x) {
    RingserviceJNI.IntVect_add(swigCPtr, this, x);
  }

  public int get(int i) {
    return RingserviceJNI.IntVect_get(swigCPtr, this, i);
  }

  public void set(int i, int val) {
    RingserviceJNI.IntVect_set(swigCPtr, this, i, val);
  }

}
