package o;

import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.ActivityIdentificationData;
import io.sentry.SentryUUID;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.zip.GZIPInputStream;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class getConversationMessages {

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private static byte[] write(String str) throws IOException {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Dump file does not exist: ", str));
            return null;
        }
        if (!setCarryoverInAppMessage.read(str, ".gz", true)) {
            long length = file.length();
            if (1 > length || length >= 10485761) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Dump too large (> 10485760 bytes)");
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArrWrite = SentryUUID.write(fileInputStream);
                fileInputStream.close();
                return bArrWrite;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStream, th}, i3);
                    throw th2;
                }
            }
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[65536];
            long j = 0;
            do {
                int i4 = gZIPInputStream.read(bArr);
                if (i4 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPInputStream.close();
                    byteArray.getClass();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i4);
                j += (long) i4;
            } while (j <= 10485760);
            throw new IllegalArgumentException("Dump too large (> 10485760 bytes)");
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                int i5 = sourceInformationContextOfdefault.read();
                int i6 = sourceInformationContextOfdefault.read();
                int i7 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i5, i6, -871780639, sourceInformationContextOfdefault.read(), new Object[]{gZIPInputStream, th3}, i7);
                throw th4;
            }
        }
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    public getConversationMessages(getGeofenceRequestLocationannotations getgeofencerequestlocationannotations) {
        getgeofencerequestlocationannotations.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x020b  */
    /* JADX WARN: Code duplicated, block: B:115:0x024a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    public final String read(String str) {
        getContentCardSyncData getcontentcardsyncdata;
        Object next;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1;
        Integer numValueOf;
        RandomAccess randomAccess;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2;
        String strIconCompatParcelizer;
        str.getClass();
        int i = 4;
        int i2 = 0;
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(write(str)).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.getClass();
            if (serializer(byteBufferOrder, 0, 32) && byteBufferOrder.getInt() == 1347241037) {
                byteBufferOrder.getInt();
                int i3 = byteBufferOrder.getInt();
                int i4 = byteBufferOrder.getInt();
                byteBufferOrder.getInt();
                byteBufferOrder.getInt();
                byteBufferOrder.getInt();
                byteBufferOrder.getInt();
                if (i3 <= 0 || !serializer(byteBufferOrder, i4, i3 * 12)) {
                    getcontentcardsyncdata = null;
                } else {
                    byteBufferOrder.position(i4);
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i3; i9++) {
                        int i10 = byteBufferOrder.getInt();
                        byteBufferOrder.getInt();
                        int i11 = byteBufferOrder.getInt();
                        if (i10 == 3) {
                            i7 = i11;
                        } else if (i10 == 4) {
                            i6 = i11;
                        } else if (i10 == 6) {
                            i5 = i11;
                        } else if (i10 == 7) {
                            i8 = i11;
                        }
                    }
                    if (i5 == 0 || i6 == 0 || i7 == 0) {
                        getcontentcardsyncdata = null;
                    } else {
                        if (i8 == 0 || !serializer(byteBufferOrder, i8, 2)) {
                            String str2 = Build.CPU_ABI;
                            if (str2 == null || !str2.equals("armeabi-v7a")) {
                                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(8, Boolean.FALSE);
                            } else {
                                onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(4, Boolean.TRUE);
                                onviewattachedtowindowlambda0 = onviewattachedtowindowlambda1;
                            }
                        } else {
                            int iPosition = byteBufferOrder.position();
                            byteBufferOrder.position(i8);
                            int i12 = byteBufferOrder.getShort() & 65535;
                            byteBufferOrder.position(iPosition);
                            if (i12 == 0 || i12 == 5) {
                                onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(4, Boolean.valueOf(i12 == 5));
                                onviewattachedtowindowlambda0 = onviewattachedtowindowlambda1;
                            } else {
                                onviewattachedtowindowlambda0 = (i12 == 9 || i12 != 12) ? new onViewAttachedToWindowlambda0(8, Boolean.FALSE) : new onViewAttachedToWindowlambda0(8, Boolean.FALSE);
                            }
                        }
                        int iIntValue = ((Number) onviewattachedtowindowlambda0.serializer).intValue();
                        boolean zBooleanValue = ((Boolean) onviewattachedtowindowlambda0.write).booleanValue();
                        if (serializer(byteBufferOrder, i5, 8)) {
                            byteBufferOrder.position(i5);
                            numValueOf = Integer.valueOf(byteBufferOrder.getInt());
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue2 = numValueOf.intValue();
                            if (i6 == 0 || !serializer(byteBufferOrder, i6, 4)) {
                                randomAccess = instance_delegatelambda0.write;
                            } else {
                                byteBufferOrder.position(i6);
                                int iMax = Math.max(0, byteBufferOrder.getInt());
                                ArrayList arrayList = new ArrayList(iMax);
                                int i13 = 0;
                                while (i13 < iMax) {
                                    if (serializer(byteBufferOrder, byteBufferOrder.position(), ActivityIdentificationData.RUNNING)) {
                                        long j = byteBufferOrder.getLong();
                                        long j2 = byteBufferOrder.getInt();
                                        byteBufferOrder.getInt();
                                        byteBufferOrder.getInt();
                                        int i14 = byteBufferOrder.getInt();
                                        if (serializer(byteBufferOrder, i14, i)) {
                                            int iPosition2 = byteBufferOrder.position();
                                            byteBufferOrder.position(i14);
                                            int i15 = byteBufferOrder.getInt();
                                            if (i15 <= 0 || i15 > 1048576) {
                                                byteBufferOrder.position(iPosition2);
                                            } else if (serializer(byteBufferOrder, i14 + 4, i15)) {
                                                byte[] bArr = new byte[i15];
                                                byteBufferOrder.get(bArr);
                                                byteBufferOrder.position(iPosition2);
                                                Charset charsetForName = Charset.forName("UTF-16LE");
                                                charsetForName.getClass();
                                                strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(new String(bArr, charsetForName), 0);
                                            }
                                            strIconCompatParcelizer = null;
                                        } else {
                                            strIconCompatParcelizer = null;
                                        }
                                        if (strIconCompatParcelizer == null) {
                                            strIconCompatParcelizer = "";
                                        }
                                        arrayList.add(new getContentCardSyncUserId(strIconCompatParcelizer, j, j2 & 4294967295L));
                                        byteBufferOrder.position(byteBufferOrder.position() + 84);
                                    }
                                    i13++;
                                    i = 4;
                                }
                                randomAccess = arrayList;
                            }
                            if (i7 == 0 || !serializer(byteBufferOrder, i7, 4)) {
                                onviewattachedtowindowlambda2 = null;
                                break;
                            }
                            byteBufferOrder.position(i7);
                            int i16 = byteBufferOrder.getInt();
                            if (i16 <= 0) {
                                onviewattachedtowindowlambda2 = null;
                                break;
                            }
                            int i17 = 0;
                            while (true) {
                                if (i17 >= i16) {
                                    onviewattachedtowindowlambda2 = null;
                                    break;
                                }
                                int i18 = byteBufferOrder.getInt();
                                byteBufferOrder.getInt();
                                byteBufferOrder.getInt();
                                byteBufferOrder.getInt();
                                byteBufferOrder.getLong();
                                byteBufferOrder.getLong();
                                int i19 = byteBufferOrder.getInt();
                                int i20 = byteBufferOrder.getInt();
                                byteBufferOrder.getInt();
                                byteBufferOrder.getInt();
                                if (i18 == iIntValue2) {
                                    onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0(Integer.valueOf(i20), Integer.valueOf(i19));
                                    break;
                                }
                                i17++;
                            }
                            if (onviewattachedtowindowlambda2 == null) {
                                getcontentcardsyncdata = null;
                            } else {
                                int iIntValue3 = ((Number) onviewattachedtowindowlambda2.serializer).intValue();
                                int iIntValue4 = ((Number) onviewattachedtowindowlambda2.write).intValue();
                                if (serializer(byteBufferOrder, iIntValue3, iIntValue4)) {
                                    if (iIntValue4 > 262144) {
                                        iIntValue4 = 262144;
                                    }
                                    byte[] bArr2 = new byte[iIntValue4];
                                    byteBufferOrder.position(iIntValue3);
                                    byteBufferOrder.get(bArr2);
                                    ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder2.getClass();
                                    getcontentcardsyncdata = new getContentCardSyncData(byteBufferOrder, iIntValue2, randomAccess, byteBufferOrder2, iIntValue, zBooleanValue);
                                } else {
                                    getcontentcardsyncdata = null;
                                }
                            }
                        } else {
                            getcontentcardsyncdata = null;
                        }
                    }
                }
            } else {
                getcontentcardsyncdata = null;
            }
        } catch (Exception unused) {
        }
        if (getcontentcardsyncdata == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (getcontentcardsyncdata.RemoteActionCompatParcelizer().remaining() >= getcontentcardsyncdata.read()) {
            long j3 = getcontentcardsyncdata.read() == 4 ? ((long) getcontentcardsyncdata.RemoteActionCompatParcelizer().getInt()) & 4294967295L : getcontentcardsyncdata.RemoteActionCompatParcelizer().getLong();
            if (getcontentcardsyncdata.IconCompatParcelizer()) {
                j3 &= 4294967294L;
            }
            Iterator it = getcontentcardsyncdata.serializer().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                getContentCardSyncUserId getcontentcardsyncuserid = (getContentCardSyncUserId) next;
                if (j3 >= getcontentcardsyncuserid.read() && j3 < getcontentcardsyncuserid.read() + getcontentcardsyncuserid.IconCompatParcelizer()) {
                    break;
                }
            }
            getContentCardSyncUserId getcontentcardsyncuserid2 = (getContentCardSyncUserId) next;
            if (getcontentcardsyncuserid2 != null) {
                long j4 = getcontentcardsyncuserid2.read();
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append("  ");
                sb.append(new File(getcontentcardsyncuserid2.write()).getName());
                sb.append(" + 0x");
                TuplesKt.RemoteActionCompatParcelizer(16);
                String string = Long.toString(j3 - j4, 16);
                string.getClass();
                sb.append(string);
                arrayList2.add(sb.toString());
                i2++;
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return onContentCardDismissed.IconCompatParcelizer(arrayList2, "\n", null, null, null, 62);
    }

    private static boolean serializer(ByteBuffer byteBuffer, int i, int i2) {
        return i >= 0 && i2 >= 0 && i + i2 <= byteBuffer.capacity();
    }
}
