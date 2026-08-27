package androidx.compose.ui.hapticfeedback;

import androidx.sqlite.SQLite;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m1509getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1522getConfirm5zf0vsI();
        }

        /* JADX INFO: renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m1510getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1523getContextClick5zf0vsI();
        }

        /* JADX INFO: renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m1511getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1524getGestureEnd5zf0vsI();
        }

        /* JADX INFO: renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m1512getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1525getGestureThresholdActivate5zf0vsI();
        }

        /* JADX INFO: renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m1513getKeyboardTap5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1526getKeyboardTap5zf0vsI();
        }

        /* JADX INFO: renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m1514getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1527getLongPress5zf0vsI();
        }

        /* JADX INFO: renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m1515getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1528getReject5zf0vsI();
        }

        /* JADX INFO: renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m1516getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1529getSegmentFrequentTick5zf0vsI();
        }

        /* JADX INFO: renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m1517getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1530getSegmentTick5zf0vsI();
        }

        /* JADX INFO: renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m1518getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1531getTextHandleMove5zf0vsI();
        }

        /* JADX INFO: renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m1519getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1532getToggleOff5zf0vsI();
        }

        /* JADX INFO: renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m1520getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1533getToggleOn5zf0vsI();
        }

        /* JADX INFO: renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m1521getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m1534getVirtualKey5zf0vsI();
        }

        private Companion() {
        }

        public final List<HapticFeedbackType> values() {
            return SQLite.read(HapticFeedbackType.m1502boximpl(m1509getConfirm5zf0vsI()), HapticFeedbackType.m1502boximpl(m1510getContextClick5zf0vsI()), HapticFeedbackType.m1502boximpl(m1511getGestureEnd5zf0vsI()), HapticFeedbackType.m1502boximpl(m1512getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m1502boximpl(m1513getKeyboardTap5zf0vsI()), HapticFeedbackType.m1502boximpl(m1514getLongPress5zf0vsI()), HapticFeedbackType.m1502boximpl(m1515getReject5zf0vsI()), HapticFeedbackType.m1502boximpl(m1516getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m1502boximpl(m1517getSegmentTick5zf0vsI()), HapticFeedbackType.m1502boximpl(m1518getTextHandleMove5zf0vsI()), HapticFeedbackType.m1502boximpl(m1519getToggleOff5zf0vsI()), HapticFeedbackType.m1502boximpl(m1520getToggleOn5zf0vsI()), HapticFeedbackType.m1502boximpl(m1521getVirtualKey5zf0vsI()));
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1503constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1505equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1506hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1508unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m1502boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1507toStringimpl(int i) {
        Companion companion = Companion;
        if (m1505equalsimpl0(i, companion.m1509getConfirm5zf0vsI())) {
            return "Confirm";
        }
        if (m1505equalsimpl0(i, companion.m1510getContextClick5zf0vsI())) {
            return "ContextClick";
        }
        if (m1505equalsimpl0(i, companion.m1511getGestureEnd5zf0vsI())) {
            return "GestureEnd";
        }
        if (m1505equalsimpl0(i, companion.m1512getGestureThresholdActivate5zf0vsI())) {
            return "GestureThresholdActivate";
        }
        if (m1505equalsimpl0(i, companion.m1513getKeyboardTap5zf0vsI())) {
            return "KeyboardTap";
        }
        if (m1505equalsimpl0(i, companion.m1514getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m1505equalsimpl0(i, companion.m1515getReject5zf0vsI())) {
            return "Reject";
        }
        if (m1505equalsimpl0(i, companion.m1516getSegmentFrequentTick5zf0vsI())) {
            return "SegmentFrequentTick";
        }
        if (m1505equalsimpl0(i, companion.m1517getSegmentTick5zf0vsI())) {
            return "SegmentTick";
        }
        if (m1505equalsimpl0(i, companion.m1518getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        if (m1505equalsimpl0(i, companion.m1519getToggleOff5zf0vsI())) {
            return "ToggleOff";
        }
        if (m1505equalsimpl0(i, companion.m1520getToggleOn5zf0vsI())) {
            return "ToggleOn";
        }
        return m1505equalsimpl0(i, companion.m1521getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m1504equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1506hashCodeimpl(this.value);
    }

    public String toString() {
        return m1507toStringimpl(this.value);
    }

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1504equalsimpl(int i, Object obj) {
        return (obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).m1508unboximpl();
    }
}
