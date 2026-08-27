package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$DeliveryNotes$Companion;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getExtraBold;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "delivery_notes")
public final class getExtraLight extends getBold {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final List components;
    public final String text;
    public static final ScrollableComponent$Instructions$Item$DeliveryNotes$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$DeliveryNotes$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 75;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getExtraBold getextrabold = getExtraBold.serializer;
            int i4 = IconCompatParcelizer + 95;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
            return getextrabold;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$DeliveryNotes$Companion] */
    static {
        int i = write + 107;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getExtraLight(List list, int i, String str) {
        if (2 == (i & 2)) {
            if ((i & 1) == 0) {
                this.text = null;
                int i2 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                }
                this.components = list;
                return;
            }
            this.text = str;
            int i3 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            this.components = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, getExtraBold.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return IconCompatParcelizer.read("DeliveryNotes(text=", this.text, ", components=", this.components, ")");
        }
        int i3 = 25 / 0;
        return IconCompatParcelizer.read("DeliveryNotes(text=", this.text, ", components=", this.components, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.text;
        if (str == null) {
            int i5 = i3 + 81;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.components.hashCode() + (iHashCode * 31);
        int i7 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getExtraLight) {
                getExtraLight getextralight = (getExtraLight) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, getextralight.text}, getCieXyz.write())).booleanValue()) {
                    int i2 = RemoteActionCompatParcelizer + 33;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, getextralight.components}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = IconCompatParcelizer + 13;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i5 = IconCompatParcelizer + 93;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
