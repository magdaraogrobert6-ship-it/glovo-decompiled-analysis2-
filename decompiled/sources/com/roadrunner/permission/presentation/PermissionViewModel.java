package com.roadrunner.permission.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.permission.api.model.PermissionModel;
import o.buildRGBAExpression;
import o.r8lambda8ONSZngU81o_LRT9BkSkXpME2w;
import o.r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU;
import o.r8lambdak0nm6YERYwcpP8UAjWvT2M86A4Y;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionViewModel extends ViewModel {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final buildRGBAExpression RemoteActionCompatParcelizer;
    public final PermissionModel read;
    public final OtpLogger serializer;
    public final r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU write;

    public final r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU r8lambdainyw9kmcom6xfew3z44ookhespu = this.write;
        int i5 = i3 + 95;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return r8lambdainyw9kmcom6xfew3z44ookhespu;
    }

    public PermissionViewModel(r8lambda8ONSZngU81o_LRT9BkSkXpME2w r8lambda8onszngu81o_lrt9bkskxpme2w, OtpLogger otpLogger, buildRGBAExpression buildrgbaexpression, PermissionModel permissionModel) {
        r8lambda8onszngu81o_lrt9bkskxpme2w.getClass();
        otpLogger.getClass();
        buildrgbaexpression.getClass();
        this.serializer = otpLogger;
        this.RemoteActionCompatParcelizer = buildrgbaexpression;
        this.read = permissionModel;
        this.write = new r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU(r8lambda8onszngu81o_lrt9bkskxpme2w.write(permissionModel.IconCompatParcelizer), permissionModel.read);
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = r8lambdak0nm6YERYwcpP8UAjWvT2M86A4Y.RemoteActionCompatParcelizer[this.read.IconCompatParcelizer.ordinal()];
        if (i4 == 1) {
            this.serializer.IconCompatParcelizer.logEvent("location_access_skip", null);
        } else {
            if (i4 != 2) {
                return;
            }
            this.RemoteActionCompatParcelizer.read();
            int i5 = IconCompatParcelizer + 49;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    public final void write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = r8lambdak0nm6YERYwcpP8UAjWvT2M86A4Y.RemoteActionCompatParcelizer[this.read.IconCompatParcelizer.ordinal()];
        if (i4 == 1) {
            this.serializer.IconCompatParcelizer.logEvent("location_access_continue", null);
            return;
        }
        if (i4 == 2) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            return;
        }
        int i5 = MediaDescriptionCompat + 19;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }
}
