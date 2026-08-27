package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FontSynthesisSaverlambda1 extends FontWeightSaverlambda0 implements HyphensSaverlambda0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final String IconCompatParcelizer;
    public final List MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final HyphensSaverlambda1 read;
    public final long serializer;
    public final boolean write;

    @Override // o.HyphensSaverlambda0
    public final List read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaSessionCompatQueueItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FontSynthesisSaverlambda1(String str, List list, boolean z, boolean z2, long j, HyphensSaverlambda1 hyphensSaverlambda1) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.MediaSessionCompatQueueItem = list;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
        this.serializer = j;
        this.read = hyphensSaverlambda1;
    }

    public /* synthetic */ FontSynthesisSaverlambda1(String str, ArrayList arrayList, long j) {
        this(str, arrayList, true, false, j, new HyphensSaverlambda1(0.0f, 0L));
    }

    public static FontSynthesisSaverlambda1 IconCompatParcelizer(FontSynthesisSaverlambda1 fontSynthesisSaverlambda1, boolean z, HyphensSaverlambda1 hyphensSaverlambda1, int i) {
        boolean z2;
        int i2 = 2 % 2;
        String str = fontSynthesisSaverlambda1.IconCompatParcelizer;
        List list = fontSynthesisSaverlambda1.MediaSessionCompatQueueItem;
        boolean z3 = fontSynthesisSaverlambda1.RemoteActionCompatParcelizer;
        if ((i & 8) != 0) {
            int i3 = MediaMetadataCompat;
            int i4 = i3 + 95;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            boolean z4 = fontSynthesisSaverlambda1.write;
            int i6 = i3 + 59;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z2 = z4;
        } else {
            z2 = z;
        }
        long j = fontSynthesisSaverlambda1.serializer;
        if ((i & 32) != 0) {
            hyphensSaverlambda1 = fontSynthesisSaverlambda1.read;
        }
        HyphensSaverlambda1 hyphensSaverlambda2 = hyphensSaverlambda1;
        str.getClass();
        list.getClass();
        hyphensSaverlambda2.getClass();
        return new FontSynthesisSaverlambda1(str, list, z3, z2, j, hyphensSaverlambda2);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, this.IconCompatParcelizer.hashCode() * 31, 31), 31, this.RemoteActionCompatParcelizer), 31, this.write), 31, this.serializer);
        int i4 = MediaMetadataCompat + 15;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 47;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("DefaultButtonWithCountDown(title=", this.IconCompatParcelizer, ", trackingEvents=", this.MediaSessionCompatQueueItem, ", isButtonEnabled=");
        af$$ExternalSyntheticOutline0.m(sbSerializer, this.RemoteActionCompatParcelizer, ", isLoading=", this.write, ", totalSecondsLeft=");
        sbSerializer.append(this.serializer);
        sbSerializer.append(", countdownState=");
        sbSerializer.append(this.read);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = MediaMetadataCompat + 21;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontSynthesisSaverlambda1)) {
            return false;
        }
        FontSynthesisSaverlambda1 fontSynthesisSaverlambda1 = (FontSynthesisSaverlambda1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, fontSynthesisSaverlambda1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, fontSynthesisSaverlambda1.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != fontSynthesisSaverlambda1.RemoteActionCompatParcelizer || this.write != fontSynthesisSaverlambda1.write) {
            return false;
        }
        if (this.serializer == fontSynthesisSaverlambda1.serializer) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, fontSynthesisSaverlambda1.read}, getCieXyz.write())).booleanValue();
        }
        int i3 = MediaDescriptionCompat + 101;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
