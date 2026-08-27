package o;

import android.util.Log;
import androidx.camera.video.Recorder$3;
import coil3.disk.DiskLruCache$Editor;
import com.google.android.gms.measurement.internal.zzpg;
import com.huawei.hmf.tasks.a.i$d;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OnGloballyPositionedModifierDefaultImpls implements getY {
    public Object IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public void read(visitNodes visitnodes) {
        serializer(visitnodes);
    }

    public getRelativeuksYyKA write() {
        getRelativeuksYyKA getrelativeuksyyka;
        synchronized (this) {
            if (((getRelativeuksYyKA) this.serializer) == null) {
                this.serializer = getRelativeuksYyKA.RemoteActionCompatParcelizer((File) this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
            }
            getrelativeuksyyka = (getRelativeuksYyKA) this.serializer;
        }
        return getrelativeuksyyka;
    }

    public static OnGloballyPositionedModifierDefaultImpls IconCompatParcelizer(File file) {
        OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls = new OnGloballyPositionedModifierDefaultImpls();
        onGloballyPositionedModifierDefaultImpls.write = new Recorder$3();
        onGloballyPositionedModifierDefaultImpls.IconCompatParcelizer = file;
        onGloballyPositionedModifierDefaultImpls.RemoteActionCompatParcelizer = 262144000L;
        onGloballyPositionedModifierDefaultImpls.read = new i$d(12);
        return onGloballyPositionedModifierDefaultImpls;
    }

    @Override // o.getY
    public File RemoteActionCompatParcelizer(eotfFunclambda0 eotffunclambda0) {
        String str = ((i$d) this.read).read(eotffunclambda0);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(eotffunclambda0);
        }
        try {
            getExponentimpl getexponentimplIconCompatParcelizer = write().IconCompatParcelizer(str);
            if (getexponentimplIconCompatParcelizer != null) {
                return ((File[]) getexponentimplIconCompatParcelizer.read)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            SentryLogcatAdapter.write("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public void serializer(visitNodes visitnodes) {
        ((headH91voCI) this.read).IconCompatParcelizer("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", updateLayerParameters.write(visitnodes.RemoteActionCompatParcelizer), Long.valueOf(IconCompatParcelizer()));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cd A[RETURN] */
    public boolean serializer(long j, getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq) {
        int size;
        if (((ArrayList) this.write) == null) {
            this.write = new ArrayList();
        }
        if (((ArrayList) this.IconCompatParcelizer) == null) {
            this.IconCompatParcelizer = new ArrayList();
        }
        if (((ArrayList) this.write).isEmpty() || ((((getTvTerrestrialDigitalEK5gGoQ) ((ArrayList) this.write).get(0)).MediaMetadataCompat() / 1000) / 60) / 60 == ((gettvterrestrialdigitalek5ggoq.MediaMetadataCompat() / 1000) / 60) / 60) {
            long lifecycleRegistry1 = this.RemoteActionCompatParcelizer + ((long) gettvterrestrialdigitalek5ggoq.getLifecycleRegistry1());
            zzpg zzpgVar = (zzpg) this.serializer;
            if (!zzpgVar.MediaDescriptionCompat().write(null, premeasure0kLqBqw.onRequestPermissionsResult)) {
                zzpgVar.MediaDescriptionCompat();
                if (lifecycleRegistry1 < Math.max(0, ((Integer) premeasure0kLqBqw.removeOnNewIntentListener.IconCompatParcelizer(null)).intValue())) {
                    this.RemoteActionCompatParcelizer = lifecycleRegistry1;
                    ((ArrayList) this.write).add(gettvterrestrialdigitalek5ggoq);
                    ((ArrayList) this.IconCompatParcelizer).add(Long.valueOf(j));
                    size = ((ArrayList) this.write).size();
                    zzpgVar.MediaDescriptionCompat();
                    if (size < Math.max(1, ((Integer) premeasure0kLqBqw.removeOnMultiWindowModeChangedListener.IconCompatParcelizer(null)).intValue())) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.write).isEmpty()) {
                this.RemoteActionCompatParcelizer = lifecycleRegistry1;
                ((ArrayList) this.write).add(gettvterrestrialdigitalek5ggoq);
                ((ArrayList) this.IconCompatParcelizer).add(Long.valueOf(j));
                size = ((ArrayList) this.write).size();
                zzpgVar.MediaDescriptionCompat();
                if (size < Math.max(1, ((Integer) premeasure0kLqBqw.removeOnMultiWindowModeChangedListener.IconCompatParcelizer(null)).intValue())) {
                    return true;
                }
            } else {
                zzpgVar.MediaDescriptionCompat();
                if (lifecycleRegistry1 < Math.max(0, ((Integer) premeasure0kLqBqw.removeOnNewIntentListener.IconCompatParcelizer(null)).intValue())) {
                    this.RemoteActionCompatParcelizer = lifecycleRegistry1;
                    ((ArrayList) this.write).add(gettvterrestrialdigitalek5ggoq);
                    ((ArrayList) this.IconCompatParcelizer).add(Long.valueOf(j));
                    size = ((ArrayList) this.write).size();
                    zzpgVar.MediaDescriptionCompat();
                    if (size < Math.max(1, ((Integer) premeasure0kLqBqw.removeOnMultiWindowModeChangedListener.IconCompatParcelizer(null)).intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // o.getY
    public void write(eotfFunclambda0 eotffunclambda0, androidx.navigation.NavArgsLazy navArgsLazy) {
        getX getx;
        String str = ((i$d) this.read).read(eotffunclambda0);
        Recorder$3 recorder$3 = (Recorder$3) this.write;
        synchronized (recorder$3) {
            getx = (getX) ((HashMap) recorder$3.MediaBrowserCompatMediaItem).get(str);
            if (getx == null) {
                component27NrFUSI component27nrfusi = (component27NrFUSI) recorder$3.RemoteActionCompatParcelizer;
                synchronized (component27nrfusi.RemoteActionCompatParcelizer) {
                    getx = (getX) component27nrfusi.RemoteActionCompatParcelizer.poll();
                }
                if (getx == null) {
                    getx = new getX();
                }
                ((HashMap) recorder$3.MediaBrowserCompatMediaItem).put(str, getx);
            }
            getx.RemoteActionCompatParcelizer++;
        }
        getx.read.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(eotffunclambda0);
            }
            try {
                getRelativeuksYyKA getrelativeuksyykaWrite = write();
                if (getrelativeuksyykaWrite.IconCompatParcelizer(str) == null) {
                    DiskLruCache$Editor diskLruCache$EditorWrite = getrelativeuksyykaWrite.write(str);
                    if (diskLruCache$EditorWrite == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(str));
                    }
                    try {
                        if (((r8lambdayrUYrLf4y8jALbFcm2n28OpawQ) navArgsLazy.MediaSessionCompatQueueItem).IconCompatParcelizer(navArgsLazy.read, diskLruCache$EditorWrite.read(), (getEotfFuncui_graphics) navArgsLazy.RatingCompat)) {
                            getRelativeuksYyKA.IconCompatParcelizer((getRelativeuksYyKA) diskLruCache$EditorWrite.serializer, diskLruCache$EditorWrite, true);
                            diskLruCache$EditorWrite.read = true;
                        }
                        if (!diskLruCache$EditorWrite.read) {
                            try {
                                diskLruCache$EditorWrite.serializer();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!diskLruCache$EditorWrite.read) {
                            try {
                                diskLruCache$EditorWrite.serializer();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    SentryLogcatAdapter.write("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            ((Recorder$3) this.write).write(str);
        } catch (Throwable th2) {
            ((Recorder$3) this.write).write(str);
            throw th2;
        }
    }

    public /* synthetic */ OnGloballyPositionedModifierDefaultImpls(zzpg zzpgVar) {
        this.serializer = zzpgVar;
    }

    public long IconCompatParcelizer() {
        getRectManager.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.RemoteActionCompatParcelizer;
    }

    public OnGloballyPositionedModifierDefaultImpls() {
    }
}
