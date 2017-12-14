/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class MediaCoordinate {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MediaCoordinate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaCoordinate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_MediaCoordinate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(int value) {
    pjsua2JNI.MediaCoordinate_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return pjsua2JNI.MediaCoordinate_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    pjsua2JNI.MediaCoordinate_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return pjsua2JNI.MediaCoordinate_y_get(swigCPtr, this);
  }

  public MediaCoordinate() {
    this(pjsua2JNI.new_MediaCoordinate(), true);
  }

}
