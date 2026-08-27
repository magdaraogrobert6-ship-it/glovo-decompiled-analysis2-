package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.push.messages.display.backgroud.data.api.PushReceiptRequestBody$Companion;
import kotlinx.serialization.Serializable;
import o.lambdaendFirstSessionDelay48;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class lambdagdprForgetMe34 {
    public static final PushReceiptRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.push.messages.display.backgroud.data.api.PushReceiptRequestBody$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 123;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            lambdaendFirstSessionDelay48 lambdaendfirstsessiondelay48 = lambdaendFirstSessionDelay48.RemoteActionCompatParcelizer;
            int i4 = write + 65;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return lambdaendfirstsessiondelay48;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String metadata;
    public final Long readOffset;
    public final Long receivedOffset;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.push.messages.display.backgroud.data.api.PushReceiptRequestBody$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 79;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }

    public /* synthetic */ lambdagdprForgetMe34(int i, Long l, Long l2, String str) {
        if ((i & 1) == 0) {
            this.receivedOffset = null;
            int i2 = 2 % 2;
        } else {
            this.receivedOffset = l;
        }
        if ((i & 2) == 0) {
            this.readOffset = null;
        } else {
            this.readOffset = l2;
        }
        if ((i & 4) != 0) {
            this.metadata = str;
            int i3 = IconCompatParcelizer + 99;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        int i5 = IconCompatParcelizer + 65;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            this.metadata = null;
        } else {
            this.metadata = null;
            throw null;
        }
    }

    public lambdagdprForgetMe34(Long l, Long l2, String str) {
        this.receivedOffset = l;
        this.readOffset = l2;
        this.metadata = str;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PushReceiptRequestBody(receivedOffset=");
        sb.append(this.receivedOffset);
        sb.append(", readOffset=");
        sb.append(this.readOffset);
        sb.append(", metadata=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.metadata, ")");
        int i2 = write + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Long l = this.receivedOffset;
        if (l == null) {
            int i2 = IconCompatParcelizer + 105;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = l.hashCode();
        }
        Long l2 = this.readOffset;
        if (l2 == null) {
            int i3 = IconCompatParcelizer + 51;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l2.hashCode();
        }
        String str = this.metadata;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdagdprForgetMe34)) {
            int i2 = write + 85;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        lambdagdprForgetMe34 lambdagdprforgetme34 = (lambdagdprForgetMe34) obj;
        Object[] objArr = {this.receivedOffset, lambdagdprforgetme34.receivedOffset};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = write;
            int i5 = i4 + 51;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 109;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 64 / 0;
            }
            return false;
        }
        Object[] objArr2 = {this.readOffset, lambdagdprforgetme34.readOffset};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i9 = write + 71;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        Object[] objArr3 = {this.metadata, lambdagdprforgetme34.metadata};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i11 = IconCompatParcelizer + 3;
        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
