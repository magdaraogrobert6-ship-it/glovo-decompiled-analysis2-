package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.bridge.ErrorPayload$Companion;
import kotlinx.serialization.Serializable;
import o.isPrimitiveScalar;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isScalar {
    public static final ErrorPayload$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.ErrorPayload$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 85;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            isPrimitiveScalar isprimitivescalar = isPrimitiveScalar.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 99;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return isprimitivescalar;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String duringMessageType;
    public final UninitializedMessageException error;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.ErrorPayload$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 7;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    public /* synthetic */ isScalar(int i, String str, UninitializedMessageException uninitializedMessageException) {
        if (3 == (i & 3)) {
            this.duringMessageType = str;
            this.error = uninitializedMessageException;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, isPrimitiveScalar.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.error.hashCode() * (this.duringMessageType.hashCode() / 17);
        }
        return this.error.hashCode() + (this.duringMessageType.hashCode() * 31);
    }

    public isScalar(UninitializedMessageException uninitializedMessageException) {
        this.duringMessageType = "HOST_ENCOUNTERED_ERROR";
        this.error = uninitializedMessageException;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ErrorPayload(duringMessageType=" + this.duringMessageType + ", error=" + this.error + ")";
        int i2 = IconCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 73;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof isScalar)) {
            return false;
        }
        isScalar isscalar = (isScalar) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duringMessageType, isscalar.duringMessageType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, isscalar.error}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 11;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = serializer + 63;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
