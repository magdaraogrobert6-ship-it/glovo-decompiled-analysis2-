package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.OrderStatusCountdownData$Companion;
import kotlinx.serialization.Serializable;
import o.PopupLayoutcanCalculatePosition2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PopupLayoutupdatePosition1 {
    public static final OrderStatusCountdownData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.OrderStatusCountdownData$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 117;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return PopupLayoutcanCalculatePosition2.write;
            }
            PopupLayoutcanCalculatePosition2 popupLayoutcanCalculatePosition2 = PopupLayoutcanCalculatePosition2.write;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final PopupLayoutCompaniononCommitAffectingPopupPosition1 condition;
    public final PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.OrderStatusCountdownData$Companion] */
    static {
        int i = serializer + 79;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 61;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 = this.value;
        int i5 = i2 + 69;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0;
    }

    public final PopupLayoutCompaniononCommitAffectingPopupPosition1 serializer() {
        int i = 2 % 2;
        int i2 = read + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        PopupLayoutCompaniononCommitAffectingPopupPosition1 popupLayoutCompaniononCommitAffectingPopupPosition1 = this.condition;
        int i5 = i3 + 7;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return popupLayoutCompaniononCommitAffectingPopupPosition1;
    }

    public /* synthetic */ PopupLayoutupdatePosition1(int i, PopupLayoutCompaniononCommitAffectingPopupPosition1 popupLayoutCompaniononCommitAffectingPopupPosition1, PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0) {
        if (3 == (i & 3)) {
            this.condition = popupLayoutCompaniononCommitAffectingPopupPosition1;
            this.value = popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PopupLayoutcanCalculatePosition2.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.value.hashCode() + (this.condition.hashCode() * 31);
        int i4 = read + 59;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderStatusCountdownData(condition=" + this.condition + ", value=" + this.value + ")";
        int i2 = RemoteActionCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupLayoutupdatePosition1)) {
            return false;
        }
        PopupLayoutupdatePosition1 popupLayoutupdatePosition1 = (PopupLayoutupdatePosition1) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.condition, popupLayoutupdatePosition1.condition}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, popupLayoutupdatePosition1.value}, getCieXyz.write())).booleanValue();
        }
        int i4 = read + 85;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }
}
