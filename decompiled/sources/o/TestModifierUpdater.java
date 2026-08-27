package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class TestModifierUpdater extends accessgetReusedSlotIdp {
    public final RectF r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    @Override // o.accessgetReusedSlotIdp, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        removeAll removeall = new removeAll(this);
        removeall.read = this;
        removeall.invalidateSelf();
        return removeall;
    }

    public TestModifierUpdater(TestModifierUpdater testModifierUpdater) {
        super(testModifierUpdater);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = testModifierUpdater.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public TestModifierUpdater(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException, RectF rectF) {
        super(subcomposeLayoutPausableCompositionException);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = rectF;
    }
}
