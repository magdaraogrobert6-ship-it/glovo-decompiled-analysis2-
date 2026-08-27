package com.roadrunner.delivery.common.data.model;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TrackingEventExtensionsKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final ArrayList RemoteActionCompatParcelizer(List list) {
        int i = 2 % 2;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (Object obj : list) {
            Trigger.Companion companion = Trigger.Companion;
            String str = ((TrackingEvent) obj).trigger;
            companion.getClass();
            if (Trigger.Companion.write(str) == Trigger.SCREEN_OPENED) {
                arrayList.add(obj);
            }
        }
        int i4 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return arrayList;
    }

    public static final ArrayList RemoteActionCompatParcelizer(List list, Trigger trigger) {
        int i = 2 % 2;
        list.getClass();
        trigger.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i2 = IconCompatParcelizer + 123;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return arrayList;
                }
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            Trigger.Companion companion = Trigger.Companion;
            String str = ((TrackingEvent) next).trigger;
            companion.getClass();
            if (Trigger.Companion.write(str) == trigger) {
                int i3 = RemoteActionCompatParcelizer + 5;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    arrayList.add(next);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(next);
            }
        }
    }
}
