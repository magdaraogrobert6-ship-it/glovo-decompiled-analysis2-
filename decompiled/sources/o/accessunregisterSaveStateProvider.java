package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$EarningsDetails$Secondary$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.InteropView_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessunregisterSaveStateProvider {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final List icons;
    public final Boolean includesBoost;
    public final Boolean includesTip;
    public final String text;
    public static final StateV3$AcceptData$Earnings$EarningsDetails$Secondary$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$EarningsDetails$Secondary$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 117;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            InteropView_androidKt interopView_androidKt = InteropView_androidKt.RemoteActionCompatParcelizer;
            int i4 = read + 113;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return interopView_androidKt;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(10))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$EarningsDetails$Secondary$Companion] */
    static {
        int i = read + 85;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accessunregisterSaveStateProvider(int i, String str, Boolean bool, Boolean bool2, List list) {
        Object obj = null;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, InteropView_androidKt.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.includesTip = null;
        } else {
            this.includesTip = bool;
            int i2 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i3 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.includesBoost = null;
            int i5 = 2 % 2;
        } else {
            this.includesBoost = bool2;
        }
        if ((i & 8) != 0) {
            this.icons = list;
            return;
        }
        int i6 = IconCompatParcelizer + 69;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i7;
        if (i6 % 2 == 0) {
            this.icons = null;
            obj.hashCode();
            throw null;
        }
        this.icons = null;
        int i8 = i7 + 7;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.text.hashCode();
        Boolean bool = this.includesTip;
        int iHashCode3 = 0;
        if (bool == null) {
            int i2 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        Boolean bool2 = this.includesBoost;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        List list = this.icons;
        if (list != null) {
            iHashCode3 = list.hashCode();
            int i4 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Secondary(text=" + this.text + ", includesTip=" + this.includesTip + ", includesBoost=" + this.includesBoost + ", icons=" + this.icons + ")";
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof accessunregisterSaveStateProvider))) {
            accessunregisterSaveStateProvider accessunregistersavestateprovider = (accessunregisterSaveStateProvider) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, accessunregistersavestateprovider.text}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.includesTip, accessunregistersavestateprovider.includesTip}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.includesBoost, accessunregistersavestateprovider.includesBoost}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icons, accessunregistersavestateprovider.icons}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    int i4 = IconCompatParcelizer + 97;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return true;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i5 = RemoteActionCompatParcelizer + 21;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 0;
                }
                return false;
            }
        }
        return false;
    }
}
