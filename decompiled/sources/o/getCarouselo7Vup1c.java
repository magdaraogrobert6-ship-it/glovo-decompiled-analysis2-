package o;

import android.content.Context;
import com.huawei.location.logic.zp;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;

/* JADX INFO: loaded from: classes2.dex */
public final class getCarouselo7Vup1c {
    public String IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public CredentialClient MediaSessionCompatQueueItem;
    public NetworkCapability RemoteActionCompatParcelizer;
    public com.huawei.wisesecurity.ucs_credential.x read;
    public getImageo7Vup1c serializer;
    public Context write;

    public final Credential write(int i, String str, String str2) throws Throwable {
        int i2;
        int i3;
        String str3 = "";
        androidx.transition.TransitionValuesMaps transitionValuesMaps = new androidx.transition.TransitionValuesMaps(26, false);
        transitionValuesMaps.MediaBrowserCompatMediaItem = this.MediaSessionCompatQueueItem;
        transitionValuesMaps.MediaDescriptionCompat = this.write;
        transitionValuesMaps.RatingCompat = this.read;
        transitionValuesMaps.MediaMetadataCompat = this.RemoteActionCompatParcelizer;
        zp zpVar = new zp(transitionValuesMaps);
        try {
            i2 = 1;
            try {
                Credential credentialWrite = zpVar.write(i, this.serializer.read(), this.IconCompatParcelizer, str, str2, zpVar);
                int i4 = zpVar.write;
                if (i4 == 0) {
                    str3 = "Kid";
                } else if (i4 == 1) {
                    str3 = "AndroidKS";
                } else if (i4 == 2) {
                    str3 = "AndroidKS_EC";
                } else if (i4 == 3) {
                    str3 = "Huks_EC";
                }
                this.MediaDescriptionCompat = str3;
                return credentialWrite;
            } catch (Throwable th) {
                th = th;
                i3 = 2;
                int i5 = zpVar.write;
                if (i5 == 0) {
                    str3 = "Kid";
                } else if (i5 == i2) {
                    str3 = "AndroidKS";
                } else if (i5 == i3) {
                    str3 = "AndroidKS_EC";
                } else if (i5 == 3) {
                    str3 = "Huks_EC";
                }
                this.MediaDescriptionCompat = str3;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 1;
            i3 = 2;
        }
    }
}
