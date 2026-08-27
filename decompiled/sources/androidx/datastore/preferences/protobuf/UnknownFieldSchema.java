package androidx.datastore.preferences.protobuf;

import o.CornerRadiusKt;
import o.getUnspecifiedPackedFloatsannotations;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnknownFieldSchema {
    public final boolean IconCompatParcelizer(Object obj, CornerRadiusKt cornerRadiusKt) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = cornerRadiusKt.RemoteActionCompatParcelizer();
        int i = iRemoteActionCompatParcelizer >>> 3;
        int i2 = iRemoteActionCompatParcelizer & 7;
        if (i2 == 0) {
            ((getUnspecifiedPackedFloatsannotations) obj).RemoteActionCompatParcelizer(i << 3, Long.valueOf(cornerRadiusKt.MediaSessionCompatResultReceiverWrapper()));
            return true;
        }
        if (i2 == 1) {
            ((getUnspecifiedPackedFloatsannotations) obj).RemoteActionCompatParcelizer((i << 3) | 1, Long.valueOf(cornerRadiusKt.MediaSessionCompatQueueItem()));
            return true;
        }
        if (i2 == 2) {
            ((getUnspecifiedPackedFloatsannotations) obj).RemoteActionCompatParcelizer((i << 3) | 2, cornerRadiusKt.read());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            ((getUnspecifiedPackedFloatsannotations) obj).RemoteActionCompatParcelizer((i << 3) | 5, Integer.valueOf(cornerRadiusKt.RatingCompat()));
            return true;
        }
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer = getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer();
        int i3 = i << 3;
        while (cornerRadiusKt.IconCompatParcelizer() != Integer.MAX_VALUE && IconCompatParcelizer(getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer, cornerRadiusKt)) {
        }
        if ((i3 | 4) != cornerRadiusKt.RemoteActionCompatParcelizer()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer.IconCompatParcelizer = false;
        ((getUnspecifiedPackedFloatsannotations) obj).RemoteActionCompatParcelizer(i3 | 3, getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer);
        return true;
    }
}
