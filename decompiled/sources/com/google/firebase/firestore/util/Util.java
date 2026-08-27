package com.google.firebase.firestore.util;

import com.google.firebase.firestore.FirebaseFirestoreException;
import io.grpc.Status;
import io.grpc.StatusException;
import java.security.SecureRandom;
import java.util.Iterator;
import o.getClipMetadata;
import o.getRectManager;
import o.onPreAttach;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Util {
    public static final /* synthetic */ int write = 0;

    public static int IconCompatParcelizer(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    static {
        new SecureRandom();
    }

    public static StringBuilder read(CharSequence charSequence, int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            sb.append(charSequence);
            for (int i2 = 1; i2 < i; i2++) {
                sb.append((CharSequence) str);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static int IconCompatParcelizer(getClipMetadata getclipmetadata, getClipMetadata getclipmetadata2) {
        int iMin = Math.min(getclipmetadata.RatingCompat(), getclipmetadata2.RatingCompat());
        for (int i = 0; i < iMin; i++) {
            int iRemoteActionCompatParcelizer = getclipmetadata.RemoteActionCompatParcelizer(i) & 255;
            int iRemoteActionCompatParcelizer2 = getclipmetadata2.RemoteActionCompatParcelizer(i) & 255;
            if (iRemoteActionCompatParcelizer < iRemoteActionCompatParcelizer2) {
                return -1;
            }
            if (iRemoteActionCompatParcelizer > iRemoteActionCompatParcelizer2) {
                return 1;
            }
        }
        return Integer.compare(getclipmetadata.RatingCompat(), getclipmetadata2.RatingCompat());
    }

    public static int RemoteActionCompatParcelizer(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                if (Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2)) {
                    return Character.compare(cCharAt, cCharAt2);
                }
                return Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    public static FirebaseFirestoreException serializer(Status status) {
        status.getClass();
        StatusException statusException = new StatusException(status);
        String message = statusException.getMessage();
        FirebaseFirestoreException.IconCompatParcelizer iconCompatParcelizerFromValue = FirebaseFirestoreException.IconCompatParcelizer.fromValue(status.PlaybackStateCompat.value());
        FirebaseFirestoreException firebaseFirestoreException = new FirebaseFirestoreException(message, statusException);
        onPreAttach.serializer(message, "Provided message must not be null.");
        getRectManager.RemoteActionCompatParcelizer(iconCompatParcelizerFromValue != FirebaseFirestoreException.IconCompatParcelizer.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        onPreAttach.serializer(iconCompatParcelizerFromValue, "Provided code must not be null.");
        return firebaseFirestoreException;
    }

    public static Object RemoteActionCompatParcelizer(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String RemoteActionCompatParcelizer(getClipMetadata getclipmetadata) {
        int iRatingCompat = getclipmetadata.RatingCompat();
        StringBuilder sb = new StringBuilder(iRatingCompat * 2);
        for (int i = 0; i < iRatingCompat; i++) {
            byte bRemoteActionCompatParcelizer = getclipmetadata.RemoteActionCompatParcelizer(i);
            sb.append(Character.forDigit((bRemoteActionCompatParcelizer & 255) >>> 4, 16));
            sb.append(Character.forDigit(bRemoteActionCompatParcelizer & 15, 16));
        }
        return sb.toString();
    }
}
