package o;

import android.content.Context;
import java.util.List;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Path implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ Context serializer;

    public /* synthetic */ Path(Context context) {
        this.read = 0;
        this.serializer = context;
    }

    public /* synthetic */ Path(Object obj, Context context, int i) {
        this.read = i;
        this.serializer = context;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Context context = this.serializer;
        if (i4 == 0) {
            return TimeZoneKt.read(context);
        }
        androidx.fragment.app.FragmentActivity activity = null;
        if (i4 == 1) {
            div7Ah8Wj8 supportFragmentManager = coil3.util.UtilsKt.RemoteActionCompatParcelizer(context).getSupportFragmentManager();
            supportFragmentManager.getClass();
            List listIconCompatParcelizer = supportFragmentManager.PlaybackStateCompatCustomAction.IconCompatParcelizer();
            listIconCompatParcelizer.getClass();
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
            activity = fragment != null ? fragment.getActivity() : null;
            if (activity != null) {
                DragAndDropNodeKtDragAndDropTargetModifierNode1.RemoteActionCompatParcelizer(activity);
            }
            int i5 = RemoteActionCompatParcelizer + 45;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        div7Ah8Wj8 supportFragmentManager2 = coil3.util.UtilsKt.RemoteActionCompatParcelizer(context).getSupportFragmentManager();
        supportFragmentManager2.getClass();
        List listIconCompatParcelizer2 = supportFragmentManager2.PlaybackStateCompatCustomAction.IconCompatParcelizer();
        listIconCompatParcelizer2.getClass();
        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer2);
        if (fragment2 != null) {
            int i7 = write + 35;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                activity = fragment2.getActivity();
                int i8 = 73 / 0;
            } else {
                activity = fragment2.getActivity();
            }
        }
        if (activity != null) {
            int i9 = write + 95;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            DragAndDropNodeKtDragAndDropTargetModifierNode1.RemoteActionCompatParcelizer(activity);
        }
        return createfromparcel;
    }
}
