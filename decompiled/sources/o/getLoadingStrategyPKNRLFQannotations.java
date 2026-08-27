package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.delivery.accept.backToBackOrder.presentation.BackToBackAutoAcceptUiModelImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLoadingStrategyPKNRLFQannotations implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:75:0x012c  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i7 = 32;
        int i8 = 4;
        boolean z = false;
        Object obj5 = null;
        if (i6 == 0) {
            createFromFile createfromfile = (createFromFile) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            int iIntValue = ((Integer) obj4).intValue();
            createfromfile.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            if ((iIntValue & 6) == 0) {
                int i9 = serializer + 95;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    ((getPostalCode) getbirthdatefull).read(createfromfile);
                    obj5.hashCode();
                    throw null;
                }
                i = iIntValue | (((getPostalCode) getbirthdatefull).read(createfromfile) ? 4 : 2);
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                int i10 = serializer + 101;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                    obj5.hashCode();
                    throw null;
                }
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 32 : 16;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i & 1, !((i & 147) == 146))) {
                removeNodeAtDepth.serializer(createfromfile, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, i & 126);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i6 == 1) {
            DeliveryAutoAcceptMessageUiModelImpl deliveryAutoAcceptMessageUiModelImpl = (DeliveryAutoAcceptMessageUiModelImpl) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
            int iIntValue2 = ((Integer) obj4).intValue();
            deliveryAutoAcceptMessageUiModelImpl.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
            if ((iIntValue2 & 6) == 0) {
                int i11 = serializer + 109;
                IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    ((getPostalCode) getbirthdatefull2).read(deliveryAutoAcceptMessageUiModelImpl);
                    obj5.hashCode();
                    throw null;
                }
                i2 = iIntValue2 | (((getPostalCode) getbirthdatefull2).read(deliveryAutoAcceptMessageUiModelImpl) ? 4 : 2);
            } else {
                i2 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                int i12 = IconCompatParcelizer + 113;
                serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    int i13 = 23 / 0;
                    if (!((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2)) {
                        i7 = 16;
                    }
                } else if (!((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2)) {
                    i7 = 16;
                }
                i2 |= i7;
            }
            if ((i2 & 147) != 146) {
                int i14 = serializer + 119;
                IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    z = true;
                }
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(i2 & 1, z)) {
                androidx.sqlite.SQLite.RemoteActionCompatParcelizer(deliveryAutoAcceptMessageUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, null, getpostalcode2, i2 & 126);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i6 != 2) {
            setTimerStart settimerstart = (setTimerStart) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj3;
            int iIntValue3 = ((Integer) obj4).intValue();
            settimerstart.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.getClass();
            if ((iIntValue3 & 6) == 0) {
                i4 = iIntValue3 | (((getPostalCode) getbirthdatefull3).read(settimerstart) ? 4 : 2);
            } else {
                i4 = iIntValue3;
            }
            if ((iIntValue3 & 48) == 0) {
                i4 |= ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3) ? 32 : 16;
            }
            if ((i4 & 147) != 146) {
                int i15 = IconCompatParcelizer + 15;
                serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z = true;
            }
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (getpostalcode3.write(i4 & 1, z)) {
                coil3.util.ContextsKt.IconCompatParcelizer(settimerstart, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, getpostalcode3, i4 & 126);
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        BackToBackAutoAcceptUiModelImpl backToBackAutoAcceptUiModelImpl = (BackToBackAutoAcceptUiModelImpl) obj;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
        getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj3;
        int iIntValue4 = ((Integer) obj4).intValue();
        backToBackAutoAcceptUiModelImpl.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.getClass();
        if ((iIntValue4 & 6) == 0) {
            if (((getPostalCode) getbirthdatefull4).read(backToBackAutoAcceptUiModelImpl)) {
                int i17 = serializer + 45;
                IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i18 = i17 % 2;
            } else {
                i8 = 2;
            }
            i3 = iIntValue4 | i8;
        } else {
            i3 = iIntValue4;
        }
        if ((iIntValue4 & 48) == 0) {
            i3 |= ((getPostalCode) getbirthdatefull4).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4) ? 32 : 16;
        }
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
        if (getpostalcode4.write(i3 & 1, (i3 & 147) != 146)) {
            getPointerInputFilterannotations.write(backToBackAutoAcceptUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4, getpostalcode4, i3 & 126);
        } else {
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        int i19 = IconCompatParcelizer + 1;
        serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i20 = i19 % 2;
        return createfromparcel;
    }
}
