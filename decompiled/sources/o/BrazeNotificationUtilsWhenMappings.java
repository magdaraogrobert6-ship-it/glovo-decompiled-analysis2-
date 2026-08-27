package o;

import com.sentiance.sdk.util.Optional;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class BrazeNotificationUtilsWhenMappings implements BrazeNotificationUtilsExternalSyntheticLambda4 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final getVerticalAccuracy write;

    public abstract byte write();

    public HashMap IconCompatParcelizer() {
        HashMap map = new HashMap();
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer == null) {
            return null;
        }
        Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(readVarRemoteActionCompatParcelizer, this.write);
        if (clsIconCompatParcelizer != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(readVarRemoteActionCompatParcelizer, map, clsIconCompatParcelizer);
        }
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer = IconCompatParcelizer(write());
        if (r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer != null && RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer) && r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer.RemoteActionCompatParcelizer.longValue() >= readVarRemoteActionCompatParcelizer.serializer()) {
            map.put(r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class, r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer.write);
        }
        return map;
    }

    public final r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU IconCompatParcelizer(byte b) {
        this.IconCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Optional<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> optionalRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class, Long.valueOf(jCurrentTimeMillis), new BrazeNotificationUtilsExternalSyntheticLambda7(b));
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            return optionalRemoteActionCompatParcelizer.write();
        }
        return null;
    }

    public final getCooldownEnterSeconds.read RemoteActionCompatParcelizer() {
        Class clsIconCompatParcelizer;
        Class clsWrite;
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.read;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.read() || (clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), this.write)) == null || !Arrays.asList(setShouldPersistWebView.class, r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class, BrazeBootReceiver.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class).contains(clsIconCompatParcelizer)) {
            return null;
        }
        if (clsIconCompatParcelizer == setShouldPersistWebView.class) {
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()), false);
            if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer() && ((clsWrite = getVerticalAccuracy.write(optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem())) == BrazeBootReceiver.class || clsWrite == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class)) {
                optionalRemoteActionCompatParcelizer = optionalRemoteActionCompatParcelizer2;
            }
        }
        return optionalRemoteActionCompatParcelizer.write();
    }

    public BrazeNotificationUtilsWhenMappings(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds) {
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.write = getverticalaccuracy;
        this.read = getcooldownenterseconds;
    }

    public static boolean RemoteActionCompatParcelizer(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu) {
        r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = r8lambdaqtf70aj7a5o7b4yj33reyelsu.serializer.enterPictureInPictureMode;
        return r8lambda2l1vxswbmfutp9a4iejxpq7zf7a != null && r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.serializer.byteValue() == 1;
    }
}
