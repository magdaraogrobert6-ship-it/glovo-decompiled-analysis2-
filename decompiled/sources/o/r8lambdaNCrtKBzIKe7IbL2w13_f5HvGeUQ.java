package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ {
    private final Object IconCompatParcelizer;
    private int MediaMetadataCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final migrateBlocklistedList<Integer> read;
    private final migrateBlocklistedList<Integer> serializer;
    private int write;

    public final void IconCompatParcelizer() {
        synchronized (this.IconCompatParcelizer) {
            if (this.serializer.get().intValue() > 0) {
                this.MediaMetadataCompat = Math.max(0, this.MediaMetadataCompat - 1);
                migrateBlocklistedList<Integer> migrateblocklistedlist = this.serializer;
                migrateblocklistedlist.set(Integer.valueOf(Math.max(0, migrateblocklistedlist.get().intValue() - 1)));
                if (this.serializer.get().intValue() == 0) {
                    synchronized (this.IconCompatParcelizer) {
                        this.IconCompatParcelizer.notifyAll();
                    }
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() throws InterruptedException {
        synchronized (this.IconCompatParcelizer) {
            while (this.serializer.get().intValue() == 0 && this.MediaMetadataCompat > 0) {
                synchronized (this.IconCompatParcelizer) {
                    this.IconCompatParcelizer.wait();
                }
            }
            this.write++;
            migrateBlocklistedList<Integer> migrateblocklistedlist = this.read;
            migrateblocklistedlist.set(Integer.valueOf(migrateblocklistedlist.get().intValue() + 1));
        }
    }

    public final void read() throws InterruptedException {
        synchronized (this.IconCompatParcelizer) {
            while (true) {
                boolean z = this.serializer.get().intValue() > 0;
                boolean z2 = this.write == this.read.get().intValue();
                if (z || z2) {
                    break;
                    break;
                } else if (this.write + this.MediaMetadataCompat > 0) {
                    synchronized (this.IconCompatParcelizer) {
                        this.IconCompatParcelizer.wait();
                    }
                }
            }
            this.MediaMetadataCompat++;
            migrateBlocklistedList<Integer> migrateblocklistedlist = this.serializer;
            migrateblocklistedlist.set(Integer.valueOf(migrateblocklistedlist.get().intValue() + 1));
        }
    }

    public final void serializer() {
        synchronized (this.IconCompatParcelizer) {
            if (this.read.get().intValue() > 0) {
                this.write = Math.max(0, this.write - 1);
                migrateBlocklistedList<Integer> migrateblocklistedlist = this.read;
                migrateblocklistedlist.set(Integer.valueOf(Math.max(0, migrateblocklistedlist.get().intValue() - 1)));
                synchronized (this.IconCompatParcelizer) {
                    this.IconCompatParcelizer.notifyAll();
                }
            }
        }
    }

    public final void IconCompatParcelizer(migrateEventDuplicationMaplambda1 migrateeventduplicationmaplambda1) {
        try {
            read();
            try {
                migrateeventduplicationmaplambda1.run();
            } finally {
                IconCompatParcelizer();
            }
        } catch (InterruptedException e) {
            parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
            if (parselonglambda0 != null) {
                parselonglambda0.IconCompatParcelizer(false, e, "Interrupted while waiting to lock for writing", new Object[0]);
            }
        }
    }

    public final Object read(Serializable serializable, migrateBlocklistedListslambda0 migrateblocklistedlistslambda0) {
        try {
            RemoteActionCompatParcelizer();
            try {
                return migrateblocklistedlistslambda0.A_();
            } finally {
                serializer();
            }
        } catch (InterruptedException e) {
            parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
            if (parselonglambda0 != null) {
                parselonglambda0.IconCompatParcelizer(false, e, "Interrupted while waiting to lock for reading", new Object[0]);
            }
            return serializable;
        }
    }

    public r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ(parseLonglambda0 parselonglambda0) {
        this.IconCompatParcelizer = new Object();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = new migrateBlocklistedList<>();
        this.serializer = new migrateBlocklistedList<>();
    }

    public r8lambdaNCrtKBzIKe7IbL2w13_f5HvGeUQ() {
        this(null);
    }
}
