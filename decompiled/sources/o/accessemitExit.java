package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessemitExit extends ScrollState {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessemitExit(createnHHXs2Y createnhhxs2y) {
        super(createnhhxs2y.write);
        this.read = createnhhxs2y;
    }

    @Override // o.ScrollState
    public final Object read(int i) {
        int i2 = this.IconCompatParcelizer;
        Object obj = this.read;
        return i2 != 0 ? ((createnHHXs2Y) obj).serializer[i] : ((ImageKt) obj).IconCompatParcelizer(i);
    }

    @Override // o.ScrollState
    public final void serializer(int i) {
        int i2 = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i2 != 0) {
            ((createnHHXs2Y) obj).write(i);
        } else {
            ((ImageKt) obj).RemoteActionCompatParcelizer(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessemitExit(ImageKt imageKt) {
        super(imageKt.MediaMetadataCompat);
        this.read = imageKt;
    }
}
