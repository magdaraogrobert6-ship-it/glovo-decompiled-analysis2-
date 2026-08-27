package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsExtraLargeBubbleContentKt;
import com.roadrunner.home.expandedbubblelayer.presentation.compose.DefaultExtraLargeBubbleContentKt;
import com.roadrunner.home.expandedbubblelayer.presentation.compose.DefaultLargeBubbleContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setReturnTransition implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ setTargetFragment serializer;

    public /* synthetic */ setReturnTransition(setTargetFragment settargetfragment, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = settargetfragment;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        setArguments setarguments;
        setArguments setarguments2;
        int i = 2 % 2;
        int i2 = read + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        setTargetFragment settargetfragment = this.serializer;
        androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        modifier.getClass();
        int i5 = 4;
        boolean z = true;
        if (i4 == 0) {
            if ((iIntValue & 6) == 0) {
                if (((getPostalCode) getbirthdatefull).read(modifier)) {
                    int i6 = read + 75;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    i5 = 2;
                }
                iIntValue |= i5;
            }
            if ((iIntValue & 19) == 18) {
                int i8 = write + 91;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                setArguments setarguments3 = (setArguments) coil3.ExtrasKt.write(settargetfragment.read, getpostalcode, 0).getValue();
                if (setarguments3 == null) {
                    int i10 = read + 13;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getpostalcode.serializer(-750735993);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-750735992);
                    setAnimations setanimations = setarguments3.read;
                    setanimations.getClass();
                    DefaultLargeBubbleContentKt.DefaultLargeBubbleContent((setAllowReturnTransitionOverlap) setanimations, modifier, getpostalcode, (iIntValue << 3) & 112);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i4 != 1) {
            if ((iIntValue & 6) == 0) {
                int i12 = write + 3;
                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    ((getPostalCode) getbirthdatefull).read(modifier);
                    throw null;
                }
                iIntValue |= ((getPostalCode) getbirthdatefull).read(modifier) ? 4 : 2;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
            if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                int i13 = read + 3;
                write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 != 0 ? (setarguments2 = (setArguments) coil3.ExtrasKt.write(settargetfragment.read, getpostalcode2, 0).getValue()) != null : (setarguments2 = (setArguments) coil3.ExtrasKt.write(settargetfragment.read, getpostalcode2, 1).getValue()) != null) {
                    getpostalcode2.serializer(1578887107);
                    setAnimations setanimations2 = setarguments2.read;
                    setanimations2.getClass();
                    DefaultExtraLargeBubbleContentKt.DefaultExtraLargeBubbleContent((setAllowReturnTransitionOverlap) setanimations2, modifier, getpostalcode2, (iIntValue << 3) & 112);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(1578887106);
                    getpostalcode2.IconCompatParcelizer(false);
                }
            }
            return createfromparcel;
        }
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((getPostalCode) getbirthdatefull).read(modifier) ? 4 : 2;
            int i14 = write + 51;
            read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        if ((iIntValue & 19) == 18) {
            int i16 = write + 59;
            read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = false;
        }
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        if (getpostalcode3.write(iIntValue & 1, z)) {
            int i18 = write + 89;
            read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i18 % 2 == 0 ? (setarguments = (setArguments) coil3.ExtrasKt.write(settargetfragment.read, getpostalcode3, 0).getValue()) != null : (setarguments = (setArguments) coil3.ExtrasKt.write(settargetfragment.read, getpostalcode3, 0).getValue()) != null) {
                getpostalcode3.serializer(1510717165);
                setAnimations setanimations3 = setarguments.read;
                setanimations3.getClass();
                EarningsExtraLargeBubbleContentKt.EarningsExtraLargeBubbleContent((getWordDRrd7Zo) setanimations3, modifier, getpostalcode3, (iIntValue << 3) & 112);
                getpostalcode3.IconCompatParcelizer(false);
            } else {
                getpostalcode3.serializer(1510717164);
                getpostalcode3.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
