package o;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceBuilderCompat implements FlowCollector {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ createFromFile RemoteActionCompatParcelizer;

    public /* synthetic */ TypefaceBuilderCompat(createFromFile createfromfile, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = createfromfile;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        List list;
        List list2;
        List list3;
        int i = 2 % 2;
        int i2 = read + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        createFromFile createfromfile = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            Throwable th = (Throwable) obj;
            addSubLayer addsublayer = th instanceof addSubLayer ? (addSubLayer) th : null;
            if (addsublayer != null && (list3 = addsublayer.messages) != null) {
                int i4 = read + 69;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    list3.iterator();
                    throw null;
                }
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    createFromFile.RemoteActionCompatParcelizer(createfromfile, (obtainAndroidOutline) it.next());
                }
            }
            int i5 = serializer + 71;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return createfromparcel2;
            }
            obj2.hashCode();
            throw null;
        }
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        if (!(obj3 instanceof isItemDismissable) && (list2 = (List) obj3) != null) {
            Iterator it2 = list2.iterator();
            int i6 = serializer + 49;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            while (it2.hasNext()) {
                createFromFile.RemoteActionCompatParcelizer(createfromfile, (obtainAndroidOutline) it2.next());
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(obj3);
        if (thSerializer != null) {
            addSubLayer addsublayer2 = thSerializer instanceof addSubLayer ? (addSubLayer) thSerializer : null;
            if (addsublayer2 != null && (list = addsublayer2.messages) != null) {
                int i8 = serializer + 97;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    list.iterator();
                    throw null;
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    createFromFile.RemoteActionCompatParcelizer(createfromfile, (obtainAndroidOutline) it3.next());
                }
            }
        }
        return createfromparcel2;
    }
}
