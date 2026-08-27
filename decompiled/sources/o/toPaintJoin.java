package o;

import java.security.MessageDigest;
import java.util.Arrays;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class toPaintJoin implements lottieComposition {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public toPaintJoin() {
    }

    public static /* synthetic */ CharSequence write(byte b) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            serializer(b);
            throw null;
        }
        CharSequence charSequenceSerializer = serializer(b);
        int i3 = RemoteActionCompatParcelizer + 83;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return charSequenceSerializer;
        }
        throw null;
    }

    private static final CharSequence serializer(byte b) {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            objArr[1] = Byte.valueOf(b);
            str = String.format("%02x", Arrays.copyOf(objArr, 0));
        } else {
            str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }
        int i3 = RemoteActionCompatParcelizer + 111;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.lottieComposition
    public String read(String str, String str2) {
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            String strIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArrDigest, new BrazeInAppMessageManagerExternalSyntheticLambda45(10));
            int i2 = RemoteActionCompatParcelizer + 5;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return strIconCompatParcelizer;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Error while hashing the input string", new Object[0]);
            return "1ee01cc6701e8bfb4d21161c9e414870dbb33e9d515e4015dbb85b719d9d1efc";
        }
    }
}
