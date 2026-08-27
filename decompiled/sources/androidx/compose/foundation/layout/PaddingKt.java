package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import o.SwitchDefaults;
import o.SwitchImpl;
import o.SwitchKt;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class PaddingKt {
    /* JADX INFO: renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static SwitchDefaults m72PaddingValuesa9UjIt4$default(int i, float f, float f2, float f3) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
        if ((i & 2) != 0) {
            f = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f3 = Dp.m3673constructorimpl(0.0f);
        }
        return new SwitchDefaults(fM3673constructorimpl, f, f2, f3);
    }

    public static final SwitchDefaults IconCompatParcelizer(float f, float f2, float f3, float f4) {
        return new SwitchDefaults(f, f2, f3, f4);
    }

    public static final float IconCompatParcelizer(SwitchKt switchKt, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? switchKt.write(layoutDirection) : switchKt.read(layoutDirection);
    }

    public static final Modifier RemoteActionCompatParcelizer(Modifier modifier, final float f, final float f2) {
        return modifier.then(new PaddingElement(f, f2, f, f2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.SnackbarKtOneRowSnackbar21
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
                inspectorInfo.setName("padding");
                MediaSessionCompatQueueItem.serializer(f, inspectorInfo.getProperties(), "horizontal", inspectorInfo).set("vertical", androidx.compose.ui.unit.Dp.m3671boximpl(f2));
                return createFromParcel.INSTANCE;
            }
        }));
    }

    public static final Modifier read(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.SurfaceKtSurface1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
                inspectorInfo.setName("padding");
                MediaSessionCompatQueueItem.serializer(f3, MediaSessionCompatQueueItem.serializer(f2, MediaSessionCompatQueueItem.serializer(f, inspectorInfo.getProperties(), "start", inspectorInfo), "top", inspectorInfo), "end", inspectorInfo).set("bottom", androidx.compose.ui.unit.Dp.m3671boximpl(f4));
                return createFromParcel.INSTANCE;
            }
        }));
    }

    public static final float serializer(SwitchKt switchKt, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? switchKt.read(layoutDirection) : switchKt.write(layoutDirection);
    }

    public static final Modifier write(Modifier modifier, final float f) {
        return modifier.then(new PaddingElement(f, f, f, f, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.SurfaceT9BRK9s
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m3671boximpl(f));
                return createFromParcel.INSTANCE;
            }
        }));
    }

    public static final Modifier IconCompatParcelizer(Modifier modifier, SwitchKt switchKt) {
        return modifier.then(new SwitchImpl(switchKt, new RoomDatabase$$ExternalSyntheticLambda2(3, switchKt)));
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static SwitchDefaults m71PaddingValuesYgX7TsA$default(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m3673constructorimpl(0.0f);
        }
        return new SwitchDefaults(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m73paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m3673constructorimpl(0.0f);
        }
        return RemoteActionCompatParcelizer(modifier, f, f2);
    }

    /* JADX INFO: renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m74paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m3673constructorimpl(0.0f);
        }
        return read(modifier, f, f2, f3, f4);
    }
}
