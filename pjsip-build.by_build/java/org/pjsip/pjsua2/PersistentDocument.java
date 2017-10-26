/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class PersistentDocument {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PersistentDocument(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PersistentDocument obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_PersistentDocument(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void loadFile(String filename) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_loadFile(swigCPtr, this, filename);
  }

  public void loadString(String input) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_loadString(swigCPtr, this, input);
  }

  public void saveFile(String filename) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_saveFile(swigCPtr, this, filename);
  }

  public String saveString() throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_saveString(swigCPtr, this);
  }

  public ContainerNode getRootContainer() {
    return new ContainerNode(pjsua2JNI.PersistentDocument_getRootContainer(swigCPtr, this), false);
  }

  public boolean hasUnread() {
    return pjsua2JNI.PersistentDocument_hasUnread(swigCPtr, this);
  }

  public String unreadName() throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_unreadName(swigCPtr, this);
  }

  public int readInt(String name) throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readInt__SWIG_0(swigCPtr, this, name);
  }

  public int readInt() throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readInt__SWIG_1(swigCPtr, this);
  }

  public float readNumber(String name) throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readNumber__SWIG_0(swigCPtr, this, name);
  }

  public float readNumber() throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readNumber__SWIG_1(swigCPtr, this);
  }

  public boolean readBool(String name) throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readBool__SWIG_0(swigCPtr, this, name);
  }

  public boolean readBool() throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readBool__SWIG_1(swigCPtr, this);
  }

  public String readString(String name) throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readString__SWIG_0(swigCPtr, this, name);
  }

  public String readString() throws java.lang.Exception {
    return pjsua2JNI.PersistentDocument_readString__SWIG_1(swigCPtr, this);
  }

  public StringVector readStringVector(String name) throws java.lang.Exception {
    return new StringVector(pjsua2JNI.PersistentDocument_readStringVector__SWIG_0(swigCPtr, this, name), true);
  }

  public StringVector readStringVector() throws java.lang.Exception {
    return new StringVector(pjsua2JNI.PersistentDocument_readStringVector__SWIG_1(swigCPtr, this), true);
  }

  public void readObject(PersistentObject obj) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_readObject(swigCPtr, this, PersistentObject.getCPtr(obj), obj);
  }

  public ContainerNode readContainer(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.PersistentDocument_readContainer__SWIG_0(swigCPtr, this, name), true);
  }

  public ContainerNode readContainer() throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.PersistentDocument_readContainer__SWIG_1(swigCPtr, this), true);
  }

  public ContainerNode readArray(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.PersistentDocument_readArray__SWIG_0(swigCPtr, this, name), true);
  }

  public ContainerNode readArray() throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.PersistentDocument_readArray__SWIG_1(swigCPtr, this), true);
  }

  public void writeNumber(String name, float num) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_writeNumber(swigCPtr, this, name, num);
  }

  public void writeInt(String name, int num) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_writeInt(swigCPtr, this, name, num);
  }

  public void writeBool(String name, boolean value) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_writeBool(swigCPtr, this, name, value);
  }

  public void writeString(String name, String value) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_writeString(swigCPtr, this, name, value);
  }

  public void writeStringVector(String name, StringVector arr) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_writeStringVector(swigCPtr, this, name, StringVector.getCPtr(arr), arr);
  }

  public void writeObject(PersistentObject obj) throws java.lang.Exception {
    pjsua2JNI.PersistentDocument_writeObject(swigCPtr, this, PersistentObject.getCPtr(obj), obj);
  }

  public ContainerNode writeNewContainer(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.PersistentDocument_writeNewContainer(swigCPtr, this, name), true);
  }

  public ContainerNode writeNewArray(String name) throws java.lang.Exception {
    return new ContainerNode(pjsua2JNI.PersistentDocument_writeNewArray(swigCPtr, this, name), true);
  }

}
