package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AtomicReference_jvmAndAndroidKt implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ Object read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ AtomicReference_jvmAndAndroidKt(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, equals equalsVar, boolean z) {
        this.read = equalsVar;
        this.serializer = z;
        this.write = mutableInteractionSourceImpl;
    }

    public /* synthetic */ AtomicReference_jvmAndAndroidKt(boolean z, String str, androidx.compose.ui.text.TextStyle textStyle) {
        this.serializer = z;
        this.read = str;
        this.write = textStyle;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x018a  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        long accessibilityClassName;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.write;
        Object obj5 = this.read;
        boolean z3 = this.serializer;
        if (i2 != 0) {
            String str = (String) obj5;
            androidx.compose.ui.text.TextStyle textStyle = (androidx.compose.ui.text.TextStyle) obj4;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((String) obj).getClass();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                int i3 = IconCompatParcelizer + 25;
                MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (z3) {
                    getpostalcode.serializer(-1249934152);
                    accessibilityClassName = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getMenu();
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1249932745);
                    accessibilityClassName = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getAccessibilityClassName();
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i5 = IconCompatParcelizer + 105;
                MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, accessibilityClassName, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131066);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createFromParcel.INSTANCE;
        }
        equals equalsVar = (equals) obj5;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = equalsVar.read;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj4;
        ((Integer) obj3).getClass();
        getPostalCode getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj2);
        getpostalcode2.serializer(-2137546592);
        if (getpostalcode2.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl) {
            int i7 = IconCompatParcelizer + 73;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
        boolean z4 = ((SelectionHandleIcon) onshowtranslationui.getValue()) == SelectionHandleIcon.Vertical || !z;
        boolean z5 = getpostalcode2.read(equalsVar);
        Object objComponentActivity = getpostalcode2.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (z5) {
            objComponentActivity = new InlineChildren(14, equalsVar);
            getpostalcode2.write(objComponentActivity);
        } else {
            int i8 = MediaMetadataCompat + 25;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                throw null;
            }
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new InlineChildren(14, equalsVar);
                getpostalcode2.write(objComponentActivity);
            }
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = androidx.compose.runtime.CompositionKt.serializer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2);
        Object objComponentActivity2 = getpostalcode2.ComponentActivity();
        if (objComponentActivity2 == androidContentCaptureManager) {
            androidx.compose.foundation.gestures.DefaultScrollableState defaultScrollableState = new androidx.compose.foundation.gestures.DefaultScrollableState(new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7Serializer, 0));
            getpostalcode2.write(defaultScrollableState);
            objComponentActivity2 = defaultScrollableState;
        }
        getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = (getAdjustedCoordinatesk4lQ0M) objComponentActivity2;
        boolean z6 = getpostalcode2.read(getadjustedcoordinatesk4lq0m);
        boolean z7 = getpostalcode2.read(equalsVar);
        Object objComponentActivity3 = getpostalcode2.ComponentActivity();
        if (!z6 && !z7) {
            int i9 = MediaMetadataCompat + 25;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new BiasAbsoluteAlignment(getadjustedcoordinatesk4lq0m, equalsVar);
                getpostalcode2.write(objComponentActivity3);
            }
        } else {
            objComponentActivity3 = new BiasAbsoluteAlignment(getadjustedcoordinatesk4lq0m, equalsVar);
            getpostalcode2.write(objComponentActivity3);
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) objComponentActivity3;
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
        SelectionHandleIcon selectionHandleIcon = (SelectionHandleIcon) onshowtranslationui.getValue();
        if (z3) {
            int i11 = IconCompatParcelizer + 95;
            MediaMetadataCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0 ? ((getContentCaptureSessionui) equalsVar.write).serializer() != 0.0f : ((getContentCaptureSessionui) equalsVar.write).serializer() != 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        androidx.compose.ui.Modifier modifierRemoteActionCompatParcelizer = androidx.compose.foundation.gestures.ScrollableKt.RemoteActionCompatParcelizer(companion, biasAbsoluteAlignment, selectionHandleIcon, z2, z4, mutableInteractionSourceImpl);
        getpostalcode2.IconCompatParcelizer(false);
        int i12 = MediaMetadataCompat + 87;
        IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return modifierRemoteActionCompatParcelizer;
    }
}
