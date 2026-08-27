package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.data.startworking.oneclick.Option$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getBannerlambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class enableSdk {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final List bag;
    public final enableDelayedInitialization label;
    public final Boolean preferred;
    public final String value;
    public static final Option$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.Option$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 31;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                getBannerlambda0 getbannerlambda0 = getBannerlambda0.RemoteActionCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            getBannerlambda0 getbannerlambda1 = getBannerlambda0.RemoteActionCompatParcelizer;
            int i3 = serializer + 93;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return getbannerlambda1;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new subscribeToFeatureFlagsUpdateslambda1(4))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.Option$Companion] */
    static {
        int i = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final Boolean write() {
        int i = 2 % 2;
        int i2 = write + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        Boolean bool = this.preferred;
        int i5 = i3 + 85;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public /* synthetic */ enableSdk(int i, enableDelayedInitialization enabledelayedinitialization, String str, Boolean bool, List list) {
        if (3 == (i & 3)) {
            this.label = enabledelayedinitialization;
            this.value = str;
            if ((i & 4) == 0) {
                this.preferred = null;
            } else {
                this.preferred = bool;
                int i2 = serializer + 35;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 8) == 0) {
                int i4 = serializer + 83;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                this.bag = null;
                return;
            }
            this.bag = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getBannerlambda0.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public static enableSdk serializer(enableSdk enablesdk, Boolean bool) {
        int i = 2 % 2;
        enableDelayedInitialization enabledelayedinitialization = enablesdk.label;
        String str = enablesdk.value;
        List list = enablesdk.bag;
        enabledelayedinitialization.getClass();
        str.getClass();
        enableSdk enablesdk2 = new enableSdk(enabledelayedinitialization, str, bool, list);
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enablesdk2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.label.text.hashCode() * 31, 31, this.value);
        Boolean bool = this.preferred;
        if (bool == null) {
            int i2 = write + 39;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = bool.hashCode();
        }
        List list = this.bag;
        int iHashCode2 = ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
        int i3 = write + 31;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public enableSdk(enableDelayedInitialization enabledelayedinitialization, String str, Boolean bool, List list) {
        this.label = enabledelayedinitialization;
        this.value = str;
        this.preferred = bool;
        this.bag = list;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Option(label=" + this.label + ", value=" + this.value + ", preferred=" + this.preferred + ", bag=" + this.bag + ")";
        int i2 = write + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof enableSdk) {
            enableSdk enablesdk = (enableSdk) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, enablesdk.label}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, enablesdk.value}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.preferred, enablesdk.preferred}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bag, enablesdk.bag}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 29;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                int i3 = write + 45;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = write + 21;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = serializer + 97;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
