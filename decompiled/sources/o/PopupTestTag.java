package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$PromoBonus$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Popup;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PopupTestTag {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final List icons;
    public final String text;
    public static final StateV3$AcceptData$PromoBonus$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$PromoBonus$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 103;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Popup popup = Popup.read;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Popup popup2 = Popup.read;
            int i3 = read + 19;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return popup2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(19))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$PromoBonus$Companion] */
    static {
        int i = IconCompatParcelizer + 3;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ PopupTestTag(List list, int i, String str) {
        Object obj = null;
        this.text = (i & 1) == 0 ? null : str;
        if ((i & 2) != 0) {
            this.icons = list;
            int i2 = RemoteActionCompatParcelizer + 61;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 84 / 0;
                return;
            }
            return;
        }
        int i4 = RemoteActionCompatParcelizer + 25;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            this.icons = instance_delegatelambda0.write;
        } else {
            this.icons = instance_delegatelambda0.write;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("PromoBonus(text=", this.text, ", icons=", this.icons, ")");
        int i4 = write + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = write;
        int i4 = i3 + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String str = this.text;
        if (str == null) {
            int i6 = i3 + 115;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i8 = RemoteActionCompatParcelizer + 45;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = iHashCode;
        }
        return this.icons.hashCode() + (i * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PopupTestTag) {
            PopupTestTag popupTestTag = (PopupTestTag) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, popupTestTag.text}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icons, popupTestTag.icons}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer + 7;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
