package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class copyIuqyXdgdefault extends copyNcG25M8default {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;
    public final boolean write;

    public copyIuqyXdgdefault(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5) {
        str.getClass();
        this.MediaMetadataCompat = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = z;
        this.write = z2;
        this.read = z3;
        this.MediaDescriptionCompat = str3;
        this.IconCompatParcelizer = str4;
        this.RatingCompat = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 97;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Preferences(title=", this.MediaMetadataCompat, ", description=", this.RemoteActionCompatParcelizer, ", isChecked=");
        af$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", isInteractionEnabled=", this.write, ", isShiftEnding=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", stateOnText=", this.MediaDescriptionCompat, ", stateOffText=", sbM, this.read);
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", statePausedText=", this.RatingCompat, ")");
        int i4 = MediaBrowserCompatMediaItem + 77;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.MediaMetadataCompat.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode4 = 0;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode3 * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.serializer), 31, this.write), 31, this.read);
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            int i2 = MediaSessionCompatQueueItem + 113;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null) {
            int i4 = MediaBrowserCompatMediaItem + 109;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.RatingCompat;
        if (str4 != null) {
            iHashCode4 = str4.hashCode();
            int i6 = MediaSessionCompatQueueItem + 61;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 21;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyIuqyXdgdefault)) {
            return false;
        }
        copyIuqyXdgdefault copyiuqyxdgdefault = (copyIuqyXdgdefault) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, copyiuqyxdgdefault.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, copyiuqyxdgdefault.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) || this.serializer != copyiuqyxdgdefault.serializer || this.write != copyiuqyxdgdefault.write || this.read != copyiuqyxdgdefault.read) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, copyiuqyxdgdefault.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, copyiuqyxdgdefault.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i3 = MediaSessionCompatQueueItem;
                int i4 = i3 + 87;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i3 + 113;
                MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, copyiuqyxdgdefault.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i8 = MediaSessionCompatQueueItem + 113;
            int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 109;
            MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        return false;
    }
}
