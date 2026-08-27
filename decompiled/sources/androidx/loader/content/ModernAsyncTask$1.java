package androidx.loader.content;

import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import com.huawei.location.router.dispatch.DispatchBaseRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import o.KeyEvent_androidKt;
import o.LookaheadScopeKtdefaultPlacementApproachInProgress1;
import o.accessgetSemicoloncp;
import o.clearPreviouslyHitModifierNodeCache;
import o.getNativeFilterQuality;
import o.getRelativeuksYyKA;
import o.lookaheadScopeCoordinates;
import o.resetLayoutState;
import o.setApproachNode;
import o.toMotionEventScoped4ec7I;

/* JADX INFO: loaded from: classes.dex */
public final class ModernAsyncTask$1 implements Callable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public ModernAsyncTask$1(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, zzbg zzbgVar, String str) {
        this.IconCompatParcelizer = 8;
        this.serializer = lookaheadScopeKtdefaultPlacementApproachInProgress1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objSerializer = null;
        switch (this.IconCompatParcelizer) {
            case 0:
                getNativeFilterQuality getnativefilterquality = (getNativeFilterQuality) this.serializer;
                AtomicBoolean atomicBoolean = getnativefilterquality.serializer;
                getnativefilterquality.write.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        objSerializer = getnativefilterquality.MediaSessionCompatQueueItem.serializer();
                        break;
                    } catch (OperationCanceledException e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    getnativefilterquality.IconCompatParcelizer(objSerializer);
                    return objSerializer;
                } catch (Throwable th) {
                    try {
                        atomicBoolean.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        getnativefilterquality.IconCompatParcelizer(null);
                        throw th2;
                    }
                }
            case 1:
                ((Runnable) this.serializer).run();
                return null;
            case 2:
                synchronized (((getRelativeuksYyKA) this.serializer)) {
                    getRelativeuksYyKA getrelativeuksyyka = (getRelativeuksYyKA) this.serializer;
                    if (getrelativeuksyyka.MediaDescriptionCompat != null) {
                        getrelativeuksyyka.IconCompatParcelizer();
                        if (((getRelativeuksYyKA) this.serializer).serializer()) {
                            ((getRelativeuksYyKA) this.serializer).RemoteActionCompatParcelizer();
                            ((getRelativeuksYyKA) this.serializer).ParcelableVolumeInfo = 0;
                        }
                    }
                }
                return null;
            case 3:
                return accessgetSemicoloncp.read.IconCompatParcelizer(((clearPreviouslyHitModifierNodeCache) this.serializer).read);
            case 4:
                return accessgetSemicoloncp.read.IconCompatParcelizer(((toMotionEventScoped4ec7I) this.serializer).MediaMetadataCompat);
            case 5:
                return accessgetSemicoloncp.read.IconCompatParcelizer(((setApproachNode) this.serializer).MediaMetadataCompat);
            case 6:
                return accessgetSemicoloncp.read.IconCompatParcelizer(((resetLayoutState) this.serializer).MediaSessionCompatQueueItem);
            case 7:
                return new KeyEvent_androidKt(((lookaheadScopeCoordinates) this.serializer).write);
            case 8:
                LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) this.serializer;
                lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
                zzgz zzgzVar = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                zzpg.serializer(zzgzVar);
                zzgzVar.MediaSessionCompatToken();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                return Boolean.valueOf(((DispatchBaseRunnable) this.serializer).agcAuth());
        }
    }

    public /* synthetic */ ModernAsyncTask$1(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }
}
