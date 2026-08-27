package com.deliveryhero.performance.core.screenmetric;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import androidx.emoji2.text.EmojiProcessor;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import androidx.transition.TransitionValuesMaps;
import coil3.Extras$Key;
import coil3.compose.AsyncImagePainter$launchJob$1;
import coil3.memory.MemoryCacheService;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.FastFloatParserKt;
import o.GroupComponentwrappedListener1;
import o.div7Ah8Wj8;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDefaultHeightD9Ej5fM;
import o.getInvalidateListenerui;
import o.getNumChildren;
import o.getRotation;
import o.getWillClipPath;
import o.insertAt;
import o.isTintable;
import o.markTintForBrush;
import o.markTintForVNode;
import o.obtainTint8_81llA;
import o.pack;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setInvalidateListenerui;
import o.setPivotY;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityMetricsLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    public final CoroutineDispatcher IconCompatParcelizer;
    public final EmojiProcessor MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final Extras$Key MediaMetadataCompat;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public final MemoryCacheService MediaSessionCompatToken;
    public final EmojiProcessor PlaybackStateCompat;
    public final insertAt RatingCompat;
    public final SparseArray RemoteActionCompatParcelizer;
    public final SparseArray read;
    public final getContentViewGroupParentLayout serializer;
    public final Set write;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        String simpleName = activity.getClass().getSimpleName();
        int iIdentityHashCode = System.identityHashCode(activity);
        if (!this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = true;
            this.MediaSessionCompatQueueItem.invoke(Boolean.valueOf(bundle != null));
        }
        if (Build.VERSION.SDK_INT < 29) {
            getDefaultHeightD9Ej5fM.IconCompatParcelizer(simpleName);
            obtainTint8_81llA obtaintint8_81lla = activity instanceof obtainTint8_81llA ? (obtainTint8_81llA) activity : null;
            if (obtaintint8_81lla != null) {
                getNumChildren.RemoteActionCompatParcelizer(obtaintint8_81lla);
            }
            Extras$Key extras$Key = this.MediaMetadataCompat;
            if (extras$Key != null) {
                ((TransitionValuesMaps) extras$Key.IconCompatParcelizer).IconCompatParcelizer(activity.getClass().getSimpleName(), markTintForBrush.read);
            }
        }
        Intent intent = activity.getIntent();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{intent != null ? intent.getAction() : null, "android.intent.action.VIEW"}, getCieXyz.write())).booleanValue() && intent.getData() != null) {
            ConcurrentHashMap concurrentHashMap = getInvalidateListenerui.write;
            Uri data = intent.getData();
            getInvalidateListenerui.read.set(data != null ? data.toString() : null);
        }
        this.MediaSessionCompatToken.write(simpleName, activity instanceof obtainTint8_81llA ? ((obtainTint8_81llA) activity).read() : new pack(activity.getClass().getSimpleName()), getWillClipPath.Activity);
        EmojiProcessor.serializer(this.PlaybackStateCompat, simpleName);
        this.RemoteActionCompatParcelizer.put(iIdentityHashCode, read(iIdentityHashCode, simpleName));
        if (activity instanceof FragmentActivity) {
            FragmentMetricsLifecycleCallback fragmentMetricsLifecycleCallback = new FragmentMetricsLifecycleCallback(this.write, this.MediaSessionCompatToken, this.RatingCompat, this.MediaBrowserCompatMediaItem, this.serializer, this.IconCompatParcelizer, this.PlaybackStateCompat, null);
            this.read.put(iIdentityHashCode, fragmentMetricsLifecycleCallback);
            ((FragmentActivity) activity).getSupportFragmentManager().RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) fragmentMetricsLifecycleCallback, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        div7Ah8Wj8 supportFragmentManager;
        activity.getClass();
        String simpleName = activity.getClass().getSimpleName();
        int iIdentityHashCode = System.identityHashCode(activity);
        Window window = activity.getWindow();
        setInvalidateListenerui setinvalidatelistenerui = this.RatingCompat.IconCompatParcelizer;
        if (window != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Looper.myLooper(), Looper.getMainLooper()}, getCieXyz.write())).booleanValue()) {
                setinvalidatelistenerui.IconCompatParcelizer(window);
            } else {
                setinvalidatelistenerui.MediaSessionCompatQueueItem.post(new setPivotY(setinvalidatelistenerui, window, 0));
            }
        }
        this.RemoteActionCompatParcelizer.remove(iIdentityHashCode);
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        EmojiProcessor emojiProcessor = this.PlaybackStateCompat;
        if (zIsChangingConfigurations) {
            ((LinkedHashMap) emojiProcessor.serializer).put(simpleName, Boolean.TRUE);
        }
        ((LinkedHashMap) emojiProcessor.IconCompatParcelizer).put(simpleName, Boolean.FALSE);
        ((LinkedHashMap) emojiProcessor.read).remove(simpleName);
        SparseArray sparseArray = this.read;
        FragmentMetricsLifecycleCallback fragmentMetricsLifecycleCallback = (FragmentMetricsLifecycleCallback) sparseArray.get(iIdentityHashCode);
        if (fragmentMetricsLifecycleCallback != null) {
            sparseArray.remove(iIdentityHashCode);
            FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                supportFragmentManager.read(fragmentMetricsLifecycleCallback);
            }
        }
        if (activity instanceof obtainTint8_81llA) {
            getNumChildren getnumchildren = getNumChildren.IconCompatParcelizer;
            getNumChildren.write((obtainTint8_81llA) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        String simpleName = activity.getClass().getSimpleName();
        LinkedHashMap linkedHashMap = getDefaultHeightD9Ej5fM.serializer;
        Extras$Key extras$Key = this.MediaMetadataCompat;
        if (extras$Key != null) {
            ((TransitionValuesMaps) extras$Key.IconCompatParcelizer).IconCompatParcelizer(simpleName, markTintForBrush.write);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        LinkedHashMap linkedHashMap = getDefaultHeightD9Ej5fM.serializer;
        getDefaultHeightD9Ej5fM.IconCompatParcelizer(activity.getClass().getSimpleName());
        obtainTint8_81llA obtaintint8_81lla = activity instanceof obtainTint8_81llA ? (obtainTint8_81llA) activity : null;
        if (obtaintint8_81lla != null) {
            getNumChildren.RemoteActionCompatParcelizer(obtaintint8_81lla);
        }
        Extras$Key extras$Key = this.MediaMetadataCompat;
        if (extras$Key != null) {
            ((TransitionValuesMaps) extras$Key.IconCompatParcelizer).IconCompatParcelizer(activity.getClass().getSimpleName(), markTintForBrush.read);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        String simpleName = activity.getClass().getSimpleName();
        String str = "activity:" + simpleName + ":" + System.identityHashCode(activity);
        Window window = activity.getWindow();
        this.RatingCompat.RemoteActionCompatParcelizer("Screen_Activity", str, window, window != null ? window.getDecorView() : null);
        this.PlaybackStateCompat.IconCompatParcelizer(simpleName);
        Extras$Key extras$Key = this.MediaMetadataCompat;
        if (extras$Key != null) {
            ((TransitionValuesMaps) extras$Key.IconCompatParcelizer).IconCompatParcelizer(simpleName, markTintForVNode.read);
        }
        LinkedHashMap linkedHashMap = getDefaultHeightD9Ej5fM.serializer;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        String simpleName = activity.getClass().getSimpleName();
        int iIdentityHashCode = System.identityHashCode(activity);
        this.MediaSessionCompatToken.write(simpleName, activity instanceof obtainTint8_81llA ? ((obtainTint8_81llA) activity).read() : new pack(activity.getClass().getSimpleName()), getWillClipPath.Activity);
        String str = "activity:" + simpleName + ":" + iIdentityHashCode;
        Window window = activity.getWindow();
        this.RatingCompat.RemoteActionCompatParcelizer("Screen_Activity", str, window, window != null ? window.getDecorView() : null);
        SparseArray sparseArray = this.RemoteActionCompatParcelizer;
        getRotation getrotation = (getRotation) sparseArray.get(iIdentityHashCode);
        if (getrotation == null) {
            getrotation = read(iIdentityHashCode, simpleName);
            sparseArray.put(iIdentityHashCode, getrotation);
        }
        getrotation.read();
        Extras$Key extras$Key = this.MediaMetadataCompat;
        if (extras$Key != null) {
            ((TransitionValuesMaps) extras$Key.IconCompatParcelizer).IconCompatParcelizer(simpleName, markTintForBrush.IconCompatParcelizer);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        String simpleName = activity.getClass().getSimpleName();
        ((LinkedHashMap) this.PlaybackStateCompat.IconCompatParcelizer).put(simpleName, Boolean.FALSE);
        getRotation getrotation = (getRotation) this.RemoteActionCompatParcelizer.get(System.identityHashCode(activity));
        GroupComponentwrappedListener1 groupComponentwrappedListener1RemoteActionCompatParcelizer = getrotation != null ? getrotation.RemoteActionCompatParcelizer() : null;
        if (groupComponentwrappedListener1RemoteActionCompatParcelizer != null) {
            TuplesKt.RemoteActionCompatParcelizer(simpleName, groupComponentwrappedListener1RemoteActionCompatParcelizer);
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        this.RatingCompat.getClass();
        insertAt.RemoteActionCompatParcelizer(decorView, "Screen_Activity");
        BuildersKt.RemoteActionCompatParcelizer(this.serializer, this.IconCompatParcelizer, null, new AsyncImagePainter$launchJob$1(this, simpleName, activity, null, 11), 2);
    }

    public ActivityMetricsLifecycleCallback(MemoryCacheService memoryCacheService, Set set, CoroutineDispatcher coroutineDispatcher, getContentViewGroupParentLayout getcontentviewgroupparentlayout, EmojiProcessor emojiProcessor, Extras$Key extras$Key, RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1, FastFloatParserKt fastFloatParserKt, insertAt insertat) {
        EmojiProcessor emojiProcessor2 = new EmojiProcessor(9);
        coroutineDispatcher.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.MediaSessionCompatToken = memoryCacheService;
        this.write = set;
        this.IconCompatParcelizer = coroutineDispatcher;
        this.serializer = getcontentviewgroupparentlayout;
        this.MediaBrowserCompatMediaItem = emojiProcessor;
        this.MediaMetadataCompat = extras$Key;
        this.PlaybackStateCompat = emojiProcessor2;
        this.MediaSessionCompatQueueItem = rootViewsSpy$Companion$install$1$1;
        this.RatingCompat = insertat;
        this.RemoteActionCompatParcelizer = new SparseArray();
        this.read = new SparseArray();
    }

    public final getRotation read(int i, String str) {
        return new getRotation(this.RatingCompat, "activity:" + str + ":" + i, isTintable.ROLLUP);
    }
}
