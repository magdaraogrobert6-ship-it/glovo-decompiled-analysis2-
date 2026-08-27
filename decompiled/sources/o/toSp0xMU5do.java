package o;

/* JADX INFO: loaded from: classes.dex */
public final class toSp0xMU5do extends toDpu2uoSUM {
    public toPxR2X_6o getLifecycle;
    public PainterModifierKt getOnBackPressedDispatcher;
    public int getViewModelStore;

    public toSp0xMU5do(drawBehind drawbehind) {
        super(drawbehind, toRect.BARRIER);
    }

    @Override // o.accesstoSizeXkaWNTQjd
    public final accesstoSizeXkaWNTQjd IconCompatParcelizer(Float f) {
        this.getViewModelStore = this.getLastCustomNonConfigurationInstance.read(f);
        return this;
    }

    @Override // o.toDpu2uoSUM, o.accesstoSizeXkaWNTQjd, o.toPx0680j_4, o.InnerShadowScope
    public final void read() {
        MediaDescriptionCompat();
        int i = component6.read[this.getLifecycle.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        PainterModifierKt painterModifierKt = this.getOnBackPressedDispatcher;
        painterModifierKt.write = i2;
        painterModifierKt.IconCompatParcelizer = this.getViewModelStore;
    }

    @Override // o.toDpu2uoSUM
    public final setPainter MediaDescriptionCompat() {
        if (this.getOnBackPressedDispatcher == null) {
            this.getOnBackPressedDispatcher = new PainterModifierKt();
        }
        return this.getOnBackPressedDispatcher;
    }

    @Override // o.accesstoSizeXkaWNTQjd
    public final accesstoSizeXkaWNTQjd serializer(int i) {
        this.getViewModelStore = i;
        return this;
    }
}
