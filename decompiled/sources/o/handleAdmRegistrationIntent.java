package o;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.devicestate.Permission;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "MobileCallDetector")
public class handleAdmRegistrationIntent extends createPayload {
    private final r8lambdaBLZuMVNHewIviUzmwoKsD5M9mc IconCompatParcelizer;
    private final TelephonyManager RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final onLocationRequestCompletelambda1 serializer;
    private PhoneStateListener write;

    @Override // o.BrazeNotificationUtilsExternalSyntheticLambda4
    public final boolean read() {
        return this.serializer.write(Permission.READ_PHONE_STATE);
    }

    @Override // o.createPayload
    public final void RatingCompat() {
        PhoneStateListener phoneStateListener = this.write;
        if (phoneStateListener != null) {
            this.RemoteActionCompatParcelizer.listen(phoneStateListener, 32);
        } else {
            this.read.IconCompatParcelizer("PhoneStateListener instance is null", new Object[0]);
        }
    }

    @Override // o.createPayload
    public final void MediaMetadataCompat() {
        PhoneStateListener phoneStateListener = this.write;
        if (phoneStateListener != null) {
            this.RemoteActionCompatParcelizer.listen(phoneStateListener, 0);
        } else {
            this.read.IconCompatParcelizer("PhoneStateListener instance is null", new Object[0]);
        }
    }

    public handleAdmRegistrationIntent(TelephonyManager telephonyManager, parseLonglambda0 parselonglambda0, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaBLZuMVNHewIviUzmwoKsD5M9mc r8lambdablzumvnhewiviuzmwoksd5m9mc) {
        super(parselonglambda0, getverticalaccuracy, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, telephonyManager);
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = telephonyManager;
        this.serializer = onlocationrequestcompletelambda1;
        this.IconCompatParcelizer = r8lambdablzumvnhewiviuzmwoksd5m9mc;
        readBoolean.write(new r8lambda9TZpBImTEtk0HAjJ1Vr5tuCi60U(0, this));
    }
}
