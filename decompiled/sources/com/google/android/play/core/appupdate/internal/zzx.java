package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.play.core.appupdate.internal.zzx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import o.ParentDataModifierDefaultImpls;
import o.WindowInsetsRulersImpl;
import o.findDisplayCutouts;
import o.getDisplayCutoutBounds;
import o.getNeverProvidedRectRulers;
import o.getStatusBars;
import o.lightingOWjLjI;
import o.provideWindowInsetsRulers;

/* JADX INFO: loaded from: classes2.dex */
public final class zzx {
    public static final HashMap serializer = new HashMap();
    public final Context IconCompatParcelizer;
    public final Intent MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public findDisplayCutouts ParcelableVolumeInfo;
    public getStatusBars PlaybackStateCompat;
    public final lightingOWjLjI write;
    public final ArrayList read = new ArrayList();
    public final HashSet MediaBrowserCompatMediaItem = new HashSet();
    public final Object RatingCompat = new Object();
    public final getNeverProvidedRectRulers MediaSessionCompatResultReceiverWrapper = new IBinder.DeathRecipient() { // from class: o.getNeverProvidedRectRulers
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzx zzxVar = this.read;
            zzxVar.write.write("reportBinderDeath", new Object[0]);
            m1$$ExternalSyntheticOutline0.m(zzxVar.MediaDescriptionCompat.get());
            zzxVar.write.write("%s : Binder has died.", zzxVar.RemoteActionCompatParcelizer);
            for (WindowInsetsRulersImpl windowInsetsRulersImpl : zzxVar.read) {
                RemoteException remoteException = new RemoteException(String.valueOf(zzxVar.RemoteActionCompatParcelizer).concat(" : Binder has died."));
                ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = windowInsetsRulersImpl.read;
                if (parentDataModifierDefaultImpls != null) {
                    parentDataModifierDefaultImpls.IconCompatParcelizer((Exception) remoteException);
                }
            }
            zzxVar.read.clear();
            synchronized (zzxVar.RatingCompat) {
                zzxVar.serializer();
            }
        }
    };
    public final AtomicInteger PlaybackStateCompatCustomAction = new AtomicInteger(0);
    public final String RemoteActionCompatParcelizer = "AppUpdateService";
    public final WeakReference MediaDescriptionCompat = new WeakReference(null);

    public static void IconCompatParcelizer(zzx zzxVar, provideWindowInsetsRulers providewindowinsetsrulers) {
        getStatusBars getstatusbars = zzxVar.PlaybackStateCompat;
        lightingOWjLjI lightingowjlji = zzxVar.write;
        ArrayList<WindowInsetsRulersImpl> arrayList = zzxVar.read;
        if (getstatusbars != null || zzxVar.MediaSessionCompatQueueItem) {
            if (!zzxVar.MediaSessionCompatQueueItem) {
                providewindowinsetsrulers.run();
                return;
            } else {
                lightingowjlji.write("Waiting to bind to the service.", new Object[0]);
                arrayList.add(providewindowinsetsrulers);
                return;
            }
        }
        lightingowjlji.write("Initiate binding to the service.", new Object[0]);
        arrayList.add(providewindowinsetsrulers);
        findDisplayCutouts finddisplaycutouts = new findDisplayCutouts(zzxVar);
        zzxVar.ParcelableVolumeInfo = finddisplaycutouts;
        zzxVar.MediaSessionCompatQueueItem = true;
        if (zzxVar.IconCompatParcelizer.bindService(zzxVar.MediaMetadataCompat, finddisplaycutouts, 1)) {
            return;
        }
        lightingowjlji.write("Failed to bind to the service.", new Object[0]);
        zzxVar.MediaSessionCompatQueueItem = false;
        for (WindowInsetsRulersImpl windowInsetsRulersImpl : arrayList) {
            zzy zzyVar = new zzy("Failed to bind to the service.");
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = windowInsetsRulersImpl.read;
            if (parentDataModifierDefaultImpls != null) {
                parentDataModifierDefaultImpls.IconCompatParcelizer((Exception) zzyVar);
            }
        }
        arrayList.clear();
    }

    public final void IconCompatParcelizer(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        synchronized (this.RatingCompat) {
            this.MediaBrowserCompatMediaItem.remove(parentDataModifierDefaultImpls);
        }
        read().post(new getDisplayCutoutBounds(0, this));
    }

    public final Handler read() {
        Handler handler;
        HashMap map = serializer;
        synchronized (map) {
            if (!map.containsKey(this.RemoteActionCompatParcelizer)) {
                HandlerThread handlerThread = new HandlerThread(this.RemoteActionCompatParcelizer, 10);
                handlerThread.start();
                map.put(this.RemoteActionCompatParcelizer, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.RemoteActionCompatParcelizer);
        }
        return handler;
    }

    public final void serializer() {
        HashSet hashSet = this.MediaBrowserCompatMediaItem;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ParentDataModifierDefaultImpls) it.next()).IconCompatParcelizer((Exception) new RemoteException(String.valueOf(this.RemoteActionCompatParcelizer).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [o.getNeverProvidedRectRulers] */
    public zzx(Context context, lightingOWjLjI lightingowjlji, Intent intent) {
        this.IconCompatParcelizer = context;
        this.write = lightingowjlji;
        this.MediaMetadataCompat = intent;
    }
}
