package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class clearFocusdefault extends ContentProvider {
    public FocusInvalidationManagerscheduleInvalidation1 IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem = new Object();
    public String serializer;
    public static final String[] read = {"_display_name", "_size"};
    public static final File RemoteActionCompatParcelizer = new File("/");
    public static final HashMap write = new HashMap();

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    public static FocusInvalidationManagerscheduleInvalidation1 read(Context context, String str) {
        FocusInvalidationManagerscheduleInvalidation1 focusInvalidationManagerscheduleInvalidation1Serializer;
        HashMap map = write;
        synchronized (map) {
            focusInvalidationManagerscheduleInvalidation1Serializer = (FocusInvalidationManagerscheduleInvalidation1) map.get(str);
            if (focusInvalidationManagerscheduleInvalidation1Serializer == null) {
                try {
                    try {
                        focusInvalidationManagerscheduleInvalidation1Serializer = serializer(context, str);
                        map.put(str, focusInvalidationManagerscheduleInvalidation1Serializer);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return focusInvalidationManagerscheduleInvalidation1Serializer;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    public static FocusInvalidationManagerscheduleInvalidation1 serializer(Context context, String str) throws XmlPullParserException, IOException {
        File externalStorageDirectory;
        FocusInvalidationManagerscheduleInvalidation1 focusInvalidationManagerscheduleInvalidation1 = new FocusInvalidationManagerscheduleInvalidation1(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, androidx.compose.ui.graphics.Fields.SpotShadowColor);
        if (providerInfoResolveContentProvider == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Couldn't find meta-data for provider with authority ", str));
            return null;
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            return null;
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return focusInvalidationManagerscheduleInvalidation1;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = RemoteActionCompatParcelizer;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else {
                    externalStorageDirectory = null;
                }
                if (externalStorageDirectory != null) {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    focusInvalidationManagerscheduleInvalidation1.RemoteActionCompatParcelizer(externalStorageDirectory, attributeValue);
                }
            }
        }
    }

    public final FocusInvalidationManagerscheduleInvalidation1 IconCompatParcelizer() {
        FocusInvalidationManagerscheduleInvalidation1 focusInvalidationManagerscheduleInvalidation1;
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.serializer == null) {
                throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = read(getContext(), this.serializer);
            }
            focusInvalidationManagerscheduleInvalidation1 = this.IconCompatParcelizer;
        }
        return focusInvalidationManagerscheduleInvalidation1;
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.serializer = str2;
        }
        HashMap map = write;
        synchronized (map) {
            map.remove(str2);
        }
    }

    public static Uri write(Context context, File file, String str) {
        return read(context, str).read(file);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return IconCompatParcelizer().serializer(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileSerializer = IconCompatParcelizer().serializer(uri);
        int iLastIndexOf = fileSerializer.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileSerializer.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileSerializer = IconCompatParcelizer().serializer(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid mode: ", str));
                return null;
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileSerializer, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileSerializer = IconCompatParcelizer().serializer(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = read;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileSerializer.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(fileSerializer.length());
                }
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public static String IconCompatParcelizer(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 0, str);
    }
}
