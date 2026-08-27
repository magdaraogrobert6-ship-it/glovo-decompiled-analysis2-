package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$AcceptWithCountdownButton$CountDownDetails$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.BringIntoViewNode;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "countdown_details")
public final class getOnRequesterReady {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List deliveryIds;
    public final long secondsToExpiry;
    public static final StateV3$AcceptData$AcceptWithCountdownButton$CountDownDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$AcceptWithCountdownButton$CountDownDetails$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            BringIntoViewNode bringIntoViewNode;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 19;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                bringIntoViewNode = BringIntoViewNode.IconCompatParcelizer;
                int i3 = 34 / 0;
            } else {
                bringIntoViewNode = BringIntoViewNode.IconCompatParcelizer;
            }
            int i4 = read + 27;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return bringIntoViewNode;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(24))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$AcceptWithCountdownButton$CountDownDetails$Companion] */
    static {
        int i = IconCompatParcelizer + 11;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = write + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.deliveryIds;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long write() {
        int i = 2 % 2;
        int i2 = write + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        long j = this.secondsToExpiry;
        int i5 = i3 + 13;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j;
    }

    public /* synthetic */ getOnRequesterReady(int i, long j, List list) {
        if (3 == (i & 3)) {
            this.secondsToExpiry = j;
            this.deliveryIds = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, BringIntoViewNode.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.deliveryIds.hashCode() << (Long.hashCode(this.secondsToExpiry) / 103);
        }
        return (Long.hashCode(this.secondsToExpiry) * 31) + this.deliveryIds.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CountDownDetails(secondsToExpiry=" + this.secondsToExpiry + ", deliveryIds=" + this.deliveryIds + ")";
        int i2 = read + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getOnRequesterReady) {
            getOnRequesterReady getonrequesterready = (getOnRequesterReady) obj;
            if (this.secondsToExpiry == getonrequesterready.secondsToExpiry) {
                Object[] objArr = {this.deliveryIds, getonrequesterready.deliveryIds};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = write + 19;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = read + 105;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 11;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
