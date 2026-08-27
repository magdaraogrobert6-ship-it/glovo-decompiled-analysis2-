package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LayoutHelper_androidKt implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ getDEFAULT_LAYOUT_ALIGNMENTui_text read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ LayoutHelper_androidKt(getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.read = getdefault_layout_alignmentui_text;
        this.RemoteActionCompatParcelizer = modifier;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            EarningsComposableKt.Multiplier(getdefault_layout_alignmentui_text, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        EarningsContentKt.Multiplier(getdefault_layout_alignmentui_text, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = write + 77;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 94 / 0;
        }
        return createfromparcel;
    }
}
