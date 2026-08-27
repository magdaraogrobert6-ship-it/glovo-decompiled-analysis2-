package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.web.model.AqsScreenStopTraceMessage$Companion;
import kotlinx.serialization.Serializable;
import o.BrazeExternalSyntheticLambda148;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "webview_aqs_screen_stop_trace")
public final class BrazeExternalSyntheticLambda0 implements BrazeExternalSyntheticLambda17 {
    public static final AqsScreenStopTraceMessage$Companion Companion = new Object() { // from class: com.roadrunner.web.model.AqsScreenStopTraceMessage$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 27;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            BrazeExternalSyntheticLambda148 brazeExternalSyntheticLambda148 = BrazeExternalSyntheticLambda148.serializer;
            int i4 = read + 103;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return brazeExternalSyntheticLambda148;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final BrazeExternalSyntheticLambda149 payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.web.model.AqsScreenStopTraceMessage$Companion] */
    static {
        int i = IconCompatParcelizer + 89;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ BrazeExternalSyntheticLambda0(int i, BrazeExternalSyntheticLambda149 brazeExternalSyntheticLambda149) {
        if (1 == (i & 1)) {
            this.payload = brazeExternalSyntheticLambda149;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, BrazeExternalSyntheticLambda148.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.payload.screen.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.payload.screen.hashCode();
        int i3 = serializer + 97;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AqsScreenStopTraceMessage(payload=" + this.payload + ")";
        int i2 = serializer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 111;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof BrazeExternalSyntheticLambda0)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, ((BrazeExternalSyntheticLambda0) obj).payload}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = write + 55;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
