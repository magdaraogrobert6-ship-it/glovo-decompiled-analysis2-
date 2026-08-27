package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SaversKtColorSaver2 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final List IconCompatParcelizer;
    public final List MediaMetadataCompat;
    public final setFitInsetsSides MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final invoke4WTKRHQ read;
    public final List serializer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 23;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 97;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public SaversKtColorSaver2(invoke4WTKRHQ invoke4wtkrhq, String str, String str2, List list, List list2, setFitInsetsSides setfitinsetssides, List list3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.read = invoke4wtkrhq;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = list;
        this.MediaMetadataCompat = list2;
        this.MediaSessionCompatQueueItem = setfitinsetssides;
        this.serializer = list3;
    }

    public /* synthetic */ SaversKtColorSaver2(String str, String str2, List list, List list2, setFitInsetsSides setfitinsetssides, List list3) {
        this(null, str, str2, list, list2, setfitinsetssides, list3);
    }

    public static SaversKtColorSaver2 read(SaversKtColorSaver2 saversKtColorSaver2, invoke4WTKRHQ invoke4wtkrhq) {
        int i = 2 % 2;
        String str = saversKtColorSaver2.RemoteActionCompatParcelizer;
        String str2 = saversKtColorSaver2.write;
        List list = saversKtColorSaver2.IconCompatParcelizer;
        List list2 = saversKtColorSaver2.MediaMetadataCompat;
        setFitInsetsSides setfitinsetssides = saversKtColorSaver2.MediaSessionCompatQueueItem;
        List list3 = saversKtColorSaver2.serializer;
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        SaversKtColorSaver2 saversKtColorSaver3 = new SaversKtColorSaver2(invoke4wtkrhq, str, str2, list, list2, setfitinsetssides, list3);
        int i2 = MediaBrowserCompatMediaItem + 47;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return saversKtColorSaver3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        invoke4WTKRHQ invoke4wtkrhq = this.read;
        int iHashCode2 = 0;
        if (invoke4wtkrhq == null) {
            iHashCode = 0;
        } else {
            iHashCode = invoke4wtkrhq.hashCode();
            int i4 = MediaBrowserCompatMediaItem + 111;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iM = c8$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat, c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.RemoteActionCompatParcelizer), 31, this.write), 31), 31);
        setFitInsetsSides setfitinsetssides = this.MediaSessionCompatQueueItem;
        if (setfitinsetssides == null) {
            int i6 = MediaBrowserCompatMediaItem + 37;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
        } else {
            iHashCode2 = setfitinsetssides.hashCode();
        }
        return this.serializer.hashCode() + ((iM + iHashCode2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeliveryAutoAcceptUiState(errorDialogState=");
        sb.append(this.read);
        sb.append(", message=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", loadingText=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.write, ", acceptDetails=", this.IconCompatParcelizer, ", trackingEvents=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", metadata=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", deliveryIds=");
        String str = MediaSessionCompatQueueItem.read(sb, this.serializer, ")");
        int i2 = MediaBrowserCompatMediaItem + 53;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaversKtColorSaver2)) {
            return false;
        }
        SaversKtColorSaver2 saversKtColorSaver2 = (SaversKtColorSaver2) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, saversKtColorSaver2.read}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, saversKtColorSaver2.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, saversKtColorSaver2.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, saversKtColorSaver2.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, saversKtColorSaver2.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, saversKtColorSaver2.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, saversKtColorSaver2.serializer}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = RatingCompat + 117;
                    MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 != 0;
                }
                int i3 = MediaBrowserCompatMediaItem + 115;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = RatingCompat + 13;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = MediaBrowserCompatMediaItem + 11;
        RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
