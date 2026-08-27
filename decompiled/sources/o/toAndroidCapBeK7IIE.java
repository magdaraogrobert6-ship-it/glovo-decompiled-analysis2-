package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class toAndroidCapBeK7IIE {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final DrawStyleSpan_androidKt IconCompatParcelizer;
    public final Map MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final findField MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final invokeyxL6bBk serializer;
    public final String write;

    public toAndroidCapBeK7IIE(String str, DrawStyleSpan_androidKt drawStyleSpan_androidKt, String str2, String str3, String str4, findField findfield, invokeyxL6bBk invokeyxl6bbk, Map map) {
        str.getClass();
        drawStyleSpan_androidKt.getClass();
        this.MediaDescriptionCompat = str;
        this.IconCompatParcelizer = drawStyleSpan_androidKt;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.read = str4;
        this.MediaMetadataCompat = findfield;
        this.serializer = invokeyxl6bbk;
        this.MediaBrowserCompatMediaItem = map;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("TripPlannerItem(name=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", destinationType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", additionalOrderInfo=");
        c8$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", address=", this.write, ", arrivalTime=");
        sb.append(this.read);
        sb.append(", payTag=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", actions=");
        sb.append(this.serializer);
        sb.append(", trackingParams=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(")");
        String string = sb.toString();
        int i2 = MediaSessionCompatQueueItem + 51;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.MediaDescriptionCompat.hashCode();
        int iHashCode5 = this.IconCompatParcelizer.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.write;
        if (str2 == null) {
            int i2 = RatingCompat + 17;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 87;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.read;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        findField findfield = this.MediaMetadataCompat;
        if (findfield == null) {
            int i7 = MediaSessionCompatQueueItem + 33;
            RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = findfield.hashCode();
        }
        invokeyxL6bBk invokeyxl6bbk = this.serializer;
        if (invokeyxl6bbk == null) {
            int i9 = MediaSessionCompatQueueItem + 75;
            RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = invokeyxl6bbk.hashCode();
        }
        Map map = this.MediaBrowserCompatMediaItem;
        return ((((((((((((iHashCode5 + (iHashCode4 * 31)) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 75;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toAndroidCapBeK7IIE)) {
            return false;
        }
        toAndroidCapBeK7IIE toandroidcapbek7iie = (toAndroidCapBeK7IIE) obj;
        Object[] objArr = {this.MediaDescriptionCompat, toandroidcapbek7iie.MediaDescriptionCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = MediaSessionCompatQueueItem + 111;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.IconCompatParcelizer != toandroidcapbek7iie.IconCompatParcelizer) {
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, toandroidcapbek7iie.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.write, toandroidcapbek7iie.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.read, toandroidcapbek7iie.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.MediaMetadataCompat, toandroidcapbek7iie.MediaMetadataCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.serializer, toandroidcapbek7iie.serializer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            Object[] objArr7 = {this.MediaBrowserCompatMediaItem, toandroidcapbek7iie.MediaBrowserCompatMediaItem};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = RatingCompat + 97;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RatingCompat + 57;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 113;
        RatingCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            int i11 = 74 / 0;
        }
        return false;
    }
}
