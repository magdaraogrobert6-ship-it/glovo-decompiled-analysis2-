package com.roadrunner.appperformance.tracker.sentry;

import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import io.sentry.util.PlaybackStateCompatCustomAction;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.AddToCustomAttributeArrayStep;
import o.BannerJavascriptInterface;
import o.ContainerStepgetChildStepIteratorinlinediterator2;
import o.SetPushNotificationSubscriptionStep;
import o.defaultCardHandling;
import o.div7Ah8Wj8;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getCieXyz;
import o.handleCardClicklambda4;
import o.internalHeightCallbacklambda0;
import o.obtainTint8_81llA;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU;
import o.removeNodeAtDepth;
import o.toFocusDirection;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryFragmentScreenPerformanceCallbacks extends FragmentManager$FragmentLifecycleCallbacks {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final InitializeAppStartupItemsImpl read;
    public final Map MediaDescriptionCompat = Collections.synchronizedMap(new WeakHashMap());
    public final Map IconCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());
    public final Map serializer = Collections.synchronizedMap(new WeakHashMap());
    public final Map write = Collections.synchronizedMap(new WeakHashMap());
    public final Map RemoteActionCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());

    public SentryFragmentScreenPerformanceCallbacks(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.read = initializeAppStartupItemsImpl;
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void IconCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 99;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            fragment.getClass();
            boolean z = fragment instanceof obtainTint8_81llA;
            throw null;
        }
        fragment.getClass();
        if (fragment instanceof obtainTint8_81llA) {
            IconCompatParcelizer(fragment);
            return;
        }
        int i3 = MediaSessionCompatQueueItem + 89;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r4 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r3 = 99 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        IconCompatParcelizer(r4);
        r4 = com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.MediaSessionCompatQueueItem + 43;
        com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.RatingCompat = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((r4 instanceof o.obtainTint8_81llA) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((r4 instanceof o.obtainTint8_81llA) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r4 = com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.RatingCompat + 91;
        com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.MediaSessionCompatQueueItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MediaSessionCompatQueueItem(o.div7Ah8Wj8 r3, androidx.fragment.app.Fragment r4) {
        /*
            r2 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.MediaSessionCompatQueueItem
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.RatingCompat = r1
            int r0 = r0 % r3
            if (r0 == 0) goto L19
            r4.getClass()
            boolean r0 = r4 instanceof o.obtainTint8_81llA
            r1 = 5
            int r1 = r1 / 0
            if (r0 != 0) goto L30
            goto L20
        L19:
            r4.getClass()
            boolean r0 = r4 instanceof o.obtainTint8_81llA
            if (r0 != 0) goto L30
        L20:
            int r4 = com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.RatingCompat
            int r4 = r4 + 91
            int r0 = r4 % 128
            com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.MediaSessionCompatQueueItem = r0
            int r4 = r4 % r3
            if (r4 != 0) goto L2f
            r3 = 99
            int r3 = r3 / 0
        L2f:
            return
        L30:
            r2.IconCompatParcelizer(r4)
            int r4 = com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.MediaSessionCompatQueueItem
            int r4 = r4 + 43
            int r0 = r4 % 128
            com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.RatingCompat = r0
            int r4 = r4 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks.MediaSessionCompatQueueItem(o.div7Ah8Wj8, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void MediaMetadataCompat(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fragment.getClass();
        if (!(fragment instanceof obtainTint8_81llA)) {
            int i4 = MediaSessionCompatQueueItem + 103;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        String str = ((obtainTint8_81llA) fragment).read().IconCompatParcelizer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer.get(fragment), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer("SentryFragmentTracker");
            forest.RemoteActionCompatParcelizer("SENTRY: Fragment '" + str + "' stopped but transaction still active - finishing as safety net", new Object[0]);
            IconCompatParcelizer(fragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IconCompatParcelizer(Fragment fragment) {
        long jCurrentTimeMillis;
        int i = 2 % 2;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = null;
        if (!(fragment instanceof obtainTint8_81llA)) {
            int i2 = RatingCompat + 9;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
            getchildstepiteratorandroid_sdk_ui_release.hashCode();
            throw null;
        }
        String str = ((obtainTint8_81llA) fragment).read().IconCompatParcelizer;
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.IconCompatParcelizer.remove(fragment);
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read();
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer("SentryFragmentTracker");
            forest.RemoteActionCompatParcelizer("SENTRY: Auto-finished TTFD span for Fragment '" + str + "' (reportSentryFullyDrawn was not called)", new Object[0]);
        }
        Long l = (Long) this.write.remove(fragment);
        Long l2 = (Long) this.RemoteActionCompatParcelizer.remove(fragment);
        if (l2 != null) {
            int i3 = MediaSessionCompatQueueItem + 33;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            jCurrentTimeMillis = l2.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.MediaDescriptionCompat.remove(fragment);
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null) {
            if (l != null) {
                long jLongValue = l.longValue();
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg1 instanceof getChildStepIteratorandroid_sdk_ui_release) {
                    int i5 = RatingCompat + 39;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    getchildstepiteratorandroid_sdk_ui_release = (getChildStepIteratorandroid_sdk_ui_release) r8lambdareqvhj3p9oule_afn8an0r0tlg1;
                }
                if (getchildstepiteratorandroid_sdk_ui_release != null) {
                    getchildstepiteratorandroid_sdk_ui_release.write("time_to_full_display", Long.valueOf(jCurrentTimeMillis - jLongValue), SetPushNotificationSubscriptionStep.MILLISECOND);
                }
            }
            r8lambdareqvhj3p9oule_afn8an0r0tlg1.read();
        }
        this.serializer.remove(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment, FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        Map map = this.serializer;
        fragment.getClass();
        fragmentActivity.getClass();
        boolean z = fragment instanceof obtainTint8_81llA;
        if (z) {
            obtainTint8_81llA obtaintint8_81lla = (obtainTint8_81llA) fragment;
            String str = obtaintint8_81lla.read().IconCompatParcelizer;
            BannerJavascriptInterface bannerJavascriptInterface = new BannerJavascriptInterface();
            Object obj = map.get(fragment);
            Boolean bool = Boolean.TRUE;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, bool}, getCieXyz.write())).booleanValue()) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.RemoteActionCompatParcelizer("SentryFragmentTracker");
                forest.RemoteActionCompatParcelizer("SENTRY: Fragment '" + str + "' already has active transaction - cleaning up old one", new Object[0]);
                IconCompatParcelizer(fragment);
            }
            toFocusDirection activity = fragment.getActivity();
            if (activity instanceof obtainTint8_81llA) {
                int i2 = MediaSessionCompatQueueItem + 37;
                RatingCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (((internalHeightCallbacklambda0.IconCompatParcelizer && PlaybackStateCompatCustomAction.serializer) ? internalHeightCallbacklambda0.IconCompatParcelizer().MediaMetadataCompat() : internalHeightCallbacklambda0.IconCompatParcelizer().read()) != null) {
                    int i4 = MediaSessionCompatQueueItem + 51;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                    forest2.RemoteActionCompatParcelizer("SentryFragmentTracker");
                    forest2.RemoteActionCompatParcelizer(ff$$ExternalSyntheticOutline0.m("SENTRY: Creating fragment transaction while activity '", ((obtainTint8_81llA) activity).read().IconCompatParcelizer, "' has active scoped transaction - ensuring independence"), new Object[0]);
                }
            }
            if (z) {
                String str2 = obtaintint8_81lla.read().IconCompatParcelizer;
                handleCardClicklambda4 handlecardclicklambda4 = new handleCardClicklambda4();
                handlecardclicklambda4.write = bannerJavascriptInterface;
                handlecardclicklambda4.serializer = r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU.OFF;
                AddToCustomAttributeArrayStep addToCustomAttributeArrayStepIconCompatParcelizer = internalHeightCallbacklambda0.IconCompatParcelizer();
                addToCustomAttributeArrayStepIconCompatParcelizer.getClass();
                getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseSerializer = addToCustomAttributeArrayStepIconCompatParcelizer.serializer(new defaultCardHandling(str2, "ui.load"), handlecardclicklambda4);
                getchildstepiteratorandroid_sdk_ui_releaseSerializer.write(str2);
                Map map2 = this.MediaDescriptionCompat;
                map2.getClass();
                map2.put(fragment, getchildstepiteratorandroid_sdk_ui_releaseSerializer);
                map.put(fragment, bool);
                Map map3 = this.write;
                map3.getClass();
                map3.put(fragment, Long.valueOf(System.currentTimeMillis()));
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = getchildstepiteratorandroid_sdk_ui_releaseSerializer.read("ui.load.full_display", str2.concat(" interactive"), bannerJavascriptInterface, ContainerStepgetChildStepIteratorinlinediterator2.SENTRY);
                this.read.read(r8lambdareqvhj3p9oule_afn8an0r0tlg0);
                Map map4 = this.IconCompatParcelizer;
                map4.getClass();
                map4.put(fragment, r8lambdareqvhj3p9oule_afn8an0r0tlg0);
                int i6 = RatingCompat + 117;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return;
            }
        }
        int i8 = MediaSessionCompatQueueItem + 113;
        RatingCompat = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            throw null;
        }
    }
}
