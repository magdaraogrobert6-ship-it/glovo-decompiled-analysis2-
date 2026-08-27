package com.qualtrics.digital;

import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
class Buttons implements Cloneable {
    int BorderRadius;
    ButtonOptions ButtonOne;
    String ButtonStyle;
    ButtonOptions ButtonTwo;
    String CloseButtonBackgroundColor = "#00FFFFFF";
    String CloseButtonColor;
    String LinkAlignment;
    String LinkColor;
    int Number;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buttons m4838clone() {
        try {
            Buttons buttons = (Buttons) super.clone();
            buttons.ButtonOne = buttons.ButtonOne.m4837clone();
            buttons.ButtonTwo = buttons.ButtonTwo.m4837clone();
            return buttons;
        } catch (CloneNotSupportedException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
    }

    public boolean hasCloseButton() {
        String str = this.CloseButtonColor;
        return (str == null || str.equals("")) ? false : true;
    }
}
