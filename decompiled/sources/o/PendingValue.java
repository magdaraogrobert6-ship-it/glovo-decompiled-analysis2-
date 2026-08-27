package o;

import com.google.android.gms.stats.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class PendingValue implements DrawModifierNodeKt {
    public onDrawWithContent IconCompatParcelizer;
    public ArrayList MediaDescriptionCompat;
    public ArrayList RemoteActionCompatParcelizer;
    public final AtomicInteger read;
    public final boolean serializer;
    public final onDrawBehind write = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new androidx.camera.view.PendingValue(6, this));

    @Override // o.DrawModifierNodeKt
    public final void RemoteActionCompatParcelizer(Runnable runnable, Executor executor) {
        this.write.serializer.RemoteActionCompatParcelizer(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.write.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.write.serializer.isDone();
    }

    public PendingValue(ArrayList arrayList, boolean z, accessgetSubCompositionViewjd accessgetsubcompositionviewjd) {
        this.RemoteActionCompatParcelizer = arrayList;
        this.MediaDescriptionCompat = new ArrayList(arrayList.size());
        this.serializer = z;
        this.read = new AtomicInteger(arrayList.size());
        RemoteActionCompatParcelizer(new zza(9, this), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(new ArrayList(this.MediaDescriptionCompat));
            return;
        }
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            this.MediaDescriptionCompat.add(null);
        }
        ArrayList arrayList2 = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            DrawModifierNodeKt drawModifierNodeKt = (DrawModifierNodeKt) arrayList2.get(i2);
            drawModifierNodeKt.RemoteActionCompatParcelizer(new androidx.recyclerview.widget.ItemTouchHelper.AnonymousClass4(this, i2, drawModifierNodeKt), accessgetsubcompositionviewjd);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DrawModifierNodeKt) it.next()).cancel(z);
            }
        }
        return this.write.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<DrawModifierNodeKt> arrayList = this.RemoteActionCompatParcelizer;
        if (arrayList != null && !isDone()) {
            loop0: for (DrawModifierNodeKt drawModifierNodeKt : arrayList) {
                while (!drawModifierNodeKt.isDone()) {
                    try {
                        drawModifierNodeKt.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.serializer) {
                            return (List) this.write.serializer.get();
                        }
                    }
                }
            }
        }
        return (List) this.write.serializer.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.write.serializer.get(j, timeUnit);
    }
}
