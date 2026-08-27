package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Details$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtSimpleStack113;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidPopup_androidKtSimpleStack111 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final List components;
    public final String title;
    public static final StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Details$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Details$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 19;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidPopup_androidKtSimpleStack113 androidPopup_androidKtSimpleStack113 = AndroidPopup_androidKtSimpleStack113.serializer;
            int i4 = read + 13;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidPopup_androidKtSimpleStack113;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(29))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Details$Companion] */
    static {
        int i = IconCompatParcelizer + 43;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("Details(title=", this.title, ", components=", this.components, ")");
        int i4 = write + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        if (str == null) {
            int i5 = i3 + 109;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i7 = write + 37;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 3 / 2;
            }
            i = iHashCode;
        }
        return this.components.hashCode() + (i * 31);
    }

    public /* synthetic */ AndroidPopup_androidKtSimpleStack111(List list, int i, String str) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = null;
        }
        this.title = str;
        if ((i & 2) != 0) {
            this.components = list;
            int i3 = write + 47;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        int i5 = write + 109;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            this.components = instance_delegatelambda0.write;
        } else {
            this.components = instance_delegatelambda0.write;
            int i6 = 95 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidPopup_androidKtSimpleStack111)) {
            return false;
        }
        AndroidPopup_androidKtSimpleStack111 androidPopup_androidKtSimpleStack111 = (AndroidPopup_androidKtSimpleStack111) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidPopup_androidKtSimpleStack111.title}, getCieXyz.write())).booleanValue()) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidPopup_androidKtSimpleStack111.components}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = read + 111;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
