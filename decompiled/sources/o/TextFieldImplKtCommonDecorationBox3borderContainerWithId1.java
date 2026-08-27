package o;

import android.net.Uri;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextFieldImplKtCommonDecorationBox3borderContainerWithId1 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static final int RemoteActionCompatParcelizer(int i, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 41;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = oncreatevirtualviewtranslationrequests.read - 1;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = ((i5 - i6) / 2) + i6;
            Object[] objArr = oncreatevirtualviewtranslationrequests.write;
            int i8 = ((TextFieldImplKtCommonDecorationBox3containerWithId1) objArr[i7]).serializer;
            if (i8 != i) {
                if (i8 < i) {
                    int i9 = write + 53;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        i6 = i7 + 1;
                        if (i < ((TextFieldImplKtCommonDecorationBox3containerWithId1) objArr[i6]).serializer) {
                        }
                    } else {
                        i6 = i7 + 1;
                        if (i < ((TextFieldImplKtCommonDecorationBox3containerWithId1) objArr[i6]).serializer) {
                        }
                    }
                } else {
                    i5 = i7 - 1;
                    int i10 = write + 97;
                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
            }
            int i12 = write + 17;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return i7;
        }
        return i6;
    }

    public static final String RemoteActionCompatParcelizer(transferSessionPackageI transfersessionpackagei, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        transfersessionpackagei.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (!((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_RACC_PASS_VERIFICATION_ENABLED)) {
            return "EmailAndPhone";
        }
        if (str.length() == 0) {
            return "VerifyScreen";
        }
        if (!str.equals("0000")) {
            return setCarryoverInAppMessage.write("PassError/{passErrorType}", "{passErrorType}", str);
        }
        int i4 = RemoteActionCompatParcelizer + 55;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String strEncode = Uri.encode("");
        strEncode.getClass();
        String strWrite = setCarryoverInAppMessage.write("Password/{email}/{phone}/{originalMessageId}?isPassFlow={isPassFlow}", "{email}", strEncode);
        String strEncode2 = Uri.encode(str2);
        strEncode2.getClass();
        String strWrite2 = setCarryoverInAppMessage.write(strWrite, "{phone}", strEncode2);
        String strEncode3 = Uri.encode(str3);
        strEncode3.getClass();
        return setCarryoverInAppMessage.write(setCarryoverInAppMessage.write(strWrite2, "{originalMessageId}", strEncode3), "{isPassFlow}", String.valueOf(true));
    }
}
