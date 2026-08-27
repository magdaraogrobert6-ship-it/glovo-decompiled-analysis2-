package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class BrushStyle implements TextForegroundStyle {
    private final float alpha;
    private final ShaderBrush value;

    public final ShaderBrush component1() {
        return this.value;
    }

    public final float component2() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return this.value;
    }

    public final ShaderBrush getValue() {
        return this.value;
    }

    public final BrushStyle copy(ShaderBrush shaderBrush, float f) {
        return new BrushStyle(shaderBrush, f);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo3391getColor0d7_KjU() {
        return Color.Companion.m758getUnspecified0d7_KjU();
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + (this.value.hashCode() * 31);
    }

    public BrushStyle(ShaderBrush shaderBrush, float f) {
        this.value = shaderBrush;
        this.alpha = f;
    }

    public static /* synthetic */ BrushStyle copy$default(BrushStyle brushStyle, ShaderBrush shaderBrush, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            shaderBrush = brushStyle.value;
        }
        if ((i & 2) != 0) {
            f = brushStyle.alpha;
        }
        return brushStyle.copy(shaderBrush, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, brushStyle.value}, getCieXyz.write())).booleanValue() && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.value);
        sb.append(", alpha=");
        return MediaSessionCompatQueueItem.serializer(sb, this.alpha, ')');
    }
}
