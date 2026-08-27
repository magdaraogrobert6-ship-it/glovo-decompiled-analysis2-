package o;

/* JADX INFO: loaded from: classes.dex */
public final class BlockInnerShadowNode extends BlurKt {
    public int RemoteActionCompatParcelizer;
    public accesssetThisDragAndDropTargetp read;
    public int write;

    @Override // o.BlurKt
    public final void RemoteActionCompatParcelizer(BlurKt blurKt) {
        synchronized (androidx.compose.runtime.snapshots.SnapshotStateListKt.write) {
            blurKt.getClass();
            this.read = ((BlockInnerShadowNode) blurKt).read;
            this.RemoteActionCompatParcelizer = ((BlockInnerShadowNode) blurKt).RemoteActionCompatParcelizer;
            this.write = ((BlockInnerShadowNode) blurKt).write;
        }
    }

    @Override // o.BlurKt
    public final BlurKt write(long j) {
        return new BlockInnerShadowNode(j, this.read);
    }

    public BlockInnerShadowNode(long j, accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp) {
        super(j);
        this.read = accesssetthisdraganddroptargetp;
    }
}
