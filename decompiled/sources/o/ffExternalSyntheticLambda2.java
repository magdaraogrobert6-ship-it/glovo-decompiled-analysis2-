package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ffExternalSyntheticLambda2 extends fe {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final f5 IconCompatParcelizer;
    public final g5 MediaBrowserCompatMediaItem;
    public final g4 MediaDescriptionCompat;
    public final f3 RemoteActionCompatParcelizer;
    public final String read;
    public final f8 write;

    @Override // o.fe
    public final g5 read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 123;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 29;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaDescriptionCompat;
        }
        int i3 = 72 / 0;
        return this.MediaDescriptionCompat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffExternalSyntheticLambda2(f8 f8Var, f5 f5Var, f3 f3Var, g4 g4Var, g5 g5Var, String str) {
        super(g5Var);
        f8Var.getClass();
        f5Var.getClass();
        f3Var.getClass();
        g4Var.getClass();
        g5Var.getClass();
        str.getClass();
        this.write = f8Var;
        this.IconCompatParcelizer = f5Var;
        this.RemoteActionCompatParcelizer = f3Var;
        this.MediaDescriptionCompat = g4Var;
        this.MediaBrowserCompatMediaItem = g5Var;
        this.read = str;
    }

    public ffExternalSyntheticLambda2(f8 f8Var, f5 f5Var, g5 g5Var) {
        this(f8Var, f5Var, f3.RemoteActionCompatParcelizer, new g4(), g5Var, d$$ExternalSyntheticOutline0.m());
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 37;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        this.RemoteActionCompatParcelizer.getClass();
        int iHashCode3 = this.MediaDescriptionCompat.hashCode();
        int iHashCode4 = this.read.hashCode() + ((this.MediaBrowserCompatMediaItem.hashCode() + ((iHashCode3 + ((((iHashCode2 + (iHashCode * 31)) * 31) + 989871831) * 31)) * 31)) * 31);
        int i4 = MediaMetadataCompat + 69;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ActionablePin(point=" + this.write + ", content=" + this.IconCompatParcelizer + ", behavior=" + this.RemoteActionCompatParcelizer + ", visibleZoomRange=" + this.MediaDescriptionCompat + ", showInSafeArea=" + this.MediaBrowserCompatMediaItem + ", id=" + this.read + ")";
        int i2 = MediaMetadataCompat + 117;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof ffExternalSyntheticLambda2))) {
                ffExternalSyntheticLambda2 ffexternalsyntheticlambda2 = (ffExternalSyntheticLambda2) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ffexternalsyntheticlambda2.write}, getCieXyz.write())).booleanValue()) {
                    int i2 = MediaSessionCompatQueueItem + 101;
                    MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ffexternalsyntheticlambda2.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ffexternalsyntheticlambda2.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    int i4 = MediaSessionCompatQueueItem + 57;
                    int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    MediaMetadataCompat = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 25;
                    MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, ffexternalsyntheticlambda2.MediaDescriptionCompat}, getCieXyz.write())).booleanValue() || this.MediaBrowserCompatMediaItem != ffexternalsyntheticlambda2.MediaBrowserCompatMediaItem) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ffexternalsyntheticlambda2.read}, getCieXyz.write())).booleanValue();
            }
            int i9 = MediaMetadataCompat + 9;
            MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 == 0;
        }
        int i10 = MediaMetadataCompat + 45;
        MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return true;
    }
}
