package o;

import com.roadrunner.rider.state.searchshifts.api.entity.QuickSessions$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getPayloadFromSystemProperty {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final int cityId;
    public final List zones;
    public static final QuickSessions$Companion Companion = new QuickSessions$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(23))};

    static {
        Object obj = null;
        int i = IconCompatParcelizer + 39;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getPayloadFromSystemProperty(List list, int i, int i2) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.cityId = i2;
            if ((i & 2) == 0) {
                this.zones = instance_delegatelambda0.write;
                int i3 = RemoteActionCompatParcelizer + 101;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 34 / 0;
                    return;
                }
                return;
            }
            this.zones = list;
            int i5 = RemoteActionCompatParcelizer + 101;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PreinstallUtil.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.zones.hashCode() + (Integer.hashCode(this.cityId) * 31);
        int i4 = RemoteActionCompatParcelizer + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getPayloadFromSystemProperty) {
            getPayloadFromSystemProperty getpayloadfromsystemproperty = (getPayloadFromSystemProperty) obj;
            if (this.cityId == getpayloadfromsystemproperty.cityId) {
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zones, getpayloadfromsystemproperty.zones}, getCieXyz.write())).booleanValue() ^ true);
            }
            int i2 = RemoteActionCompatParcelizer + 93;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QuickSessions(cityId=" + this.cityId + ", zones=" + this.zones + ")";
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
