package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getMaxDimensionannotations {
    public static final processDragGesture RemoteActionCompatParcelizer = new processDragGesture(0);
    public final /* synthetic */ div7Ah8Wj8 read;

    public static Class read(ClassLoader classLoader, String str) throws ClassNotFoundException {
        processDragGesture processdraggesture = RemoteActionCompatParcelizer;
        processDragGesture processdraggesture2 = (processDragGesture) processdraggesture.get(classLoader);
        if (processdraggesture2 == null) {
            processdraggesture2 = new processDragGesture(0);
            processdraggesture.put(classLoader, processdraggesture2);
        }
        Class cls = (Class) processdraggesture2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        processdraggesture2.put(str, cls2);
        return cls2;
    }

    public static Class serializer(ClassLoader classLoader, String str) {
        try {
            return read(classLoader, str);
        } catch (ClassCastException e) {
            throw new androidx.fragment.app.Fragment.InstantiationException(ff$$ExternalSyntheticOutline0.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new androidx.fragment.app.Fragment.InstantiationException(ff$$ExternalSyntheticOutline0.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final androidx.fragment.app.Fragment serializer(String str) {
        return androidx.fragment.app.Fragment.instantiate(this.read.PlaybackStateCompat.RemoteActionCompatParcelizer, str, null);
    }

    public getMaxDimensionannotations(div7Ah8Wj8 div7ah8wj8) {
        this.read = div7ah8wj8;
    }
}
