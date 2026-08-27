package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setRefreshingWithoutSwipeGesture {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final String IconCompatParcelizer;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final setOnRefreshListener RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final setProgressBackgroundColor read;
    public final setLegacyRequestDisallowInterceptTouchEventEnabled serializer;
    public final Integer write;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setRefreshingWithoutSwipeGesture(String str, int i) {
        boolean z;
        setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.None;
        if ((i & 8) != 0) {
            int i2 = MediaBrowserCompatMediaItem + 25;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            str = null;
        }
        String str2 = str;
        setProgressBackgroundColor setprogressbackgroundcolor = setProgressBackgroundColor.DEFAULT;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i4 = MediaDescriptionCompat + 105;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 33;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z = false;
        } else {
            z = true;
        }
        this(setlegacyrequestdisallowintercepttoucheventenabled, null, null, str2, null, setprogressbackgroundcolor, false, z);
    }

    public setRefreshingWithoutSwipeGesture(setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled, Integer num, setOnRefreshListener setonrefreshlistener, String str, String str2, setProgressBackgroundColor setprogressbackgroundcolor, boolean z, boolean z2) {
        setlegacyrequestdisallowintercepttoucheventenabled.getClass();
        setprogressbackgroundcolor.getClass();
        this.serializer = setlegacyrequestdisallowintercepttoucheventenabled;
        this.write = num;
        this.RatingCompat = setonrefreshlistener;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = setprogressbackgroundcolor;
        this.MediaMetadataCompat = z;
        this.MediaSessionCompatQueueItem = z2;
    }

    public static setRefreshingWithoutSwipeGesture serializer(setRefreshingWithoutSwipeGesture setrefreshingwithoutswipegesture, setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled, setOnRefreshListener setonrefreshlistener, String str, setProgressBackgroundColor setprogressbackgroundcolor, boolean z, int i) {
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 115;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i4;
        int i5 = i3 % 2;
        setOnRefreshListener setonrefreshlistener2 = (i & 4) != 0 ? setrefreshingwithoutswipegesture.RatingCompat : setonrefreshlistener;
        if ((i & 8) != 0) {
            int i6 = i4 + 45;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i7;
            int i8 = i6 % 2;
            String str5 = setrefreshingwithoutswipegesture.RemoteActionCompatParcelizer;
            int i9 = i7 + 63;
            MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            str2 = str5;
        } else {
            str2 = null;
        }
        int i11 = MediaDescriptionCompat;
        int i12 = i11 + 125;
        MediaBrowserCompatMediaItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        if ((i & 16) != 0) {
            int i14 = i11 + 9;
            MediaBrowserCompatMediaItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                str4 = setrefreshingwithoutswipegesture.IconCompatParcelizer;
                int i15 = 54 / 0;
            } else {
                str4 = setrefreshingwithoutswipegesture.IconCompatParcelizer;
            }
            str3 = str4;
        } else {
            str3 = str;
        }
        setProgressBackgroundColor setprogressbackgroundcolor2 = (i & 32) != 0 ? setrefreshingwithoutswipegesture.read : setprogressbackgroundcolor;
        boolean z2 = setrefreshingwithoutswipegesture.MediaSessionCompatQueueItem;
        setlegacyrequestdisallowintercepttoucheventenabled.getClass();
        setprogressbackgroundcolor2.getClass();
        setRefreshingWithoutSwipeGesture setrefreshingwithoutswipegesture2 = new setRefreshingWithoutSwipeGesture(setlegacyrequestdisallowintercepttoucheventenabled, null, setonrefreshlistener2, str2, str3, setprogressbackgroundcolor2, z, z2);
        int i16 = MediaDescriptionCompat + 47;
        MediaBrowserCompatMediaItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i17 = i16 % 2;
        return setrefreshingwithoutswipegesture2;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.serializer.hashCode();
        Integer num = this.write;
        if (num == null) {
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            int i2 = MediaDescriptionCompat + 101;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        setOnRefreshListener setonrefreshlistener = this.RatingCompat;
        if (setonrefreshlistener == null) {
            int i4 = MediaBrowserCompatMediaItem + 87;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = setonrefreshlistener.hashCode();
        }
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.IconCompatParcelizer;
        return Boolean.hashCode(this.MediaSessionCompatQueueItem) + d$$ExternalSyntheticOutline0.m((this.read.hashCode() + (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.MediaMetadataCompat);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("RecordingViewState(indicatorArcState=");
        sb.append(this.serializer);
        sb.append(", movementAnimation=");
        sb.append(this.write);
        sb.append(", pageIndicator=");
        sb.append(this.RatingCompat);
        sb.append(", movementInstructions=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", movementInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", movementInfoTextStyle=");
        sb.append(this.read);
        sb.append(", showErrorCard=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sb, this.MediaMetadataCompat, ", showFaceAnimation=", this.MediaSessionCompatQueueItem, ")");
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strSerializer;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRefreshingWithoutSwipeGesture)) {
            return false;
        }
        setRefreshingWithoutSwipeGesture setrefreshingwithoutswipegesture = (setRefreshingWithoutSwipeGesture) obj;
        if (this.serializer != setrefreshingwithoutswipegesture.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setrefreshingwithoutswipegesture.write}, getCieXyz.write())).booleanValue()) {
            int i3 = MediaBrowserCompatMediaItem + 103;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, setrefreshingwithoutswipegesture.RatingCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, setrefreshingwithoutswipegesture.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setrefreshingwithoutswipegesture.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.read == setrefreshingwithoutswipegesture.read && this.MediaMetadataCompat == setrefreshingwithoutswipegesture.MediaMetadataCompat && this.MediaSessionCompatQueueItem == setrefreshingwithoutswipegesture.MediaSessionCompatQueueItem;
    }
}
