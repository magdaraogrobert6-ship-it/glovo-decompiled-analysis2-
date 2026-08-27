package com.roadrunner.delivery.pickupdropoff.details.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import java.util.Iterator;
import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet implements Parcelable {
    public static final Parcelable.Creator<InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet> CREATOR = new SearchResult.Creator(16);
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    private static int MediaSessionCompatQueueItem;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData IconCompatParcelizer;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData RemoteActionCompatParcelizer;
    public final List read;
    public final String serializer;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 9;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet(String str, InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData, InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2, InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData3, List list) {
        str.getClass();
        instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.getClass();
        instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2.getClass();
        instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData3.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData;
        this.write = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2;
        this.IconCompatParcelizer = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData3;
        this.read = list;
    }

    static {
        int i = MediaSessionCompatQueueItem + 81;
        MediaDescriptionCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        List list = this.read;
        if (list == null) {
            int i3 = MediaBrowserCompatMediaItem + 43;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode5 = list.hashCode();
            int i5 = MediaBrowserCompatMediaItem + 3;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode5;
        }
        return ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ActionSheet(title=");
        sb.append(this.serializer);
        sb.append(", callButton=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", copyButton=");
        sb.append(this.write);
        sb.append(", cancelButton=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sb, this.read, ")");
        int i2 = MediaMetadataCompat + 95;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        parcel.getClass();
        parcel.writeString(this.serializer);
        this.RemoteActionCompatParcelizer.writeToParcel(parcel, i);
        this.write.writeToParcel(parcel, i);
        this.IconCompatParcelizer.writeToParcel(parcel, i);
        List list = this.read;
        if (list == null) {
            int i3 = MediaMetadataCompat + 83;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i5 = MediaBrowserCompatMediaItem + 95;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            parcel.writeParcelable((Parcelable) it.next(), i);
            int i7 = MediaMetadataCompat + 85;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) {
            InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet = (InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.read}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = MediaBrowserCompatMediaItem + 73;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = MediaBrowserCompatMediaItem + 41;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = MediaBrowserCompatMediaItem + 53;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
