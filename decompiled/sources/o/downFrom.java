package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.FinishedSessionData$Companion;
import kotlinx.serialization.Serializable;
import o.FlowLiveDataConversionsasLiveData11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class downFrom {
    public static final FinishedSessionData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.FinishedSessionData$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 85;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FlowLiveDataConversionsasLiveData11 flowLiveDataConversionsasLiveData11 = FlowLiveDataConversionsasLiveData11.serializer;
            int i4 = read + 37;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return flowLiveDataConversionsasLiveData11;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String description;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.FinishedSessionData$Companion] */
    static {
        int i = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ downFrom(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.description = str;
            this.style = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FlowLiveDataConversionsasLiveData11.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("FinishedSessionData(description=", this.description, ", style=", this.style, ")");
        int i4 = read + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.style.hashCode() + (this.description.hashCode() * 31);
        int i4 = serializer + 119;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof downFrom)) {
            return false;
        }
        downFrom downfrom = (downFrom) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, downfrom.description}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, downfrom.style}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 107;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer;
        int i5 = i4 + 93;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 61;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return z;
    }
}
