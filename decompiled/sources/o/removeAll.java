package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class removeAll extends SubcomposeSlotReusePolicy {
    public static final /* synthetic */ int serializer = 0;
    public TestModifierUpdater read;

    @Override // o.SubcomposeSlotReusePolicy
    public final void IconCompatParcelizer(android.graphics.Canvas canvas) {
        if (this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.isEmpty()) {
            super.IconCompatParcelizer(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        super.IconCompatParcelizer(canvas);
        canvas.restore();
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.read = new TestModifierUpdater(this.read);
        return this;
    }

    public final void serializer(float f, float f2, float f3, float f4) {
        RectF rectF = this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public removeAll(accessgetReusedSlotIdp accessgetreusedslotidp) {
        super(accessgetreusedslotidp);
    }
}
