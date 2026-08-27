package com.mapbox.common.module.cronet;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import o.isItemDismissable;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class LazyEngineKt {
    private static final String CRONET_PLAY_SERVICES_INSTALLER_CLASS = "com.google.android.gms.net.CronetProviderInstaller";
    private static final AtomicBoolean canInstallFromGooglePlay;
    private static final CopyOnWriteArraySet<String> disabledProviders;
    private static final boolean isPlayServicesCronetProviderInstallerAvailable;

    public static final CopyOnWriteArraySet<String> getDisabledProviders() {
        return disabledProviders;
    }

    public static /* synthetic */ void getDisabledProviders$annotations() {
    }

    static {
        Object isitemdismissable;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(CronetProvider.PROVIDER_NAME_FALLBACK);
        disabledProviders = copyOnWriteArraySet;
        try {
            isitemdismissable = CronetProviderInstaller.class;
            String str = CronetProviderInstaller.PROVIDER_NAME;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        boolean z = !(isitemdismissable instanceof isItemDismissable);
        isPlayServicesCronetProviderInstallerAvailable = z;
        canInstallFromGooglePlay = new AtomicBoolean(z);
    }

    public static final CronetProvider findCronetProvider(Context context) {
        Object next;
        context.getClass();
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
        allProviders.getClass();
        Iterator<T> it = allProviders.iterator();
        while (it.hasNext()) {
            next = it.next();
            CronetProvider cronetProvider = (CronetProvider) next;
            try {
                if (cronetProvider.isEnabled() && !disabledProviders.contains(cronetProvider.getName())) {
                    return (CronetProvider) next;
                }
            } catch (Exception unused) {
            }
        }
        next = null;
        return (CronetProvider) next;
    }
}
