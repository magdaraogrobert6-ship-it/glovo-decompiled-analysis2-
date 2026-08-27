package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final List IconCompatParcelizer;
    public final List RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final setFitInsetsSides serializer;
    public final List write;

    public r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4(String str, String str2, List list, List list2, setFitInsetsSides setfitinsetssides, List list3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = list;
        this.RatingCompat = list2;
        this.serializer = setfitinsetssides;
        this.IconCompatParcelizer = list3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.RatingCompat, c8$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31), 31);
        setFitInsetsSides setfitinsetssides = this.serializer;
        int iHashCode = this.IconCompatParcelizer.hashCode() + ((iM + (setfitinsetssides == null ? 0 : setfitinsetssides.hashCode())) * 31);
        int i4 = MediaBrowserCompatMediaItem + 75;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AutoAcceptState(acceptingDeliveryText=", this.read, ", successMessage=", this.RemoteActionCompatParcelizer, ", acceptDetails=");
        sbM.append(this.write);
        sbM.append(", trackingEvents=");
        sbM.append(this.RatingCompat);
        sbM.append(", metadata=");
        sbM.append(this.serializer);
        sbM.append(", deliveryIds=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 49;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 29;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 5;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            if (!(obj instanceof r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4)) {
                return false;
            }
            r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4 r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4 = (r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.read}, getCieXyz.write())).booleanValue()) {
                int i6 = MediaBrowserCompatMediaItem + 29;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.write}, getCieXyz.write())).booleanValue() || !this.RatingCompat.equals(r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.RatingCompat)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.serializer}, getCieXyz.write())).booleanValue() || (!this.IconCompatParcelizer.equals(r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.IconCompatParcelizer))) {
                return false;
            }
        }
        return true;
    }
}
