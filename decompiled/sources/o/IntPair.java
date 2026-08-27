package o;

import com.roadrunner.password_rules.entity.RuleList$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class IntPair {
    public static final RuleList$Companion Companion = new RuleList$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final colorToRgbaArray digitRule;
    public final colorToRgbaArray lowerCaseRule;
    public final colorToRgbaArray minCharRule;
    public final colorToRgbaArray specialRule;
    public final colorToRgbaArray upperCaseRule;

    static {
        int i = IconCompatParcelizer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ IntPair(int i, colorToRgbaArray colortorgbaarray, colorToRgbaArray colortorgbaarray2, colorToRgbaArray colortorgbaarray3, colorToRgbaArray colortorgbaarray4, colorToRgbaArray colortorgbaarray5) {
        if (31 == (i & 31)) {
            this.upperCaseRule = colortorgbaarray;
            this.lowerCaseRule = colortorgbaarray2;
            this.digitRule = colortorgbaarray3;
            this.specialRule = colortorgbaarray4;
            this.minCharRule = colortorgbaarray5;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, LifecyclesKt.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.upperCaseRule.hashCode();
        int iHashCode2 = this.lowerCaseRule.hashCode();
        int iHashCode3 = this.digitRule.hashCode();
        int iHashCode4 = this.minCharRule.hashCode() + ((this.specialRule.hashCode() + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31);
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RuleList(upperCaseRule=" + this.upperCaseRule + ", lowerCaseRule=" + this.lowerCaseRule + ", digitRule=" + this.digitRule + ", specialRule=" + this.specialRule + ", minCharRule=" + this.minCharRule + ")";
        int i2 = RemoteActionCompatParcelizer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof IntPair)) {
                int i2 = write + 31;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            IntPair intPair = (IntPair) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.upperCaseRule, intPair.upperCaseRule}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lowerCaseRule, intPair.lowerCaseRule}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.digitRule, intPair.digitRule}, getCieXyz.write())).booleanValue())) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.specialRule, intPair.specialRule}, getCieXyz.write())).booleanValue())) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.minCharRule, intPair.minCharRule}, getCieXyz.write())).booleanValue();
                }
                int i4 = RemoteActionCompatParcelizer + 9;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = RemoteActionCompatParcelizer + 37;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = RemoteActionCompatParcelizer + 35;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
