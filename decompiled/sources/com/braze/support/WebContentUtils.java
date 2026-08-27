package com.braze.support;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.ig$$ExternalSyntheticLambda1;
import bo.app.n$$ExternalSyntheticLambda2;
import com.braze.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCarryoverInAppMessage;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public final class WebContentUtils {
    public static final String ASSET_LOADER_DUMMY_DOMAIN = "iamcache.braze";
    private static final int DEFAULT_MAX_UNPACKED_ZIP_ENTRY_COUNT = 1024;
    public static final String HTML_INAPP_MESSAGES_FOLDER = "braze-html-inapp-messages";
    private static final String ZIP_EXTENSION = ".zip";
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static int maxUnpackedZipEntryCount = 1024;
    private static final long DEFAULT_MAX_UNPACKED_ZIP_ENTRY_SIZE_BYTES = 26214400;
    private static long maxUnpackedZipEntrySizeBytes = DEFAULT_MAX_UNPACKED_ZIP_ENTRY_SIZE_BYTES;
    private static final long DEFAULT_MAX_UNPACKED_ZIP_SIZE_BYTES = 104857600;
    private static long maxUnpackedZipSizeBytes = DEFAULT_MAX_UNPACKED_ZIP_SIZE_BYTES;

    private WebContentUtils() {
    }

    public static /* synthetic */ void getMaxUnpackedZipEntryCount$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getMaxUnpackedZipEntrySizeBytes$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getMaxUnpackedZipSizeBytes$android_sdk_base_release$annotations() {
    }

    public final int getMaxUnpackedZipEntryCount$android_sdk_base_release() {
        return maxUnpackedZipEntryCount;
    }

    public final long getMaxUnpackedZipEntrySizeBytes$android_sdk_base_release() {
        return maxUnpackedZipEntrySizeBytes;
    }

    public final long getMaxUnpackedZipSizeBytes$android_sdk_base_release() {
        return maxUnpackedZipSizeBytes;
    }

    public final void setMaxUnpackedZipEntryCount$android_sdk_base_release(int i) {
        maxUnpackedZipEntryCount = i;
    }

    public final void setMaxUnpackedZipEntrySizeBytes$android_sdk_base_release(long j) {
        maxUnpackedZipEntrySizeBytes = j;
    }

    public final void setMaxUnpackedZipSizeBytes$android_sdk_base_release(long j) {
        maxUnpackedZipSizeBytes = j;
    }

    private final long copyZipEntryToOutputStream(ZipInputStream zipInputStream, BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        byte[] bArr = new byte[8192];
        int i = zipInputStream.read(bArr);
        long j2 = 0;
        while (i >= 0) {
            long j3 = i;
            j2 += j3;
            j += j3;
            if (j2 > maxUnpackedZipEntrySizeBytes) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Zip entry exceeds maximum unpacked size.");
                return 0L;
            }
            if (j > maxUnpackedZipSizeBytes) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Zip file exceeds maximum total unpacked size.");
                return 0L;
            }
            bufferedOutputStream.write(bArr, 0, i);
            i = zipInputStream.read(bArr);
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$0() {
        return "Remote zip url is empty. No local URL will be created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$2(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not download zip file to local storage. ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$4() {
        return "Error during the zip unpack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasTooManyZipEntries$lambda$0() {
        return "Zip file contains too many entries.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Cannot find local asset file at path: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$0() {
        return "Unpack directory is blank. Zip file not unpacked.";
    }

    public static final String getLocalHtmlUrlFromRemoteUrl(File file, String str) {
        file.getClass();
        str.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(20), 6, (Object) null);
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        String strValueOf = String.valueOf(IntentUtils.getRequestCode());
        String strM = af$$ExternalSyntheticOutline0.m(absolutePath, "/", strValueOf);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, strM, 28), 7, (Object) null);
        try {
            File file2 = (File) BrazeFileUtils.downloadFileToPath(strM, str, strValueOf, ZIP_EXTENSION).serializer;
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, strM, 29), 7, (Object) null);
            if (unpackZipIntoDirectory(strM, file2)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(strM, 25), 7, (Object) null);
                return strM;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(22), 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(strM));
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 26), 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(strM));
            return null;
        }
    }

    public static final String replacePrefetchedUrlsWithLocalAssets(String str, Map<String, String> map) {
        str.getClass();
        map.getClass();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (new File(value).exists()) {
                String key = entry.getKey();
                int i = 0;
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) value, (CharSequence) Constants.TRIGGERS_ASSETS_FOLDER, false)) {
                    String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("https://iamcache.braze/ab_triggers", (String) hideCurrentlyDisplayingInAppMessage.serializer(value, new String[]{Constants.TRIGGERS_ASSETS_FOLDER}, 6).get(1));
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) key, false)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new WebContentUtils$$ExternalSyntheticLambda9(key, strSerializer, i), 7, (Object) null);
                        str = setCarryoverInAppMessage.write(str, key, strSerializer);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(value, 27), 6, (Object) null);
            }
        }
        return str;
    }

    public static final boolean unpackZipIntoDirectory(String str, File file) {
        str.getClass();
        file.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(23), 6, (Object) null);
            return false;
        }
        new File(str).mkdirs();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            try {
                long jUnpackZipEntry = 0;
                int i = 0;
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    WebContentUtils webContentUtils = INSTANCE;
                    if (!webContentUtils.shouldSkip(nextEntry)) {
                        int i2 = i + 1;
                        if (webContentUtils.hasTooManyZipEntries(i2)) {
                            zipInputStream.close();
                            return false;
                        }
                        jUnpackZipEntry = webContentUtils.unpackZipEntry(str, zipInputStream, nextEntry, jUnpackZipEntry);
                        i = i2;
                    }
                    zipInputStream.closeEntry();
                }
                zipInputStream.close();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{zipInputStream, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, th3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(file, 27, str), 4, (Object) null);
            return false;
        }
    }

    public static final String validateChildFileExistsUnderParent(String str, String str2) throws IOException {
        str.getClass();
        str2.getClass();
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        canonicalPath2.getClass();
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(canonicalPath2, canonicalPath + File.separator, false)) {
            return canonicalPath2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Invalid file with original path: ", str2, " with canonical path: ", canonicalPath2, " does not exist under intended parent with  path: "), str, " and canonical path: ", canonicalPath));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$1(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Starting download of url: ", str, " to ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$3(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Html content zip downloaded. ", str, " to ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$5(String str) {
        return ff$$ExternalSyntheticOutline0.m("Html content zip unpacked to to ", str, ".");
    }

    private final boolean shouldSkip(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        name.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        return setCarryoverInAppMessage.RemoteActionCompatParcelizer(lowerCase, "__macosx", false);
    }

    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        context.getClass();
        return new File(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(context.getCacheDir().getPath(), "/braze-html-inapp-messages"));
    }

    private final boolean hasTooManyZipEntries(int i) {
        if (i <= maxUnpackedZipEntryCount) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(21), 6, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$1(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Replacing remote url \"", str, "\" with local uri \"", str2, "\"");
    }

    private final long unpackZipEntry(String str, ZipInputStream zipInputStream, ZipEntry zipEntry, long j) throws IOException {
        String strValidateChildFileExistsUnderParent = validateChildFileExistsUnderParent(str, str + "/" + zipEntry.getName());
        if (zipEntry.isDirectory()) {
            new File(strValidateChildFileExistsUnderParent).mkdirs();
            return j;
        }
        File parentFile = new File(strValidateChildFileExistsUnderParent).getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strValidateChildFileExistsUnderParent));
        try {
            long jCopyZipEntryToOutputStream = INSTANCE.copyZipEntryToOutputStream(zipInputStream, bufferedOutputStream, j);
            bufferedOutputStream.close();
            return jCopyZipEntryToOutputStream;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedOutputStream, th}, sourceInformationContextOfdefault.read());
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$2(File file, String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Error during unpack of zip file ", file.getAbsolutePath(), " to ", str, ".");
    }
}
