package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ContextMenuSpec;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private Offset inferredCursorRawOffset;
    private boolean isInFakeFingerGesture;
    private boolean isReinterpretingFakeFingerGesture;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private final ContextMenuSpec previousIndirectPointerEventData = new ContextMenuSpec((Object) null);
    private int previousToolType = -1;
    private int previousSource = -1;

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class IndirectPointerEventData {
        public static final Companion Companion = new Companion(null);
        private final long packedValue;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m1983constructorimpl(long j) {
            return j;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1986equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* JADX INFO: renamed from: getDown-impl, reason: not valid java name */
        public static final boolean m1987getDownimpl(long j) {
            return (j & 1) != 0;
        }

        /* JADX INFO: renamed from: getUptime-impl, reason: not valid java name */
        public static final long m1989getUptimeimpl(long j) {
            return (j >> 1) & 2147483647L;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m1990hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        public final long getPackedValue() {
            return this.packedValue;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m1992unboximpl() {
            return this.packedValue;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IndirectPointerEventData m1982boximpl(long j) {
            return new IndirectPointerEventData(j);
        }

        public boolean equals(Object obj) {
            return m1985equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m1990hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m1991toStringimpl(this.packedValue);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int packShorts(short s, short s2) {
                return (s << 16) | (s2 & 65535);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort1(int i) {
                return (short) (i >>> 16);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort2(int i) {
                return (short) (i & 65535);
            }

            private Companion() {
            }
        }

        private /* synthetic */ IndirectPointerEventData(long j) {
            this.packedValue = j;
        }

        /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
        public static final long m1988getPositionF1C5BW0(long j) {
            int i = (int) (j >>> 32);
            Companion companion = Companion;
            return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(companion.unpackShort2(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(companion.unpackShort1(i))) << 32));
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m1991toStringimpl(long j) {
            return "IndirectPointerEventData(packedValue=" + j + ')';
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m1985equalsimpl(long j, Object obj) {
            return (obj instanceof IndirectPointerEventData) && j == ((IndirectPointerEventData) obj).m1992unboximpl();
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m1984constructorimpl(long j, long j2, boolean z) {
            return m1983constructorimpl(((j & 2147483647L) << 1) | (z ? 1L : 0L) | (((long) Companion.packShorts((short) Float.intBitsToFloat((int) (j2 >> 32)), (short) Float.intBitsToFloat((int) (j2 & 4294967295L)))) << 32));
        }
    }

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui$annotations() {
    }

    private final void resetFakeFingerGesture() {
        this.isInFakeFingerGesture = false;
        this.isReinterpretingFakeFingerGesture = false;
        this.inferredCursorRawOffset = null;
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui() {
        return this.motionEventToComposePointerIdMap;
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m1980getComposePointerId_I2yYro(int i) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(i, jValueAt);
        }
        return PointerId.m2048constructorimpl(jValueAt);
    }

    public final void endStream(int i) {
        this.activeHoverIds.delete(i);
        this.motionEventToComposePointerIdMap.delete(i);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX INFO: renamed from: convertToIndirectPointerEvent-k92h6UU$ui, reason: not valid java name */
    public final AndroidIndirectPointerEvent m1981convertToIndirectPointerEventk92h6UU$ui(MotionEvent motionEvent, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        int actionIndex;
        int iIndirectPrimaryDirectionalScrollAxis;
        long eventTime;
        long jM1988getPositionF1C5BW0;
        boolean zM1987getDownimpl;
        int actionMasked = motionEvent.getActionMasked();
        clearOnDeviceChange(motionEvent);
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        addFreshIds(motionEvent);
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        boolean z = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = new ArrayList(pointerCount);
        int i = 0;
        while (i < pointerCount) {
            long jM1980getComposePointerId_I2yYro = m1980getComposePointerId_I2yYro(motionEvent.getPointerId(i));
            long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32));
            boolean z2 = i != actionIndex;
            IndirectPointerEventData indirectPointerEventData = (IndirectPointerEventData) this.previousIndirectPointerEventData.write(jM1980getComposePointerId_I2yYro);
            if (i == actionIndex) {
                this.previousIndirectPointerEventData.IconCompatParcelizer(jM1980getComposePointerId_I2yYro);
            } else {
                if (z) {
                    this.previousIndirectPointerEventData.read(jM1980getComposePointerId_I2yYro, IndirectPointerEventData.m1982boximpl(IndirectPointerEventData.m1984constructorimpl(motionEvent.getEventTime(), jM469constructorimpl, true)));
                }
                long eventTime2 = motionEvent.getEventTime();
                float pressure = motionEvent.getPressure(i);
                if (indirectPointerEventData != null) {
                    eventTime = IndirectPointerEventData.m1989getUptimeimpl(indirectPointerEventData.m1992unboximpl());
                } else {
                    eventTime = motionEvent.getEventTime();
                }
                long j = eventTime;
                if (indirectPointerEventData != null) {
                    jM1988getPositionF1C5BW0 = IndirectPointerEventData.m1988getPositionF1C5BW0(indirectPointerEventData.m1992unboximpl());
                } else {
                    jM1988getPositionF1C5BW0 = jM469constructorimpl;
                }
                if (indirectPointerEventData != null) {
                    zM1987getDownimpl = IndirectPointerEventData.m1987getDownimpl(indirectPointerEventData.m1992unboximpl());
                } else {
                    zM1987getDownimpl = false;
                }
                arrayList.add(new IndirectPointerInputChange(jM1980getComposePointerId_I2yYro, eventTime2, jM469constructorimpl, z2, pressure, j, jM1988getPositionF1C5BW0, zM1987getDownimpl, null));
                i++;
                z = z;
                pointerCount = pointerCount;
            }
            long eventTime3 = motionEvent.getEventTime();
            float pressure2 = motionEvent.getPressure(i);
            if (indirectPointerEventData != null) {
                eventTime = IndirectPointerEventData.m1989getUptimeimpl(indirectPointerEventData.m1992unboximpl());
            } else {
                eventTime = motionEvent.getEventTime();
            }
            long j2 = eventTime;
            if (indirectPointerEventData != null) {
                jM1988getPositionF1C5BW0 = IndirectPointerEventData.m1988getPositionF1C5BW0(indirectPointerEventData.m1992unboximpl());
            } else {
                jM1988getPositionF1C5BW0 = jM469constructorimpl;
            }
            if (indirectPointerEventData != null) {
                zM1987getDownimpl = IndirectPointerEventData.m1987getDownimpl(indirectPointerEventData.m1992unboximpl());
            } else {
                zM1987getDownimpl = false;
            }
            arrayList.add(new IndirectPointerInputChange(jM1980getComposePointerId_I2yYro, eventTime3, jM469constructorimpl, z2, pressure2, j2, jM1988getPositionF1C5BW0, zM1987getDownimpl, null));
            i++;
            z = z;
            pointerCount = pointerCount;
        }
        removeStaleIds(motionEvent);
        if (indirectPointerEventPrimaryDirectionalMotionAxis != null) {
            iIndirectPrimaryDirectionalScrollAxis = indirectPointerEventPrimaryDirectionalMotionAxis.m1558unboximpl();
        } else {
            iIndirectPrimaryDirectionalScrollAxis = AndroidIndirectPointerEvent_androidKt.indirectPrimaryDirectionalScrollAxis(motionEvent);
        }
        return new AndroidIndirectPointerEvent(arrayList, AndroidIndirectPointerEvent_androidKt.convertActionToIndirectPointerEventType(actionMasked), iIndirectPrimaryDirectionalScrollAxis, motionEvent, null);
    }

    /* JADX INFO: renamed from: convertToIndirectPointerEvent-k92h6UU$ui$default, reason: not valid java name */
    public static /* synthetic */ AndroidIndirectPointerEvent m1978convertToIndirectPointerEventk92h6UU$ui$default(MotionEventAdapter motionEventAdapter, MotionEvent motionEvent, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, int i, Object obj) {
        if ((i & 2) != 0) {
            indirectPointerEventPrimaryDirectionalMotionAxis = null;
        }
        return motionEventAdapter.m1981convertToIndirectPointerEventk92h6UU$ui(motionEvent, indirectPointerEventPrimaryDirectionalMotionAxis);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0214  */
    /* JADX INFO: renamed from: createPointerInputEventData-InuC1xA, reason: not valid java name */
    private final PointerInputEventData m1979createPointerInputEventDataInuC1xA(PositionCalculator positionCalculator, MotionEvent motionEvent, Offset offset, int i, boolean z) {
        long jMo2155localToScreenMKHz9U;
        long jMo2156screenToLocalMKHz9U;
        long jM1993toRawOffsetdBAh8RU;
        int iM2154getUnknownT8wyACA;
        long jM493getZeroF1C5BW0;
        float fFloatValue;
        long jM493getZeroF1C5BW1;
        Float f;
        long jM493getZeroF1C5BW2;
        long jM469constructorimpl;
        long jM1980getComposePointerId_I2yYro = m1980getComposePointerId_I2yYro(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        long jM469constructorimpl2 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32));
        if (i == 0) {
            if (offset != null) {
                jM469constructorimpl = offset.m487unboximpl();
            } else {
                jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L));
            }
            jMo2156screenToLocalMKHz9U = positionCalculator.mo2156screenToLocalMKHz9U(jM469constructorimpl);
            jMo2155localToScreenMKHz9U = jM469constructorimpl;
        } else if (Build.VERSION.SDK_INT >= 29) {
            if (offset != null) {
                jM1993toRawOffsetdBAh8RU = offset.m487unboximpl();
            } else {
                jM1993toRawOffsetdBAh8RU = MotionEventHelper.INSTANCE.m1993toRawOffsetdBAh8RU(motionEvent, i);
            }
            jMo2155localToScreenMKHz9U = jM1993toRawOffsetdBAh8RU;
            jMo2156screenToLocalMKHz9U = positionCalculator.mo2156screenToLocalMKHz9U(jM1993toRawOffsetdBAh8RU);
        } else {
            jMo2155localToScreenMKHz9U = positionCalculator.mo2155localToScreenMKHz9U(jM469constructorimpl2);
            jMo2156screenToLocalMKHz9U = jM469constructorimpl2;
        }
        int toolType = motionEvent.getToolType(i);
        if (toolType == 0) {
            iM2154getUnknownT8wyACA = PointerType.Companion.m2154getUnknownT8wyACA();
        } else if (toolType != 1) {
            if (toolType == 2) {
                iM2154getUnknownT8wyACA = PointerType.Companion.m2152getStylusT8wyACA();
            } else if (toolType == 3) {
                iM2154getUnknownT8wyACA = PointerType.Companion.m2151getMouseT8wyACA();
            } else if (toolType != 4) {
                iM2154getUnknownT8wyACA = PointerType.Companion.m2154getUnknownT8wyACA();
            } else {
                iM2154getUnknownT8wyACA = PointerType.Companion.m2150getEraserT8wyACA();
            }
        } else if (ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
            if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.isInFakeFingerGesture && !this.isReinterpretingFakeFingerGesture)) {
                iM2154getUnknownT8wyACA = PointerType.Companion.m2153getTouchT8wyACA();
            } else {
                iM2154getUnknownT8wyACA = PointerType.Companion.m2151getMouseT8wyACA();
            }
        } else {
            iM2154getUnknownT8wyACA = PointerType.Companion.m2153getTouchT8wyACA();
        }
        int i2 = iM2154getUnknownT8wyACA;
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i3 = 0;
        while (true) {
            if (i3 >= historySize) {
                break;
            }
            float historicalX = motionEvent.getHistoricalX(i, i3);
            float historicalY = motionEvent.getHistoricalY(i, i3);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                long jM469constructorimpl3 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(historicalX)) << 32) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L));
                long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                Float fValueOf = Float.valueOf(motionEvent.getHistoricalAxisValue(52, i, i3));
                f = fValueOf.floatValue() > 0.0f ? fValueOf : null;
                float fFloatValue2 = f != null ? f.floatValue() : 1.0f;
                if (Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 3) {
                    jM493getZeroF1C5BW2 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << 32));
                } else {
                    jM493getZeroF1C5BW2 = Offset.Companion.m493getZeroF1C5BW0();
                }
                arrayList.add(new HistoricalChange(historicalEventTime, jM469constructorimpl3, fFloatValue2, jM493getZeroF1C5BW2, jM469constructorimpl3, (DefaultConstructorMarker) null));
            }
            i3++;
            jM469constructorimpl2 = jM469constructorimpl2;
        }
        long j = jM469constructorimpl2;
        if (motionEvent.getActionMasked() == 8) {
            jM493getZeroF1C5BW0 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L));
        } else {
            jM493getZeroF1C5BW0 = Offset.Companion.m493getZeroF1C5BW0();
        }
        long j2 = jM493getZeroF1C5BW0;
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 5) {
            Float fValueOf2 = Float.valueOf(motionEvent.getAxisValue(52, i));
            f = fValueOf2.floatValue() > 0.0f ? fValueOf2 : null;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
        } else {
            fFloatValue = 1.0f;
        }
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 3) {
            jM493getZeroF1C5BW1 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)))));
        } else {
            jM493getZeroF1C5BW1 = Offset.Companion.m493getZeroF1C5BW0();
        }
        return new PointerInputEventData(jM1980getComposePointerId_I2yYro, motionEvent.getEventTime(), jMo2155localToScreenMKHz9U, jMo2156screenToLocalMKHz9U, z, pressure, i2, this.activeHoverIds.get(motionEvent.getPointerId(i), false), arrayList, j2, fFloatValue, jM493getZeroF1C5BW1, j, null);
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    public final PointerInputEvent convertToPointerInputEvent$ui(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            resetFakeFingerGesture();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.isInFakeFingerGesture = true;
            }
        }
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 34 && motionEvent.getClassification() == 3) {
            this.isReinterpretingFakeFingerGesture = true;
            if (motionEvent.getActionMasked() == 0) {
                this.inferredCursorRawOffset = Offset.m466boximpl(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32)));
            }
            this.pointers.add(m1979createPointerInputEventDataInuC1xA(positionCalculator, motionEvent, this.inferredCursorRawOffset, 0, false));
        } else {
            this.isReinterpretingFakeFingerGesture = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                this.pointers.add(m1979createPointerInputEventDataInuC1xA(positionCalculator, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            resetFakeFingerGesture();
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }
}
