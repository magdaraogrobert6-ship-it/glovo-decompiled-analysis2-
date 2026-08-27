package o;

import android.text.Spannable;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.bubble.presentation.BubbleContentKt;
import com.roadrunner.home.expandedbubblelayer.presentation.ExpandedBubbleUiModelImpl;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class forEachGesturableIntersection implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object write;

    public /* synthetic */ forEachGesturableIntersection(fillStringBounds fillstringbounds, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.IconCompatParcelizer = 2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    public /* synthetic */ forEachGesturableIntersection(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.write = obj2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.write;
        Object obj5 = this.read;
        Object obj6 = null;
        if (i4 == 0) {
            String str = (String) obj5;
            String str2 = (String) obj4;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((copyejIjP34) obj).getClass();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(1 & iIntValue, (iIntValue & 17) != 16)) {
                BubbleContentKt.BubbleButtonColumn(0, getpostalcode, null, str, str2);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i5 = RemoteActionCompatParcelizer + 75;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            return createfromparcel;
        }
        if (i4 == 1) {
            return androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes$lambda$2((Spannable) obj5, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj4, (androidx.compose.ui.text.SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
        }
        if (i4 != 2) {
            if (i4 == 3) {
                ((Integer) obj3).intValue();
                ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5).invoke((PaintExtensions_androidKt) obj4, (getBirthDateFull) obj2, 0);
                return createfromparcel;
            }
            ExpandedBubbleUiModelImpl expandedBubbleUiModelImpl = (ExpandedBubbleUiModelImpl) obj4;
            ((Integer) obj3).getClass();
            ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
            expandedBubbleUiModelImpl.getClass();
            new DragAndDropTargetModifierNode(new SnackbarKt$$ExternalSyntheticLambda2(expandedBubbleUiModelImpl, 10, (setSharedElementEnterTransition) obj5), true, -2038067642).invoke((getBirthDateFull) obj2, 0);
            return createfromparcel;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        PaintExtensions_androidKt paintExtensions_androidKt = (PaintExtensions_androidKt) obj;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        paintExtensions_androidKt.getClass();
        if ((iIntValue2 & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer;
            int i8 = i7 + 101;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if ((iIntValue2 & 8) == 0) {
                int i10 = i7 + 9;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    ((getPostalCode) getbirthdatefull2).read(paintExtensions_androidKt);
                    throw null;
                }
                zIconCompatParcelizer = ((getPostalCode) getbirthdatefull2).read(paintExtensions_androidKt);
            } else {
                zIconCompatParcelizer = ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(paintExtensions_androidKt);
            }
            iIntValue2 |= zIconCompatParcelizer ? 4 : 2;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            int i11 = RemoteActionCompatParcelizer + 47;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                boolean z = paintExtensions_androidKt instanceof Paint29;
                obj6.hashCode();
                throw null;
            }
            if (paintExtensions_androidKt instanceof Paint29) {
                getpostalcode2.serializer(1374005679);
                Paint29 paint29 = (Paint29) paintExtensions_androidKt;
                getFocusedStyle.IconCompatParcelizer.RemoteActionCompatParcelizer(paint29.IconCompatParcelizer, paint29.read, Integer.valueOf(paint29.RemoteActionCompatParcelizer), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode2, 0);
                getpostalcode2.IconCompatParcelizer(false);
            } else if (paintExtensions_androidKt instanceof getTextBounds) {
                getpostalcode2.serializer(1374013949);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                if (!paintExtensions_androidKt.equals(extendWith.serializer)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, 1374003250, false);
                }
                getpostalcode2.serializer(1374015485);
                getpostalcode2.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
