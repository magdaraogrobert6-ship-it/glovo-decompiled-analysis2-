package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import kotlinx.coroutines.sync.MutexImpl;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SelectionHandleIcon;
import o.getCieXyz;
import o.getTextValue;
import o.listValue;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAutofillHints;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableAnchorsNode extends Modifier.Node implements LayoutModifierNode {
    public SelectionHandleIcon IconCompatParcelizer;
    public AnchoredDraggableState read;
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public boolean write;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.write = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        if (!measureScope.isLookingAhead() || !this.write) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) this.serializer.invoke(IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L) | (((long) placeableMo2209measureBRTryo0.getWidth()) << 32))), Constraints.m3613boximpl(j));
            AnchoredDraggableState anchoredDraggableState = this.read;
            listValue listvalue = (listValue) onviewattachedtowindowlambda0.serializer;
            Object obj = onviewattachedtowindowlambda0.write;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{anchoredDraggableState.RemoteActionCompatParcelizer(), listvalue}, getCieXyz.write())).booleanValue()) {
                ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) anchoredDraggableState.RemoteActionCompatParcelizer)).setValue(listvalue);
                MutexImpl mutexImpl = ((setAutofillHints) anchoredDraggableState.MediaBrowserCompatMediaItem).serializer;
                boolean zWrite = mutexImpl.write();
                if (zWrite) {
                    try {
                        getTextValue gettextvalue = (getTextValue) anchoredDraggableState.read;
                        float f = anchoredDraggableState.RemoteActionCompatParcelizer().read(obj);
                        if (!Float.isNaN(f)) {
                            getTextValue.IconCompatParcelizer(gettextvalue, f);
                            anchoredDraggableState.write(null);
                        }
                        anchoredDraggableState.IconCompatParcelizer(obj);
                        mutexImpl.write(null);
                    } catch (Throwable th) {
                        mutexImpl.write(null);
                        throw th;
                    }
                }
                if (!zWrite) {
                    anchoredDraggableState.write(obj);
                }
            }
        }
        this.write = measureScope.isLookingAhead() || this.write;
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(measureScope, this, placeableMo2209measureBRTryo0, 15), 4, null);
    }
}
