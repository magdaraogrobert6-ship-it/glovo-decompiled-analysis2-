package com.deliveryhero.performance.core.screenmetric;

import android.view.View;
import android.view.Window;
import androidx.emoji2.text.EmojiProcessor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import coil3.RealImageLoader;
import coil3.memory.MemoryCacheService;
import com.roadrunner.home.HomeFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.TuplesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.FastFloatParserKt;
import o.GroupComponentwrappedListener1;
import o.div7Ah8Wj8;
import o.getAutoMirror;
import o.getContentViewGroupParentLayout;
import o.getDefaultHeightD9Ej5fM;
import o.getNumChildren;
import o.getRotation;
import o.getWillClipPath;
import o.insertAt;
import o.isTintable;
import o.obtainTint8_81llA;
import o.pack;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentMetricsLifecycleCallback extends FragmentManager$FragmentLifecycleCallbacks {
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaBrowserCompatMediaItem;
    public final EmojiProcessor MediaDescriptionCompat;
    public final MemoryCacheService MediaSessionCompatQueueItem;
    public final EmojiProcessor RatingCompat;
    public final insertAt RemoteActionCompatParcelizer;
    public final CoroutineDispatcher read;
    public final Set serializer;
    public final HashMap write;

    public FragmentMetricsLifecycleCallback(Set set, MemoryCacheService memoryCacheService, insertAt insertat, EmojiProcessor emojiProcessor, getContentViewGroupParentLayout getcontentviewgroupparentlayout, CoroutineDispatcher coroutineDispatcher, EmojiProcessor emojiProcessor2, FastFloatParserKt fastFloatParserKt) {
        set.getClass();
        memoryCacheService.getClass();
        insertat.getClass();
        getcontentviewgroupparentlayout.getClass();
        coroutineDispatcher.getClass();
        emojiProcessor2.getClass();
        this.serializer = set;
        this.MediaSessionCompatQueueItem = memoryCacheService;
        this.RemoteActionCompatParcelizer = insertat;
        this.RatingCompat = emojiProcessor;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.read = coroutineDispatcher;
        this.MediaDescriptionCompat = emojiProcessor2;
        this.MediaBrowserCompatMediaItem = fastFloatParserKt;
        this.write = new HashMap();
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void IconCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        String simpleName = fragment.getClass().getSimpleName();
        if (this.serializer.contains(simpleName)) {
            return;
        }
        getRotation getrotation = (getRotation) this.write.remove(Integer.valueOf(System.identityHashCode(fragment)));
        GroupComponentwrappedListener1 groupComponentwrappedListener1RemoteActionCompatParcelizer = getrotation != null ? getrotation.RemoteActionCompatParcelizer() : null;
        if (groupComponentwrappedListener1RemoteActionCompatParcelizer != null) {
            TuplesKt.RemoteActionCompatParcelizer(simpleName, groupComponentwrappedListener1RemoteActionCompatParcelizer);
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.getWindow();
        }
        View view = fragment.getView();
        this.RemoteActionCompatParcelizer.getClass();
        insertAt.RemoteActionCompatParcelizer(view, "Screen_Fragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void MediaMetadataCompat(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        String simpleName = fragment.getClass().getSimpleName();
        obtainTint8_81llA obtaintint8_81lla = fragment instanceof obtainTint8_81llA ? (obtainTint8_81llA) fragment : null;
        if (obtaintint8_81lla != null) {
            getNumChildren getnumchildren = getNumChildren.IconCompatParcelizer;
            getNumChildren.write(obtaintint8_81lla);
        }
        if (this.serializer.contains(simpleName)) {
            return;
        }
        ((LinkedHashMap) this.MediaDescriptionCompat.IconCompatParcelizer).put(simpleName, Boolean.FALSE);
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, null, new RealImageLoader.AnonymousClass2(this, simpleName, fragment, null, 27), 2);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        String simpleName = fragment.getClass().getSimpleName();
        FragmentActivity activity = fragment.getActivity();
        EmojiProcessor emojiProcessor = this.MediaDescriptionCompat;
        if (activity != null && activity.isChangingConfigurations()) {
            ((LinkedHashMap) emojiProcessor.serializer).put(simpleName, Boolean.TRUE);
        }
        ((LinkedHashMap) emojiProcessor.IconCompatParcelizer).put(simpleName, Boolean.FALSE);
        ((LinkedHashMap) emojiProcessor.read).remove(simpleName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment, FragmentActivity fragmentActivity) {
        fragment.getClass();
        fragmentActivity.getClass();
        if (this.serializer.contains(fragment.getClass().getSimpleName())) {
            return;
        }
        LinkedHashMap linkedHashMap = getDefaultHeightD9Ej5fM.serializer;
        getDefaultHeightD9Ej5fM.IconCompatParcelizer(fragment.getClass().getSimpleName());
        obtainTint8_81llA obtaintint8_81lla = fragment instanceof obtainTint8_81llA ? (obtainTint8_81llA) fragment : null;
        if (obtaintint8_81lla != null) {
            getNumChildren getnumchildren = getNumChildren.IconCompatParcelizer;
            getNumChildren.RemoteActionCompatParcelizer(obtaintint8_81lla);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void onFragmentResumed(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        obtainTint8_81llA obtaintint8_81lla = fragment instanceof obtainTint8_81llA ? (obtainTint8_81llA) fragment : null;
        if (obtaintint8_81lla != null) {
            getNumChildren.serializer(obtaintint8_81lla, new HomeFragment.AnonymousClass1(1, getNumChildren.IconCompatParcelizer, getNumChildren.class, "resumeScreenMetric", "resumeScreenMetric(Ljava/lang/String;)V", 0, 7));
        }
        String simpleName = fragment.getClass().getSimpleName();
        boolean zContains = this.serializer.contains(simpleName);
        EmojiProcessor emojiProcessor = this.MediaDescriptionCompat;
        if (zContains) {
            emojiProcessor.IconCompatParcelizer(simpleName);
            return;
        }
        String str = "fragment:" + simpleName + ":" + System.identityHashCode(fragment);
        FragmentActivity activity = fragment.getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        View view = fragment.getView();
        insertAt insertat = this.RemoteActionCompatParcelizer;
        insertat.RemoteActionCompatParcelizer("Screen_Fragment", str, window, view);
        getRotation getrotation = new getRotation(insertat, str, isTintable.ROLLUP);
        this.write.put(Integer.valueOf(System.identityHashCode(fragment)), getrotation);
        getrotation.read();
        emojiProcessor.IconCompatParcelizer(simpleName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void onFragmentStarted(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        String simpleName = fragment.getClass().getSimpleName();
        if (this.serializer.contains(simpleName)) {
            return;
        }
        boolean z = fragment instanceof obtainTint8_81llA;
        obtainTint8_81llA obtaintint8_81lla = z ? (obtainTint8_81llA) fragment : null;
        if (obtaintint8_81lla != null) {
            getNumChildren.serializer(obtaintint8_81lla, new HomeFragment.AnonymousClass1(1, getNumChildren.IconCompatParcelizer, getNumChildren.class, "pauseScreenMetric", "pauseScreenMetric(Ljava/lang/String;)V", 0, 6));
        }
        this.MediaSessionCompatQueueItem.write(simpleName, z ? ((obtainTint8_81llA) fragment).read() : new pack(fragment.getClass().getSimpleName()), getWillClipPath.Fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void serializer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        String simpleName = fragment.getClass().getSimpleName();
        this.MediaSessionCompatQueueItem.write(simpleName, fragment instanceof obtainTint8_81llA ? ((obtainTint8_81llA) fragment).read() : new pack(fragment.getClass().getSimpleName()), getWillClipPath.Fragment);
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.MediaBrowserCompatMediaItem;
        if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(simpleName, new getAutoMirror(fragment));
        }
        EmojiProcessor.serializer(this.MediaDescriptionCompat, simpleName);
    }
}
