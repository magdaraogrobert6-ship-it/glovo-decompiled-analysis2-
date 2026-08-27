package o;

/* JADX INFO: loaded from: classes.dex */
public final class DrawModifierKt {
    public final androidx.navigation.NavArgsLazy RemoteActionCompatParcelizer;
    public final androidx.navigation.NavArgsLazy read;
    public final androidx.navigation.NavArgsLazy write;

    public DrawModifierKt(androidx.compose.ui.unit.Dp dp, String str) {
        int i = 19;
        this.write = new androidx.navigation.NavArgsLazy(dp, str, "base", i);
        Object obj = null;
        this.RemoteActionCompatParcelizer = new androidx.navigation.NavArgsLazy(obj, obj, "min", i);
        this.read = new androidx.navigation.NavArgsLazy(obj, obj, "max", i);
    }
}
