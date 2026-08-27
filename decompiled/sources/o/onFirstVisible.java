package o;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class onFirstVisible implements Runnable {
    public final /* synthetic */ zzr IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ setViewportBounds MediaSessionCompatQueueItem;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ int write = 0;

    public onFirstVisible(setViewportBounds setviewportbounds, String str, String str2, zzr zzrVar, boolean z, getQEK5gGoQ getqek5ggoq) {
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = zzrVar;
        this.read = z;
        this.MediaDescriptionCompat = getqek5ggoq;
        this.MediaSessionCompatQueueItem = setviewportbounds;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        onLayoutRectChangeddefault onlayoutrectchangeddefault;
        AtomicReference atomicReference;
        if (this.write != 0) {
            AtomicReference atomicReference2 = (AtomicReference) this.MediaDescriptionCompat;
            synchronized (atomicReference2) {
                try {
                    try {
                        setViewportBounds setviewportbounds = this.MediaSessionCompatQueueItem;
                        isComplete iscomplete = setviewportbounds.write;
                        if (iscomplete == null) {
                            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.IconCompatParcelizer("(legacy) Failed to get user properties; not connected to service", null, this.serializer, this.RemoteActionCompatParcelizer);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(iscomplete.RemoteActionCompatParcelizer(this.serializer, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer));
                        } else {
                            atomicReference2.set(iscomplete.IconCompatParcelizer(null, this.serializer, this.RemoteActionCompatParcelizer, this.read));
                        }
                        setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        atomicReference = (AtomicReference) this.MediaDescriptionCompat;
                        atomicReference.notify();
                    } catch (RemoteException e) {
                        getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) this.MediaSessionCompatQueueItem.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.serializer.IconCompatParcelizer("(legacy) Failed to get user properties; remote exception", null, this.serializer, e);
                        ((AtomicReference) this.MediaDescriptionCompat).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.MediaDescriptionCompat;
                    }
                } catch (Throwable th) {
                    ((AtomicReference) this.MediaDescriptionCompat).notify();
                    throw th;
                }
            }
        } else {
            String str = this.RemoteActionCompatParcelizer;
            String str2 = this.serializer;
            getQEK5gGoQ getqek5ggoq = (getQEK5gGoQ) this.MediaDescriptionCompat;
            setViewportBounds setviewportbounds2 = this.MediaSessionCompatQueueItem;
            Bundle bundle2 = new Bundle();
            try {
                try {
                    isComplete iscomplete2 = setviewportbounds2.write;
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (iscomplete2 == null) {
                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        getlookaheaddelegate3.serializer.serializer("Failed to get user properties; not connected to service", str2, str);
                        onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                        onlayoutrectchangeddefault.serializer(getqek5ggoq, bundle2);
                    }
                    List<zzpl> listRemoteActionCompatParcelizer = iscomplete2.RemoteActionCompatParcelizer(str2, str, this.read, this.IconCompatParcelizer);
                    bundle = new Bundle();
                    if (listRemoteActionCompatParcelizer != null) {
                        for (zzpl zzplVar : listRemoteActionCompatParcelizer) {
                            String str3 = zzplVar.serializer;
                            String str4 = zzplVar.write;
                            if (str3 != null) {
                                bundle.putString(str4, str3);
                            } else {
                                Long l = zzplVar.RemoteActionCompatParcelizer;
                                if (l != null) {
                                    bundle.putLong(str4, l.longValue());
                                } else {
                                    Double d = zzplVar.MediaMetadataCompat;
                                    if (d != null) {
                                        bundle.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                        onlayoutrectchangeddefault2.serializer(getqek5ggoq, bundle);
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle2 = bundle;
                        getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                        getlookaheaddelegate4.serializer.serializer("Failed to get user properties; remote exception", str2, e);
                        onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                        onlayoutrectchangeddefault.serializer(getqek5ggoq, bundle2);
                    } catch (Throwable th2) {
                        th = th2;
                        onLayoutRectChangeddefault onlayoutrectchangeddefault3 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                        onlayoutrectchangeddefault3.serializer(getqek5ggoq, bundle);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bundle = bundle2;
                }
            } catch (RemoteException e3) {
                e = e3;
            }
        }
    }

    public onFirstVisible(setViewportBounds setviewportbounds, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z) {
        this.MediaDescriptionCompat = atomicReference;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = zzrVar;
        this.read = z;
        this.MediaSessionCompatQueueItem = setviewportbounds;
    }
}
