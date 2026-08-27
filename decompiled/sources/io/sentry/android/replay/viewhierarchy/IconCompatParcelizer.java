package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IconCompatParcelizer {
    public final float IconCompatParcelizer;
    public final int RatingCompat;
    public final Rect RemoteActionCompatParcelizer;
    public final boolean read;
    public final int serializer;
    public ArrayList write;

    public IconCompatParcelizer(int i, int i2, float f, IconCompatParcelizer iconCompatParcelizer, boolean z, Rect rect) {
        this.RatingCompat = i;
        this.serializer = i2;
        this.IconCompatParcelizer = f;
        this.read = z;
        this.RemoteActionCompatParcelizer = rect;
    }

    public final void RemoteActionCompatParcelizer(MapboxNavigation$notification$1$1 mapboxNavigation$notification$1$1) {
        ArrayList arrayList;
        if (!((Boolean) mapboxNavigation$notification$1$1.invoke(this)).booleanValue() || (arrayList = this.write) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((IconCompatParcelizer) it.next()).RemoteActionCompatParcelizer(mapboxNavigation$notification$1$1);
        }
    }
}
