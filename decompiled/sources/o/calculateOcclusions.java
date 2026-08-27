package o;

import com.roadrunner.auth.data.SignInDataStore;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class calculateOcclusions implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ SignInDataStore IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ calculateOcclusions(SignInDataStore signInDataStore, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = signInDataStore;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SignInDataStore signInDataStore = this.IconCompatParcelizer;
        if (i4 == 0) {
            ((onLowMemory) signInDataStore.serializer).RemoteActionCompatParcelizer((ThrottledCallbacks) obj);
            return createfromparcel;
        }
        if (i4 == 1) {
            List list = (List) obj;
            list.getClass();
            if (!list.isEmpty()) {
                ((AndroidGraphicsContext2) signInDataStore.read).RemoteActionCompatParcelizer(new getPositionInWindownOccac(list));
                int i5 = write + 111;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            return createfromparcel;
        }
        if (i4 != 2) {
            Throwable th = (Throwable) obj;
            th.getClass();
            ((AndroidGraphicsContext2) signInDataStore.read).RemoteActionCompatParcelizer(new getPositionInRootnOccac(th));
            return createfromparcel;
        }
        List list2 = (List) obj;
        list2.getClass();
        ((AndroidGraphicsContext2) signInDataStore.read).RemoteActionCompatParcelizer(new getPositionInWindownOccac(list2));
        int i7 = read + 45;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }
}
