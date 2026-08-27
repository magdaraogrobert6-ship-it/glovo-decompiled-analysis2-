package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getTransactionExecutor extends RgbCompanionExternalSyntheticLambda0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final getTypeConverter RemoteActionCompatParcelizer;
    public final List read;
    public final getTypeConverter serializer;

    public getTransactionExecutor(inTransaction intransaction) {
        getTypeConverter gettypeconverter = new getTypeConverter(intransaction.IconCompatParcelizer, intransaction.serializer, com.logistics.rider.glovo.R.string.camera_permission_denied_button_text);
        getTypeConverter gettypeconverter2 = new getTypeConverter(intransaction.write, intransaction.RemoteActionCompatParcelizer, intransaction.read);
        super(1);
        this.RemoteActionCompatParcelizer = gettypeconverter;
        this.serializer = gettypeconverter2;
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        this.read = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{"android.permission.CAMERA"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    @Override // o.RgbCompanionExternalSyntheticLambda0
    public final getTypeConverter IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        getTypeConverter gettypeconverter = this.serializer;
        int i5 = i3 + 45;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return gettypeconverter;
    }

    @Override // o.RgbCompanionExternalSyntheticLambda0
    public final getTypeConverter read() {
        int i = 2 % 2;
        int i2 = write + 47;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.RgbCompanionExternalSyntheticLambda0
    public final List serializer() {
        int i = 2 % 2;
        int i2 = write + 61;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getTransactionExecutor() {
        this(new inTransaction(63));
    }
}
