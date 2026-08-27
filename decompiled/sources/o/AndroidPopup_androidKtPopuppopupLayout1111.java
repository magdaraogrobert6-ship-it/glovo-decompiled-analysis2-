package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtPopuppopupId11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept")
public final class AndroidPopup_androidKtPopuppopupLayout1111 implements AndroidPopup_androidKtPopup811 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final List components;
    public final String mode;
    public static final StateV3$HostComponent$AutoAcceptComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 17;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                AndroidPopup_androidKtPopuppopupId11 androidPopup_androidKtPopuppopupId11 = AndroidPopup_androidKtPopuppopupId11.serializer;
                throw null;
            }
            AndroidPopup_androidKtPopuppopupId11 androidPopup_androidKtPopuppopupId12 = AndroidPopup_androidKtPopuppopupId11.serializer;
            int i3 = write + 77;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return androidPopup_androidKtPopuppopupId12;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(27))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String str = IconCompatParcelizer.read("AutoAcceptComponent(mode=", this.mode, ", components=", this.components, ")");
            int i3 = IconCompatParcelizer + 121;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        IconCompatParcelizer.read("AutoAcceptComponent(mode=", this.mode, ", components=", this.components, ")");
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[PHI: r2
  0x0023: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 83;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode = 0;
        if (i3 % 2 == 0) {
            str = this.mode;
            int i4 = 22 / 0;
            if (str == null) {
                int i5 = i2 + 59;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            str = this.mode;
            if (str == null) {
                int i7 = i2 + 59;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                iHashCode = str.hashCode();
            }
        }
        return this.components.hashCode() + (iHashCode * 31);
    }

    public /* synthetic */ AndroidPopup_androidKtPopuppopupLayout1111(List list, int i, String str) {
        Object obj = null;
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = null;
        }
        this.mode = str;
        if ((i & 2) != 0) {
            this.components = list;
            int i3 = IconCompatParcelizer + 77;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = serializer + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            this.components = instance_delegatelambda0.write;
        } else {
            this.components = instance_delegatelambda0.write;
            obj.hashCode();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof AndroidPopup_androidKtPopuppopupLayout1111))) {
            AndroidPopup_androidKtPopuppopupLayout1111 androidPopup_androidKtPopuppopupLayout1111 = (AndroidPopup_androidKtPopuppopupLayout1111) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mode, androidPopup_androidKtPopuppopupLayout1111.mode}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidPopup_androidKtPopuppopupLayout1111.components}, getCieXyz.write())).booleanValue();
        }
        int i2 = serializer;
        int i3 = i2 + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
