package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.twofa.data.model.TwoFaTriggerRequest$Companion;
import kotlinx.serialization.Serializable;
import o.requestGeofenceslambda1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class requestGeofenceslambda0 {
    public static final TwoFaTriggerRequest$Companion Companion = new Object() { // from class: com.roadrunner.twofa.data.model.TwoFaTriggerRequest$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 125;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return requestGeofenceslambda1.serializer;
            }
            int i3 = 57 / 0;
            return requestGeofenceslambda1.serializer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final requestGeofenceslambda11 data;
    public final String flowId;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.twofa.data.model.TwoFaTriggerRequest$Companion] */
    static {
        int i = IconCompatParcelizer + 111;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ requestGeofenceslambda0(int i, requestGeofenceslambda11 requestgeofenceslambda11, String str, String str2) {
        if (7 == (i & 7)) {
            this.data = requestgeofenceslambda11;
            this.flowId = str;
            this.type = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, requestGeofenceslambda1.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return af$$ExternalSyntheticOutline0.m(this.data.hashCode() * 31, 31, this.flowId) + this.type.hashCode();
        }
        return this.type.hashCode() << af$$ExternalSyntheticOutline0.m(this.data.hashCode() % 122, 22, this.flowId);
    }

    public requestGeofenceslambda0(requestGeofenceslambda11 requestgeofenceslambda11, String str) {
        str.getClass();
        this.data = requestgeofenceslambda11;
        this.flowId = str;
        this.type = "otp";
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("TwoFaTriggerRequest(data=");
        sb.append(this.data);
        sb.append(", flowId=");
        sb.append(this.flowId);
        sb.append(", type=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.type, ")");
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof requestGeofenceslambda0) {
            requestGeofenceslambda0 requestgeofenceslambda0 = (requestGeofenceslambda0) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, requestgeofenceslambda0.data}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.flowId, requestgeofenceslambda0.flowId}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, requestgeofenceslambda0.type}, getCieXyz.write())).booleanValue();
                }
                int i2 = serializer + 101;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = serializer;
            int i4 = i3 + 97;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 41;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 11 / 0;
            }
            return false;
        }
        int i8 = serializer + 59;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 != 0;
    }
}
