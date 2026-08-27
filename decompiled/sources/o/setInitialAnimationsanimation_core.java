package o;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public interface setInitialAnimationsanimation_core {
    boolean IconCompatParcelizer();

    int MediaSessionCompatQueueItem();

    int RemoteActionCompatParcelizer();

    Range RemoteActionCompatParcelizer(int i);

    Range read();

    Range read(int i);

    Range serializer();

    boolean serializer(int i, int i2);

    Range write();

    default boolean IconCompatParcelizer(int i, int i2) {
        if (serializer(i, i2)) {
            return true;
        }
        return IconCompatParcelizer() && serializer(i2, i);
    }
}
