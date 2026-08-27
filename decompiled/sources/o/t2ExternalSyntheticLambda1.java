package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t2ExternalSyntheticLambda1 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final Boolean IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final List RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final t3 read;
    public final List serializer;
    public final o7ExternalSyntheticLambda3 write;

    public t2ExternalSyntheticLambda1(int i, String str, List list, o7ExternalSyntheticLambda3 o7externalsyntheticlambda3, List list2, t3 t3Var, Boolean bool) {
        str.getClass();
        list.getClass();
        this.RemoteActionCompatParcelizer = i;
        this.MediaBrowserCompatMediaItem = str;
        this.serializer = list;
        this.write = o7externalsyntheticlambda3;
        this.RatingCompat = list2;
        this.read = t3Var;
        this.IconCompatParcelizer = bool;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 25;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Zone(id=", this.RemoteActionCompatParcelizer, ", name=", this.MediaBrowserCompatMediaItem, ", geoJson=");
        sbM.append(this.serializer);
        sbM.append(", center=");
        sbM.append(this.write);
        sbM.append(", subzones=");
        sbM.append(this.RatingCompat);
        sbM.append(", bonusMultiplier=");
        sbM.append(this.read);
        sbM.append(", calendarEnabled=");
        String strM = c8$$ExternalSyntheticOutline0.m(sbM, ")", this.IconCompatParcelizer);
        int i4 = MediaMetadataCompat + 33;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.MediaBrowserCompatMediaItem), 31);
        o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 = this.write;
        int iHashCode4 = 0;
        if (o7externalsyntheticlambda3 == null) {
            int i2 = MediaSessionCompatQueueItem + 31;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = o7externalsyntheticlambda3.hashCode();
        }
        List list = this.RatingCompat;
        if (list == null) {
            int i4 = MediaSessionCompatQueueItem + 103;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        t3 t3Var = this.read;
        if (t3Var == null) {
            int i6 = MediaSessionCompatQueueItem + 121;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = t3Var.hashCode();
        }
        Boolean bool = this.IconCompatParcelizer;
        if (bool != null) {
            iHashCode4 = bool.hashCode();
            int i8 = MediaMetadataCompat + 91;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return ((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 115;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2ExternalSyntheticLambda1)) {
            return false;
        }
        t2ExternalSyntheticLambda1 t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) obj;
        if (this.RemoteActionCompatParcelizer != t2externalsyntheticlambda1.RemoteActionCompatParcelizer) {
            return false;
        }
        Object[] objArr = {this.MediaBrowserCompatMediaItem, t2externalsyntheticlambda1.MediaBrowserCompatMediaItem};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.serializer, t2externalsyntheticlambda1.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {this.write, t2externalsyntheticlambda1.write};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr4 = {this.RatingCompat, t2externalsyntheticlambda1.RatingCompat};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr5 = {this.read, t2externalsyntheticlambda1.read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                    int i4 = MediaMetadataCompat + 105;
                    MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                Object[] objArr6 = {this.IconCompatParcelizer, t2externalsyntheticlambda1.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i6 = MediaSessionCompatQueueItem + 9;
                MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = MediaMetadataCompat + 81;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = MediaSessionCompatQueueItem;
        int i11 = i10 + 55;
        MediaMetadataCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        int i13 = i10 + 89;
        MediaMetadataCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
