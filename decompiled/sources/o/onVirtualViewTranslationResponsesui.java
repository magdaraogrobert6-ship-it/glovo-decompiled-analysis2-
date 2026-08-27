package o;

/* JADX INFO: loaded from: classes.dex */
public final class onVirtualViewTranslationResponsesui extends BlurKt {
    public Object serializer;

    @Override // o.BlurKt
    public final BlurKt write(long j) {
        return new onVirtualViewTranslationResponsesui(getOffsetF1C5BW0.write().r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), this.serializer);
    }

    public onVirtualViewTranslationResponsesui(long j, Object obj) {
        super(j);
        this.serializer = obj;
    }

    @Override // o.BlurKt
    public final void RemoteActionCompatParcelizer(BlurKt blurKt) {
        blurKt.getClass();
        this.serializer = ((onVirtualViewTranslationResponsesui) blurKt).serializer;
    }
}
