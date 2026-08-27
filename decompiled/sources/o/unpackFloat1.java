package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptValidationError$Companion;
import kotlinx.serialization.Serializable;
import o.floatFromBits;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept_result_validation_error")
public final class unpackFloat1 extends fastRoundToInt {
    public static final AutoAcceptV2Data$AutoAcceptValidationError$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptValidationError$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 107;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            floatFromBits floatfrombits = floatFromBits.write;
            int i4 = write + 17;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return floatfrombits;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String message;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptValidationError$Companion] */
    static {
        int i = serializer + 31;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 59;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ unpackFloat1(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.message = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, floatFromBits.write.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AutoAcceptValidationError(title=", this.title, ", message=", this.message, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AutoAcceptValidationError(title=", this.title, ", message=", this.message, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.message.hashCode() / (this.title.hashCode() / 120);
        }
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 13;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof unpackFloat1) {
            unpackFloat1 unpackfloat1 = (unpackFloat1) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, unpackfloat1.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, unpackfloat1.message}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = RemoteActionCompatParcelizer + 59;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = i2 + 39;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
