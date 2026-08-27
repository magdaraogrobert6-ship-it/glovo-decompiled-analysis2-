package com.roadrunner.appperformance.tracker.sentry;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import io.sentry.util.PlaybackStateCompatCustomAction;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.AddToCustomAttributeArrayStep;
import o.BannerJavascriptInterface;
import o.ContainerStepgetChildStepIteratorinlinediterator2;
import o.ContentScaleCompanionFillWidth1;
import o.SetPushNotificationSubscriptionStep;
import o.defaultCardHandling;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.handleCardClicklambda4;
import o.internalHeightCallbacklambda0;
import o.obtainTint8_81llA;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryActivityScreenPerformanceCallbacks implements Application.ActivityLifecycleCallbacks {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final InitializeAppStartupItemsImpl write;
    public final Map MediaMetadataCompat = Collections.synchronizedMap(new WeakHashMap());
    public final Map read = Collections.synchronizedMap(new WeakHashMap());
    public final Map IconCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());
    public final Map serializer = Collections.synchronizedMap(new WeakHashMap());
    public final Map RemoteActionCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i3 | i4);
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i6));
        int i12 = i9 | i3;
        int i13 = (~i10) | i6;
        int i14 = i6 + i3 + i2 + ((-1587644119) * i) + (1302866265 * i5);
        int i15 = i14 * i14;
        int i16 = (i6 * (-1579585154)) + 1163788288 + ((-1579585154) * i3) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i2) + (1500774400 * i) + ((-1456209920) * i5) + ((-2144468992) * i15);
        int i17 = ((i6 * (-855313886)) - 1253577507) + (i3 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i2 * (-855313873)) + (i * (-1467678585)) + (i5 * 593082711) + (i15 * 74579968);
        return i16 + ((i17 * i17) * (-1668153344)) != 1 ? write(objArr) : serializer(objArr);
    }

    public SentryActivityScreenPerformanceCallbacks(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.write = initializeAppStartupItemsImpl;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = MediaDescriptionCompat + 121;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        activity.getClass();
        int i3 = RatingCompat + 57;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        bundle.getClass();
        int i4 = MediaDescriptionCompat + 1;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        write(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r4 instanceof o.obtainTint8_81llA) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((r4 instanceof o.obtainTint8_81llA) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r4 = com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks.RatingCompat + 37;
        com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks.MediaDescriptionCompat = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityPaused(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks.MediaDescriptionCompat
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks.RatingCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            r4.getClass()
            boolean r1 = r4 instanceof o.obtainTint8_81llA
            r2 = 31
            int r2 = r2 / 0
            if (r1 != 0) goto L2b
            goto L21
        L1a:
            r4.getClass()
            boolean r1 = r4 instanceof o.obtainTint8_81llA
            if (r1 != 0) goto L2b
        L21:
            int r4 = com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks.RatingCompat
            int r4 = r4 + 37
            int r1 = r4 % 128
            com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks.MediaDescriptionCompat = r1
            int r4 = r4 % r0
            return
        L2b:
            r3.write(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks.onActivityPaused(android.app.Activity):void");
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        SentryActivityScreenPerformanceCallbacks sentryActivityScreenPerformanceCallbacks = (SentryActivityScreenPerformanceCallbacks) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 99;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            int i4 = RatingCompat + 43;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                sentryActivityScreenPerformanceCallbacks.serializer(activity);
                throw null;
            }
            sentryActivityScreenPerformanceCallbacks.serializer(activity);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 111;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            if (Build.VERSION.SDK_INT < 42) {
                serializer(activity);
            }
        } else {
            activity.getClass();
            if (Build.VERSION.SDK_INT < 29) {
                serializer(activity);
            }
        }
        int i3 = MediaDescriptionCompat + 105;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        SentryFragmentScreenPerformanceCallbacks sentryFragmentScreenPerformanceCallbacks;
        SentryActivityScreenPerformanceCallbacks sentryActivityScreenPerformanceCallbacks = (SentryActivityScreenPerformanceCallbacks) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        activity.getClass();
        Object obj = null;
        if (activity instanceof obtainTint8_81llA) {
            int i2 = MediaDescriptionCompat + 109;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                sentryActivityScreenPerformanceCallbacks.MediaMetadataCompat.get(activity);
                obj.hashCode();
                throw null;
            }
            if (sentryActivityScreenPerformanceCallbacks.MediaMetadataCompat.get(activity) != null) {
                int i3 = RatingCompat + 15;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.RemoteActionCompatParcelizer("SentryScreenTracker");
                forest.RemoteActionCompatParcelizer("SENTRY: Activity destroyed but transaction still active - final cleanup", new Object[0]);
                sentryActivityScreenPerformanceCallbacks.write(activity);
            }
        }
        if ((activity instanceof FragmentActivity) && (sentryFragmentScreenPerformanceCallbacks = (SentryFragmentScreenPerformanceCallbacks) sentryActivityScreenPerformanceCallbacks.IconCompatParcelizer.remove(activity)) != null) {
            int i5 = MediaDescriptionCompat + 79;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            ((FragmentActivity) activity).getSupportFragmentManager().read(sentryFragmentScreenPerformanceCallbacks);
            int i7 = RatingCompat + 67;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0033, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        String str;
        int i = 2 % 2;
        int i2 = RatingCompat + 51;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            int i3 = 29 / 0;
            if (activity instanceof obtainTint8_81llA) {
                str = ((obtainTint8_81llA) activity).read().IconCompatParcelizer;
                if (this.MediaMetadataCompat.get(activity) != null) {
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    forest.RemoteActionCompatParcelizer("SentryScreenTracker");
                    forest.RemoteActionCompatParcelizer("SENTRY: Activity '" + str + "' stopped but transaction still active - finishing as safety net", new Object[0]);
                    write(activity);
                }
            }
        } else {
            activity.getClass();
            if (activity instanceof obtainTint8_81llA) {
                str = ((obtainTint8_81llA) activity).read().IconCompatParcelizer;
                if (this.MediaMetadataCompat.get(activity) != null) {
                    Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                    forest2.RemoteActionCompatParcelizer("SentryScreenTracker");
                    forest2.RemoteActionCompatParcelizer("SENTRY: Activity '" + str + "' stopped but transaction still active - finishing as safety net", new Object[0]);
                    write(activity);
                }
            }
        }
        int i4 = RatingCompat + 73;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void write(Activity activity) {
        long jCurrentTimeMillis;
        SetPushNotificationSubscriptionStep setPushNotificationSubscriptionStep;
        long j;
        int i = 2 % 2;
        if (activity instanceof obtainTint8_81llA) {
            String str = ((obtainTint8_81llA) activity).read().IconCompatParcelizer;
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.read.remove(activity);
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read();
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.RemoteActionCompatParcelizer("SentryScreenTracker");
                forest.RemoteActionCompatParcelizer("SENTRY: Auto-finished TTFD span for Activity '" + str + "'", new Object[0]);
            }
            Long l = (Long) this.serializer.remove(activity);
            Long l2 = (Long) this.RemoteActionCompatParcelizer.remove(activity);
            if (l2 != null) {
                int i2 = RatingCompat + 83;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    l2.longValue();
                    throw null;
                }
                jCurrentTimeMillis = l2.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.MediaMetadataCompat.remove(activity);
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null) {
                if (l != null) {
                    int i3 = RatingCompat + 53;
                    MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        l.longValue();
                        boolean z = r8lambdareqvhj3p9oule_afn8an0r0tlg1 instanceof getChildStepIteratorandroid_sdk_ui_release;
                        throw null;
                    }
                    long jLongValue = l.longValue();
                    getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = r8lambdareqvhj3p9oule_afn8an0r0tlg1 instanceof getChildStepIteratorandroid_sdk_ui_release ? (getChildStepIteratorandroid_sdk_ui_release) r8lambdareqvhj3p9oule_afn8an0r0tlg1 : null;
                    if (getchildstepiteratorandroid_sdk_ui_release != null) {
                        int i4 = RatingCompat + 73;
                        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            setPushNotificationSubscriptionStep = SetPushNotificationSubscriptionStep.MILLISECOND;
                            j = jCurrentTimeMillis & jLongValue;
                        } else {
                            setPushNotificationSubscriptionStep = SetPushNotificationSubscriptionStep.MILLISECOND;
                            j = jCurrentTimeMillis - jLongValue;
                        }
                        getchildstepiteratorandroid_sdk_ui_release.write("time_to_full_display", Long.valueOf(j), setPushNotificationSubscriptionStep);
                    }
                }
                r8lambdareqvhj3p9oule_afn8an0r0tlg1.read();
                int i5 = RatingCompat + 79;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        int i7 = MediaDescriptionCompat + 23;
        RatingCompat = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void serializer(Activity activity) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat;
        int i = 2 % 2;
        InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = this.write;
        BannerJavascriptInterface bannerJavascriptInterface = new BannerJavascriptInterface();
        if (activity instanceof FragmentActivity) {
            SentryFragmentScreenPerformanceCallbacks sentryFragmentScreenPerformanceCallbacks = new SentryFragmentScreenPerformanceCallbacks(initializeAppStartupItemsImpl);
            ((FragmentActivity) activity).getSupportFragmentManager().RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) sentryFragmentScreenPerformanceCallbacks, true);
            Map map = this.IconCompatParcelizer;
            map.getClass();
            map.put(activity, sentryFragmentScreenPerformanceCallbacks);
        }
        Object obj = null;
        if (!(activity instanceof obtainTint8_81llA)) {
            int i2 = RatingCompat + 121;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        String str = ((obtainTint8_81llA) activity).read().IconCompatParcelizer;
        BannerJavascriptInterface bannerJavascriptInterface2 = new BannerJavascriptInterface();
        if (internalHeightCallbacklambda0.IconCompatParcelizer) {
            int i3 = MediaDescriptionCompat + 89;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                boolean z = PlaybackStateCompatCustomAction.serializer;
                obj.hashCode();
                throw null;
            }
            if (PlaybackStateCompatCustomAction.serializer) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = internalHeightCallbacklambda0.IconCompatParcelizer().MediaMetadataCompat();
            } else {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = internalHeightCallbacklambda0.IconCompatParcelizer().read();
            }
        } else {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = internalHeightCallbacklambda0.IconCompatParcelizer().read();
        }
        Object[] objArr = {internalHeightCallbacklambda0.IconCompatParcelizer(), null, r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat};
        handleCardClicklambda4 handlecardclicklambda4 = new handleCardClicklambda4();
        handlecardclicklambda4.write = bannerJavascriptInterface2;
        handlecardclicklambda4.serializer = r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU.ON;
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStepIconCompatParcelizer = internalHeightCallbacklambda0.IconCompatParcelizer();
        addToCustomAttributeArrayStepIconCompatParcelizer.getClass();
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseSerializer = addToCustomAttributeArrayStepIconCompatParcelizer.serializer(new defaultCardHandling(str, "ui.load"), handlecardclicklambda4);
        getchildstepiteratorandroid_sdk_ui_releaseSerializer.write(str);
        Map map2 = this.MediaMetadataCompat;
        map2.getClass();
        map2.put(activity, getchildstepiteratorandroid_sdk_ui_releaseSerializer);
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = getchildstepiteratorandroid_sdk_ui_releaseSerializer.read("ui.load.full_display", str.concat(" interactive"), bannerJavascriptInterface, ContainerStepgetChildStepIteratorinlinediterator2.SENTRY);
        initializeAppStartupItemsImpl.read(r8lambdareqvhj3p9oule_afn8an0r0tlg0);
        Map map3 = this.read;
        map3.getClass();
        map3.put(activity, r8lambdareqvhj3p9oule_afn8an0r0tlg0);
        Map map4 = this.serializer;
        map4.getClass();
        map4.put(activity, Long.valueOf(System.currentTimeMillis()));
        int i4 = RatingCompat + 99;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        int iWrite = ContentScaleCompanionFillWidth1.write();
        int iWrite2 = ContentScaleCompanionFillWidth1.write();
        read(ContentScaleCompanionFillWidth1.write(), iWrite2, -180320978, iWrite, ContentScaleCompanionFillWidth1.write(), new Object[]{this, activity, bundle}, 180320979);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int iWrite = ContentScaleCompanionFillWidth1.write();
        int iWrite2 = ContentScaleCompanionFillWidth1.write();
        read(ContentScaleCompanionFillWidth1.write(), iWrite2, 1170602370, iWrite, ContentScaleCompanionFillWidth1.write(), new Object[]{this, activity}, -1170602370);
    }
}
