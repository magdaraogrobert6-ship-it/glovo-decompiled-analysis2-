package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.authentication.UserLinkingFailureReason;
import com.sentiance.sdk.util.Optional;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdapDqDae9wxPX0U0kxBZ3MrbxBXQU extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    final /* synthetic */ r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA RemoteActionCompatParcelizer;
    final /* synthetic */ r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U serializer;

    public r8lambdapDqDae9wxPX0U0kxBZ3MrbxBXQU(r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U r8lambdadjzxvogwic3ngzy46zxlciogj2u, r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA r8lambdak5px3nowmwv8genkijqvftf4qia) {
        this.serializer = r8lambdadjzxvogwic3ngzy46zxlciogj2u;
        this.RemoteActionCompatParcelizer = r8lambdak5px3nowmwv8genkijqvftf4qia;
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        String string;
        r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U r8lambdadjzxvogwic3ngzy46zxlciogj2u = this.serializer;
        parseLonglambda0 parselonglambda0 = r8lambdadjzxvogwic3ngzy46zxlciogj2u.IconCompatParcelizer;
        int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
        parselonglambda0.RemoteActionCompatParcelizer("User linking response received: %d %s", Integer.valueOf(i), setshouldpersistwebviewwhenbackgroundingapp.read);
        r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA r8lambdak5px3nowmwv8genkijqvftf4qia = this.RemoteActionCompatParcelizer;
        if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
            r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U.IconCompatParcelizer(r8lambdadjzxvogwic3ngzy46zxlciogj2u, r8lambdak5px3nowmwv8genkijqvftf4qia, UserLinkingFailureReason.UNEXPECTED_ERROR, "Response has no body");
            return;
        }
        if (!setshouldpersistwebviewwhenbackgroundingapp.write()) {
            UserLinkingFailureReason userLinkingFailureReason = UserLinkingFailureReason.SERVER_ERROR;
            int i2 = setshouldpersistwebviewwhenbackgroundingapp.serializer;
            try {
                string = setsmallnotificationiconnameandroid_sdk_base_release.serializer();
            } catch (IOException e) {
                StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i2, "response code: ", ", exception: ");
                sbM.append(e.getMessage());
                string = sbM.toString();
            }
            r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U.IconCompatParcelizer(r8lambdadjzxvogwic3ngzy46zxlciogj2u, r8lambdak5px3nowmwv8genkijqvftf4qia, userLinkingFailureReason, string);
            return;
        }
        Optional optional = r8lambdadjzxvogwic3ngzy46zxlciogj2u.serializer.read(setsmallnotificationiconnameandroid_sdk_base_release.write(), setCustomUserAttributelambda7.IconCompatParcelizer, true);
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = r8lambdadjzxvogwic3ngzy46zxlciogj2u.RemoteActionCompatParcelizer.write();
        if (optional.read()) {
            r8lambdadjzxvogwic3ngzy46zxlciogj2u.IconCompatParcelizer.RemoteActionCompatParcelizer("Couldn't deserialize SdkAuth thrift", new Object[0]);
            r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U.IconCompatParcelizer(r8lambdadjzxvogwic3ngzy46zxlciogj2u, r8lambdak5px3nowmwv8genkijqvftf4qia, UserLinkingFailureReason.UNEXPECTED_ERROR, "Failed to parse the response");
        } else if (optionalWrite.read()) {
            r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U.IconCompatParcelizer(r8lambdadjzxvogwic3ngzy46zxlciogj2u, r8lambdak5px3nowmwv8genkijqvftf4qia, UserLinkingFailureReason.NO_USER, "No user present on device");
        } else {
            r8lambdak5px3nowmwv8genkijqvftf4qia.IconCompatParcelizer(r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U.serializer(r8lambdadjzxvogwic3ngzy46zxlciogj2u, (setCustomUserAttributelambda7) optional.write(), optionalWrite.write()));
        }
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.serializer.IconCompatParcelizer.IconCompatParcelizer(false, iOException, "Failed to link user. Network error.", new Object[0]);
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(UserLinkingFailureReason.NETWORK_ERROR, message);
    }
}
