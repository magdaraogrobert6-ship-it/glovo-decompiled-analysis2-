package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import dalvik.system.DelegateLastClassLoader;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.TuplesKt;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputComponent2cp;
import o.accessgetTwocp;
import o.accessgetVcp;
import o.accessgetVoiceAssistcp;
import o.accessgetVolumeDowncp;
import o.accessgetVolumeMutecp;
import o.accessgetVolumeUpcp;
import o.accessgetWakeUpcp;
import o.accessgetWcp;
import o.accessgetWindowcp;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getUseEvaluationsCachefwf_client_release;
import o.setRoundRectOutlineTNW_H78default;
import o.speculativeHit;
import o.toXyzui_graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamiteModule {
    public static boolean MediaBrowserCompatMediaItem = false;
    public static Boolean MediaDescriptionCompat = null;
    public static String MediaMetadataCompat = null;
    public static int MediaSessionCompatQueueItem = -1;
    public static accessgetVolumeUpcp MediaSessionCompatResultReceiverWrapper;
    public static final setRoundRectOutlineTNW_H78default MediaSessionCompatToken;
    public static accessgetWindowcp PlaybackStateCompat;
    public static Boolean RatingCompat;
    public static final accessgetVcp RemoteActionCompatParcelizer;
    public static final zzj read;
    public static final accessgetWcp serializer;
    public static final getIntentArrayWithConfiguredBackStacklambda4 write;
    public final Context ResultReceiver;
    public static final ThreadLocal PlaybackStateCompatCustomAction = new ThreadLocal();
    public static final accessgetVoiceAssistcp ParcelableVolumeInfo = new accessgetVoiceAssistcp(0);
    public static final speculativeHit IconCompatParcelizer = new speculativeHit(10);

    @DynamiteApi
    public class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    static {
        int i = 0;
        int i2 = 9;
        MediaSessionCompatToken = new setRoundRectOutlineTNW_H78default(i2);
        RemoteActionCompatParcelizer = new accessgetVcp(i);
        read = new zzj(i);
        serializer = new accessgetWcp(i);
        write = new getIntentArrayWithConfiguredBackStacklambda4(i2);
    }

    public static accessgetVolumeUpcp read(Context context) {
        accessgetVolumeUpcp accessgetvolumeupcp;
        synchronized (DynamiteModule.class) {
            accessgetVolumeUpcp accessgetvolumeupcp2 = MediaSessionCompatResultReceiverWrapper;
            if (accessgetvolumeupcp2 != null) {
                return accessgetvolumeupcp2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    accessgetvolumeupcp = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    accessgetvolumeupcp = iInterfaceQueryLocalInterface instanceof accessgetVolumeUpcp ? (accessgetVolumeUpcp) iInterfaceQueryLocalInterface : new accessgetVolumeUpcp(iBinder);
                }
                if (accessgetvolumeupcp != null) {
                    MediaSessionCompatResultReceiverWrapper = accessgetvolumeupcp;
                    return accessgetvolumeupcp;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                SentryLogcatAdapter.serializer("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder RemoteActionCompatParcelizer(String str) throws LoadingException {
        try {
            return (IBinder) this.ResultReceiver.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e);
        }
    }

    public DynamiteModule(Context context) {
        this.ResultReceiver = context;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x012b A[PHI: r14
  0x012b: PHI (r14v6 boolean) = (r14v5 boolean), (r14v8 boolean), (r14v8 boolean) binds: [B:58:0x00ea, B:73:0x011f, B:75:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    public static int RemoteActionCompatParcelizer(boolean z, boolean z2, String str, Context context) throws Throwable {
        MatrixCursor matrixCursor;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                long jLongValue = ((Long) ParcelableVolumeInfo.get()).longValue();
                String str2 = "api_force_staging";
                boolean z3 = true;
                if (true != z) {
                    str2 = "api";
                }
                Uri uriBuild = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(jLongValue)).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z4 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (cursorQuery.moveToPosition(i)) {
                                        Object[] objArr = new Object[columnCount];
                                        for (int i2 = 0; i2 < columnCount; i2++) {
                                            int type = cursorQuery.getType(i2);
                                            if (type == 0) {
                                                objArr[i2] = null;
                                            } else if (type == 1) {
                                                objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                            } else if (type == 2) {
                                                objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                            } else if (type == 3) {
                                                objArr[i2] = cursorQuery.getString(i2);
                                            } else if (type == 4) {
                                                objArr[i2] = cursorQuery.getBlob(i2);
                                            } else {
                                                throw new RemoteException("Unknown column type");
                                            }
                                        }
                                        matrixCursor.addRow(objArr);
                                    } else {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (DynamiteModule.class) {
                                    MediaMetadataCompat = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        MediaSessionCompatQueueItem = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        MediaBrowserCompatMediaItem = z3;
                                        z4 = z3;
                                    }
                                }
                                accessgetWakeUpcp accessgetwakeupcp = (accessgetWakeUpcp) PlaybackStateCompatCustomAction.get();
                                if (accessgetwakeupcp == null || accessgetwakeupcp.write != null) {
                                    matrixCursor2 = matrixCursor;
                                } else {
                                    accessgetwakeupcp.write = matrixCursor;
                                }
                            } else {
                                matrixCursor2 = matrixCursor;
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        e = e;
                        if (!(e instanceof LoadingException)) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                            sb.append("V2 version check failed: ");
                            sb.append(message);
                            throw new LoadingException(sb.toString(), e);
                        }
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        if (matrixCursor != null) {
                            matrixCursor.close();
                        }
                        throw th;
                    }
                }
                SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th5) {
                th = th5;
                matrixCursor = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static boolean RemoteActionCompatParcelizer(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(RatingCompat)) {
            return true;
        }
        boolean z = false;
        if (RatingCompat == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, ExceptionCode.CRASH_EXCEPTION) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            RatingCompat = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                MediaBrowserCompatMediaItem = true;
            }
        }
        if (!z) {
            SentryLogcatAdapter.serializer("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static void RemoteActionCompatParcelizer(ClassLoader classLoader) throws LoadingException {
        try {
            accessgetWindowcp accessgetwindowcp = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                accessgetwindowcp = iInterfaceQueryLocalInterface instanceof accessgetWindowcp ? (accessgetWindowcp) iInterfaceQueryLocalInterface : new accessgetWindowcp(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            PlaybackStateCompat = accessgetwindowcp;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:137:0x01db */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8 A[Catch: all -> 0x00b3, TryCatch #11 {, blocks: (B:9:0x0026, B:11:0x0032, B:49:0x00b1, B:14:0x0038, B:16:0x003f, B:18:0x0045, B:21:0x0048, B:23:0x004c, B:27:0x0056, B:29:0x005e, B:32:0x0065, B:40:0x0090, B:41:0x0098, B:35:0x006c, B:37:0x0072, B:38:0x0081, B:44:0x009b, B:47:0x009e, B:48:0x00a8, B:15:0x003b), top: B:142:0x0026, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0180 A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01e7, blocks: (B:3:0x0002, B:62:0x00e0, B:64:0x00e6, B:69:0x0111, B:94:0x0172, B:98:0x0180, B:119:0x01e0, B:120:0x01e3, B:115:0x01d8, B:67:0x00ec, B:123:0x01e6, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:60:0x00dd, B:19:0x0046, B:42:0x0099, B:45:0x009c, B:53:0x00b5, B:61:0x00df, B:59:0x00bb), top: B:133:0x0002, inners: #3, #10 }] */
    public static int zza(Context context, String str, boolean z) {
        ClassLoader accessgetvolumedowncp;
        Throwable th;
        Cursor cursor;
        RemoteException e;
        accessgetWakeUpcp accessgetwakeupcp;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = MediaDescriptionCompat;
                int iSerializer = 0;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    RemoteActionCompatParcelizer(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!RemoteActionCompatParcelizer(context)) {
                                    return 0;
                                }
                                if (!MediaBrowserCompatMediaItem) {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!bool2.equals(null)) {
                                        try {
                                            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(z, true, str, context);
                                            String str2 = MediaMetadataCompat;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderSerializer = LoadBalancer$Helper.serializer();
                                                if (classLoaderSerializer == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = MediaMetadataCompat;
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str3);
                                                        accessgetvolumedowncp = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = MediaMetadataCompat;
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str4);
                                                        accessgetvolumedowncp = new accessgetVolumeDowncp(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                    classLoaderSerializer = accessgetvolumedowncp;
                                                }
                                                RemoteActionCompatParcelizer(classLoaderSerializer);
                                                declaredField.set(null, classLoaderSerializer);
                                                MediaDescriptionCompat = bool2;
                                                return iRemoteActionCompatParcelizer;
                                            }
                                            return iRemoteActionCompatParcelizer;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    } else {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                } else {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                            MediaDescriptionCompat = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return RemoteActionCompatParcelizer(z, false, str, context);
                    } catch (LoadingException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                accessgetVolumeUpcp accessgetvolumeupcp = read(context);
                try {
                    if (accessgetvolumeupcp != null) {
                        try {
                            int iSerializer2 = accessgetvolumeupcp.serializer();
                            if (iSerializer2 >= 3) {
                                ThreadLocal threadLocal = PlaybackStateCompatCustomAction;
                                accessgetWakeUpcp accessgetwakeupcp2 = (accessgetWakeUpcp) threadLocal.get();
                                if (accessgetwakeupcp2 != null && (cursor2 = accessgetwakeupcp2.write) != null) {
                                    iSerializer = cursor2.getInt(0);
                                } else {
                                    cursor = (Cursor) ObjectWrapper.unwrap(accessgetvolumeupcp.serializer(new ObjectWrapper(context), str, z, ((Long) ParcelableVolumeInfo.get()).longValue()));
                                    if (cursor != null) {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                int i = cursor.getInt(0);
                                                if (i <= 0 || (accessgetwakeupcp = (accessgetWakeUpcp) threadLocal.get()) == null || accessgetwakeupcp.write != null) {
                                                    cursor3 = cursor;
                                                } else {
                                                    accessgetwakeupcp.write = cursor;
                                                }
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                iSerializer = i;
                                            } else {
                                                SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor3 = cursor;
                                            String message2 = e.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb3.append("Failed to retrieve remote module version: ");
                                            sb3.append(message2);
                                            SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", sb3.toString());
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                }
                            } else if (iSerializer2 == 2) {
                                SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iSerializer = accessgetvolumeupcp.read(new ObjectWrapper(context), str, z);
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iSerializer = accessgetvolumeupcp.serializer(new ObjectWrapper(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return iSerializer;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor3;
                }
            }
        } catch (Throwable th4) {
            accessgetTvInputComponent2cp.read(context, th4);
            throw th4;
        }
    }

    public static int write(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (TuplesKt.write(declaredField.get(null), (Object) str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            SentryLogcatAdapter.serializer("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            SentryLogcatAdapter.serializer("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:140:0x0288  */
    /* JADX WARN: Code duplicated, block: B:141:0x028e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0297  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ae A[Catch: all -> 0x0321, TryCatch #1 {all -> 0x0321, blocks: (B:148:0x02a4, B:149:0x02ab, B:152:0x02ae, B:153:0x02cf, B:154:0x02d0, B:155:0x0320), top: B:173:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x032b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0331  */
    /* JADX WARN: Code duplicated, block: B:166:0x033a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0083 A[Catch: all -> 0x0323, TRY_LEAVE, TryCatch #2 {all -> 0x0323, blocks: (B:5:0x0028, B:9:0x0076, B:13:0x007d, B:16:0x0083), top: B:174:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[Catch: all -> 0x0208, TryCatch #7 {all -> 0x0208, blocks: (B:30:0x00b0, B:32:0x00b6, B:33:0x00b8), top: B:181:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x0213, LoadingException -> 0x0221, RemoteException -> 0x0225, TRY_ENTER, TryCatch #15 {RemoteException -> 0x0225, LoadingException -> 0x0221, all -> 0x0213, blocks: (B:29:0x00af, B:35:0x00bb, B:37:0x00c1, B:38:0x00dc, B:42:0x00e2, B:44:0x00ea, B:46:0x00ee, B:47:0x00fc), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1 A[Catch: all -> 0x0213, LoadingException -> 0x0221, RemoteException -> 0x0225, TryCatch #15 {RemoteException -> 0x0225, LoadingException -> 0x0221, all -> 0x0213, blocks: (B:29:0x00af, B:35:0x00bb, B:37:0x00c1, B:38:0x00dc, B:42:0x00e2, B:44:0x00ea, B:46:0x00ee, B:47:0x00fc), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[Catch: all -> 0x0213, LoadingException -> 0x0221, RemoteException -> 0x0225, TRY_ENTER, TryCatch #15 {RemoteException -> 0x0225, LoadingException -> 0x0221, all -> 0x0213, blocks: (B:29:0x00af, B:35:0x00bb, B:37:0x00c1, B:38:0x00dc, B:42:0x00e2, B:44:0x00ea, B:46:0x00ee, B:47:0x00fc), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0156 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0167 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0187 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:82:0x018e A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0196 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01af  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e2 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f2 A[Catch: all -> 0x020d, LoadingException -> 0x020f, RemoteException -> 0x0211, TryCatch #14 {RemoteException -> 0x0211, LoadingException -> 0x020f, all -> 0x020d, blocks: (B:55:0x010a, B:57:0x012e, B:59:0x0136, B:60:0x013d, B:61:0x0144, B:56:0x0119, B:65:0x0149, B:68:0x014c, B:69:0x0155, B:70:0x0156, B:71:0x015f, B:75:0x0164, B:78:0x0167, B:80:0x0187, B:82:0x018e, B:84:0x0196, B:91:0x01d3, B:93:0x01d9, B:94:0x01e2, B:95:0x01e9, B:85:0x01a7, B:86:0x01ae, B:89:0x01b2, B:90:0x01c3, B:96:0x01ea, B:97:0x01f1, B:98:0x01f2, B:99:0x01fb, B:108:0x020c), top: B:180:0x00af }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r21v0, types: [o.accessgetVolumeMutecp] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x014b -> B:64:0x0148). Please report as a decompilation issue!!! */
    public static DynamiteModule load(Context context, accessgetVolumeMutecp accessgetvolumemutecp, String str) throws Throwable {
        Cursor cursor;
        accessgetWakeUpcp accessgetwakeupcp;
        int i;
        DynamiteModule dynamiteModule;
        Cursor cursor2;
        int i2;
        Boolean bool;
        accessgetVolumeUpcp accessgetvolumeupcp;
        int iSerializer;
        accessgetTwocp accessgettwocpSerializer;
        Object objUnwrap;
        accessgetWakeUpcp accessgetwakeupcp2;
        accessgetWindowcp accessgetwindowcp;
        accessgetWakeUpcp accessgetwakeupcp3;
        accessgetTwocp accessgettwocpWrite;
        Cursor cursor3;
        ?? r1 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = PlaybackStateCompatCustomAction;
            accessgetWakeUpcp accessgetwakeupcp4 = (accessgetWakeUpcp) threadLocal.get();
            accessgetWakeUpcp accessgetwakeupcp5 = new accessgetWakeUpcp();
            threadLocal.set(accessgetwakeupcp5);
            accessgetVoiceAssistcp accessgetvoiceassistcp = ParcelableVolumeInfo;
            Long l = (Long) accessgetvoiceassistcp.get();
            long jLongValue = l.longValue();
            try {
                accessgetvoiceassistcp.set(Long.valueOf(SystemClock.uptimeMillis()));
                toXyzui_graphics toxyzui_graphics = accessgetvolumemutecp.read(r1, str, MediaSessionCompatToken);
                int i3 = toxyzui_graphics.RemoteActionCompatParcelizer;
                int i4 = toxyzui_graphics.IconCompatParcelizer;
                new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i3).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i4).length());
                int i5 = toxyzui_graphics.write;
                try {
                    if (i5 != 0) {
                        if (i5 == -1) {
                            if (toxyzui_graphics.RemoteActionCompatParcelizer != 0) {
                                i5 = -1;
                                if (i5 == 1) {
                                }
                                if (i5 == -1) {
                                    "Selected local version of ".concat(String.valueOf(str));
                                    DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                                    if (jLongValue == 0) {
                                        accessgetvoiceassistcp.remove();
                                    } else {
                                        accessgetvoiceassistcp.set(l);
                                    }
                                    cursor3 = accessgetwakeupcp5.write;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(accessgetwakeupcp4);
                                    return dynamiteModule2;
                                }
                                if (i5 == 1) {
                                    i2 = toxyzui_graphics.IconCompatParcelizer;
                                    synchronized (DynamiteModule.class) {
                                        if (RemoteActionCompatParcelizer(context)) {
                                            bool = MediaDescriptionCompat;
                                            if (bool != null) {
                                                if (bool.booleanValue()) {
                                                    new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                    synchronized (DynamiteModule.class) {
                                                        accessgetwindowcp = PlaybackStateCompat;
                                                        if (accessgetwindowcp != null) {
                                                            accessgetwakeupcp3 = (accessgetWakeUpcp) threadLocal.get();
                                                            if (accessgetwakeupcp3 == null) {
                                                            }
                                                            throw new LoadingException("No result cursor");
                                                        }
                                                        throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                                    }
                                                }
                                                accessgetwakeupcp = accessgetwakeupcp4;
                                                new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                accessgetvolumeupcp = read(context);
                                                if (accessgetvolumeupcp != null) {
                                                    iSerializer = accessgetvolumeupcp.serializer();
                                                    if (iSerializer >= 3) {
                                                        accessgetwakeupcp2 = (accessgetWakeUpcp) threadLocal.get();
                                                        if (accessgetwakeupcp2 != null) {
                                                            accessgettwocpSerializer = accessgetvolumeupcp.write(new ObjectWrapper(r1), str, i2, new ObjectWrapper(accessgetwakeupcp2.write));
                                                        } else {
                                                            throw new LoadingException("No cached result cursor holder");
                                                        }
                                                    } else if (iSerializer == 2) {
                                                        SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "IDynamite loader version = 2");
                                                        accessgettwocpSerializer = accessgetvolumeupcp.read(new ObjectWrapper(r1), str, i2);
                                                    } else {
                                                        SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        accessgettwocpSerializer = accessgetvolumeupcp.serializer(new ObjectWrapper(r1), str, i2);
                                                    }
                                                    objUnwrap = ObjectWrapper.unwrap(accessgettwocpSerializer);
                                                    if (objUnwrap != null) {
                                                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                                    } else {
                                                        throw new LoadingException("Failed to load remote module.");
                                                    }
                                                } else {
                                                    throw new LoadingException("Failed to create IDynamiteLoader.");
                                                }
                                                if (jLongValue == 0) {
                                                    ParcelableVolumeInfo.remove();
                                                } else {
                                                    ParcelableVolumeInfo.set(l);
                                                }
                                                cursor2 = accessgetwakeupcp5.write;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                PlaybackStateCompatCustomAction.set(accessgetwakeupcp);
                                                return dynamiteModule;
                                            }
                                            throw new LoadingException("Failed to determine which loading route to use.");
                                        }
                                        throw new LoadingException("Remote loading disabled");
                                    }
                                }
                                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 36);
                                sb.append("VersionPolicy returned invalid code:");
                                sb.append(i5);
                                throw new LoadingException(sb.toString());
                                if (jLongValue == 0) {
                                    ParcelableVolumeInfo.remove();
                                } else {
                                    ParcelableVolumeInfo.set(l);
                                }
                                cursor = accessgetwakeupcp5.write;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                PlaybackStateCompatCustomAction.set(r1);
                                throw th;
                            }
                        } else if (i5 == 1 || toxyzui_graphics.IconCompatParcelizer != 0) {
                            if (i5 == -1) {
                                "Selected local version of ".concat(String.valueOf(str));
                                DynamiteModule dynamiteModule3 = new DynamiteModule(applicationContext);
                                if (jLongValue == 0) {
                                    accessgetvoiceassistcp.remove();
                                } else {
                                    accessgetvoiceassistcp.set(l);
                                }
                                cursor3 = accessgetwakeupcp5.write;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                threadLocal.set(accessgetwakeupcp4);
                                return dynamiteModule3;
                            }
                            try {
                                if (i5 == 1) {
                                    try {
                                        try {
                                            i2 = toxyzui_graphics.IconCompatParcelizer;
                                            try {
                                                try {
                                                    try {
                                                        synchronized (DynamiteModule.class) {
                                                            try {
                                                                if (RemoteActionCompatParcelizer(context)) {
                                                                    bool = MediaDescriptionCompat;
                                                                    if (bool != null) {
                                                                        if (bool.booleanValue()) {
                                                                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                                            synchronized (DynamiteModule.class) {
                                                                                try {
                                                                                    accessgetwindowcp = PlaybackStateCompat;
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    while (true) {
                                                                                        try {
                                                                                            throw th;
                                                                                        } catch (Throwable th2) {
                                                                                            th = th2;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (accessgetwindowcp != null) {
                                                                                accessgetwakeupcp3 = (accessgetWakeUpcp) threadLocal.get();
                                                                                if (accessgetwakeupcp3 == null && accessgetwakeupcp3.write != null) {
                                                                                    Context applicationContext2 = context.getApplicationContext();
                                                                                    Cursor cursor4 = accessgetwakeupcp3.write;
                                                                                    new ObjectWrapper(null);
                                                                                    try {
                                                                                        synchronized (DynamiteModule.class) {
                                                                                            try {
                                                                                                accessgetwakeupcp = accessgetwakeupcp4;
                                                                                                boolean z = MediaSessionCompatQueueItem >= 2;
                                                                                                if (z) {
                                                                                                    accessgettwocpWrite = accessgetwindowcp.IconCompatParcelizer(new ObjectWrapper(applicationContext2), str, i2, new ObjectWrapper(cursor4));
                                                                                                } else {
                                                                                                    SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                                                    accessgettwocpWrite = accessgetwindowcp.write(new ObjectWrapper(applicationContext2), str, i2, new ObjectWrapper(cursor4));
                                                                                                }
                                                                                                Context context2 = (Context) ObjectWrapper.unwrap(accessgettwocpWrite);
                                                                                                if (context2 != null) {
                                                                                                    dynamiteModule = new DynamiteModule(context2);
                                                                                                } else {
                                                                                                    throw new LoadingException("Failed to get module context");
                                                                                                }
                                                                                            } catch (Throwable th3) {
                                                                                                th = th3;
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th4) {
                                                                                        th = th4;
                                                                                    }
                                                                                } else {
                                                                                    throw new LoadingException("No result cursor");
                                                                                }
                                                                            } else {
                                                                                throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                                                            }
                                                                        } else {
                                                                            accessgetwakeupcp = accessgetwakeupcp4;
                                                                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                                            accessgetvolumeupcp = read(context);
                                                                            if (accessgetvolumeupcp != null) {
                                                                                iSerializer = accessgetvolumeupcp.serializer();
                                                                                if (iSerializer >= 3) {
                                                                                    accessgetwakeupcp2 = (accessgetWakeUpcp) threadLocal.get();
                                                                                    if (accessgetwakeupcp2 != null) {
                                                                                        accessgettwocpSerializer = accessgetvolumeupcp.write(new ObjectWrapper(r1), str, i2, new ObjectWrapper(accessgetwakeupcp2.write));
                                                                                    } else {
                                                                                        throw new LoadingException("No cached result cursor holder");
                                                                                    }
                                                                                } else if (iSerializer == 2) {
                                                                                    SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "IDynamite loader version = 2");
                                                                                    accessgettwocpSerializer = accessgetvolumeupcp.read(new ObjectWrapper(r1), str, i2);
                                                                                } else {
                                                                                    SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                                                    accessgettwocpSerializer = accessgetvolumeupcp.serializer(new ObjectWrapper(r1), str, i2);
                                                                                }
                                                                                objUnwrap = ObjectWrapper.unwrap(accessgettwocpSerializer);
                                                                                if (objUnwrap != null) {
                                                                                    dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                                                                } else {
                                                                                    throw new LoadingException("Failed to load remote module.");
                                                                                }
                                                                            } else {
                                                                                throw new LoadingException("Failed to create IDynamiteLoader.");
                                                                            }
                                                                        }
                                                                        if (jLongValue == 0) {
                                                                            ParcelableVolumeInfo.remove();
                                                                        } else {
                                                                            ParcelableVolumeInfo.set(l);
                                                                        }
                                                                        cursor2 = accessgetwakeupcp5.write;
                                                                        if (cursor2 != null) {
                                                                            cursor2.close();
                                                                        }
                                                                        PlaybackStateCompatCustomAction.set(accessgetwakeupcp);
                                                                        return dynamiteModule;
                                                                    }
                                                                    throw new LoadingException("Failed to determine which loading route to use.");
                                                                }
                                                                throw new LoadingException("Remote loading disabled");
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                } catch (RemoteException e) {
                                                    e = e;
                                                    throw new LoadingException("Failed to load remote module.", e);
                                                } catch (LoadingException e2) {
                                                    throw e2;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    accessgetTvInputComponent2cp.read(r1, th);
                                                    throw new LoadingException("Failed to load remote module.", th);
                                                }
                                            } catch (RemoteException e3) {
                                                e = e3;
                                                throw new LoadingException("Failed to load remote module.", e);
                                            } catch (LoadingException e4) {
                                                throw e4;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                accessgetTvInputComponent2cp.read(r1, th);
                                                throw new LoadingException("Failed to load remote module.", th);
                                            }
                                        } catch (LoadingException e5) {
                                            e = e5;
                                            String message = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 30);
                                            sb2.append("Failed to load remote module: ");
                                            sb2.append(message);
                                            SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", sb2.toString());
                                            i = toxyzui_graphics.RemoteActionCompatParcelizer;
                                            if (i == 0 && accessgetvolumemutecp.read(r1, str, new getUseEvaluationsCachefwf_client_release((byte) 0, i, 3)).write == -1) {
                                                "Selected local version of ".concat(String.valueOf(str));
                                                dynamiteModule = new DynamiteModule(applicationContext);
                                            } else {
                                                throw new LoadingException("Remote load failed. No local fallback found.", e);
                                            }
                                        }
                                    } catch (LoadingException e6) {
                                        e = e6;
                                        accessgetwakeupcp = accessgetwakeupcp4;
                                        String message2 = e.getMessage();
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 30);
                                        sb3.append("Failed to load remote module: ");
                                        sb3.append(message2);
                                        SentryLogcatAdapter.IconCompatParcelizer("DynamiteModule", sb3.toString());
                                        i = toxyzui_graphics.RemoteActionCompatParcelizer;
                                        if (i == 0) {
                                        }
                                        throw new LoadingException("Remote load failed. No local fallback found.", e);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        r1 = accessgetwakeupcp4;
                                        if (jLongValue == 0) {
                                            ParcelableVolumeInfo.remove();
                                        } else {
                                            ParcelableVolumeInfo.set(l);
                                        }
                                        cursor = accessgetwakeupcp5.write;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        PlaybackStateCompatCustomAction.set(r1);
                                        throw th;
                                    }
                                } else {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i5).length() + 36);
                                    sb4.append("VersionPolicy returned invalid code:");
                                    sb4.append(i5);
                                    throw new LoadingException(sb4.toString());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                            if (jLongValue == 0) {
                                ParcelableVolumeInfo.remove();
                            } else {
                                ParcelableVolumeInfo.set(l);
                            }
                            cursor = accessgetwakeupcp5.write;
                            if (cursor != null) {
                                cursor.close();
                            }
                            PlaybackStateCompatCustomAction.set(r1);
                            throw th;
                        }
                    }
                    int i6 = toxyzui_graphics.RemoteActionCompatParcelizer;
                    int i7 = toxyzui_graphics.IconCompatParcelizer;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i6).length() + 23 + String.valueOf(i7).length() + 1);
                    sb5.append("No acceptable module ");
                    sb5.append(str);
                    sb5.append(" found. Local version is ");
                    sb5.append(i6);
                    sb5.append(" and remote version is ");
                    sb5.append(i7);
                    sb5.append(".");
                    throw new LoadingException(sb5.toString());
                } catch (Throwable th11) {
                    th = th11;
                }
            } catch (Throwable th12) {
                th = th12;
                r1 = accessgetwakeupcp4;
            }
        } else {
            throw new LoadingException("null application Context");
        }
    }

    public class LoadingException extends Exception {
        public LoadingException(String str, Throwable th) {
            super(str, th);
        }

        public LoadingException(String str) {
            super(str);
        }
    }
}
