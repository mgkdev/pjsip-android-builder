/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class CodecParamSetting {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CodecParamSetting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CodecParamSetting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_CodecParamSetting(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrmPerPkt(long value) {
    pjsua2JNI.CodecParamSetting_frmPerPkt_set(swigCPtr, this, value);
  }

  public long getFrmPerPkt() {
    return pjsua2JNI.CodecParamSetting_frmPerPkt_get(swigCPtr, this);
  }

  public void setVad(boolean value) {
    pjsua2JNI.CodecParamSetting_vad_set(swigCPtr, this, value);
  }

  public boolean getVad() {
    return pjsua2JNI.CodecParamSetting_vad_get(swigCPtr, this);
  }

  public void setCng(boolean value) {
    pjsua2JNI.CodecParamSetting_cng_set(swigCPtr, this, value);
  }

  public boolean getCng() {
    return pjsua2JNI.CodecParamSetting_cng_get(swigCPtr, this);
  }

  public void setPenh(boolean value) {
    pjsua2JNI.CodecParamSetting_penh_set(swigCPtr, this, value);
  }

  public boolean getPenh() {
    return pjsua2JNI.CodecParamSetting_penh_get(swigCPtr, this);
  }

  public void setPlc(boolean value) {
    pjsua2JNI.CodecParamSetting_plc_set(swigCPtr, this, value);
  }

  public boolean getPlc() {
    return pjsua2JNI.CodecParamSetting_plc_get(swigCPtr, this);
  }

  public void setReserved(boolean value) {
    pjsua2JNI.CodecParamSetting_reserved_set(swigCPtr, this, value);
  }

  public boolean getReserved() {
    return pjsua2JNI.CodecParamSetting_reserved_get(swigCPtr, this);
  }

  public void setEncFmtp(CodecFmtpVector value) {
    pjsua2JNI.CodecParamSetting_encFmtp_set(swigCPtr, this, CodecFmtpVector.getCPtr(value), value);
  }

  public CodecFmtpVector getEncFmtp() {
    long cPtr = pjsua2JNI.CodecParamSetting_encFmtp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CodecFmtpVector(cPtr, false);
  }

  public void setDecFmtp(CodecFmtpVector value) {
    pjsua2JNI.CodecParamSetting_decFmtp_set(swigCPtr, this, CodecFmtpVector.getCPtr(value), value);
  }

  public CodecFmtpVector getDecFmtp() {
    long cPtr = pjsua2JNI.CodecParamSetting_decFmtp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CodecFmtpVector(cPtr, false);
  }

  public CodecParamSetting() {
    this(pjsua2JNI.new_CodecParamSetting(), true);
  }

}
