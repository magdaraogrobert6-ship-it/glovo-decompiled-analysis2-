package o;

import coil3.compose.AsyncImagePainter$State$Success;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SelectionMagnifierKt implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SelectionMagnifierKt(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) populateViewStructure_androidKtpopulate7.getValue()).invoke(f)).floatValue());
            case 1:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) populateViewStructure_androidKtpopulate7.getValue()).invoke((androidx.compose.ui.geometry.Offset) obj);
                return createfromparcel;
            case 2:
                populateViewStructure_androidKtpopulate7.setValue((androidx.compose.ui.layout.LayoutCoordinates) obj);
                int i3 = write + 81;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 3:
                populateViewStructure_androidKtpopulate7.setValue((androidx.compose.ui.layout.LayoutCoordinates) obj);
                return createfromparcel;
            case 4:
                populateViewStructure_androidKtpopulate7.setValue((androidx.compose.ui.layout.LayoutCoordinates) obj);
                return createfromparcel;
            case 5:
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = (androidx.compose.ui.text.TextLayoutResult) obj;
                textLayoutResult.getClass();
                if (textLayoutResult.getLineCount() > 2 || !(!textLayoutResult.getHasVisualOverflow())) {
                    populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                }
                return createfromparcel;
            case 6:
                ((AsyncImagePainter$State$Success) obj).getClass();
                populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                return createfromparcel;
            case 7:
                List list = (List) obj;
                list.getClass();
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) populateViewStructure_androidKtpopulate7.getValue()).invoke(list);
                return createfromparcel;
            case 8:
                androidx.compose.ui.geometry.Rect rect = (androidx.compose.ui.geometry.Rect) obj;
                rect.getClass();
                populateViewStructure_androidKtpopulate7.setValue(rect);
                return createfromparcel;
            case 9:
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                populateViewStructure_androidKtpopulate7.setValue(Float.valueOf(androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null).getBottom()));
                return createfromparcel;
            case 10:
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = (androidx.compose.ui.text.TextLayoutResult) obj;
                textLayoutResult2.getClass();
                if (textLayoutResult2.getLineCount() > 2 || textLayoutResult2.getHasVisualOverflow()) {
                    populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                }
                return createfromparcel;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                populateViewStructure_androidKtpopulate7.setValue(bool);
                return createfromparcel;
            case 12:
                androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = (androidx.compose.ui.text.TextLayoutResult) obj;
                textLayoutResult3.getClass();
                populateViewStructure_androidKtpopulate7.setValue(textLayoutResult3);
                return createfromparcel;
            case 13:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                return createfromparcel;
            case 14:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                return createfromparcel;
            case 15:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                int i4 = RemoteActionCompatParcelizer + 101;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel;
            default:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
                return createfromparcel;
        }
    }
}
