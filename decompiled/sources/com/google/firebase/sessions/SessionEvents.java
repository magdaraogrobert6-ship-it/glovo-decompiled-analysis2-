package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.roadrunner.home.CreateHomeScope;
import o.AndroidComposeViewCompanionExternalSyntheticLambda0;
import o.AndroidComposeViewRootModifierNode;
import o.AndroidComposeViewdispatchKeyEvent1;
import o.AndroidComposeViewgetFocusedRect1;
import o.AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1;
import o.AndroidComposeViewresendMotionEventOnLayout1;
import o.accessgetExclusioncp;
import o.addNotificationForSysPropsChangelambda0000;
import o.addNotificationForSysPropsChangelambda0010;
import o.detachAndRemoveNode;
import o.dispatchOnScrollChanged;
import o.getPreviousGeneration;
import o.getRulerLambda;
import o.getRulerLambdaannotations;
import o.removeNotificationForSysPropsChange;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionEvents {
    public static final SessionEvents IconCompatParcelizer = new SessionEvents();
    public static final CreateHomeScope read;

    static {
        detachAndRemoveNode detachandremovenode = new detachAndRemoveNode();
        detachandremovenode.serializer(AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1.class, dispatchOnScrollChanged.write);
        detachandremovenode.serializer(AndroidComposeViewresendMotionEventOnLayout1.class, getRulerLambdaannotations.MediaMetadataCompat);
        detachandremovenode.serializer(getRulerLambda.class, getPreviousGeneration.write);
        detachandremovenode.serializer(addNotificationForSysPropsChangelambda0010.class, AndroidComposeViewRootModifierNode.read);
        detachandremovenode.serializer(removeNotificationForSysPropsChange.class, addNotificationForSysPropsChangelambda0000.write);
        detachandremovenode.serializer(AndroidComposeViewgetFocusedRect1.class, AndroidComposeViewCompanionExternalSyntheticLambda0.RemoteActionCompatParcelizer);
        detachandremovenode.RatingCompat = true;
        read = new CreateHomeScope(detachandremovenode);
    }

    public static addNotificationForSysPropsChangelambda0010 write(FirebaseApp firebaseApp) throws PackageManager.NameNotFoundException {
        firebaseApp.IconCompatParcelizer();
        Context context = firebaseApp.read;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        firebaseApp.IconCompatParcelizer();
        String str = firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        AndroidComposeViewdispatchKeyEvent1 androidComposeViewdispatchKeyEvent1 = AndroidComposeViewdispatchKeyEvent1.LOG_ENVIRONMENT_PROD;
        packageName.getClass();
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        Build.MANUFACTURER.getClass();
        firebaseApp.IconCompatParcelizer();
        AndroidComposeViewgetFocusedRect1 androidComposeViewgetFocusedRect1Write = accessgetExclusioncp.write(context);
        firebaseApp.IconCompatParcelizer();
        return new addNotificationForSysPropsChangelambda0010(str, androidComposeViewdispatchKeyEvent1, new removeNotificationForSysPropsChange(packageName, str3, strValueOf, androidComposeViewgetFocusedRect1Write, accessgetExclusioncp.read(context)));
    }
}
