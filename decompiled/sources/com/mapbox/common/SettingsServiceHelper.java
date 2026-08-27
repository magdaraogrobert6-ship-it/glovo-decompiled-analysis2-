package com.mapbox.common;

import android.content.SharedPreferences;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.None;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingsServiceHelper {
    public static final Companion Companion = new Companion(null);
    private static final String MAPBOX_PREFERENCES_NAME = "mapbox_settings";
    private static final onViewDetachedFromWindowlambda1 preferences$delegate;
    private static final ReentrantReadWriteLock.ReadLock readLock;
    private static final ReentrantReadWriteLock readWriteLock;
    private static final ReentrantReadWriteLock.WriteLock writeLock;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Expected<String, None> erase(String str) {
            Expected<String, None> expectedCreateError;
            str.getClass();
            SettingsServiceHelper.writeLock.lock();
            try {
                try {
                    SharedPreferences.Editor editorEdit = getPreferences().edit();
                    editorEdit.remove(str);
                    editorEdit.apply();
                    expectedCreateError = ExpectedFactory.createNone();
                    expectedCreateError.getClass();
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    expectedCreateError = ExpectedFactory.createError(message);
                    expectedCreateError.getClass();
                }
                return expectedCreateError;
            } finally {
                SettingsServiceHelper.writeLock.unlock();
            }
        }

        public final Expected<String, String> get(String str) {
            str.getClass();
            SettingsServiceHelper.readLock.lock();
            try {
                return getInternal(str);
            } finally {
                SettingsServiceHelper.readLock.unlock();
            }
        }

        public final boolean has(String str) {
            str.getClass();
            SettingsServiceHelper.readLock.lock();
            try {
                return getPreferences().contains(str);
            } catch (Exception unused) {
                return false;
            } finally {
                SettingsServiceHelper.readLock.unlock();
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0059 A[Catch: all -> 0x010f, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000d, B:5:0x0017, B:7:0x0043, B:8:0x0053, B:10:0x0059, B:12:0x0083, B:13:0x00ab, B:15:0x00b1, B:18:0x00bb, B:21:0x00cf, B:20:0x00c1, B:23:0x00f8, B:26:0x0100), top: B:34:0x000d, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x0083 A[Catch: all -> 0x010f, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000d, B:5:0x0017, B:7:0x0043, B:8:0x0053, B:10:0x0059, B:12:0x0083, B:13:0x00ab, B:15:0x00b1, B:18:0x00bb, B:21:0x00cf, B:20:0x00c1, B:23:0x00f8, B:26:0x0100), top: B:34:0x000d, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:13:0x00ab A[Catch: all -> 0x010f, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000d, B:5:0x0017, B:7:0x0043, B:8:0x0053, B:10:0x0059, B:12:0x0083, B:13:0x00ab, B:15:0x00b1, B:18:0x00bb, B:21:0x00cf, B:20:0x00c1, B:23:0x00f8, B:26:0x0100), top: B:34:0x000d, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:15:0x00b1 A[Catch: all -> 0x010f, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000d, B:5:0x0017, B:7:0x0043, B:8:0x0053, B:10:0x0059, B:12:0x0083, B:13:0x00ab, B:15:0x00b1, B:18:0x00bb, B:21:0x00cf, B:20:0x00c1, B:23:0x00f8, B:26:0x0100), top: B:34:0x000d, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:16:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:18:0x00bb A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000d, B:5:0x0017, B:7:0x0043, B:8:0x0053, B:10:0x0059, B:12:0x0083, B:13:0x00ab, B:15:0x00b1, B:18:0x00bb, B:21:0x00cf, B:20:0x00c1, B:23:0x00f8, B:26:0x0100), top: B:34:0x000d, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x0053 A[Catch: all -> 0x010f, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000d, B:5:0x0017, B:7:0x0043, B:8:0x0053, B:10:0x0059, B:12:0x0083, B:13:0x00ab, B:15:0x00b1, B:18:0x00bb, B:21:0x00cf, B:20:0x00c1, B:23:0x00f8, B:26:0x0100), top: B:34:0x000d, inners: #0 }] */
        public final Expected<String, List<String>> set(String str, String str2, boolean z) {
            String value;
            Expected<String, List<String>> expectedCreateError;
            Object[] objArr;
            str.getClass();
            str2.getClass();
            SettingsServiceHelper.writeLock.lock();
            try {
                Expected<String, String> internal = getInternal(str);
                if (internal.isError()) {
                    Object[] objArr2 = {internal.getError(), "Key is not found"};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        String error = internal.getError();
                        error.getClass();
                        expectedCreateError = ExpectedFactory.createError(error);
                        expectedCreateError.getClass();
                    } else if (internal.isValue()) {
                        objArr = new Object[]{internal.getValue(), str2};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            int iSerializer = getQueryParameterslambda2.serializer();
                            int iSerializer2 = getQueryParameterslambda2.serializer();
                            expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{str2}, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
                            expectedCreateError.getClass();
                        } else {
                            if (internal.isValue()) {
                                value = internal.getValue();
                            } else {
                                value = null;
                            }
                            if (z || internal.isError()) {
                                try {
                                    SharedPreferences.Editor editorEdit = getPreferences().edit();
                                    editorEdit.putString(str, str2);
                                    editorEdit.apply();
                                } catch (Exception e) {
                                    String message = e.getMessage();
                                    if (message == null) {
                                        message = "Unknown error";
                                    }
                                    expectedCreateError = ExpectedFactory.createError(message);
                                    expectedCreateError.getClass();
                                }
                            }
                            int iSerializer3 = getQueryParameterslambda2.serializer();
                            int iSerializer4 = getQueryParameterslambda2.serializer();
                            expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer4, 516583654, new Object[]{value}, getQueryParameterslambda2.serializer(), -516583649, iSerializer3));
                            expectedCreateError.getClass();
                        }
                    } else {
                        if (internal.isValue()) {
                            value = internal.getValue();
                        } else {
                            value = null;
                        }
                        if (z) {
                            SharedPreferences.Editor editorEdit2 = getPreferences().edit();
                            editorEdit2.putString(str, str2);
                            editorEdit2.apply();
                            int iSerializer5 = getQueryParameterslambda2.serializer();
                            int iSerializer6 = getQueryParameterslambda2.serializer();
                            expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer6, 516583654, new Object[]{value}, getQueryParameterslambda2.serializer(), -516583649, iSerializer5));
                            expectedCreateError.getClass();
                        } else {
                            SharedPreferences.Editor editorEdit3 = getPreferences().edit();
                            editorEdit3.putString(str, str2);
                            editorEdit3.apply();
                            int iSerializer7 = getQueryParameterslambda2.serializer();
                            int iSerializer8 = getQueryParameterslambda2.serializer();
                            expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer8, 516583654, new Object[]{value}, getQueryParameterslambda2.serializer(), -516583649, iSerializer7));
                            expectedCreateError.getClass();
                        }
                    }
                } else if (internal.isValue()) {
                    objArr = new Object[]{internal.getValue(), str2};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        int iSerializer9 = getQueryParameterslambda2.serializer();
                        int iSerializer10 = getQueryParameterslambda2.serializer();
                        expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer10, 516583654, new Object[]{str2}, getQueryParameterslambda2.serializer(), -516583649, iSerializer9));
                        expectedCreateError.getClass();
                    } else {
                        if (internal.isValue()) {
                            value = internal.getValue();
                        } else {
                            value = null;
                        }
                        if (z) {
                            SharedPreferences.Editor editorEdit4 = getPreferences().edit();
                            editorEdit4.putString(str, str2);
                            editorEdit4.apply();
                            int iSerializer11 = getQueryParameterslambda2.serializer();
                            int iSerializer12 = getQueryParameterslambda2.serializer();
                            expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer12, 516583654, new Object[]{value}, getQueryParameterslambda2.serializer(), -516583649, iSerializer11));
                            expectedCreateError.getClass();
                        } else {
                            SharedPreferences.Editor editorEdit5 = getPreferences().edit();
                            editorEdit5.putString(str, str2);
                            editorEdit5.apply();
                            int iSerializer13 = getQueryParameterslambda2.serializer();
                            int iSerializer14 = getQueryParameterslambda2.serializer();
                            expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer14, 516583654, new Object[]{value}, getQueryParameterslambda2.serializer(), -516583649, iSerializer13));
                            expectedCreateError.getClass();
                        }
                    }
                } else {
                    if (internal.isValue()) {
                        value = internal.getValue();
                    } else {
                        value = null;
                    }
                    if (z) {
                        SharedPreferences.Editor editorEdit6 = getPreferences().edit();
                        editorEdit6.putString(str, str2);
                        editorEdit6.apply();
                        int iSerializer15 = getQueryParameterslambda2.serializer();
                        int iSerializer16 = getQueryParameterslambda2.serializer();
                        expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer16, 516583654, new Object[]{value}, getQueryParameterslambda2.serializer(), -516583649, iSerializer15));
                        expectedCreateError.getClass();
                    } else {
                        SharedPreferences.Editor editorEdit7 = getPreferences().edit();
                        editorEdit7.putString(str, str2);
                        editorEdit7.apply();
                        int iSerializer17 = getQueryParameterslambda2.serializer();
                        int iSerializer18 = getQueryParameterslambda2.serializer();
                        expectedCreateError = ExpectedFactory.createValue((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer18, 516583654, new Object[]{value}, getQueryParameterslambda2.serializer(), -516583649, iSerializer17));
                        expectedCreateError.getClass();
                    }
                }
                return expectedCreateError;
            } finally {
                SettingsServiceHelper.writeLock.unlock();
            }
        }

        private Companion() {
        }

        private final SharedPreferences getPreferences() {
            return (SharedPreferences) SettingsServiceHelper.preferences$delegate.MediaSessionCompatResultReceiverWrapper();
        }

        public final void clear$common_release() {
            SettingsServiceHelper.writeLock.lock();
            try {
                SharedPreferences.Editor editorEdit = getPreferences().edit();
                editorEdit.clear();
                editorEdit.apply();
            } finally {
                SettingsServiceHelper.writeLock.unlock();
            }
        }

        public final List<String> getAllKeys() {
            SettingsServiceHelper.readLock.lock();
            try {
                Set<String> setKeySet = getPreferences().getAll().keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    String str = (String) obj;
                    try {
                        if (SettingsServiceHelper.Companion.getPreferences().getString(str, null) != null) {
                            str.getClass();
                            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "mapbox.", false)) {
                                arrayList.add(obj);
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } catch (ClassCastException unused) {
                    }
                }
                return arrayList;
            } catch (Exception e) {
                Log.error("Error getting all keys: " + e.getMessage(), "settings");
                return instance_delegatelambda0.write;
            } finally {
                SettingsServiceHelper.readLock.unlock();
            }
        }

        private final Expected<String, String> getInternal(String str) {
            try {
                String string = getPreferences().getString(str, null);
                Expected<String, String> expectedCreateValue = string != null ? ExpectedFactory.createValue(string) : null;
                if (expectedCreateValue != null) {
                    return expectedCreateValue;
                }
                Expected<String, String> expectedCreateError = ExpectedFactory.createError("Key is not found");
                expectedCreateError.getClass();
                return expectedCreateError;
            } catch (ClassCastException e) {
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Unable to get a value for ", str, ": ");
                sbM.append(e.getMessage());
                String string2 = sbM.toString();
                Log.error(string2, "settings");
                Expected<String, String> expectedCreateError2 = ExpectedFactory.createError(string2);
                expectedCreateError2.getClass();
                return expectedCreateError2;
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Expected<String, String> expectedCreateError3 = ExpectedFactory.createError(message);
                expectedCreateError3.getClass();
                return expectedCreateError3;
            }
        }
    }

    public static final Expected<String, None> erase(String str) {
        return Companion.erase(str);
    }

    public static final Expected<String, String> get(String str) {
        return Companion.get(str);
    }

    public static final List<String> getAllKeys() {
        return Companion.getAllKeys();
    }

    public static final boolean has(String str) {
        return Companion.has(str);
    }

    public static final Expected<String, List<String>> set(String str, String str2, boolean z) {
        return Companion.set(str, str2, z);
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        readWriteLock = reentrantReadWriteLock;
        readLock = reentrantReadWriteLock.readLock();
        writeLock = reentrantReadWriteLock.writeLock();
        preferences$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.SettingsServiceHelper$Companion$preferences$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final SharedPreferences invoke() {
                return MapboxSDKCommon.INSTANCE.getContext().getSharedPreferences("mapbox_settings", 0);
            }
        }});
    }
}
