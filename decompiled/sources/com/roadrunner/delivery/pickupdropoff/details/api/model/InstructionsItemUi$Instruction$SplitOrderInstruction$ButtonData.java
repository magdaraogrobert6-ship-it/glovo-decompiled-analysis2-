package com.roadrunner.delivery.pickupdropoff.details.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import java.util.Iterator;
import java.util.List;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData implements Parcelable {
    public static final Parcelable.Creator<InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData> CREATOR = new SearchResult.Creator(17);
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final List read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 23;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData(String str, List list) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.read = list;
    }

    static {
        int i = RemoteActionCompatParcelizer + 7;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 99;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("ButtonData(title=", this.IconCompatParcelizer, ", trackingEvents=", this.read, ")");
        int i4 = RatingCompat + 11;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 49;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        List list = this.read;
        if (list == null) {
            int i4 = write + 105;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r22 instanceof com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r3 = r3 + 109;
        com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r1 = (com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.IconCompatParcelizer, r1.IconCompatParcelizer}, o.getCieXyz.write())).booleanValue()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r1 = com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.write + 29;
        com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.read, r1.read}, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r1 = com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat + 75;
        com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r3 = r3 + 125;
        com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.write
            int r4 = r3 + 5
            int r5 = r4 % 128
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat = r5
            int r4 = r4 % r2
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L1a
            r4 = 10
            int r4 = r4 / r6
            if (r0 != r1) goto L27
            goto L1c
        L1a:
            if (r0 != r1) goto L27
        L1c:
            int r3 = r3 + 125
            int r1 = r3 % 128
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat = r1
            int r3 = r3 % r2
            if (r3 != 0) goto L26
            return r6
        L26:
            return r5
        L27:
            boolean r4 = r1 instanceof com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData
            if (r4 != 0) goto L33
            int r3 = r3 + 109
            int r1 = r3 % 128
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat = r1
            int r3 = r3 % r2
            return r6
        L33:
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData r1 = (com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData) r1
            java.lang.String r3 = r0.IconCompatParcelizer
            java.lang.String r4 = r1.IconCompatParcelizer
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r15
            r9 = r16
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ r5
            if (r3 == 0) goto L6d
            int r1 = com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.write
            int r1 = r1 + 29
            int r3 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat = r3
            int r1 = r1 % r2
            return r6
        L6d:
            java.util.List r3 = r0.read
            java.util.List r1 = r1.read
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L9b
            int r1 = com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.RatingCompat
            int r1 = r1 + 75
            int r3 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.write = r3
            int r1 = r1 % r2
            return r6
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.equals(java.lang.Object):boolean");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        parcel.getClass();
        parcel.writeString(this.IconCompatParcelizer);
        List list = this.read;
        if (list == null) {
            int i3 = RatingCompat + 47;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
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
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
            int i4 = RatingCompat + 109;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}
