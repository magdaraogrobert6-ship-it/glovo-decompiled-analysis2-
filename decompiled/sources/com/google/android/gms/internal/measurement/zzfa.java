package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.adjust.sdk.Constants;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.android.gms.stats.zza;
import com.google.firebase.FirebaseApp;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.MovePreviousSession;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayDeque;
import java.util.Objects;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.NoWindowInsetsAnimation;
import o.OnFirstVisibleNode;
import o.OnFirstVisibleNodeupdateViewport1;
import o.SemanticsNode_androidKt;
import o.SemanticsOwner;
import o.ValidationUtils;
import o.getAllSemanticsNodesToMapdefault;
import o.getHasPremeasured;
import o.getLookaheadDelegate;
import o.getMinFractionVisible;
import o.getProgramBlueEK5gGoQ;
import o.getRootInfoui;
import o.getShiftRightEK5gGoQ;
import o.getSixEK5gGoQ;
import o.getSoftRightEK5gGoQ;
import o.getViewportBounds;
import o.getWidthHeight;
import o.logTree;
import o.maxWidth;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.triggerCallback;
import o.truncslo4al4;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa implements Application.ActivityLifecycleCallbacks {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public zzfa() {
        this.write = 3;
        this.IconCompatParcelizer = new ArrayDeque(10);
    }

    public void RemoteActionCompatParcelizer(zzdf zzdfVar) {
        OnFirstVisibleNode onFirstVisibleNode = ((LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) this.IconCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        synchronized (onFirstVisibleNode.ParcelableVolumeInfo) {
            if (Objects.equals(onFirstVisibleNode.MediaMetadataCompat, zzdfVar)) {
                onFirstVisibleNode.MediaMetadataCompat = null;
            }
        }
        if (((LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()) {
            onFirstVisibleNode.read.remove(Integer.valueOf(zzdfVar.serializer));
        }
    }

    public void read(zzdf zzdfVar) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) this.IconCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        OnFirstVisibleNode onFirstVisibleNode = lookaheadScopeKtLookaheadScope221.ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        synchronized (onFirstVisibleNode.ParcelableVolumeInfo) {
            onFirstVisibleNode.MediaBrowserCompatMediaItem = false;
            onFirstVisibleNode.RatingCompat = true;
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope222.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (lookaheadScopeKtLookaheadScope222.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()) {
            getViewportBounds getviewportboundsIconCompatParcelizer = onFirstVisibleNode.IconCompatParcelizer(zzdfVar);
            onFirstVisibleNode.write = onFirstVisibleNode.IconCompatParcelizer;
            onFirstVisibleNode.IconCompatParcelizer = null;
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) new getMinFractionVisible(onFirstVisibleNode, getviewportboundsIconCompatParcelizer, jElapsedRealtime));
        } else {
            onFirstVisibleNode.IconCompatParcelizer = null;
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            lookaheadScopeKtLookaheadScope5.write((Runnable) new getWidthHeight(onFirstVisibleNode, jElapsedRealtime));
        }
        triggerCallback triggercallback = lookaheadScopeKtLookaheadScope221.MediaSessionCompatToken;
        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope223.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = lookaheadScopeKtLookaheadScope223.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
        lookaheadScopeKtLookaheadScope6.write((Runnable) new OnFirstVisibleNodeupdateViewport1(triggercallback, jElapsedRealtime2, 1));
    }

    public void write(zzdf zzdfVar) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) this.IconCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        triggerCallback triggercallback = lookaheadScopeKtLookaheadScope221.MediaSessionCompatToken;
        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope222.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new OnFirstVisibleNodeupdateViewport1(triggercallback, jElapsedRealtime, 0));
        OnFirstVisibleNode onFirstVisibleNode = lookaheadScopeKtLookaheadScope221.ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        Object obj = onFirstVisibleNode.ParcelableVolumeInfo;
        synchronized (obj) {
            onFirstVisibleNode.MediaBrowserCompatMediaItem = true;
            if (!Objects.equals(zzdfVar, onFirstVisibleNode.MediaMetadataCompat)) {
                synchronized (obj) {
                    onFirstVisibleNode.MediaMetadataCompat = zzdfVar;
                    onFirstVisibleNode.RatingCompat = false;
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (lookaheadScopeKtLookaheadScope223.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()) {
                        onFirstVisibleNode.MediaSessionCompatQueueItem = null;
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope223.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
                        lookaheadScopeKtLookaheadScope5.write((Runnable) new MovePreviousSession(onFirstVisibleNode));
                    }
                }
            }
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!lookaheadScopeKtLookaheadScope224.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()) {
            onFirstVisibleNode.IconCompatParcelizer = onFirstVisibleNode.MediaSessionCompatQueueItem;
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
            lookaheadScopeKtLookaheadScope6.write((Runnable) new zza(onFirstVisibleNode));
            return;
        }
        onFirstVisibleNode.write(zzdfVar.read, onFirstVisibleNode.IconCompatParcelizer(zzdfVar), false);
        getHasPremeasured gethaspremeasured = ((LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        LookaheadScopeKtLookaheadScope221.write(gethaspremeasured);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope225 = (LookaheadScopeKtLookaheadScope221) gethaspremeasured.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope225.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope7 = lookaheadScopeKtLookaheadScope225.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope7);
        lookaheadScopeKtLookaheadScope7.write((Runnable) new ValidationUtils(gethaspremeasured, jElapsedRealtime2));
    }

    public /* synthetic */ zzfa(int i, Object obj) {
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = read + 35;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        if (i3 == 0) {
            ((getSoftRightEK5gGoQ) this.IconCompatParcelizer).write(new getShiftRightEK5gGoQ(this, activity, 0));
            return;
        }
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                return;
            }
            activity.getClass();
            return;
        }
        activity.getClass();
        int i4 = read + 35;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        if (i4 == 0) {
            ((getSoftRightEK5gGoQ) this.IconCompatParcelizer).write(new getShiftRightEK5gGoQ(this, activity, 3));
            return;
        }
        if (i4 == 1) {
            activity.getClass();
            return;
        }
        if (i4 == 2 || i4 == 3) {
            return;
        }
        activity.getClass();
        int i5 = RemoteActionCompatParcelizer + 113;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 4 / 3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = this.write;
        if (i2 == 0) {
            ((getSoftRightEK5gGoQ) this.IconCompatParcelizer).write(new getShiftRightEK5gGoQ(this, activity, 4));
            int i3 = read + 33;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 59 / 0;
                return;
            }
            return;
        }
        if (i2 == 1) {
            activity.getClass();
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                activity.getClass();
            }
        } else {
            RemoteActionCompatParcelizer(zzdf.IconCompatParcelizer(activity));
            int i5 = RemoteActionCompatParcelizer + 111;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        int i2 = read + 47;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.write;
        if (i3 == 0) {
            ((getSoftRightEK5gGoQ) this.IconCompatParcelizer).write(new getShiftRightEK5gGoQ(this, activity, 2));
            return;
        }
        if (i3 == 1) {
            activity.getClass();
            return;
        }
        if (i3 == 2) {
            read(zzdf.IconCompatParcelizer(activity));
            return;
        }
        if (i3 != 3) {
            activity.getClass();
        }
        int i4 = RemoteActionCompatParcelizer + 75;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = this.write;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return;
                        }
                        activity.getClass();
                        int i4 = RemoteActionCompatParcelizer + 45;
                        read = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return;
                    }
                    write(zzdf.IconCompatParcelizer(activity));
                    return;
                }
                activity.getClass();
                return;
            }
            ((getSoftRightEK5gGoQ) this.IconCompatParcelizer).write(new getShiftRightEK5gGoQ(this, activity, 1));
        }
        int i6 = this.write;
        int i7 = 0 / 0;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        return;
                    }
                    activity.getClass();
                    int i8 = RemoteActionCompatParcelizer + 45;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return;
                }
                write(zzdf.IconCompatParcelizer(activity));
                return;
            }
            activity.getClass();
            return;
        }
        ((getSoftRightEK5gGoQ) this.IconCompatParcelizer).write(new getShiftRightEK5gGoQ(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        if (i4 == 0) {
            getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
            ((getSoftRightEK5gGoQ) this.IconCompatParcelizer).write(new getSixEK5gGoQ(this, activity, getprogramblueek5ggoq));
            Bundle bundleRemoteActionCompatParcelizer = getprogramblueek5ggoq.RemoteActionCompatParcelizer(50L);
            if (bundleRemoteActionCompatParcelizer != null) {
                bundle.putAll(bundleRemoteActionCompatParcelizer);
            }
            int i5 = read + 57;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i4 == 1) {
            activity.getClass();
            bundle.getClass();
        } else if (i4 == 2) {
            RemoteActionCompatParcelizer(zzdf.IconCompatParcelizer(activity), bundle);
        } else if (i4 != 3) {
            activity.getClass();
            bundle.getClass();
        }
    }

    public void RemoteActionCompatParcelizer(zzdf zzdfVar, Bundle bundle) {
        int i = 2 % 2;
        int i2 = read + 109;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        OnFirstVisibleNode onFirstVisibleNode = ((LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) this.IconCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        if (!((LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()) {
            int i4 = read + 69;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        if (bundle != null) {
            int i6 = read + 77;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            getViewportBounds getviewportbounds = (getViewportBounds) onFirstVisibleNode.read.get(Integer.valueOf(zzdfVar.serializer));
            if (getviewportbounds != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", getviewportbounds.IconCompatParcelizer);
                bundle2.putString("name", getviewportbounds.read);
                bundle2.putString("referrer_name", getviewportbounds.write);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[Catch: all -> 0x00c4, RuntimeException -> 0x00c6, TryCatch #0 {RuntimeException -> 0x00c6, blocks: (B:3:0x0007, B:7:0x0027, B:9:0x002d, B:21:0x0061, B:24:0x0068, B:26:0x007b, B:29:0x008c, B:35:0x009b, B:40:0x00a8, B:13:0x003f, B:15:0x0045, B:17:0x0051, B:41:0x00b8), top: B:54:0x0007, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[Catch: all -> 0x00c4, RuntimeException -> 0x00c6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00c6, blocks: (B:3:0x0007, B:7:0x0027, B:9:0x002d, B:21:0x0061, B:24:0x0068, B:26:0x007b, B:29:0x008c, B:35:0x009b, B:40:0x00a8, B:13:0x003f, B:15:0x0045, B:17:0x0051, B:41:0x00b8), top: B:54:0x0007, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    public void write(zzdf zzdfVar, Bundle bundle) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221;
        Bundle extras;
        String string;
        String str;
        int i = 2 % 2;
        NoWindowInsetsAnimation noWindowInsetsAnimation = (NoWindowInsetsAnimation) this.IconCompatParcelizer;
        try {
            try {
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("onActivityCreated");
                Intent intent = zzdfVar.IconCompatParcelizer;
                if (intent != null) {
                    int i2 = RemoteActionCompatParcelizer + 25;
                    read = i2 % Fields.SpotShadowColor;
                    Uri uri = null;
                    if (i2 % 2 != 0) {
                        intent.getData();
                        uri.hashCode();
                        throw null;
                    }
                    Uri data = intent.getData();
                    if (data == null) {
                        extras = intent.getExtras();
                        if (extras != null) {
                            string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                                int i3 = RemoteActionCompatParcelizer + 91;
                                read = i3 % Fields.SpotShadowColor;
                                int i4 = i3 % 2;
                            }
                        }
                    } else if (data.isHierarchical()) {
                        uri = data;
                        int i5 = RemoteActionCompatParcelizer + 91;
                        read = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    } else {
                        int i7 = read + 91;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        extras = intent.getExtras();
                        if (extras != null) {
                            string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                                int i9 = RemoteActionCompatParcelizer + 91;
                                read = i9 % Fields.SpotShadowColor;
                                int i10 = i9 % 2;
                            }
                        }
                    }
                    if (uri != null && uri.isHierarchical()) {
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKtLookaheadScope222.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra)) {
                            str = "gs";
                        } else {
                            int i11 = RemoteActionCompatParcelizer + 97;
                            read = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            if ("android-app://com.google.appcrawler".equals(stringExtra)) {
                                str = "gs";
                            } else {
                                str = "auto";
                            }
                        }
                        String str2 = str;
                        String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                        boolean z = bundle == null;
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                        lookaheadScopeKtLookaheadScope4.write((Runnable) new maxWidth(this, z, uri, str2, queryParameter));
                        lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    }
                    OnFirstVisibleNode onFirstVisibleNode = lookaheadScopeKtLookaheadScope221.ResultReceiver;
                    LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
                    onFirstVisibleNode.read(zzdfVar, bundle);
                }
                lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            } catch (RuntimeException e) {
                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "Throwable caught in onActivityCreated");
            }
            OnFirstVisibleNode onFirstVisibleNode2 = lookaheadScopeKtLookaheadScope221.ResultReceiver;
            LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode2);
            onFirstVisibleNode2.read(zzdfVar, bundle);
        } catch (Throwable th) {
            OnFirstVisibleNode onFirstVisibleNode3 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
            LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode3);
            onFirstVisibleNode3.read(zzdfVar, bundle);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b A[PHI: r10
  0x010b: PHI (r10v21 o.logTree) = (r10v20 o.logTree), (r10v25 o.logTree) binds: [B:62:0x0109, B:59:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        Bundle bundle2;
        int i;
        logTree logtree;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 49;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        Object obj = this.IconCompatParcelizer;
        if (i5 == 0) {
            ((getSoftRightEK5gGoQ) obj).write(new zzdr(this, bundle, activity));
            return;
        }
        if (i5 == 1) {
            activity.getClass();
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) obj;
            if (r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer) {
                return;
            }
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = true;
            ((Application) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write).unregisterActivityLifecycleCallbacks(this);
            if (bundle != null) {
                r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer();
                return;
            }
            return;
        }
        if (i5 == 2) {
            write(zzdf.IconCompatParcelizer(activity), bundle);
            int i6 = RemoteActionCompatParcelizer + 53;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        if (i5 != 3) {
            activity.getClass();
            truncslo4al4 truncslo4al4Var = (truncslo4al4) obj;
            Application application = (Application) truncslo4al4Var.IconCompatParcelizer;
            application.unregisterActivityLifecycleCallbacks(this);
            if (truncslo4al4Var.read && bundle == null) {
                SemanticsNode_androidKt semanticsNode_androidKt = application instanceof SemanticsNode_androidKt ? (SemanticsNode_androidKt) application : null;
                if (semanticsNode_androidKt != null) {
                    int i8 = RemoteActionCompatParcelizer + 73;
                    read = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        semanticsNode_androidKt.serializer();
                        int i9 = 36 / 0;
                    } else {
                        semanticsNode_androidKt.serializer();
                    }
                }
                ((getRootInfoui) ((SemanticsOwner) getAllSemanticsNodesToMapdefault.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper())).write("app_cold_start");
                return;
            }
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            ArrayDeque arrayDeque = (ArrayDeque) obj;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("google.message_id");
                    if (string == null) {
                        string = extras.getString(PushNotificationParserObj.MESSAGE_ID_KEY);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        if (!arrayDeque.contains(string)) {
                            arrayDeque.add(string);
                        }
                    }
                    bundle2 = extras.getBundle("gcm.n.analytics_data");
                } else {
                    bundle2 = null;
                }
            } catch (RuntimeException e) {
                SentryLogcatAdapter.write("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
            }
            if (bundle2 == null) {
                int i10 = RemoteActionCompatParcelizer + 53;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else if ("1".equals(bundle2.getString("google.c.a.e"))) {
                int i12 = RemoteActionCompatParcelizer + 9;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    int i13 = 79 / 0;
                    if (bundle2 != null) {
                        if (!"1".equals(bundle2.getString("google.c.a.tc"))) {
                            Log.isLoggable("FirebaseMessaging", 3);
                        } else {
                            i = RemoteActionCompatParcelizer + 75;
                            read = i % Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                logtree = (logTree) FirebaseApp.write().write(logTree.class);
                                Log.isLoggable("FirebaseMessaging", 3);
                                if (logtree != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    logtree.RemoteActionCompatParcelizer(string2, "fcm");
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString(Constants.MEDIUM, RemoteMessageConst.NOTIFICATION);
                                    bundle3.putString("campaign", string2);
                                    logtree.serializer("fcm", "_cmp", bundle3);
                                } else {
                                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else {
                                logtree = (logTree) FirebaseApp.write().write(logTree.class);
                                Log.isLoggable("FirebaseMessaging", 3);
                                if (logtree != null) {
                                    String string3 = bundle2.getString("google.c.a.c_id");
                                    logtree.RemoteActionCompatParcelizer(string3, "fcm");
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("source", "Firebase");
                                    bundle4.putString(Constants.MEDIUM, RemoteMessageConst.NOTIFICATION);
                                    bundle4.putString("campaign", string3);
                                    logtree.serializer("fcm", "_cmp", bundle4);
                                } else {
                                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            }
                        }
                    }
                } else if (bundle2 != null) {
                    if (!"1".equals(bundle2.getString("google.c.a.tc"))) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    } else {
                        i = RemoteActionCompatParcelizer + 75;
                        read = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            logtree = (logTree) FirebaseApp.write().write(logTree.class);
                            Log.isLoggable("FirebaseMessaging", 3);
                            if (logtree != null) {
                                String string4 = bundle2.getString("google.c.a.c_id");
                                logtree.RemoteActionCompatParcelizer(string4, "fcm");
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("source", "Firebase");
                                bundle5.putString(Constants.MEDIUM, RemoteMessageConst.NOTIFICATION);
                                bundle5.putString("campaign", string4);
                                logtree.serializer("fcm", "_cmp", bundle5);
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            }
                        } else {
                            logtree = (logTree) FirebaseApp.write().write(logTree.class);
                            Log.isLoggable("FirebaseMessaging", 3);
                            if (logtree != null) {
                                String string5 = bundle2.getString("google.c.a.c_id");
                                logtree.RemoteActionCompatParcelizer(string5, "fcm");
                                Bundle bundle6 = new Bundle();
                                bundle6.putString("source", "Firebase");
                                bundle6.putString(Constants.MEDIUM, RemoteMessageConst.NOTIFICATION);
                                bundle6.putString("campaign", string5);
                                logtree.serializer("fcm", "_cmp", bundle6);
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            }
                        }
                    }
                }
                SQLite.IconCompatParcelizer(bundle2, "_no");
            }
        }
        int i14 = read + 3;
        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            throw null;
        }
    }
}
