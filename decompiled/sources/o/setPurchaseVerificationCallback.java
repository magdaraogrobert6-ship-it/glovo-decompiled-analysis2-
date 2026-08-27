package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.safety.log.data.entity.SafetyLogEventRequest$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setInstallVersion;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setPurchaseVerificationCallback {
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String eventName;
    public final List eventParams;
    public static final SafetyLogEventRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.log.data.entity.SafetyLogEventRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 55;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setInstallVersion setinstallversion = setInstallVersion.RemoteActionCompatParcelizer;
            int i4 = read + 71;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return setinstallversion;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(6))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.log.data.entity.SafetyLogEventRequest$Companion] */
    static {
        int i = IconCompatParcelizer + 33;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setPurchaseVerificationCallback(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.eventName = str;
            this.eventParams = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setInstallVersion.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return IconCompatParcelizer.read("SafetyLogEventRequest(eventName=", this.eventName, ", eventParams=", this.eventParams, ")");
        }
        IconCompatParcelizer.read("SafetyLogEventRequest(eventName=", this.eventName, ", eventParams=", this.eventParams, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.eventParams.hashCode() + (this.eventName.hashCode() * 31);
        int i4 = read + 31;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public setPurchaseVerificationCallback(String str, ArrayList arrayList) {
        str.getClass();
        this.eventName = str;
        this.eventParams = arrayList;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPurchaseVerificationCallback)) {
            return false;
        }
        setPurchaseVerificationCallback setpurchaseverificationcallback = (setPurchaseVerificationCallback) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.eventName, setpurchaseverificationcallback.eventName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.eventParams, setpurchaseverificationcallback.eventParams}, getCieXyz.write())).booleanValue()) {
            int i2 = read + 83;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return true;
    }
}
