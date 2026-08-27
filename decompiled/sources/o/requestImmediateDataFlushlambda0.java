package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.twofa.data.model.TwoFaTriggerResponse$Companion;
import kotlinx.serialization.Serializable;
import o.requestImmediateDataFlushlambda10;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class requestImmediateDataFlushlambda0 {
    public static final TwoFaTriggerResponse$Companion Companion = new Object() { // from class: com.roadrunner.twofa.data.model.TwoFaTriggerResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 3;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            requestImmediateDataFlushlambda10 requestimmediatedataflushlambda10 = requestImmediateDataFlushlambda10.read;
            int i4 = RemoteActionCompatParcelizer + 31;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return requestimmediatedataflushlambda10;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final long expiresAt;
    public final String flowId;
    public final String status;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.twofa.data.model.TwoFaTriggerResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 43;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ requestImmediateDataFlushlambda0(int i, long j, String str, String str2) {
        if (7 == (i & 7)) {
            this.status = str;
            this.flowId = str2;
            this.expiresAt = j;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, requestImmediateDataFlushlambda10.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        String str;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int iHashCode = this.status.hashCode();
            str = this.flowId;
            i2 = iHashCode / 104;
            i = 28;
        } else {
            int iHashCode2 = this.status.hashCode();
            str = this.flowId;
            i = 31;
            i2 = iHashCode2 * 31;
        }
        return Long.hashCode(this.expiresAt) + af$$ExternalSyntheticOutline0.m(i2, i, str);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = c8$$ExternalSyntheticOutline0.m(this.expiresAt, ")", c8$$ExternalSyntheticOutline0.m("TwoFaTriggerResponse(status=", this.status, ", flowId=", this.flowId, ", expiresAt="));
        int i4 = IconCompatParcelizer + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 107;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof requestImmediateDataFlushlambda0)) {
            return false;
        }
        requestImmediateDataFlushlambda0 requestimmediatedataflushlambda0 = (requestImmediateDataFlushlambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, requestimmediatedataflushlambda0.status}, getCieXyz.write())).booleanValue()) {
            int i3 = serializer + 73;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.flowId, requestimmediatedataflushlambda0.flowId}, getCieXyz.write())).booleanValue() && this.expiresAt == requestimmediatedataflushlambda0.expiresAt;
    }
}
