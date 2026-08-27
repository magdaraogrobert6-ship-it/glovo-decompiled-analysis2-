package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class ConsumedData {
    public static final int $stable = 8;
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    @onItemDismisslambda0
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public final boolean getDownChange() {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            return consumedDelegate$ui.getDownChange$ui();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getDownChange$ui() : this.downChange;
    }

    public final boolean getPositionChange() {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            return consumedDelegate$ui.getPositionChange$ui();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getPositionChange$ui() : this.positionChange;
    }

    public final void setDownChange(boolean z) {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            consumedDelegate$ui.setDownChange$ui(z);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui(z);
        }
        this.downChange = z;
    }

    public final void setPositionChange(boolean z) {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            consumedDelegate$ui.setPositionChange$ui(z);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui(z);
        }
        this.positionChange = z;
    }

    public /* synthetic */ ConsumedData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public ConsumedData(boolean z, boolean z2) {
        this.positionChange = z;
        this.downChange = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumedData() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public ConsumedData(PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange$ui(), pointerInputChange.getDownChange$ui());
        this.change = pointerInputChange;
    }
}
