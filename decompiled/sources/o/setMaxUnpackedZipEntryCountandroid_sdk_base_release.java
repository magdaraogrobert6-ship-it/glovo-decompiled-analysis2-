package o;

import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class setMaxUnpackedZipEntryCountandroid_sdk_base_release extends coil3.util.UtilsKt {
    public static final Method read;
    public final boolean ComponentActivity;
    public final JsonObjectSerializer MediaBrowserCompatMediaItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final getResourcePackageName MediaSessionCompatToken;
    public final r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs ParcelableVolumeInfo;
    public final SharedResourcePool PlaybackStateCompat;
    public final SharedResourcePool PlaybackStateCompatCustomAction;
    public final r8lambdau5EmWqwr5N5wkL4k3k2Ai1wBwnU RatingCompat;
    public final ArrayList ResultReceiver;
    public final ArrayList _init_lambda1;
    public final boolean _init_lambda3;
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final doesMethodExist r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final SharedResourcePool r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final long r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final String r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public static final java.util.logging.Logger MediaMetadataCompat = java.util.logging.Logger.getLogger(setMaxUnpackedZipEntryCountandroid_sdk_base_release.class.getName());
    public static final long MediaDescriptionCompat = 1800000;
    public static final long MediaSessionCompatQueueItem = 1000;
    public static final SharedResourcePool RemoteActionCompatParcelizer = new SharedResourcePool(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.ParcelableVolumeInfo);
    public static final r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs serializer = r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs.write;
    public static final getResourcePackageName write = getResourcePackageName.write;

    public setMaxUnpackedZipEntryCountandroid_sdk_base_release(String str, SharedResourcePool sharedResourcePool, JsonObjectSerializer jsonObjectSerializer) {
        doesMethodExist doesmethodexist;
        SharedResourcePool sharedResourcePool2 = RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = sharedResourcePool2;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = sharedResourcePool2;
        this.ResultReceiver = new ArrayList();
        java.util.logging.Logger logger = doesMethodExist.write;
        synchronized (doesMethodExist.class) {
            if (doesMethodExist.read == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    boolean z = isValidLogPurchaseInputlambda5.IconCompatParcelizer;
                    arrayList.add(isValidLogPurchaseInputlambda5.class);
                } catch (ClassNotFoundException e) {
                    doesMethodExist.write.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<getDeclaredMethodQuietlylambda0> listRemoteActionCompatParcelizer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(getDeclaredMethodQuietlylambda0.class, Collections.unmodifiableList(arrayList), getDeclaredMethodQuietlylambda0.class.getClassLoader(), new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(9));
                if (listRemoteActionCompatParcelizer.isEmpty()) {
                    doesMethodExist.write.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                doesMethodExist.read = new doesMethodExist();
                for (getDeclaredMethodQuietlylambda0 getdeclaredmethodquietlylambda0 : listRemoteActionCompatParcelizer) {
                    doesMethodExist.write.fine("Service loader found " + getdeclaredmethodquietlylambda0);
                    doesMethodExist doesmethodexist2 = doesMethodExist.read;
                    synchronized (doesmethodexist2) {
                        getdeclaredmethodquietlylambda0.getClass();
                        doesmethodexist2.RemoteActionCompatParcelizer.add(getdeclaredmethodquietlylambda0);
                    }
                }
                doesMethodExist.read.serializer();
            }
            doesmethodexist = doesMethodExist.read;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = doesmethodexist;
        this._init_lambda1 = new ArrayList();
        this.MediaSessionCompatResultReceiverWrapper = "pick_first";
        this.ParcelableVolumeInfo = serializer;
        this.MediaSessionCompatToken = write;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = MediaDescriptionCompat;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 5;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 5;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 16777216L;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 1048576L;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
        this.RatingCompat = r8lambdau5EmWqwr5N5wkL4k3k2Ai1wBwnU.write;
        this.ComponentActivity = true;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = true;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = true;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
        this._init_lambda3 = true;
        TextStreamsKt.serializer(str, "target");
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = str;
        this.PlaybackStateCompat = sharedResourcePool;
        this.MediaBrowserCompatMediaItem = jsonObjectSerializer;
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
        } catch (NoSuchMethodException e2) {
            MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        }
        read = declaredMethod;
    }

    @Override // coil3.util.UtilsKt
    public final wouldPushPermissionPromptDisplaylambda2 read() {
        SSLSocketFactory sSLSocketFactory;
        setCustomUserAttributeArray setcustomuserattributearray;
        setCustomUserAttributeArray setcustomuserattributearray2;
        setCustomUserAttributeArray setcustomuserattributearray3;
        Rstyleable rstyleable = (Rstyleable) this.PlaybackStateCompat.IconCompatParcelizer;
        boolean z = rstyleable.MediaSessionCompatQueueItem != Long.MAX_VALUE;
        SharedResourcePool sharedResourcePool = rstyleable.MediaSessionCompatToken;
        SharedResourcePool sharedResourcePool2 = rstyleable.ParcelableVolumeInfo;
        int i = UserJavascriptInterfaceBase.write[rstyleable.MediaSessionCompatResultReceiverWrapper.ordinal()];
        if (i == 1) {
            sSLSocketFactory = null;
        } else if (i == 2) {
            try {
                if (rstyleable.PlaybackStateCompatCustomAction == null) {
                    rstyleable.PlaybackStateCompatCustomAction = SSLContext.getInstance("Default", r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.RemoteActionCompatParcelizer.read).getSocketFactory();
                }
                sSLSocketFactory = rstyleable.PlaybackStateCompatCustomAction;
            } catch (GeneralSecurityException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("TLS Provider failure", e);
                return null;
            }
        } else {
            throw new RuntimeException("Unknown negotiation type: " + rstyleable.MediaSessionCompatResultReceiverWrapper);
        }
        r8lambda4HrbWS4SxxUAOPfAvl38PxlF458 r8lambda4hrbws4sxxuaopfavl38pxlf458 = new r8lambda4HrbWS4SxxUAOPfAvl38PxlF458(sharedResourcePool, sharedResourcePool2, sSLSocketFactory, rstyleable.read, rstyleable.RatingCompat, z, rstyleable.MediaSessionCompatQueueItem, rstyleable.MediaDescriptionCompat, rstyleable.MediaMetadataCompat, rstyleable.PlaybackStateCompat, rstyleable.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        WebContentUtils webContentUtils = new WebContentUtils(8);
        SharedResourcePool sharedResourcePool3 = new SharedResourcePool(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.ParcelableVolumeInfo);
        WebContentUtils webContentUtils2 = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.MediaSessionCompatToken;
        ArrayList arrayList = new ArrayList(this.ResultReceiver);
        synchronized (TuplesKt.class) {
        }
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            Method method = read;
            if (method != null) {
                try {
                    setcustomuserattributearray3 = (setCustomUserAttributeArray) method.invoke(null, Boolean.valueOf(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28), Boolean.valueOf(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM), Boolean.FALSE, Boolean.valueOf(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                } catch (IllegalAccessException e2) {
                    MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
                    setcustomuserattributearray3 = null;
                } catch (InvocationTargetException e3) {
                    MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
                    setcustomuserattributearray3 = null;
                }
            } else {
                setcustomuserattributearray3 = null;
            }
            if (setcustomuserattributearray3 != null) {
                arrayList.add(0, setcustomuserattributearray3);
            }
        }
        if (this._init_lambda3) {
            try {
                setcustomuserattributearray = null;
                try {
                    setcustomuserattributearray2 = (setCustomUserAttributeArray) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    setcustomuserattributearray2 = setcustomuserattributearray;
                } catch (IllegalAccessException e5) {
                    e = e5;
                    MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    setcustomuserattributearray2 = setcustomuserattributearray;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    setcustomuserattributearray2 = setcustomuserattributearray;
                } catch (InvocationTargetException e7) {
                    e = e7;
                    MediaMetadataCompat.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    setcustomuserattributearray2 = setcustomuserattributearray;
                }
            } catch (ClassNotFoundException e8) {
                e = e8;
                setcustomuserattributearray = null;
            } catch (IllegalAccessException e9) {
                e = e9;
                setcustomuserattributearray = null;
            } catch (NoSuchMethodException e10) {
                e = e10;
                setcustomuserattributearray = null;
            } catch (InvocationTargetException e11) {
                e = e11;
                setcustomuserattributearray = null;
            }
            if (setcustomuserattributearray2 != null) {
                arrayList.add(0, setcustomuserattributearray2);
            }
        }
        return new BrazeDeeplinkHandler(new hasTooManyZipEntrieslambda0(this, r8lambda4hrbws4sxxuaopfavl38pxlf458, webContentUtils, sharedResourcePool3, webContentUtils2, arrayList));
    }
}
