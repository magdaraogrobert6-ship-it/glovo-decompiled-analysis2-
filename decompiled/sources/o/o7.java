package o;

import com.uber.h3core.H3Core;
import dagger.Lazy;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class o7 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final Lazy RemoteActionCompatParcelizer;

    public o7(Lazy lazy) {
        this.RemoteActionCompatParcelizer = lazy;
    }

    public final Integer write(String str) {
        int i = 2 % 2;
        try {
            ((H3Core) this.RemoteActionCompatParcelizer.write()).getClass();
            return new Integer(H3Core.getResolution(str));
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "H3 cellToResolution error", new Object[0]);
            int i2 = IconCompatParcelizer + 113;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return null;
            }
            int i3 = 3 / 3;
            return null;
        } catch (UnsatisfiedLinkError e2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "libh3-java.so native library failed to load", new Object[0]);
            int i4 = serializer + 25;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
    }

    public final List RemoteActionCompatParcelizer(int i, List list) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        try {
            List listUncompactCellAddresses = ((H3Core) this.RemoteActionCompatParcelizer.write()).uncompactCellAddresses(i, list);
            listUncompactCellAddresses.getClass();
            return listUncompactCellAddresses;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "H3 uncompactCells error", new Object[0]);
            int i5 = serializer + 53;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return list;
        } catch (UnsatisfiedLinkError e2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "libh3-java.so native library failed to load", new Object[0]);
            int i7 = serializer + 53;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return list;
        }
    }
}
