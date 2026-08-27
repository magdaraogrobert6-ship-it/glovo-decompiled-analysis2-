package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ToolbarSavedState extends getTitleTextView {
    public final int MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final Toolbar4[] write;

    @Override // o.getTitleTextView, o.getInflatedId
    public final Toolbar4[] IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.getTitleTextView, o.getInflatedId
    public final int RatingCompat() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.getTitleTextView, o.getInflatedId
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public ToolbarSavedState(getInflatedId getinflatedid, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(getinflatedid);
        this.write = new Toolbar4[]{new getLayoutInflater(i, byteBuffer), new getLayoutInflater(byteBuffer2, i), new getLayoutInflater(byteBuffer3, i)};
        this.MediaSessionCompatQueueItem = i;
        this.RemoteActionCompatParcelizer = i2;
    }
}
