package o;

import com.huawei.hmf.tasks.a.d$a;
import io.grpc.Status;
import io.grpc.internal.DelayedStream$3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public class isValidLogPurchaseInput implements r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 {
    public volatile boolean MediaDescriptionCompat;
    public r8lambda6LGSESzBuanebUADYycWZpXP5Kw MediaSessionCompatQueueItem;
    public r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 MediaSessionCompatResultReceiverWrapper;
    public long ParcelableVolumeInfo;
    public long PlaybackStateCompat;
    public Status RatingCompat;
    public isValidLogPurchaseInputlambda0 RemoteActionCompatParcelizer;
    public List MediaBrowserCompatMediaItem = new ArrayList();
    public ArrayList MediaMetadataCompat = new ArrayList();

    public final isValidLogPurchaseInputlambda2 IconCompatParcelizer(r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0) {
        synchronized (this) {
            if (this.MediaSessionCompatResultReceiverWrapper != null) {
                return null;
            }
            TextStreamsKt.serializer(r8lambda7hj8zhiew8owwyp0e05lxeu0sn0, "stream");
            r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn1 = this.MediaSessionCompatResultReceiverWrapper;
            TextStreamsKt.IconCompatParcelizer("realStream already set to %s", r8lambda7hj8zhiew8owwyp0e05lxeu0sn1, r8lambda7hj8zhiew8owwyp0e05lxeu0sn1 == null);
            this.MediaSessionCompatResultReceiverWrapper = r8lambda7hj8zhiew8owwyp0e05lxeu0sn0;
            this.ParcelableVolumeInfo = System.nanoTime();
            r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw = this.MediaSessionCompatQueueItem;
            if (r8lambda6lgseszbuanebuadyycwzpxp5kw == null) {
                this.MediaBrowserCompatMediaItem = null;
                this.MediaDescriptionCompat = true;
            }
            if (r8lambda6lgseszbuanebuadyycwzpxp5kw == null) {
                return null;
            }
            IconCompatParcelizer(r8lambda6lgseszbuanebuadyycwzpxp5kw);
            return new isValidLogPurchaseInputlambda2(this, 0);
        }
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public void serializer(applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0) {
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem == null) {
                return;
            }
            if (this.MediaSessionCompatResultReceiverWrapper != null) {
                applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(Long.valueOf(this.ParcelableVolumeInfo - this.PlaybackStateCompat), "buffered_nanos");
                this.MediaSessionCompatResultReceiverWrapper.serializer(applydisplaycutoutmarginstocontentarealambda0);
            } else {
                applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(Long.valueOf(System.nanoTime() - this.PlaybackStateCompat), "buffered_nanos");
                applydisplaycutoutmarginstocontentarealambda0.write.add("waiting_for_connection");
            }
        }
    }

    public void write(Status status) {
    }

    public final void IconCompatParcelizer(r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw) {
        Iterator it = this.MediaMetadataCompat.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.MediaMetadataCompat = null;
        this.MediaSessionCompatResultReceiverWrapper.read(r8lambda6lgseszbuanebuadyycwzpxp5kw);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:16:0x002d, B:17:0x0031), top: B:37:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[LOOP:3: B:19:0x0036->B:21:0x003c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RemoteActionCompatParcelizer() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.MediaBrowserCompatMediaItem     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.MediaBrowserCompatMediaItem = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.MediaDescriptionCompat = r1     // Catch: java.lang.Throwable -> L6d
            o.isValidLogPurchaseInputlambda0 r2 = r6.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.IconCompatParcelizer     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.IconCompatParcelizer = r0     // Catch: java.lang.Throwable -> L4b
            r2.serializer = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.IconCompatParcelizer     // Catch: java.lang.Throwable -> L4b
            r2.IconCompatParcelizer = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.MediaBrowserCompatMediaItem     // Catch: java.lang.Throwable -> L6d
            r6.MediaBrowserCompatMediaItem = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isValidLogPurchaseInput.RemoteActionCompatParcelizer():void");
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void read(r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw) {
        Status status;
        boolean z;
        TextStreamsKt.serializer(r8lambda6lgseszbuanebuadyycwzpxp5kw, "listener");
        TextStreamsKt.RemoteActionCompatParcelizer("already started", this.MediaSessionCompatQueueItem == null);
        synchronized (this) {
            status = this.RatingCompat;
            z = this.MediaDescriptionCompat;
            if (!z) {
                isValidLogPurchaseInputlambda0 isvalidlogpurchaseinputlambda0 = new isValidLogPurchaseInputlambda0(r8lambda6lgseszbuanebuadyycwzpxp5kw);
                this.RemoteActionCompatParcelizer = isvalidlogpurchaseinputlambda0;
                r8lambda6lgseszbuanebuadyycwzpxp5kw = isvalidlogpurchaseinputlambda0;
            }
            this.MediaSessionCompatQueueItem = r8lambda6lgseszbuanebuadyycwzpxp5kw;
            this.PlaybackStateCompat = System.nanoTime();
        }
        if (status != null) {
            r8lambda6lgseszbuanebuadyycwzpxp5kw.serializer(status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED, new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
        } else if (z) {
            IconCompatParcelizer(r8lambda6lgseszbuanebuadyycwzpxp5kw);
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final boolean IconCompatParcelizer() {
        if (this.MediaDescriptionCompat) {
            return this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        }
        return false;
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void IconCompatParcelizer(int i) {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called before start", this.MediaSessionCompatQueueItem == null);
        this.MediaMetadataCompat.add(new isValidLogCustomEventInputlambda1(this, i, 0));
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void IconCompatParcelizer(r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks) {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called before start", this.MediaSessionCompatQueueItem == null);
        this.MediaMetadataCompat.add(new DelayedStream$3(this, 4, r8lambdakctilwmporjfcawe8asdqv1ks));
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void RemoteActionCompatParcelizer(setDateOfBirthlambda3 setdateofbirthlambda3) {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called after start", this.MediaSessionCompatQueueItem != null);
        if (this.MediaDescriptionCompat) {
            this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(setdateofbirthlambda3);
        } else {
            serializer(new DelayedStream$3(this, 6, setdateofbirthlambda3));
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void read() {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called after start", this.MediaSessionCompatQueueItem != null);
        if (this.MediaDescriptionCompat) {
            this.MediaSessionCompatResultReceiverWrapper.read();
        } else {
            serializer(new isValidLogPurchaseInputlambda2(this, 1));
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void read(int i) {
        int i2 = 0;
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called after start", this.MediaSessionCompatQueueItem != null);
        if (this.MediaDescriptionCompat) {
            this.MediaSessionCompatResultReceiverWrapper.read(i);
        } else {
            serializer(new isValidLocation(this, i, i2));
        }
    }

    @Override // o.r8lambdaEKS7drosSRUhlcITQHj1EhhETxk
    public final void serializer() {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called before start", this.MediaSessionCompatQueueItem == null);
        this.MediaMetadataCompat.add(new isAutomaticGeofenceRequestsEnabled(7, this));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(int i) {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called before start", this.MediaSessionCompatQueueItem == null);
        this.MediaMetadataCompat.add(new isValidLogCustomEventInputlambda1(this, i, 1));
    }

    public final void serializer(Runnable runnable) {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called after start", this.MediaSessionCompatQueueItem != null);
        synchronized (this) {
            if (this.MediaDescriptionCompat) {
                runnable.run();
            } else {
                this.MediaBrowserCompatMediaItem.add(runnable);
            }
        }
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs r8lambda5t3l_1jntlbjtf0fr47kg54a0bs) {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called before start", this.MediaSessionCompatQueueItem == null);
        TextStreamsKt.serializer(r8lambda5t3l_1jntlbjtf0fr47kg54a0bs, "decompressorRegistry");
        this.MediaMetadataCompat.add(new DelayedStream$3(this, 5, r8lambda5t3l_1jntlbjtf0fr47kg54a0bs));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void write() {
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called after start", this.MediaSessionCompatQueueItem != null);
        serializer(new isValidLogPurchaseInputlambda2(this, 2));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty) {
        int i = 0;
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called before start", this.MediaSessionCompatQueueItem == null);
        this.MediaMetadataCompat.add(new DelayedStream$3(this, i, r8lambda9bwhxitij38r9epvsmivfryty));
    }

    @Override // o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public void RemoteActionCompatParcelizer(Status status) {
        boolean z = false;
        boolean z2 = true;
        TextStreamsKt.RemoteActionCompatParcelizer("May only be called after start", this.MediaSessionCompatQueueItem != null);
        TextStreamsKt.serializer(status, "reason");
        synchronized (this) {
            r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 = this.MediaSessionCompatResultReceiverWrapper;
            if (r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 == null) {
                r8lambdaS3t9TQB6FrQYP7LA1iCU5SLIOl8 r8lambdas3t9tqb6frqyp7la1icu5sliol8 = r8lambdaS3t9TQB6FrQYP7LA1iCU5SLIOl8.RemoteActionCompatParcelizer;
                if (r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 != null) {
                    z2 = false;
                }
                TextStreamsKt.IconCompatParcelizer("realStream already set to %s", r8lambda7hj8zhiew8owwyp0e05lxeu0sn0, z2);
                this.MediaSessionCompatResultReceiverWrapper = r8lambdas3t9tqb6frqyp7la1icu5sliol8;
                this.ParcelableVolumeInfo = System.nanoTime();
                this.RatingCompat = status;
            } else {
                z = true;
            }
        }
        if (z) {
            serializer(new d$a(this, 10, status));
            return;
        }
        RemoteActionCompatParcelizer();
        write(status);
        this.MediaSessionCompatQueueItem.serializer(status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED, new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
    }
}
