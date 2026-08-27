package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class IActivityPackageSender extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ DrawBackgroundModifier read;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IActivityPackageSender(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, DrawBackgroundModifier drawBackgroundModifier, int i) {
        super(0);
        this.RemoteActionCompatParcelizer = i;
        this.write = populateViewStructure_androidKtpopulate7;
        this.read = drawBackgroundModifier;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        DrawBackgroundModifier drawBackgroundModifier = this.read;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.write;
        switch (i4) {
            case 0:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            case 1:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            case 2:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                int i5 = IconCompatParcelizer + 91;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 3:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            case 4:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            case 5:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            case 6:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            case 7:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            case 8:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
            default:
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()));
                drawBackgroundModifier.write = true;
                return createfromparcel;
        }
    }
}
