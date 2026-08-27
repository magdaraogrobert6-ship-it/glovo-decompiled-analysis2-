package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.DeliveryRequestBody$CashCollection$Companion;
import kotlinx.serialization.Serializable;
import o.runCachedBlocking;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AsyncTypefaceCacheAsyncTypefaceResult {
    public static final DeliveryRequestBody$CashCollection$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.DeliveryRequestBody$CashCollection$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            runCachedBlocking runcachedblocking;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                runcachedblocking = runCachedBlocking.RemoteActionCompatParcelizer;
                int i3 = 3 / 0;
            } else {
                runcachedblocking = runCachedBlocking.RemoteActionCompatParcelizer;
            }
            int i4 = RemoteActionCompatParcelizer + 9;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return runcachedblocking;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final int amount;
    public final String reason;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.DeliveryRequestBody$CashCollection$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AsyncTypefaceCacheAsyncTypefaceResult(int i, int i2, String str) {
        if (1 == (i & 1)) {
            this.amount = i2;
            if ((i & 2) == 0) {
                this.reason = null;
                int i3 = read + 73;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 70 / 0;
                    return;
                }
                return;
            }
            this.reason = str;
            int i5 = read + 9;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, runCachedBlocking.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.amount);
        String str = this.reason;
        if (str == null) {
            int i4 = read + 93;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 103;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AsyncTypefaceCacheAsyncTypefaceResult)) {
            return false;
        }
        AsyncTypefaceCacheAsyncTypefaceResult asyncTypefaceCacheAsyncTypefaceResult = (AsyncTypefaceCacheAsyncTypefaceResult) obj;
        if (this.amount == asyncTypefaceCacheAsyncTypefaceResult.amount) {
            Object[] objArr = {this.reason, asyncTypefaceCacheAsyncTypefaceResult.reason};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = read + 69;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 39;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public AsyncTypefaceCacheAsyncTypefaceResult(int i, String str) {
        this.amount = i;
        this.reason = str;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CashCollection(amount=" + this.amount + ", reason=" + this.reason + ")";
        int i2 = read + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
