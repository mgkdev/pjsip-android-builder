/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class MediaConfig extends PersistentObject {
  private transient long swigCPtr;

  protected MediaConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.MediaConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_MediaConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setClockRate(long value) {
    pjsua2JNI.MediaConfig_clockRate_set(swigCPtr, this, value);
  }

  public long getClockRate() {
    return pjsua2JNI.MediaConfig_clockRate_get(swigCPtr, this);
  }

  public void setSndClockRate(long value) {
    pjsua2JNI.MediaConfig_sndClockRate_set(swigCPtr, this, value);
  }

  public long getSndClockRate() {
    return pjsua2JNI.MediaConfig_sndClockRate_get(swigCPtr, this);
  }

  public void setChannelCount(long value) {
    pjsua2JNI.MediaConfig_channelCount_set(swigCPtr, this, value);
  }

  public long getChannelCount() {
    return pjsua2JNI.MediaConfig_channelCount_get(swigCPtr, this);
  }

  public void setAudioFramePtime(long value) {
    pjsua2JNI.MediaConfig_audioFramePtime_set(swigCPtr, this, value);
  }

  public long getAudioFramePtime() {
    return pjsua2JNI.MediaConfig_audioFramePtime_get(swigCPtr, this);
  }

  public void setMaxMediaPorts(long value) {
    pjsua2JNI.MediaConfig_maxMediaPorts_set(swigCPtr, this, value);
  }

  public long getMaxMediaPorts() {
    return pjsua2JNI.MediaConfig_maxMediaPorts_get(swigCPtr, this);
  }

  public void setHasIoqueue(boolean value) {
    pjsua2JNI.MediaConfig_hasIoqueue_set(swigCPtr, this, value);
  }

  public boolean getHasIoqueue() {
    return pjsua2JNI.MediaConfig_hasIoqueue_get(swigCPtr, this);
  }

  public void setThreadCnt(long value) {
    pjsua2JNI.MediaConfig_threadCnt_set(swigCPtr, this, value);
  }

  public long getThreadCnt() {
    return pjsua2JNI.MediaConfig_threadCnt_get(swigCPtr, this);
  }

  public void setQuality(long value) {
    pjsua2JNI.MediaConfig_quality_set(swigCPtr, this, value);
  }

  public long getQuality() {
    return pjsua2JNI.MediaConfig_quality_get(swigCPtr, this);
  }

  public void setPtime(long value) {
    pjsua2JNI.MediaConfig_ptime_set(swigCPtr, this, value);
  }

  public long getPtime() {
    return pjsua2JNI.MediaConfig_ptime_get(swigCPtr, this);
  }

  public void setNoVad(boolean value) {
    pjsua2JNI.MediaConfig_noVad_set(swigCPtr, this, value);
  }

  public boolean getNoVad() {
    return pjsua2JNI.MediaConfig_noVad_get(swigCPtr, this);
  }

  public void setIlbcMode(long value) {
    pjsua2JNI.MediaConfig_ilbcMode_set(swigCPtr, this, value);
  }

  public long getIlbcMode() {
    return pjsua2JNI.MediaConfig_ilbcMode_get(swigCPtr, this);
  }

  public void setTxDropPct(long value) {
    pjsua2JNI.MediaConfig_txDropPct_set(swigCPtr, this, value);
  }

  public long getTxDropPct() {
    return pjsua2JNI.MediaConfig_txDropPct_get(swigCPtr, this);
  }

  public void setRxDropPct(long value) {
    pjsua2JNI.MediaConfig_rxDropPct_set(swigCPtr, this, value);
  }

  public long getRxDropPct() {
    return pjsua2JNI.MediaConfig_rxDropPct_get(swigCPtr, this);
  }

  public void setEcOptions(long value) {
    pjsua2JNI.MediaConfig_ecOptions_set(swigCPtr, this, value);
  }

  public long getEcOptions() {
    return pjsua2JNI.MediaConfig_ecOptions_get(swigCPtr, this);
  }

  public void setEcTailLen(long value) {
    pjsua2JNI.MediaConfig_ecTailLen_set(swigCPtr, this, value);
  }

  public long getEcTailLen() {
    return pjsua2JNI.MediaConfig_ecTailLen_get(swigCPtr, this);
  }

  public void setSndRecLatency(long value) {
    pjsua2JNI.MediaConfig_sndRecLatency_set(swigCPtr, this, value);
  }

  public long getSndRecLatency() {
    return pjsua2JNI.MediaConfig_sndRecLatency_get(swigCPtr, this);
  }

  public void setSndPlayLatency(long value) {
    pjsua2JNI.MediaConfig_sndPlayLatency_set(swigCPtr, this, value);
  }

  public long getSndPlayLatency() {
    return pjsua2JNI.MediaConfig_sndPlayLatency_get(swigCPtr, this);
  }

  public void setJbInit(int value) {
    pjsua2JNI.MediaConfig_jbInit_set(swigCPtr, this, value);
  }

  public int getJbInit() {
    return pjsua2JNI.MediaConfig_jbInit_get(swigCPtr, this);
  }

  public void setJbMinPre(int value) {
    pjsua2JNI.MediaConfig_jbMinPre_set(swigCPtr, this, value);
  }

  public int getJbMinPre() {
    return pjsua2JNI.MediaConfig_jbMinPre_get(swigCPtr, this);
  }

  public void setJbMaxPre(int value) {
    pjsua2JNI.MediaConfig_jbMaxPre_set(swigCPtr, this, value);
  }

  public int getJbMaxPre() {
    return pjsua2JNI.MediaConfig_jbMaxPre_get(swigCPtr, this);
  }

  public void setJbMax(int value) {
    pjsua2JNI.MediaConfig_jbMax_set(swigCPtr, this, value);
  }

  public int getJbMax() {
    return pjsua2JNI.MediaConfig_jbMax_get(swigCPtr, this);
  }

  public void setSndAutoCloseTime(int value) {
    pjsua2JNI.MediaConfig_sndAutoCloseTime_set(swigCPtr, this, value);
  }

  public int getSndAutoCloseTime() {
    return pjsua2JNI.MediaConfig_sndAutoCloseTime_get(swigCPtr, this);
  }

  public void setVidPreviewEnableNative(boolean value) {
    pjsua2JNI.MediaConfig_vidPreviewEnableNative_set(swigCPtr, this, value);
  }

  public boolean getVidPreviewEnableNative() {
    return pjsua2JNI.MediaConfig_vidPreviewEnableNative_get(swigCPtr, this);
  }

  public MediaConfig() {
    this(pjsua2JNI.new_MediaConfig(), true);
  }

  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.MediaConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.MediaConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

}
