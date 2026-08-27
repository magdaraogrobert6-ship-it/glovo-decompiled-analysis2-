package com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ContactRiderArgs implements Parcelable {
    public static final Parcelable.Creator<ContactRiderArgs> CREATOR = new SearchResult.Creator(19);
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet IconCompatParcelizer;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 59;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 91;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public ContactRiderArgs(InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider, InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) {
        instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.getClass();
        instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.getClass();
        this.serializer = instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
        this.IconCompatParcelizer = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
    }

    static {
        int i = read + 69;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = write + 113;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeParcelable(this.serializer, i);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        int i5 = MediaMetadataCompat + 49;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 29;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = MediaMetadataCompat + 95;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ContactRiderArgs(otherRider=" + this.serializer + ", actionSheet=" + this.IconCompatParcelizer + ")";
        int i2 = MediaMetadataCompat + 51;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 125;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        if (!(obj instanceof ContactRiderArgs)) {
            return false;
        }
        ContactRiderArgs contactRiderArgs = (ContactRiderArgs) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, contactRiderArgs.serializer}, getCieXyz.write())).booleanValue()) {
            int i5 = MediaMetadataCompat + 85;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, contactRiderArgs.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i7 = MediaMetadataCompat + 49;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
