package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class resetFocus3ESFkO8 implements Callable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Context RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ resetFocus3ESFkO8(String str, Context context, Object obj, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = str;
        this.RemoteActionCompatParcelizer = context;
        this.serializer = obj;
        this.read = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.IconCompatParcelizer;
        int i2 = this.read;
        Object obj = this.serializer;
        Context context = this.RemoteActionCompatParcelizer;
        String str = this.write;
        if (i != 0) {
            try {
                return setFocusCaptured.read(str, context, (List) obj, i2);
            } catch (Throwable unused) {
                return new FocusOwnerdispatchKeyEvent1(-3);
            }
        }
        Object[] objArr = {(scheduleInvalidationForOwner) obj};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        return setFocusCaptured.read(str, context, Collections.unmodifiableList(arrayList), i2);
    }
}
