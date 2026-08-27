package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.PinAttempts$Companion;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontRetOiIgdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontYpTlLL0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final preloadlambda1 errorMessage;
    public final int maxAttempts;
    public final List trackingEvents;
    public static final PinAttempts$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.PinAttempts$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 93;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontRetOiIgdefault fontRetOiIgdefault = FontRetOiIgdefault.write;
            int i4 = write + 95;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fontRetOiIgdefault;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(1))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.PinAttempts$Companion] */
    static {
        int i = IconCompatParcelizer + 31;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final preloadlambda1 read() {
        preloadlambda1 preloadlambda1Var;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            preloadlambda1Var = this.errorMessage;
            int i4 = 51 / 0;
        } else {
            preloadlambda1Var = this.errorMessage;
        }
        int i5 = i2 + 113;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return preloadlambda1Var;
        }
        throw null;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = this.maxAttempts;
        int i6 = i3 + 89;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 77;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.trackingEvents;
        int i5 = i2 + 109;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public /* synthetic */ FontYpTlLL0(int i, int i2, preloadlambda1 preloadlambda1Var, List list) {
        if (3 == (i & 3)) {
            this.maxAttempts = i2;
            this.errorMessage = preloadlambda1Var;
            if ((i & 4) == 0) {
                this.trackingEvents = instance_delegatelambda0.write;
                int i3 = read + 25;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 90 / 0;
                    return;
                }
                return;
            }
            this.trackingEvents = list;
            int i5 = RemoteActionCompatParcelizer + 93;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FontRetOiIgdefault.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode2 = Integer.hashCode(this.maxAttempts);
            iHashCode = this.trackingEvents.hashCode() >>> ((this.errorMessage.hashCode() / (iHashCode2 >>> 98)) % 41);
        } else {
            int iHashCode3 = Integer.hashCode(this.maxAttempts);
            iHashCode = this.trackingEvents.hashCode() + ((this.errorMessage.hashCode() + (iHashCode3 * 31)) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 41;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PinAttempts(maxAttempts=");
        sb.append(this.maxAttempts);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sb, this.trackingEvents, ")");
        int i2 = RemoteActionCompatParcelizer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof FontYpTlLL0) {
                FontYpTlLL0 fontYpTlLL0 = (FontYpTlLL0) obj;
                if (this.maxAttempts != fontYpTlLL0.maxAttempts) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, fontYpTlLL0.errorMessage}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, fontYpTlLL0.trackingEvents}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer + 15;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
