package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.quests.data.RewardTagResponse$Companion;
import kotlinx.serialization.Serializable;
import o.injectFeatureFlagsWithParameters;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class buildAttributionPackage {
    public static final RewardTagResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.quests.data.RewardTagResponse$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 9;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return injectFeatureFlagsWithParameters.read;
            }
            injectFeatureFlagsWithParameters injectfeatureflagswithparameters = injectFeatureFlagsWithParameters.read;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String description;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.quests.data.RewardTagResponse$Companion] */
    static {
        int i = read + 63;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public /* synthetic */ buildAttributionPackage(int i, String str, String str2) {
        if (2 == (i & 2)) {
            if ((i & 1) == 0) {
                this.text = null;
                int i2 = write + 123;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.text = str;
                int i4 = write + 57;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 2;
                } else {
                    int i6 = 2 % 2;
                }
            }
            this.description = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, injectFeatureFlagsWithParameters.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = write + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("RewardTagResponse(text=", this.text, ", description=", this.description, ")");
            int i3 = 12 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("RewardTagResponse(text=", this.text, ", description=", this.description, ")");
        }
        int i4 = write + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.text;
        if (str == null) {
            int i2 = write;
            int i3 = i2 + 99;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
            int i4 = i2 + 33;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode = str.hashCode();
        }
        return this.description.hashCode() + (iHashCode * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 33;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof buildAttributionPackage) {
            buildAttributionPackage buildattributionpackage = (buildAttributionPackage) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, buildattributionpackage.text}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, buildattributionpackage.description}, getCieXyz.write())).booleanValue()) {
                int i7 = write + 125;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i7 % 2 != 0;
            }
            int i8 = IconCompatParcelizer + 65;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i9 = i2 + 107;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
