package com.google.crypto.tink.shaded.protobuf;

import o.getCoordinatesAccessedDuringModifierPlacement;
import o.setOuterToInnerOffsetDirtyui;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UnknownFieldSchema {
    public abstract getCoordinatesAccessedDuringModifierPlacement read(Object obj);

    public final boolean read(Object obj, CodedInputStreamReader codedInputStreamReader) throws InvalidProtocolBufferException {
        int i = codedInputStreamReader.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = codedInputStreamReader.read;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            codedInputStreamReader.IconCompatParcelizer(0);
            ((getCoordinatesAccessedDuringModifierPlacement) obj).serializer(i2 << 3, Long.valueOf(setoutertoinneroffsetdirtyui.ParcelableVolumeInfo()));
            return true;
        }
        if (i3 == 1) {
            codedInputStreamReader.IconCompatParcelizer(1);
            ((getCoordinatesAccessedDuringModifierPlacement) obj).serializer((i2 << 3) | 1, Long.valueOf(setoutertoinneroffsetdirtyui.MediaSessionCompatQueueItem()));
            return true;
        }
        if (i3 == 2) {
            ((getCoordinatesAccessedDuringModifierPlacement) obj).serializer((i2 << 3) | 2, codedInputStreamReader.IconCompatParcelizer());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            codedInputStreamReader.IconCompatParcelizer(5);
            ((getCoordinatesAccessedDuringModifierPlacement) obj).serializer((i2 << 3) | 5, Integer.valueOf(setoutertoinneroffsetdirtyui.RatingCompat()));
            return true;
        }
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacementWrite = getCoordinatesAccessedDuringModifierPlacement.write();
        int i4 = i2 << 3;
        while (codedInputStreamReader.read() != Integer.MAX_VALUE && read(getcoordinatesaccessedduringmodifierplacementWrite, codedInputStreamReader)) {
        }
        if ((i4 | 4) != codedInputStreamReader.serializer) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        getcoordinatesaccessedduringmodifierplacementWrite.serializer = false;
        ((getCoordinatesAccessedDuringModifierPlacement) obj).serializer(i4 | 3, getcoordinatesaccessedduringmodifierplacementWrite);
        return true;
    }
}
