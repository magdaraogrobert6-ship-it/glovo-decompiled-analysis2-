package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import com.google.mlkit.common.MlKitException;
import io.grpc.internal.SharedResourcePool;
import io.sentry.SentryOptions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getLayoutNodeToHolder implements Runnable {
    public final Object IconCompatParcelizer;
    public final Object MediaSessionCompatQueueItem;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int serializer;
    public final Object write;

    public getLayoutNodeToHolder(SentryOptions sentryOptions, SharedResourcePool sharedResourcePool) {
        this.serializer = 4;
        sharedResourcePool.getClass();
        this.IconCompatParcelizer = sentryOptions;
        this.write = sharedResourcePool;
        this.MediaSessionCompatQueueItem = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        onLayoutRectChangeddefault onlayoutrectchangeddefault;
        int i = this.serializer;
        if (i == 0) {
            AndroidUiFrameClockwithFrameNanos2callback1 androidUiFrameClockwithFrameNanos2callback1 = (AndroidUiFrameClockwithFrameNanos2callback1) this.IconCompatParcelizer;
            ParentDataModifier parentDataModifier = (ParentDataModifier) this.write;
            getOwner getowner = (getOwner) this.RemoteActionCompatParcelizer;
            Callable callable = (Callable) this.read;
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) this.MediaSessionCompatQueueItem;
            AtomicBoolean atomicBoolean = (AtomicBoolean) androidUiFrameClockwithFrameNanos2callback1.IconCompatParcelizer;
            getMeasuredSizeYbymL2g getmeasuredsizeybyml2g = (getMeasuredSizeYbymL2g) parentDataModifier;
            try {
                if (getmeasuredsizeybyml2g.write.isComplete()) {
                    getowner.IconCompatParcelizer();
                    return;
                }
                try {
                    if (!atomicBoolean.get()) {
                        androidUiFrameClockwithFrameNanos2callback1.serializer();
                        atomicBoolean.set(true);
                    }
                    if (((getMeasuredSizeYbymL2g) parentDataModifier).write.isComplete()) {
                        getowner.IconCompatParcelizer();
                        return;
                    }
                    Object objCall = callable.call();
                    if (((getMeasuredSizeYbymL2g) parentDataModifier).write.isComplete()) {
                        getowner.IconCompatParcelizer();
                        return;
                    } else {
                        parentDataModifierDefaultImpls.IconCompatParcelizer(objCall);
                        return;
                    }
                } catch (RuntimeException e) {
                    throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
                }
            } catch (Exception e2) {
                if (getmeasuredsizeybyml2g.write.isComplete()) {
                    getowner.IconCompatParcelizer();
                    return;
                } else {
                    parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(e2);
                    return;
                }
            }
        }
        if (i == 1) {
            LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) this.IconCompatParcelizer;
            zzr zzrVar = (zzr) this.write;
            Bundle bundle = (Bundle) this.RemoteActionCompatParcelizer;
            LayoutNodeSubcompositionsStateprecomposePaused2 layoutNodeSubcompositionsStateprecomposePaused2 = (LayoutNodeSubcompositionsStateprecomposePaused2) this.read;
            String str = (String) this.MediaSessionCompatQueueItem;
            zzpg zzpgVar = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
            zzpgVar.serializer();
            try {
                layoutNodeSubcompositionsStateprecomposePaused2.write(zzpgVar.RemoteActionCompatParcelizer(bundle, zzrVar));
                return;
            } catch (RemoteException e3) {
                zzpgVar.RatingCompat().serializer.serializer("Failed to return trigger URIs for app", str, e3);
                return;
            }
        }
        if (i != 2) {
            if (i != 3) {
                boolean z = ((AtomicBoolean) this.MediaSessionCompatQueueItem).get();
                SentryOptions sentryOptions = (SentryOptions) this.IconCompatParcelizer;
                if (!z) {
                    if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                        return;
                    }
                    return;
                }
                try {
                    if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Capturing a frame.", new Object[0]);
                    }
                    io.sentry.android.replay.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (io.sentry.android.replay.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) this.RemoteActionCompatParcelizer;
                    if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
                        r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.write();
                    }
                } catch (Throwable th) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to capture a frame", th);
                }
                if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                    BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
                    r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                    StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
                    io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = (io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) this.read;
                    logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, af$$ExternalSyntheticOutline0.m(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null ? r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.IconCompatParcelizer : 1, " fps.", sb), new Object[0]);
                }
                SharedResourcePool sharedResourcePool = (SharedResourcePool) this.write;
                io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = (io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) this.read;
                if (((Handler) sharedResourcePool.IconCompatParcelizer).postDelayed(this, 1000 / ((long) (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null ? r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2.IconCompatParcelizer : 1)))) {
                    return;
                }
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                return;
            }
            getQEK5gGoQ getqek5ggoq = (getQEK5gGoQ) this.read;
            String str2 = (String) this.write;
            String str3 = (String) this.IconCompatParcelizer;
            setViewportBounds setviewportbounds = (setViewportBounds) this.MediaSessionCompatQueueItem;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    isComplete iscomplete = setviewportbounds.write;
                    if (iscomplete == null) {
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.serializer.serializer("Failed to get conditional properties; not connected to service", str3, str2);
                        onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    } else {
                        arrayList = onLayoutRectChangeddefault.write(iscomplete.read(str3, str2, (zzr) this.RemoteActionCompatParcelizer));
                        setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    }
                } catch (RemoteException e4) {
                    getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.IconCompatParcelizer("Failed to get conditional properties; remote exception", str3, str2, e4);
                }
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                onlayoutrectchangeddefault.RemoteActionCompatParcelizer(getqek5ggoq, arrayList);
                return;
            } catch (Throwable th2) {
                onLayoutRectChangeddefault onlayoutrectchangeddefault2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                onlayoutrectchangeddefault2.RemoteActionCompatParcelizer(getqek5ggoq, arrayList);
                throw th2;
            }
        }
        AtomicReference atomicReference2 = (AtomicReference) this.IconCompatParcelizer;
        synchronized (atomicReference2) {
            try {
                try {
                    setViewportBounds setviewportbounds2 = (setViewportBounds) this.MediaSessionCompatQueueItem;
                    isComplete iscomplete2 = setviewportbounds2.write;
                    if (iscomplete2 == null) {
                        getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        getlookaheaddelegate3.serializer.IconCompatParcelizer("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.write, (String) this.RemoteActionCompatParcelizer);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(iscomplete2.read((String) this.write, (String) this.RemoteActionCompatParcelizer, (zzr) this.read));
                    } else {
                        atomicReference2.set(iscomplete2.RemoteActionCompatParcelizer(null, (String) this.write, (String) this.RemoteActionCompatParcelizer));
                    }
                    setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    atomicReference = (AtomicReference) this.IconCompatParcelizer;
                    atomicReference.notify();
                } catch (RemoteException e5) {
                    getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) ((setViewportBounds) this.MediaSessionCompatQueueItem).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.serializer.IconCompatParcelizer("(legacy) Failed to get conditional properties; remote exception", null, (String) this.write, e5);
                    ((AtomicReference) this.IconCompatParcelizer).set(Collections.EMPTY_LIST);
                    atomicReference = (AtomicReference) this.IconCompatParcelizer;
                }
            } catch (Throwable th3) {
                ((AtomicReference) this.IconCompatParcelizer).notify();
                throw th3;
            }
        }
    }

    public /* synthetic */ getLayoutNodeToHolder(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.read = obj4;
        this.MediaSessionCompatQueueItem = obj5;
    }

    public /* synthetic */ getLayoutNodeToHolder(setViewportBounds setviewportbounds, Serializable serializable, String str, Object obj, Object obj2, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = serializable;
        this.write = str;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.MediaSessionCompatQueueItem = setviewportbounds;
    }
}
