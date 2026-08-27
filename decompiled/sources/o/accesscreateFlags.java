package o;

import androidx.compose.ui.graphics.Fields;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.roadrunner.delivery.state.StateV3$AcceptData$StackedEarningsMessage$Companion;
import kotlinx.serialization.Serializable;
import o.accessflagsWithSecureFlagInherited;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "stack_earnings_message")
public final class accesscreateFlags extends accessgetCurrentlyFocusedRect {
    public static final StateV3$AcceptData$StackedEarningsMessage$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$StackedEarningsMessage$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 109;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessflagsWithSecureFlagInherited accessflagswithsecureflaginherited = accessflagsWithSecureFlagInherited.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 21;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return accessflagswithsecureflaginherited;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String description;
    public final String highlightedText;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$StackedEarningsMessage$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 13;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accesscreateFlags(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.highlightedText = str;
            this.description = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessflagsWithSecureFlagInherited.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StackedEarningsMessage(highlightedText=", this.highlightedText, ", description=", this.description, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StackedEarningsMessage(highlightedText=", this.highlightedText, ", description=", this.description, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.description.hashCode() % (this.highlightedText.hashCode() >> GwiErrorCode.ALG_LIBRARY_NOT_EXIST);
        } else {
            iHashCode = this.description.hashCode() + (this.highlightedText.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 47;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 81;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof accesscreateFlags)) {
            return false;
        }
        accesscreateFlags accesscreateflags = (accesscreateFlags) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.highlightedText, accesscreateflags.highlightedText}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, accesscreateflags.description}, getCieXyz.write())).booleanValue()) {
                int i3 = IconCompatParcelizer + 27;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 != 0;
            }
            int i4 = IconCompatParcelizer + 89;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i5 = IconCompatParcelizer + 85;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return false;
    }
}
