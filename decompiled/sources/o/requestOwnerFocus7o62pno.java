package o;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class requestOwnerFocus7o62pno {
    public static final androidx.collection.LruCache serializer = new androidx.collection.LruCache(2);
    public static final LayoutNode$$ExternalSyntheticLambda1 write = new LayoutNode$$ExternalSyntheticLambda1(3);

    public static ProviderInfo serializer(PackageManager packageManager, scheduleInvalidationForOwner scheduleinvalidationforowner, Resources resources) {
        LayoutNode$$ExternalSyntheticLambda1 layoutNode$$ExternalSyntheticLambda1 = write;
        androidx.collection.LruCache lruCache = serializer;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("FontProvider.getProvider");
        try {
            List listRemoteActionCompatParcelizer = scheduleinvalidationforowner.read;
            String str = scheduleinvalidationforowner.RemoteActionCompatParcelizer;
            String str2 = scheduleinvalidationforowner.write;
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = io.sentry.android.replay.util.MediaDescriptionCompat.RemoteActionCompatParcelizer(resources, 0);
            }
            setActiveFocusTargetNode setactivefocustargetnode = new setActiveFocusTargetNode();
            setactivefocustargetnode.read = str;
            setactivefocustargetnode.write = str2;
            setactivefocustargetnode.RemoteActionCompatParcelizer = listRemoteActionCompatParcelizer;
            ProviderInfo providerInfo = (ProviderInfo) lruCache.get(setactivefocustargetnode);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, layoutNode$$ExternalSyntheticLambda1);
            for (int i = 0; i < listRemoteActionCompatParcelizer.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listRemoteActionCompatParcelizer.get(i));
                Collections.sort(arrayList2, layoutNode$$ExternalSyntheticLambda1);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            lruCache.put(setactivefocustargetnode, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static CSSParseException serializer(Context context, List list) {
        String str;
        android.graphics.Typeface typefaceWrite;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                scheduleInvalidationForOwner scheduleinvalidationforowner = (scheduleInvalidationForOwner) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceWrite = FocusOrderModifierKtfocusOrder1.write((str = scheduleinvalidationforowner.MediaBrowserCompatMediaItem))) == null || FocusOrderModifierKtfocusOrder1.bu_(typefaceWrite) == null) {
                    ProviderInfo providerInfoSerializer = serializer(context.getPackageManager(), scheduleinvalidationforowner, context.getResources());
                    if (providerInfoSerializer == null) {
                        return new CSSParseException((byte) 0, 2);
                    }
                    arrayList.add(serializer(context, scheduleinvalidationforowner, providerInfoSerializer.authority));
                } else {
                    arrayList.add(new FocusOwnerdispatchRotaryEvent1[]{new FocusOwnerdispatchRotaryEvent1(str, scheduleinvalidationforowner.MediaMetadataCompat)});
                }
            }
            return new CSSParseException(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128 A[Catch: all -> 0x0152, TRY_ENTER, TryCatch #1 {all -> 0x0152, blocks: (B:3:0x0017, B:51:0x0128, B:53:0x012d, B:54:0x0130, B:64:0x0149, B:66:0x014e, B:67:0x0151), top: B:72:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012d A[Catch: all -> 0x0152, TryCatch #1 {all -> 0x0152, blocks: (B:3:0x0017, B:51:0x0128, B:53:0x012d, B:54:0x0130, B:64:0x0149, B:66:0x014e, B:67:0x0151), top: B:72:0x0017 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static FocusOwnerdispatchRotaryEvent1[] serializer(Context context, scheduleInvalidationForOwner scheduleinvalidationforowner, String str) throws RemoteException {
        ArrayList arrayList;
        int i;
        Cursor cursorQuery;
        ArrayList arrayList2;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("FontProvider.query");
        try {
            ArrayList arrayList3 = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {scheduleinvalidationforowner.IconCompatParcelizer};
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            arrayList = arrayList3;
                            i = 1;
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException e) {
                                SentryLogcatAdapter.write("FontsProvider", "Unable to query the content provider", e);
                                cursorQuery = null;
                            }
                            Trace.endSection();
                            if (cursorQuery != null || cursorQuery.getCount() <= 0) {
                                arrayList2 = arrayList;
                            } else {
                                int columnIndex = cursorQuery.getColumnIndex("result_code");
                                ArrayList arrayList4 = new ArrayList();
                                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                                while (cursorQuery.moveToNext()) {
                                    arrayList4.add(new FocusOwnerdispatchRotaryEvent1(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, (columnIndex6 == -1 || cursorQuery.getInt(columnIndex6) != i) ? 0 : i, scheduleinvalidationforowner.MediaMetadataCompat, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                                }
                                arrayList2 = arrayList4;
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                            }
                            FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr = (FocusOwnerdispatchRotaryEvent1[]) arrayList2.toArray(new FocusOwnerdispatchRotaryEvent1[0]);
                            Trace.endSection();
                            return focusOwnerdispatchRotaryEvent1Arr;
                        }
                        arrayList = arrayList3;
                        i = 1;
                        Trace.endSection();
                        if (cursorQuery != null) {
                            arrayList2 = arrayList;
                        } else {
                            arrayList2 = arrayList;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr2 = (FocusOwnerdispatchRotaryEvent1[]) arrayList2.toArray(new FocusOwnerdispatchRotaryEvent1[0]);
                        Trace.endSection();
                        return focusOwnerdispatchRotaryEvent1Arr2;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        throw th;
                    }
                    cursorQuery = null;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
