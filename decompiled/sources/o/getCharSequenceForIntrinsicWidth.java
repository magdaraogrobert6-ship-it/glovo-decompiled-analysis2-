package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getCharSequenceForIntrinsicWidth implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ lookupAndInterpolate IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ getDEFAULT_LAYOUT_ALIGNMENTui_text write;

    public /* synthetic */ getCharSequenceForIntrinsicWidth(lookupAndInterpolate lookupandinterpolate, getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = lookupandinterpolate;
        this.write = getdefault_layout_alignmentui_text;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.read;
        getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text = this.write;
        lookupAndInterpolate lookupandinterpolate = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            EarningsComposableKt.RemoteActionCompatParcelizer(lookupandinterpolate, getdefault_layout_alignmentui_text, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        EarningsContentKt.RemoteActionCompatParcelizer(lookupandinterpolate, getdefault_layout_alignmentui_text, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaDescriptionCompat + 125;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
