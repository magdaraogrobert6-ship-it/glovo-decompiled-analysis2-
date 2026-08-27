package o;

import android.net.Uri;

/* JADX INFO: renamed from: o.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0188n implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ relativeMoveTo IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ C0188n(relativeMoveTo relativemoveto, int i) {
        this.read = i;
        this.IconCompatParcelizer = relativemoveto;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        relativeMoveTo relativemoveto = this.IconCompatParcelizer;
        switch (i4) {
            case 0:
                String str = (String) obj;
                str.getClass();
                String strEncode = Uri.encode(str);
                strEncode.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write("reset-password?userName={userName}", "{userName}", strEncode), null, 6);
                break;
            case 1:
                bExternalSyntheticLambda3 bexternalsyntheticlambda3 = (bExternalSyntheticLambda3) obj;
                bexternalsyntheticlambda3.getClass();
                String strEncode2 = Uri.encode(bexternalsyntheticlambda3.RemoteActionCompatParcelizer);
                String strEncode3 = Uri.encode(bexternalsyntheticlambda3.IconCompatParcelizer);
                strEncode2.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write(setCarryoverInAppMessage.write("otp?userName={userName}&countryPhoneCode={countryPhoneCode}", "{userName}", strEncode2), "{countryPhoneCode}", strEncode3 != null ? strEncode3 : ""), null, 6);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                String strEncode4 = Uri.encode(str2);
                strEncode4.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write("checkEmail?userEmail={userEmail}", "{userEmail}", strEncode4), null, 6);
                break;
            case 3:
                AndroidPathEffect androidPathEffect = (AndroidPathEffect) obj;
                androidPathEffect.getClass();
                androidPathEffect.RemoteActionCompatParcelizer(relativemoveto.read.read().IconCompatParcelizer.IconCompatParcelizer);
                androidPathEffect.write = true;
                androidPathEffect.RemoteActionCompatParcelizer = false;
                break;
            case 4:
                AndroidPathEffect androidPathEffect2 = (AndroidPathEffect) obj;
                int i5 = relativemoveto.read.read().IconCompatParcelizer.IconCompatParcelizer;
                androidPathEffect2.getClass();
                androidPathEffect2.RemoteActionCompatParcelizer(i5);
                androidPathEffect2.write = true;
                androidPathEffect2.RemoteActionCompatParcelizer = false;
                break;
            case 5:
                AndroidPathEffect androidPathEffect3 = (AndroidPathEffect) obj;
                int i6 = relativemoveto.read.read().IconCompatParcelizer.IconCompatParcelizer;
                androidPathEffect3.getClass();
                androidPathEffect3.RemoteActionCompatParcelizer(i6);
                androidPathEffect3.write = true;
                androidPathEffect3.RemoteActionCompatParcelizer = false;
                break;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                String strEncode5 = Uri.encode(str3);
                strEncode5.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write("reset-password?userName={userName}", "{userName}", strEncode5), null, 6);
                String strEncode6 = Uri.encode(str3);
                strEncode6.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write("checkEmail?userEmail={userEmail}", "{userEmail}", strEncode6), null, 6);
                int i7 = write + 61;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                break;
            case 7:
                bExternalSyntheticLambda3 bexternalsyntheticlambda4 = (bExternalSyntheticLambda3) obj;
                bexternalsyntheticlambda4.getClass();
                String str4 = bexternalsyntheticlambda4.RemoteActionCompatParcelizer;
                str4.getClass();
                String strEncode7 = Uri.encode(str4);
                strEncode7.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write("reset-password?userName={userName}", "{userName}", strEncode7), null, 6);
                String strEncode8 = Uri.encode(str4);
                String strEncode9 = Uri.encode(bexternalsyntheticlambda4.IconCompatParcelizer);
                strEncode8.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write(setCarryoverInAppMessage.write("otp?userName={userName}&countryPhoneCode={countryPhoneCode}", "{userName}", strEncode8), "{countryPhoneCode}", strEncode9 != null ? strEncode9 : ""), null, 6);
                break;
            default:
                ActivityHandler44 activityHandler44 = (ActivityHandler44) obj;
                activityHandler44.getClass();
                String str5 = activityHandler44.RemoteActionCompatParcelizer;
                String str6 = activityHandler44.serializer;
                str5.getClass();
                str6.getClass();
                String strEncode10 = Uri.encode(str5);
                strEncode10.getClass();
                String strWrite = setCarryoverInAppMessage.write("OtpVerification/{otpPhoneNumber}/{email}", "{otpPhoneNumber}", strEncode10);
                String strEncode11 = Uri.encode(str6);
                strEncode11.getClass();
                relativeMoveTo.IconCompatParcelizer(relativemoveto, setCarryoverInAppMessage.write(strWrite, "{email}", strEncode11), null, 6);
                int i9 = write + 93;
                RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 91 / 0;
                }
                break;
        }
        return createfromparcel;
    }
}
