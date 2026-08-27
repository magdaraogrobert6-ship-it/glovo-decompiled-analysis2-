package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes.dex */
public final class GlowEdgeEffectCompat extends EdgeEffect {
    public float IconCompatParcelizer;
    public final float read;

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.IconCompatParcelizer = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.IconCompatParcelizer = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.IconCompatParcelizer = 0.0f;
        super.onRelease();
    }

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.read = AndroidDensity_androidKt.Density(context).mo48toPx0680j_4(Dp.m3673constructorimpl(1.0f));
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.IconCompatParcelizer = 0.0f;
        super.onPull(f);
    }
}
