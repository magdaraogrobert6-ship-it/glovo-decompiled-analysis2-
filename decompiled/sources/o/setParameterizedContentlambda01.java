package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class setParameterizedContentlambda01 extends r8lambdatGneqyXrP1uOJD5LacwlDLETgw8 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final ArrayList IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public setParameterizedContentlambda01(String str, boolean z, String str2, String str3, ArrayList arrayList) {
        str.getClass();
        str3.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = z;
        this.write = str2;
        this.read = str3;
        this.IconCompatParcelizer = arrayList;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 47;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("Signature(uploadPath=", this.serializer, ", isRequired=", ", thumbnailUri=", this.RemoteActionCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sbM, this.write, ", taskId=", this.read, ", compression=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 55;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 29;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        String str = this.write;
        if (str == null) {
            int i4 = MediaSessionCompatQueueItem + 75;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.read);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setParameterizedContentlambda01)) {
            return false;
        }
        setParameterizedContentlambda01 setparameterizedcontentlambda01 = (setParameterizedContentlambda01) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setparameterizedcontentlambda01.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == setparameterizedcontentlambda01.RemoteActionCompatParcelizer) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setparameterizedcontentlambda01.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setparameterizedcontentlambda01.read}, getCieXyz.write())).booleanValue()) {
                return this.IconCompatParcelizer.equals(setparameterizedcontentlambda01.IconCompatParcelizer);
            }
            i = MediaMetadataCompat + 55;
            MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = MediaSessionCompatQueueItem + 29;
            MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i3 = i % 2;
        return false;
    }
}
