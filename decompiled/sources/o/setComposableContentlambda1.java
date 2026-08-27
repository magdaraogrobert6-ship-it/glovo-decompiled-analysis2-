package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setComposableContentlambda1 extends r8lambdatGneqyXrP1uOJD5LacwlDLETgw8 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final String IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final boolean read;
    public final ArrayList serializer;
    public final String write;

    public setComposableContentlambda1(String str, boolean z, List list, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.read = z;
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = str2;
        this.serializer = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 5;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.read), 31), 31, this.IconCompatParcelizer);
        int i4 = MediaMetadataCompat + 43;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 117;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("Picture(uploadPath=", this.write, ", isRequired=", ", thumbnailUris=", this.read);
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", taskId=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", compression=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 23;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setComposableContentlambda1)) {
            return false;
        }
        setComposableContentlambda1 setcomposablecontentlambda1 = (setComposableContentlambda1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setcomposablecontentlambda1.write}, getCieXyz.write())).booleanValue() || this.read != setcomposablecontentlambda1.read || !this.RemoteActionCompatParcelizer.equals(setcomposablecontentlambda1.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setcomposablecontentlambda1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return this.serializer.equals(setcomposablecontentlambda1.serializer);
        }
        int i4 = MediaMetadataCompat + 97;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
