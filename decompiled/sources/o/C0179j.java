package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;

/* JADX INFO: renamed from: o.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0179j implements resizeToBitmapDimensionslambda0 {
    private static int PlaybackStateCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final getPersonLastName RemoteActionCompatParcelizer;
    public final getBoolean read;
    public final String serializer;
    public final RectListDebuggerModifierNode write;

    public C0179j(String str, String str2, String str3, String str4, boolean z, String str5, RectListDebuggerModifierNode rectListDebuggerModifierNode, getBoolean getboolean, boolean z2) {
        this.MediaMetadataCompat = str;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
        this.MediaDescriptionCompat = str4;
        this.RatingCompat = z;
        this.MediaBrowserCompatMediaItem = str5;
        this.write = rectListDebuggerModifierNode;
        this.read = getboolean;
        this.MediaSessionCompatQueueItem = z2;
        this.RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.serializer(new NetworkingCoreModule$$ExternalSyntheticLambda2(6, this));
    }

    public /* synthetic */ C0179j(String str, String str2, String str3, String str4, String str5, getBoolean getboolean, boolean z) {
        this(str, str2, str3, str4, false, str5, new RectListDebuggerModifierNode(null, 2), getboolean, z);
    }

    public static C0179j write(C0179j c0179j, boolean z) {
        int i = 2 % 2;
        String str = c0179j.MediaMetadataCompat;
        String str2 = c0179j.serializer;
        String str3 = c0179j.IconCompatParcelizer;
        String str4 = c0179j.MediaDescriptionCompat;
        String str5 = c0179j.MediaBrowserCompatMediaItem;
        RectListDebuggerModifierNode rectListDebuggerModifierNode = c0179j.write;
        getBoolean getboolean = c0179j.read;
        boolean z2 = c0179j.MediaSessionCompatQueueItem;
        c0179j.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        rectListDebuggerModifierNode.getClass();
        getboolean.getClass();
        C0179j c0179j2 = new C0179j(str, str2, str3, str4, z, str5, rectListDebuggerModifierNode, getboolean, z2);
        int i2 = PlaybackStateCompat + 33;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return c0179j2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 123;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ForgotPasswordViewState(title=", this.MediaMetadataCompat, ", description=", this.serializer, ", btnText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", resetPasswordAlternateWayText=", this.MediaDescriptionCompat, ", showLoading=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", phonePrefix=", this.MediaBrowserCompatMediaItem, ", countDownState=", sbM, this.RatingCompat);
        sbM.append(this.write);
        sbM.append(", input=");
        sbM.append(this.read);
        sbM.append(", isPersistTimerEnable=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatQueueItem, ")");
        int i4 = PlaybackStateCompatCustomAction + 93;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat.hashCode() * 31, 31, this.serializer), 31, this.IconCompatParcelizer);
        String str = this.MediaDescriptionCompat;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = PlaybackStateCompatCustomAction + 21;
            PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = PlaybackStateCompat + 45;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.RatingCompat);
        String str2 = this.MediaBrowserCompatMediaItem;
        if (str2 == null) {
            int i6 = PlaybackStateCompatCustomAction + 125;
            PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                throw null;
            }
        } else {
            iHashCode2 = str2.hashCode();
        }
        return Boolean.hashCode(this.MediaSessionCompatQueueItem) + ((this.read.hashCode() + ((this.write.hashCode() + ((iM2 + iHashCode2) * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 81;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0179j)) {
            return false;
        }
        C0179j c0179j = (C0179j) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, c0179j.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, c0179j.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, c0179j.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, c0179j.MediaDescriptionCompat}, getCieXyz.write())).booleanValue() || this.RatingCompat != c0179j.RatingCompat) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, c0179j.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, c0179j.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, c0179j.read}, getCieXyz.write())).booleanValue()) {
            return this.MediaSessionCompatQueueItem == c0179j.MediaSessionCompatQueueItem;
        }
        int i4 = PlaybackStateCompat + 27;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
