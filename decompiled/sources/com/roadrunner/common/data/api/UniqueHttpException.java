package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Arrays;
import o.getCieXyz;
import o.getHoldoutVariationName;
import o.removeNodeAtDepth;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class UniqueHttpException extends HttpException {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final getHoldoutVariationName IconCompatParcelizer;
    public final int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniqueHttpException(getHoldoutVariationName getholdoutvariationname, int i, StackTraceElement[] stackTraceElementArr) {
        super(getholdoutvariationname);
        getholdoutvariationname.getClass();
        this.IconCompatParcelizer = getholdoutvariationname;
        this.serializer = i;
        StackTraceElement stackTraceElement = new StackTraceElement(UniqueHttpExceptionKt.serializer.RemoteActionCompatParcelizer(getholdoutvariationname.rawResponse.request.url.read(), "/<redacted>"), d$$ExternalSyntheticOutline0.m(i, "<-- ", " Failed"), String.valueOf(i), i);
        int length = stackTraceElementArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(new StackTraceElement[]{stackTraceElement}, length + 1);
        System.arraycopy(stackTraceElementArr, 0, objArrCopyOf, 1, length);
        int length2 = objArrCopyOf.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length2 + 1);
        objArrCopyOf2[length2] = stackTraceElement;
        setStackTrace((StackTraceElement[]) objArrCopyOf2);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer * 31);
        int i4 = MediaMetadataCompat + 121;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (!UniqueHttpException.class.equals(obj != null ? obj.getClass() : null)) {
            int i2 = MediaDescriptionCompat + 63;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        obj.getClass();
        UniqueHttpException uniqueHttpException = (UniqueHttpException) obj;
        if (this.serializer != uniqueHttpException.serializer) {
            int i4 = MediaMetadataCompat + 41;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, uniqueHttpException.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = MediaMetadataCompat + 75;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
