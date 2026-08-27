package o;

/* JADX INFO: loaded from: classes.dex */
public final class MutatorMutexmutate2 extends ScrollState {
    public final /* synthetic */ ImageKt serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutexmutate2(ImageKt imageKt) {
        super(imageKt.MediaMetadataCompat);
        this.serializer = imageKt;
    }

    @Override // o.ScrollState
    public final Object read(int i) {
        return this.serializer.write(i);
    }

    @Override // o.ScrollState
    public final void serializer(int i) {
        this.serializer.RemoteActionCompatParcelizer(i);
    }
}
