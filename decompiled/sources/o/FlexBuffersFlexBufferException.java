package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.bridge.SupportedPayload$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Utf8SafeUnpairedSurrogateException;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FlexBuffersFlexBufferException {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final boolean isHelpCenterFullScreen;
    public final List supportedMessageTypes;
    public static final SupportedPayload$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.SupportedPayload$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 27;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                Utf8SafeUnpairedSurrogateException utf8SafeUnpairedSurrogateException = Utf8SafeUnpairedSurrogateException.IconCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            Utf8SafeUnpairedSurrogateException utf8SafeUnpairedSurrogateException2 = Utf8SafeUnpairedSurrogateException.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 35;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return utf8SafeUnpairedSurrogateException2;
            }
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(28)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.SupportedPayload$Companion] */
    static {
        int i = write + 45;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }

    public /* synthetic */ FlexBuffersFlexBufferException(List list, boolean z, int i) {
        if (1 == (i & 1)) {
            this.supportedMessageTypes = list;
            if ((i & 2) == 0) {
                this.isHelpCenterFullScreen = true;
                int i2 = serializer + 99;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.isHelpCenterFullScreen = z;
            int i4 = IconCompatParcelizer + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, Utf8SafeUnpairedSurrogateException.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isHelpCenterFullScreen) + (this.supportedMessageTypes.hashCode() * 31);
        int i4 = IconCompatParcelizer + 77;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexBuffersFlexBufferException)) {
            return false;
        }
        FlexBuffersFlexBufferException flexBuffersFlexBufferException = (FlexBuffersFlexBufferException) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.supportedMessageTypes, flexBuffersFlexBufferException.supportedMessageTypes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isHelpCenterFullScreen == flexBuffersFlexBufferException.isHelpCenterFullScreen) {
            return true;
        }
        int i4 = IconCompatParcelizer;
        int i5 = i4 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 89;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 30 / 0;
        }
        return false;
    }

    public FlexBuffersFlexBufferException(List list) {
        list.getClass();
        this.supportedMessageTypes = list;
        this.isHelpCenterFullScreen = true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SupportedPayload(supportedMessageTypes=" + this.supportedMessageTypes + ", isHelpCenterFullScreen=" + this.isHelpCenterFullScreen + ")";
        int i2 = IconCompatParcelizer + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return str;
    }
}
