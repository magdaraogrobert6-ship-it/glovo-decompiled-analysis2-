package com.google.firebase.inappmessaging.display.internal;

import android.app.Application;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.dynamite.zzj;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import kotlin.ranges.RangesKt;
import o.PlatformHapticFeedbackType;
import o.getAttachHasBeenRun;
import o.getUseMinimumTouchTarget;
import o.onUncaughtException;

/* JADX INFO: loaded from: classes4.dex */
public final class FiamImageLoader_Factory implements onUncaughtException {
    public final /* synthetic */ int read;
    public final Object write;

    public FiamImageLoader_Factory(zzj zzjVar, getAttachHasBeenRun getattachhasbeenrun) {
        this.read = 2;
        this.write = getattachhasbeenrun;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.read;
        Object obj = this.write;
        if (i == 0) {
            return new getUseMinimumTouchTarget((RequestManager) ((onUncaughtException) obj).write());
        }
        if (i == 1) {
            Application application = ((PlatformHapticFeedbackType) obj).RemoteActionCompatParcelizer;
            RangesKt.serializer((Object) application);
            return application;
        }
        if (i != 2) {
            FirebaseInAppMessaging firebaseInAppMessaging = (FirebaseInAppMessaging) ((zzz) obj).serializer;
            RangesKt.serializer(firebaseInAppMessaging);
            return firebaseInAppMessaging;
        }
        Application application2 = (Application) ((getAttachHasBeenRun) obj).write();
        RequestManager requestManagerRemoteActionCompatParcelizer = Glide.IconCompatParcelizer(application2).MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(application2);
        RangesKt.serializer(requestManagerRemoteActionCompatParcelizer);
        return requestManagerRemoteActionCompatParcelizer;
    }

    public /* synthetic */ FiamImageLoader_Factory(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }
}
