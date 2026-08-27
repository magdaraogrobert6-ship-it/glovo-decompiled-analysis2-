package androidx.compose.foundation.layout;

import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import o.ModalBottomSheetKtModalBottomSheet51;
import o.TextFieldMeasurePolicy;
import o.TextKt;
import o.TextNvy7gAk;
import o.ThumbNodeonAttach11;
import o.TooltipPositionProviderImpl;
import o.emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseObserveNavigationCrowdsourcingobserveGeofenceCrossedinlinedmap12;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class SizeKt {
    public static final TooltipPositionProviderImpl IconCompatParcelizer;
    public static final TooltipPositionProviderImpl MediaBrowserCompatMediaItem;
    public static final TooltipPositionProviderImpl MediaDescriptionCompat;
    public static final TooltipPositionProviderImpl MediaMetadataCompat;
    public static final TooltipPositionProviderImpl RatingCompat;
    public static final FillElement RemoteActionCompatParcelizer;
    public static final FillElement read;
    public static final FillElement serializer;
    public static final TooltipPositionProviderImpl write;

    static {
        ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet51 = ModalBottomSheetKtModalBottomSheet51.Horizontal;
        serializer = new FillElement(modalBottomSheetKtModalBottomSheet51, 1.0f, "fillMaxWidth");
        ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet52 = ModalBottomSheetKtModalBottomSheet51.Vertical;
        RemoteActionCompatParcelizer = new FillElement(modalBottomSheetKtModalBottomSheet52, 1.0f, "fillMaxHeight");
        ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet53 = ModalBottomSheetKtModalBottomSheet51.Both;
        read = new FillElement(modalBottomSheetKtModalBottomSheet53, 1.0f, "fillMaxSize");
        int i = TooltipPositionProviderImpl.IconCompatParcelizer;
        Alignment.Companion companion = Alignment.Companion;
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        int i2 = 1;
        MediaMetadataCompat = new TooltipPositionProviderImpl(modalBottomSheetKtModalBottomSheet51, false, new Updater$$ExternalSyntheticLambda1(i2, centerHorizontally), centerHorizontally, "wrapContentWidth");
        Alignment.Horizontal start = companion.getStart();
        MediaDescriptionCompat = new TooltipPositionProviderImpl(modalBottomSheetKtModalBottomSheet51, false, new Updater$$ExternalSyntheticLambda1(i2, start), start, "wrapContentWidth");
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        int i3 = 2;
        write = new TooltipPositionProviderImpl(modalBottomSheetKtModalBottomSheet52, false, new Updater$$ExternalSyntheticLambda1(i3, centerVertically), centerVertically, "wrapContentHeight");
        Alignment.Vertical top = companion.getTop();
        IconCompatParcelizer = new TooltipPositionProviderImpl(modalBottomSheetKtModalBottomSheet52, false, new Updater$$ExternalSyntheticLambda1(i3, top), top, "wrapContentHeight");
        Alignment center = companion.getCenter();
        int i4 = 3;
        MediaBrowserCompatMediaItem = new TooltipPositionProviderImpl(modalBottomSheetKtModalBottomSheet53, false, new Updater$$ExternalSyntheticLambda1(i4, center), center, "wrapContentSize");
        Alignment topStart = companion.getTopStart();
        RatingCompat = new TooltipPositionProviderImpl(modalBottomSheetKtModalBottomSheet53, false, new Updater$$ExternalSyntheticLambda1(i4, topStart), topStart, "wrapContentSize");
    }

    /* JADX INFO: renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m75height3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new TextFieldMeasurePolicy(0.0f, f, 0.0f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextNvy7gAk(f, 1) : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    public static Modifier read(Modifier modifier) {
        TooltipPositionProviderImpl tooltipPositionProviderImpl;
        Alignment.Companion companion = Alignment.Companion;
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{centerHorizontally, companion.getCenterHorizontally()}, getCieXyz.write())).booleanValue()) {
            tooltipPositionProviderImpl = MediaMetadataCompat;
        } else {
            tooltipPositionProviderImpl = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{centerHorizontally, companion.getStart()}, getCieXyz.write())).booleanValue() ? MediaDescriptionCompat : new TooltipPositionProviderImpl(ModalBottomSheetKtModalBottomSheet51.Horizontal, false, new Updater$$ExternalSyntheticLambda1(1, centerHorizontally), centerHorizontally, "wrapContentWidth");
        }
        return modifier.then(tooltipPositionProviderImpl);
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static Modifier m77requiredHeightInVpY3zN4$default(Modifier modifier, float f) {
        float fM3693getUnspecifiedD9Ej5fM = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        return modifier.then(new TextFieldMeasurePolicy(0.0f, f, 0.0f, fM3693getUnspecifiedD9Ej5fM, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextKt(f, fM3693getUnspecifiedD9Ej5fM, 2) : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    /* JADX INFO: renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m81requiredWidth3ABfNKs(Modifier.Companion companion, float f) {
        return companion.then(new TextFieldMeasurePolicy(f, 0.0f, f, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextNvy7gAk(f, 3) : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static Modifier m82requiredWidthInVpY3zN4$default(Modifier.Companion companion, float f) {
        float fM3693getUnspecifiedD9Ej5fM = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        return companion.then(new TextFieldMeasurePolicy(f, 0.0f, fM3693getUnspecifiedD9Ej5fM, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextKt(f, fM3693getUnspecifiedD9Ej5fM, 4) : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    public static final Modifier serializer(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        TooltipPositionProviderImpl tooltipPositionProviderImpl;
        Alignment.Companion companion = Alignment.Companion;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{vertical, companion.getCenterVertically()}, getCieXyz.write())).booleanValue() || z) {
            tooltipPositionProviderImpl = (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{vertical, companion.getTop()}, getCieXyz.write())).booleanValue() || z) ? new TooltipPositionProviderImpl(ModalBottomSheetKtModalBottomSheet51.Vertical, z, new Updater$$ExternalSyntheticLambda1(2, vertical), vertical, "wrapContentHeight") : IconCompatParcelizer;
        } else {
            tooltipPositionProviderImpl = write;
        }
        return modifier.then(tooltipPositionProviderImpl);
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m85sizeInqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new TextFieldMeasurePolicy(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ThumbNodeonAttach11(f, f2, f3, f4, 0) : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m86width3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new TextFieldMeasurePolicy(f, 0.0f, f, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextNvy7gAk(f, 4) : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    public static final Modifier write(Modifier modifier, float f, float f2) {
        return modifier.then(new emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseObserveNavigationCrowdsourcingobserveGeofenceCrossedinlinedmap12(f, f2));
    }

    public static Modifier IconCompatParcelizer(Modifier modifier, Alignment alignment, int i) {
        TooltipPositionProviderImpl tooltipPositionProviderImpl;
        Alignment center = (i & 1) != 0 ? Alignment.Companion.getCenter() : alignment;
        Alignment.Companion companion = Alignment.Companion;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{center, companion.getCenter()}, getCieXyz.write())).booleanValue()) {
            tooltipPositionProviderImpl = MediaBrowserCompatMediaItem;
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{center, companion.getTopStart()}, getCieXyz.write())).booleanValue()) {
                tooltipPositionProviderImpl = RatingCompat;
            } else {
                tooltipPositionProviderImpl = new TooltipPositionProviderImpl(ModalBottomSheetKtModalBottomSheet51.Both, false, new Updater$$ExternalSyntheticLambda1(3, center), center, "wrapContentSize");
            }
        }
        return modifier.then(tooltipPositionProviderImpl);
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static Modifier m76heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM noInspectorInfo;
        if ((i & 1) != 0) {
            f = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        float f3 = f;
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        float f4 = f2;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TextKt(f3, f4, 1);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new TextFieldMeasurePolicy(0.0f, f3, 0.0f, f4, true, noInspectorInfo, 5));
    }

    public static /* synthetic */ Modifier read(Modifier.Companion companion, float f, float f2, float f3, int i) {
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        return m85sizeInqDBjuR0(companion, f, f2, f3, Dp.Companion.m3693getUnspecifiedD9Ej5fM());
    }

    public static /* synthetic */ Modifier read(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        return write(modifier, f, f2);
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static Modifier m80requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM noInspectorInfo;
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ThumbNodeonAttach11(f, f2, f3, f4, 1);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new TextFieldMeasurePolicy(f, f2, f3, f4, false, noInspectorInfo));
    }

    public static /* synthetic */ Modifier serializer(Modifier modifier, Alignment.Vertical vertical, int i) {
        if ((i & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        return serializer(modifier, vertical, false);
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static Modifier m87widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM noInspectorInfo;
        if ((i & 1) != 0) {
            f = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        float f3 = f;
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        float f4 = f2;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TextKt(f3, f4, 5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new TextFieldMeasurePolicy(f3, 0.0f, f4, 0.0f, true, noInspectorInfo, 10));
    }

    public static final Modifier serializer(Modifier modifier, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = RemoteActionCompatParcelizer;
        } else {
            fillElement = new FillElement(ModalBottomSheetKtModalBottomSheet51.Vertical, f, "fillMaxHeight");
        }
        return modifier.then(fillElement);
    }

    public static final Modifier write(Modifier modifier, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = serializer;
        } else {
            fillElement = new FillElement(ModalBottomSheetKtModalBottomSheet51.Horizontal, f, "fillMaxWidth");
        }
        return modifier.then(fillElement);
    }

    /* JADX INFO: renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m78requiredSize3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new TextFieldMeasurePolicy(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextNvy7gAk(f, 2) : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m79requiredSizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new TextFieldMeasurePolicy(f, f2, f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextKt(f, f2, 3) : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m83size3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new TextFieldMeasurePolicy(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextNvy7gAk(f, 0) : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m84sizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new TextFieldMeasurePolicy(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextKt(f, f2, 0) : InspectableValueKt.getNoInspectorInfo()));
    }
}
