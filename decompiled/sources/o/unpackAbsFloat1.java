package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptFailure$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidTrace_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept_result_failure")
public final class unpackAbsFloat1 extends fastRoundToInt {
    public static final AutoAcceptV2Data$AutoAcceptFailure$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptFailure$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 113;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidTrace_androidKt androidTrace_androidKt = AndroidTrace_androidKt.serializer;
            int i4 = read + 125;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
            }
            return androidTrace_androidKt;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String message;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptFailure$Companion] */
    static {
        int i = read + 63;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 125;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 111;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ unpackAbsFloat1(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.message = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidTrace_androidKt.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AutoAcceptFailure(title=", this.title, ", message=", this.message, ")");
            int i3 = write + 43;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strWrite;
            }
            obj.hashCode();
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AutoAcceptFailure(title=", this.title, ", message=", this.message, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.message.hashCode() + (this.title.hashCode() * 31);
        int i4 = write + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 85;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof unpackAbsFloat1)) {
            return false;
        }
        unpackAbsFloat1 unpackabsfloat1 = (unpackAbsFloat1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, unpackabsfloat1.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, unpackabsfloat1.message}, getCieXyz.write())).booleanValue();
    }
}
