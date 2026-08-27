package o;

import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaGhUkArry4_x0SJj1IEcwZTwwK4 extends setShouldOptInWhenPushAuthorizedandroid_sdk_base_release {
    final /* synthetic */ r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o read;
    final /* synthetic */ r8lambdaArOHHDRou134ziY3uMxObWCm_j0 write;

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final void read(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe) {
        r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o r8lambdafgoaxsgdotp1gx0ei2cntkeny5o = this.read;
        ArrayList arrayList = this.write.read();
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(r8lambdamiqxxozlmuuicx7gg348aw6pqe.PlaybackStateCompat(), 8192);
            try {
                java.util.logging.Logger logger = getResourceIdentifier.read;
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(new isSessionStartBasedTimeoutEnabled(new isPushDeepLinkBackStackActivityEnabled(), gZIPOutputStream));
                r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o.IconCompatParcelizer(r8lambdafgoaxsgdotp1gx0ei2cntkeny5o, arrayList, readresourcevaluelambda2);
                readresourcevaluelambda2.close();
                gZIPOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{gZIPOutputStream, th}, i3);
                    throw th2;
                }
            }
        } catch (Exception e) {
            r8lambdafgoaxsgdotp1gx0ei2cntkeny5o.RatingCompat.IconCompatParcelizer(false, e, "Failed to upload datasync payload", new Object[0]);
        }
    }

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final isHtmlInAppMessageHtmlLinkTargetEnabled serializer() {
        try {
            return isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public r8lambdaGhUkArry4_x0SJj1IEcwZTwwK4(r8lambdaArOHHDRou134ziY3uMxObWCm_j0 r8lambdaarohhdrou134ziy3umxobwcm_j0, r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o r8lambdafgoaxsgdotp1gx0ei2cntkeny5o) {
        this.write = r8lambdaarohhdrou134ziy3umxobwcm_j0;
        this.read = r8lambdafgoaxsgdotp1gx0ei2cntkeny5o;
    }
}
