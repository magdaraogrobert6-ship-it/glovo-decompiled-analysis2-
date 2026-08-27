package o;

import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;

/* JADX INFO: loaded from: classes3.dex */
public final class hasDesignInfo implements getDesignInfoOrNull {
    private static int read = 0;
    private static int serializer = 1;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider IconCompatParcelizer;
    public final InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet write;

    public hasDesignInfo(InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider, InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) {
        instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.getClass();
        instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.getClass();
        this.IconCompatParcelizer = instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
        this.write = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write.hashCode() << (this.IconCompatParcelizer.hashCode() - 66);
        }
        return (this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ContactRiderData(riderDetails=" + this.IconCompatParcelizer + ", actionSheetData=" + this.write + ")";
        int i2 = read + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasDesignInfo)) {
            int i4 = i3 + 7;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = !(i4 % 2 == 0);
            int i5 = i3 + 111;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return z;
        }
        hasDesignInfo hasdesigninfo = (hasDesignInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, hasdesigninfo.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, hasdesigninfo.write}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 13;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = serializer + 45;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 2 / 0;
        }
        return true;
    }
}
