package com.incognia.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.ParcelFileDescriptor;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import o.isItemDismissable;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class SA {
    public static gJ0 BGx() {
        Object isitemdismissable;
        Object isitemdismissable2;
        try {
            try {
                Context context = uF.BGx;
                if (context == null) {
                    throw new NullPointerException("Using SDK context before initialization");
                }
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                isitemdismissable2 = applicationInfo != null ? applicationInfo.sourceDir : null;
                if (isitemdismissable2 instanceof isItemDismissable) {
                    isitemdismissable2 = null;
                }
                isitemdismissable = new gJ0((String) isitemdismissable2, mbG());
                return (gJ0) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
            } catch (Throwable th) {
                isitemdismissable2 = new isItemDismissable(th);
            }
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
    }

    public static String mbG() {
        String str;
        Object isitemdismissable;
        if (!XUh.BGx(XUh.BGx, 26, 0, 2)) {
            return null;
        }
        Context context = uF.BGx;
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
            return null;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || (str = applicationInfo.sourceDir) == null) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(str), 268435456);
            try {
                isitemdismissable = Files.readSymbolicLink(Paths.get(((String) W4i.pOV.MediaSessionCompatResultReceiverWrapper()) + parcelFileDescriptorOpen.getFd(), new String[0])).toString();
                parcelFileDescriptorOpen.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{parcelFileDescriptorOpen, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            isitemdismissable = new isItemDismissable(th3);
        }
        return (String) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
    }
}
