package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.TaskState$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.fitPrioritizingWidthZbe2FdA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class fixedHeightOenEA2s {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final Map componentStatus;
    public final Long firstOpenedTimeStamp;
    public final Long timerEndingTimeStamp;
    public final Long timerStartingTimeStamp;
    public static final TaskState$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.TaskState$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 121;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return fitPrioritizingWidthZbe2FdA.IconCompatParcelizer;
            }
            int i3 = 56 / 0;
            return fitPrioritizingWidthZbe2FdA.IconCompatParcelizer;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(26)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.TaskState$Companion] */
    static {
        Object obj = null;
        int i = read + 89;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ fixedHeightOenEA2s(int i, Map map, Long l, Long l2, Long l3) {
        this.componentStatus = (i & 1) == 0 ? SimpleItemTouchHelperCallback.serializer : map;
        if ((i & 2) == 0) {
            int i2 = write;
            int i3 = i2 + 19;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.firstOpenedTimeStamp = null;
            int i5 = i2 + 89;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            this.firstOpenedTimeStamp = l;
        }
        int i7 = 2 % 2;
        if ((i & 4) == 0) {
            int i8 = write + 53;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.timerStartingTimeStamp = null;
        } else {
            this.timerStartingTimeStamp = l2;
            int i10 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.timerEndingTimeStamp = null;
        } else {
            this.timerEndingTimeStamp = l3;
        }
    }

    public static fixedHeightOenEA2s serializer(fixedHeightOenEA2s fixedheightoenea2s, Map map, Long l, Long l2, Long l3, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            map = fixedheightoenea2s.componentStatus;
            int i3 = write + 13;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = IconCompatParcelizer + 109;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                l = fixedheightoenea2s.firstOpenedTimeStamp;
                int i6 = 49 / 0;
            } else {
                l = fixedheightoenea2s.firstOpenedTimeStamp;
            }
        }
        if ((i & 4) != 0) {
            int i7 = write + 83;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                Long l4 = fixedheightoenea2s.timerStartingTimeStamp;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            l2 = fixedheightoenea2s.timerStartingTimeStamp;
        }
        if ((i & 8) != 0) {
            int i8 = write + 17;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            l3 = fixedheightoenea2s.timerEndingTimeStamp;
        }
        fixedheightoenea2s.getClass();
        map.getClass();
        return new fixedHeightOenEA2s(map, l, l2, l3);
    }

    public fixedHeightOenEA2s(Map map, Long l, Long l2, Long l3) {
        this.componentStatus = map;
        this.firstOpenedTimeStamp = l;
        this.timerStartingTimeStamp = l2;
        this.timerEndingTimeStamp = l3;
    }

    public /* synthetic */ fixedHeightOenEA2s() {
        this(SimpleItemTouchHelperCallback.serializer, null, null, null);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.componentStatus.hashCode();
        Long l = this.firstOpenedTimeStamp;
        if (l == null) {
            int i2 = IconCompatParcelizer + 75;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        Long l2 = this.timerStartingTimeStamp;
        if (l2 == null) {
            int i4 = IconCompatParcelizer + 31;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i5;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
            int i6 = i5 + 101;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = l2.hashCode();
        }
        Long l3 = this.timerEndingTimeStamp;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TaskState(componentStatus=" + this.componentStatus + ", firstOpenedTimeStamp=" + this.firstOpenedTimeStamp + ", timerStartingTimeStamp=" + this.timerStartingTimeStamp + ", timerEndingTimeStamp=" + this.timerEndingTimeStamp + ")";
        int i2 = IconCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 27;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof fixedHeightOenEA2s) {
            fixedHeightOenEA2s fixedheightoenea2s = (fixedHeightOenEA2s) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.componentStatus, fixedheightoenea2s.componentStatus}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.firstOpenedTimeStamp, fixedheightoenea2s.firstOpenedTimeStamp}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timerStartingTimeStamp, fixedheightoenea2s.timerStartingTimeStamp}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timerEndingTimeStamp, fixedheightoenea2s.timerEndingTimeStamp}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i4 = write + 31;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = IconCompatParcelizer + 105;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = write + 51;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 == 0;
        }
        int i9 = write + 23;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
