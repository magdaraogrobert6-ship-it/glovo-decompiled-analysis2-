package o;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzoo;
import io.grpc.SynchronizationContext$1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasuringIntrinsicsEmptyPlaceable implements Runnable {
    public final /* synthetic */ NoWindowInsetsAnimation read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ AtomicReference write;

    private final void write() {
        AtomicReference atomicReference = this.write;
        synchronized (atomicReference) {
            try {
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                atomicReference.set(Double.valueOf(lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.IconCompatParcelizer(lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper(), premeasure0kLqBqw.addOnUserLeaveHintListener)));
                this.write.notify();
            } catch (Throwable th) {
                this.write.notify();
                throw th;
            }
        }
    }

    public MeasuringIntrinsicsEmptyPlaceable(NoWindowInsetsAnimation noWindowInsetsAnimation, AtomicReference atomicReference, int i) {
        this.serializer = i;
        if (i == 1) {
            this.write = atomicReference;
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.read = noWindowInsetsAnimation;
            return;
        }
        if (i == 2) {
            this.write = atomicReference;
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.read = noWindowInsetsAnimation;
            return;
        }
        if (i == 3) {
            this.write = atomicReference;
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.read = noWindowInsetsAnimation;
        } else if (i == 4) {
            this.write = atomicReference;
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.read = noWindowInsetsAnimation;
        } else if (i != 5) {
            this.write = atomicReference;
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.read = noWindowInsetsAnimation;
        } else {
            this.write = atomicReference;
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.read = noWindowInsetsAnimation;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.serializer) {
            case 0:
                AtomicReference atomicReference = this.write;
                synchronized (atomicReference) {
                    try {
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        atomicReference.set(Boolean.valueOf(lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper(), premeasure0kLqBqw.addMenuProvider)));
                        this.write.notify();
                    } catch (Throwable th) {
                        this.write.notify();
                        throw th;
                    }
                }
                return;
            case 1:
                setViewportBounds setviewportboundsMediaDescriptionCompat = ((LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat();
                AtomicReference atomicReference2 = this.write;
                setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
                setviewportboundsMediaDescriptionCompat.serializer();
                setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new SynchronizationContext$1(10, setviewportboundsMediaDescriptionCompat, atomicReference2, setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(false), false));
                return;
            case 2:
                AtomicReference atomicReference3 = this.write;
                synchronized (atomicReference3) {
                    try {
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        atomicReference3.set(lookaheadScopeKtLookaheadScope222.PlaybackStateCompat.read(lookaheadScopeKtLookaheadScope222.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper(), premeasure0kLqBqw.addOnContextAvailableListener));
                        this.write.notify();
                    } catch (Throwable th2) {
                        this.write.notify();
                        throw th2;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.write;
                synchronized (atomicReference4) {
                    try {
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        atomicReference4.set(Long.valueOf(lookaheadScopeKtLookaheadScope223.PlaybackStateCompat.RemoteActionCompatParcelizer(lookaheadScopeKtLookaheadScope223.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper(), premeasure0kLqBqw.addOnNewIntentListener)));
                        this.write.notify();
                    } catch (Throwable th3) {
                        this.write.notify();
                        throw th3;
                    }
                }
                return;
            case 4:
                AtomicReference atomicReference5 = this.write;
                synchronized (atomicReference5) {
                    try {
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        atomicReference5.set(Integer.valueOf(lookaheadScopeKtLookaheadScope224.PlaybackStateCompat.serializer(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper(), premeasure0kLqBqw.addOnTrimMemoryListener)));
                        this.write.notify();
                    } catch (Throwable th4) {
                        this.write.notify();
                        throw th4;
                    }
                }
                return;
            case 5:
                write();
                return;
            case 6:
                NoWindowInsetsAnimation noWindowInsetsAnimation = this.read;
                LookaheadScopeKt lookaheadScopeKt = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                Bundle bundleSerializer = lookaheadScopeKt.MediaBrowserCompatMediaItem.serializer();
                setViewportBounds setviewportboundsMediaDescriptionCompat2 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat();
                AtomicReference atomicReference6 = this.write;
                setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
                setviewportboundsMediaDescriptionCompat2.serializer();
                setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer((Runnable) new ImageVectorCacheImageVectorEntry(13, setviewportboundsMediaDescriptionCompat2, atomicReference6, setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer(false), bundleSerializer, false));
                return;
            default:
                setViewportBounds setviewportboundsMediaDescriptionCompat3 = ((LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat();
                zzoo zzooVarWrite = zzoo.write(OnFirstVisibleModifierKt.SGTM_CLIENT);
                AtomicReference atomicReference7 = this.write;
                setviewportboundsMediaDescriptionCompat3.MediaSessionCompatToken();
                setviewportboundsMediaDescriptionCompat3.serializer();
                setviewportboundsMediaDescriptionCompat3.RemoteActionCompatParcelizer((Runnable) new ImageVectorCacheImageVectorEntry(14, setviewportboundsMediaDescriptionCompat3, atomicReference7, setviewportboundsMediaDescriptionCompat3.RemoteActionCompatParcelizer(false), zzooVarWrite, false));
                return;
        }
    }

    public /* synthetic */ MeasuringIntrinsicsEmptyPlaceable(NoWindowInsetsAnimation noWindowInsetsAnimation, AtomicReference atomicReference, int i, boolean z) {
        this.serializer = i;
        this.read = noWindowInsetsAnimation;
        this.write = atomicReference;
    }
}
