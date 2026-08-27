package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class topLeft {
    public static final byte[] read;
    public static final Charset serializer = Charset.forName(com.adjust.sdk.Constants.ENCODING);

    public static int IconCompatParcelizer(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        read = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static isBetterCandidate_I7lrPNgminorAxisDistance read(Object obj, Object obj2) {
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance = (isBetterCandidate_I7lrPNgminorAxisDistance) ((PlatformFocusOwner) obj);
        isbettercandidate_i7lrpngminoraxisdistance.getClass();
        isBetterCandidate_I7lrPNgisCandidate isbettercandidate_i7lrpngiscandidate = (isBetterCandidate_I7lrPNgisCandidate) isbettercandidate_i7lrpngminoraxisdistance.IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.NEW_BUILDER);
        isbettercandidate_i7lrpngiscandidate.write();
        isBetterCandidate_I7lrPNgisCandidate.read(isbettercandidate_i7lrpngiscandidate.serializer, isbettercandidate_i7lrpngminoraxisdistance);
        PlatformFocusOwner platformFocusOwner = (PlatformFocusOwner) obj2;
        if (!isbettercandidate_i7lrpngiscandidate.IconCompatParcelizer.getClass().isInstance(platformFocusOwner)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        isbettercandidate_i7lrpngiscandidate.write();
        isBetterCandidate_I7lrPNgisCandidate.read(isbettercandidate_i7lrpngiscandidate.serializer, (isBetterCandidate_I7lrPNgminorAxisDistance) platformFocusOwner);
        return isbettercandidate_i7lrpngiscandidate.serializer();
    }

    public static void RemoteActionCompatParcelizer(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
    }
}
