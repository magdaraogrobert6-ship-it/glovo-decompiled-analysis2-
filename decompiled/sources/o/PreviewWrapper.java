package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentScreen$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Wrap;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PreviewWrapper {
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final Integer brandIcon;
    public final ComposeAnimationState closeButton;
    public final String successMessage;
    public final String title;
    public final List trackingEvents;
    public static final QrPaymentTaskUiItem$QrPaymentScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentScreen$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 119;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Wrap wrap = Wrap.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Wrap wrap2 = Wrap.serializer;
            int i3 = write + 73;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return wrap2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(14)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentScreen$Companion] */
    static {
        int i = serializer + 91;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ PreviewWrapper(int i, String str, Integer num, ComposeAnimationState composeAnimationState, List list, String str2) {
        if (31 == (i & 31)) {
            this.title = str;
            this.brandIcon = num;
            this.closeButton = composeAnimationState;
            this.trackingEvents = list;
            this.successMessage = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, Wrap.serializer.getDescriptor());
        throw null;
    }

    public PreviewWrapper(String str, Integer num, ComposeAnimationState composeAnimationState, List list, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.title = str;
        this.brandIcon = num;
        this.closeButton = composeAnimationState;
        this.trackingEvents = list;
        this.successMessage = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        Integer num = this.brandIcon;
        int iHashCode3 = 0;
        if (num == null) {
            int i2 = write + 107;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        ComposeAnimationState composeAnimationState = this.closeButton;
        if (composeAnimationState != null) {
            iHashCode3 = composeAnimationState.hashCode();
            int i4 = write + 7;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return this.successMessage.hashCode() + c8$$ExternalSyntheticOutline0.m(this.trackingEvents, ((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31, 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("QrPaymentScreen(title=");
        sb.append(this.title);
        sb.append(", brandIcon=");
        sb.append(this.brandIcon);
        sb.append(", closeButton=");
        sb.append(this.closeButton);
        sb.append(", trackingEvents=");
        sb.append(this.trackingEvents);
        sb.append(", successMessage=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.successMessage, ")");
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewWrapper)) {
            return false;
        }
        PreviewWrapper previewWrapper = (PreviewWrapper) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, previewWrapper.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brandIcon, previewWrapper.brandIcon}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.closeButton, previewWrapper.closeButton}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, previewWrapper.trackingEvents}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, previewWrapper.successMessage}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = IconCompatParcelizer + 59;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = write + 57;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
