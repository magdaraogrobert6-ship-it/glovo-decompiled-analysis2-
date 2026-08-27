package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getLoaderKey extends Throwable {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public static final /* synthetic */ int write = 0;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getLoaderKey(String str, int i) {
        boolean z;
        boolean z2 = true;
        if ((i & 2) != 0) {
            int i2 = MediaDescriptionCompat;
            int i3 = i2 + 123;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        } else {
            z = true;
        }
        if ((i & 4) != 0) {
            int i8 = 2 % 2;
            z2 = false;
        }
        this(str, z, z2, false);
    }

    public getLoaderKey(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z2;
        this.IconCompatParcelizer = z3;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 71;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.serializer(af$$ExternalSyntheticOutline0.m("PictureUploadFailure(taskId=", this.read, ", isServerFailure=", ", isTimeOut=", this.RemoteActionCompatParcelizer), this.serializer, ", isTriedAllCompression=", this.IconCompatParcelizer, ")");
        }
        MediaSessionCompatQueueItem.serializer(af$$ExternalSyntheticOutline0.m("PictureUploadFailure(taskId=", this.read, ", isServerFailure=", ", isTimeOut=", this.RemoteActionCompatParcelizer), this.serializer, ", isTriedAllCompression=", this.IconCompatParcelizer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        int i4 = RatingCompat + 95;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getLoaderKey) {
                getLoaderKey getloaderkey = (getLoaderKey) obj;
                Object[] objArr = {this.read, getloaderkey.read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != getloaderkey.RemoteActionCompatParcelizer || this.serializer != getloaderkey.serializer) {
                    return false;
                }
                if (this.IconCompatParcelizer == getloaderkey.IconCompatParcelizer) {
                    int i2 = RatingCompat + 15;
                    MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                int i3 = MediaDescriptionCompat + 71;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = RatingCompat + 79;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = MediaDescriptionCompat + 93;
        RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
