package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CircularProgressIndicatorTokens implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ CircularProgressIndicatorTokens(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.RemoteActionCompatParcelizer;
        switch (i2) {
            case 0:
                return (onRelease) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) populateViewStructure_androidKtpopulate7.getValue()).invoke();
            case 1:
                return new AnchoredDraggableKtrestartable2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) populateViewStructure_androidKtpopulate7.getValue());
            case 2:
                Boolean bool = (Boolean) populateViewStructure_androidKtpopulate7.getValue();
                bool.booleanValue();
                return bool;
            case 3:
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) populateViewStructure_androidKtpopulate7.getValue();
                if (layoutCoordinates != null) {
                    return layoutCoordinates;
                }
                TriStateCheckbox.IconCompatParcelizer("Required value was null.");
                DrawableTransformation.read();
                return null;
            case 4:
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = (androidx.compose.ui.layout.LayoutCoordinates) populateViewStructure_androidKtpopulate7.getValue();
                if (layoutCoordinates2 != null) {
                    return layoutCoordinates2;
                }
                TriStateCheckbox.IconCompatParcelizer("Required value was null.");
                DrawableTransformation.read();
                return null;
            case 5:
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = (androidx.compose.ui.layout.LayoutCoordinates) populateViewStructure_androidKtpopulate7.getValue();
                if (layoutCoordinates3 == null) {
                    TriStateCheckbox.IconCompatParcelizer("Required value was null.");
                    DrawableTransformation.read();
                    return null;
                }
                int i3 = serializer + 47;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return layoutCoordinates3;
            case 6:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                return createfromparcel;
            case 7:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                int i5 = serializer + 49;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 39 / 0;
                }
                return createfromparcel;
            case 8:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                return createfromparcel;
            case 9:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                return createfromparcel;
            case 10:
                populateViewStructure_androidKtpopulate7.setValue(null);
                return createfromparcel;
            case 11:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                return createfromparcel;
            case 12:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                return createfromparcel;
            case 13:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                return createfromparcel;
            case 14:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                return createfromparcel;
            case 15:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                return createfromparcel;
            case 16:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                return createfromparcel;
            case 17:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                return createfromparcel;
            case 18:
                Boolean bool2 = (Boolean) populateViewStructure_androidKtpopulate7.getValue();
                bool2.booleanValue();
                return bool2;
            case 19:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                return createfromparcel;
            default:
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk<Character> r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue();
                ArrayList arrayList = new ArrayList();
                for (Character ch : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                    if (ch != null) {
                        int i7 = serializer + 61;
                        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        arrayList.add(ch);
                    }
                }
                return onContentCardDismissed.IconCompatParcelizer(arrayList, "", null, null, null, 62);
        }
    }
}
