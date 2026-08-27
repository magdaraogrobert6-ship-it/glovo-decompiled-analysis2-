package o;

import android.database.Observable;

/* JADX INFO: loaded from: classes.dex */
public final class getXor0nO6VwU extends Observable {
    public final void RemoteActionCompatParcelizer() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BlendModeColorFilterxETnrds) ((Observable) this).mObservers.get(size)).IconCompatParcelizer();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BlendModeColorFilterxETnrds) ((Observable) this).mObservers.get(size)).RemoteActionCompatParcelizer(i, i2);
            }
        }
    }

    public final void read(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BlendModeColorFilterxETnrds) ((Observable) this).mObservers.get(size)).IconCompatParcelizer(i, i2);
            }
        }
    }

    public final void read(int i, int i2, Object obj) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BlendModeColorFilterxETnrds) ((Observable) this).mObservers.get(size)).RemoteActionCompatParcelizer(i, i2, obj);
            }
        }
    }

    public final void serializer() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BlendModeColorFilterxETnrds) ((Observable) this).mObservers.get(size)).read();
            }
        }
    }

    public final void serializer(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BlendModeColorFilterxETnrds) ((Observable) this).mObservers.get(size)).serializer(i, i2);
            }
        }
    }

    public final boolean write() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
