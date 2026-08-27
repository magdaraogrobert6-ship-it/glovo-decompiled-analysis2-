package o;

import android.os.Bundle;
import android.os.SystemClock;
import coil3.Extras$Key;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class registerOnLayoutRectChanged extends OnPlacedModifierKt {
    public final LookaheadScopeKtLookaheadScope221 RemoteActionCompatParcelizer;
    public final NoWindowInsetsAnimation write;

    @Override // o.MultiContentMeasurePolicyKt
    public final String IconCompatParcelizer() {
        OnFirstVisibleNode onFirstVisibleNode = ((LookaheadScopeKtLookaheadScope221) this.write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        getViewportBounds getviewportbounds = onFirstVisibleNode.IconCompatParcelizer;
        if (getviewportbounds != null) {
            return getviewportbounds.read;
        }
        return null;
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void IconCompatParcelizer(String str, String str2, Bundle bundle) {
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        noWindowInsetsAnimation.RemoteActionCompatParcelizer(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // o.OnPlacedModifierKt
    public final Map MediaDescriptionCompat() {
        List<zzpl> list;
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        noWindowInsetsAnimation.serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        zzgs zzgsVar = getlookaheaddelegate.serializer;
        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Getting user properties (FE)");
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        if (lookaheadScopeKtLookaheadScope4.MediaMetadataCompat()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgsVar.RemoteActionCompatParcelizer("Cannot get all user properties from analytics worker thread");
            list = Collections.EMPTY_LIST;
        } else if (accessgetWcp.read()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgsVar.RemoteActionCompatParcelizer("Cannot get all user properties from main thread");
            list = Collections.EMPTY_LIST;
        } else {
            AtomicReference atomicReference = new AtomicReference();
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write(atomicReference, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, "get user properties", new MeasuringIntrinsicsEmptyPlaceable(noWindowInsetsAnimation, atomicReference, 1));
            list = (List) atomicReference.get();
            if (list == null) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgsVar.serializer(Boolean.TRUE, "Timed out waiting for get user properties, includeInternal");
                list = Collections.EMPTY_LIST;
            }
        }
        ImageKt imageKt = new ImageKt(list.size());
        for (zzpl zzplVar : list) {
            Object objIconCompatParcelizer = zzplVar.IconCompatParcelizer();
            if (objIconCompatParcelizer != null) {
                imageKt.put(zzplVar.write, objIconCompatParcelizer);
            }
        }
        return imageKt;
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final int RemoteActionCompatParcelizer(String str) {
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        noWindowInsetsAnimation.getClass();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        return 25;
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final String RemoteActionCompatParcelizer() {
        OnFirstVisibleNode onFirstVisibleNode = ((LookaheadScopeKtLookaheadScope221) this.write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        getViewportBounds getviewportbounds = onFirstVisibleNode.IconCompatParcelizer;
        if (getviewportbounds != null) {
            return getviewportbounds.write;
        }
        return null;
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final List RemoteActionCompatParcelizer(String str, String str2) {
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        if (lookaheadScopeKtLookaheadScope4.MediaMetadataCompat()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (accessgetWcp.read()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
        lookaheadScopeKtLookaheadScope5.write(atomicReference, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, "get conditional user properties", new ImageVectorCacheImageVectorEntry(noWindowInsetsAnimation, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return onLayoutRectChangeddefault.write(list);
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.serializer.serializer(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void RemoteActionCompatParcelizer(Extras$Key extras$Key) {
        this.write.write((MeasureScopeMarker) extras$Key);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void RemoteActionCompatParcelizer(OnSizeChangedNode onSizeChangedNode) {
        this.write.IconCompatParcelizer((minWidth) onSizeChangedNode);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final long read() {
        onLayoutRectChangeddefault onlayoutrectchangeddefault = this.RemoteActionCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        return onlayoutrectchangeddefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final Map read(String str, String str2, boolean z) {
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        if (lookaheadScopeKtLookaheadScope4.MediaMetadataCompat()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (accessgetWcp.read()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
        lookaheadScopeKtLookaheadScope5.write(atomicReference, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, "get user properties", new maxWidth(noWindowInsetsAnimation, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ImageKt imageKt = new ImageKt(list.size());
        for (zzpl zzplVar : list) {
            Object objIconCompatParcelizer = zzplVar.IconCompatParcelizer();
            if (objIconCompatParcelizer != null) {
                imageKt.put(zzplVar.write, objIconCompatParcelizer);
            }
        }
        return imageKt;
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void read(String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = this.RemoteActionCompatParcelizer;
        getHasPremeasured gethaspremeasured = lookaheadScopeKtLookaheadScope221.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        LookaheadScopeKtLookaheadScope221.write(gethaspremeasured);
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        gethaspremeasured.write(SystemClock.elapsedRealtime(), str);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final String serializer() {
        return (String) this.write.MediaMetadataCompat.get();
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void serializer(Bundle bundle) {
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        noWindowInsetsAnimation.RemoteActionCompatParcelizer(bundle, System.currentTimeMillis());
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void serializer(String str, String str2, Bundle bundle) {
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.RemoteActionCompatParcelizer.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.write(str, str2, bundle);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final String write() {
        return this.write.ComponentActivity();
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void write(long j, Bundle bundle, String str, String str2) {
        this.write.RemoteActionCompatParcelizer(str, str2, bundle, true, false, j);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void write(String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = this.RemoteActionCompatParcelizer;
        getHasPremeasured gethaspremeasured = lookaheadScopeKtLookaheadScope221.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        LookaheadScopeKtLookaheadScope221.write(gethaspremeasured);
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        gethaspremeasured.serializer(SystemClock.elapsedRealtime(), str);
    }

    public registerOnLayoutRectChanged(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(lookaheadScopeKtLookaheadScope221);
        this.RemoteActionCompatParcelizer = lookaheadScopeKtLookaheadScope221;
        NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        this.write = noWindowInsetsAnimation;
    }
}
