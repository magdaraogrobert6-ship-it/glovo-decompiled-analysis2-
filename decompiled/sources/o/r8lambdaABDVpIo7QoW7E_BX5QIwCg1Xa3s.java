package o;

import io.sentry.CombinedScopeView;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaABDVpIo7QoW7E_BX5QIwCg1Xa3s extends r8lambdaChdSTjsE0tA1e46Psywe07pQFQ {
    public static final Method ComponentActivity;
    public static final CombinedScopeView MediaBrowserCompatMediaItem;
    public static final Method MediaDescriptionCompat;
    public static final CombinedScopeView MediaMetadataCompat;
    public static final CombinedScopeView MediaSessionCompatQueueItem;
    public static final Method MediaSessionCompatResultReceiverWrapper;
    public static final CombinedScopeView MediaSessionCompatToken;
    public static final Constructor ParcelableVolumeInfo;
    public static final Method PlaybackStateCompat;
    public static final CombinedScopeView PlaybackStateCompatCustomAction;
    public static final Method RatingCompat;
    public static final Method RemoteActionCompatParcelizer;
    public static final CombinedScopeView read;

    @Override // o.r8lambdaChdSTjsE0tA1e46Psywe07pQFQ
    public final String read(SSLSocket sSLSocket) {
        java.util.logging.Logger logger = r8lambdaChdSTjsE0tA1e46Psywe07pQFQ.IconCompatParcelizer;
        Method method = RemoteActionCompatParcelizer;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                DrawableTransformation.read((Throwable) e);
                return null;
            } catch (InvocationTargetException e2) {
                if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                    DrawableTransformation.read((Throwable) e2);
                    return null;
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ r8lambdac_htdlzeudqulpnwj5kgesh7eq = this.serializer;
        if (r8lambdac_htdlzeudqulpnwj5kgesh7eq.read() == r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.ALPN_AND_NPN) {
            try {
                byte[] bArr = (byte[]) read.serializer(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.serializer);
                }
            } catch (Exception e3) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
            }
        }
        if (r8lambdac_htdlzeudqulpnwj5kgesh7eq.read() != r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.NONE) {
            try {
                byte[] bArr2 = (byte[]) MediaBrowserCompatMediaItem.serializer(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.serializer);
                }
            } catch (Exception e4) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
            }
        }
        return null;
    }

    @Override // o.r8lambdaChdSTjsE0tA1e46Psywe07pQFQ
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E) it.next()).toString());
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (r8lambdaChdSTjsE0tA1e46Psywe07pQFQ.RemoteActionCompatParcelizer(str)) {
                        Method method2 = PlaybackStateCompat;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(sSLSocket, Boolean.TRUE);
                        } else {
                            ComponentActivity.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = MediaSessionCompatResultReceiverWrapper;
                        if (method3 == null || (constructor = ParcelableVolumeInfo) == null) {
                            MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e) {
                    DrawableTransformation.read((Throwable) e);
                    return;
                }
            } catch (IllegalAccessException e2) {
                DrawableTransformation.read((Throwable) e2);
                return;
            } catch (InstantiationException e3) {
                DrawableTransformation.read((Throwable) e3);
                return;
            }
        }
        Method method4 = RemoteActionCompatParcelizer;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                RatingCompat.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e4;
                }
                r8lambdaChdSTjsE0tA1e46Psywe07pQFQ.IconCompatParcelizer.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = MediaDescriptionCompat) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.serializer(list)};
        r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ r8lambdac_htdlzeudqulpnwj5kgesh7eq = this.serializer;
        if (r8lambdac_htdlzeudqulpnwj5kgesh7eq.read() == r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.ALPN_AND_NPN) {
            MediaMetadataCompat.serializer(sSLSocket, objArr);
        }
        if (r8lambdac_htdlzeudqulpnwj5kgesh7eq.read() != r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.NONE) {
            MediaSessionCompatToken.serializer(sSLSocket, objArr);
        } else {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }

    @Override // o.r8lambdaChdSTjsE0tA1e46Psywe07pQFQ
    public final String read(SSLSocket sSLSocket, String str, List list) {
        String str2 = read(sSLSocket);
        return str2 == null ? super.read(sSLSocket, str, list) : str2;
    }

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        NoSuchMethodException e;
        Method method6;
        ClassNotFoundException e2;
        java.util.logging.Logger logger = r8lambdaChdSTjsE0tA1e46Psywe07pQFQ.IconCompatParcelizer;
        Class<?> cls = Boolean.TYPE;
        Constructor<?> constructor = null;
        int i = 27;
        PlaybackStateCompatCustomAction = new CombinedScopeView(constructor, "setUseSessionTickets", new Class[]{cls}, i);
        MediaSessionCompatQueueItem = new CombinedScopeView(constructor, "setHostname", new Class[]{String.class}, i);
        Class<byte[]> cls2 = byte[].class;
        read = new CombinedScopeView(cls2, "getAlpnSelectedProtocol", new Class[0], i);
        MediaMetadataCompat = new CombinedScopeView(constructor, "setAlpnProtocols", new Class[]{byte[].class}, i);
        MediaBrowserCompatMediaItem = new CombinedScopeView(cls2, "getNpnSelectedProtocol", new Class[0], i);
        MediaSessionCompatToken = new CombinedScopeView(constructor, "setNpnProtocols", new Class[]{byte[].class}, i);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        Class<?> cls3 = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls3.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls3.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                        } catch (ClassNotFoundException e3) {
                            e = e3;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        method4 = null;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    method3 = null;
                    method4 = null;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    RatingCompat = method;
                    MediaDescriptionCompat = method2;
                    RemoteActionCompatParcelizer = method3;
                    PlaybackStateCompat = method4;
                    ComponentActivity = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    MediaSessionCompatResultReceiverWrapper = method6;
                    ParcelableVolumeInfo = constructor;
                } catch (NoSuchMethodException e8) {
                    e = e8;
                    method3 = null;
                    method4 = null;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    RatingCompat = method;
                    MediaDescriptionCompat = method2;
                    RemoteActionCompatParcelizer = method3;
                    PlaybackStateCompat = method4;
                    ComponentActivity = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    MediaSessionCompatResultReceiverWrapper = method6;
                    ParcelableVolumeInfo = constructor;
                }
            } catch (ClassNotFoundException e9) {
                e = e9;
                method2 = null;
                method3 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                RatingCompat = method;
                MediaDescriptionCompat = method2;
                RemoteActionCompatParcelizer = method3;
                PlaybackStateCompat = method4;
                ComponentActivity = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                MediaSessionCompatResultReceiverWrapper = method6;
                ParcelableVolumeInfo = constructor;
            } catch (NoSuchMethodException e10) {
                e = e10;
                method2 = null;
                method3 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                RatingCompat = method;
                MediaDescriptionCompat = method2;
                RemoteActionCompatParcelizer = method3;
                PlaybackStateCompat = method4;
                ComponentActivity = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                MediaSessionCompatResultReceiverWrapper = method6;
                ParcelableVolumeInfo = constructor;
            }
        } catch (ClassNotFoundException e11) {
            e = e11;
            method = null;
        } catch (NoSuchMethodException e12) {
            e = e12;
            method = null;
        }
        RatingCompat = method;
        MediaDescriptionCompat = method2;
        RemoteActionCompatParcelizer = method3;
        PlaybackStateCompat = method4;
        ComponentActivity = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e13) {
                e2 = e13;
                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e2);
            } catch (NoSuchMethodException e14) {
                e = e14;
                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            }
        } catch (ClassNotFoundException e15) {
            e2 = e15;
            method6 = null;
        } catch (NoSuchMethodException e16) {
            e = e16;
            method6 = null;
        }
        MediaSessionCompatResultReceiverWrapper = method6;
        ParcelableVolumeInfo = constructor;
    }

    public r8lambdaABDVpIo7QoW7E_BX5QIwCg1Xa3s(r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ r8lambdac_htdlzeudqulpnwj5kgesh7eq) {
        super(r8lambdac_htdlzeudqulpnwj5kgesh7eq);
    }
}
