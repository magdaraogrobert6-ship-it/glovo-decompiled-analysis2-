package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer;
    public final String serializer;
    public final WrapPreviewlambda1 write;

    public r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0(String str, String str2, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, WrapPreviewlambda1 wrapPreviewlambda1) {
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        this.write = wrapPreviewlambda1;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 27;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BagsAndItemsUiV1(bagsTitle=", this.serializer, ", itemsTitle=", this.IconCompatParcelizer, ", productItems=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", summaryItem=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.serializer;
        if (str == null) {
            int i2 = MediaDescriptionCompat + 59;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = MediaDescriptionCompat + 51;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            int i6 = MediaDescriptionCompat + 105;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        WrapPreviewlambda1 wrapPreviewlambda1 = this.write;
        return ((iHashCode3 + (((iHashCode * 31) + iHashCode2) * 31)) * 31) + (wrapPreviewlambda1 != null ? wrapPreviewlambda1.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 75;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0)) {
            return false;
        }
        r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = (r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdamtsd8x0f0xutzn3oeie_s8mt0.serializer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdamtsd8x0f0xutzn3oeie_s8mt0.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdamtsd8x0f0xutzn3oeie_s8mt0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdamtsd8x0f0xutzn3oeie_s8mt0.write}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = MediaDescriptionCompat + 1;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = MediaDescriptionCompat + 47;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 3;
        MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
