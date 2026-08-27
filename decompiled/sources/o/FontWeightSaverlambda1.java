package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FontWeightSaverlambda1 extends FontWeightSaverlambda0 implements HyphensSaverlambda0 {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final List read;
    public final String write;

    @Override // o.HyphensSaverlambda0
    public final List read() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List list = this.read;
        int i4 = i3 + 45;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public FontWeightSaverlambda1(String str, List list, boolean z, boolean z2) {
        str.getClass();
        this.write = str;
        this.read = list;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
    }

    public /* synthetic */ FontWeightSaverlambda1(String str, ArrayList arrayList) {
        this(str, arrayList, true, false);
    }

    public static FontWeightSaverlambda1 RemoteActionCompatParcelizer(FontWeightSaverlambda1 fontWeightSaverlambda1, boolean z) {
        int i = 2 % 2;
        String str = fontWeightSaverlambda1.write;
        List list = fontWeightSaverlambda1.read;
        boolean z2 = fontWeightSaverlambda1.RemoteActionCompatParcelizer;
        str.getClass();
        list.getClass();
        FontWeightSaverlambda1 fontWeightSaverlambda2 = new FontWeightSaverlambda1(str, list, z2, z);
        int i2 = MediaDescriptionCompat + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return fontWeightSaverlambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("DefaultButton(title=", this.write, ", trackingEvents=", this.read, ", isButtonEnabled="), this.RemoteActionCompatParcelizer, ", isLoading=", this.IconCompatParcelizer, ")");
        int i4 = MediaDescriptionCompat + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.read, this.write.hashCode() * 31, 31), 31, this.RemoteActionCompatParcelizer);
        int i4 = serializer + 105;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 79;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FontWeightSaverlambda1)) {
            return false;
        }
        FontWeightSaverlambda1 fontWeightSaverlambda1 = (FontWeightSaverlambda1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, fontWeightSaverlambda1.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, fontWeightSaverlambda1.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == fontWeightSaverlambda1.RemoteActionCompatParcelizer) {
            return this.IconCompatParcelizer == fontWeightSaverlambda1.IconCompatParcelizer;
        }
        int i4 = serializer + 91;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
