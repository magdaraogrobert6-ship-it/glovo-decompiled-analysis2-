package com.roadrunner.remoteconfig.firebase.data;

import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.remoteconfig.helper.RemoteConfigHelperV2;
import io.grpc.internal.SharedResourcePool;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.addGlobalCallbackParameter;
import o.addGlobalPartnerParameter;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.gdprForgetMe;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isOpenInternalroom_runtime;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.removeNodeAtDepth;
import o.requestFocusBypassUnfocusableComposeView;
import o.setOnReadyForComposition;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import org.json.JSONException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseRemoteConfigProvider {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final AtomicLong IconCompatParcelizer = new AtomicLong(0);
    public final SharedResourcePool read;
    public final FirebaseRemoteConfig serializer;
    public final SaveHeatmapUrlImpl write;

    public FirebaseRemoteConfigProvider(FirebaseRemoteConfig firebaseRemoteConfig, SharedResourcePool sharedResourcePool, SaveHeatmapUrlImpl saveHeatmapUrlImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.serializer = firebaseRemoteConfig;
        this.read = sharedResourcePool;
        this.write = saveHeatmapUrlImpl;
        LazyKt__LazyJVMKt.write(firebaseRemoteConfig.IconCompatParcelizer, new SentryEnvelopeItem$$ExternalSyntheticLambda3(firebaseRemoteConfig, 4, new requestFocusBypassUnfocusableComposeView(new requestFocusBypassUnfocusableComposeView(1))));
        firebaseRemoteConfig.IconCompatParcelizer();
        addGlobalPartnerParameter addglobalpartnerparameter = new addGlobalPartnerParameter(this);
        ProtobufEncoder protobufEncoder = firebaseRemoteConfig.write;
        synchronized (protobufEncoder) {
            ((LinkedHashSet) protobufEncoder.write).add(addglobalpartnerparameter);
            protobufEncoder.serializer();
        }
    }

    public final boolean IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 15;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            return ((FirebaseRemoteConfig) this.read.IconCompatParcelizer).read(str);
        }
        str.getClass();
        int i3 = 78 / 0;
        return ((FirebaseRemoteConfig) this.read.IconCompatParcelizer).read(str);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 35;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.write.serializer).edit();
            editorEdit.putBoolean("remote_config_cache_is_stale_key", z);
            editorEdit.apply();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SharedPreferences.Editor editorEdit2 = ((SharedPreferences) this.write.serializer).edit();
        editorEdit2.putBoolean("remote_config_cache_is_stale_key", z);
        editorEdit2.apply();
        int i3 = MediaSessionCompatQueueItem + 79;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final Set RemoteActionCompatParcelizer(String str) {
        List listRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strRemoteActionCompatParcelizer = gdprForgetMe.read.RemoteActionCompatParcelizer(read(str), "");
            char[] cArr = new char[1];
            cArr[1] = 25;
            listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, cArr);
        } else {
            listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(gdprForgetMe.read.RemoteActionCompatParcelizer(read(str), ""), new char[]{','});
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(listRemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        if ((r7 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r1 = o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(r1.IconCompatParcelizer, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        r7 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.RemoteActionCompatParcelizer + 79;
        com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.MediaSessionCompatQueueItem = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if ((r7 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r7 = 45 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(r7, "String");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r4 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.RemoteActionCompatParcelizer + 35;
        com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.MediaSessionCompatQueueItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
        r1.write(r2.serializer(), r7);
        r7 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.RemoteActionCompatParcelizer + 99;
        com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.MediaSessionCompatQueueItem = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String read(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.RemoteActionCompatParcelizer
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L26
            r7.getClass()
            io.grpc.internal.SharedResourcePool r1 = r6.read
            java.lang.Object r1 = r1.IconCompatParcelizer
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = (com.google.firebase.remoteconfig.FirebaseRemoteConfig) r1
            o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r1 = r1.MediaDescriptionCompat
            o.setOnReadyForComposition r2 = r1.serializer
            java.lang.String r3 = o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(r2, r7)
            r4 = 42
            int r4 = r4 / 0
            if (r3 == 0) goto L5a
            goto L39
        L26:
            r7.getClass()
            io.grpc.internal.SharedResourcePool r1 = r6.read
            java.lang.Object r1 = r1.IconCompatParcelizer
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = (com.google.firebase.remoteconfig.FirebaseRemoteConfig) r1
            o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r1 = r1.MediaDescriptionCompat
            o.setOnReadyForComposition r2 = r1.serializer
            java.lang.String r3 = o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(r2, r7)
            if (r3 == 0) goto L5a
        L39:
            int r4 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.RemoteActionCompatParcelizer
            int r4 = r4 + 35
            int r5 = r4 % 128
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.MediaSessionCompatQueueItem = r5
            int r4 = r4 % r0
            o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui r2 = r2.serializer()
            r1.write(r2, r7)
            int r7 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.RemoteActionCompatParcelizer
            int r7 = r7 + 99
            int r1 = r7 % 128
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.MediaSessionCompatQueueItem = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L55
            return r3
        L55:
            r7 = 0
            r7.hashCode()
            throw r7
        L5a:
            o.setOnReadyForComposition r1 = r1.IconCompatParcelizer
            java.lang.String r1 = o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(r1, r7)
            if (r1 == 0) goto L72
            int r7 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.RemoteActionCompatParcelizer
            int r7 = r7 + 79
            int r2 = r7 % 128
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.MediaSessionCompatQueueItem = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L71
            r7 = 45
            int r7 = r7 / 0
        L71:
            return r1
        L72:
            java.lang.String r0 = "String"
            o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(r7, r0)
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider.read(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: resetAndSyncRemoteConfig-IoAF18A, reason: not valid java name */
    public final Object m5015resetAndSyncRemoteConfigIoAF18A(ContinuationImpl continuationImpl) {
        FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1 firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1;
        int i = 2 % 2;
        if (continuationImpl instanceof FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1) {
            firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1 = (FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1) continuationImpl;
            int i2 = firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1 = new FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1(this, continuationImpl);
            }
        } else {
            firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1 = new FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1(this, continuationImpl);
        }
        Object objWithContext = firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 != 0) {
            int i4 = MediaSessionCompatQueueItem + 1;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            NafathModalUiModelImpl$1 nafathModalUiModelImpl$1 = new NafathModalUiModelImpl$1(this, shortNewsContentCardView, 9);
            firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.IconCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, nafathModalUiModelImpl$1, firebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1);
            if (objWithContext == coroutineSingletons) {
                int i5 = MediaSessionCompatQueueItem + 83;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 45 / 0;
                }
                return coroutineSingletons;
            }
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final long write(String str) {
        Long lValueOf;
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaSessionCompatQueueItem + 45;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        Long lValueOf2 = null;
        if (i4 % 2 != 0) {
            ((FirebaseRemoteConfig) this.read.IconCompatParcelizer).MediaDescriptionCompat.serializer.serializer();
            throw null;
        }
        r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r8lambdaevlm9gvgkdldswyuoh9jhyuv2u = ((FirebaseRemoteConfig) this.read.IconCompatParcelizer).MediaDescriptionCompat;
        setOnReadyForComposition setonreadyforcomposition = r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.serializer;
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer2 = setonreadyforcomposition.serializer();
        if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer2 != null) {
            try {
                lValueOf = Long.valueOf(setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer2.write.getLong(str));
            } catch (JSONException unused) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                i2 = MediaSessionCompatQueueItem + 51;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.write(setonreadyforcomposition.serializer(), str);
                    return lValueOf.longValue();
                }
                r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.write(setonreadyforcomposition.serializer(), str);
                lValueOf.longValue();
                throw null;
            }
            setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.IconCompatParcelizer.serializer();
            if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer == null) {
                int i5 = MediaSessionCompatQueueItem + 13;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                try {
                    lValueOf2 = Long.valueOf(setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.write.getLong(str));
                } catch (JSONException unused2) {
                }
            }
            if (lValueOf2 != null) {
                r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(str, "Long");
                return 0L;
            }
            long jLongValue = lValueOf2.longValue();
            i = RemoteActionCompatParcelizer + 15;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i7 = 48 / 0;
            }
            return jLongValue;
        }
        int i8 = RemoteActionCompatParcelizer + 9;
        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        lValueOf = null;
        if (lValueOf != null) {
            i2 = MediaSessionCompatQueueItem + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.write(setonreadyforcomposition.serializer(), str);
                return lValueOf.longValue();
            }
            r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.write(setonreadyforcomposition.serializer(), str);
            lValueOf.longValue();
            throw null;
        }
        setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.IconCompatParcelizer.serializer();
        if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer == null) {
            int i10 = MediaSessionCompatQueueItem + 13;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            lValueOf2 = Long.valueOf(setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.write.getLong(str));
        }
        if (lValueOf2 != null) {
            r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(str, "Long");
            return 0L;
        }
        long jLongValue2 = lValueOf2.longValue();
        i = RemoteActionCompatParcelizer + 15;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i12 = 48 / 0;
        }
        return jLongValue2;
    }

    public final String read(String str, String str2) {
        int i = 2 % 2;
        str.getClass();
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
        String str3 = read(str);
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
            int i2 = MediaSessionCompatQueueItem + 83;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return "";
        }
        try {
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc2 = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
            r8lambda3kmch7yklpui_5smgazrgczhglc2.getClass();
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            Map map = (Map) r8lambda3kmch7yklpui_5smgazrgczhglc2.serializer(str3, new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed));
            String str4 = (String) map.get(str2);
            if (str4 == null) {
                String str5 = (String) map.get("default");
                return str5 == null ? "" : str5;
            }
            int i4 = RemoteActionCompatParcelizer + 81;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return str4;
            }
            throw null;
        } catch (Exception e) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.getClass();
            if (Timber.read.length == 0) {
                return "";
            }
            forest.RemoteActionCompatParcelizer(e, "Failed to parse JSON for String using: ".concat(str3), new Object[0]);
            return "";
        }
    }

    public final boolean serializer(String str, String str2) {
        int i = 2 % 2;
        str.getClass();
        String str3 = read(str);
        if (str3.length() != 0) {
            if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str3, (CharSequence) "all", false)) {
                String strRemoteActionCompatParcelizer = gdprForgetMe.read.RemoteActionCompatParcelizer(str3, "");
                int i2 = 0;
                for (ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 : hideCurrentlyDisplayingInAppMessage.serializer(strRemoteActionCompatParcelizer, new char[]{','})) {
                    int i3 = MediaSessionCompatQueueItem + 61;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    ensuresubscribedtoinappmessageeventslambda7.getClass();
                    String str4 = hideCurrentlyDisplayingInAppMessage.read(strRemoteActionCompatParcelizer, ensuresubscribedtoinappmessageeventslambda7);
                    if (i2 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, str4}, getCieXyz.write())).booleanValue()) {
                        int i5 = RemoteActionCompatParcelizer;
                        int i6 = i5 + 21;
                        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (i2 < 0) {
                            break;
                        }
                        int i8 = i5 + 49;
                        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        int i10 = i5 + 13;
                        MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    } else {
                        i2++;
                    }
                }
            }
            int i12 = MediaSessionCompatQueueItem + 107;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                return true;
            }
            throw null;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    public final Object activate(ContinuationImpl continuationImpl) {
        addGlobalCallbackParameter addglobalcallbackparameter;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 97;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            boolean z = continuationImpl instanceof addGlobalCallbackParameter;
            throw null;
        }
        if (continuationImpl instanceof addGlobalCallbackParameter) {
            int i4 = i2 + 107;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            addglobalcallbackparameter = (addGlobalCallbackParameter) continuationImpl;
            int i6 = addglobalcallbackparameter.RemoteActionCompatParcelizer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = MediaSessionCompatQueueItem + 3;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                addglobalcallbackparameter.RemoteActionCompatParcelizer = i6 - Integer.MIN_VALUE;
            } else {
                addglobalcallbackparameter = new addGlobalCallbackParameter(this, continuationImpl);
            }
        } else {
            addglobalcallbackparameter = new addGlobalCallbackParameter(this, continuationImpl);
        }
        Object obj = addglobalcallbackparameter.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = addglobalcallbackparameter.RemoteActionCompatParcelizer;
        FirebaseRemoteConfig firebaseRemoteConfig = this.serializer;
        try {
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Task taskWrite = firebaseRemoteConfig.write();
                taskWrite.getClass();
                addglobalcallbackparameter.RemoteActionCompatParcelizer = 1;
                if (RangesKt.await(taskWrite, addglobalcallbackparameter) == coroutineSingletons) {
                    int i10 = RemoteActionCompatParcelizer + 69;
                    MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i9 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i12 = MediaSessionCompatQueueItem + 47;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i13 = 25 / 0;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
            }
            RemoteActionCompatParcelizer(false);
            this.IconCompatParcelizer.incrementAndGet();
            if (firebaseRemoteConfig.read("remote_config_real_time_log")) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null, "Remote Config activation ok", new Object[0]);
            }
        } catch (Exception e) {
            if (firebaseRemoteConfig.read("remote_config_real_time_log")) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Remote Config failure when activating", new Object[0]);
            }
        }
        return createFromParcel.INSTANCE;
    }

    public final Map IconCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        str.getClass();
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
        String str3 = read(str);
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
            try {
                r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc2 = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
                r8lambda3kmch7yklpui_5smgazrgczhglc2.getClass();
                Set<Map.Entry> setEntrySet = ((Map) r8lambda3kmch7yklpui_5smgazrgczhglc2.serializer(str3, new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.Companion.serializer()))).entrySet();
                int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(setEntrySet, 10));
                if (iRemoteActionCompatParcelizer < 16) {
                    iRemoteActionCompatParcelizer = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                int i4 = MediaSessionCompatQueueItem + 107;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put((String) entry.getKey(), RemoteConfigHelperV2.RemoteActionCompatParcelizer((r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) entry.getValue()));
                }
                Map map = (Map) linkedHashMap.get(str2);
                if (map != null || (map = (Map) linkedHashMap.get("default")) != null) {
                    return map;
                }
            } catch (Exception e) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.getClass();
                if (Timber.read.length != 0) {
                    forest.RemoteActionCompatParcelizer(e, "Failed to parse JSON for JsonObject using: ".concat(str3), new Object[0]);
                }
            }
        }
        return simpleItemTouchHelperCallback;
    }
}
