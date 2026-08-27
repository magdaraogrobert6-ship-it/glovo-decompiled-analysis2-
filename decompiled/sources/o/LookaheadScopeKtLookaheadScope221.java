package o;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.tasks.zzc;
import com.huawei.location.ut;
import com.mapbox.core.exceptions.ServicesException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScopeKtLookaheadScope221 implements layoutdefault {
    public static volatile LookaheadScopeKtLookaheadScope221 RemoteActionCompatParcelizer;
    public final NoWindowInsetsAnimation ComponentActivity;
    public volatile Boolean IconCompatParcelizer;
    public final Context MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final accessgetWcp MediaSessionCompatQueueItem;
    public final LookaheadScopeKtLookaheadScope4 MediaSessionCompatResultReceiverWrapper;
    public final triggerCallback MediaSessionCompatToken;
    public final getLookaheadDelegate ParcelableVolumeInfo;
    public final setComposedWithReusableContentHost PlaybackStateCompat;
    public final LookaheadScopeKt PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public final OnFirstVisibleNode ResultReceiver;
    public long _init_lambda1;
    public final accessgetTvInputComposite1cp r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final zzgn r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final onLayoutRectChangeddefault r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final getHasPremeasured r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public getParentWidth r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public setViewportBounds r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final NoOpSubcomposeSlotReusePolicy r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public Boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public resume r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public LayoutNodeSubcompositionsStateScopelayout1 r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public OnFirstVisibleElement r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public volatile boolean read;
    public int serializer;
    public int write;
    public boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = false;
    public final AtomicInteger MediaBrowserCompatMediaItem = new AtomicInteger(0);

    @Override // o.layoutdefault
    public final accessgetWcp MediaBrowserCompatMediaItem() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.layoutdefault
    public final accessgetTvInputComposite2cp ParcelableVolumeInfo() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    @Override // o.layoutdefault
    public final Context PlaybackStateCompatCustomAction() {
        return this.MediaDescriptionCompat;
    }

    public final zzgn serializer() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    public final boolean write() {
        return IconCompatParcelizer() == 0;
    }

    public static LookaheadScopeKtLookaheadScope221 IconCompatParcelizer(Context context, zzdd zzddVar, Long l) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.read;
            zzddVar = new zzdd(zzddVar.serializer, zzddVar.write, zzddVar.IconCompatParcelizer, bundle2, null);
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context.getApplicationContext());
        if (RemoteActionCompatParcelizer == null) {
            synchronized (LookaheadScopeKtLookaheadScope221.class) {
                if (RemoteActionCompatParcelizer == null) {
                    RemoteActionCompatParcelizer = new LookaheadScopeKtLookaheadScope221(new onRenderProcessGone(context, zzddVar, l));
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.read) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(RemoteActionCompatParcelizer);
            RemoteActionCompatParcelizer.IconCompatParcelizer = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(RemoteActionCompatParcelizer);
        return RemoteActionCompatParcelizer;
    }

    public static final void serializer(LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 layoutNodeSubcompositionsStatedeactivateOutOfFrame1) {
        if (layoutNodeSubcompositionsStatedeactivateOutOfFrame1 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Component not created");
        } else {
            if (layoutNodeSubcompositionsStatedeactivateOutOfFrame1.RemoteActionCompatParcelizer) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Component not initialized: ".concat(String.valueOf(layoutNodeSubcompositionsStatedeactivateOutOfFrame1.getClass())));
        }
    }

    public static final void write(Measurable measurable) {
        if (measurable == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Component not created");
        } else {
            if (measurable.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Component not initialized: ".concat(String.valueOf(measurable.getClass())));
        }
    }

    public final int IconCompatParcelizer() {
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.MediaSessionCompatResultReceiverWrapper;
        write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = this.PlaybackStateCompat;
        if (setcomposedwithreusablecontenthost.MediaSessionCompatQueueItem()) {
            return 1;
        }
        write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        if (!this.read) {
            return 8;
        }
        LookaheadScopeKt lookaheadScopeKt = this.PlaybackStateCompatCustomAction;
        IconCompatParcelizer(lookaheadScopeKt);
        lookaheadScopeKt.MediaSessionCompatToken();
        Boolean boolValueOf = lookaheadScopeKt.serializer().contains("measurement_enabled") ? Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        accessgetWcp accessgetwcp = ((LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatQueueItem;
        Boolean boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("firebase_analytics_collection_enabled");
        if (boolRemoteActionCompatParcelizer != null) {
            return boolRemoteActionCompatParcelizer.booleanValue() ? 0 : 4;
        }
        return (this.IconCompatParcelizer == null || this.IconCompatParcelizer.booleanValue()) ? 0 : 7;
    }

    public final setViewportBounds MediaDescriptionCompat() {
        serializer(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    public final resume MediaMetadataCompat() {
        serializer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public final LayoutNodeSubcompositionsStateScopelayout1 MediaSessionCompatQueueItem() {
        write(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        return this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    @Override // o.layoutdefault
    public final LookaheadScopeKtLookaheadScope4 PlaybackStateCompat() {
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.MediaSessionCompatResultReceiverWrapper;
        write(lookaheadScopeKtLookaheadScope4);
        return lookaheadScopeKtLookaheadScope4;
    }

    @Override // o.layoutdefault
    public final getLookaheadDelegate RatingCompat() {
        getLookaheadDelegate getlookaheaddelegate = this.ParcelableVolumeInfo;
        write(getlookaheaddelegate);
        return getlookaheaddelegate;
    }

    public final getParentWidth read() {
        serializer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public LookaheadScopeKtLookaheadScope221(onRenderProcessGone onrenderprocessgone) {
        DelegatingNode updatenodekindset;
        boolean z = false;
        Context context = (Context) onrenderprocessgone.write;
        accessgetWcp accessgetwcp = new accessgetWcp(10);
        this.MediaSessionCompatQueueItem = accessgetwcp;
        Measured.serializer = accessgetwcp;
        this.MediaDescriptionCompat = context;
        this.RatingCompat = onrenderprocessgone.read;
        this.IconCompatParcelizer = (Boolean) onrenderprocessgone.serializer;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = (String) onrenderprocessgone.RatingCompat;
        boolean z2 = true;
        this.read = true;
        if (isAltPressedZmokQxo.write == null && context != null) {
            Object obj = isAltPressedZmokQxo.RemoteActionCompatParcelizer;
            synchronized (obj) {
                if (isAltPressedZmokQxo.write == null) {
                    synchronized (obj) {
                        KeyEventType keyEventType = isAltPressedZmokQxo.write;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        if (keyEventType == null || keyEventType.IconCompatParcelizer != applicationContext) {
                            if (keyEventType != null) {
                                getKeyUpCS__XNY.RemoteActionCompatParcelizer();
                                getUtf16CodePointZmokQxo.IconCompatParcelizer();
                                ut.IconCompatParcelizer(ServicesException.RemoteActionCompatParcelizer(), new Object[0], -1196652480, ServicesException.RemoteActionCompatParcelizer(), 1196652481, ServicesException.RemoteActionCompatParcelizer(), ServicesException.RemoteActionCompatParcelizer());
                            }
                            getFocusEK5gGoQ getfocusek5ggoq = new getFocusEK5gGoQ(applicationContext, 4);
                            if (getfocusek5ggoq instanceof Serializable) {
                                updatenodekindset = new updateNodeKindSet(getfocusek5ggoq);
                            } else {
                                validateDelegateKindSet validatedelegatekindset = new validateDelegateKindSet();
                                validatedelegatekindset.read = getfocusek5ggoq;
                                updatenodekindset = validatedelegatekindset;
                            }
                            isAltPressedZmokQxo.write = new KeyEventType(applicationContext, updatenodekindset);
                            isAltPressedZmokQxo.IconCompatParcelizer.incrementAndGet();
                        }
                    }
                }
            }
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = accessgetTvInputComposite1cp.read;
        Long l = (Long) onrenderprocessgone.MediaDescriptionCompat;
        this.MediaMetadataCompat = l != null ? l.longValue() : System.currentTimeMillis();
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = new setComposedWithReusableContentHost(this);
        setcomposedwithreusablecontenthost.write = getIntentArrayWithConfiguredBackStacklambda4.write;
        this.PlaybackStateCompat = setcomposedwithreusablecontenthost;
        LookaheadScopeKt lookaheadScopeKt = new LookaheadScopeKt(this);
        lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        this.PlaybackStateCompatCustomAction = lookaheadScopeKt;
        getLookaheadDelegate getlookaheaddelegate = new getLookaheadDelegate(this);
        getlookaheaddelegate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        this.ParcelableVolumeInfo = getlookaheaddelegate;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = new onLayoutRectChangeddefault(this);
        onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onlayoutrectchangeddefault;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new zzgn(new Extras$Key(onrenderprocessgone, this));
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new getHasPremeasured(this);
        OnFirstVisibleNode onFirstVisibleNode = new OnFirstVisibleNode(this);
        onFirstVisibleNode.read();
        this.ResultReceiver = onFirstVisibleNode;
        NoWindowInsetsAnimation noWindowInsetsAnimation = new NoWindowInsetsAnimation(this);
        noWindowInsetsAnimation.read();
        this.ComponentActivity = noWindowInsetsAnimation;
        triggerCallback triggercallback = new triggerCallback(this);
        triggercallback.read();
        this.MediaSessionCompatToken = triggercallback;
        NoOpSubcomposeSlotReusePolicy noOpSubcomposeSlotReusePolicy = new NoOpSubcomposeSlotReusePolicy(this);
        noOpSubcomposeSlotReusePolicy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = noOpSubcomposeSlotReusePolicy;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = new LookaheadScopeKtLookaheadScope4(this);
        lookaheadScopeKtLookaheadScope4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        this.MediaSessionCompatResultReceiverWrapper = lookaheadScopeKtLookaheadScope4;
        zzdd zzddVar = (zzdd) onrenderprocessgone.IconCompatParcelizer;
        if (zzddVar != null && zzddVar.write != 0) {
            z2 = false;
        }
        if (context.getApplicationContext() instanceof Application) {
            serializer(noWindowInsetsAnimation);
            if (((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getApplicationContext() instanceof Application) {
                Application application = (Application) ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getApplicationContext();
                if (noWindowInsetsAnimation.IconCompatParcelizer == null) {
                    noWindowInsetsAnimation.IconCompatParcelizer = new zzfa(2, noWindowInsetsAnimation);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(noWindowInsetsAnimation.IconCompatParcelizer);
                    application.registerActivityLifecycleCallbacks(noWindowInsetsAnimation.IconCompatParcelizer);
                    getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    write(getlookaheaddelegate2);
                    getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Registered activity lifecycle callback");
                }
            }
        } else {
            write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Application context is not an Application");
        }
        lookaheadScopeKtLookaheadScope4.write((Runnable) new zzc(this, onrenderprocessgone, z, 12));
    }

    public static final void IconCompatParcelizer(androidx.compose.animation.core.TransitionState transitionState) {
        if (transitionState != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Component not created");
    }

    public static final void write(getSizeYEO4UFw getsizeyeo4ufw) {
        if (getsizeyeo4ufw != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Component not created");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    public final boolean RemoteActionCompatParcelizer() {
        onLayoutRectChangeddefault onlayoutrectchangeddefault;
        Context context;
        boolean z = false;
        if (!this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("AppMeasurement is not initialized");
            return false;
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.MediaSessionCompatResultReceiverWrapper;
        write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        Boolean bool = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (bool == null || this._init_lambda1 == 0) {
            accessgettvinputcomposite1cp.getClass();
            this._init_lambda1 = SystemClock.elapsedRealtime();
            onlayoutrectchangeddefault = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            IconCompatParcelizer(onlayoutrectchangeddefault);
            if (onlayoutrectchangeddefault.IconCompatParcelizer("android.permission.INTERNET") && onlayoutrectchangeddefault.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.MediaDescriptionCompat;
                if (accessgetTvMediaContextMenucp.serializer(context).write() || this.PlaybackStateCompat.serializer() || (onLayoutRectChangeddefault.IconCompatParcelizer(context) && onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context))) {
                    z = true;
                }
            }
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Boolean.valueOf(z);
            if (z) {
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Boolean.valueOf(onlayoutrectchangeddefault.read(MediaMetadataCompat().ComponentActivity()));
            }
        } else if (!bool.booleanValue()) {
            accessgettvinputcomposite1cp.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this._init_lambda1) > 1000) {
                accessgettvinputcomposite1cp.getClass();
                this._init_lambda1 = SystemClock.elapsedRealtime();
                onlayoutrectchangeddefault = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                IconCompatParcelizer(onlayoutrectchangeddefault);
                if (onlayoutrectchangeddefault.IconCompatParcelizer("android.permission.INTERNET")) {
                    context = this.MediaDescriptionCompat;
                    if (accessgetTvMediaContextMenucp.serializer(context).write()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Boolean.valueOf(z);
                if (z) {
                    this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Boolean.valueOf(onlayoutrectchangeddefault.read(MediaMetadataCompat().ComponentActivity()));
                }
            }
        }
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final void RemoteActionCompatParcelizer(int i, Throwable th, byte[] bArr) {
        getLookaheadDelegate getlookaheaddelegate;
        getLookaheadDelegate getlookaheaddelegate2;
        int i2 = i;
        getLookaheadDelegate getlookaheaddelegate3 = this.ParcelableVolumeInfo;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                LookaheadScopeKt lookaheadScopeKt = this.PlaybackStateCompatCustomAction;
                IconCompatParcelizer(lookaheadScopeKt);
                lookaheadScopeKt.PlaybackStateCompatCustomAction.serializer(true);
                if (bArr != null || bArr.length == 0) {
                    write(getlookaheaddelegate3);
                    getlookaheaddelegate3.MediaSessionCompatToken.RemoteActionCompatParcelizer("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString(com.adjust.sdk.Constants.DEEPLINK, "");
                    if (TextUtils.isEmpty(strOptString)) {
                        write(getlookaheaddelegate3);
                        getlookaheaddelegate3.MediaSessionCompatToken.RemoteActionCompatParcelizer("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    onLayoutRectChangeddefault onlayoutrectchangeddefault = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    IconCompatParcelizer(onlayoutrectchangeddefault);
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (TextUtils.isEmpty(strOptString)) {
                        getlookaheaddelegate2 = getlookaheaddelegate3;
                    } else {
                        getlookaheaddelegate2 = getlookaheaddelegate3;
                        try {
                            Context context = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat;
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.ComponentActivity.RemoteActionCompatParcelizer("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString(com.adjust.sdk.Constants.DEEPLINK, strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                                    write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.serializer.serializer(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            getlookaheaddelegate = getlookaheaddelegate2;
                            write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    write(getlookaheaddelegate2);
                    getlookaheaddelegate = getlookaheaddelegate2;
                    try {
                        getlookaheaddelegate.MediaSessionCompatQueueItem.IconCompatParcelizer("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        write(getlookaheaddelegate);
                        getlookaheaddelegate.serializer.serializer(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    getlookaheaddelegate = getlookaheaddelegate3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                LookaheadScopeKt lookaheadScopeKt2 = this.PlaybackStateCompatCustomAction;
                IconCompatParcelizer(lookaheadScopeKt2);
                lookaheadScopeKt2.PlaybackStateCompatCustomAction.serializer(true);
                if (bArr != null) {
                }
                write(getlookaheaddelegate3);
                getlookaheaddelegate3.MediaSessionCompatToken.RemoteActionCompatParcelizer("Deferred Deep Link response empty.");
                return;
            }
        }
        write(getlookaheaddelegate3);
        getlookaheaddelegate3.MediaSessionCompatQueueItem.serializer("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }
}
