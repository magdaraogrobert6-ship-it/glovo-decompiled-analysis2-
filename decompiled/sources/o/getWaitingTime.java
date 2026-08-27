package o;

import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getWaitingTime implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ int serializer = 0;

    public /* synthetic */ getWaitingTime(int i, long j) {
        this.RemoteActionCompatParcelizer = i;
        this.read = j;
    }

    public /* synthetic */ getWaitingTime(long j, int i) {
        this.read = j;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.graphics.painter.Painter painterPainterResource;
        int i;
        long j;
        String str;
        androidx.compose.ui.Modifier modifier;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i7 = this.RemoteActionCompatParcelizer;
        if (i6 != 0) {
            ((Integer) obj2).intValue();
            DestinationHeaderKt.serializer(this.read, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i7 | 1));
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i8 = write + 81;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(i7, getpostalcode, 1);
                getpostalcode.serializer(-2132140295);
                getpostalcode.IconCompatParcelizer(false);
                i = androidx.compose.ui.graphics.painter.Painter.$stable;
                j = this.read;
                str = null;
                modifier = null;
                i2 = 2;
            } else {
                painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(i7, getpostalcode, 0);
                getpostalcode.serializer(-2132140295);
                getpostalcode.IconCompatParcelizer(false);
                i = androidx.compose.ui.graphics.painter.Painter.$stable;
                j = this.read;
                str = null;
                modifier = null;
                i2 = 4;
            }
            androidx.compose.material3.IconKt.m116Iconww6aTOc(painterPainterResource, str, modifier, j, getpostalcode, i, i2);
            int i9 = IconCompatParcelizer + 119;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i11 = IconCompatParcelizer + 55;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return createfromparcel;
    }
}
