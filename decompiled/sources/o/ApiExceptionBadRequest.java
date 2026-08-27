package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ApiExceptionBadRequest {
    public static final RequestBuilder IconCompatParcelizer;
    public static final RequestBuilder RemoteActionCompatParcelizer;
    public static final RequestBuilder read;
    public static final RequestBuilder serializer;
    public static final RequestBuilder write;

    public static final RequestBuilder IconCompatParcelizer(String str) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "/"}, iWrite3)).booleanValue()) {
            return write;
        }
        int iWrite4 = getCieXyz.write();
        int iWrite5 = getCieXyz.write();
        int iWrite6 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str, "\\"}, iWrite6)).booleanValue()) {
            return read;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("not a directory separator: ", str));
        return null;
    }

    public static final int read(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        RequestBuilder requestBuilder = recyclableBufferedInputStream.bytes;
        if (requestBuilder.serializer() != 0) {
            if (requestBuilder.write(0) != 47) {
                if (requestBuilder.write(0) == 92) {
                    if (requestBuilder.serializer() > 2 && requestBuilder.write(1) == 92) {
                        RequestBuilder requestBuilder2 = read;
                        requestBuilder2.getClass();
                        int i = requestBuilder.read(2, requestBuilder2.RemoteActionCompatParcelizer());
                        return i == -1 ? requestBuilder.serializer() : i;
                    }
                } else if (requestBuilder.serializer() > 2 && requestBuilder.write(1) == 58 && requestBuilder.write(2) == 92) {
                    char cWrite = (char) requestBuilder.write(0);
                    if ('a' <= cWrite && cWrite < '{') {
                        return 3;
                    }
                    if ('A' <= cWrite && cWrite < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final RequestBuilder write(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        RequestBuilder requestBuilder = recyclableBufferedInputStream.bytes;
        RequestBuilder requestBuilder2 = write;
        if (RequestBuilder.read(requestBuilder, requestBuilder2) != -1) {
            return requestBuilder2;
        }
        RequestBuilder requestBuilder3 = recyclableBufferedInputStream.bytes;
        RequestBuilder requestBuilder4 = read;
        if (RequestBuilder.read(requestBuilder3, requestBuilder4) != -1) {
            return requestBuilder4;
        }
        return null;
    }

    public static final RecyclableBufferedInputStream serializer(RecyclableBufferedInputStream recyclableBufferedInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream2, boolean z) {
        recyclableBufferedInputStream2.getClass();
        if (read(recyclableBufferedInputStream2) != -1 || recyclableBufferedInputStream2.read() != null) {
            return recyclableBufferedInputStream2;
        }
        RequestBuilder requestBuilderWrite = write(recyclableBufferedInputStream);
        if (requestBuilderWrite == null && (requestBuilderWrite = write(recyclableBufferedInputStream2)) == null) {
            requestBuilderWrite = IconCompatParcelizer(RecyclableBufferedInputStream.DIRECTORY_SEPARATOR);
        }
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        registryMissingComponentException.serializer(recyclableBufferedInputStream.bytes);
        if (registryMissingComponentException.size > 0) {
            registryMissingComponentException.serializer(requestBuilderWrite);
        }
        registryMissingComponentException.serializer(recyclableBufferedInputStream2.bytes);
        return serializer(registryMissingComponentException, z);
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        write = ImageHeaderParserImageType.serializer("/");
        read = ImageHeaderParserImageType.serializer("\\");
        RemoteActionCompatParcelizer = ImageHeaderParserImageType.serializer("/\\");
        serializer = ImageHeaderParserImageType.serializer(".");
        IconCompatParcelizer = ImageHeaderParserImageType.serializer("..");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    public static final RecyclableBufferedInputStream serializer(RegistryMissingComponentException registryMissingComponentException, boolean z) {
        RequestBuilder requestBuilder;
        boolean z2;
        char cIconCompatParcelizer;
        RequestBuilder requestBuilder2;
        RequestBuilder requestBuilderRemoteActionCompatParcelizer;
        RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
        RequestBuilder requestBuilderIconCompatParcelizer = null;
        int i = 0;
        while (true) {
            if (!registryMissingComponentException.RemoteActionCompatParcelizer(0L, write)) {
                requestBuilder = read;
                if (!registryMissingComponentException.RemoteActionCompatParcelizer(0L, requestBuilder)) {
                    break;
                }
            }
            byte bMediaBrowserCompatMediaItem = registryMissingComponentException.MediaBrowserCompatMediaItem();
            if (requestBuilderIconCompatParcelizer == null) {
                requestBuilderIconCompatParcelizer = read(bMediaBrowserCompatMediaItem);
            }
            i++;
        }
        if (i < 2) {
            z2 = false;
        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilderIconCompatParcelizer, requestBuilder}, getCieXyz.write())).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        RequestBuilder requestBuilder3 = RemoteActionCompatParcelizer;
        if (z2) {
            requestBuilderIconCompatParcelizer.getClass();
            registryMissingComponentException2.serializer(requestBuilderIconCompatParcelizer);
            registryMissingComponentException2.serializer(requestBuilderIconCompatParcelizer);
        } else if (i > 0) {
            requestBuilderIconCompatParcelizer.getClass();
            registryMissingComponentException2.serializer(requestBuilderIconCompatParcelizer);
        } else {
            long jWrite = registryMissingComponentException.write(requestBuilder3);
            if (requestBuilderIconCompatParcelizer == null) {
                if (jWrite == -1) {
                    requestBuilderIconCompatParcelizer = IconCompatParcelizer(RecyclableBufferedInputStream.DIRECTORY_SEPARATOR);
                } else {
                    requestBuilderIconCompatParcelizer = read(registryMissingComponentException.IconCompatParcelizer(jWrite));
                }
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilderIconCompatParcelizer, requestBuilder}, getCieXyz.write())).booleanValue() && registryMissingComponentException.size >= 2 && registryMissingComponentException.IconCompatParcelizer(1L) == 58 && (('a' <= (cIconCompatParcelizer = (char) registryMissingComponentException.IconCompatParcelizer(0L)) && cIconCompatParcelizer < '{') || ('A' <= cIconCompatParcelizer && cIconCompatParcelizer < '['))) {
                if (jWrite == 2) {
                    registryMissingComponentException2.write(registryMissingComponentException, 3L);
                } else {
                    registryMissingComponentException2.write(registryMissingComponentException, 2L);
                }
            }
        }
        boolean z3 = registryMissingComponentException2.size > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zRatingCompat = registryMissingComponentException.RatingCompat();
            requestBuilder2 = serializer;
            if (zRatingCompat) {
                break;
            }
            long jWrite2 = registryMissingComponentException.write(requestBuilder3);
            if (jWrite2 == -1) {
                requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
            } else {
                requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(jWrite2);
                registryMissingComponentException.MediaBrowserCompatMediaItem();
            }
            RequestBuilder requestBuilder4 = IconCompatParcelizer;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilderRemoteActionCompatParcelizer, requestBuilder4}, getCieXyz.write())).booleanValue()) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (z) {
                        if (!z3) {
                            if (!arrayList.isEmpty()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaDescriptionCompat((List) arrayList), requestBuilder4}, getCieXyz.write())).booleanValue()) {
                                }
                            }
                        }
                        if (!z2 || arrayList.size() != 1) {
                            onContentCardDismissed.serializer((AbstractList) arrayList);
                        }
                    }
                    arrayList.add(requestBuilderRemoteActionCompatParcelizer);
                }
            } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilderRemoteActionCompatParcelizer, requestBuilder2}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requestBuilderRemoteActionCompatParcelizer, RequestBuilder.EMPTY}, getCieXyz.write())).booleanValue()) {
                    arrayList.add(requestBuilderRemoteActionCompatParcelizer);
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                registryMissingComponentException2.serializer(requestBuilderIconCompatParcelizer);
            }
            registryMissingComponentException2.serializer((RequestBuilder) arrayList.get(i2));
        }
        if (registryMissingComponentException2.size == 0) {
            registryMissingComponentException2.serializer(requestBuilder2);
        }
        return new RecyclableBufferedInputStream(registryMissingComponentException2.RemoteActionCompatParcelizer(registryMissingComponentException2.size));
    }

    public static final RequestBuilder read(byte b) {
        if (b == 47) {
            return write;
        }
        if (b == 92) {
            return read;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "not a directory separator: "));
        return null;
    }
}
