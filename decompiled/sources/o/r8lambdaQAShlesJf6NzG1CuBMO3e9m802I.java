package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaQAShlesJf6NzG1CuBMO3e9m802I implements r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ {
    public abstract void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException;

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp) throws IOException {
        setshouldpersistwebviewwhenbackgroundingapp.getClass();
        setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release = setshouldpersistwebviewwhenbackgroundingapp.MediaBrowserCompatMediaItem;
        try {
            serializer(r8lambda4gsaww0uf5fhes0li0lym_jwy38, setshouldpersistwebviewwhenbackgroundingapp, setsmallnotificationiconnameandroid_sdk_base_release);
            int i = sourceInformationContextOfdefault.read();
            int i2 = sourceInformationContextOfdefault.read();
            int i3 = sourceInformationContextOfdefault.read();
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{setsmallnotificationiconnameandroid_sdk_base_release, null}, i3);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i4 = sourceInformationContextOfdefault.read();
                int i5 = sourceInformationContextOfdefault.read();
                int i6 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i4, i5, -871780639, sourceInformationContextOfdefault.read(), new Object[]{setsmallnotificationiconnameandroid_sdk_base_release, th}, i6);
                throw th2;
            }
        }
    }
}
