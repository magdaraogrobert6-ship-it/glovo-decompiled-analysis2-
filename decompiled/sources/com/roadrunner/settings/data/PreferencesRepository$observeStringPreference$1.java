package com.roadrunner.settings.data;

import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferencesRepository$observeStringPreference$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferencesRepository$observeStringPreference$1(r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = r8lambdah04qyyeozrxd4cfrstnkpb99_ds;
        this.serializer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        String str = this.serializer;
        r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            PreferencesRepository$observeStringPreference$1 preferencesRepository$observeStringPreference$1 = new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, str, shortNewsContentCardView, 0);
            preferencesRepository$observeStringPreference$1.read = obj;
            return preferencesRepository$observeStringPreference$1;
        }
        PreferencesRepository$observeStringPreference$1 preferencesRepository$observeStringPreference$2 = new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, str, shortNewsContentCardView, 1);
        preferencesRepository$observeStringPreference$2.read = obj;
        int i5 = MediaBrowserCompatMediaItem + 29;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return preferencesRepository$observeStringPreference$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return ((com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5 = ((com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1) create(r5, r6)).invokeSuspend(r2);
        r6 = com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1.MediaMetadataCompat + 87;
        com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1.MediaBrowserCompatMediaItem = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1.MediaBrowserCompatMediaItem
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = r4.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 r5 = (o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 78
            int r3 = r3 / 0
            if (r1 == 0) goto L3b
            goto L27
        L1d:
            int r1 = r4.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 r5 = (o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            if (r1 == 0) goto L3b
        L27:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1 r5 = (com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1.MediaMetadataCompat
            int r6 = r6 + 87
            int r1 = r6 % 128
            com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1.MediaBrowserCompatMediaItem = r1
            int r6 = r6 % r0
            return r5
        L3b:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1 r5 = (com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        final r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds = this.RemoteActionCompatParcelizer;
        final String str = this.serializer;
        final int i3 = 0;
        final int i4 = 1;
        if (i2 != 0) {
            InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.write;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                final ProducerCoroutine producerCoroutine = (ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
                producerCoroutine.b_(r8lambdah04qyyeozrxd4cfrstnkpb99_ds.IconCompatParcelizer(str));
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.r8lambdaHRwluKqjD4JKfrQ9il45KizXUm4
                    private static int RatingCompat = 1;
                    private static int RemoteActionCompatParcelizer;

                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        int i6 = 2 % 2;
                        int i7 = i4;
                        String str3 = str;
                        r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds2 = r8lambdah04qyyeozrxd4cfrstnkpb99_ds;
                        InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2 = producerCoroutine;
                        if (i7 != 0) {
                            ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2).b_(r8lambdah04qyyeozrxd4cfrstnkpb99_ds2.IconCompatParcelizer(str3));
                            int i8 = RemoteActionCompatParcelizer + 121;
                            RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            return;
                        }
                        ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2).b_(r8lambdah04qyyeozrxd4cfrstnkpb99_ds2.IconCompatParcelizer.getString(str3, null));
                        int i10 = RemoteActionCompatParcelizer + 9;
                        RatingCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    }
                };
                r8lambdah04qyyeozrxd4cfrstnkpb99_ds.IconCompatParcelizer.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                getPendingWebViewPauseRunnableandroid_sdk_ui_release getpendingwebviewpauserunnableandroid_sdk_ui_release = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, 12, onSharedPreferenceChangeListener);
                this.read = null;
                this.write = 1;
                return Room.awaitClose(producerCoroutine, getpendingwebviewpauserunnableandroid_sdk_ui_release, this) == coroutineSingletons ? coroutineSingletons : obj2;
            }
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = MediaMetadataCompat + 97;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            int i8 = MediaBrowserCompatMediaItem + 73;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i9 = 11 / 0;
            return obj2;
        }
        SharedPreferences sharedPreferences = r8lambdah04qyyeozrxd4cfrstnkpb99_ds.IconCompatParcelizer;
        InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.write;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            final ProducerCoroutine producerCoroutine2 = (ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2;
            producerCoroutine2.b_(sharedPreferences.getString(str, null));
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.r8lambdaHRwluKqjD4JKfrQ9il45KizXUm4
                private static int RatingCompat = 1;
                private static int RemoteActionCompatParcelizer;

                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str2) {
                    int i11 = 2 % 2;
                    int i12 = i3;
                    String str3 = str;
                    r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds2 = r8lambdah04qyyeozrxd4cfrstnkpb99_ds;
                    InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback3 = producerCoroutine2;
                    if (i12 != 0) {
                        ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback3).b_(r8lambdah04qyyeozrxd4cfrstnkpb99_ds2.IconCompatParcelizer(str3));
                        int i13 = RemoteActionCompatParcelizer + 121;
                        RatingCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        return;
                    }
                    ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback3).b_(r8lambdah04qyyeozrxd4cfrstnkpb99_ds2.IconCompatParcelizer.getString(str3, null));
                    int i15 = RemoteActionCompatParcelizer + 9;
                    RatingCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
            };
            sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
            getPendingWebViewPauseRunnableandroid_sdk_ui_release getpendingwebviewpauserunnableandroid_sdk_ui_release2 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, 13, onSharedPreferenceChangeListener2);
            this.read = null;
            this.write = 1;
            if (Room.awaitClose(producerCoroutine2, getpendingwebviewpauserunnableandroid_sdk_ui_release2, this) == coroutineSingletons2) {
                int i11 = MediaMetadataCompat + 49;
                MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                obj2 = coroutineSingletons2;
            }
        } else if (i10 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i13 = MediaBrowserCompatMediaItem + 5;
            MediaMetadataCompat = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            obj2 = null;
        }
        int i15 = MediaMetadataCompat + 33;
        MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
        if (i15 % 2 != 0) {
            return obj2;
        }
        throw null;
    }
}
