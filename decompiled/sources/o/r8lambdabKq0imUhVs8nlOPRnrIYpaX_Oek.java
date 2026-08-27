package o;

import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdabKq0imUhVs8nlOPRnrIYpaX_Oek {
    static {
        java.util.logging.Logger.getLogger(r8lambdabKq0imUhVs8nlOPRnrIYpaX_Oek.class.getName());
    }

    public static byte[][] read(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            incrementCustomUserAttributelambda1 incrementcustomuserattributelambda1 = (incrementCustomUserAttributelambda1) it.next();
            bArr[i] = incrementcustomuserattributelambda1.MediaSessionCompatQueueItem.MediaDescriptionCompat();
            bArr[i + 1] = incrementcustomuserattributelambda1.MediaBrowserCompatMediaItem.MediaDescriptionCompat();
            i += 2;
        }
        byte[] bArr2 = r8lambdaw4Ks5vKtotS_PmqJAq50O2BrsTk.write;
        int i2 = 0;
        while (i2 < size) {
            byte[] bArr3 = bArr[i2];
            int i3 = i2 + 1;
            byte[] bArr4 = bArr[i3];
            if (r8lambdaw4Ks5vKtotS_PmqJAq50O2BrsTk.write(bArr3, bArr2)) {
                for (byte b : bArr4) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList2.add(bArr[i4]);
                        }
                        while (i2 < size) {
                            byte[] bArr5 = bArr[i2];
                            byte[] bArr6 = bArr[i2 + 1];
                            if (r8lambdaw4Ks5vKtotS_PmqJAq50O2BrsTk.write(bArr5, bArr2)) {
                                int i5 = 0;
                                for (int i6 = 0; i6 <= bArr6.length; i6++) {
                                    if (i6 == bArr6.length || bArr6[i6] == 44) {
                                        byte[] bArrSerializer = BaseEncoding$StandardBaseEncoding.IconCompatParcelizer.serializer(new String(bArr6, i5, i6 - i5, visitSelfAndChildrenYYKmhodefault.read));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrSerializer);
                                        i5 = i6 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i2 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i3] = BaseEncoding$StandardBaseEncoding.IconCompatParcelizer.serializer(new String(bArr4, visitSelfAndChildrenYYKmhodefault.read));
            }
            i2 += 2;
        }
        return bArr;
    }
}
