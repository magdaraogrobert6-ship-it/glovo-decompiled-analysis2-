package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.internal.base.zas;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.Timestamp;
import com.huawei.location.logic.zp;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.accessgetNumPad2cp;
import o.accessgetNumPad8cp;
import o.accessgetNumPadPageUpcp;
import o.accessgetSystemNavigationDowncp;
import o.accessremovePointerInputModifierNode;
import o.addHitPathQJqDSyo;
import o.colorResource;
import o.getScaledHandwritingSlop;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OptionalModuleUtils {
    public static final addHitPathQJqDSyo IconCompatParcelizer;
    public static final addHitPathQJqDSyo RemoteActionCompatParcelizer;
    public static final Feature read;
    public static final Feature serializer;
    public static final Feature[] write = new Feature[0];

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        read = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        serializer = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        zp zpVar = new zp();
        zpVar.write("barcode", feature);
        zpVar.write("custom_ica", feature2);
        zpVar.write("face", feature3);
        zpVar.write("ica", feature4);
        zpVar.write("ocr", feature5);
        zpVar.write("langid", feature6);
        zpVar.write("nlclassifier", feature7);
        zpVar.write("tflite_dynamite", feature8);
        zpVar.write("barcode_ui", feature9);
        zpVar.write("smart_reply", feature10);
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode = (accessremovePointerInputModifierNode) zpVar.IconCompatParcelizer;
        if (accessremovepointerinputmodifiernode != null) {
            throw accessremovepointerinputmodifiernode.write();
        }
        addHitPathQJqDSyo addhitpathqjqdsyo = addHitPathQJqDSyo.read(zpVar.write, (Object[]) zpVar.serializer, zpVar);
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode2 = (accessremovePointerInputModifierNode) zpVar.IconCompatParcelizer;
        if (accessremovepointerinputmodifiernode2 != null) {
            throw accessremovepointerinputmodifiernode2.write();
        }
        RemoteActionCompatParcelizer = addhitpathqjqdsyo;
        zp zpVar2 = new zp();
        zpVar2.write("com.google.android.gms.vision.barcode", feature);
        zpVar2.write("com.google.android.gms.vision.custom.ica", feature2);
        zpVar2.write("com.google.android.gms.vision.face", feature3);
        zpVar2.write("com.google.android.gms.vision.ica", feature4);
        zpVar2.write("com.google.android.gms.vision.ocr", feature5);
        zpVar2.write("com.google.android.gms.mlkit.langid", feature6);
        zpVar2.write("com.google.android.gms.mlkit.nlclassifier", feature7);
        zpVar2.write("com.google.android.gms.tflite_dynamite", feature8);
        zpVar2.write("com.google.android.gms.mlkit_smartreply", feature10);
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode3 = (accessremovePointerInputModifierNode) zpVar2.IconCompatParcelizer;
        if (accessremovepointerinputmodifiernode3 != null) {
            throw accessremovepointerinputmodifiernode3.write();
        }
        addHitPathQJqDSyo addhitpathqjqdsyo2 = addHitPathQJqDSyo.read(zpVar2.write, (Object[]) zpVar2.serializer, zpVar2);
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode4 = (accessremovePointerInputModifierNode) zpVar2.IconCompatParcelizer;
        if (accessremovepointerinputmodifiernode4 != null) {
            throw accessremovepointerinputmodifiernode4.write();
        }
        IconCompatParcelizer = addhitpathqjqdsyo2;
    }

    public static void RemoteActionCompatParcelizer(Context context, List list) {
        zzw zzwVarRemoteActionCompatParcelizer;
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        Feature[] featureArr = read(RemoteActionCompatParcelizer, list);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        arrayList.add(new getScaledHandwritingSlop(featureArr, 0));
        accessgetSystemNavigationDowncp.write("APIs must not be empty.", !arrayList.isEmpty());
        zay zayVar = new zay(context, null, zay.IconCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
        ApiFeatureRequest apiFeatureRequestSerializer = ApiFeatureRequest.serializer(arrayList, true);
        if (apiFeatureRequestSerializer.read.isEmpty()) {
            zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(new ModuleInstallResponse(0, false));
        } else {
            TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
            taskApiCall$BuilderIconCompatParcelizer.read = new Feature[]{zas.write};
            taskApiCall$BuilderIconCompatParcelizer.IconCompatParcelizer = true;
            taskApiCall$BuilderIconCompatParcelizer.serializer = true;
            taskApiCall$BuilderIconCompatParcelizer.write = 27304;
            taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new colorResource(zayVar, apiFeatureRequestSerializer, z, 22);
            zzwVarRemoteActionCompatParcelizer = zayVar.read(0, taskApiCall$BuilderIconCompatParcelizer.read());
        }
        zzwVarRemoteActionCompatParcelizer.addOnFailureListener(new Timestamp.Companion(0));
    }

    public static Feature[] read(addHitPathQJqDSyo addhitpathqjqdsyo, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Feature feature = (Feature) addhitpathqjqdsyo.get(list.get(i));
            accessgetSystemNavigationDowncp.IconCompatParcelizer(feature);
            featureArr[i] = feature;
        }
        return featureArr;
    }
}
