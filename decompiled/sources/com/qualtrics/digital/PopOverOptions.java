package com.qualtrics.digital;

import com.google.gson.annotations.SerializedName;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
class PopOverOptions implements Cloneable {
    Buttons Buttons;
    DescriptionTextOptions Description;
    SizeAndStyle SizeAndStyle;
    TitleTextOptions Title;

    @SerializedName("ThemeOverriddenThroughSdk")
    Boolean themeOverriddenThroughSdk = Boolean.FALSE;
    Divider Divider = new Divider();

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PopOverOptions m4848clone() {
        try {
            PopOverOptions popOverOptions = (PopOverOptions) super.clone();
            popOverOptions.Title = popOverOptions.Title.m4855clone();
            popOverOptions.Description = popOverOptions.Description.m4841clone();
            popOverOptions.Buttons = popOverOptions.Buttons.m4838clone();
            popOverOptions.SizeAndStyle = popOverOptions.SizeAndStyle.m4854clone();
            popOverOptions.Divider = popOverOptions.Divider.m4842clone();
            return popOverOptions;
        } catch (CloneNotSupportedException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
    }
}
