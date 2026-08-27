package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AutoAcceptData$AutoAccept$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.toIntBounds;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept")
public final class isPopupLayout extends AndroidPopup_androidKtLocalPopupTestTag1 {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List acceptDetails;
    public final String title;
    public static final StateV3$AutoAcceptData$AutoAccept$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AutoAcceptData$AutoAccept$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 65;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            toIntBounds tointbounds = toIntBounds.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 69;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return tointbounds;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(25))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AutoAcceptData$AutoAccept$Companion] */
    static {
        int i = serializer + 33;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 105;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        List list = this.acceptDetails;
        int i4 = i2 + 79;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public /* synthetic */ isPopupLayout(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.title = str;
            this.acceptDetails = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, toIntBounds.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String str = IconCompatParcelizer.read("AutoAccept(title=", this.title, ", acceptDetails=", this.acceptDetails, ")");
            int i3 = read + 113;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return str;
        }
        IconCompatParcelizer.read("AutoAccept(title=", this.title, ", acceptDetails=", this.acceptDetails, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.acceptDetails.hashCode() + (this.title.hashCode() * 31);
        int i4 = read + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 121;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        Object obj2 = null;
        if (obj instanceof isPopupLayout) {
            isPopupLayout ispopuplayout = (isPopupLayout) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, ispopuplayout.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.acceptDetails, ispopuplayout.acceptDetails}, getCieXyz.write())).booleanValue()) {
                int i4 = write + 21;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = read + 77;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i7 = write + 39;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
