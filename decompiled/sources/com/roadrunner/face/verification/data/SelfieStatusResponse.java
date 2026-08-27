package com.roadrunner.face.verification.data;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import com.google.gson.annotations.SerializedName;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class SelfieStatusResponse {
    public static final int $stable = 0;
    private static int IconCompatParcelizer = 1;
    private static int read;

    @SerializedName("is_selfie_required")
    private final boolean isSelfieRequired;

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.isSelfieRequired;
        }
        throw null;
    }

    public final boolean isSelfieRequired() {
        int i = 2 % 2;
        int i2 = read + 11;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        boolean z = this.isSelfieRequired;
        int i5 = i3 + 9;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public SelfieStatusResponse(boolean z) {
        this.isSelfieRequired = z;
    }

    public final SelfieStatusResponse copy(boolean z) {
        int i = 2 % 2;
        SelfieStatusResponse selfieStatusResponse = new SelfieStatusResponse(z);
        int i2 = IconCompatParcelizer + 117;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return selfieStatusResponse;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = read + 119;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Boolean.hashCode(this.isSelfieRequired);
        }
        int i3 = 57 / 0;
        return Boolean.hashCode(this.isSelfieRequired);
    }

    public static /* synthetic */ SelfieStatusResponse copy$default(SelfieStatusResponse selfieStatusResponse, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = read + 95;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            z = selfieStatusResponse.isSelfieRequired;
        }
        SelfieStatusResponse selfieStatusResponseCopy = selfieStatusResponse.copy(z);
        int i4 = IconCompatParcelizer + 3;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return selfieStatusResponseCopy;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("SelfieStatusResponse(isSelfieRequired=", ")", this.isSelfieRequired);
        int i4 = read + 111;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 81;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof SelfieStatusResponse) {
            if (this.isSelfieRequired == ((SelfieStatusResponse) obj).isSelfieRequired) {
                return true;
            }
            int i3 = read + 13;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        int i4 = IconCompatParcelizer + 85;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
