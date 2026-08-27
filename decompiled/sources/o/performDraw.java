package o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class performDraw {
    public Integer serializer = null;
    public HitTestResultSubList write = HitTestResultSubList.MediaMetadataCompat;

    public final void serializer(HitTestResultSubList hitTestResultSubList) {
        this.write = hitTestResultSubList;
    }

    public final calculateAlignmentLine IconCompatParcelizer() throws GeneralSecurityException {
        Integer num = this.serializer;
        if (num != null) {
            return new calculateAlignmentLine(num.intValue(), this.write);
        }
        getAlignmentLinesMap.write("Key size is not set");
        return null;
    }

    public final void read(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.serializer = Integer.valueOf(i);
    }
}
