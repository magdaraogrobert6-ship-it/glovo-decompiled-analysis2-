package o;

import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.recyclerview.widget.DiffUtil$Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o.AndroidCanvas;
import o.BundleUtils;
import o.accessgetSaturationcp;
import o.getSdkDebuggerCallbackandroid_sdk_base_release;
import o.isAppSetIdReadingEnabled;
import o.onContentCardDismissed;
import o.r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.report;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCanvas implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer = 0;
    public final /* synthetic */ Object write;

    public /* synthetic */ AndroidCanvas(LookaheadScope lookaheadScope, int i, Exception exc, byte[] bArr, Map map) {
        this.RemoteActionCompatParcelizer = lookaheadScope;
        this.read = i;
        this.write = exc;
        this.MediaDescriptionCompat = bArr;
        this.IconCompatParcelizer = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.MediaDescriptionCompat;
        Object obj2 = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.IconCompatParcelizer;
        if (i == 0) {
            for (int i2 = 0; i2 < this.read; i2++) {
                View view = (View) ((ArrayList) obj3).get(i2);
                String str = (String) ((ArrayList) obj2).get(i2);
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                view.setTransitionName(str);
                ((View) ((ArrayList) obj).get(i2)).setTransitionName((String) ((ArrayList) obj4).get(i2));
            }
            return;
        }
        if (i == 1) {
            ((accessgetSaturationcp) obj4).IconCompatParcelizer.execute(new accessgetSrccp(this, 0, getClear0nO6VwU.serializer(new DiffUtil$Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer$1$1
                private static int read = 0;
                private static int write = 1;

                @Override // androidx.recyclerview.widget.DiffUtil$Callback
                public final int getNewListSize() {
                    int i3 = 2 % 2;
                    int i4 = read + 25;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    int size = ((List) this.IconCompatParcelizer.write).size();
                    int i6 = read + 63;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return size;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }

                @Override // androidx.recyclerview.widget.DiffUtil$Callback
                public final int getOldListSize() {
                    int i3 = 2 % 2;
                    int i4 = write + 71;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return ((List) this.IconCompatParcelizer.RemoteActionCompatParcelizer).size();
                    }
                    int i5 = 88 / 0;
                    return ((List) this.IconCompatParcelizer.RemoteActionCompatParcelizer).size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil$Callback
                public final Object getChangePayload(int i3, int i4) {
                    int i5 = 2 % 2;
                    int i6 = write + 71;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    AndroidCanvas androidCanvas = this.IconCompatParcelizer;
                    Object obj5 = ((List) androidCanvas.RemoteActionCompatParcelizer).get(i3);
                    Object obj6 = ((List) androidCanvas.write).get(i4);
                    if (obj5 != null) {
                        int i8 = write + 13;
                        int i9 = i8 % Fields.SpotShadowColor;
                        read = i9;
                        int i10 = i8 % 2;
                        if (obj6 != null) {
                            int i11 = i9 + 21;
                            write = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 != 0) {
                                Object obj7 = ((accessgetSaturationcp) androidCanvas.IconCompatParcelizer).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                                return null;
                            }
                            Object obj8 = ((accessgetSaturationcp) androidCanvas.IconCompatParcelizer).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                            throw null;
                        }
                    }
                    int iSerializer = isAppSetIdReadingEnabled.serializer();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
                    return null;
                }

                @Override // androidx.recyclerview.widget.DiffUtil$Callback
                public final boolean areContentsTheSame(int i3, int i4) {
                    int i5 = 2 % 2;
                    AndroidCanvas androidCanvas = this.IconCompatParcelizer;
                    Object obj5 = ((List) androidCanvas.RemoteActionCompatParcelizer).get(i3);
                    Object obj6 = ((List) androidCanvas.write).get(i4);
                    if (obj5 != null) {
                        int i6 = write + 61;
                        read = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            Object obj7 = null;
                            obj7.hashCode();
                            throw null;
                        }
                        if (obj6 != null) {
                            if (((r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms) ((accessgetSaturationcp) androidCanvas.IconCompatParcelizer).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).write != 0) {
                                return ((report) obj5).equals((report) obj6);
                            }
                            boolean zEquals = ((BundleUtils) obj5).equals((BundleUtils) obj6);
                            int i7 = write + 3;
                            read = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            return zEquals;
                        }
                    }
                    if (obj5 == null && obj6 == null) {
                        return true;
                    }
                    int iSerializer = isAppSetIdReadingEnabled.serializer();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
                    return false;
                }

                @Override // androidx.recyclerview.widget.DiffUtil$Callback
                public final boolean areItemsTheSame(int i3, int i4) {
                    int i5;
                    int i6 = 2 % 2;
                    int i7 = write + 117;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    AndroidCanvas androidCanvas = this.IconCompatParcelizer;
                    Object obj5 = ((List) androidCanvas.RemoteActionCompatParcelizer).get(i3);
                    Object obj6 = ((List) androidCanvas.write).get(i4);
                    boolean zEquals = true;
                    if (obj5 == null || obj6 == null) {
                        return obj5 == null && obj6 == null;
                    }
                    if (((r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms) ((accessgetSaturationcp) androidCanvas.IconCompatParcelizer).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).write != 0) {
                        zEquals = ((report) obj5).write.read.equals(((report) obj6).write.read);
                        i5 = write + 67;
                    } else {
                        BundleUtils bundleUtils = (BundleUtils) obj5;
                        BundleUtils bundleUtils2 = (BundleUtils) obj6;
                        ArrayList arrayList = bundleUtils2.IconCompatParcelizer;
                        ArrayList arrayList2 = bundleUtils.IconCompatParcelizer;
                        if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                            if (arrayList2.size() != arrayList.size()) {
                                return false;
                            }
                            return ((getSdkDebuggerCallbackandroid_sdk_base_release) onContentCardDismissed.read((List) bundleUtils)).write.equals(((getSdkDebuggerCallbackandroid_sdk_base_release) onContentCardDismissed.read((List) bundleUtils2)).write);
                        }
                        i5 = write + 79;
                    }
                    read = i5 % Fields.SpotShadowColor;
                    int i9 = i5 % 2;
                    return zEquals;
                }
            })));
            return;
        }
        LookaheadScope lookaheadScope = (LookaheadScope) obj3;
        ((getMeasurePolicy) lookaheadScope.IconCompatParcelizer).IconCompatParcelizer(lookaheadScope.RatingCompat, this.read, (Exception) obj2, (byte[]) obj, (Map) obj4);
    }

    public AndroidCanvas(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.read = i;
        this.RemoteActionCompatParcelizer = arrayList;
        this.write = arrayList2;
        this.MediaDescriptionCompat = arrayList3;
        this.IconCompatParcelizer = arrayList4;
    }

    public AndroidCanvas(accessgetSaturationcp accessgetsaturationcp, List list, List list2, int i, Runnable runnable) {
        this.IconCompatParcelizer = accessgetsaturationcp;
        this.RemoteActionCompatParcelizer = list;
        this.write = list2;
        this.read = i;
        this.MediaDescriptionCompat = runnable;
    }
}
