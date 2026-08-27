package o;

import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getOpenHelper implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getOpenHelper(boolean z, int i, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        this.RemoteActionCompatParcelizer = 1;
        this.read = z;
        this.serializer = i;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    public /* synthetic */ getOpenHelper(int i, int i2, Object obj, boolean z) {
        this.RemoteActionCompatParcelizer = i2;
        this.read = z;
        this.IconCompatParcelizer = obj;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 87;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.serializer;
        Object obj4 = this.IconCompatParcelizer;
        boolean z = this.read;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            coil3.util.UtilsKt.serializer(z, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 != 1) {
            ((Integer) obj2).getClass();
            LoadingFullScreenKt.LoadingView(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, (String) obj4, z);
            return createfromparcel2;
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj4;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i5 = write + 53;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            androidx.compose.ui.graphics.ColorFilter colorFilterM763tintxETnrds$default = androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion, equalEnum.RemoteActionCompatParcelizer(((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue(), z, getpostalcode), 0, 2, null);
            getNonZeroRgk1Os.write(Integer.valueOf(i4), null, null, Okio.RemoteActionCompatParcelizer(i4, getpostalcode, 0), null, null, null, null, androidx.compose.ui.layout.ContentScale.Companion.getNone(), colorFilterM763tintxETnrds$default, getpostalcode, (androidx.compose.ui.graphics.painter.Painter.$stable << 9) | 48, 6, 27636);
        }
        return createfromparcel2;
    }
}
