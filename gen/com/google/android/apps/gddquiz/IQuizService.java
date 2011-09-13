/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\admin\\Desktop\\GDD2011\\GDD2011App\\src\\com\\google\\android\\apps\\gddquiz\\IQuizService.aidl
 */
package com.google.android.apps.gddquiz;
public interface IQuizService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.google.android.apps.gddquiz.IQuizService
{
private static final java.lang.String DESCRIPTOR = "com.google.android.apps.gddquiz.IQuizService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.google.android.apps.gddquiz.IQuizService interface,
 * generating a proxy if needed.
 */
public static com.google.android.apps.gddquiz.IQuizService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.google.android.apps.gddquiz.IQuizService))) {
return ((com.google.android.apps.gddquiz.IQuizService)iin);
}
return new com.google.android.apps.gddquiz.IQuizService.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getCode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCode();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.google.android.apps.gddquiz.IQuizService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public java.lang.String getCode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCode, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public java.lang.String getCode() throws android.os.RemoteException;
}
