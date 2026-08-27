package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$CountDown$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getAttachedViewTreeObserver;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "countdown")
public final class accessgetEmbeddedView extends accessgetCurrentlyFocusedRect {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final List deliveryIds;
    public final Long expirationTimestamp;
    public final Integer secondsToExpiry;
    public final boolean showTimer;
    public static final StateV3$AcceptData$CountDown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$CountDown$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getAttachedViewTreeObserver getattachedviewtreeobserver = getAttachedViewTreeObserver.serializer;
            int i4 = RemoteActionCompatParcelizer + 9;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getattachedviewtreeobserver;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(29))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$CountDown$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accessgetEmbeddedView(int i, Long l, Integer num, boolean z, List list) {
        if (12 != (i & 12)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 12, getAttachedViewTreeObserver.serializer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.expirationTimestamp = null;
            int i2 = IconCompatParcelizer + 119;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.expirationTimestamp = l;
        }
        if ((i & 2) == 0) {
            this.secondsToExpiry = null;
        } else {
            this.secondsToExpiry = num;
            int i4 = serializer + 35;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = 2 % 2;
        this.showTimer = z;
        this.deliveryIds = list;
        int i7 = serializer + 23;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 79 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Long l = this.expirationTimestamp;
        if (l == null) {
            int i2 = IconCompatParcelizer + 119;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i4 = IconCompatParcelizer + 9;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        Integer num = this.secondsToExpiry;
        return this.deliveryIds.hashCode() + d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (num != null ? num.hashCode() : 0)) * 31, 31, this.showTimer);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CountDown(expirationTimestamp=" + this.expirationTimestamp + ", secondsToExpiry=" + this.secondsToExpiry + ", showTimer=" + this.showTimer + ", deliveryIds=" + this.deliveryIds + ")";
        int i2 = serializer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof accessgetEmbeddedView)) {
                return false;
            }
            accessgetEmbeddedView accessgetembeddedview = (accessgetEmbeddedView) obj;
            Object[] objArr = {this.expirationTimestamp, accessgetembeddedview.expirationTimestamp};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.secondsToExpiry, accessgetembeddedview.secondsToExpiry};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    int i2 = IconCompatParcelizer + 111;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (this.showTimer != accessgetembeddedview.showTimer) {
                    return false;
                }
                Object[] objArr3 = {this.deliveryIds, accessgetembeddedview.deliveryIds};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i4 = serializer + 125;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 65 / 0;
                }
                return true;
            }
            int i6 = serializer + 33;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = serializer + 35;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
