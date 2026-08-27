package com.braze.support;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.hg$$ExternalSyntheticLambda1;
import bo.app.hh;
import bo.app.m1$$ExternalSyntheticLambda18;
import com.adjust.sdk.Constants;
import com.braze.Braze;
import io.sentry.SentryUUID;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.TextStreamsKt;
import o.ensureSubscribedToInAppMessageEvents;
import o.extractIntegerPixels;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCarryoverInAppMessage;
import o.setFontSizeR2X_6o;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeFileUtils {
    private static final String FILE_SCHEME = "file";
    private static char IconCompatParcelizer = 0;
    public static final List<String> REMOTE_SCHEMES;
    private static final String SHARED_PREFERENCES_FILENAME_SUFFIX = ".xml";
    private static final String TAG;
    private static char[] write;
    private static final byte[] $$a = {50, -28, 114, 103};
    private static final int $$b = 178;
    private static int serializer = 0;
    private static int read = 1;

    private static String $$c(int i, int i2, int i3) {
        int i4 = 3 - (i3 * 4);
        int i5 = i2 * 2;
        int i6 = 105 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i6 += i7;
        }
        while (true) {
            i4++;
            i8++;
            bArr2[i8] = (byte) i6;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i6 += bArr[i4];
        }
    }

    public static final void deleteDataStoreFile(File file) {
        file.getClass();
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 5), 12, (Object) null);
        } else if (file.delete()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 6), 14, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 7), 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("SDK is offline. File not downloaded for url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$1() {
        return "Download directory null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$2() {
        return "Zip file url null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$3() {
        return "Output filename null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$6(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Exception during download of file from url : ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isRemoteUri$lambda$0() {
        return "Null or blank Uri scheme.";
    }

    public static final void deleteFileOrDirectory(File file) {
        file.getClass();
        if (r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.IconCompatParcelizer(file)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 4), 12, (Object) null);
    }

    public static final void deleteSharedPreferencesFile(Context context, File file) {
        context.getClass();
        file.getClass();
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 8), 12, (Object) null);
            return;
        }
        String name = file.getName();
        name.getClass();
        if (setCarryoverInAppMessage.read(name, SHARED_PREFERENCES_FILENAME_SUFFIX, false)) {
            context.deleteSharedPreferences(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(name, SHARED_PREFERENCES_FILENAME_SUFFIX));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 9), 12, (Object) null);
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        return scheme == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) scheme) || scheme.equals(FILE_SCHEME);
    }

    public static final boolean isRemoteUri(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        if (scheme != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(19), 12, (Object) null);
        return false;
    }

    static {
        read();
        TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
        REMOTE_SCHEMES = SQLite.read("http", Constants.SCHEME, "ftp", "ftps", "about", "javascript");
    }

    public static final onViewAttachedToWindowlambda0 downloadFileToPath(String str, String str2, String str3, String str4) throws Exception {
        str.getClass();
        str2.getClass();
        str3.getClass();
        TrafficStats.setThreadStatsTag(com.braze.Constants.TRAFFIC_STATS_THREAD_TAG);
        if (!Braze.Companion.getOutboundNetworkRequestsOffline()) {
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    int i = 16;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                        HttpURLConnection httpURLConnection = null;
                        try {
                            try {
                                new File(str).mkdirs();
                                if (str4 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                                    str3 = str3.concat(str4);
                                }
                                File file = new File(str, str3);
                                HttpURLConnection httpURLConnectionA = hh.a.a(new URL(str2));
                                int responseCode = httpURLConnectionA.getResponseCode();
                                if (responseCode == 200) {
                                    DataInputStream dataInputStream = new DataInputStream(httpURLConnectionA.getInputStream());
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            SentryUUID.RemoteActionCompatParcelizer(dataInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            dataInputStream.close();
                                            Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                                            headerFields.getClass();
                                            LinkedHashMap linkedHashMapA = h.a(headerFields);
                                            httpURLConnectionA.disconnect();
                                            return new onViewAttachedToWindowlambda0(file, linkedHashMapA);
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                int i2 = sourceInformationContextOfdefault.read();
                                                int i3 = sourceInformationContextOfdefault.read();
                                                int i4 = sourceInformationContextOfdefault.read();
                                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i2, i3, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStream, th}, i4);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            int i5 = sourceInformationContextOfdefault.read();
                                            int i6 = sourceInformationContextOfdefault.read();
                                            int i7 = sourceInformationContextOfdefault.read();
                                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i5, i6, -871780639, sourceInformationContextOfdefault.read(), new Object[]{dataInputStream, th3}, i7);
                                            throw th4;
                                        }
                                    }
                                }
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda18(responseCode, str2), 14, (Object) null);
                                StringBuilder sb = new StringBuilder("HTTP response code was ");
                                sb.append(responseCode);
                                Object[] objArr = new Object[1];
                                a(new char[]{7, 2, '\f', 1, 5, 0, 0, 15, 2, '\f', 15, 7, '\t', 4, 7, 0}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, (byte) (116 - (Process.myTid() >> 22)), objArr);
                                sb.append((String) objArr[0]);
                                sb.append(str2);
                                sb.append(" could not be downloaded.");
                                throw new Exception(sb.toString());
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 9), 8, (Object) null);
                                throw new Exception("Exception during download of file from url : ".concat(str2));
                            }
                        } catch (Throwable th5) {
                            if (0 != 0) {
                                httpURLConnection.disconnect();
                            }
                            throw th5;
                        }
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i), 12, (Object) null);
                    throw new Exception("Output filename is blank. File not downloaded.");
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(17), 12, (Object) null);
                throw new Exception("Zip file url is blank. File not downloaded.");
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(18), 12, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 10), 12, (Object) null);
        throw new Exception("SDK is offline. File not downloaded for url: ".concat(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$4(int i, String str) throws Throwable {
        StringBuilder sb = new StringBuilder("HTTP response code was ");
        sb.append(i);
        Object[] objArr = new Object[1];
        a(new char[]{7, 2, '\f', 1, 5, 0, 0, 15, 2, '\f', 15, 7, '\t', 4, 7, 0}, Color.rgb(0, 0, 0) + 16777232, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 116), objArr);
        sb.append((String) objArr[0]);
        sb.append(str);
        sb.append(" could not be downloaded.");
        return sb.toString();
    }

    public static /* synthetic */ onViewAttachedToWindowlambda0 downloadFileToPath$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$0(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Cannot delete DataStore file that does not exist. Path: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$1(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Successfully deleted DataStore file: ", file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$2(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to delete DataStore file: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteFileOrDirectory$lambda$0(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not recursively delete ", file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$0(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Cannot delete SharedPreferences that does not exist. Path: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$1(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("SharedPreferences file is expected to end in .xml. Path: ", file.getAbsolutePath());
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String str) throws Throwable {
        int i = 2 % 2;
        assetManager.getClass();
        str.getClass();
        try {
            Object[] objArr = {assetManager, str};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (View.getDefaultSize(0, 0) + 26244), 37 - View.resolveSize(0, 0), Color.alpha(0) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
            }
            InputStream inputStream = (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
            inputStream.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ensureSubscribedToInAppMessageEvents.write), 8192);
            try {
                String strIconCompatParcelizer = TextStreamsKt.IconCompatParcelizer(bufferedReader);
                bufferedReader.close();
                int i2 = serializer + 97;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return strIconCompatParcelizer;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    private static void a(char[] cArr, int i, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        extractIntegerPixels extractintegerpixels = new extractIntegerPixels();
        char[] cArr2 = write;
        Object obj2 = null;
        float f = 0.0f;
        int i3 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getTouchSlop() >> i3), Color.blue(0) + 2015, 24 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 234961161, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                    i3 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
        if (objRemoteActionCompatParcelizer2 == null) {
            byte b4 = (byte) 1;
            byte b5 = (byte) (b4 - 1);
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2014 - ExpandableListView.getPackedPositionChild(0L), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 234961161, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            extractintegerpixels.IconCompatParcelizer = 0;
            while (extractintegerpixels.IconCompatParcelizer < i2) {
                extractintegerpixels.read = cArr[extractintegerpixels.IconCompatParcelizer];
                extractintegerpixels.write = cArr[extractintegerpixels.IconCompatParcelizer + 1];
                if (extractintegerpixels.read == extractintegerpixels.write) {
                    cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read - b);
                    cArr4[extractintegerpixels.IconCompatParcelizer + 1] = (char) (extractintegerpixels.write - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(445195572);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 141 - (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - TextUtils.lastIndexOf("", '0', 0), -900135723, false, "f", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == extractintegerpixels.RatingCompat) {
                        Object[] objArr5 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                        Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1333055039);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2369 - ExpandableListView.getPackedPositionChild(0L), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1616580640, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i5 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[iIntValue];
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i5];
                    } else {
                        obj = null;
                        if (extractintegerpixels.serializer == extractintegerpixels.RemoteActionCompatParcelizer) {
                            extractintegerpixels.MediaBrowserCompatMediaItem = ((extractintegerpixels.MediaBrowserCompatMediaItem + cCharValue) - 1) % cCharValue;
                            extractintegerpixels.RatingCompat = ((extractintegerpixels.RatingCompat + cCharValue) - 1) % cCharValue;
                            int i6 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            int i7 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i6];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i7];
                        } else {
                            int i8 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.RatingCompat;
                            int i9 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i8];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i9];
                        }
                    }
                }
                extractintegerpixels.IconCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void read() {
        write = new char[]{52581, 52585, 52578, 52524, 52576, 52606, 52514, 52591, 52601, 52577, 52579, 52580, 52603, 52554, 52600, 52590};
        IconCompatParcelizer = (char) 63634;
    }
}
