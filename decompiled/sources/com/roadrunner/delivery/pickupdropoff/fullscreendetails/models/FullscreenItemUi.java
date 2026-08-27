package com.roadrunner.delivery.pickupdropoff.fullscreendetails.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class FullscreenItemUi implements Parcelable {
    public static final Parcelable.Creator<FullscreenItemUi> CREATOR = new SearchResult.Creator(21);
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ serializer;
    public final List write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 21;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 57;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public FullscreenItemUi(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, List list) {
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        list.getClass();
        this.serializer = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        this.write = list;
    }

    static {
        int i = RemoteActionCompatParcelizer + 81;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 51;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = MediaSessionCompatQueueItem + 75;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FullscreenItemUi(fullscreenDetails=" + this.serializer + ", trackingEvents=" + this.write + ")";
        int i2 = MediaSessionCompatQueueItem + 113;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaSessionCompatQueueItem + 5;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FullscreenItemUi)) {
            return false;
        }
        FullscreenItemUi fullscreenItemUi = (FullscreenItemUi) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, fullscreenItemUi.serializer}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, fullscreenItemUi.write}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = MediaSessionCompatQueueItem + 13;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = MediaSessionCompatQueueItem + 65;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 53;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = this.serializer;
        parcel.writeInt(r8lambdaiidsddyirtymdul5lt6pmt2zysq.size());
        Iterator it = r8lambdaiidsddyirtymdul5lt6pmt2zysq.iterator();
        while (it.hasNext()) {
            int i5 = MediaSessionCompatQueueItem + 93;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                ((FullscreenDetailUi) it.next()).writeToParcel(parcel, i);
                throw null;
            }
            ((FullscreenDetailUi) it.next()).writeToParcel(parcel, i);
        }
        List list = this.write;
        parcel.writeInt(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((Parcelable) it2.next(), i);
        }
    }
}
