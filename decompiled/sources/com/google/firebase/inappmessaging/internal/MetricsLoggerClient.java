package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.ClientAppInfo;
import java.util.HashMap;
import java.util.concurrent.Executor;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.OwnerSnapshotObserveronCommitAffectingMeasure1;
import o.ParentDataModifierNode;
import o.PointerInputModifierNodeKt;
import o.TraversableNodeCompanion;
import o.accessgetOnCommitAffectingLayoutp;
import o.accesssetInstancecp;
import o.createComposition;
import o.disposeComposition;
import o.getEnableExtraAssertions;
import o.internalOnMeasureui;
import o.isTreeConsistent;
import o.logTree;
import o.observeMeasureSnapshotReadsui;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsLoggerClient {
    public static final HashMap IconCompatParcelizer;
    public static final HashMap write;
    public final accesssetInstancecp MediaBrowserCompatMediaItem;
    public final FirebaseApp MediaDescriptionCompat;
    public final TraversableNodeCompanion MediaMetadataCompat;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 RatingCompat;
    public final disposeComposition RemoteActionCompatParcelizer;
    public final logTree read;
    public final Executor serializer;

    static {
        HashMap map = new HashMap();
        IconCompatParcelizer = map;
        HashMap map2 = new HashMap();
        write = map2;
        map.put(OwnerSnapshotObserveronCommitAffectingMeasure1.UNSPECIFIED_RENDER_ERROR, PointerInputModifierNodeKt.UNSPECIFIED_RENDER_ERROR);
        map.put(OwnerSnapshotObserveronCommitAffectingMeasure1.IMAGE_FETCH_ERROR, PointerInputModifierNodeKt.IMAGE_FETCH_ERROR);
        map.put(OwnerSnapshotObserveronCommitAffectingMeasure1.IMAGE_DISPLAY_ERROR, PointerInputModifierNodeKt.IMAGE_DISPLAY_ERROR);
        map.put(OwnerSnapshotObserveronCommitAffectingMeasure1.IMAGE_UNSUPPORTED_FORMAT, PointerInputModifierNodeKt.IMAGE_UNSUPPORTED_FORMAT);
        map2.put(ParentDataModifierNode.AUTO, observeMeasureSnapshotReadsui.AUTO);
        map2.put(ParentDataModifierNode.CLICK, observeMeasureSnapshotReadsui.CLICK);
        map2.put(ParentDataModifierNode.SWIPE, observeMeasureSnapshotReadsui.SWIPE);
        map2.put(ParentDataModifierNode.UNKNOWN_DISMISS_TYPE, observeMeasureSnapshotReadsui.UNKNOWN_DISMISS_TYPE);
    }

    public static boolean serializer(createComposition createcomposition) {
        return (createcomposition == null || createcomposition.read() == null || createcomposition.read().isEmpty()) ? false : true;
    }

    public MetricsLoggerClient(OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0, logTree logtree, FirebaseApp firebaseApp, accesssetInstancecp accesssetinstancecp, disposeComposition disposecomposition, TraversableNodeCompanion traversableNodeCompanion, Executor executor) {
        this.RatingCompat = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        this.read = logtree;
        this.MediaDescriptionCompat = firebaseApp;
        this.MediaBrowserCompatMediaItem = accesssetinstancecp;
        this.RemoteActionCompatParcelizer = disposecomposition;
        this.MediaMetadataCompat = traversableNodeCompanion;
        this.serializer = executor;
    }

    public final void IconCompatParcelizer(internalOnMeasureui internalonmeasureui, String str, boolean z) {
        String strPlaybackStateCompat = internalonmeasureui.serializer().PlaybackStateCompat();
        String strMediaSessionCompatResultReceiverWrapper = internalonmeasureui.serializer().MediaSessionCompatResultReceiverWrapper();
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", strPlaybackStateCompat);
        bundle.putString("_nmn", strMediaSessionCompatResultReceiverWrapper);
        try {
            this.RemoteActionCompatParcelizer.getClass();
            bundle.putInt("_ndt", (int) (System.currentTimeMillis() / 1000));
        } catch (NumberFormatException e) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer("Error while parsing use_device_time in FIAM event: " + e.getMessage());
        }
        bundle.toString();
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        logTree logtree = this.read;
        if (logtree == null) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer("Unable to log event: analytics library is missing");
            return;
        }
        logtree.serializer("fiam", str, bundle);
        if (z) {
            logtree.RemoteActionCompatParcelizer("fiam:" + strPlaybackStateCompat, "fiam");
        }
    }

    public final getEnableExtraAssertions write(internalOnMeasureui internalonmeasureui, String str) {
        getEnableExtraAssertions getenableextraassertionsNewBuilder = CampaignAnalytics.newBuilder();
        getenableextraassertionsNewBuilder.write();
        FirebaseApp firebaseApp = this.MediaDescriptionCompat;
        firebaseApp.IconCompatParcelizer();
        isTreeConsistent istreeconsistent = firebaseApp.PlaybackStateCompatCustomAction;
        getenableextraassertionsNewBuilder.IconCompatParcelizer(istreeconsistent.RemoteActionCompatParcelizer);
        getenableextraassertionsNewBuilder.serializer(internalonmeasureui.serializer().PlaybackStateCompat());
        accessgetOnCommitAffectingLayoutp accessgetoncommitaffectinglayoutpNewBuilder = ClientAppInfo.newBuilder();
        firebaseApp.IconCompatParcelizer();
        accessgetoncommitaffectinglayoutpNewBuilder.serializer(istreeconsistent.IconCompatParcelizer);
        accessgetoncommitaffectinglayoutpNewBuilder.IconCompatParcelizer(str);
        getenableextraassertionsNewBuilder.IconCompatParcelizer(accessgetoncommitaffectinglayoutpNewBuilder);
        this.RemoteActionCompatParcelizer.getClass();
        getenableextraassertionsNewBuilder.RemoteActionCompatParcelizer(System.currentTimeMillis());
        return getenableextraassertionsNewBuilder;
    }
}
