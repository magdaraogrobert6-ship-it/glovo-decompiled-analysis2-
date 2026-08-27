package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.h$$ExternalSyntheticLambda0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class onForgotten implements Comparable {
    public static final onForgotten RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen IconCompatParcelizer = new isAdapterPositionOnScreen(new h$$ExternalSyntheticLambda0(4, this));
    public final int MediaDescriptionCompat;
    public final int read;
    public final int serializer;
    public final String write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        onForgotten onforgotten = (onForgotten) obj;
        onforgotten.getClass();
        Object objMediaSessionCompatResultReceiverWrapper = this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        Object objMediaSessionCompatResultReceiverWrapper2 = onforgotten.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper2.getClass();
        return ((BigInteger) objMediaSessionCompatResultReceiverWrapper).compareTo((BigInteger) objMediaSessionCompatResultReceiverWrapper2);
    }

    public final int hashCode() {
        int i = this.serializer;
        return ((((i + 527) * 31) + this.read) * 31) + this.MediaDescriptionCompat;
    }

    public final String toString() {
        String str = this.write;
        String strConcat = !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.serializer);
        sb.append('.');
        sb.append(this.read);
        sb.append('.');
        return af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, strConcat, sb);
    }

    public onForgotten(String str, int i, int i2, int i3) {
        this.serializer = i;
        this.read = i2;
        this.MediaDescriptionCompat = i3;
        this.write = str;
    }

    static {
        new onForgotten("", 0, 0, 0);
        RemoteActionCompatParcelizer = new onForgotten("", 0, 1, 0);
        new onForgotten("", 1, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onForgotten)) {
            return false;
        }
        onForgotten onforgotten = (onForgotten) obj;
        return this.serializer == onforgotten.serializer && this.read == onforgotten.read && this.MediaDescriptionCompat == onforgotten.MediaDescriptionCompat;
    }
}
