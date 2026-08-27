package o;

import java.io.File;
import java.util.ArrayList;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public final class RecyclableBufferedInputStream implements Comparable {
    public static final String DIRECTORY_SEPARATOR;
    public final RequestBuilder bytes;

    static {
        String str = File.separator;
        str.getClass();
        DIRECTORY_SEPARATOR = str;
    }

    public final RecyclableBufferedInputStream IconCompatParcelizer() {
        RequestBuilder requestBuilder = ApiExceptionBadRequest.serializer;
        RequestBuilder requestBuilder2 = this.bytes;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilder2, requestBuilder}, getCieXyz.write())).booleanValue()) {
            return null;
        }
        RequestBuilder requestBuilder3 = ApiExceptionBadRequest.write;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilder2, requestBuilder3}, getCieXyz.write())).booleanValue()) {
            return null;
        }
        RequestBuilder requestBuilder4 = ApiExceptionBadRequest.read;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilder2, requestBuilder4}, getCieXyz.write())).booleanValue()) {
            return null;
        }
        RequestBuilder requestBuilder5 = ApiExceptionBadRequest.IconCompatParcelizer;
        requestBuilder2.getClass();
        requestBuilder5.getClass();
        int iSerializer = requestBuilder2.serializer();
        byte[] bArr = requestBuilder5.data;
        if (requestBuilder2.write(iSerializer - bArr.length, requestBuilder5, bArr.length) && (requestBuilder2.serializer() == 2 || requestBuilder2.write(requestBuilder2.serializer() - 3, requestBuilder3, 1) || requestBuilder2.write(requestBuilder2.serializer() - 3, requestBuilder4, 1))) {
            return null;
        }
        int iRemoteActionCompatParcelizer = RequestBuilder.RemoteActionCompatParcelizer(requestBuilder2, requestBuilder3);
        if (iRemoteActionCompatParcelizer == -1) {
            iRemoteActionCompatParcelizer = RequestBuilder.RemoteActionCompatParcelizer(requestBuilder2, requestBuilder4);
        }
        if (iRemoteActionCompatParcelizer == 2 && read() != null) {
            if (requestBuilder2.serializer() == 3) {
                return null;
            }
            return new RecyclableBufferedInputStream(RequestBuilder.serializer(requestBuilder2, 0, 3, 1));
        }
        if (iRemoteActionCompatParcelizer == 1) {
            requestBuilder4.getClass();
            if (requestBuilder2.write(0, requestBuilder4, requestBuilder4.serializer())) {
                return null;
            }
        }
        if (iRemoteActionCompatParcelizer != -1 || read() == null) {
            if (iRemoteActionCompatParcelizer == -1) {
                return new RecyclableBufferedInputStream(requestBuilder);
            }
            return iRemoteActionCompatParcelizer == 0 ? new RecyclableBufferedInputStream(RequestBuilder.serializer(requestBuilder2, 0, 1, 1)) : new RecyclableBufferedInputStream(RequestBuilder.serializer(requestBuilder2, 0, iRemoteActionCompatParcelizer, 1));
        }
        if (requestBuilder2.serializer() == 2) {
            return null;
        }
        return new RecyclableBufferedInputStream(RequestBuilder.serializer(requestBuilder2, 0, 2, 1));
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        int i = ApiExceptionBadRequest.read(this);
        RequestBuilder requestBuilder = this.bytes;
        if (i == -1) {
            i = 0;
        } else if (i < requestBuilder.serializer() && requestBuilder.write(i) == 92) {
            i++;
        }
        int iSerializer = requestBuilder.serializer();
        int i2 = i;
        while (i < iSerializer) {
            if (requestBuilder.write(i) == 47 || requestBuilder.write(i) == 92) {
                arrayList.add(requestBuilder.read(i2, i));
                i2 = i + 1;
            }
            i++;
        }
        if (i2 < requestBuilder.serializer()) {
            arrayList.add(requestBuilder.read(i2, requestBuilder.serializer()));
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) obj;
        recyclableBufferedInputStream.getClass();
        return this.bytes.compareTo(recyclableBufferedInputStream.bytes);
    }

    public final int hashCode() {
        return this.bytes.hashCode();
    }

    public final Character read() {
        RequestBuilder requestBuilder = ApiExceptionBadRequest.write;
        RequestBuilder requestBuilder2 = this.bytes;
        if (RequestBuilder.read(requestBuilder2, requestBuilder) != -1 || requestBuilder2.serializer() < 2 || requestBuilder2.write(1) != 58) {
            return null;
        }
        char cWrite = (char) requestBuilder2.write(0);
        if (('a' > cWrite || cWrite >= '{') && ('A' > cWrite || cWrite >= '[')) {
            return null;
        }
        return Character.valueOf(cWrite);
    }

    public final File serializer() {
        return new File(this.bytes.RatingCompat());
    }

    public final String toString() {
        return this.bytes.RatingCompat();
    }

    public final String write() {
        RequestBuilder requestBuilder = ApiExceptionBadRequest.write;
        RequestBuilder requestBuilderSerializer = this.bytes;
        int iRemoteActionCompatParcelizer = RequestBuilder.RemoteActionCompatParcelizer(requestBuilderSerializer, requestBuilder);
        if (iRemoteActionCompatParcelizer == -1) {
            iRemoteActionCompatParcelizer = RequestBuilder.RemoteActionCompatParcelizer(requestBuilderSerializer, ApiExceptionBadRequest.read);
        }
        if (iRemoteActionCompatParcelizer != -1) {
            requestBuilderSerializer = RequestBuilder.serializer(requestBuilderSerializer, iRemoteActionCompatParcelizer + 1, 0, 2);
        } else if (read() != null && requestBuilderSerializer.serializer() == 2) {
            requestBuilderSerializer = RequestBuilder.EMPTY;
        }
        return requestBuilderSerializer.RatingCompat();
    }

    public RecyclableBufferedInputStream(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        this.bytes = requestBuilder;
    }

    public final RecyclableBufferedInputStream serializer(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        RequestBuilder requestBuilder = recyclableBufferedInputStream.bytes;
        int i = ApiExceptionBadRequest.read(this);
        RequestBuilder requestBuilder2 = this.bytes;
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = i == -1 ? null : new RecyclableBufferedInputStream(requestBuilder2.read(0, i));
        int i2 = ApiExceptionBadRequest.read(recyclableBufferedInputStream);
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{recyclableBufferedInputStream2, i2 == -1 ? null : new RecyclableBufferedInputStream(requestBuilder.read(0, i2))}, getCieXyz.write())).booleanValue()) {
            DrawableTransformation.serializer("Paths of different roots cannot be relative to each other: ", this, " and ", recyclableBufferedInputStream);
            return null;
        }
        ArrayList arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        ArrayList arrayListRemoteActionCompatParcelizer2 = recyclableBufferedInputStream.RemoteActionCompatParcelizer();
        int iMin = Math.min(arrayListRemoteActionCompatParcelizer.size(), arrayListRemoteActionCompatParcelizer2.size());
        int i3 = 0;
        while (i3 < iMin) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{arrayListRemoteActionCompatParcelizer.get(i3), arrayListRemoteActionCompatParcelizer2.get(i3)}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i3++;
        }
        if (i3 == iMin && requestBuilder2.serializer() == requestBuilder.serializer()) {
            return Path$Companion.IconCompatParcelizer(".");
        }
        if (arrayListRemoteActionCompatParcelizer2.subList(i3, arrayListRemoteActionCompatParcelizer2.size()).indexOf(ApiExceptionBadRequest.IconCompatParcelizer) != -1) {
            DrawableTransformation.serializer("Impossible relative path to resolve: ", this, " and ", recyclableBufferedInputStream);
            return null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilder, ApiExceptionBadRequest.serializer}, getCieXyz.write())).booleanValue()) {
            return this;
        }
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        RequestBuilder requestBuilderWrite = ApiExceptionBadRequest.write(recyclableBufferedInputStream);
        if (requestBuilderWrite == null && (requestBuilderWrite = ApiExceptionBadRequest.write(this)) == null) {
            requestBuilderWrite = ApiExceptionBadRequest.IconCompatParcelizer(DIRECTORY_SEPARATOR);
        }
        int size = arrayListRemoteActionCompatParcelizer2.size();
        for (int i4 = i3; i4 < size; i4++) {
            registryMissingComponentException.serializer(ApiExceptionBadRequest.IconCompatParcelizer);
            registryMissingComponentException.serializer(requestBuilderWrite);
        }
        int size2 = arrayListRemoteActionCompatParcelizer.size();
        while (i3 < size2) {
            registryMissingComponentException.serializer((RequestBuilder) arrayListRemoteActionCompatParcelizer.get(i3));
            registryMissingComponentException.serializer(requestBuilderWrite);
            i3++;
        }
        return ApiExceptionBadRequest.serializer(registryMissingComponentException, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecyclableBufferedInputStream)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((RecyclableBufferedInputStream) obj).bytes, this.bytes}, getCieXyz.write())).booleanValue();
    }

    public final RecyclableBufferedInputStream write(String str) {
        str.getClass();
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        registryMissingComponentException.IconCompatParcelizer(str);
        return ApiExceptionBadRequest.serializer(this, ApiExceptionBadRequest.serializer(registryMissingComponentException, false), false);
    }
}
