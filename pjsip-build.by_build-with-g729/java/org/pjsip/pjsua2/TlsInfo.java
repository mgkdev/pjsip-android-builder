/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class TlsInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TlsInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TlsInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_TlsInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEstablished(boolean value) {
    pjsua2JNI.TlsInfo_established_set(swigCPtr, this, value);
  }

  public boolean getEstablished() {
    return pjsua2JNI.TlsInfo_established_get(swigCPtr, this);
  }

  public void setProtocol(long value) {
    pjsua2JNI.TlsInfo_protocol_set(swigCPtr, this, value);
  }

  public long getProtocol() {
    return pjsua2JNI.TlsInfo_protocol_get(swigCPtr, this);
  }

  public void setCipher(pj_ssl_cipher value) {
    pjsua2JNI.TlsInfo_cipher_set(swigCPtr, this, value.swigValue());
  }

  public pj_ssl_cipher getCipher() {
    return pj_ssl_cipher.swigToEnum(pjsua2JNI.TlsInfo_cipher_get(swigCPtr, this));
  }

  public void setCipherName(String value) {
    pjsua2JNI.TlsInfo_cipherName_set(swigCPtr, this, value);
  }

  public String getCipherName() {
    return pjsua2JNI.TlsInfo_cipherName_get(swigCPtr, this);
  }

  public void setLocalAddr(String value) {
    pjsua2JNI.TlsInfo_localAddr_set(swigCPtr, this, value);
  }

  public String getLocalAddr() {
    return pjsua2JNI.TlsInfo_localAddr_get(swigCPtr, this);
  }

  public void setRemoteAddr(String value) {
    pjsua2JNI.TlsInfo_remoteAddr_set(swigCPtr, this, value);
  }

  public String getRemoteAddr() {
    return pjsua2JNI.TlsInfo_remoteAddr_get(swigCPtr, this);
  }

  public void setLocalCertInfo(SslCertInfo value) {
    pjsua2JNI.TlsInfo_localCertInfo_set(swigCPtr, this, SslCertInfo.getCPtr(value), value);
  }

  public SslCertInfo getLocalCertInfo() {
    long cPtr = pjsua2JNI.TlsInfo_localCertInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SslCertInfo(cPtr, false);
  }

  public void setRemoteCertInfo(SslCertInfo value) {
    pjsua2JNI.TlsInfo_remoteCertInfo_set(swigCPtr, this, SslCertInfo.getCPtr(value), value);
  }

  public SslCertInfo getRemoteCertInfo() {
    long cPtr = pjsua2JNI.TlsInfo_remoteCertInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SslCertInfo(cPtr, false);
  }

  public void setVerifyStatus(long value) {
    pjsua2JNI.TlsInfo_verifyStatus_set(swigCPtr, this, value);
  }

  public long getVerifyStatus() {
    return pjsua2JNI.TlsInfo_verifyStatus_get(swigCPtr, this);
  }

  public void setVerifyMsgs(StringVector value) {
    pjsua2JNI.TlsInfo_verifyMsgs_set(swigCPtr, this, StringVector.getCPtr(value), value);
  }

  public StringVector getVerifyMsgs() {
    long cPtr = pjsua2JNI.TlsInfo_verifyMsgs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new StringVector(cPtr, false);
  }

  public TlsInfo() {
    this(pjsua2JNI.new_TlsInfo(), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.TlsInfo_isEmpty(swigCPtr, this);
  }

}
