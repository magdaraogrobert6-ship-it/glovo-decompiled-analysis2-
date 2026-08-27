package o;

import android.annotation.SuppressLint;
import android.location.Location;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class parseLong implements Iterator<Location> {
    private int IconCompatParcelizer;
    private final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    private final parsePayloadFieldsFromBundle read;
    private final String serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.RemoteActionCompatParcelizer.isEmpty()) {
            return true;
        }
        return this.read.read(this.IconCompatParcelizer, this.serializer) > 0;
    }

    @Override // java.util.Iterator
    @SuppressLint
    public final Location next() {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        if (!arrayList.isEmpty()) {
            return (Location) arrayList.remove(0);
        }
        String str = this.serializer;
        arrayList.addAll(this.read.serializer(this.IconCompatParcelizer, str));
        this.IconCompatParcelizer = arrayList.size() + this.IconCompatParcelizer;
        if (!arrayList.isEmpty()) {
            return (Location) arrayList.remove(0);
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Failed to fetch remaining location data");
        return null;
    }

    public parseLong(String str, parsePayloadFieldsFromBundle parsepayloadfieldsfrombundle) {
        this.serializer = str;
        this.read = parsepayloadfieldsfrombundle;
    }
}
