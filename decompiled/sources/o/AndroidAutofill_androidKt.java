package o;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidAutofill_androidKt implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ AndroidAutofill_androidKt(int i, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.IconCompatParcelizer;
        if (i != 0) {
            if (i != 1) {
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
                int iIntValue = ((Number) obj3).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(1 & iIntValue, (iIntValue & 17) != 16)) {
                    androidx.compose.material3.TextKt.m131TextNvy7gAk((String) obj4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, getpostalcode, 0, 0, 262142);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            }
            AndroidFillableData androidFillableData = (AndroidFillableData) obj;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= (iIntValue2 & 8) == 0 ? ((getPostalCode) getbirthdatefull2).read(androidFillableData) : ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(androidFillableData) ? 4 : 2;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                androidx.compose.material3.TooltipKt.m133PlainTooltipgv3ox5I(androidFillableData, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, coil3.ExtrasKt.write(-999924215, new onFocusChanged(1, (String) obj4), getpostalcode2), getpostalcode2, (iIntValue2 & 14) | 805306368);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj;
        ((Number) obj3).intValue();
        getPostalCode getpostalcode3 = (getPostalCode) ((getBirthDateFull) obj2);
        getpostalcode3.serializer(-1498516085);
        width widthVarSerializer = resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode3);
        width widthVarSerializer2 = resolvePointerPrecision.serializer(AutofillTree.FastEffects, getpostalcode3);
        androidx.compose.animation.core.Transition transition = (androidx.compose.animation.core.Transition) obj4;
        androidx.compose.animation.core.TransitionState transitionState = transition.MediaSessionCompatToken;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = transition.MediaBrowserCompatMediaItem;
        boolean zBooleanValue = ((Boolean) transitionState.IconCompatParcelizer()).booleanValue();
        getpostalcode3.serializer(-1553362193);
        float f = zBooleanValue ? 1.0f : 0.8f;
        getpostalcode3.IconCompatParcelizer(false);
        onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
        boolean zBooleanValue2 = ((Boolean) onshowtranslationui.getValue()).booleanValue();
        getpostalcode3.serializer(-1553362193);
        float f2 = zBooleanValue2 ? 1.0f : 0.8f;
        getpostalcode3.IconCompatParcelizer(false);
        transition.IconCompatParcelizer();
        getpostalcode3.serializer(386845748);
        getpostalcode3.IconCompatParcelizer(false);
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = requiredWidth3ABfNKs.read;
        requiredSize3ABfNKs requiredsize3abfnksSerializer = requiredHeightInVpY3zN4default.serializer(transition, Float.valueOf(f), Float.valueOf(f2), widthVarSerializer, requiredsizeinqdbjur0default, "tooltip transition: scaling", getpostalcode3, 196608);
        boolean zBooleanValue3 = ((Boolean) transition.MediaSessionCompatToken.IconCompatParcelizer()).booleanValue();
        getpostalcode3.serializer(2073045083);
        float f3 = zBooleanValue3 ? 1.0f : 0.0f;
        getpostalcode3.IconCompatParcelizer(false);
        boolean zBooleanValue4 = ((Boolean) onshowtranslationui.getValue()).booleanValue();
        getpostalcode3.serializer(2073045083);
        float f4 = zBooleanValue4 ? 1.0f : 0.0f;
        getpostalcode3.IconCompatParcelizer(false);
        transition.IconCompatParcelizer();
        getpostalcode3.serializer(-281714272);
        getpostalcode3.IconCompatParcelizer(false);
        androidx.compose.ui.Modifier modifierM887graphicsLayerAp8cVGQ = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m887graphicsLayerAp8cVGQ(modifier, (124895 & 1) != 0 ? 1.0f : ((Number) ((onShowTranslationui) requiredsize3abfnksSerializer.ParcelableVolumeInfo).getValue()).floatValue(), (124895 & 2) != 0 ? 1.0f : ((Number) ((onShowTranslationui) requiredsize3abfnksSerializer.ParcelableVolumeInfo).getValue()).floatValue(), (124895 & 4) == 0 ? ((Number) ((onShowTranslationui) requiredHeightInVpY3zN4default.serializer(transition, Float.valueOf(f3), Float.valueOf(f4), widthVarSerializer2, requiredsizeinqdbjur0default, "tooltip transition: alpha", getpostalcode3, 196608).ParcelableVolumeInfo).getValue()).floatValue() : 1.0f, (124895 & 8) != 0 ? 0.0f : 0.0f, (124895 & 16) != 0 ? 0.0f : 0.0f, (124895 & 32) != 0 ? 0.0f : 0.0f, (124895 & 64) != 0 ? 0.0f : 0.0f, (124895 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? 0.0f : 0.0f, (124895 & androidx.compose.ui.graphics.Fields.RotationX) == 0 ? 0.0f : 0.0f, (124895 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? 8.0f : 0.0f, (124895 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? androidx.compose.ui.graphics.TransformOrigin.Companion.m1138getCenterSzJe1aQ() : 0L, (124895 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : null, (124895 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? false : false, (124895 & 8192) != 0 ? null : null, (124895 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (124895 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (124895 & 65536) != 0 ? androidx.compose.ui.graphics.CompositingStrategy.Companion.m814getAutoNrFUSI() : 0);
        getpostalcode3.IconCompatParcelizer(false);
        return modifierM887graphicsLayerAp8cVGQ;
    }
}
