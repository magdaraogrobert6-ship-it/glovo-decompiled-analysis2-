package o;

import com.foodora.courier.legacy.ui.main.MainPresenter;
import com.foodora.courier.main.presentation.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getLongPress5zf0vsI implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ MainPresenter serializer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        MainPresenter mainPresenter = this.serializer;
        if (i3 == 0) {
            MainActivity mainActivity = mainPresenter.ParcelableVolumeInfo;
            mainActivity.read();
            mainActivity.write((String) obj);
            return null;
        }
        MainActivity mainActivity2 = mainPresenter.ParcelableVolumeInfo;
        mainActivity2.read();
        mainActivity2.RemoteActionCompatParcelizer(((Throwable) obj).getMessage());
        int i4 = write + 3;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }
}
