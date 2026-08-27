package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import o.RoundedCornerShapeKt;
import o.SelectionHandleIcon;
import o.getBrush;
import o.getUptimeimpl;
import o.isAppSetIdReadingEnabled;
import o.onHideTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public boolean IconCompatParcelizer;
    public ScrollState write;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        final int i = 1;
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        final int i2 = 0;
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.BringIntoViewResponderNode
            public final /* synthetic */ androidx.compose.foundation.ScrollNode read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                androidx.compose.foundation.ScrollNode scrollNode = this.read;
                return Float.valueOf(i3 != 0 ? scrollNode.write.read() : scrollNode.write.serializer());
            }
        }, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.BringIntoViewResponderNode
            public final /* synthetic */ androidx.compose.foundation.ScrollNode read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i;
                androidx.compose.foundation.ScrollNode scrollNode = this.read;
                return Float.valueOf(i3 != 0 ? scrollNode.write.read() : scrollNode.write.serializer());
            }
        }, false);
        if (this.IconCompatParcelizer) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        getUptimeimpl.serializer(j, this.IconCompatParcelizer ? SelectionHandleIcon.Vertical : SelectionHandleIcon.Horizontal);
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(Constraints.m3616copyZbe2FdA$default(j, 0, this.IconCompatParcelizer ? Constraints.m3626getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.IconCompatParcelizer ? Integer.MAX_VALUE : Constraints.m3625getMaxHeightimpl(j), 5, null));
        int width = placeableMo2209measureBRTryo0.getWidth();
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        int i = width > iM3626getMaxWidthimpl ? iM3626getMaxWidthimpl : width;
        int height = placeableMo2209measureBRTryo0.getHeight();
        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        int i2 = height > iM3625getMaxHeightimpl ? iM3625getMaxHeightimpl : height;
        int height2 = placeableMo2209measureBRTryo0.getHeight() - i2;
        int width2 = placeableMo2209measureBRTryo0.getWidth();
        if (!this.IconCompatParcelizer) {
            height2 = width2 - i;
        }
        ScrollState scrollState = this.write;
        ((onHideTranslationui) scrollState.read).serializer(height2);
        int i3 = 0;
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
        try {
            if (scrollState.serializer() > height2) {
                ((onHideTranslationui) scrollState.MediaDescriptionCompat).serializer(height2);
            }
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            ((onHideTranslationui) this.write.MediaSessionCompatQueueItem).serializer(this.IconCompatParcelizer ? i2 : i);
            ((onHideTranslationui) this.write.MediaMetadataCompat).serializer(this.IconCompatParcelizer ? placeableMo2209measureBRTryo0.getHeight() : placeableMo2209measureBRTryo0.getWidth());
            return MeasureScope.layout$default(measureScope, i, i2, null, new RoundedCornerShapeKt(height2, i3, this, placeableMo2209measureBRTryo0), 4, null);
        } catch (Throwable th) {
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }
}
