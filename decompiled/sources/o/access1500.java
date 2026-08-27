package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.push.core.data.model.RegisterPushRequest$Companion;
import kotlinx.serialization.Serializable;
import o.access1300;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class access1500 {
    public static final RegisterPushRequest$Companion Companion = new Object() { // from class: com.roadrunner.push.core.data.model.RegisterPushRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                access1300 access1300Var = access1300.write;
                throw null;
            }
            access1300 access1300Var2 = access1300.write;
            int i3 = IconCompatParcelizer + 109;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return access1300Var2;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String context;
    public final String deviceToken;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.push.core.data.model.RegisterPushRequest$Companion] */
    static {
        int i = read + 87;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ access1500(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.deviceToken = str;
            if ((i & 2) == 0) {
                this.context = "ROADRUNNER";
                int i2 = serializer + 57;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.context = str2;
            int i4 = RemoteActionCompatParcelizer + 91;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, access1300.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("RegisterPushRequest(deviceToken=", this.deviceToken, ", context=", this.context, ")");
            int i3 = 52 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("RegisterPushRequest(deviceToken=", this.deviceToken, ", context=", this.context, ")");
        }
        int i4 = RemoteActionCompatParcelizer + 13;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.context.hashCode() >> (this.deviceToken.hashCode() << 26);
        } else {
            iHashCode = (this.deviceToken.hashCode() * 31) + this.context.hashCode();
        }
        int i3 = serializer + 29;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return iHashCode;
    }

    public access1500(String str) {
        str.getClass();
        this.deviceToken = str;
        this.context = "ROADRUNNER";
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access1500)) {
            int i5 = i2 + 47;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        access1500 access1500Var = (access1500) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, access1500Var.deviceToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.context, access1500Var.context}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = serializer + 73;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
