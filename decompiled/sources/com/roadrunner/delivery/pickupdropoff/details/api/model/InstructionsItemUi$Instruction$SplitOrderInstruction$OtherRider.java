package com.roadrunner.delivery.pickupdropoff.details.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider implements Parcelable {
    public static final Parcelable.Creator<InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider> CREATOR = new SearchResult.Creator(18);
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String read;
    public final List serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 53;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.serializer = list;
    }

    static {
        int i = MediaMetadataCompat + 51;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("OtherRider(riderTitle=", this.read, ", riderName=", this.write, ", phoneNumber="), this.IconCompatParcelizer, ", trackingEvents=", this.serializer, ")");
        }
        int i3 = 70 / 0;
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("OtherRider(riderTitle=", this.read, ", riderName=", this.write, ", phoneNumber="), this.IconCompatParcelizer, ", trackingEvents=", this.serializer, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.write);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i2 = RatingCompat + 3;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List list = this.serializer;
        int iHashCode2 = ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
        int i4 = RatingCompat + 3;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 111;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider)) {
            int i5 = i3 + 101;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider = (InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.read}, getCieXyz.write())).booleanValue()) {
            int i7 = MediaSessionCompatQueueItem + 33;
            RatingCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.serializer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i9 = RatingCompat + 29;
        MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        parcel.getClass();
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        List list = this.serializer;
        if (list == null) {
            int i3 = MediaSessionCompatQueueItem + 11;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                parcel.writeInt(1);
                return;
            } else {
                parcel.writeInt(0);
                return;
            }
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        int i4 = RatingCompat + 113;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
