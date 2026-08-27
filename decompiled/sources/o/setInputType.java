package o;

/* JADX INFO: loaded from: classes.dex */
public final class setInputType implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ androidx.compose.ui.text.TextStyle IconCompatParcelizer;
    public final /* synthetic */ boolean MediaDescriptionCompat;
    public final /* synthetic */ onViewAttachedToWindow MediaMetadataCompat;
    public final /* synthetic */ setId MediaSessionCompatQueueItem;
    public final /* synthetic */ onViewAttachedToWindow RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.text.TextStyle read;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;
    public final /* synthetic */ onViewAttachedToWindow write;

    public setInputType(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, requiredSize3ABfNKs requiredsize3abfnks, requiredSize3ABfNKs requiredsize3abfnks2, boolean z, requiredSize3ABfNKs requiredsize3abfnks3, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, setId setid) {
        this.read = textStyle;
        this.IconCompatParcelizer = textStyle2;
        this.write = requiredsize3abfnks;
        this.RemoteActionCompatParcelizer = requiredsize3abfnks2;
        this.MediaDescriptionCompat = z;
        this.MediaMetadataCompat = requiredsize3abfnks3;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.MediaSessionCompatQueueItem = setid;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.text.TextStyle textStyleM3102copyp1EtxEg;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.text.TextStyle textStyleLerp = androidx.compose.ui.text.TextStyleKt.lerp(this.read, this.IconCompatParcelizer, ((Number) this.write.getValue()).floatValue());
            if (this.MediaDescriptionCompat) {
                textStyleM3102copyp1EtxEg = textStyleLerp.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyleLerp.spanStyle.m3016getColor0d7_KjU() : ((androidx.compose.ui.graphics.Color) this.MediaMetadataCompat.getValue()).m732unboximpl(), (15204351 & 2) != 0 ? textStyleLerp.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyleLerp.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyleLerp.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (15204351 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? textStyleLerp.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? textStyleLerp.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (15204351 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? textStyleLerp.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (15204351 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (15204351 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? textStyleLerp.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyleLerp.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? textStyleLerp.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (15204351 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? textStyleLerp.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleLerp.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyleLerp.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null);
            } else {
                textStyleM3102copyp1EtxEg = textStyleLerp;
            }
            androidx.compose.material3.internal.TextFieldImplKt.RemoteActionCompatParcelizer(((androidx.compose.ui.graphics.Color) this.RemoteActionCompatParcelizer.getValue()).m732unboximpl(), textStyleM3102copyp1EtxEg, coil3.ExtrasKt.write(1157484991, new AndroidPath_androidKtWhenMappings(this.serializer, 4, this.MediaSessionCompatQueueItem), getpostalcode), getpostalcode, 384);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
