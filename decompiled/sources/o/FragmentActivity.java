package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FragmentActivity implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;

    public /* synthetic */ FragmentActivity(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.ui.Modifier modifierThen;
        int i;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.serializer;
        boolean z = false;
        if (i3 == 0) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((ModalBottomSheetDialogWrapper) obj).getClass();
            if ((iIntValue & 17) != 16) {
                int i4 = write + 125;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 2;
                }
                z = true;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                int i6 = read + 63;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    modifierThen = androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read);
                    i = 33;
                } else {
                    modifierThen = androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read);
                    i = 6;
                }
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(modifierThen, getpostalcode, i);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i3 == 1) {
            isInline isinline = (isInline) obj;
            String str = (String) obj2;
            Double d = (Double) obj3;
            d.doubleValue();
            isinline.getClass();
            str.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(isinline, str, d);
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        if ((iIntValue2 & 17) != 16) {
            int i7 = write + 99;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (!(!getpostalcode2.write(iIntValue2 & 1, z))) {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(androidx.compose.foundation.layout.SizeKt.serializer(androidx.compose.foundation.layout.SizeKt.read(androidx.compose.foundation.layout.SizeKt.write(androidx.compose.ui.Modifier.Companion, 1.0f), 0.0f, androidx.compose.ui.unit.Dp.m3673constructorimpl(204.0f), 1), (androidx.compose.ui.Alignment.Vertical) null, 3), getpostalcode2, 6);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
