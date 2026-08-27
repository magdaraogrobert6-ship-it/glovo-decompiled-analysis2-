package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xa {
    private static int read = 0;
    private static int write = 1;
    public final setLastHorizontalStyle RemoteActionCompatParcelizer;
    public final v9 serializer;

    public xa(v9 v9Var, setLastHorizontalStyle setlasthorizontalstyle) {
        v9Var.getClass();
        setlasthorizontalstyle.getClass();
        this.serializer = v9Var;
        this.RemoteActionCompatParcelizer = setlasthorizontalstyle;
    }

    public static /* synthetic */ t3 RemoteActionCompatParcelizer(xa xaVar, String str, List list) {
        int i = 2 % 2;
        int i2 = read + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            xaVar.IconCompatParcelizer(str, list, null, null);
            throw null;
        }
        t3 t3VarIconCompatParcelizer = xaVar.IconCompatParcelizer(str, list, null, null);
        int i3 = write + 91;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return t3VarIconCompatParcelizer;
    }

    public final t3 IconCompatParcelizer(String str, List list, androidx.compose.ui.graphics.Color color, androidx.compose.ui.graphics.Color color2) {
        int i = 2 % 2;
        boolean zSerializer = this.serializer.serializer();
        boolean z = str == null;
        if (zSerializer) {
            int i2 = write;
            int i3 = i2 + 53;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i4;
            int i5 = i3 % 2;
            if (!z) {
                if (list == null) {
                    int i6 = i2 + 89;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    list = instance_delegatelambda0.write;
                    int i8 = read + 57;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int i10 = write + 65;
                    read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    arrayList.add(serializer((String) it.next()));
                }
                return new t3(str, removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList), color, color2, false);
            }
            int i12 = i4 + 105;
            write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        int i14 = write + 57;
        read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i14 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final t2ExternalSyntheticLambda5 serializer(String str) {
        int i = 2 % 2;
        str.getClass();
        int i2 = xc.write[PointerInteropFilterpointerInputFilter1onCancel1.write(str).ordinal()];
        setLastHorizontalStyle setlasthorizontalstyle = this.RemoteActionCompatParcelizer;
        if (i2 == 1) {
            t2ExternalSyntheticLambda5 t2externalsyntheticlambda5 = new t2ExternalSyntheticLambda5(com.logistics.rider.glovo.R.drawable.ic_bold_large_bonus_fire, setlasthorizontalstyle.IconCompatParcelizer().setPresenter());
            int i3 = read + 9;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return t2externalsyntheticlambda5;
        }
        if (i2 == 2) {
            return new t2ExternalSyntheticLambda5(com.logistics.rider.glovo.R.drawable.ic_bold_large_bonus_rain, setlasthorizontalstyle.IconCompatParcelizer().setPresenter());
        }
        if (i2 == 3) {
            return new t2ExternalSyntheticLambda5(com.logistics.rider.glovo.R.drawable.ic_bold_large_moon_default, setlasthorizontalstyle.IconCompatParcelizer().setPresenter());
        }
        if (i2 == 4) {
            t2ExternalSyntheticLambda5 t2externalsyntheticlambda6 = new t2ExternalSyntheticLambda5(com.logistics.rider.glovo.R.drawable.ic_bold_large_beach_default, setlasthorizontalstyle.IconCompatParcelizer().setPresenter());
            int i5 = read + 61;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return t2externalsyntheticlambda6;
        }
        int i7 = write + 43;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (i2 == 5) {
            return new t2ExternalSyntheticLambda5(com.logistics.rider.glovo.R.drawable.ic_bold_large_bonus_default, setlasthorizontalstyle.IconCompatParcelizer().getSupportBackgroundTintMode());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
