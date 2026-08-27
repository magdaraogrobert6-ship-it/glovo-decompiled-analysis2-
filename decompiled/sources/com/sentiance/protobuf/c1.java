package com.sentiance.protobuf;

import o.IValueCallback;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c1 {
    public abstract IValueCallback write(Object obj);

    public abstract void write(Object obj, Object obj2);

    public final boolean serializer(int i, v vVar, Object obj) throws InvalidProtocolBufferException {
        u uVar = vVar.read;
        int i2 = vVar.serializer;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            vVar.write(0);
            ((IValueCallback) obj).write(i3 << 3, Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
            return true;
        }
        if (i4 == 1) {
            vVar.write(1);
            ((IValueCallback) obj).write((i3 << 3) | 1, Long.valueOf(uVar.ResultReceiver()));
            return true;
        }
        if (i4 == 2) {
            ((IValueCallback) obj).write((i3 << 3) | 2, vVar.serializer());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            vVar.write(5);
            ((IValueCallback) obj).write(5 | (i3 << 3), Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
            return true;
        }
        IValueCallback iValueCallback = new IValueCallback();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (vVar.read() != Integer.MAX_VALUE && serializer(i6, vVar, iValueCallback)) {
        }
        if ((i5 | 4) != vVar.serializer) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (iValueCallback.MediaDescriptionCompat) {
            iValueCallback.MediaDescriptionCompat = false;
        }
        ((IValueCallback) obj).write(i5 | 3, iValueCallback);
        return true;
    }
}
