package com.mapbox.navigation.core.trip.service;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.mapbox.navigation.base.trip.notification.TripNotification;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.internal.dump.HelpDumpInterceptor;
import com.mapbox.navigation.core.internal.dump.MapboxDumpRegistry;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.sentiance.core.model.events.H$b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationNotificationService extends Service {
    public final MapboxNavigation$$ExternalSyntheticLambda4 notificationDataObserver = new MapboxNavigation$$ExternalSyntheticLambda4(11, this);
    public final IsFixableByRetry mapboxDumpHandler = new IsFixableByRetry(6);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws Exception {
        TripNotification tripNotification = MapboxTripService.currentTripNotification;
        MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4 = this.notificationDataObserver;
        mapboxNavigation$$ExternalSyntheticLambda4.getClass();
        TripNotification tripNotification2 = MapboxTripService.currentTripNotification;
        if (tripNotification2 == null) {
            MapboxTripService.notificationDataObservers.add(mapboxNavigation$$ExternalSyntheticLambda4);
            return 1;
        }
        int notificationId = tripNotification2.getNotificationId();
        Notification notification = tripNotification2.getNotification();
        notification.getClass();
        NavigationNotificationService navigationNotificationService = (NavigationNotificationService) mapboxNavigation$$ExternalSyntheticLambda4.f$0;
        try {
            notification.flags = 64;
            if (Build.VERSION.SDK_INT >= 29) {
                navigationNotificationService.startForeground(notificationId, notification, 8);
            } else {
                navigationNotificationService.startForeground(notificationId, notification);
            }
            return 1;
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT < 31 || !(e instanceof ForegroundServiceStartNotAllowedException)) {
                throw e;
            }
            LoggerProviderKt.logE("ForegroundServiceStartNotAllowedException: " + e.getMessage(), null);
            return 1;
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        List arrayList;
        HelpDumpInterceptor helpDumpInterceptor;
        fileDescriptor.getClass();
        printWriter.getClass();
        this.mapboxDumpHandler.getClass();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (strArr != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : strArr) {
                str.getClass();
                int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ":", 0, false, 6);
                String strSubstring = iWrite == -1 ? str : str.substring(0, iWrite);
                Object arrayList2 = linkedHashMap.get(strSubstring);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(strSubstring, arrayList2);
                }
                ((List) arrayList2).add(str);
            }
            ArrayList<onViewAttachedToWindowlambda0> arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                H$b h$b = MapboxDumpRegistry.delegate;
                arrayList3.add(new onViewAttachedToWindowlambda0(MapboxDumpRegistry.getInterceptors((String) entry.getKey()), entry.getValue()));
            }
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : arrayList3) {
                List list = (List) onviewattachedtowindowlambda0.serializer;
                List list2 = (List) onviewattachedtowindowlambda0.write;
                if (list.isEmpty()) {
                    printWriter.println("Unrecognized commands: ".concat(onContentCardDismissed.IconCompatParcelizer(list2, null, null, null, null, 63)));
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((HelpDumpInterceptor) it.next()).intercept(fileDescriptor, printWriter, list2);
                    }
                    printWriter.println("Processed: ".concat(onContentCardDismissed.IconCompatParcelizer(list2, null, null, null, null, 63)));
                }
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((onViewAttachedToWindowlambda0) it2.next()).serializer, (Collection) arrayList);
            }
        } else {
            arrayList = instance_delegatelambda0Var;
        }
        if (!arrayList.isEmpty() || (helpDumpInterceptor = (HelpDumpInterceptor) MapboxDumpRegistry.delegate.write) == null) {
            return;
        }
        helpDumpInterceptor.intercept(fileDescriptor, printWriter, instance_delegatelambda0Var);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(1);
        TripNotification tripNotification = MapboxTripService.currentTripNotification;
        MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4 = this.notificationDataObserver;
        mapboxNavigation$$ExternalSyntheticLambda4.getClass();
        MapboxTripService.notificationDataObservers.remove(mapboxNavigation$$ExternalSyntheticLambda4);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
