package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda0;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ranges.RangesKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.accesssetAddChangeCallbackMethodcp;
import o.accesssetInstancecp;
import o.getWindowInfoannotations;
import o.handleMotionEvent8iAsVTc;
import o.isTreeConsistent;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.scheduleMeasureAndLayout;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformance {
    public static final getWindowInfoannotations RemoteActionCompatParcelizer = getWindowInfoannotations.write();
    public final ConcurrentHashMap read = new ConcurrentHashMap();

    public final void write(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.read;
        try {
            str = str.trim();
            str2 = str2.trim();
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("Attribute must not have null key or value.");
            }
            if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
            }
            handleMotionEvent8iAsVTc.write(str, str2);
            z = true;
            if (z) {
                concurrentHashMap.put(str, str2);
            }
        } catch (Exception e) {
            RemoteActionCompatParcelizer.read("Can not set attribute %s with value %s (%s)", str, str2, e.getMessage());
            z = false;
        }
    }

    public FirebasePerformance(FirebaseApp firebaseApp, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, accesssetInstancecp accesssetinstancecp, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1, RemoteConfigManager remoteConfigManager, accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp, SessionManager sessionManager) {
        Bundle bundle;
        if (firebaseApp == null) {
            new scheduleMeasureAndLayout(new Bundle());
            return;
        }
        isTreeConsistent istreeconsistent = firebaseApp.PlaybackStateCompatCustomAction;
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = moveFocusInChildrenViewFocusFix3ESFkO8.write;
        movefocusinchildrenviewfocusfix3esfko8.MediaMetadataCompat = firebaseApp;
        firebaseApp.IconCompatParcelizer();
        movefocusinchildrenviewfocusfix3esfko8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = istreeconsistent.MediaDescriptionCompat;
        movefocusinchildrenviewfocusfix3esfko8.MediaDescriptionCompat = accesssetinstancecp;
        movefocusinchildrenviewfocusfix3esfko8.PlaybackStateCompat = abstractComposeViewExternalSyntheticLambda1;
        movefocusinchildrenviewfocusfix3esfko8.MediaBrowserCompatMediaItem.execute(new TransportManager$$ExternalSyntheticLambda0(movefocusinchildrenviewfocusfix3esfko8, 1));
        firebaseApp.IconCompatParcelizer();
        Context context = firebaseApp.read;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            e.getMessage();
            bundle = null;
        }
        scheduleMeasureAndLayout schedulemeasureandlayout = bundle != null ? new scheduleMeasureAndLayout(bundle) : new scheduleMeasureAndLayout();
        remoteConfigManager.setFirebaseRemoteConfigProvider(abstractComposeViewExternalSyntheticLambda0);
        accesssetaddchangecallbackmethodcp.write = schedulemeasureandlayout;
        accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer.write = RangesKt.serializer(context);
        accesssetaddchangecallbackmethodcp.read.IconCompatParcelizer(context);
        sessionManager.setApplicationContext(context);
        Boolean boolSerializer = accesssetaddchangecallbackmethodcp.serializer();
        getWindowInfoannotations getwindowinfoannotations = RemoteActionCompatParcelizer;
        if (getwindowinfoannotations.write) {
            if (boolSerializer != null ? boolSerializer.booleanValue() : FirebaseApp.write().RemoteActionCompatParcelizer()) {
                firebaseApp.IconCompatParcelizer();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(Options.Companion.RemoteActionCompatParcelizer(istreeconsistent.MediaDescriptionCompat, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (getwindowinfoannotations.write) {
                    getwindowinfoannotations.read.getClass();
                }
            }
        }
    }

    public static FirebasePerformance read() {
        return (FirebasePerformance) FirebaseApp.write().write(FirebasePerformance.class);
    }
}
