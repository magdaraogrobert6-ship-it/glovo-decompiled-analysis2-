package o;

import com.roadrunner.startworking.data.startworking.oneclick.OneClickStartWorkingResponse$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class dismissBannerlambda1 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final OneClickStartWorkingResponse$Companion Companion = new OneClickStartWorkingResponse$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final List components;
    public final List equipments;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new subscribeToFeatureFlagsUpdateslambda1(2)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new subscribeToFeatureFlagsUpdateslambda1(3))};
        int i = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = read + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.equipments;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ dismissBannerlambda1(List list, List list2, int i) {
        if (3 == (i & 3)) {
            this.equipments = list;
            this.components = list2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, dismissBannerlambda10.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.components.hashCode() * (this.equipments.hashCode() >>> 20);
        } else {
            iHashCode = this.components.hashCode() + (this.equipments.hashCode() * 31);
        }
        int i3 = read + 27;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public dismissBannerlambda1(ArrayList arrayList, ArrayList arrayList2) {
        this.equipments = arrayList;
        this.components = arrayList2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OneClickStartWorkingResponse(equipments=" + this.equipments + ", components=" + this.components + ")";
        int i2 = read + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 55;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 123;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 79;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof dismissBannerlambda1) {
            dismissBannerlambda1 dismissbannerlambda1 = (dismissBannerlambda1) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.equipments, dismissbannerlambda1.equipments}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, dismissbannerlambda1.components}, getCieXyz.write())).booleanValue();
        }
        int i9 = i2 + 69;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
