/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class WindowHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected WindowHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WindowHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_WindowHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWindow(Object surface) {
    pjsua2JNI.WindowHandle_setWindow(swigCPtr, this, surface);
  }

  public WindowHandle() {
    this(pjsua2JNI.new_WindowHandle(), true);
  }

}
