package o;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardContainerKt;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.compose.DestinationDetailsKt;
import com.roadrunner.recentdeliveries.presentation.components.CollapsedDeliveryKt;
import io.sentry.SentryUUID;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.accessisRelatedToAutoCommit;
import o.getBrush;
import o.getCieXyz;
import o.getTopStart;
import o.isAppSetIdReadingEnabled;
import o.onMove;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getTabletopm18o9QQ implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getTabletopm18o9QQ(getTopLeftnOccac gettopleftnoccac, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = 2;
        this.IconCompatParcelizer = gettopleftnoccac;
        this.read = z;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.write = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ getTabletopm18o9QQ(getBoolean getboolean, String str, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, String str2, String str3, int i) {
        this.serializer = 4;
        this.RemoteActionCompatParcelizer = getboolean;
        this.IconCompatParcelizer = str;
        this.write = modifier;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = z;
        this.MediaMetadataCompat = str2;
        this.MediaSessionCompatQueueItem = str3;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ getTabletopm18o9QQ(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.serializer = i2;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = z;
        this.IconCompatParcelizer = obj3;
        this.MediaDescriptionCompat = obj4;
        this.MediaMetadataCompat = obj5;
        this.MediaSessionCompatQueueItem = obj6;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ getTabletopm18o9QQ(String str, String str2, String str3, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = 5;
        this.IconCompatParcelizer = str;
        this.MediaDescriptionCompat = str2;
        this.MediaMetadataCompat = str3;
        this.read = z;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ getTabletopm18o9QQ(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2, boolean z, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = 3;
        this.RemoteActionCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.MediaDescriptionCompat = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        this.MediaMetadataCompat = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2;
        this.read = z;
        this.MediaSessionCompatQueueItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        this.write = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x018c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b6  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 75;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        int i5 = this.MediaBrowserCompatMediaItem;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.write;
        Object obj4 = this.RemoteActionCompatParcelizer;
        Object obj5 = this.MediaSessionCompatQueueItem;
        Object obj6 = this.MediaMetadataCompat;
        Object obj7 = this.MediaDescriptionCompat;
        Object obj8 = this.IconCompatParcelizer;
        boolean z = true;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            androidx.compose.material3.IconButtonKt.IconButtonImpl((androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, this.read, (androidx.compose.ui.graphics.Shape) obj8, (androidx.compose.material3.IconButtonColors) obj7, (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj6, (DragAndDropTargetModifierNode) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ((Integer) obj2).getClass();
                ActionableMessageCardContainerKt.serializer((getTopLeftnOccac) obj8, this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            }
            if (i4 == 3) {
                ((Integer) obj2).getClass();
                DestinationDetailsKt.DestinationDetailsContainer((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj8, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj7, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj6, this.read, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            }
            if (i4 != 4) {
                ((Integer) obj2).getClass();
                CollapsedDeliveryKt.CollapsedDelivery((String) obj8, (String) obj7, (String) obj6, this.read, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            }
            ((Integer) obj2).getClass();
            ch.read((getBoolean) obj4, (String) obj8, (androidx.compose.ui.Modifier) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, this.read, (String) obj6, (String) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj3;
        final androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = (androidx.compose.foundation.text.LegacyTextFieldState) obj4;
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8;
        final androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) obj7;
        final androidx.compose.ui.text.input.OffsetMapping offsetMapping = (androidx.compose.ui.text.input.OffsetMapping) obj6;
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) obj5;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            final int i6 = this.MediaBrowserCompatMediaItem;
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    legacyTextFieldState2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(intrinsicMeasureScope.getLayoutDirection());
                    MultiParagraphIntrinsics multiParagraphIntrinsics = legacyTextFieldState2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write;
                    if (multiParagraphIntrinsics != null) {
                        return TextDelegateKt.ceilToIntPx(multiParagraphIntrinsics.getMaxIntrinsicWidth());
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("layoutIntrinsics must be called first");
                    return 0;
                }

                /* JADX WARN: Code duplicated, block: B:49:0x0238  */
                /* JADX WARN: Code duplicated, block: B:76:0x033e  */
                /* JADX WARN: Code duplicated, block: B:78:0x0342  */
                /* JADX WARN: Code duplicated, block: B:79:0x0345  */
                /* JADX WARN: Code duplicated, block: B:81:0x0366  */
                /* JADX WARN: Code duplicated, block: B:84:0x036f  */
                /* JADX WARN: Code duplicated, block: B:85:0x0378  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v2 */
                /* JADX WARN: Type inference failed for: r12v3, types: [int] */
                /* JADX WARN: Type inference failed for: r12v7 */
                /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.text.TextLayoutResult, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v8 */
                /* JADX WARN: Type inference failed for: r1v9 */
                /* JADX WARN: Type inference failed for: r4v16, types: [androidx.compose.ui.unit.Density] */
                /* JADX WARN: Type inference failed for: r4v27, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j) {
                    int i7;
                    boolean z2;
                    TextLayoutResult textLayoutResult;
                    ?? r15;
                    ?? M3045copyO0kMr_c;
                    CoreTextFieldKt$CoreTextField$8$1$1$2 coreTextFieldKt$CoreTextField$8$1$1$2;
                    LegacyTextFieldState legacyTextFieldState2;
                    ?? CeilToIntPx;
                    TextLayoutResultProxy textLayoutResultProxy;
                    LayoutCoordinates layoutCoordinates;
                    long j2 = j;
                    LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                    getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                    getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                    try {
                        TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState3.serializer();
                        setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                        TextLayoutResult textLayoutResult2 = textLayoutResultProxySerializer != null ? textLayoutResultProxySerializer.RemoteActionCompatParcelizer : null;
                        getTopStart gettopstart = legacyTextFieldState3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                        int i8 = gettopstart.IconCompatParcelizer;
                        boolean z3 = gettopstart.MediaBrowserCompatMediaItem;
                        if (textLayoutResult2 != null) {
                            AnnotatedString annotatedString = gettopstart.MediaMetadataCompat;
                            TextStyle textStyle = gettopstart.MediaDescriptionCompat;
                            List list2 = gettopstart.MediaSessionCompatQueueItem;
                            Density density2 = gettopstart.RemoteActionCompatParcelizer;
                            FontFamily.Resolver resolver = gettopstart.serializer;
                            TextLayoutInput layoutInput = textLayoutResult2.getLayoutInput();
                            if (textLayoutResult2.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
                                i7 = Integer.MAX_VALUE;
                                z2 = false;
                            } else {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutInput.getText(), annotatedString}, getCieXyz.write())).booleanValue() && layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle)) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutInput.getPlaceholders(), list2}, getCieXyz.write())).booleanValue()) {
                                        i7 = Integer.MAX_VALUE;
                                        if (layoutInput.getMaxLines() == Integer.MAX_VALUE && layoutInput.getSoftWrap() == z3 && TextOverflow.m3559equalsimpl0(layoutInput.m3043getOverflowgIe3tQ8(), i8)) {
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutInput.getDensity(), density2}, getCieXyz.write())).booleanValue() && layoutInput.getLayoutDirection() == layoutDirection) {
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutInput.getFontFamilyResolver(), resolver}, getCieXyz.write())).booleanValue() && Constraints.m3628getMinWidthimpl(j) == Constraints.m3628getMinWidthimpl(layoutInput.m3042getConstraintsmsEJaDk()) && ((!z3 && !TextOverflow.m3559equalsimpl0(i8, TextOverflow.Companion.m3569getEllipsisgIe3tQ8())) || (Constraints.m3626getMaxWidthimpl(j) == Constraints.m3626getMaxWidthimpl(layoutInput.m3042getConstraintsmsEJaDk()) && Constraints.m3625getMaxHeightimpl(j) == Constraints.m3625getMaxHeightimpl(layoutInput.m3042getConstraintsmsEJaDk())))) {
                                                    TextLayoutResult textLayoutResult3 = textLayoutResult2;
                                                    r15 = 0;
                                                    legacyTextFieldState3 = legacyTextFieldState3;
                                                    textLayoutResultProxySerializer = textLayoutResultProxySerializer;
                                                    M3045copyO0kMr_c = textLayoutResult3.m3045copyO0kMr_c(new TextLayoutInput(textLayoutResult2.getLayoutInput().getText(), gettopstart.MediaDescriptionCompat, textLayoutResult2.getLayoutInput().getPlaceholders(), textLayoutResult2.getLayoutInput().getMaxLines(), textLayoutResult2.getLayoutInput().getSoftWrap(), textLayoutResult2.getLayoutInput().m3043getOverflowgIe3tQ8(), textLayoutResult2.getLayoutInput().getDensity(), textLayoutResult2.getLayoutInput().getLayoutDirection(), textLayoutResult2.getLayoutInput().getFontFamilyResolver(), j, (DefaultConstructorMarker) null), ConstraintsKt.m3640constrain4WqzIAM(j, IntSize.m3839constructorimpl((((long) TextDelegateKt.ceilToIntPx(textLayoutResult3.getMultiParagraph().getHeight())) & 4294967295L) | (((long) TextDelegateKt.ceilToIntPx(textLayoutResult3.getMultiParagraph().getWidth())) << 32))));
                                                    textLayoutResult = textLayoutResult3;
                                                }
                                            }
                                        }
                                    } else {
                                        i7 = Integer.MAX_VALUE;
                                    }
                                    z2 = false;
                                } else {
                                    i7 = Integer.MAX_VALUE;
                                    z2 = false;
                                }
                            }
                            int iM3047getSizeYbymL2g = (int) (M3045copyO0kMr_c.m3047getSizeYbymL2g() >> 32);
                            int iM3047getSizeYbymL2g2 = (int) (M3045copyO0kMr_c.m3047getSizeYbymL2g() & 4294967295L);
                            int iIntValue2 = Integer.valueOf(iM3047getSizeYbymL2g).intValue();
                            int iIntValue3 = Integer.valueOf(iM3047getSizeYbymL2g2).intValue();
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textLayoutResult, M3045copyO0kMr_c}, getCieXyz.write())).booleanValue()) {
                                coreTextFieldKt$CoreTextField$8$1$1$2 = this;
                                legacyTextFieldState2 = legacyTextFieldState3;
                            } else {
                                textLayoutResultProxy = textLayoutResultProxySerializer;
                                if (textLayoutResultProxy != null) {
                                    layoutCoordinates = textLayoutResultProxy.write;
                                } else {
                                    layoutCoordinates = null;
                                }
                                TextLayoutResultProxy textLayoutResultProxy2 = new TextLayoutResultProxy(M3045copyO0kMr_c, layoutCoordinates);
                                legacyTextFieldState2 = legacyTextFieldState3;
                                ((onShowTranslationui) legacyTextFieldState2.MediaSessionCompatToken).setValue(textLayoutResultProxy2);
                                legacyTextFieldState2.MediaSessionCompatQueueItem = r15;
                                coreTextFieldKt$CoreTextField$8$1$1$2 = this;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(M3045copyO0kMr_c);
                                CoreTextFieldKt.read(legacyTextFieldState2, textFieldValue, offsetMapping);
                            }
                            if (i6 == 1) {
                                CeilToIntPx = TextDelegateKt.ceilToIntPx(M3045copyO0kMr_c.getLineBottom(r15));
                            } else {
                                CeilToIntPx = r15;
                            }
                            ((onShowTranslationui) legacyTextFieldState2.PlaybackStateCompatCustomAction).setValue(Dp.m3671boximpl(density.mo45toDpu2uoSUM(CeilToIntPx)));
                            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(M3045copyO0kMr_c.getFirstBaseline())));
                            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(M3045copyO0kMr_c.getLastBaseline())));
                            onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = new onViewAttachedToWindowlambda0[2];
                            onviewattachedtowindowlambda0Arr[r15] = onviewattachedtowindowlambda0;
                            onviewattachedtowindowlambda0Arr[1] = onviewattachedtowindowlambda1;
                            return measureScope.layout(iIntValue2, iIntValue3, onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0Arr), new accessisRelatedToAutoCommit(20));
                        }
                        legacyTextFieldState3 = legacyTextFieldState3;
                        textLayoutResultProxySerializer = textLayoutResultProxySerializer;
                        j2 = j2;
                        i7 = Integer.MAX_VALUE;
                        z2 = false;
                        gettopstart.read(layoutDirection);
                        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
                        int iM3626getMaxWidthimpl = ((z3 || TextOverflow.m3559equalsimpl0(i8, TextOverflow.Companion.m3569getEllipsisgIe3tQ8())) && Constraints.m3622getHasBoundedWidthimpl(j)) ? Constraints.m3626getMaxWidthimpl(j) : i7;
                        int i9 = (z3 || !TextOverflow.m3559equalsimpl0(i8, TextOverflow.Companion.m3569getEllipsisgIe3tQ8())) ? i7 : 1;
                        if (iM3628getMinWidthimpl != iM3626getMaxWidthimpl) {
                            MultiParagraphIntrinsics multiParagraphIntrinsics = gettopstart.write;
                            if (multiParagraphIntrinsics == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("layoutIntrinsics must be called first");
                                return null;
                            }
                            iM3626getMaxWidthimpl = RangesKt.RemoteActionCompatParcelizer(TextDelegateKt.ceilToIntPx(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM3628getMinWidthimpl, iM3626getMaxWidthimpl);
                        }
                        MultiParagraphIntrinsics multiParagraphIntrinsics2 = gettopstart.write;
                        if (multiParagraphIntrinsics2 == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("layoutIntrinsics must be called first");
                            return null;
                        }
                        MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics2, Constraints.Companion.m3635fitPrioritizingWidthZbe2FdA(z2 ? 1 : 0, iM3626getMaxWidthimpl, z2 ? 1 : 0, Constraints.m3625getMaxHeightimpl(j)), i9, gettopstart.IconCompatParcelizer, (DefaultConstructorMarker) null);
                        long jM3640constrain4WqzIAM = ConstraintsKt.m3640constrain4WqzIAM(j2, IntSize.m3839constructorimpl((((long) TextDelegateKt.ceilToIntPx(multiParagraph.getHeight())) & 4294967295L) | (((long) TextDelegateKt.ceilToIntPx(multiParagraph.getWidth())) << 32)));
                        textLayoutResult = textLayoutResult2;
                        M3045copyO0kMr_c = new TextLayoutResult(new TextLayoutInput(gettopstart.MediaMetadataCompat, gettopstart.MediaDescriptionCompat, gettopstart.MediaSessionCompatQueueItem, Integer.MAX_VALUE, gettopstart.MediaBrowserCompatMediaItem, gettopstart.IconCompatParcelizer, gettopstart.RemoteActionCompatParcelizer, layoutDirection, gettopstart.serializer, j, (DefaultConstructorMarker) null), multiParagraph, jM3640constrain4WqzIAM, null);
                        r15 = z2;
                        int iM3047getSizeYbymL2g3 = (int) (M3045copyO0kMr_c.m3047getSizeYbymL2g() >> 32);
                        int iM3047getSizeYbymL2g4 = (int) (M3045copyO0kMr_c.m3047getSizeYbymL2g() & 4294967295L);
                        int iIntValue4 = Integer.valueOf(iM3047getSizeYbymL2g3).intValue();
                        int iIntValue5 = Integer.valueOf(iM3047getSizeYbymL2g4).intValue();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textLayoutResult, M3045copyO0kMr_c}, getCieXyz.write())).booleanValue()) {
                            textLayoutResultProxy = textLayoutResultProxySerializer;
                            if (textLayoutResultProxy != null) {
                                layoutCoordinates = textLayoutResultProxy.write;
                            } else {
                                layoutCoordinates = null;
                            }
                            TextLayoutResultProxy textLayoutResultProxy3 = new TextLayoutResultProxy(M3045copyO0kMr_c, layoutCoordinates);
                            legacyTextFieldState2 = legacyTextFieldState3;
                            ((onShowTranslationui) legacyTextFieldState2.MediaSessionCompatToken).setValue(textLayoutResultProxy3);
                            legacyTextFieldState2.MediaSessionCompatQueueItem = r15;
                            coreTextFieldKt$CoreTextField$8$1$1$2 = this;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(M3045copyO0kMr_c);
                            CoreTextFieldKt.read(legacyTextFieldState2, textFieldValue, offsetMapping);
                        } else {
                            coreTextFieldKt$CoreTextField$8$1$1$2 = this;
                            legacyTextFieldState2 = legacyTextFieldState3;
                        }
                        if (i6 == 1) {
                            CeilToIntPx = TextDelegateKt.ceilToIntPx(M3045copyO0kMr_c.getLineBottom(r15));
                        } else {
                            CeilToIntPx = r15;
                        }
                        ((onShowTranslationui) legacyTextFieldState2.PlaybackStateCompatCustomAction).setValue(Dp.m3671boximpl(density.mo45toDpu2uoSUM(CeilToIntPx)));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(M3045copyO0kMr_c.getFirstBaseline())));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(M3045copyO0kMr_c.getLastBaseline())));
                        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr2 = new onViewAttachedToWindowlambda0[2];
                        onviewattachedtowindowlambda0Arr2[r15] = onviewattachedtowindowlambda2;
                        onviewattachedtowindowlambda0Arr2[1] = onviewattachedtowindowlambda3;
                        return measureScope.layout(iIntValue4, iIntValue5, onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0Arr2), new accessisRelatedToAutoCommit(20));
                    } catch (Throwable th) {
                        setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                        throw th;
                    }
                }
            };
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, companion);
            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj9 = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            AndroidContentCaptureManagerCompanion.write(getpostalcode, measurePolicy, companion2.getSetMeasurePolicy());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion2.getSetResolvedCompositionLocals());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.IconCompatParcelizer(true);
            alignKFBX0sM alignkfbx0smIconCompatParcelizer = legacyTextFieldState.IconCompatParcelizer();
            alignKFBX0sM alignkfbx0sm = alignKFBX0sM.None;
            boolean z2 = this.read;
            if (alignkfbx0smIconCompatParcelizer == alignkfbx0sm || legacyTextFieldState.read() == null) {
                z = false;
            } else {
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = legacyTextFieldState.read();
                layoutCoordinates.getClass();
                if (layoutCoordinates.isAttached() && z2) {
                    int i7 = RatingCompat + 101;
                    PlaybackStateCompatCustomAction = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    z = false;
                }
            }
            androidx.compose.foundation.text.CoreTextFieldKt.IconCompatParcelizer(textFieldSelectionManager, z, getpostalcode, 0);
            if (legacyTextFieldState.IconCompatParcelizer() == alignKFBX0sM.Cursor) {
                int i9 = PlaybackStateCompatCustomAction + 17;
                RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    obj9.hashCode();
                    throw null;
                }
                if (z2) {
                    getpostalcode.serializer(-714666198);
                    androidx.compose.foundation.text.CoreTextFieldKt.IconCompatParcelizer(textFieldSelectionManager, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-714589318);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.serializer(-714589318);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
