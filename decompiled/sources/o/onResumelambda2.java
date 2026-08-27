package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class onResumelambda2 {
    private final r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk IconCompatParcelizer;
    private final r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM RemoteActionCompatParcelizer;
    private final r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM read;
    private final r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM serializer;
    private byte write;

    public final r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM MediaMetadataCompat() {
        return this.serializer;
    }

    public final r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM read() {
        return this.read;
    }

    public final byte serializer() {
        return this.write;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer.size();
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.IconCompatParcelizer.isEmpty();
    }

    public final void RemoteActionCompatParcelizer(r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfk, List<List<Integer>> list) {
        this.IconCompatParcelizer.addAll(r8lambdak_msz2dnanoyi5bwwe2hzkactfk);
        this.read.addAll(list.get(0));
        this.RemoteActionCompatParcelizer.addAll(list.get(1));
        this.serializer.addAll(list.get(2));
    }

    public onResumelambda2() {
        this.IconCompatParcelizer = new r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk();
        this.read = new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM();
        this.RemoteActionCompatParcelizer = new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM();
        this.serializer = new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM();
    }

    public onResumelambda2(byte b) {
        this();
        this.write = b;
    }

    public final void read(onResumelambda2 onresumelambda2) {
        this.IconCompatParcelizer.addAll(onresumelambda2.IconCompatParcelizer);
        this.read.addAll(onresumelambda2.read);
        this.RemoteActionCompatParcelizer.addAll(onresumelambda2.RemoteActionCompatParcelizer);
        this.serializer.addAll(onresumelambda2.serializer);
    }

    public final void write() {
        this.IconCompatParcelizer.clear();
        this.read.clear();
        this.RemoteActionCompatParcelizer.clear();
        this.serializer.clear();
    }

    public final void RemoteActionCompatParcelizer(byte b) {
        this.write = b;
    }
}
