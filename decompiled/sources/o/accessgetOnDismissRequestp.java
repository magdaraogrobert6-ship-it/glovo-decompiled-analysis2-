package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.applyWindowTypeAndToken;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "delivery_notes")
public final class accessgetOnDismissRequestp extends accessgetPropertiesp {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final List components;
    public final String text;
    public static final Instruction$DeliveryNotes$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 109;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            applyWindowTypeAndToken applywindowtypeandtoken = applyWindowTypeAndToken.write;
            int i4 = RemoteActionCompatParcelizer + 63;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return applywindowtypeandtoken;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(10))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$Companion] */
    static {
        int i = IconCompatParcelizer + 113;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    public /* synthetic */ accessgetOnDismissRequestp(List list, int i, String str) {
        Object obj = null;
        if (2 == (i & 2)) {
            if ((i & 1) == 0) {
                this.text = null;
                int i2 = RemoteActionCompatParcelizer + 125;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.text = str;
            }
            this.components = list;
            int i5 = RemoteActionCompatParcelizer + 85;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, applyWindowTypeAndToken.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return IconCompatParcelizer.read("DeliveryNotes(text=", this.text, ", components=", this.components, ")");
        }
        IconCompatParcelizer.read("DeliveryNotes(text=", this.text, ", components=", this.components, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.text;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i4 = RemoteActionCompatParcelizer + 95;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode;
        }
        return this.components.hashCode() + (i * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof accessgetOnDismissRequestp))) {
            accessgetOnDismissRequestp accessgetondismissrequestp = (accessgetOnDismissRequestp) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, accessgetondismissrequestp.text}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, accessgetondismissrequestp.components}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = read + 53;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = i3 + 63;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
