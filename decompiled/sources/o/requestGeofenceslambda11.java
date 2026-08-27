package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.twofa.data.model.TriggerRequestData$Companion;
import kotlinx.serialization.Serializable;
import o.requestGeofenceslambda10;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class requestGeofenceslambda11 {
    public static final TriggerRequestData$Companion Companion = new Object() { // from class: com.roadrunner.twofa.data.model.TriggerRequestData$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 49;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            requestGeofenceslambda10 requestgeofenceslambda10 = requestGeofenceslambda10.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 17;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return requestgeofenceslambda10;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String phase;
    public final String phone;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.twofa.data.model.TriggerRequestData$Companion] */
    static {
        int i = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ requestGeofenceslambda11(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.phone = str;
            this.phase = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, requestGeofenceslambda10.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = write + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TriggerRequestData(phone=", this.phone, ", phase=", this.phase, ")");
            int i3 = 32 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TriggerRequestData(phone=", this.phone, ", phase=", this.phase, ")");
        }
        int i4 = read + 79;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.phase.hashCode() + (this.phone.hashCode() * 31);
        int i4 = write + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public requestGeofenceslambda11(String str) {
        str.getClass();
        this.phone = str;
        this.phase = "trigger";
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof requestGeofenceslambda11)) {
                return false;
            }
            requestGeofenceslambda11 requestgeofenceslambda11 = (requestGeofenceslambda11) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phone, requestgeofenceslambda11.phone}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phase, requestgeofenceslambda11.phase}, getCieXyz.write())).booleanValue();
            }
            int i2 = read + 37;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = write + 61;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 79;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
