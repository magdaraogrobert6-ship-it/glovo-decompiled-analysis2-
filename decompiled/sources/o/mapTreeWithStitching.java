package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MessageBoxUiItem$Companion;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.union;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class mapTreeWithStitching {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String body;
    public final ComposeAnimationState button;
    public final Integer icon;
    public final String title;
    public final MessageBoxTypeToken type;
    public static final MessageBoxUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.MessageBoxUiItem$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 117;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            union unionVar = union.RemoteActionCompatParcelizer;
            int i4 = serializer + 23;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return unionVar;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new sourceInformationContextOfdefault(0))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.MessageBoxUiItem$Companion] */
    static {
        int i = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ mapTreeWithStitching(int i, Integer num, String str, String str2, ComposeAnimationState composeAnimationState, MessageBoxTypeToken messageBoxTypeToken) {
        if (31 == (i & 31)) {
            this.icon = num;
            this.title = str;
            this.body = str2;
            this.button = composeAnimationState;
            this.type = messageBoxTypeToken;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, union.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public mapTreeWithStitching(Integer num, String str, String str2, ComposeAnimationState composeAnimationState, MessageBoxTypeToken messageBoxTypeToken) {
        messageBoxTypeToken.getClass();
        this.icon = num;
        this.title = str;
        this.body = str2;
        this.button = composeAnimationState;
        this.type = messageBoxTypeToken;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Integer num = this.icon;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.title;
        if (str == null) {
            int i2 = read + 23;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.body;
        if (str2 == null) {
            int i4 = serializer + 119;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        ComposeAnimationState composeAnimationState = this.button;
        return this.type.hashCode() + (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (composeAnimationState != null ? composeAnimationState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MessageBoxUiItem(icon=" + this.icon + ", title=" + this.title + ", body=" + this.body + ", button=" + this.button + ", type=" + this.type + ")";
        int i2 = serializer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof mapTreeWithStitching) {
            mapTreeWithStitching maptreewithstitching = (mapTreeWithStitching) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icon, maptreewithstitching.icon}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, maptreewithstitching.title}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.body, maptreewithstitching.body}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, maptreewithstitching.button}, getCieXyz.write())).booleanValue() ^ true) && this.type == maptreewithstitching.type;
            }
            int i2 = serializer + 123;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
