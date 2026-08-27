package com.braze;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Gender;
import com.braze.images.DefaultBrazeImageLoader;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeUser$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ BrazeUser$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return BrazeUser.setPhoneNumber$lambda$2$0(str);
            case 1:
                return BrazeUser.addToSubscriptionGroup$lambda$2(str);
            case 2:
                return BrazeUser.setCountry$lambda$1(str);
            case 3:
                return BrazeUser.setCustomUserAttribute$lambda$3(str);
            case 4:
                return BrazeUser.setCustomUserAttribute$lambda$5(str);
            case 5:
                return BrazeUser.setCustomUserAttribute$lambda$2(str);
            case 6:
                return BrazeUser.setPhoneNumber$lambda$3(str);
            case 7:
                return BrazeUser.setCustomUserAttribute$lambda$1(str);
            case 8:
                return BrazeUser.setLanguage$lambda$1(str);
            case 9:
                return BrazeUser.setFirstName$lambda$1(str);
            case 10:
                return BrazeUser.addToCustomAttributeArray$lambda$1(str);
            case 11:
                return BrazeUser._set_userId_$lambda$0(str);
            case 12:
                return BrazeUser.setCustomUserAttributeToNow$lambda$0(str);
            case 13:
                return BrazeUser.unsetLocationCustomAttribute$lambda$2(str);
            case 14:
                return BrazeUser.setLastName$lambda$1(str);
            case 15:
                return BrazeUser.setHomeCity$lambda$1(str);
            case 16:
                return BrazeUser.removeFromSubscriptionGroup$lambda$2(str);
            case 17:
                return BrazeUser.setCustomUserAttribute$lambda$0(str);
            case 18:
                return BrazeUser.setLineId$lambda$2$0(str);
            case 19:
                return BrazeUser.setLineId$lambda$3(str);
            case 20:
                return BrazeUser.addAlias$lambda$3(str);
            case 21:
                return BrazeUser.setCustomAttributeArray$lambda$0(str);
            case 22:
                return BrazeUser.setEmail$lambda$2$0(str);
            case 23:
                return BrazeUser.setEmail$lambda$3(str);
            case 24:
                return BrazeConfigurationProvider._get_applicationIconResourceId_$lambda$0(str);
            case 25:
                return Gender.Companion.getGender$lambda$1(str);
            case 26:
                return DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$0$0(str);
            case 27:
                return DefaultBrazeImageLoader.renderUrlIntoView$lambda$1(str);
            case 28:
                return DefaultBrazeImageLoader.getBitmapFromUrl$lambda$3(str);
            default:
                return DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$0$1(str);
        }
    }
}
