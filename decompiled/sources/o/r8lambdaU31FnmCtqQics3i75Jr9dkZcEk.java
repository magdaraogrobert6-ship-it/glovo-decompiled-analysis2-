package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.tasks.zzw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.io.TextStreamsKt;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaU31FnmCtqQics3i75Jr9dkZcEk {
    public static r8lambdaU31FnmCtqQics3i75Jr9dkZcEk IconCompatParcelizer;
    public static HandlerThread RemoteActionCompatParcelizer;
    public static Handler serializer;
    public int MediaBrowserCompatMediaItem;
    public Object MediaMetadataCompat;
    public final Object read;
    public Object write;

    public static r8lambdaU31FnmCtqQics3i75Jr9dkZcEk write(Context context) {
        r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek;
        synchronized (r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new r8lambdaU31FnmCtqQics3i75Jr9dkZcEk(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new accessgetTvInputHdmi1cp("MessengerIpcClient"))));
            }
            r8lambdau31fnmctqqics3i75jr9dkzcek = IconCompatParcelizer;
        }
        return r8lambdau31fnmctqqics3i75jr9dkzcek;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void IconCompatParcelizer() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.MediaMetadataCompat
            o.r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r0 = (o.r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) r0
            o.r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk[] r1 = r0.write()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.write
            o.r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk r2 = (o.r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk) r2
            int r2 = r2.RatingCompat
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L69
            if (r2 <= 0) goto L69
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L67
            if (r2 <= 0) goto L67
            r8 = r1[r7]
            int r9 = r8.RatingCompat
            o.RegistryMissingComponentException r10 = r8.write
            long r11 = r10.size
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.RemoteActionCompatParcelizer
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.RemoteActionCompatParcelizer
            int r11 = r11 + r9
            r8.RemoteActionCompatParcelizer = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.RatingCompat
            long r10 = r10.size
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.RemoteActionCompatParcelizer
            int r9 = r9 - r10
            if (r9 <= 0) goto L64
            r1[r6] = r8
            int r6 = r6 + 1
        L64:
            int r7 = r7 + 1
            goto L26
        L67:
            r3 = r6
            goto L16
        L69:
            o.r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M r1 = new o.r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M
            r1.<init>()
            o.r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk[] r0 = r0.write()
            int r2 = r0.length
            r3 = r4
        L74:
            if (r3 >= r2) goto L82
            r5 = r0[r3]
            int r6 = r5.RemoteActionCompatParcelizer
            r5.serializer(r6, r1)
            r5.RemoteActionCompatParcelizer = r4
            int r3 = r3 + 1
            goto L74
        L82:
            int r0 = r1.IconCompatParcelizer
            if (r0 <= 0) goto L92
            java.lang.Object r0 = r13.read     // Catch: java.io.IOException -> L8e
            o.parseProperties r0 = (o.parseProperties) r0     // Catch: java.io.IOException -> L8e
            r0.serializer()     // Catch: java.io.IOException -> L8e
            return
        L8e:
            r0 = move-exception
            o.DrawableTransformation.read(r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.IconCompatParcelizer():void");
    }

    public void read(r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk r8lambdav2sqaxywfhzrw2q44hujvnmyqk, int i) {
        if (r8lambdav2sqaxywfhzrw2q44hujvnmyqk == null) {
            ((r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk) this.write).read(i);
            IconCompatParcelizer();
            return;
        }
        r8lambdav2sqaxywfhzrw2q44hujvnmyqk.read(i);
        r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M r8lambdawhxkhouvhbvdcjbbonyn9egki6m = new r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M();
        r8lambdav2sqaxywfhzrw2q44hujvnmyqk.serializer(Math.min(r8lambdav2sqaxywfhzrw2q44hujvnmyqk.RatingCompat, ((r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk) r8lambdav2sqaxywfhzrw2q44hujvnmyqk.MediaDescriptionCompat.write).RatingCompat), r8lambdawhxkhouvhbvdcjbbonyn9egki6m);
        if (r8lambdawhxkhouvhbvdcjbbonyn9egki6m.IconCompatParcelizer > 0) {
            try {
                ((parseProperties) this.read).serializer();
            } catch (IOException e) {
                DrawableTransformation.read((Throwable) e);
            }
        }
    }

    public void read(boolean z, r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk r8lambdav2sqaxywfhzrw2q44hujvnmyqk, RegistryMissingComponentException registryMissingComponentException, boolean z2) {
        TextStreamsKt.serializer(registryMissingComponentException, "source");
        int iMin = Math.min(r8lambdav2sqaxywfhzrw2q44hujvnmyqk.RatingCompat, ((r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk) r8lambdav2sqaxywfhzrw2q44hujvnmyqk.MediaDescriptionCompat.write).RatingCompat);
        RegistryMissingComponentException registryMissingComponentException2 = r8lambdav2sqaxywfhzrw2q44hujvnmyqk.write;
        boolean z3 = registryMissingComponentException2.size > 0;
        int i = (int) registryMissingComponentException.size;
        if (!z3 && iMin >= i) {
            r8lambdav2sqaxywfhzrw2q44hujvnmyqk.RemoteActionCompatParcelizer(i, registryMissingComponentException, z);
        } else {
            if (!z3 && iMin > 0) {
                r8lambdav2sqaxywfhzrw2q44hujvnmyqk.RemoteActionCompatParcelizer(iMin, registryMissingComponentException, false);
            }
            registryMissingComponentException2.write(registryMissingComponentException, (int) registryMissingComponentException.size);
            r8lambdav2sqaxywfhzrw2q44hujvnmyqk.read = z | r8lambdav2sqaxywfhzrw2q44hujvnmyqk.read;
        }
        if (z2) {
            try {
                ((parseProperties) this.read).serializer();
            } catch (IOException e) {
                DrawableTransformation.read((Throwable) e);
            }
        }
    }

    public zzw RemoteActionCompatParcelizer(accessgetNinecp accessgetninecp) {
        zzw zzwVar;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(accessgetninecp.toString());
            }
            if (!((zzp) this.write).serializer(accessgetninecp)) {
                zzp zzpVar = new zzp(this);
                this.write = zzpVar;
                zzpVar.serializer(accessgetninecp);
            }
            zzwVar = accessgetninecp.write.RemoteActionCompatParcelizer;
        }
        return zzwVar;
    }

    public r8lambdaU31FnmCtqQics3i75Jr9dkZcEk(int i) {
        this.MediaMetadataCompat = new SparseIntArray[9];
        this.read = new ArrayList();
        this.write = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = this.serializer;
                int i3 = r8lambdau31fnmctqqics3i75jr9dkzcek.MediaBrowserCompatMediaItem;
                if ((i3 & 1) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[0], frameMetrics.getMetric(8));
                }
                if ((i3 & 2) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[1], frameMetrics.getMetric(1));
                }
                if ((i3 & 4) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[2], frameMetrics.getMetric(3));
                }
                if ((i3 & 8) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[3], frameMetrics.getMetric(4));
                }
                if ((i3 & 16) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[4], frameMetrics.getMetric(5));
                }
                if ((i3 & 64) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[6], frameMetrics.getMetric(7));
                }
                if ((i3 & 32) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[5], frameMetrics.getMetric(6));
                }
                if ((i3 & Fields.SpotShadowColor) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[7], frameMetrics.getMetric(0));
                }
                if ((i3 & Fields.RotationX) != 0) {
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer(((SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat)[8], frameMetrics.getMetric(2));
                }
            }
        };
        this.MediaBrowserCompatMediaItem = i;
    }

    public static void serializer(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    public r8lambdaU31FnmCtqQics3i75Jr9dkZcEk(r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu, parseProperties parseproperties) {
        this.MediaMetadataCompat = r8lambda1dlenebwpksdsvf_xikspxtdeu;
        this.read = parseproperties;
        this.MediaBrowserCompatMediaItem = 65535;
        this.write = new r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk(this, 0, 65535, null);
    }

    public r8lambdaU31FnmCtqQics3i75Jr9dkZcEk(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.write = new zzp(this);
        this.MediaBrowserCompatMediaItem = 1;
        this.read = scheduledExecutorService;
        this.MediaMetadataCompat = context.getApplicationContext();
    }
}
