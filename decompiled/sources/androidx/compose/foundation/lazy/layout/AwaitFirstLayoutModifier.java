package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnLayoutRectChangedModifierKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.huawei.riemann.location.common.utils.Constant;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import o.ElevationKt;
import o.createFromParcel;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public final class AwaitFirstLayoutModifier extends ModifierNodeElement<ElevationKt> {
    public CompletableDeferredImpl read;
    public ElevationKt write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Constant.ERROR_LOCATION_INVALID;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new ElevationKt(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("AwaitFirstLayoutModifier");
    }

    public final Object waitForFirstLayout(ContinuationImpl continuationImpl) {
        CompletableDeferredImpl completableDeferredImplWrite = this.read;
        if (completableDeferredImplWrite == null) {
            completableDeferredImplWrite = JobKt.write();
            this.read = completableDeferredImplWrite;
            ElevationKt elevationKt = this.write;
            if (elevationKt != null && elevationKt.isAttached()) {
                elevationKt.IconCompatParcelizer = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(elevationKt, 0L, 0L, new waitForFirstLayout(elevationKt, 17, elevationKt.write));
            }
        }
        Object objAwaitInternal = completableDeferredImplWrite.awaitInternal(continuationImpl);
        return objAwaitInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitInternal : createFromParcel.INSTANCE;
    }
}
