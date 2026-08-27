package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.FirebaseApp;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.util.List;
import o.accessgetPointerInputSourcecp;
import o.calculateLocalPositionMKHz9U;
import o.createLayerdefault;
import o.getShouldAttachOnInsert;
import o.headH91voCIui;
import o.markAsAttached;
import o.setAfter;
import o.shareWithSiblings;
import o.updatePlacedUnderMotionFrameOfReference;
import o.visitNodesaLcG6gQ;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseFirestore {
    public final GooglePlayLocationUtils$$ExternalSyntheticLambda18 IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final visitNodesaLcG6gQ MediaMetadataCompat;
    public final createLayerdefault MediaSessionCompatQueueItem;
    public final markAsAttached RatingCompat;
    public final getShouldAttachOnInsert RemoteActionCompatParcelizer;
    public final setAfter read;
    public final x serializer;
    public final Context write;

    @Keep
    public static void setClientLanguage(String str) {
        calculateLocalPositionMKHz9U.read = str;
    }

    public final headH91voCIui write(String str) {
        this.serializer.write();
        shareWithSiblings sharewithsiblingsIconCompatParcelizer = shareWithSiblings.IconCompatParcelizer(str);
        headH91voCIui headh91vociui = new headH91voCIui(accessgetPointerInputSourcecp.IconCompatParcelizer(sharewithsiblingsIconCompatParcelizer), this);
        List list = sharewithsiblingsIconCompatParcelizer.IconCompatParcelizer;
        if (list.size() % 2 == 1) {
            return headh91vociui;
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(list.size(), sharewithsiblingsIconCompatParcelizer.write(), " has ", "Invalid collection reference. Collection references must have an odd number of segments, but ");
        return null;
    }

    public FirebaseFirestore(Context context, visitNodesaLcG6gQ visitnodesalcg6gq, String str, setAfter setafter, getShouldAttachOnInsert getshouldattachoninsert, GooglePlayLocationUtils$$ExternalSyntheticLambda18 googlePlayLocationUtils$$ExternalSyntheticLambda18, createLayerdefault createlayerdefault) {
        context.getClass();
        this.write = context;
        this.MediaMetadataCompat = visitnodesalcg6gq;
        str.getClass();
        this.MediaBrowserCompatMediaItem = str;
        this.read = setafter;
        this.RemoteActionCompatParcelizer = getshouldattachoninsert;
        this.IconCompatParcelizer = googlePlayLocationUtils$$ExternalSyntheticLambda18;
        this.serializer = new x(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(10, this));
        this.MediaSessionCompatQueueItem = createlayerdefault;
        this.RatingCompat = new markAsAttached();
    }

    public static FirebaseFirestore IconCompatParcelizer(Context context, FirebaseApp firebaseApp, updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreference, updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreference2, createLayerdefault createlayerdefault) {
        firebaseApp.IconCompatParcelizer();
        String str = firebaseApp.PlaybackStateCompatCustomAction.MediaDescriptionCompat;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("FirebaseOptions.getProjectId() cannot be null");
            return null;
        }
        visitNodesaLcG6gQ visitnodesalcg6gq = new visitNodesaLcG6gQ(str, "(default)");
        setAfter setafter = new setAfter();
        updateplacedundermotionframeofreference.IconCompatParcelizer(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(12, setafter));
        getShouldAttachOnInsert getshouldattachoninsert = new getShouldAttachOnInsert();
        updateplacedundermotionframeofreference2.IconCompatParcelizer(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(11, getshouldattachoninsert));
        firebaseApp.IconCompatParcelizer();
        return new FirebaseFirestore(context, visitnodesalcg6gq, firebaseApp.ParcelableVolumeInfo, setafter, getshouldattachoninsert, new GooglePlayLocationUtils$$ExternalSyntheticLambda18(26), createlayerdefault);
    }
}
