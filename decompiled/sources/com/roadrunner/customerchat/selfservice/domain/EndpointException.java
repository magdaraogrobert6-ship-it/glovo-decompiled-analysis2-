package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class EndpointException extends Exception {
    private static int read = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String write;

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = 2 % 2;
        int i2 = read + 73;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i3 + 13;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndpointException(String str, int i, String str2) {
        super(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(str + " could not be fetched due to " + i + " - " + str2 + " "));
        str2.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.write.hashCode() * 31, 31);
        int i4 = read + 113;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 51;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("EndpointException(name=", this.RemoteActionCompatParcelizer, this.write, ", code=", ", message="), this.IconCompatParcelizer, ")");
        int i4 = read + 47;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 85;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof EndpointException) {
            EndpointException endpointException = (EndpointException) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, endpointException.write}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 125;
                read = i4 % Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            if (this.RemoteActionCompatParcelizer == endpointException.RemoteActionCompatParcelizer) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, endpointException.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i5 = serializer + 107;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i6 = serializer + 95;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 49;
        serializer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
