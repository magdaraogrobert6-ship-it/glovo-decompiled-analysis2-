package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$OrderItems$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidDialog_androidKtDialog11invokeinlinedonDispose1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "order_items")
public final class AndroidDialog_androidKtDialogdialog111 extends accessgetCurrentlyFocusedRect {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final List components;
    public final String title;
    public static final StateV3$AcceptData$OrderItems$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$OrderItems$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 125;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                AndroidDialog_androidKtDialog11invokeinlinedonDispose1 androidDialog_androidKtDialog11invokeinlinedonDispose1 = AndroidDialog_androidKtDialog11invokeinlinedonDispose1.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidDialog_androidKtDialog11invokeinlinedonDispose1 androidDialog_androidKtDialog11invokeinlinedonDispose2 = AndroidDialog_androidKtDialog11invokeinlinedonDispose1.serializer;
            int i3 = read + 5;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 16 / 0;
            }
            return androidDialog_androidKtDialog11invokeinlinedonDispose2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(17))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$OrderItems$Companion] */
    static {
        Object obj = null;
        int i = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 31;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List list = this.components;
        int i4 = i2 + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public /* synthetic */ AndroidDialog_androidKtDialogdialog111(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.title = str;
            this.components = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidDialog_androidKtDialog11invokeinlinedonDispose1.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("OrderItems(title=", this.title, ", components=", this.components, ")");
        int i4 = read + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.components.hashCode() + (this.title.hashCode() * 31);
        int i4 = serializer + 93;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidDialog_androidKtDialogdialog111) {
            AndroidDialog_androidKtDialogdialog111 androidDialog_androidKtDialogdialog111 = (AndroidDialog_androidKtDialogdialog111) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidDialog_androidKtDialogdialog111.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidDialog_androidKtDialogdialog111.components}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = serializer + 99;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 15 / 0;
            }
            return false;
        }
        int i4 = serializer + 93;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
