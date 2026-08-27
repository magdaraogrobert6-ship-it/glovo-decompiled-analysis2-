package com.qualtrics.digital;

import com.adjust.sdk.Constants;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
class DescriptionTextOptions extends TextOptions implements Cloneable {
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DescriptionTextOptions m4841clone() {
        try {
            return (DescriptionTextOptions) super.clone();
        } catch (CloneNotSupportedException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
    }

    @Override // com.qualtrics.digital.TextOptions
    public int getTextSize() {
        String str = this.Size;
        if (str == null) {
            return 13;
        }
        str.getClass();
        if (str.equals(Constants.MEDIUM)) {
            return 15;
        }
        return !str.equals(Constants.LARGE) ? 13 : 17;
    }
}
