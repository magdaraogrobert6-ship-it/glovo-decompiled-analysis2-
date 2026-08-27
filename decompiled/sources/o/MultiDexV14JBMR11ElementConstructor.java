package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.RiderStateSummaryData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.newInstance;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class MultiDexV14JBMR11ElementConstructor {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final mkdirChecked action;
    public final List buttons;
    public final MultiDexV14ICSElementConstructor description;
    public final String variant;
    public static final RiderStateSummaryData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.RiderStateSummaryData$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 9;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                newInstance newinstance = newInstance.read;
                throw null;
            }
            newInstance newinstance2 = newInstance.read;
            int i3 = IconCompatParcelizer + 19;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return newinstance2;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(13)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.RiderStateSummaryData$Companion] */
    static {
        int i = IconCompatParcelizer + 7;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ MultiDexV14JBMR11ElementConstructor(int i, MultiDexV14ICSElementConstructor multiDexV14ICSElementConstructor, mkdirChecked mkdirchecked, List list, String str) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = multiDexV14ICSElementConstructor;
        }
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = mkdirchecked;
            int i2 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i3 = serializer + 5;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.buttons = null;
            int i5 = 2 % 2;
        } else {
            this.buttons = list;
        }
        if ((i & 8) != 0) {
            this.variant = str;
            return;
        }
        int i6 = serializer + 55;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            this.variant = null;
        } else {
            this.variant = null;
            int i7 = 93 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 87;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        MultiDexV14ICSElementConstructor multiDexV14ICSElementConstructor = this.description;
        if (multiDexV14ICSElementConstructor == null) {
            int i5 = i2 + 79;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = multiDexV14ICSElementConstructor.hashCode();
        }
        mkdirChecked mkdirchecked = this.action;
        int iHashCode2 = mkdirchecked == null ? 0 : mkdirchecked.hashCode();
        List list = this.buttons;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str = this.variant;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderStateSummaryData(description=" + this.description + ", action=" + this.action + ", buttons=" + this.buttons + ", variant=" + this.variant + ")";
        int i2 = serializer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 13;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 125;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i5 % 2 == 0;
            int i6 = i2 + 121;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return z;
            }
            throw null;
        }
        if (!(obj instanceof MultiDexV14JBMR11ElementConstructor)) {
            int i7 = i2 + 59;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        MultiDexV14JBMR11ElementConstructor multiDexV14JBMR11ElementConstructor = (MultiDexV14JBMR11ElementConstructor) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, multiDexV14JBMR11ElementConstructor.description}, getCieXyz.write())).booleanValue()) {
            int i8 = serializer + 33;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, multiDexV14JBMR11ElementConstructor.action}, getCieXyz.write())).booleanValue()) {
            int i10 = read + 67;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.buttons, multiDexV14JBMR11ElementConstructor.buttons}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variant, multiDexV14JBMR11ElementConstructor.variant}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i12 = serializer + 91;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return true;
    }
}
