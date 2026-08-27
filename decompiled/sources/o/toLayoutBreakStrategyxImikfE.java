package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Breakdown$Companion;
import kotlinx.serialization.Serializable;
import o.AnnotatedString;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class toLayoutBreakStrategyxImikfE {
    public static final HostMessage$HostLoadingPerformanceMeasurement$Breakdown$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Breakdown$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            AnnotatedString annotatedString;
            int i = 2 % 2;
            int i2 = write + 29;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                annotatedString = AnnotatedString.serializer;
                int i3 = 2 / 0;
            } else {
                annotatedString = AnnotatedString.serializer;
            }
            int i4 = write + 35;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return annotatedString;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final int bridgeHandshakeDuration;
    public final int hostExternalRequestDuration;
    public final int hostNativeDuration;
    public final int webViewLoadDuration;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Breakdown$Companion] */
    static {
        int i = write + 83;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ toLayoutBreakStrategyxImikfE(int i, int i2, int i3, int i4, int i5) {
        if (15 == (i & 15)) {
            this.hostNativeDuration = i2;
            this.hostExternalRequestDuration = i3;
            this.bridgeHandshakeDuration = i4;
            this.webViewLoadDuration = i5;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, AnnotatedString.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.webViewLoadDuration) + af$$ExternalSyntheticOutline0.m(this.bridgeHandshakeDuration, af$$ExternalSyntheticOutline0.m(this.hostExternalRequestDuration, Integer.hashCode(this.hostNativeDuration) * 31, 31), 31);
        int i4 = serializer + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public toLayoutBreakStrategyxImikfE(int i, int i2, int i3, int i4) {
        this.hostNativeDuration = i;
        this.hostExternalRequestDuration = i2;
        this.bridgeHandshakeDuration = i3;
        this.webViewLoadDuration = i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.hostNativeDuration, this.hostExternalRequestDuration, "Breakdown(hostNativeDuration=", ", hostExternalRequestDuration=", ", bridgeHandshakeDuration=");
        sbM.append(this.bridgeHandshakeDuration);
        sbM.append(", webViewLoadDuration=");
        sbM.append(this.webViewLoadDuration);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 73;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 125;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        if (!(obj instanceof toLayoutBreakStrategyxImikfE)) {
            return false;
        }
        toLayoutBreakStrategyxImikfE tolayoutbreakstrategyximikfe = (toLayoutBreakStrategyxImikfE) obj;
        if (this.hostNativeDuration == tolayoutbreakstrategyximikfe.hostNativeDuration) {
            if (this.hostExternalRequestDuration != tolayoutbreakstrategyximikfe.hostExternalRequestDuration || this.bridgeHandshakeDuration != tolayoutbreakstrategyximikfe.bridgeHandshakeDuration) {
                return false;
            }
            if (this.webViewLoadDuration == tolayoutbreakstrategyximikfe.webViewLoadDuration) {
                return true;
            }
            int i7 = i4 + 117;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i4 + 117;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
