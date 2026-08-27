package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.database.entity.PinEntity$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.onEventTrackingFailed;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onDeeplinkResolved {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final boolean multiRow;
    public final List sections;
    public static final PinEntity$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.database.entity.PinEntity$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 91;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onEventTrackingFailed oneventtrackingfailed = onEventTrackingFailed.RemoteActionCompatParcelizer;
            int i4 = serializer + 113;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return oneventtrackingfailed;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(16))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.database.entity.PinEntity$Companion] */
    static {
        int i = write + 11;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.multiRow;
        }
        int i3 = 25 / 0;
        return this.multiRow;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 89;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.sections;
        int i5 = i2 + 97;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.sections.hashCode() + (Boolean.hashCode(this.multiRow) * 31);
        int i4 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return iHashCode;
    }

    public /* synthetic */ onDeeplinkResolved(List list, boolean z, int i) {
        if ((i & 1) == 0) {
            int i2 = IconCompatParcelizer + 65;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 3 % 3;
            } else {
                int i4 = 2 % 2;
            }
            z = false;
        }
        this.multiRow = z;
        if ((i & 2) != 0) {
            this.sections = list;
            return;
        }
        int i5 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            this.sections = instance_delegatelambda0.write;
        } else {
            this.sections = instance_delegatelambda0.write;
            int i6 = 79 / 0;
        }
    }

    public onDeeplinkResolved(List list, boolean z) {
        this.multiRow = z;
        this.sections = list;
    }

    public /* synthetic */ onDeeplinkResolved() {
        this(instance_delegatelambda0.write, false);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof onDeeplinkResolved)) {
                return false;
            }
            onDeeplinkResolved ondeeplinkresolved = (onDeeplinkResolved) obj;
            if (this.multiRow != ondeeplinkresolved.multiRow) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sections, ondeeplinkresolved.sections}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        int i3 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PinEntity(multiRow=" + this.multiRow + ", sections=" + this.sections + ")";
        int i2 = IconCompatParcelizer + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return str;
    }
}
