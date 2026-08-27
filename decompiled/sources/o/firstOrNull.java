package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.api.model.TransferChangeRequestBody$Companion;
import kotlinx.serialization.Serializable;
import o.instantiatePreviewWrapperProvider;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class firstOrNull {
    public static final TransferChangeRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.api.model.TransferChangeRequestBody$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 3;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            instantiatePreviewWrapperProvider instantiatepreviewwrapperprovider = instantiatePreviewWrapperProvider.write;
            int i4 = write + 23;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return instantiatepreviewwrapperprovider;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final long collectedAmount;
    public final long paymentAmount;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.api.model.TransferChangeRequestBody$Companion] */
    static {
        int i = serializer + 73;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ firstOrNull(long j, long j2, int i) {
        if (3 == (i & 3)) {
            this.paymentAmount = j;
            this.collectedAmount = j2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, instantiatePreviewWrapperProvider.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Long.hashCode(this.collectedAmount) % (Long.hashCode(this.paymentAmount) - 81);
        }
        return Long.hashCode(this.collectedAmount) + (Long.hashCode(this.paymentAmount) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return c8$$ExternalSyntheticOutline0.m(this.collectedAmount, ")", c8$$ExternalSyntheticOutline0.m(this.paymentAmount, "TransferChangeRequestBody(paymentAmount=", ", collectedAmount="));
        }
        c8$$ExternalSyntheticOutline0.m(this.collectedAmount, ")", c8$$ExternalSyntheticOutline0.m(this.paymentAmount, "TransferChangeRequestBody(paymentAmount=", ", collectedAmount="));
        throw null;
    }

    public firstOrNull(long j, long j2) {
        this.paymentAmount = j;
        this.collectedAmount = j2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 15;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof firstOrNull) {
            firstOrNull firstornull = (firstOrNull) obj;
            if (this.paymentAmount != firstornull.paymentAmount) {
                return false;
            }
            if (this.collectedAmount == firstornull.collectedAmount) {
                return true;
            }
            int i4 = IconCompatParcelizer + 103;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 19;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
