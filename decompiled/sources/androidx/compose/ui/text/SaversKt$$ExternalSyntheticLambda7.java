package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.input.TextFieldValue;
import bo.app.c8$$ExternalSyntheticLambda3;
import bo.app.d0$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getFailureResponseData;
import o.getPostalCode;
import o.getUnregisteredInAppMessageannotations;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareInAppMessageWithZippedAssetHtmllambda2;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setBlock;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SaversKt$$ExternalSyntheticLambda7 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaversKt$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 57;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                return SaversKt.SpanStyleSaver$lambda$0((setBlock) obj, (SpanStyle) obj2);
            case 1:
                return SaversKt.TextLinkStylesSaver$lambda$0((setBlock) obj, (TextLinkStyles) obj2);
            case 2:
                Object objSaver$lambda$0 = TextFieldValue.Saver$lambda$0((setBlock) obj, (TextFieldValue) obj2);
                int i4 = read + 5;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return objSaver$lambda$0;
                }
                throw null;
            case 3:
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (!getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createFromParcel.INSTANCE;
            case 4:
                getFailureResponseData getfailureresponsedata = (getFailureResponseData) obj;
                getFailureResponseData getfailureresponsedata2 = (getFailureResponseData) obj2;
                getfailureresponsedata.getClass();
                getfailureresponsedata2.getClass();
                if (getfailureresponsedata.RemoteActionCompatParcelizer == getfailureresponsedata2.RemoteActionCompatParcelizer) {
                    int i5 = read + 121;
                    write = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 6:
                return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, obj2}, getCieXyz.write())).booleanValue());
            case 7:
                Integer numValueOf = Integer.valueOf(((Integer) obj).intValue() + 1);
                int i7 = write + 71;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 21 / 0;
                }
                return numValueOf;
            case 8:
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = (getUnregisteredInAppMessageannotations) obj;
                List list = (List) obj2;
                getunregisteredinappmessageannotations.getClass();
                list.getClass();
                ArrayList arrayListIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareInAppMessageWithZippedAssetHtmllambda2.serializer, list, true);
                arrayListIconCompatParcelizer.getClass();
                return pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations, arrayListIconCompatParcelizer, new c8$$ExternalSyntheticLambda3(list, 1));
            default:
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations2 = (getUnregisteredInAppMessageannotations) obj;
                List list2 = (List) obj2;
                getunregisteredinappmessageannotations2.getClass();
                list2.getClass();
                ArrayList arrayListIconCompatParcelizer2 = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareInAppMessageWithZippedAssetHtmllambda2.serializer, list2, true);
                arrayListIconCompatParcelizer2.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations2, arrayListIconCompatParcelizer2, new d0$$ExternalSyntheticLambda0(list2, 8));
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null ? LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer) : null;
                int i9 = read + 67;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 10 / 0;
                }
                return setgraphicmodalmaxwidthdp;
        }
    }
}
