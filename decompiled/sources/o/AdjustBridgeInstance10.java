package o;

import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AdjustBridgeInstance10 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ AdjustBridgeInstance4 IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ AdjustBridgeInstance10(AdjustBridgeInstance4 adjustBridgeInstance4, String str, int i) {
        this.read = i;
        this.IconCompatParcelizer = adjustBridgeInstance4;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = this.RemoteActionCompatParcelizer;
        AdjustBridgeInstance4 adjustBridgeInstance4 = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i2 == 0) {
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                if (!((Boolean) ((onShowTranslationui) adjustBridgeInstance4.serializer).getValue()).booleanValue()) {
                    int i3 = serializer + 79;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    str = null;
                }
                HeaderKt.HeaderTitleAndDescription(str, null, getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if ((iIntValue & 3) != 2) {
            int i5 = serializer + 19;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = serializer + 99;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (getpostalcode2.write(iIntValue & 1, z)) {
            int i9 = serializer + 117;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ((Boolean) ((onShowTranslationui) adjustBridgeInstance4.serializer).getValue()).booleanValue();
                throw null;
            }
            if (!((Boolean) ((onShowTranslationui) adjustBridgeInstance4.serializer).getValue()).booleanValue()) {
                str = null;
            }
            HeaderKt.HeaderTitleAndDescription(str, null, getpostalcode2, 0);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
