package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.CustomerUnavailableTaskState$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.IvrState;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getMaxDurationPerIteration;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMaxDuration {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableTaskState$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.CustomerUnavailableTaskState$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 57;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getMaxDurationPerIteration getmaxdurationperiteration = getMaxDurationPerIteration.IconCompatParcelizer;
            int i4 = serializer + 43;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getmaxdurationperiteration;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final Long firstOpenedTimeStamp;
    public final boolean isCallInitiated;
    public final boolean isChatInitiated;
    public final boolean isTimerFinished;
    public final IvrState ivrState;
    public final Map tasksStatus;
    public final Long timerEndingTimeStamp;
    public final Long timerStartingTimeStamp;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.CustomerUnavailableTaskState$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(10)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(11))};
        int i = read + 55;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getMaxDuration(int i, boolean z, boolean z2, Long l, Long l2, Long l3, boolean z3, IvrState ivrState, Map map) {
        if ((i & 1) == 0) {
            this.isChatInitiated = false;
        } else {
            this.isChatInitiated = z;
        }
        if ((i & 2) == 0) {
            this.isCallInitiated = false;
            int i2 = RemoteActionCompatParcelizer + 71;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.isCallInitiated = z2;
        }
        if ((i & 4) == 0) {
            int i4 = RemoteActionCompatParcelizer + 55;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.firstOpenedTimeStamp = null;
        } else {
            this.firstOpenedTimeStamp = l;
        }
        if ((i & 8) == 0) {
            this.timerEndingTimeStamp = null;
            int i6 = write + 101;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        } else {
            this.timerEndingTimeStamp = l2;
        }
        if ((i & 16) == 0) {
            this.timerStartingTimeStamp = null;
        } else {
            this.timerStartingTimeStamp = l3;
            int i8 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.isTimerFinished = false;
        } else {
            this.isTimerFinished = z3;
        }
        if ((i & 64) == 0) {
            this.ivrState = IvrState.NOT_INITIATED;
            int i9 = 2 % 2;
        } else {
            this.ivrState = ivrState;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            this.tasksStatus = map;
            return;
        }
        int i10 = write + 15;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            this.tasksStatus = SimpleItemTouchHelperCallback.serializer;
        } else {
            this.tasksStatus = SimpleItemTouchHelperCallback.serializer;
            int i11 = 81 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = write + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isChatInitiated) * 31, 31, this.isCallInitiated);
        Long l = this.firstOpenedTimeStamp;
        if (l == null) {
            int i4 = write + 45;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        Long l2 = this.timerEndingTimeStamp;
        if (l2 == null) {
            int i6 = RemoteActionCompatParcelizer + 55;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l2.hashCode();
        }
        Long l3 = this.timerStartingTimeStamp;
        return this.tasksStatus.hashCode() + ((this.ivrState.hashCode() + d$$ExternalSyntheticOutline0.m((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.isTimerFinished)) * 31);
    }

    public static getMaxDuration RemoteActionCompatParcelizer(getMaxDuration getmaxduration, boolean z, boolean z2, Long l, Long l2, IvrState ivrState, Map map, int i) {
        boolean z3;
        Long l3;
        Long l4;
        boolean z4;
        Map map2;
        Long l5;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 19;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z3 = getmaxduration.isChatInitiated;
        } else {
            z3 = z;
        }
        boolean z5 = (i & 2) != 0 ? getmaxduration.isCallInitiated : z2;
        Long l6 = getmaxduration.firstOpenedTimeStamp;
        if ((i & 8) != 0) {
            int i8 = write + 101;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                l5 = getmaxduration.timerEndingTimeStamp;
                int i9 = 23 / 0;
            } else {
                l5 = getmaxduration.timerEndingTimeStamp;
            }
            l3 = l5;
        } else {
            l3 = l;
        }
        if ((i & 16) != 0) {
            int i10 = RemoteActionCompatParcelizer + 97;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                Long l7 = getmaxduration.timerStartingTimeStamp;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            l4 = getmaxduration.timerStartingTimeStamp;
        } else {
            l4 = l2;
        }
        if ((i & 32) != 0) {
            int i11 = RemoteActionCompatParcelizer + 69;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                z4 = getmaxduration.isTimerFinished;
                int i12 = 13 / 0;
            } else {
                z4 = getmaxduration.isTimerFinished;
            }
        } else {
            z4 = true;
        }
        boolean z6 = z4;
        int i13 = write + 53;
        int i14 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i14;
        int i15 = i13 % 2;
        IvrState ivrState2 = (i & 64) != 0 ? getmaxduration.ivrState : ivrState;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            map2 = getmaxduration.tasksStatus;
        } else {
            int i16 = i14 + 59;
            write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            map2 = map;
        }
        ivrState2.getClass();
        map2.getClass();
        getMaxDuration getmaxduration2 = new getMaxDuration(z3, z5, l6, l3, l4, z6, ivrState2, map2);
        int i18 = RemoteActionCompatParcelizer + 71;
        write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i18 % 2 == 0) {
            int i19 = 40 / 0;
        }
        return getmaxduration2;
    }

    public getMaxDuration(boolean z, boolean z2, Long l, Long l2, Long l3, boolean z3, IvrState ivrState, Map map) {
        ivrState.getClass();
        this.isChatInitiated = z;
        this.isCallInitiated = z2;
        this.firstOpenedTimeStamp = l;
        this.timerEndingTimeStamp = l2;
        this.timerStartingTimeStamp = l3;
        this.isTimerFinished = z3;
        this.ivrState = ivrState;
        this.tasksStatus = map;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 79;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getMaxDuration)) {
            return false;
        }
        getMaxDuration getmaxduration = (getMaxDuration) obj;
        if (this.isChatInitiated != getmaxduration.isChatInitiated) {
            return false;
        }
        if (this.isCallInitiated != getmaxduration.isCallInitiated) {
            int i4 = RemoteActionCompatParcelizer + 71;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.firstOpenedTimeStamp, getmaxduration.firstOpenedTimeStamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timerEndingTimeStamp, getmaxduration.timerEndingTimeStamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timerStartingTimeStamp, getmaxduration.timerStartingTimeStamp}, getCieXyz.write())).booleanValue() || this.isTimerFinished != getmaxduration.isTimerFinished) {
            return false;
        }
        if (this.ivrState != getmaxduration.ivrState) {
            int i6 = RemoteActionCompatParcelizer + 71;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tasksStatus, getmaxduration.tasksStatus}, getCieXyz.write())).booleanValue()) {
            int i8 = write + 39;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = write + 61;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomerUnavailableTaskState(isChatInitiated=" + this.isChatInitiated + ", isCallInitiated=" + this.isCallInitiated + ", firstOpenedTimeStamp=" + this.firstOpenedTimeStamp + ", timerEndingTimeStamp=" + this.timerEndingTimeStamp + ", timerStartingTimeStamp=" + this.timerStartingTimeStamp + ", isTimerFinished=" + this.isTimerFinished + ", ivrState=" + this.ivrState + ", tasksStatus=" + this.tasksStatus + ")";
        int i2 = write + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getMaxDuration(Long l, int i) {
        if ((i & 4) != 0) {
            int i2 = write + 81;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            if (i2 % 2 != 0) {
                int i4 = 62 / 0;
            }
            int i5 = i3 + 117;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            l = null;
        }
        this(false, false, l, null, null, false, IvrState.NOT_INITIATED, SimpleItemTouchHelperCallback.serializer);
    }
}
