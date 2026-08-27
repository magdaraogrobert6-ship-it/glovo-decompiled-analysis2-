package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.opportunities.calendar.data.BonusMultiplierResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.u8;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class u7 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final List multipliers;
    public static final BonusMultiplierResponse$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.calendar.data.BonusMultiplierResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            u8 u8Var;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 91;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                u8Var = u8.RemoteActionCompatParcelizer;
                int i3 = 13 / 0;
            } else {
                u8Var = u8.RemoteActionCompatParcelizer;
            }
            int i4 = RemoteActionCompatParcelizer + 3;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return u8Var;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(12))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.calendar.data.BonusMultiplierResponse$Companion] */
    static {
        int i = write + 33;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ u7(int i, List list) {
        if (1 == (i & 1)) {
            this.multipliers = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, u8.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.multipliers.hashCode();
        int i4 = read + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = read + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str = MediaSessionCompatQueueItem.read("BonusMultiplierResponse(multipliers=", ")", this.multipliers);
            int i3 = 85 / 0;
        } else {
            str = MediaSessionCompatQueueItem.read("BonusMultiplierResponse(multipliers=", ")", this.multipliers);
        }
        int i4 = serializer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 79;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 65;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        Object[] objArr = {this.multipliers, ((u7) obj).multipliers};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 43;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i8 = read + 121;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
