package o;

import android.os.Process;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class getSelectionEndui_text extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public static int RemoteActionCompatParcelizer;
    public static int serializer;
    public final /* synthetic */ LinkedHashMap IconCompatParcelizer;
    public final /* synthetic */ List read;
    public final /* synthetic */ androidx.constraintlayout.compose.Measurer2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSelectionEndui_text(androidx.constraintlayout.compose.Measurer2 measurer2, List list, LinkedHashMap linkedHashMap) {
        super(1);
        this.write = measurer2;
        this.read = list;
        this.IconCompatParcelizer = linkedHashMap;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        createFromParcel createfromparcel;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 101;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            List list = this.read;
            LinkedHashMap linkedHashMap = this.IconCompatParcelizer;
            this.write.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list, linkedHashMap);
            createfromparcel = createFromParcel.INSTANCE;
            int i3 = 69 / 0;
        } else {
            List list2 = this.read;
            LinkedHashMap linkedHashMap2 = this.IconCompatParcelizer;
            this.write.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list2, linkedHashMap2);
            createfromparcel = createFromParcel.INSTANCE;
        }
        int i4 = MediaBrowserCompatMediaItem + 117;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return createfromparcel;
    }

    public static int IconCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 8865789;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iMyPid = Process.myPid();
        serializer = iMyPid;
        return iMyPid;
    }
}
