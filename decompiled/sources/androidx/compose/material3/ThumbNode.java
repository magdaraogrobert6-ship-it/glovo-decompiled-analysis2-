package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.BlockRunner$cancel$1;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.getAndroidTypeannotations;
import o.getCieXyz;
import o.onShowTranslationui;
import o.removeNodeAtDepth;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    public float IconCompatParcelizer;
    public boolean MediaDescriptionCompat;
    public Animatable MediaMetadataCompat;
    public Animatable RatingCompat;
    public float RemoteActionCompatParcelizer;
    public width read;
    public boolean serializer;
    public MutableInteractionSourceImpl write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float f;
        int i = 1;
        int i2 = 0;
        boolean z = (measurable.maxIntrinsicHeight(Constraints.m3626getMaxWidthimpl(j)) == 0 || measurable.maxIntrinsicWidth(Constraints.m3625getMaxHeightimpl(j)) == 0) ? false : true;
        if (this.MediaDescriptionCompat) {
            f = SwitchTokens.MediaSessionCompatToken;
        } else {
            f = (z || this.serializer) ? SwitchKt.RemoteActionCompatParcelizer : SwitchKt.MediaMetadataCompat;
        }
        float fMo48toPx0680j_4 = measureScope.mo48toPx0680j_4(f);
        Animatable animatable = this.MediaMetadataCompat;
        int iFloatValue = (int) (animatable != null ? ((Number) animatable.write()).floatValue() : fMo48toPx0680j_4);
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(Constraints.Companion.m3636fixedJhjzzOo(iFloatValue, iFloatValue));
        float fMo48toPx0680j_5 = measureScope.mo48toPx0680j_4(Dp.m3673constructorimpl(Dp.m3673constructorimpl(SwitchKt.read - measureScope.mo44toDpu2uoSUM(fMo48toPx0680j_4)) / 2.0f));
        float fMo48toPx0680j_6 = measureScope.mo48toPx0680j_4(Dp.m3673constructorimpl(Dp.m3673constructorimpl(SwitchKt.write - SwitchKt.RemoteActionCompatParcelizer) - SwitchKt.IconCompatParcelizer));
        boolean z2 = this.MediaDescriptionCompat;
        if (z2 && this.serializer) {
            fMo48toPx0680j_5 = fMo48toPx0680j_6 - measureScope.mo48toPx0680j_4(SwitchTokens.ComponentActivity);
        } else if (z2 && !this.serializer) {
            fMo48toPx0680j_5 = measureScope.mo48toPx0680j_4(SwitchTokens.ComponentActivity);
        } else if (this.serializer) {
            fMo48toPx0680j_5 = fMo48toPx0680j_6;
        }
        Animatable animatable2 = this.MediaMetadataCompat;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), -531493232, 531493233, getCieXyz.write(), getCieXyz.write(), new Object[]{animatable2 != null ? (Float) ((onShowTranslationui) animatable2.RatingCompat).getValue() : null, Float.valueOf(fMo48toPx0680j_4)}, getCieXyz.write())).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fMo48toPx0680j_4, shortNewsContentCardView, i2), 3);
        }
        Animatable animatable3 = this.RatingCompat;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), -531493232, 531493233, getCieXyz.write(), getCieXyz.write(), new Object[]{animatable3 != null ? (Float) ((onShowTranslationui) animatable3.RatingCompat).getValue() : null, Float.valueOf(fMo48toPx0680j_5)}, getCieXyz.write())).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fMo48toPx0680j_5, shortNewsContentCardView, i), 3);
        }
        if (Float.isNaN(this.RemoteActionCompatParcelizer) && Float.isNaN(this.IconCompatParcelizer)) {
            this.RemoteActionCompatParcelizer = fMo48toPx0680j_4;
            this.IconCompatParcelizer = fMo48toPx0680j_5;
        }
        return MeasureScope.layout$default(measureScope, iFloatValue, iFloatValue, null, new getAndroidTypeannotations(placeableMo2209measureBRTryo0, this, fMo48toPx0680j_5), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 12), 3);
    }
}
