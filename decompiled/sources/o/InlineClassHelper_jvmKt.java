package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptSuccess$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.unpackFloat2;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept_result_success")
public final class InlineClassHelper_jvmKt extends fastRoundToInt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final List deliveryIds;
    public final String message;
    public final String title;
    public static final AutoAcceptV2Data$AutoAcceptSuccess$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptSuccess$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 15;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                unpackFloat2 unpackfloat2 = unpackFloat2.IconCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            unpackFloat2 unpackfloat3 = unpackFloat2.IconCompatParcelizer;
            int i3 = serializer + 17;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return unpackfloat3;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(9))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptSuccess$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 15;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.deliveryIds;
        }
        throw null;
    }

    public /* synthetic */ InlineClassHelper_jvmKt(int i, String str, String str2, List list) {
        if (7 == (i & 7)) {
            this.title = str;
            this.message = str2;
            this.deliveryIds = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, unpackFloat2.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.deliveryIds.hashCode() % af$$ExternalSyntheticOutline0.m(this.title.hashCode() - 53, 34, this.message);
        } else {
            iHashCode = this.deliveryIds.hashCode() + af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
        }
        int i3 = read + 45;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("AutoAcceptSuccess(title=", this.title, ", message=", this.message, ", deliveryIds="), this.deliveryIds, ")");
        }
        MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("AutoAcceptSuccess(title=", this.title, ", message=", this.message, ", deliveryIds="), this.deliveryIds, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineClassHelper_jvmKt)) {
            int i4 = i3 + 117;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        InlineClassHelper_jvmKt inlineClassHelper_jvmKt = (InlineClassHelper_jvmKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, inlineClassHelper_jvmKt.title}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 5;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, inlineClassHelper_jvmKt.message}, getCieXyz.write())).booleanValue())) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryIds, inlineClassHelper_jvmKt.deliveryIds}, getCieXyz.write())).booleanValue();
        }
        int i8 = IconCompatParcelizer + 115;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
