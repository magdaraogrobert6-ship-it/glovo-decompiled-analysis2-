package o;

/* JADX INFO: loaded from: classes.dex */
public final class component15 {
    public final setRight RemoteActionCompatParcelizer;
    public final setRight read;

    public static component15 bV_(android.view.WindowInsetsAnimation.Bounds bounds) {
        return new component15(bounds);
    }

    public component15(android.view.WindowInsetsAnimation.Bounds bounds) {
        this.RemoteActionCompatParcelizer = component16.bY_(bounds);
        this.read = component16.bX_(bounds);
    }

    public final android.view.WindowInsetsAnimation.Bounds bW_() {
        component7.serializer();
        return component8.ca_(this.RemoteActionCompatParcelizer.bt_(), this.read.bt_());
    }

    public final String toString() {
        return "Bounds{lower=" + this.RemoteActionCompatParcelizer + " upper=" + this.read + "}";
    }

    public component15(setRight setright, setRight setright2) {
        this.RemoteActionCompatParcelizer = setright;
        this.read = setright2;
    }
}
