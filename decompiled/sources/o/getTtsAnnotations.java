package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostSendsNewAccessToken$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.getSpanStyles;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class getTtsAnnotations {
    public static final HostMessage$HostSendsNewAccessToken$Payload$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostSendsNewAccessToken$Payload$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 113;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getSpanStyles getspanstyles = getSpanStyles.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 63;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getspanstyles;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final String accessToken;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostSendsNewAccessToken$Payload$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 125;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getTtsAnnotations(int i, String str) {
        if (1 == (i & 1)) {
            this.accessToken = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getSpanStyles.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.accessToken.hashCode();
        int i4 = write + 23;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("Payload(accessToken=", this.accessToken, ")");
        int i4 = write + 57;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getTtsAnnotations(String str) {
        str.getClass();
        this.accessToken = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 73;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getTtsAnnotations) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, ((getTtsAnnotations) obj).accessToken}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i5 = IconCompatParcelizer + 7;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 121;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 3;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
