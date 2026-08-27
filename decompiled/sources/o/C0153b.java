package o;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0153b {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8) {
        int i = 2 % 2;
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = div7ah8wj8.findFragmentByTag("BecomeRider");
        if (fragmentFindFragmentByTag != null) {
            int i2 = RemoteActionCompatParcelizer + 25;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                fragmentFindFragmentByTag.isAdded();
                obj.hashCode();
                throw null;
            }
            if (fragmentFindFragmentByTag.isAdded()) {
                int i3 = RemoteActionCompatParcelizer + 83;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    isinfiniteannotations.write(fragmentFindFragmentByTag);
                    isinfiniteannotations.read();
                } else {
                    isinfiniteannotations.write(fragmentFindFragmentByTag);
                    isinfiniteannotations.read();
                    throw null;
                }
            }
        }
    }
}
