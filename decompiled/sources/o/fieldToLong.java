package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fieldToLong implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ fieldToDouble IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ fieldToLong(int i, fieldToDouble fieldtodouble) {
        this.read = i;
        this.IconCompatParcelizer = fieldtodouble;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long presenter;
        int i = 2 % 2;
        int i2 = serializer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        fieldToDouble fieldtodouble = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z2 = false;
        int i5 = 1;
        if (i4 == 0) {
            if ((iIntValue & 3) != 2) {
                int i6 = RemoteActionCompatParcelizer + 89;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                z2 = true;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z2)) {
                AndroidContentCaptureManagerCompanion.read(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection().write(androidx.compose.ui.unit.LayoutDirection.Ltr), coil3.ExtrasKt.write(-602850968, new fieldToLong(i5, fieldtodouble), getpostalcode), getpostalcode, 56);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if ((iIntValue & 3) != 2) {
            int i8 = RemoteActionCompatParcelizer + 117;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 3 % 5;
            }
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (!getpostalcode2.write(iIntValue & 1, z)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int[] iArr = jsonArrayToArray.RemoteActionCompatParcelizer;
            androidx.compose.ui.graphics.painter.Painter painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(iArr[fieldtodouble.ordinal()] == 1 ? com.logistics.rider.glovo.R.drawable.ic_bold_large_tick_complete : com.logistics.rider.glovo.R.drawable.ic_bold_large_tick_incomplete, getpostalcode2, 0);
            if (iArr[fieldtodouble.ordinal()] == 1) {
                getpostalcode2.serializer(-519179207);
                presenter = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-519178278);
                presenter = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                getpostalcode2.IconCompatParcelizer(false);
            }
            androidx.compose.material3.IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, (androidx.compose.ui.Modifier) null, presenter, getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 4);
        }
        return createfromparcel;
    }
}
