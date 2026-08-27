package com.mapbox.navigator;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class DetectedObjectKt {
    public static final /* synthetic */ DetectedObject detectedObject(long j, String str, DetectedObjectCategory detectedObjectCategory, Point3d point3d, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        detectedObjectCategory.getClass();
        point3d.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        DetectedObject.Builder builder = new DetectedObject.Builder(j, str, detectedObjectCategory, point3d);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ DetectedObject detectedObject$default(long j, String str, DetectedObjectCategory detectedObjectCategory, Point3d point3d, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 16) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.DetectedObjectKt.detectedObject.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DetectedObject.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(DetectedObject.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return detectedObject(j, str, detectedObjectCategory, point3d, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
