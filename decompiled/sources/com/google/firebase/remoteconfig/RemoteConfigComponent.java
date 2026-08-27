package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AndroidComposeViewCompanion;
import o.AndroidComposeViewExternalSyntheticLambda1;
import o.accessremoveNotificationForSysPropsChange;
import o.accesssetInstancecp;
import o.invalidateAlignmentLinesFromPositionChange;
import o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U;
import o.requestFocusViewFocusFix;
import o.setComposeViewContext;
import o.setContentCaptureManagerui;
import o.setOnReadyForComposition;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteConfigComponent implements accessremoveNotificationForSysPropsChange {
    public final String IconCompatParcelizer;
    public final ScheduledExecutorService MediaBrowserCompatMediaItem;
    public final accesssetInstancecp MediaDescriptionCompat;
    public final FirebaseApp MediaMetadataCompat;
    public final FirebaseABTesting RatingCompat;
    public final AbstractComposeViewExternalSyntheticLambda0 serializer;
    public final Context write;
    public static final Random read = new Random();
    public static final HashMap RemoteActionCompatParcelizer = new HashMap();
    public final HashMap ParcelableVolumeInfo = new HashMap();
    public final HashMap MediaSessionCompatQueueItem = new HashMap();

    public final FirebaseRemoteConfig write(String str) {
        FirebaseRemoteConfig firebaseRemoteConfigWrite;
        synchronized (this) {
            try {
                setOnReadyForComposition setonreadyforcomposition = read(str, "fetch");
                setOnReadyForComposition setonreadyforcomposition2 = read(str, "activate");
                setOnReadyForComposition setonreadyforcomposition3 = read(str, "defaults");
                AndroidComposeViewCompanion androidComposeViewCompanion = new AndroidComposeViewCompanion(this.write.getSharedPreferences("frc_" + this.IconCompatParcelizer + BundleUtil.UNDERLINE_TAG + str + "_settings", 0));
                r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r8lambdaevlm9gvgkdldswyuoh9jhyuv2u = new r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U(this.MediaBrowserCompatMediaItem, setonreadyforcomposition2, setonreadyforcomposition3);
                FirebaseApp firebaseApp = this.MediaMetadataCompat;
                AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = this.serializer;
                firebaseApp.IconCompatParcelizer();
                zzbv zzbvVar = (firebaseApp.ParcelableVolumeInfo.equals("[DEFAULT]") && str.equals("firebase")) ? new zzbv(abstractComposeViewExternalSyntheticLambda0) : null;
                if (zzbvVar != null) {
                    requestFocusViewFocusFix requestfocusviewfocusfix = new requestFocusViewFocusFix(zzbvVar);
                    synchronized (r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.MediaBrowserCompatMediaItem) {
                        r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.MediaBrowserCompatMediaItem.add(requestfocusviewfocusfix);
                    }
                }
                zzbv zzbvVar2 = new zzbv(27);
                zzbvVar2.write = setonreadyforcomposition2;
                zzbvVar2.RemoteActionCompatParcelizer = setonreadyforcomposition3;
                ScheduledExecutorService scheduledExecutorService = this.MediaBrowserCompatMediaItem;
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
                imageLoader$Builder.serializer = Collections.newSetFromMap(new ConcurrentHashMap());
                imageLoader$Builder.RemoteActionCompatParcelizer = setonreadyforcomposition2;
                imageLoader$Builder.IconCompatParcelizer = zzbvVar2;
                imageLoader$Builder.read = scheduledExecutorService;
                firebaseRemoteConfigWrite = write(this.MediaMetadataCompat, str, this.MediaDescriptionCompat, this.RatingCompat, this.MediaBrowserCompatMediaItem, setonreadyforcomposition, setonreadyforcomposition2, setonreadyforcomposition3, serializer(str, setonreadyforcomposition, androidComposeViewCompanion), r8lambdaevlm9gvgkdldswyuoh9jhyuv2u, androidComposeViewCompanion, imageLoader$Builder);
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseRemoteConfigWrite;
    }

    public final ConfigFetchHandler serializer(String str, setOnReadyForComposition setonreadyforcomposition, AndroidComposeViewCompanion androidComposeViewCompanion) {
        AbstractComposeViewExternalSyntheticLambda0 invalidatealignmentlinesfrompositionchange;
        ConfigFetchHandler configFetchHandler;
        synchronized (this) {
            accesssetInstancecp accesssetinstancecp = this.MediaDescriptionCompat;
            FirebaseApp firebaseApp = this.MediaMetadataCompat;
            firebaseApp.IconCompatParcelizer();
            if (firebaseApp.ParcelableVolumeInfo.equals("[DEFAULT]")) {
                invalidatealignmentlinesfrompositionchange = this.serializer;
            } else {
                invalidatealignmentlinesfrompositionchange = new invalidateAlignmentLinesFromPositionChange(10);
            }
            AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = invalidatealignmentlinesfrompositionchange;
            ScheduledExecutorService scheduledExecutorService = this.MediaBrowserCompatMediaItem;
            Random random = read;
            FirebaseApp firebaseApp2 = this.MediaMetadataCompat;
            firebaseApp2.IconCompatParcelizer();
            String str2 = firebaseApp2.PlaybackStateCompatCustomAction.write;
            FirebaseApp firebaseApp3 = this.MediaMetadataCompat;
            firebaseApp3.IconCompatParcelizer();
            configFetchHandler = new ConfigFetchHandler(accesssetinstancecp, abstractComposeViewExternalSyntheticLambda0, scheduledExecutorService, random, setonreadyforcomposition, new ConfigFetchHttpClient(this.write, firebaseApp3.PlaybackStateCompatCustomAction.IconCompatParcelizer, str2, str, androidComposeViewCompanion.read.getLong("fetch_timeout_in_seconds", 60L), androidComposeViewCompanion.read.getLong("fetch_timeout_in_seconds", 60L)), androidComposeViewCompanion, this.MediaSessionCompatQueueItem);
        }
        return configFetchHandler;
    }

    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, accesssetInstancecp accesssetinstancecp, FirebaseABTesting firebaseABTesting, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.write = context;
        this.MediaBrowserCompatMediaItem = scheduledExecutorService;
        this.MediaMetadataCompat = firebaseApp;
        this.MediaDescriptionCompat = accesssetinstancecp;
        this.RatingCompat = firebaseABTesting;
        this.serializer = abstractComposeViewExternalSyntheticLambda0;
        firebaseApp.IconCompatParcelizer();
        this.IconCompatParcelizer = firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer;
        AtomicReference atomicReference = setComposeViewContext.read;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = setComposeViewContext.read;
        if (atomicReference2.get() == null) {
            setComposeViewContext setcomposeviewcontext = new setComposeViewContext();
            while (!atomicReference2.compareAndSet(null, setcomposeviewcontext)) {
                if (atomicReference2.get() != null) {
                }
            }
            BackgroundDetector.read(application);
            BackgroundDetector.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setcomposeviewcontext);
        }
        LazyKt__LazyJVMKt.write(scheduledExecutorService, new setContentCaptureManagerui(0, this));
    }

    public final setOnReadyForComposition read(String str, String str2) {
        AndroidComposeViewExternalSyntheticLambda1 androidComposeViewExternalSyntheticLambda1;
        setOnReadyForComposition setonreadyforcomposition;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("frc_", this.IconCompatParcelizer, BundleUtil.UNDERLINE_TAG, str, BundleUtil.UNDERLINE_TAG), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.MediaBrowserCompatMediaItem;
        Context context = this.write;
        HashMap map = AndroidComposeViewExternalSyntheticLambda1.RemoteActionCompatParcelizer;
        synchronized (AndroidComposeViewExternalSyntheticLambda1.class) {
            HashMap map2 = AndroidComposeViewExternalSyntheticLambda1.RemoteActionCompatParcelizer;
            if (!map2.containsKey(strM)) {
                map2.put(strM, new AndroidComposeViewExternalSyntheticLambda1(context, strM));
            }
            androidComposeViewExternalSyntheticLambda1 = (AndroidComposeViewExternalSyntheticLambda1) map2.get(strM);
        }
        HashMap map3 = setOnReadyForComposition.write;
        synchronized (setOnReadyForComposition.class) {
            String str3 = androidComposeViewExternalSyntheticLambda1.IconCompatParcelizer;
            HashMap map4 = setOnReadyForComposition.write;
            if (!map4.containsKey(str3)) {
                map4.put(str3, new setOnReadyForComposition(scheduledExecutorService, androidComposeViewExternalSyntheticLambda1));
            }
            setonreadyforcomposition = (setOnReadyForComposition) map4.get(str3);
        }
        return setonreadyforcomposition;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final FirebaseRemoteConfig write(FirebaseApp firebaseApp, String str, accesssetInstancecp accesssetinstancecp, FirebaseABTesting firebaseABTesting, Executor executor, setOnReadyForComposition setonreadyforcomposition, setOnReadyForComposition setonreadyforcomposition2, setOnReadyForComposition setonreadyforcomposition3, ConfigFetchHandler configFetchHandler, r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r8lambdaevlm9gvgkdldswyuoh9jhyuv2u, AndroidComposeViewCompanion androidComposeViewCompanion, ImageLoader$Builder imageLoader$Builder) {
        String str2;
        FirebaseRemoteConfig firebaseRemoteConfig;
        FirebaseABTesting firebaseABTesting2;
        Context context;
        synchronized (this) {
            if (this.ParcelableVolumeInfo.containsKey(str)) {
                str2 = str;
            } else {
                Context context2 = this.write;
                if (str.equals("firebase")) {
                    firebaseApp.IconCompatParcelizer();
                    if (firebaseApp.ParcelableVolumeInfo.equals("[DEFAULT]")) {
                        firebaseABTesting2 = firebaseABTesting;
                    }
                    context = this.write;
                    synchronized (this) {
                        ScheduledExecutorService scheduledExecutorService = this.MediaBrowserCompatMediaItem;
                        ProtobufEncoder protobufEncoder = new ProtobufEncoder();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        protobufEncoder.write = linkedHashSet;
                        protobufEncoder.serializer = new ConfigRealtimeHttpClient(firebaseApp, accesssetinstancecp, configFetchHandler, setonreadyforcomposition2, context, str, linkedHashSet, androidComposeViewCompanion, scheduledExecutorService);
                        protobufEncoder.RemoteActionCompatParcelizer = scheduledExecutorService;
                        FirebaseRemoteConfig firebaseRemoteConfig2 = new FirebaseRemoteConfig(context2, firebaseABTesting2, executor, setonreadyforcomposition, setonreadyforcomposition2, setonreadyforcomposition3, configFetchHandler, r8lambdaevlm9gvgkdldswyuoh9jhyuv2u, androidComposeViewCompanion, protobufEncoder, imageLoader$Builder);
                        setonreadyforcomposition2.read();
                        setonreadyforcomposition3.read();
                        setonreadyforcomposition.read();
                        str2 = str;
                        this.ParcelableVolumeInfo.put(str2, firebaseRemoteConfig2);
                        RemoteActionCompatParcelizer.put(str2, firebaseRemoteConfig2);
                    }
                }
                firebaseABTesting2 = null;
                context = this.write;
                synchronized (this) {
                    ScheduledExecutorService scheduledExecutorService2 = this.MediaBrowserCompatMediaItem;
                    ProtobufEncoder protobufEncoder2 = new ProtobufEncoder();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    protobufEncoder2.write = linkedHashSet2;
                    protobufEncoder2.serializer = new ConfigRealtimeHttpClient(firebaseApp, accesssetinstancecp, configFetchHandler, setonreadyforcomposition2, context, str, linkedHashSet2, androidComposeViewCompanion, scheduledExecutorService2);
                    protobufEncoder2.RemoteActionCompatParcelizer = scheduledExecutorService2;
                    FirebaseRemoteConfig firebaseRemoteConfig3 = new FirebaseRemoteConfig(context2, firebaseABTesting2, executor, setonreadyforcomposition, setonreadyforcomposition2, setonreadyforcomposition3, configFetchHandler, r8lambdaevlm9gvgkdldswyuoh9jhyuv2u, androidComposeViewCompanion, protobufEncoder2, imageLoader$Builder);
                    setonreadyforcomposition2.read();
                    setonreadyforcomposition3.read();
                    setonreadyforcomposition.read();
                    str2 = str;
                    this.ParcelableVolumeInfo.put(str2, firebaseRemoteConfig3);
                    RemoteActionCompatParcelizer.put(str2, firebaseRemoteConfig3);
                }
            }
            firebaseRemoteConfig = (FirebaseRemoteConfig) this.ParcelableVolumeInfo.get(str2);
        }
        return firebaseRemoteConfig;
    }
}
