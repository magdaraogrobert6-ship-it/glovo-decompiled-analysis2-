package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import coil3.compose.AsyncImagePainter$State$Error;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firestore.v1.Value;
import com.mapbox.maps.MapboxMap;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.ui.common.widget.calendar.CalendarView;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import o.C0195provider;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.createFromParcel;
import o.fireOnUpdatedRect;
import o.getBringIntoViewOLwlOKw;
import o.getBringIntoViewOLwlOKwannotations;
import o.getCieXyz;
import o.getDrawOLwlOKw;
import o.getDrawOLwlOKwannotations;
import o.getShaderBrush;
import o.isItemDismissable;
import o.onPostScrollDzOQY0M;
import o.r8lambdaOnAT_e4BnIJKLP2lbYW4offEvj8;
import o.r8lambdaPCUTULvvj1sBLpkvrV9wIKSKbes;
import o.r8lambdaQpAq7452XITgtK00SHG5URS58xg;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setApplicationContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GestureNodeKt$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ int write;

    public /* synthetic */ GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.write = i;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Object isitemdismissable;
        Throwable th;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        switch (i2) {
            case 0:
                TraversableNode traversableNode = (TraversableNode) obj;
                if (!(traversableNode instanceof onPostScrollDzOQY0M)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((onPostScrollDzOQY0M) traversableNode).RemoteActionCompatParcelizer);
                bool.getClass();
                return bool;
            case 1:
                Long l = (Long) obj;
                l.getClass();
                return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(l);
            case 2:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set(MapboxMap.QFE_OFFSET, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return createfromparcel;
            case 3:
                Value valueIconCompatParcelizer = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((NodeCoordinatorCompanionPointerInputSource1) obj)).IconCompatParcelizer();
                if (valueIconCompatParcelizer == null) {
                    int i3 = RemoteActionCompatParcelizer + 103;
                    serializer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                getDrawOLwlOKwannotations getdrawolwlokwannotationsSerializer = getDrawOLwlOKw.serializer(!valueIconCompatParcelizer.hasNullValue());
                int i5 = serializer + 71;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return getdrawolwlokwannotationsSerializer;
            case 4:
                Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((NodeCoordinatorCompanionPointerInputSource1) obj)).IconCompatParcelizer();
                if (valueIconCompatParcelizer2 == null) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                return getDrawOLwlOKw.serializer(valueIconCompatParcelizer2.hasNullValue());
            case 5:
                String str = (String) obj;
                str.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
                return createfromparcel;
            case 6:
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((fireOnUpdatedRect) obj).IconCompatParcelizer());
                return createfromparcel;
            case 7:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                if (textLayoutResult.getLineCount() > 0) {
                    int i7 = RemoteActionCompatParcelizer + 121;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(textLayoutResult.getLineCount()));
                }
                return createfromparcel;
            case 8:
                getShaderBrush getshaderbrush = (getShaderBrush) obj;
                getshaderbrush.getClass();
                if (getshaderbrush instanceof getShaderBrush) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getshaderbrush.read);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 9:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null));
                return createfromparcel;
            case 10:
                C0195provider c0195provider = (C0195provider) obj;
                c0195provider.getClass();
                CashPaymentTaskUiItem cashPaymentTaskUiItem = c0195provider.cashPaymentTaskUiItem;
                CashPaymentTaskUiItem cashPaymentTaskUiItem2 = (CashPaymentTaskUiItem) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(cashPaymentTaskUiItem);
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem2, cashPaymentTaskUiItem}, getCieXyz.write())).booleanValue()) {
                    return c0195provider;
                }
                int i9 = serializer + 59;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                return C0195provider.read(c0195provider, null, cashPaymentTaskUiItem2, i9 % 2 == 0 ? 31145 : 959);
            case 11:
                AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
                asyncImagePainter$State$Error.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(asyncImagePainter$State$Error.serializer.read.getMessage());
                return createfromparcel;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(bool2);
                return createfromparcel;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new setApplicationContext(str2, null, null, 6));
                return createfromparcel;
            case 14:
                Context context = (Context) obj;
                context.getClass();
                CalendarView calendarView = new CalendarView(context, null);
                calendarView.setOnDateSelected(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return calendarView;
            case 15:
                r8lambdaPCUTULvvj1sBLpkvrV9wIKSKbes r8lambdapcutulvvj1sblpkvrv9wikskbes = (r8lambdaPCUTULvvj1sBLpkvrV9wIKSKbes) obj;
                r8lambdapcutulvvj1sblpkvrv9wikskbes.getClass();
                if (r8lambdapcutulvvj1sblpkvrv9wikskbes instanceof r8lambdaOnAT_e4BnIJKLP2lbYW4offEvj8) {
                    return createfromparcel;
                }
                if (r8lambdapcutulvvj1sblpkvrv9wikskbes instanceof r8lambdaQpAq7452XITgtK00SHG5URS58xg) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((r8lambdaQpAq7452XITgtK00SHG5URS58xg) r8lambdapcutulvvj1sblpkvrv9wikskbes).write);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            default:
                Throwable th2 = (Throwable) obj;
                int i10 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                try {
                    th = (Throwable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(th2);
                    Object[] objArr = {th2.getMessage(), th.getMessage()};
                    isitemdismissable = th;
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{th.getMessage(), th2.toString()}, getCieXyz.write())).booleanValue()) {
                            isitemdismissable = th;
                            isitemdismissable = null;
                        }
                    }
                } catch (Throwable th3) {
                    isitemdismissable = new isItemDismissable(th3);
                }
                isitemdismissable = th;
                return (Throwable) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
        }
    }
}
