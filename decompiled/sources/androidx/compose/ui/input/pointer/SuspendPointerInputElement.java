package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {
    public static final int $stable = 0;
    private final Object key1;
    private final Object key2;
    private final Object[] keys;
    private final PointerInputEventHandler pointerInputEventHandler;

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final PointerInputEventHandler getPointerInputEventHandler() {
        return this.pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SuspendingPointerInputModifierNodeImpl create() {
        return new SuspendingPointerInputModifierNodeImpl(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl) {
        suspendingPointerInputModifierNodeImpl.update$ui(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set("key1", this.key1);
        inspectorInfo.getProperties().set("key2", this.key2);
        inspectorInfo.getProperties().set("keys", this.keys);
        inspectorInfo.getProperties().set("pointerInputEventHandler", this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key1, suspendPointerInputElement.key1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key2, suspendPointerInputElement.key2}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = suspendPointerInputElement.keys;
        if (objArr != null) {
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (objArr2 != null) {
            return false;
        }
        return this.pointerInputEventHandler == suspendPointerInputElement.pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Object obj = this.key1;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.key2;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        Object[] objArr = this.keys;
        return this.pointerInputEventHandler.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputEventHandler = pointerInputEventHandler;
    }
}
