package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import o.accessemitExit;
import o.accessgetUpcp;
import o.createnHHXs2Y;
import o.hasNonInteropFocusableContent;
import o.moveFocusaToIllA;
import o.removeOnPictureInPictureModeChangedListener;
import o.removeOnPictureInPictureUiStateChangedListener;
import o.removeOnTrimMemoryListener;
import o.startActivityForResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AdjustInstance$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ AdjustInstance$$ExternalSyntheticLambda1(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // java.lang.Runnable
    public final void run() {
        hasNonInteropFocusableContent hasnoninteropfocusablecontent;
        Object systemService;
        Context context;
        int i = this.$r8$classId;
        Context context2 = this.f$0;
        if (i == 0) {
            AdjustInstance.lambda$setSendingReferrersAsNotSent$2(context2);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (i2 >= 33) {
                    createnHHXs2Y createnhhxs2y = removeOnPictureInPictureModeChangedListener.RemoteActionCompatParcelizer;
                    createnhhxs2y.getClass();
                    accessemitExit accessemitexit = new accessemitExit(createnhhxs2y);
                    while (true) {
                        if (!accessemitexit.hasNext()) {
                            systemService = null;
                            break;
                        }
                        removeOnPictureInPictureModeChangedListener removeonpictureinpicturemodechangedlistener = (removeOnPictureInPictureModeChangedListener) ((WeakReference) accessemitexit.next()).get();
                        if (removeonpictureinpicturemodechangedlistener != null && (context = ((startActivityForResult) removeonpictureinpicturemodechangedlistener).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
                            systemService = context.getSystemService("locale");
                            break;
                        }
                    }
                    if (systemService != null) {
                        hasnoninteropfocusablecontent = new hasNonInteropFocusableContent(new moveFocusaToIllA(removeOnPictureInPictureUiStateChangedListener.write(systemService)));
                    } else {
                        hasnoninteropfocusablecontent = hasNonInteropFocusableContent.IconCompatParcelizer;
                    }
                } else {
                    hasnoninteropfocusablecontent = removeOnPictureInPictureModeChangedListener.MediaSessionCompatQueueItem;
                    if (hasnoninteropfocusablecontent == null) {
                        hasnoninteropfocusablecontent = hasNonInteropFocusableContent.IconCompatParcelizer;
                    }
                }
                if (hasnoninteropfocusablecontent.read.RemoteActionCompatParcelizer.isEmpty()) {
                    String strRemoteActionCompatParcelizer = accessgetUpcp.RemoteActionCompatParcelizer(context2);
                    Object systemService2 = context2.getSystemService("locale");
                    if (systemService2 != null) {
                        removeOnPictureInPictureUiStateChangedListener.serializer(systemService2, removeOnTrimMemoryListener.IconCompatParcelizer(strRemoteActionCompatParcelizer));
                    }
                }
                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        removeOnPictureInPictureModeChangedListener.MediaMetadataCompat = true;
    }
}
