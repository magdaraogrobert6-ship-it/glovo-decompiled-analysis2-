package androidx.compose.foundation.lazy;

import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.pager.PagerState$scrollToPage$2;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.BlockRunner$cancel$1;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.n$$ExternalSyntheticLambda3;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda26;
import com.huawei.location.logic.E5;
import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.navigation.core.MapboxNavigation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.ranges.RangesKt;
import o.AbstractApplier;
import o.AnchoredDraggableKt;
import o.AnchoredDraggableKtanchoredDraggable1;
import o.AnchoredDraggableKtanchoredDraggable11;
import o.AnchoredDraggableStatedraggableState1drag2;
import o.AndroidContentCaptureManager;
import o.BackspaceCommand;
import o.BaselineButtonTokens;
import o.BasicTooltipBox;
import o.BasicTooltipKtanchorSemantics111;
import o.BrazeContentCardsManager;
import o.BrazeContentCardsManagerCompanion;
import o.CheckboxTokens;
import o.CircularProgressIndicatorTokens;
import o.ContextMenuScope;
import o.DefaultPagerNestedScrollConnection;
import o.DraggableAnchorsNode;
import o.ExtendedFabPrimaryTokens;
import o.ExtendedFabSmallTokens;
import o.FabBaselineTokens;
import o.MotionEventAdapterIndirectPointerEventData;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PullToRefreshModifierNodeupdate1;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.SmallIconButtonTokens;
import o.SwitchKt;
import o.TriStateCheckbox;
import o.UpdatableAnimationState;
import o.accessisRelatedToAutoCommit;
import o.applyMeasureResultfoundation;
import o.constructorimpl;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBirthDateFull;
import o.getBrush;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPersonLastName;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getUptimeimpl;
import o.instance_delegatelambda0;
import o.isAppSetIdReadingEnabled;
import o.isNotGestureActionfoundation;
import o.moveBydefault;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onHideTranslationui;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda7;
import o.removeNodeAtDepth;
import o.setNativeShader;
import o.settle;
import o.up;

/* JADX INFO: loaded from: classes.dex */
public abstract class LazyListKt {
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:136:0x018b  */
    /* JADX WARN: Code duplicated, block: B:137:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0191  */
    /* JADX WARN: Code duplicated, block: B:140:0x0195 A[PHI: r2 r3 r5 r7
  0x0195: PHI (r2v39 int) = (r2v15 int), (r2v40 int) binds: [B:138:0x018f, B:127:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x0195: PHI (r3v55 androidx.compose.ui.Alignment$Vertical) = (r3v6 androidx.compose.ui.Alignment$Vertical), (r3v57 androidx.compose.ui.Alignment$Vertical) binds: [B:138:0x018f, B:127:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x0195: PHI (r5v21 androidx.compose.ui.Alignment$Horizontal) = (r5v3 androidx.compose.ui.Alignment$Horizontal), (r5v23 androidx.compose.ui.Alignment$Horizontal) binds: [B:138:0x018f, B:127:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x0195: PHI (r7v12 androidx.compose.foundation.layout.Arrangement$Vertical) = 
  (r7v3 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r7v13 androidx.compose.foundation.layout.Arrangement$Vertical)
 binds: [B:138:0x018f, B:127:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:155:0x0219  */
    /* JADX WARN: Code duplicated, block: B:157:0x021f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0230  */
    /* JADX WARN: Code duplicated, block: B:165:0x0236  */
    /* JADX WARN: Code duplicated, block: B:171:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0246  */
    /* JADX WARN: Code duplicated, block: B:175:0x0257  */
    /* JADX WARN: Code duplicated, block: B:178:0x027a  */
    /* JADX WARN: Code duplicated, block: B:179:0x027d  */
    /* JADX WARN: Code duplicated, block: B:182:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:184:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:192:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:206:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:208:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:214:0x0305  */
    /* JADX WARN: Code duplicated, block: B:216:0x030b  */
    /* JADX WARN: Code duplicated, block: B:222:0x031d  */
    /* JADX WARN: Code duplicated, block: B:224:0x0323  */
    /* JADX WARN: Code duplicated, block: B:230:0x0335  */
    /* JADX WARN: Code duplicated, block: B:232:0x033b  */
    /* JADX WARN: Code duplicated, block: B:238:0x034f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0355  */
    /* JADX WARN: Code duplicated, block: B:246:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x0388  */
    /* JADX WARN: Code duplicated, block: B:252:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:253:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:256:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:260:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:270:0x0405  */
    /* JADX WARN: Code duplicated, block: B:272:0x0452  */
    /* JADX WARN: Code duplicated, block: B:275:0x0468  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    public static final void LazyList(final Modifier modifier, final LazyListState lazyListState, final SwitchKt switchKt, final boolean z, final constructorimpl constructorimplVar, final boolean z2, final isNotGestureActionfoundation isnotgestureactionfoundation, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        getPostalCode getpostalcode;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i6;
        Alignment.Horizontal horizontal5;
        Arrangement.Vertical vertical5;
        Alignment.Vertical vertical6;
        Alignment.Vertical vertical7;
        Alignment.Horizontal horizontal6;
        Arrangement.Horizontal horizontal7;
        int i7;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer;
        boolean z4;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        final registerInAppMessageManagerlambda7 registerinappmessagemanagerlambda7;
        boolean z5;
        boolean z6;
        Object objComponentActivity2;
        Object objComponentActivity3;
        final getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        final GraphicsContext graphicsContext;
        DraggableAnchorsNode draggableAnchorsNode;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        boolean z10;
        boolean z11;
        boolean z12;
        final Alignment.Horizontal horizontal8;
        boolean z13;
        Alignment.Vertical vertical8;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Arrangement.Vertical vertical9;
        Object objComponentActivity4;
        final Arrangement.Vertical vertical10;
        AndroidContentCaptureManager androidContentCaptureManager2;
        boolean z18;
        SelectionHandleIcon selectionHandleIcon;
        SelectionHandleIcon selectionHandleIcon2;
        LazyListState lazyListState2;
        Modifier modifierIconCompatParcelizer;
        int i10;
        boolean z19;
        boolean z20;
        Object objComponentActivity5;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(924924659);
        if ((i & 6) == 0) {
            i4 = (getpostalcode2.read(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= getpostalcode2.read(lazyListState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode2.read(switchKt) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i11 = i & 3072;
        int i12 = Fields.RotationZ;
        if (i11 == 0) {
            i4 |= getpostalcode2.write(false) ? Fields.CameraDistance : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= getpostalcode2.write(z) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= getpostalcode2.read(constructorimplVar) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= getpostalcode2.write(z2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i4 |= getpostalcode2.read(isnotgestureactionfoundation) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i13 = i3 & Fields.RotationY;
        if (i13 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= getpostalcode2.read(horizontal) ? 536870912 : 268435456;
        }
        int i14 = i3 & Fields.RotationZ;
        if (i14 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (getpostalcode2.read(vertical) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i15 = i3 & Fields.CameraDistance;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= getpostalcode2.read(vertical2) ? 32 : 16;
        }
        int i16 = i5;
        int i17 = i3 & Fields.TransformOrigin;
        if (i17 == 0) {
            if ((i2 & 384) == 0) {
                i16 |= getpostalcode2.read(horizontal2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i2 & 3072) == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i12 = Fields.CameraDistance;
                }
                i16 |= i12;
            }
            if ((306783379 & i4) == 306783378 || (i16 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode2.write(i4 & 1, z3)) {
                getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode2.PlaybackStateCompat()) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i6 = i4 & (-234881025);
                    horizontal5 = horizontal;
                    vertical5 = vertical;
                    vertical6 = vertical2;
                } else {
                    i6 = i4 & (-234881025);
                    if (i13 != 0) {
                        horizontal5 = null;
                    } else {
                        horizontal5 = horizontal;
                    }
                    if (i14 != 0) {
                        vertical5 = null;
                    } else {
                        vertical5 = vertical;
                    }
                    if (i15 != 0) {
                        vertical6 = null;
                    } else {
                        vertical6 = vertical2;
                    }
                    if (i17 != 0) {
                        vertical7 = vertical6;
                        horizontal6 = horizontal5;
                        horizontal7 = null;
                    }
                    getpostalcode2.RemoteActionCompatParcelizer();
                    int i18 = i6 >> 3;
                    i7 = i18 & 14;
                    int i19 = i7 | ((i16 >> 6) & 112);
                    populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode2);
                    z4 = (((i19 & 14) ^ 6) <= 4 && getpostalcode2.read(lazyListState)) || (i19 & 6) == 4;
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!z4 || objComponentActivity == androidContentCaptureManager) {
                        AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable1 = new AnchoredDraggableKtanchoredDraggable1();
                        anchoredDraggableKtanchoredDraggable1.RemoteActionCompatParcelizer = CompositionKt.read(Integer.MAX_VALUE);
                        anchoredDraggableKtanchoredDraggable1.serializer = CompositionKt.read(Integer.MAX_VALUE);
                        AndroidContentCaptureManager androidContentCaptureManager3 = AndroidContentCaptureManager.read;
                        objComponentActivity = new MapboxNavigation.AnonymousClass10(0, 1, onViewAttachedToWindow.class, CompositionKt.serializer(androidContentCaptureManager3, new n$$ExternalSyntheticLambda3(CompositionKt.serializer(androidContentCaptureManager3, new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7Serializer, 1)), lazyListState, anchoredDraggableKtanchoredDraggable1, 2)), "value", "getValue()Ljava/lang/Object;");
                        getpostalcode2.write(objComponentActivity);
                    }
                    registerinappmessagemanagerlambda7 = (registerInAppMessageManagerlambda7) objComponentActivity;
                    int i20 = i6 >> 9;
                    int i21 = i7 | (i20 & 112);
                    z5 = (((i21 & 14) ^ 6) <= 4 && getpostalcode2.read(lazyListState)) || (i21 & 6) == 4;
                    z6 = (((i21 & 112) ^ 48) <= 32 && getpostalcode2.write(z)) || (i21 & 48) == 32;
                    objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (!(z6 | z5) || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new SmallIconButtonTokens(z) { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                            public final /* synthetic */ boolean IconCompatParcelizer;
                            public final getPersonLastName write;

                            @Override // o.SmallIconButtonTokens
                            public final CollectionInfo serializer() {
                                boolean z21 = this.IconCompatParcelizer;
                                getPersonLastName getpersonlastname = this.write;
                                return z21 ? new CollectionInfo(((Number) getpersonlastname.getValue()).intValue(), 1) : new CollectionInfo(1, ((Number) getpersonlastname.getValue()).intValue());
                            }

                            @Override // o.SmallIconButtonTokens
                            public final int IconCompatParcelizer() {
                                LazyListState lazyListState3 = this.serializer;
                                return (-((LazyListMeasureResult) lazyListState3.serializer()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys) + ((LazyListMeasureResult) lazyListState3.serializer()).write;
                            }

                            @Override // o.SmallIconButtonTokens
                            public final float RemoteActionCompatParcelizer() {
                                LazyListState lazyListState3 = this.serializer;
                                int iMediaSessionCompatQueueItem = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem();
                                int iMediaDescriptionCompat = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                                return lazyListState3.write() ? (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat + 100.0f : (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat;
                            }

                            @Override // o.SmallIconButtonTokens
                            public final float read() {
                                LazyListState lazyListState3 = this.serializer;
                                return (lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem() * Constant.ERROR_UNKNOWN) + lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                            }

                            @Override // o.SmallIconButtonTokens
                            public final Object scrollToItem(int i22, PagerState$scrollToPage$2 pagerState$scrollToPage$2) {
                                CardView$1 cardView$1 = LazyListState.read;
                                LazyListState lazyListState3 = this.serializer;
                                lazyListState3.getClass();
                                Object objScroll = lazyListState3.scroll(applyMeasureResultfoundation.Default, new BlockRunner$cancel$1(lazyListState3, i22, (ShortNewsContentCardView) null), pagerState$scrollToPage$2);
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                if (objScroll != coroutineSingletons) {
                                    objScroll = createfromparcel;
                                }
                                return objScroll == coroutineSingletons ? objScroll : createfromparcel;
                            }

                            @Override // o.SmallIconButtonTokens
                            public final int write() {
                                LazyListState lazyListState3 = this.serializer;
                                return (int) (((LazyListMeasureResult) lazyListState3.serializer()).MediaSessionCompatToken == SelectionHandleIcon.Vertical ? ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() & 4294967295L : ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() >> 32);
                            }

                            {
                                this.IconCompatParcelizer = z;
                                this.write = CompositionKt.serializer(new AnchoredDraggableStatedraggableState1drag2(this.serializer, 0));
                            }
                        };
                        getpostalcode2.write(objComponentActivity2);
                    }
                    SmallIconButtonTokens smallIconButtonTokens = (SmallIconButtonTokens) objComponentActivity2;
                    objComponentActivity3 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                        getpostalcode2.write(objComponentActivity3);
                    }
                    getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity3;
                    graphicsContext = (GraphicsContext) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalGraphicsContext());
                    if (((Boolean) getpostalcode2.write(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                        draggableAnchorsNode = null;
                    } else {
                        draggableAnchorsNode = up.IconCompatParcelizer;
                    }
                    int i22 = i16 << 18;
                    i8 = (i6 & 65520) | (i20 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i16 << 27) & 1879048192);
                    z7 = (((i8 & 112) ^ 48) <= 32 && getpostalcode2.read(lazyListState)) || (i8 & 48) == 32;
                    z8 = (((i8 & 896) ^ 384) <= 256 && getpostalcode2.read(switchKt)) || (i8 & 384) == 256;
                    z9 = (((i8 & 7168) ^ 3072) <= 2048 && getpostalcode2.write(false)) || (i8 & 3072) == 2048;
                    if ((((57344 & i8) ^ 24576) > 16384 || !getpostalcode2.write(z)) && (i8 & 24576) != 16384) {
                        i9 = 0;
                        z10 = false;
                    } else {
                        i9 = 0;
                        z10 = true;
                    }
                    z11 = getpostalcode2.read(i9);
                    z12 = (((i8 & 3670016) ^ 1572864) <= 1048576 && getpostalcode2.read(horizontal6)) || (i8 & 1572864) == 1048576;
                    horizontal8 = horizontal6;
                    z13 = (((29360128 & i8) ^ 12582912) <= 8388608 && getpostalcode2.read(vertical7)) || (i8 & 12582912) == 8388608;
                    vertical8 = vertical7;
                    z14 = (((234881024 & i8) ^ 100663296) <= 67108864 && getpostalcode2.read(horizontal7)) || (i8 & 100663296) == 67108864;
                    horizontal4 = horizontal7;
                    z15 = (((1879048192 & i8) ^ 805306368) <= 536870912 && getpostalcode2.read(vertical5)) || (i8 & 805306368) == 536870912;
                    z16 = getpostalcode2.read(graphicsContext);
                    z17 = getpostalcode2.read(draggableAnchorsNode);
                    vertical9 = vertical5;
                    objComponentActivity4 = getpostalcode2.ComponentActivity();
                    if ((!(z12 | z8 | z7 | z9 | z10 | z11 | z13 | z14 | z15 | z16) && !z17) || objComponentActivity4 == androidContentCaptureManager) {
                        vertical4 = vertical8;
                        vertical10 = vertical9;
                        getpostalcode = getpostalcode2;
                        final DraggableAnchorsNode draggableAnchorsNode2 = draggableAnchorsNode;
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        z18 = true;
                        CheckboxTokens checkboxTokens = new CheckboxTokens() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: Code duplicated, block: B:292:0x0717  */
                            /* JADX WARN: Code duplicated, block: B:384:0x08e9  */
                            /* JADX WARN: Code duplicated, block: B:393:0x090e  */
                            @Override // o.CheckboxTokens
                            /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
                            public final MeasureResult mo89measure0kLqBqw(BaselineButtonTokens baselineButtonTokens, long j) {
                                SelectionHandleIcon selectionHandleIcon3;
                                int iMo42roundToPx0680j_4;
                                int iMo42roundToPx0680j_5;
                                float fMo64getSpacingD9Ej5fM;
                                int iM3626getMaxWidthimpl;
                                float fFloatValue;
                                LazyListState lazyListState3;
                                long j2;
                                int i23;
                                int i24;
                                int i25;
                                int i26;
                                int i27;
                                int i28;
                                int i29;
                                int i30;
                                LazyListMeasuredItem lazyListMeasuredItem;
                                int i31;
                                int i32;
                                int i33;
                                List arrayList;
                                BasicTooltipBox basicTooltipBox;
                                int i34;
                                int iM3642constrainHeightK40F9xA;
                                float f;
                                int i35;
                                boolean z21;
                                Object obj;
                                Integer numValueOf;
                                Integer numValueOf2;
                                List list;
                                SelectionHandleIcon selectionHandleIcon4;
                                SubcomposeMeasureScope subcomposeMeasureScope;
                                LazyListMeasureResult lazyListMeasureResult;
                                int i36;
                                AnchoredDraggableKt anchoredDraggableKt;
                                int i37;
                                int i38;
                                BasicTooltipBox basicTooltipBox2;
                                Object objWrite;
                                int iM3801getXimpl;
                                ArrayList arrayList2;
                                Object obj2;
                                int iM3801getXimpl2;
                                int i39;
                                int iMax;
                                int i40;
                                int iRemoteActionCompatParcelizer;
                                int i41;
                                SelectionHandleIcon selectionHandleIcon5;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = baselineButtonTokens.RemoteActionCompatParcelizer;
                                LazyListState lazyListState4 = lazyListState;
                                lazyListState4.PlaybackStateCompatCustomAction.getValue();
                                boolean z22 = lazyListState4.RatingCompat || subcomposeMeasureScope2.isLookingAhead();
                                boolean z23 = z;
                                if (z23) {
                                    selectionHandleIcon3 = SelectionHandleIcon.Vertical;
                                } else {
                                    selectionHandleIcon3 = SelectionHandleIcon.Horizontal;
                                }
                                getUptimeimpl.serializer(j, selectionHandleIcon3);
                                SwitchKt switchKt2 = switchKt;
                                if (z23) {
                                    iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.read(subcomposeMeasureScope2.getLayoutDirection()));
                                } else {
                                    iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.serializer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                                }
                                if (z23) {
                                    iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.write(subcomposeMeasureScope2.getLayoutDirection()));
                                } else {
                                    iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.IconCompatParcelizer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                                }
                                int iMo42roundToPx0680j_6 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.IconCompatParcelizer());
                                int iMo42roundToPx0680j_7 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.RemoteActionCompatParcelizer()) + iMo42roundToPx0680j_6;
                                int i42 = iMo42roundToPx0680j_4 + iMo42roundToPx0680j_5;
                                int i43 = z23 ? iMo42roundToPx0680j_7 : i42;
                                int i44 = z23 ? iMo42roundToPx0680j_6 : !z23 ? iMo42roundToPx0680j_4 : iMo42roundToPx0680j_5;
                                int i45 = i43 - i44;
                                long jM3645offsetNN6EwU = ConstraintsKt.m3645offsetNN6EwU(j, -i42, -iMo42roundToPx0680j_7);
                                BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111 = (BasicTooltipKtanchorSemantics111) registerinappmessagemanagerlambda7.invoke();
                                AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable2 = basicTooltipKtanchorSemantics111.IconCompatParcelizer;
                                int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(jM3645offsetNN6EwU);
                                int i46 = i44;
                                int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(jM3645offsetNN6EwU);
                                ((onHideTranslationui) anchoredDraggableKtanchoredDraggable2.RemoteActionCompatParcelizer).serializer(iM3626getMaxWidthimpl2);
                                ((onHideTranslationui) anchoredDraggableKtanchoredDraggable2.serializer).serializer(iM3625getMaxHeightimpl);
                                Arrangement.Horizontal horizontal9 = horizontal4;
                                Arrangement.Vertical vertical11 = vertical10;
                                if (z23) {
                                    if (vertical11 != null) {
                                        fMo64getSpacingD9Ej5fM = vertical11.mo64getSpacingD9Ej5fM();
                                    } else {
                                        throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                    }
                                } else if (horizontal9 != null) {
                                    fMo64getSpacingD9Ej5fM = horizontal9.mo64getSpacingD9Ej5fM();
                                } else {
                                    throw af$$ExternalSyntheticOutline1.m("null horizontalAlignment when isVertical == false");
                                }
                                int iMo42roundToPx0680j_8 = subcomposeMeasureScope2.mo42roundToPx0680j_4(fMo64getSpacingD9Ej5fM);
                                int iSerializer = basicTooltipKtanchorSemantics111.serializer();
                                if (z23) {
                                    iM3626getMaxWidthimpl = Constraints.m3625getMaxHeightimpl(j) - iMo42roundToPx0680j_7;
                                } else {
                                    iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j) - i42;
                                }
                                int i47 = iM3626getMaxWidthimpl;
                                BasicTooltipBox basicTooltipBox3 = new BasicTooltipBox(jM3645offsetNN6EwU, z, basicTooltipKtanchorSemantics111, baselineButtonTokens, iSerializer, iMo42roundToPx0680j_8, horizontal8, vertical4, i46, i45, IntOffset.m3795constructorimpl((((long) iMo42roundToPx0680j_4) << 32) | (((long) iMo42roundToPx0680j_6) & 4294967295L)), lazyListState);
                                getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                                getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                                try {
                                    E5 e5 = lazyListState4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                    int iMediaSessionCompatQueueItem = e5.MediaSessionCompatQueueItem();
                                    int i48 = moveBydefault.read(iMediaSessionCompatQueueItem, basicTooltipKtanchorSemantics111, e5.RemoteActionCompatParcelizer);
                                    if (iMediaSessionCompatQueueItem != i48) {
                                        ((onHideTranslationui) ((getPlatformAndroidManager) e5.IconCompatParcelizer)).serializer(i48);
                                        ((ExtendedFabSmallTokens) e5.serializer).IconCompatParcelizer(iMediaSessionCompatQueueItem);
                                    }
                                    int iMediaDescriptionCompat = e5.MediaDescriptionCompat();
                                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                    List listIconCompatParcelizer = MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer(basicTooltipKtanchorSemantics111, lazyListState4.PlaybackStateCompat, lazyListState4.RemoteActionCompatParcelizer);
                                    if (!subcomposeMeasureScope2.isLookingAhead() && z22) {
                                        fFloatValue = ((Number) ((onShowTranslationui) ((UpdatableAnimationState) lazyListState4.write.write).write).getValue()).floatValue();
                                    } else {
                                        fFloatValue = lazyListState4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                                    }
                                    LazyLayoutItemAnimator lazyLayoutItemAnimator = lazyListState4.MediaSessionCompatToken;
                                    boolean zIsLookingAhead = subcomposeMeasureScope2.isLookingAhead();
                                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = lazyListState4.MediaSessionCompatResultReceiverWrapper;
                                    if (i46 < 0) {
                                        TriStateCheckbox.read("invalid beforeContentPadding");
                                    }
                                    if (i45 < 0) {
                                        TriStateCheckbox.read("invalid afterContentPadding");
                                    }
                                    SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                                    BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics112 = basicTooltipBox3.PlaybackStateCompatCustomAction;
                                    boolean z24 = z;
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                    instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                                    int i49 = iSerializer;
                                    if (i49 <= 0) {
                                        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(jM3645offsetNN6EwU);
                                        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jM3645offsetNN6EwU);
                                        lazyLayoutItemAnimator.onMeasured(0, iM3628getMinWidthimpl, iM3627getMinHeightimpl, new ArrayList(), basicTooltipKtanchorSemantics112.serializer, basicTooltipBox3, z24, zIsLookingAhead, z22, 0, 0);
                                        if (!zIsLookingAhead) {
                                            long jM92getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                            if (!IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m3849getZeroYbymL2g())) {
                                                iM3628getMinWidthimpl = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                                                iM3627getMinHeightimpl = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                                            }
                                        }
                                        MeasureResult measureResultLayout = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, iM3628getMinWidthimpl + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3627getMinHeightimpl + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new accessisRelatedToAutoCommit(20));
                                        int i50 = -i46;
                                        if (z24) {
                                            selectionHandleIcon5 = SelectionHandleIcon.Vertical;
                                        } else {
                                            selectionHandleIcon5 = SelectionHandleIcon.Horizontal;
                                        }
                                        lazyListState3 = lazyListState4;
                                        lazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, measureResultLayout, 0.0f, false, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox3.MediaSessionCompatResultReceiverWrapper, instance_delegatelambda0Var, i50, i47 + i45, 0, selectionHandleIcon5, i45, iMo42roundToPx0680j_8);
                                        subcomposeMeasureScope = subcomposeMeasureScope2;
                                    } else {
                                        lazyListState3 = lazyListState4;
                                        if (i48 >= i49) {
                                            i48 = i49 - 1;
                                            iMediaDescriptionCompat = 0;
                                        }
                                        int iRound = Math.round(fFloatValue);
                                        int i51 = iMediaDescriptionCompat - iRound;
                                        if (i48 == 0 && i51 < 0) {
                                            iRound += i51;
                                            i51 = 0;
                                        }
                                        BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
                                        int i52 = -i46;
                                        int i53 = i52 + (iMo42roundToPx0680j_8 < 0 ? iMo42roundToPx0680j_8 : 0);
                                        int i54 = i51 + i53;
                                        int iMax2 = 0;
                                        while (true) {
                                            j2 = basicTooltipBox3.MediaSessionCompatResultReceiverWrapper;
                                            if (i54 >= 0 || i48 <= 0) {
                                                break;
                                            }
                                            int i55 = i52;
                                            int i56 = i48 - 1;
                                            LazyListMeasuredItem lazyListMeasuredItemWrite = basicTooltipBox3.write(i56, j2);
                                            brazeContentCardsManager.add(0, lazyListMeasuredItemWrite);
                                            iMax2 = Math.max(iMax2, lazyListMeasuredItemWrite.IconCompatParcelizer);
                                            i54 += lazyListMeasuredItemWrite.PlaybackStateCompatCustomAction;
                                            i48 = i56;
                                            i52 = i55;
                                        }
                                        int i57 = i52;
                                        if (i54 < i53) {
                                            iRound -= i53 - i54;
                                            i54 = i53;
                                        }
                                        int i58 = i54 - i53;
                                        int i59 = i47 + i45;
                                        int i60 = i59 < 0 ? 0 : i59;
                                        int i61 = i58;
                                        int i62 = -i58;
                                        int i63 = i48;
                                        int i64 = 0;
                                        boolean z25 = false;
                                        while (i64 < brazeContentCardsManager.RemoteActionCompatParcelizer) {
                                            if (i62 >= i60) {
                                                brazeContentCardsManager.IconCompatParcelizer(i64);
                                                z25 = true;
                                            } else {
                                                i63++;
                                                i62 += ((LazyListMeasuredItem) brazeContentCardsManager.get(i64)).PlaybackStateCompatCustomAction;
                                                i64++;
                                            }
                                        }
                                        int i65 = iMax2;
                                        boolean z26 = z25;
                                        int i66 = i63;
                                        while (i66 < i49 && (i62 < i60 || i62 <= 0 || brazeContentCardsManager.isEmpty())) {
                                            int i67 = i60;
                                            LazyListMeasuredItem lazyListMeasuredItemWrite2 = basicTooltipBox3.write(i66, j2);
                                            BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics113 = basicTooltipKtanchorSemantics112;
                                            int i68 = lazyListMeasuredItemWrite2.PlaybackStateCompatCustomAction;
                                            i62 += i68;
                                            if (i62 <= i53) {
                                                i41 = i53;
                                                if (i66 != i49 - 1) {
                                                    i61 -= i68;
                                                    i48 = i66 + 1;
                                                    z26 = true;
                                                }
                                                i66++;
                                                i60 = i67;
                                                basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                                i53 = i41;
                                            } else {
                                                i41 = i53;
                                            }
                                            int iMax3 = Math.max(i65, lazyListMeasuredItemWrite2.IconCompatParcelizer);
                                            brazeContentCardsManager.addLast(lazyListMeasuredItemWrite2);
                                            i65 = iMax3;
                                            i66++;
                                            i60 = i67;
                                            basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                            i53 = i41;
                                        }
                                        BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics114 = basicTooltipKtanchorSemantics112;
                                        int i69 = i47;
                                        if (i62 < i69) {
                                            int i70 = i69 - i62;
                                            int i71 = i62 + i70;
                                            int iMax4 = i65;
                                            int i72 = i61 - i70;
                                            while (i72 < i46 && i48 > 0) {
                                                int i73 = i66;
                                                int i74 = i48 - 1;
                                                int i75 = i69;
                                                LazyListMeasuredItem lazyListMeasuredItemWrite3 = basicTooltipBox3.write(i74, j2);
                                                i48 = i74;
                                                brazeContentCardsManager.add(0, lazyListMeasuredItemWrite3);
                                                iMax4 = Math.max(iMax4, lazyListMeasuredItemWrite3.IconCompatParcelizer);
                                                i72 += lazyListMeasuredItemWrite3.PlaybackStateCompatCustomAction;
                                                i69 = i75;
                                                i66 = i73;
                                            }
                                            i23 = i66;
                                            i24 = i69;
                                            i26 = i70 + iRound;
                                            if (i72 < 0) {
                                                i26 += i72;
                                                i25 = i71 + i72;
                                                i65 = iMax4;
                                                i27 = i48;
                                                i28 = 0;
                                            } else {
                                                i25 = i71;
                                                i28 = i72;
                                                i65 = iMax4;
                                                i27 = i48;
                                            }
                                        } else {
                                            i23 = i66;
                                            i24 = i69;
                                            i25 = i62;
                                            i26 = iRound;
                                            i27 = i48;
                                            i28 = i61;
                                        }
                                        int i76 = i65;
                                        float f2 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i26) || Math.abs(Math.round(fFloatValue)) < Math.abs(i26)) ? fFloatValue : i26;
                                        float f3 = fFloatValue - f2;
                                        float f4 = (!zIsLookingAhead || i26 <= iRound || f3 > 0.0f) ? 0.0f : (i26 - iRound) + f3;
                                        if (i28 < 0) {
                                            TriStateCheckbox.read("negative currentFirstItemScrollOffset");
                                        }
                                        int i77 = -i28;
                                        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) brazeContentCardsManager.read();
                                        if (i46 > 0 || iMo42roundToPx0680j_8 < 0) {
                                            int iIconCompatParcelizer = brazeContentCardsManager.IconCompatParcelizer();
                                            LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem2;
                                            int i78 = i28;
                                            int i79 = 0;
                                            while (true) {
                                                if (i79 < iIconCompatParcelizer) {
                                                    int i80 = ((LazyListMeasuredItem) brazeContentCardsManager.get(i79)).PlaybackStateCompatCustomAction;
                                                    if (i78 != 0 && i80 <= i78) {
                                                        int i81 = iIconCompatParcelizer;
                                                        i29 = 1;
                                                        if (i79 == brazeContentCardsManager.IconCompatParcelizer() - 1) {
                                                            break;
                                                        }
                                                        i78 -= i80;
                                                        i79++;
                                                        lazyListMeasuredItem3 = (LazyListMeasuredItem) brazeContentCardsManager.get(i79);
                                                        iIconCompatParcelizer = i81;
                                                    }
                                                }
                                                i29 = 1;
                                                break;
                                            }
                                            i30 = i78;
                                            lazyListMeasuredItem = lazyListMeasuredItem3;
                                            i31 = 0;
                                        } else {
                                            i30 = i28;
                                            lazyListMeasuredItem = lazyListMeasuredItem2;
                                            i31 = 0;
                                            i29 = 1;
                                        }
                                        int iMax5 = Math.max(i31, i27);
                                        int i82 = i27 - i29;
                                        List arrayList3 = null;
                                        if (iMax5 <= i82) {
                                            while (true) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(basicTooltipBox3.write(i82, j2));
                                                if (i82 == iMax5) {
                                                    break;
                                                }
                                                i82--;
                                            }
                                        }
                                        List list2 = listIconCompatParcelizer;
                                        int size = list2.size() - 1;
                                        if (size >= 0) {
                                            while (true) {
                                                int i83 = size - 1;
                                                int iIntValue = ((Number) listIconCompatParcelizer.get(size)).intValue();
                                                if (iIntValue < iMax5) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(basicTooltipBox3.write(iIntValue, j2));
                                                }
                                                if (i83 < 0) {
                                                    break;
                                                }
                                                size = i83;
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = instance_delegatelambda0Var;
                                        }
                                        List list3 = arrayList3;
                                        float f5 = f2;
                                        int iMax6 = i76;
                                        int i84 = 0;
                                        for (int size2 = list3.size(); i84 < size2; size2 = size2) {
                                            iMax6 = Math.max(iMax6, ((LazyListMeasuredItem) arrayList3.get(i84)).IconCompatParcelizer);
                                            i84++;
                                        }
                                        int iMin = Math.min(((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat, i49 - 1);
                                        int i85 = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat + 1;
                                        if (i85 <= iMin) {
                                            List arrayList4 = null;
                                            while (true) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                i32 = i49;
                                                i33 = iMax6;
                                                arrayList = arrayList4;
                                                arrayList.add(basicTooltipBox3.write(i85, j2));
                                                if (i85 == iMin) {
                                                    break;
                                                }
                                                i85++;
                                                arrayList4 = arrayList;
                                                iMax6 = i33;
                                                i49 = i32;
                                            }
                                        } else {
                                            i32 = i49;
                                            i33 = iMax6;
                                            arrayList = null;
                                        }
                                        if (arrayList != null && ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat > iMin) {
                                            iMin = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat;
                                        }
                                        int size3 = list2.size();
                                        for (int i86 = 0; i86 < size3; i86++) {
                                            int iIntValue2 = ((Number) listIconCompatParcelizer.get(i86)).intValue();
                                            if (iIntValue2 > iMin) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(basicTooltipBox3.write(iIntValue2, j2));
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = instance_delegatelambda0Var;
                                        }
                                        List list4 = arrayList;
                                        int size4 = list4.size();
                                        int iMax7 = i33;
                                        for (int i87 = 0; i87 < size4; i87++) {
                                            iMax7 = Math.max(iMax7, ((LazyListMeasuredItem) arrayList.get(i87)).IconCompatParcelizer);
                                        }
                                        boolean z27 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lazyListMeasuredItem, brazeContentCardsManager.read()}, getCieXyz.write())).booleanValue() && arrayList3.isEmpty() && arrayList.isEmpty();
                                        int iM3643constrainWidthK40F9xA = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, z24 ? iMax7 : i25);
                                        if (z24) {
                                            iMax7 = i25;
                                        }
                                        int iM3642constrainHeightK40F9xA2 = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, iMax7);
                                        int i88 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                        int i89 = i24;
                                        boolean z28 = i25 < Math.min(i88, i89);
                                        if (z28 && i77 != 0) {
                                            TriStateCheckbox.RemoteActionCompatParcelizer("non-zero itemsScrollOffset");
                                        }
                                        LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem;
                                        ArrayList arrayList5 = new ArrayList(arrayList.size() + arrayList3.size() + brazeContentCardsManager.IconCompatParcelizer());
                                        if (z28) {
                                            if (!arrayList3.isEmpty() || !arrayList.isEmpty()) {
                                                TriStateCheckbox.read("no extra items");
                                            }
                                            int iIconCompatParcelizer2 = brazeContentCardsManager.IconCompatParcelizer();
                                            int[] iArr = new int[iIconCompatParcelizer2];
                                            for (int i90 = 0; i90 < iIconCompatParcelizer2; i90++) {
                                                iArr[i90] = ((LazyListMeasuredItem) brazeContentCardsManager.get(i90)).ComponentActivity;
                                            }
                                            int[] iArr2 = new int[iIconCompatParcelizer2];
                                            if (z24) {
                                                if (vertical11 != null) {
                                                    vertical11.read(baselineButtonTokens, i88, iArr, iArr2);
                                                    basicTooltipBox = basicTooltipBox3;
                                                } else {
                                                    throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                                }
                                            } else if (horizontal9 != null) {
                                                basicTooltipBox = basicTooltipBox3;
                                                horizontal9.RemoteActionCompatParcelizer(baselineButtonTokens, i88, iArr, LayoutDirection.Ltr, iArr2);
                                            } else {
                                                throw af$$ExternalSyntheticOutline1.m("null horizontalArrangement when isVertical == false");
                                            }
                                            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(iArr2);
                                            int i91 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.read;
                                            int i92 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.serializer;
                                            if ((i92 > 0 && i91 >= 0) || (i92 < 0 && i91 <= 0)) {
                                                int i93 = 0;
                                                while (true) {
                                                    int i94 = iArr2[i93];
                                                    LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) brazeContentCardsManager.get(i93);
                                                    lazyListMeasuredItem5.position(i94, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                                    arrayList5.add(lazyListMeasuredItem5);
                                                    if (i93 == i91) {
                                                        break;
                                                    }
                                                    i93 += i92;
                                                }
                                            }
                                        } else {
                                            z24 = z24;
                                            basicTooltipBox = basicTooltipBox3;
                                            int size5 = list3.size();
                                            int i95 = i77;
                                            int i96 = 0;
                                            while (i96 < size5) {
                                                LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayList3.get(i96);
                                                i95 -= lazyListMeasuredItem6.PlaybackStateCompatCustomAction;
                                                lazyListMeasuredItem6.position(i95, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                                arrayList5.add(lazyListMeasuredItem6);
                                                i96++;
                                                i77 = i77;
                                            }
                                            int i97 = i77;
                                            int iIconCompatParcelizer3 = brazeContentCardsManager.IconCompatParcelizer();
                                            int i98 = i97;
                                            for (int i99 = 0; i99 < iIconCompatParcelizer3; i99++) {
                                                LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) brazeContentCardsManager.get(i99);
                                                lazyListMeasuredItem7.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                                arrayList5.add(lazyListMeasuredItem7);
                                                i98 += lazyListMeasuredItem7.PlaybackStateCompatCustomAction;
                                            }
                                            int size6 = list4.size();
                                            for (int i100 = 0; i100 < size6; i100++) {
                                                LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem) arrayList.get(i100);
                                                lazyListMeasuredItem8.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                                arrayList5.add(lazyListMeasuredItem8);
                                                i98 += lazyListMeasuredItem8.PlaybackStateCompatCustomAction;
                                            }
                                        }
                                        float f6 = f5;
                                        lazyLayoutItemAnimator.onMeasured((int) f6, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2, arrayList5, basicTooltipKtanchorSemantics114.serializer, basicTooltipBox, z24, zIsLookingAhead, z22, i30, i25);
                                        if (zIsLookingAhead) {
                                            i34 = iM3643constrainWidthK40F9xA;
                                            iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                        } else {
                                            long jM92getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                            if (IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m3849getZeroYbymL2g())) {
                                                i34 = iM3643constrainWidthK40F9xA;
                                                iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                            } else {
                                                int i101 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                                int iM3643constrainWidthK40F9xA2 = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, Math.max(iM3643constrainWidthK40F9xA, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                                                iM3642constrainHeightK40F9xA = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, Math.max(iM3642constrainHeightK40F9xA2, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                                                int i102 = z24 ? iM3642constrainHeightK40F9xA : iM3643constrainWidthK40F9xA2;
                                                if (i102 != i101) {
                                                    int size7 = arrayList5.size();
                                                    for (int i103 = 0; i103 < size7; i103++) {
                                                        ((LazyListMeasuredItem) arrayList5.get(i103)).MediaSessionCompatResultReceiverWrapper = i102;
                                                    }
                                                }
                                                i34 = iM3643constrainWidthK40F9xA2;
                                            }
                                        }
                                        LazyListMeasuredItem lazyListMeasuredItem9 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                        int i104 = lazyListMeasuredItem9 != null ? lazyListMeasuredItem9.MediaMetadataCompat : 0;
                                        LazyListMeasuredItem lazyListMeasuredItem10 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                        int i105 = lazyListMeasuredItem10 != null ? lazyListMeasuredItem10.MediaMetadataCompat : 0;
                                        basicTooltipKtanchorSemantics114.read.getClass();
                                        AnchoredDraggableKt anchoredDraggableKt2 = ContextMenuScope.write;
                                        if (draggableAnchorsNode2 == null || arrayList5.isEmpty() || (i36 = anchoredDraggableKt2.RemoteActionCompatParcelizer) == 0) {
                                            f = f6;
                                            i35 = i57;
                                            z21 = true;
                                            obj = instance_delegatelambda0Var;
                                        } else {
                                            if (i105 - i104 < 0 || i36 == 0) {
                                                anchoredDraggableKt = anchoredDraggableKt2;
                                            } else {
                                                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i36)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                                                int i106 = ensuresubscribedtoinappmessageeventslambda7.write;
                                                int i107 = ensuresubscribedtoinappmessageeventslambda7.read;
                                                if (i106 <= i107) {
                                                    iRemoteActionCompatParcelizer = -1;
                                                    while (anchoredDraggableKt2.RemoteActionCompatParcelizer(i106) <= i104) {
                                                        iRemoteActionCompatParcelizer = anchoredDraggableKt2.RemoteActionCompatParcelizer(i106);
                                                        if (i106 == i107) {
                                                            break;
                                                        }
                                                        i106++;
                                                    }
                                                    i40 = -1;
                                                } else {
                                                    i40 = -1;
                                                    iRemoteActionCompatParcelizer = -1;
                                                }
                                                if (iRemoteActionCompatParcelizer == i40) {
                                                    anchoredDraggableKt = ContextMenuScope.write;
                                                } else {
                                                    anchoredDraggableKt = new AnchoredDraggableKt(1);
                                                    anchoredDraggableKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                                                }
                                            }
                                            ArrayList arrayList6 = new ArrayList();
                                            ArrayList arrayList7 = new ArrayList(arrayList5.size());
                                            int size8 = arrayList5.size();
                                            int i108 = 0;
                                            while (i108 < size8) {
                                                Object obj3 = arrayList5.get(i108);
                                                int i109 = ((LazyListMeasuredItem) ((FabBaselineTokens) obj3)).MediaMetadataCompat;
                                                int i110 = size8;
                                                int[] iArr3 = anchoredDraggableKt2.read;
                                                int i111 = anchoredDraggableKt2.RemoteActionCompatParcelizer;
                                                AnchoredDraggableKt anchoredDraggableKt3 = anchoredDraggableKt2;
                                                int i112 = 0;
                                                while (i112 < i111) {
                                                    int i113 = i111;
                                                    if (iArr3[i112] == i109) {
                                                        arrayList7.add(obj3);
                                                        break;
                                                    }
                                                    i112++;
                                                    i111 = i113;
                                                }
                                                i108++;
                                                size8 = i110;
                                                anchoredDraggableKt2 = anchoredDraggableKt3;
                                            }
                                            int[] iArr4 = anchoredDraggableKt.read;
                                            int i114 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                                            int i115 = 0;
                                            while (i115 < i114) {
                                                int i116 = iArr4[i115];
                                                Iterator it = arrayList5.iterator();
                                                int i117 = 0;
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        i37 = -1;
                                                        i117 = -1;
                                                        break;
                                                    }
                                                    if (((LazyListMeasuredItem) ((FabBaselineTokens) it.next())).MediaMetadataCompat == i116) {
                                                        i37 = -1;
                                                        break;
                                                    }
                                                    i117++;
                                                }
                                                if (i117 == i37) {
                                                    basicTooltipBox2 = basicTooltipBox;
                                                    objWrite = basicTooltipBox2.write(i116, j2);
                                                    i38 = i117;
                                                } else {
                                                    i38 = i117;
                                                    basicTooltipBox2 = basicTooltipBox;
                                                    objWrite = (FabBaselineTokens) arrayList5.remove(i38);
                                                }
                                                int[] iArr5 = iArr4;
                                                Object obj4 = objWrite;
                                                LazyListMeasuredItem lazyListMeasuredItem11 = (LazyListMeasuredItem) obj4;
                                                int i118 = lazyListMeasuredItem11.PlaybackStateCompatCustomAction;
                                                float f7 = f6;
                                                if (i38 == -1) {
                                                    iM3801getXimpl = Integer.MIN_VALUE;
                                                } else {
                                                    long jM91getOffsetBjo55l4 = lazyListMeasuredItem11.m91getOffsetBjo55l4(0);
                                                    if (lazyListMeasuredItem11.MediaSessionCompatQueueItem) {
                                                        iM3801getXimpl = IntOffset.m3802getYimpl(jM91getOffsetBjo55l4);
                                                    } else {
                                                        iM3801getXimpl = IntOffset.m3801getXimpl(jM91getOffsetBjo55l4);
                                                    }
                                                }
                                                int size9 = arrayList7.size();
                                                basicTooltipBox = basicTooltipBox2;
                                                int i119 = 0;
                                                while (true) {
                                                    if (i119 >= size9) {
                                                        arrayList2 = arrayList7;
                                                        obj2 = null;
                                                        break;
                                                    }
                                                    obj2 = arrayList7.get(i119);
                                                    arrayList2 = arrayList7;
                                                    if (((LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaMetadataCompat != i116) {
                                                        break;
                                                    }
                                                    i119++;
                                                    arrayList7 = arrayList2;
                                                }
                                                FabBaselineTokens fabBaselineTokens = (FabBaselineTokens) obj2;
                                                if (fabBaselineTokens != null) {
                                                    LazyListMeasuredItem lazyListMeasuredItem12 = (LazyListMeasuredItem) fabBaselineTokens;
                                                    long jM91getOffsetBjo55l5 = lazyListMeasuredItem12.m91getOffsetBjo55l4(0);
                                                    if (lazyListMeasuredItem12.MediaSessionCompatQueueItem) {
                                                        iM3801getXimpl2 = IntOffset.m3802getYimpl(jM91getOffsetBjo55l5);
                                                    } else {
                                                        iM3801getXimpl2 = IntOffset.m3801getXimpl(jM91getOffsetBjo55l5);
                                                    }
                                                } else {
                                                    iM3801getXimpl2 = Integer.MIN_VALUE;
                                                }
                                                if (iM3801getXimpl == Integer.MIN_VALUE) {
                                                    iMax = i57;
                                                    i39 = iMax;
                                                } else {
                                                    i39 = i57;
                                                    iMax = Math.max(i39, iM3801getXimpl);
                                                }
                                                if (iM3801getXimpl2 != Integer.MIN_VALUE) {
                                                    iMax = Math.min(iMax, iM3801getXimpl2 - i118);
                                                }
                                                lazyListMeasuredItem11.ParcelableVolumeInfo = true;
                                                lazyListMeasuredItem11.position(iMax, i34, iM3642constrainHeightK40F9xA);
                                                arrayList6.add(obj4);
                                                i115++;
                                                i57 = i39;
                                                iArr4 = iArr5;
                                                i114 = i114;
                                                arrayList7 = arrayList2;
                                                f6 = f7;
                                            }
                                            f = f6;
                                            i35 = i57;
                                            z21 = true;
                                            obj = arrayList6;
                                        }
                                        if (z27) {
                                            LazyListMeasuredItem lazyListMeasuredItem13 = (LazyListMeasuredItem) onContentCardDismissed.MediaMetadataCompat((List) arrayList5);
                                            if (lazyListMeasuredItem13 != null) {
                                                numValueOf = Integer.valueOf(lazyListMeasuredItem13.MediaMetadataCompat);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else {
                                            LazyListMeasuredItem lazyListMeasuredItem14 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                            if (lazyListMeasuredItem14 != null) {
                                                numValueOf = Integer.valueOf(lazyListMeasuredItem14.MediaMetadataCompat);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        if (z27) {
                                            LazyListMeasuredItem lazyListMeasuredItem15 = (LazyListMeasuredItem) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList5);
                                            if (lazyListMeasuredItem15 != null) {
                                                numValueOf2 = Integer.valueOf(lazyListMeasuredItem15.MediaMetadataCompat);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        } else {
                                            LazyListMeasuredItem lazyListMeasuredItem16 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                            if (lazyListMeasuredItem16 != null) {
                                                numValueOf2 = Integer.valueOf(lazyListMeasuredItem16.MediaMetadataCompat);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        }
                                        boolean z29 = (i23 < i32 || i25 > i89) ? z21 : false;
                                        MeasureResult measureResultLayout2 = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, i34 + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3642constrainHeightK40F9xA + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(populateViewStructure_androidKtpopulate7, arrayList5, obj, zIsLookingAhead, 1));
                                        int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                                        int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        if (arrayList5.isEmpty()) {
                                            list = instance_delegatelambda0Var;
                                        } else {
                                            ArrayList arrayList8 = new ArrayList((Collection) obj);
                                            int size10 = arrayList5.size();
                                            for (int i120 = 0; i120 < size10; i120++) {
                                                FabBaselineTokens fabBaselineTokens2 = (FabBaselineTokens) arrayList5.get(i120);
                                                int i121 = ((LazyListMeasuredItem) fabBaselineTokens2).MediaMetadataCompat;
                                                if (iIntValue3 <= i121 && i121 <= iIntValue4) {
                                                    arrayList8.add(fabBaselineTokens2);
                                                }
                                            }
                                            BrazeContentCardsManagerCompanion.write(arrayList8, ExtendedFabPrimaryTokens.IconCompatParcelizer);
                                            list = arrayList8;
                                        }
                                        if (z24) {
                                            selectionHandleIcon4 = SelectionHandleIcon.Vertical;
                                        } else {
                                            selectionHandleIcon4 = SelectionHandleIcon.Horizontal;
                                        }
                                        subcomposeMeasureScope = subcomposeMeasureScope2;
                                        lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem4, i30, z29, f, measureResultLayout2, f4, z26, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox.MediaSessionCompatResultReceiverWrapper, list, i35, i59, i32, selectionHandleIcon4, i45, iMo42roundToPx0680j_8);
                                    }
                                    LazyListState lazyListState5 = lazyListState3;
                                    lazyListState5.read(lazyListMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                    AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = lazyListState5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                    return lazyListMeasureResult;
                                } catch (Throwable th) {
                                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                    throw th;
                                }
                            }
                        };
                        getpostalcode.write(checkboxTokens);
                        objComponentActivity4 = checkboxTokens;
                    } else {
                        getpostalcode = getpostalcode2;
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        vertical4 = vertical8;
                        vertical10 = vertical9;
                        z18 = true;
                    }
                    CheckboxTokens checkboxTokens2 = (CheckboxTokens) objComponentActivity4;
                    if (z) {
                        selectionHandleIcon = SelectionHandleIcon.Vertical;
                    } else {
                        selectionHandleIcon = SelectionHandleIcon.Horizontal;
                    }
                    selectionHandleIcon2 = selectionHandleIcon;
                    if (z2 != 0) {
                        getpostalcode.serializer(-2077147368);
                        Modifier.Companion companion = Modifier.Companion;
                        lazyListState2 = lazyListState;
                        if (((i7 ^ 6) > 4 || !getpostalcode.read(lazyListState2)) && (i18 & 6) != 4) {
                            i10 = 0;
                            z19 = false;
                        } else {
                            z19 = z18;
                            i10 = 0;
                        }
                        z20 = getpostalcode.read(i10);
                        objComponentActivity5 = getpostalcode.ComponentActivity();
                        if (!(z20 | z19) || objComponentActivity5 == androidContentCaptureManager2) {
                            objComponentActivity5 = new settle(lazyListState2);
                            getpostalcode.write(objComponentActivity5);
                        }
                        modifierIconCompatParcelizer = ExtendedFabPrimaryTokens.IconCompatParcelizer(companion, (settle) objComponentActivity5, lazyListState2.RemoteActionCompatParcelizer, selectionHandleIcon2);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        lazyListState2 = lazyListState;
                        getpostalcode.serializer(-2076718545);
                        getpostalcode.IconCompatParcelizer(false);
                        modifierIconCompatParcelizer = Modifier.Companion;
                    }
                    PullToRefreshModifierNodeupdate1.write(registerinappmessagemanagerlambda7, DefaultPagerNestedScrollConnection.RemoteActionCompatParcelizer(AbstractApplier.write(modifier.then(lazyListState2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4).then(lazyListState2.IconCompatParcelizer), registerinappmessagemanagerlambda7, smallIconButtonTokens, selectionHandleIcon2, z2).then(modifierIconCompatParcelizer).then(lazyListState2.MediaSessionCompatToken.write), lazyListState, selectionHandleIcon2, isnotgestureactionfoundation, z2, constructorimplVar, lazyListState2.MediaMetadataCompat, null), lazyListState2.ResultReceiver, checkboxTokens2, getpostalcode, 0);
                    horizontal3 = horizontal8;
                    vertical3 = vertical10;
                }
                vertical7 = vertical6;
                horizontal6 = horizontal5;
                horizontal7 = horizontal2;
                getpostalcode2.RemoteActionCompatParcelizer();
                int i110 = i6 >> 3;
                i7 = i110 & 14;
                int i111 = i7 | ((i16 >> 6) & 112);
                populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode2);
                if (((i111 & 14) ^ 6) <= 4) {
                }
                objComponentActivity = getpostalcode2.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!z4) {
                    AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable2 = new AnchoredDraggableKtanchoredDraggable1();
                    anchoredDraggableKtanchoredDraggable2.RemoteActionCompatParcelizer = CompositionKt.read(Integer.MAX_VALUE);
                    anchoredDraggableKtanchoredDraggable2.serializer = CompositionKt.read(Integer.MAX_VALUE);
                    AndroidContentCaptureManager androidContentCaptureManager4 = AndroidContentCaptureManager.read;
                    objComponentActivity = new MapboxNavigation.AnonymousClass10(0, 1, onViewAttachedToWindow.class, CompositionKt.serializer(androidContentCaptureManager4, new n$$ExternalSyntheticLambda3(CompositionKt.serializer(androidContentCaptureManager4, new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7Serializer, 1)), lazyListState, anchoredDraggableKtanchoredDraggable2, 2)), "value", "getValue()Ljava/lang/Object;");
                    getpostalcode2.write(objComponentActivity);
                } else {
                    AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable3 = new AnchoredDraggableKtanchoredDraggable1();
                    anchoredDraggableKtanchoredDraggable3.RemoteActionCompatParcelizer = CompositionKt.read(Integer.MAX_VALUE);
                    anchoredDraggableKtanchoredDraggable3.serializer = CompositionKt.read(Integer.MAX_VALUE);
                    AndroidContentCaptureManager androidContentCaptureManager5 = AndroidContentCaptureManager.read;
                    objComponentActivity = new MapboxNavigation.AnonymousClass10(0, 1, onViewAttachedToWindow.class, CompositionKt.serializer(androidContentCaptureManager5, new n$$ExternalSyntheticLambda3(CompositionKt.serializer(androidContentCaptureManager5, new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7Serializer, 1)), lazyListState, anchoredDraggableKtanchoredDraggable3, 2)), "value", "getValue()Ljava/lang/Object;");
                    getpostalcode2.write(objComponentActivity);
                }
                registerinappmessagemanagerlambda7 = (registerInAppMessageManagerlambda7) objComponentActivity;
                int i23 = i6 >> 9;
                int i24 = i7 | (i23 & 112);
                if (((i24 & 14) ^ 6) <= 4) {
                }
                if (((i24 & 112) ^ 48) <= 32) {
                }
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (!(z6 | z5)) {
                    objComponentActivity2 = new SmallIconButtonTokens(z) { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                        public final /* synthetic */ boolean IconCompatParcelizer;
                        public final getPersonLastName write;

                        @Override // o.SmallIconButtonTokens
                        public final CollectionInfo serializer() {
                            boolean z21 = this.IconCompatParcelizer;
                            getPersonLastName getpersonlastname = this.write;
                            return z21 ? new CollectionInfo(((Number) getpersonlastname.getValue()).intValue(), 1) : new CollectionInfo(1, ((Number) getpersonlastname.getValue()).intValue());
                        }

                        @Override // o.SmallIconButtonTokens
                        public final int IconCompatParcelizer() {
                            LazyListState lazyListState3 = this.serializer;
                            return (-((LazyListMeasureResult) lazyListState3.serializer()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys) + ((LazyListMeasureResult) lazyListState3.serializer()).write;
                        }

                        @Override // o.SmallIconButtonTokens
                        public final float RemoteActionCompatParcelizer() {
                            LazyListState lazyListState3 = this.serializer;
                            int iMediaSessionCompatQueueItem = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem();
                            int iMediaDescriptionCompat = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                            return lazyListState3.write() ? (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat + 100.0f : (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat;
                        }

                        @Override // o.SmallIconButtonTokens
                        public final float read() {
                            LazyListState lazyListState3 = this.serializer;
                            return (lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem() * Constant.ERROR_UNKNOWN) + lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                        }

                        @Override // o.SmallIconButtonTokens
                        public final Object scrollToItem(int i25, PagerState$scrollToPage$2 pagerState$scrollToPage$2) {
                            CardView$1 cardView$1 = LazyListState.read;
                            LazyListState lazyListState3 = this.serializer;
                            lazyListState3.getClass();
                            Object objScroll = lazyListState3.scroll(applyMeasureResultfoundation.Default, new BlockRunner$cancel$1(lazyListState3, i25, (ShortNewsContentCardView) null), pagerState$scrollToPage$2);
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            if (objScroll != coroutineSingletons) {
                                objScroll = createfromparcel;
                            }
                            return objScroll == coroutineSingletons ? objScroll : createfromparcel;
                        }

                        @Override // o.SmallIconButtonTokens
                        public final int write() {
                            LazyListState lazyListState3 = this.serializer;
                            return (int) (((LazyListMeasureResult) lazyListState3.serializer()).MediaSessionCompatToken == SelectionHandleIcon.Vertical ? ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() & 4294967295L : ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() >> 32);
                        }

                        {
                            this.IconCompatParcelizer = z;
                            this.write = CompositionKt.serializer(new AnchoredDraggableStatedraggableState1drag2(this.serializer, 0));
                        }
                    };
                    getpostalcode2.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new SmallIconButtonTokens(z) { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                        public final /* synthetic */ boolean IconCompatParcelizer;
                        public final getPersonLastName write;

                        @Override // o.SmallIconButtonTokens
                        public final CollectionInfo serializer() {
                            boolean z21 = this.IconCompatParcelizer;
                            getPersonLastName getpersonlastname = this.write;
                            return z21 ? new CollectionInfo(((Number) getpersonlastname.getValue()).intValue(), 1) : new CollectionInfo(1, ((Number) getpersonlastname.getValue()).intValue());
                        }

                        @Override // o.SmallIconButtonTokens
                        public final int IconCompatParcelizer() {
                            LazyListState lazyListState3 = this.serializer;
                            return (-((LazyListMeasureResult) lazyListState3.serializer()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys) + ((LazyListMeasureResult) lazyListState3.serializer()).write;
                        }

                        @Override // o.SmallIconButtonTokens
                        public final float RemoteActionCompatParcelizer() {
                            LazyListState lazyListState3 = this.serializer;
                            int iMediaSessionCompatQueueItem = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem();
                            int iMediaDescriptionCompat = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                            return lazyListState3.write() ? (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat + 100.0f : (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat;
                        }

                        @Override // o.SmallIconButtonTokens
                        public final float read() {
                            LazyListState lazyListState3 = this.serializer;
                            return (lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem() * Constant.ERROR_UNKNOWN) + lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                        }

                        @Override // o.SmallIconButtonTokens
                        public final Object scrollToItem(int i25, PagerState$scrollToPage$2 pagerState$scrollToPage$2) {
                            CardView$1 cardView$1 = LazyListState.read;
                            LazyListState lazyListState3 = this.serializer;
                            lazyListState3.getClass();
                            Object objScroll = lazyListState3.scroll(applyMeasureResultfoundation.Default, new BlockRunner$cancel$1(lazyListState3, i25, (ShortNewsContentCardView) null), pagerState$scrollToPage$2);
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            if (objScroll != coroutineSingletons) {
                                objScroll = createfromparcel;
                            }
                            return objScroll == coroutineSingletons ? objScroll : createfromparcel;
                        }

                        @Override // o.SmallIconButtonTokens
                        public final int write() {
                            LazyListState lazyListState3 = this.serializer;
                            return (int) (((LazyListMeasureResult) lazyListState3.serializer()).MediaSessionCompatToken == SelectionHandleIcon.Vertical ? ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() & 4294967295L : ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() >> 32);
                        }

                        {
                            this.IconCompatParcelizer = z;
                            this.write = CompositionKt.serializer(new AnchoredDraggableStatedraggableState1drag2(this.serializer, 0));
                        }
                    };
                    getpostalcode2.write(objComponentActivity2);
                }
                SmallIconButtonTokens smallIconButtonTokens2 = (SmallIconButtonTokens) objComponentActivity2;
                objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                    getpostalcode2.write(objComponentActivity3);
                }
                getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity3;
                graphicsContext = (GraphicsContext) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalGraphicsContext());
                if (((Boolean) getpostalcode2.write(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                    draggableAnchorsNode = up.IconCompatParcelizer;
                } else {
                    draggableAnchorsNode = null;
                }
                int i25 = i16 << 18;
                i8 = (i6 & 65520) | (i23 & 3670016) | (i25 & 29360128) | (i25 & 234881024) | ((i16 << 27) & 1879048192);
                if (((i8 & 112) ^ 48) <= 32) {
                }
                if (((i8 & 896) ^ 384) <= 256) {
                }
                if (((i8 & 7168) ^ 3072) <= 2048) {
                }
                if (((57344 & i8) ^ 24576) > 16384) {
                    i9 = 0;
                    z10 = false;
                } else {
                    i9 = 0;
                    z10 = false;
                }
                z11 = getpostalcode2.read(i9);
                if (((i8 & 3670016) ^ 1572864) <= 1048576) {
                }
                horizontal8 = horizontal6;
                if (((29360128 & i8) ^ 12582912) <= 8388608) {
                }
                vertical8 = vertical7;
                if (((234881024 & i8) ^ 100663296) <= 67108864) {
                }
                horizontal4 = horizontal7;
                if (((1879048192 & i8) ^ 805306368) <= 536870912) {
                }
                z16 = getpostalcode2.read(graphicsContext);
                z17 = getpostalcode2.read(draggableAnchorsNode);
                vertical9 = vertical5;
                objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (!(z12 | z8 | z7 | z9 | z10 | z11 | z13 | z14 | z15 | z16 | z17)) {
                    vertical4 = vertical8;
                    vertical10 = vertical9;
                    getpostalcode = getpostalcode2;
                    final DraggableAnchorsNode draggableAnchorsNode3 = draggableAnchorsNode;
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    z18 = true;
                    CheckboxTokens checkboxTokens3 = new CheckboxTokens() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: Code duplicated, block: B:292:0x0717  */
                        /* JADX WARN: Code duplicated, block: B:384:0x08e9  */
                        /* JADX WARN: Code duplicated, block: B:393:0x090e  */
                        @Override // o.CheckboxTokens
                        /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
                        public final MeasureResult mo89measure0kLqBqw(BaselineButtonTokens baselineButtonTokens, long j) {
                            SelectionHandleIcon selectionHandleIcon3;
                            int iMo42roundToPx0680j_4;
                            int iMo42roundToPx0680j_5;
                            float fMo64getSpacingD9Ej5fM;
                            int iM3626getMaxWidthimpl;
                            float fFloatValue;
                            LazyListState lazyListState3;
                            long j2;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            int i210;
                            int i211;
                            int i212;
                            int i30;
                            LazyListMeasuredItem lazyListMeasuredItem;
                            int i31;
                            int i32;
                            int i33;
                            List arrayList;
                            BasicTooltipBox basicTooltipBox;
                            int i34;
                            int iM3642constrainHeightK40F9xA;
                            float f;
                            int i35;
                            boolean z21;
                            Object obj;
                            Integer numValueOf;
                            Integer numValueOf2;
                            List list;
                            SelectionHandleIcon selectionHandleIcon4;
                            SubcomposeMeasureScope subcomposeMeasureScope;
                            LazyListMeasureResult lazyListMeasureResult;
                            int i36;
                            AnchoredDraggableKt anchoredDraggableKt;
                            int i37;
                            int i38;
                            BasicTooltipBox basicTooltipBox2;
                            Object objWrite;
                            int iM3801getXimpl;
                            ArrayList arrayList2;
                            Object obj2;
                            int iM3801getXimpl2;
                            int i39;
                            int iMax;
                            int i40;
                            int iRemoteActionCompatParcelizer;
                            int i41;
                            SelectionHandleIcon selectionHandleIcon5;
                            SubcomposeMeasureScope subcomposeMeasureScope2 = baselineButtonTokens.RemoteActionCompatParcelizer;
                            LazyListState lazyListState4 = lazyListState;
                            lazyListState4.PlaybackStateCompatCustomAction.getValue();
                            boolean z22 = lazyListState4.RatingCompat || subcomposeMeasureScope2.isLookingAhead();
                            boolean z23 = z;
                            if (z23) {
                                selectionHandleIcon3 = SelectionHandleIcon.Vertical;
                            } else {
                                selectionHandleIcon3 = SelectionHandleIcon.Horizontal;
                            }
                            getUptimeimpl.serializer(j, selectionHandleIcon3);
                            SwitchKt switchKt2 = switchKt;
                            if (z23) {
                                iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.read(subcomposeMeasureScope2.getLayoutDirection()));
                            } else {
                                iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.serializer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                            }
                            if (z23) {
                                iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.write(subcomposeMeasureScope2.getLayoutDirection()));
                            } else {
                                iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.IconCompatParcelizer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                            }
                            int iMo42roundToPx0680j_6 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.IconCompatParcelizer());
                            int iMo42roundToPx0680j_7 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.RemoteActionCompatParcelizer()) + iMo42roundToPx0680j_6;
                            int i42 = iMo42roundToPx0680j_4 + iMo42roundToPx0680j_5;
                            int i43 = z23 ? iMo42roundToPx0680j_7 : i42;
                            int i44 = z23 ? iMo42roundToPx0680j_6 : !z23 ? iMo42roundToPx0680j_4 : iMo42roundToPx0680j_5;
                            int i45 = i43 - i44;
                            long jM3645offsetNN6EwU = ConstraintsKt.m3645offsetNN6EwU(j, -i42, -iMo42roundToPx0680j_7);
                            BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111 = (BasicTooltipKtanchorSemantics111) registerinappmessagemanagerlambda7.invoke();
                            AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable4 = basicTooltipKtanchorSemantics111.IconCompatParcelizer;
                            int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(jM3645offsetNN6EwU);
                            int i46 = i44;
                            int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(jM3645offsetNN6EwU);
                            ((onHideTranslationui) anchoredDraggableKtanchoredDraggable4.RemoteActionCompatParcelizer).serializer(iM3626getMaxWidthimpl2);
                            ((onHideTranslationui) anchoredDraggableKtanchoredDraggable4.serializer).serializer(iM3625getMaxHeightimpl);
                            Arrangement.Horizontal horizontal9 = horizontal4;
                            Arrangement.Vertical vertical11 = vertical10;
                            if (z23) {
                                if (vertical11 != null) {
                                    fMo64getSpacingD9Ej5fM = vertical11.mo64getSpacingD9Ej5fM();
                                } else {
                                    throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                }
                            } else if (horizontal9 != null) {
                                fMo64getSpacingD9Ej5fM = horizontal9.mo64getSpacingD9Ej5fM();
                            } else {
                                throw af$$ExternalSyntheticOutline1.m("null horizontalAlignment when isVertical == false");
                            }
                            int iMo42roundToPx0680j_8 = subcomposeMeasureScope2.mo42roundToPx0680j_4(fMo64getSpacingD9Ej5fM);
                            int iSerializer = basicTooltipKtanchorSemantics111.serializer();
                            if (z23) {
                                iM3626getMaxWidthimpl = Constraints.m3625getMaxHeightimpl(j) - iMo42roundToPx0680j_7;
                            } else {
                                iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j) - i42;
                            }
                            int i47 = iM3626getMaxWidthimpl;
                            BasicTooltipBox basicTooltipBox3 = new BasicTooltipBox(jM3645offsetNN6EwU, z, basicTooltipKtanchorSemantics111, baselineButtonTokens, iSerializer, iMo42roundToPx0680j_8, horizontal8, vertical4, i46, i45, IntOffset.m3795constructorimpl((((long) iMo42roundToPx0680j_4) << 32) | (((long) iMo42roundToPx0680j_6) & 4294967295L)), lazyListState);
                            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                            try {
                                E5 e5 = lazyListState4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                int iMediaSessionCompatQueueItem = e5.MediaSessionCompatQueueItem();
                                int i48 = moveBydefault.read(iMediaSessionCompatQueueItem, basicTooltipKtanchorSemantics111, e5.RemoteActionCompatParcelizer);
                                if (iMediaSessionCompatQueueItem != i48) {
                                    ((onHideTranslationui) ((getPlatformAndroidManager) e5.IconCompatParcelizer)).serializer(i48);
                                    ((ExtendedFabSmallTokens) e5.serializer).IconCompatParcelizer(iMediaSessionCompatQueueItem);
                                }
                                int iMediaDescriptionCompat = e5.MediaDescriptionCompat();
                                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                List listIconCompatParcelizer = MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer(basicTooltipKtanchorSemantics111, lazyListState4.PlaybackStateCompat, lazyListState4.RemoteActionCompatParcelizer);
                                if (!subcomposeMeasureScope2.isLookingAhead() && z22) {
                                    fFloatValue = ((Number) ((onShowTranslationui) ((UpdatableAnimationState) lazyListState4.write.write).write).getValue()).floatValue();
                                } else {
                                    fFloatValue = lazyListState4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                                }
                                LazyLayoutItemAnimator lazyLayoutItemAnimator = lazyListState4.MediaSessionCompatToken;
                                boolean zIsLookingAhead = subcomposeMeasureScope2.isLookingAhead();
                                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = lazyListState4.MediaSessionCompatResultReceiverWrapper;
                                if (i46 < 0) {
                                    TriStateCheckbox.read("invalid beforeContentPadding");
                                }
                                if (i45 < 0) {
                                    TriStateCheckbox.read("invalid afterContentPadding");
                                }
                                SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                                BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics112 = basicTooltipBox3.PlaybackStateCompatCustomAction;
                                boolean z24 = z;
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                                int i49 = iSerializer;
                                if (i49 <= 0) {
                                    int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(jM3645offsetNN6EwU);
                                    int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jM3645offsetNN6EwU);
                                    lazyLayoutItemAnimator.onMeasured(0, iM3628getMinWidthimpl, iM3627getMinHeightimpl, new ArrayList(), basicTooltipKtanchorSemantics112.serializer, basicTooltipBox3, z24, zIsLookingAhead, z22, 0, 0);
                                    if (!zIsLookingAhead) {
                                        long jM92getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                        if (!IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m3849getZeroYbymL2g())) {
                                            iM3628getMinWidthimpl = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                                            iM3627getMinHeightimpl = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                                        }
                                    }
                                    MeasureResult measureResultLayout = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, iM3628getMinWidthimpl + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3627getMinHeightimpl + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new accessisRelatedToAutoCommit(20));
                                    int i50 = -i46;
                                    if (z24) {
                                        selectionHandleIcon5 = SelectionHandleIcon.Vertical;
                                    } else {
                                        selectionHandleIcon5 = SelectionHandleIcon.Horizontal;
                                    }
                                    lazyListState3 = lazyListState4;
                                    lazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, measureResultLayout, 0.0f, false, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox3.MediaSessionCompatResultReceiverWrapper, instance_delegatelambda0Var, i50, i47 + i45, 0, selectionHandleIcon5, i45, iMo42roundToPx0680j_8);
                                    subcomposeMeasureScope = subcomposeMeasureScope2;
                                } else {
                                    lazyListState3 = lazyListState4;
                                    if (i48 >= i49) {
                                        i48 = i49 - 1;
                                        iMediaDescriptionCompat = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i51 = iMediaDescriptionCompat - iRound;
                                    if (i48 == 0 && i51 < 0) {
                                        iRound += i51;
                                        i51 = 0;
                                    }
                                    BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
                                    int i52 = -i46;
                                    int i53 = i52 + (iMo42roundToPx0680j_8 < 0 ? iMo42roundToPx0680j_8 : 0);
                                    int i54 = i51 + i53;
                                    int iMax2 = 0;
                                    while (true) {
                                        j2 = basicTooltipBox3.MediaSessionCompatResultReceiverWrapper;
                                        if (i54 >= 0 || i48 <= 0) {
                                            break;
                                        }
                                        int i55 = i52;
                                        int i56 = i48 - 1;
                                        LazyListMeasuredItem lazyListMeasuredItemWrite = basicTooltipBox3.write(i56, j2);
                                        brazeContentCardsManager.add(0, lazyListMeasuredItemWrite);
                                        iMax2 = Math.max(iMax2, lazyListMeasuredItemWrite.IconCompatParcelizer);
                                        i54 += lazyListMeasuredItemWrite.PlaybackStateCompatCustomAction;
                                        i48 = i56;
                                        i52 = i55;
                                    }
                                    int i57 = i52;
                                    if (i54 < i53) {
                                        iRound -= i53 - i54;
                                        i54 = i53;
                                    }
                                    int i58 = i54 - i53;
                                    int i59 = i47 + i45;
                                    int i60 = i59 < 0 ? 0 : i59;
                                    int i61 = i58;
                                    int i62 = -i58;
                                    int i63 = i48;
                                    int i64 = 0;
                                    boolean z25 = false;
                                    while (i64 < brazeContentCardsManager.RemoteActionCompatParcelizer) {
                                        if (i62 >= i60) {
                                            brazeContentCardsManager.IconCompatParcelizer(i64);
                                            z25 = true;
                                        } else {
                                            i63++;
                                            i62 += ((LazyListMeasuredItem) brazeContentCardsManager.get(i64)).PlaybackStateCompatCustomAction;
                                            i64++;
                                        }
                                    }
                                    int i65 = iMax2;
                                    boolean z26 = z25;
                                    int i66 = i63;
                                    while (i66 < i49 && (i62 < i60 || i62 <= 0 || brazeContentCardsManager.isEmpty())) {
                                        int i67 = i60;
                                        LazyListMeasuredItem lazyListMeasuredItemWrite2 = basicTooltipBox3.write(i66, j2);
                                        BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics113 = basicTooltipKtanchorSemantics112;
                                        int i68 = lazyListMeasuredItemWrite2.PlaybackStateCompatCustomAction;
                                        i62 += i68;
                                        if (i62 <= i53) {
                                            i41 = i53;
                                            if (i66 != i49 - 1) {
                                                i61 -= i68;
                                                i48 = i66 + 1;
                                                z26 = true;
                                            }
                                            i66++;
                                            i60 = i67;
                                            basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                            i53 = i41;
                                        } else {
                                            i41 = i53;
                                        }
                                        int iMax3 = Math.max(i65, lazyListMeasuredItemWrite2.IconCompatParcelizer);
                                        brazeContentCardsManager.addLast(lazyListMeasuredItemWrite2);
                                        i65 = iMax3;
                                        i66++;
                                        i60 = i67;
                                        basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                        i53 = i41;
                                    }
                                    BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics114 = basicTooltipKtanchorSemantics112;
                                    int i69 = i47;
                                    if (i62 < i69) {
                                        int i70 = i69 - i62;
                                        int i71 = i62 + i70;
                                        int iMax4 = i65;
                                        int i72 = i61 - i70;
                                        while (i72 < i46 && i48 > 0) {
                                            int i73 = i66;
                                            int i74 = i48 - 1;
                                            int i75 = i69;
                                            LazyListMeasuredItem lazyListMeasuredItemWrite3 = basicTooltipBox3.write(i74, j2);
                                            i48 = i74;
                                            brazeContentCardsManager.add(0, lazyListMeasuredItemWrite3);
                                            iMax4 = Math.max(iMax4, lazyListMeasuredItemWrite3.IconCompatParcelizer);
                                            i72 += lazyListMeasuredItemWrite3.PlaybackStateCompatCustomAction;
                                            i69 = i75;
                                            i66 = i73;
                                        }
                                        i26 = i66;
                                        i27 = i69;
                                        i29 = i70 + iRound;
                                        if (i72 < 0) {
                                            i29 += i72;
                                            i28 = i71 + i72;
                                            i65 = iMax4;
                                            i210 = i48;
                                            i211 = 0;
                                        } else {
                                            i28 = i71;
                                            i211 = i72;
                                            i65 = iMax4;
                                            i210 = i48;
                                        }
                                    } else {
                                        i26 = i66;
                                        i27 = i69;
                                        i28 = i62;
                                        i29 = iRound;
                                        i210 = i48;
                                        i211 = i61;
                                    }
                                    int i76 = i65;
                                    float f2 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i29) || Math.abs(Math.round(fFloatValue)) < Math.abs(i29)) ? fFloatValue : i29;
                                    float f3 = fFloatValue - f2;
                                    float f4 = (!zIsLookingAhead || i29 <= iRound || f3 > 0.0f) ? 0.0f : (i29 - iRound) + f3;
                                    if (i211 < 0) {
                                        TriStateCheckbox.read("negative currentFirstItemScrollOffset");
                                    }
                                    int i77 = -i211;
                                    LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) brazeContentCardsManager.read();
                                    if (i46 > 0 || iMo42roundToPx0680j_8 < 0) {
                                        int iIconCompatParcelizer = brazeContentCardsManager.IconCompatParcelizer();
                                        LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem2;
                                        int i78 = i211;
                                        int i79 = 0;
                                        while (true) {
                                            if (i79 < iIconCompatParcelizer) {
                                                int i80 = ((LazyListMeasuredItem) brazeContentCardsManager.get(i79)).PlaybackStateCompatCustomAction;
                                                if (i78 != 0 && i80 <= i78) {
                                                    int i81 = iIconCompatParcelizer;
                                                    i212 = 1;
                                                    if (i79 == brazeContentCardsManager.IconCompatParcelizer() - 1) {
                                                        break;
                                                    }
                                                    i78 -= i80;
                                                    i79++;
                                                    lazyListMeasuredItem3 = (LazyListMeasuredItem) brazeContentCardsManager.get(i79);
                                                    iIconCompatParcelizer = i81;
                                                }
                                            }
                                            i212 = 1;
                                            break;
                                        }
                                        i30 = i78;
                                        lazyListMeasuredItem = lazyListMeasuredItem3;
                                        i31 = 0;
                                    } else {
                                        i30 = i211;
                                        lazyListMeasuredItem = lazyListMeasuredItem2;
                                        i31 = 0;
                                        i212 = 1;
                                    }
                                    int iMax5 = Math.max(i31, i210);
                                    int i82 = i210 - i212;
                                    List arrayList3 = null;
                                    if (iMax5 <= i82) {
                                        while (true) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(basicTooltipBox3.write(i82, j2));
                                            if (i82 == iMax5) {
                                                break;
                                            }
                                            i82--;
                                        }
                                    }
                                    List list2 = listIconCompatParcelizer;
                                    int size = list2.size() - 1;
                                    if (size >= 0) {
                                        while (true) {
                                            int i83 = size - 1;
                                            int iIntValue = ((Number) listIconCompatParcelizer.get(size)).intValue();
                                            if (iIntValue < iMax5) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(basicTooltipBox3.write(iIntValue, j2));
                                            }
                                            if (i83 < 0) {
                                                break;
                                            }
                                            size = i83;
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = instance_delegatelambda0Var;
                                    }
                                    List list3 = arrayList3;
                                    float f5 = f2;
                                    int iMax6 = i76;
                                    int i84 = 0;
                                    for (int size2 = list3.size(); i84 < size2; size2 = size2) {
                                        iMax6 = Math.max(iMax6, ((LazyListMeasuredItem) arrayList3.get(i84)).IconCompatParcelizer);
                                        i84++;
                                    }
                                    int iMin = Math.min(((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat, i49 - 1);
                                    int i85 = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat + 1;
                                    if (i85 <= iMin) {
                                        List arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i32 = i49;
                                            i33 = iMax6;
                                            arrayList = arrayList4;
                                            arrayList.add(basicTooltipBox3.write(i85, j2));
                                            if (i85 == iMin) {
                                                break;
                                            }
                                            i85++;
                                            arrayList4 = arrayList;
                                            iMax6 = i33;
                                            i49 = i32;
                                        }
                                    } else {
                                        i32 = i49;
                                        i33 = iMax6;
                                        arrayList = null;
                                    }
                                    if (arrayList != null && ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat > iMin) {
                                        iMin = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat;
                                    }
                                    int size3 = list2.size();
                                    for (int i86 = 0; i86 < size3; i86++) {
                                        int iIntValue2 = ((Number) listIconCompatParcelizer.get(i86)).intValue();
                                        if (iIntValue2 > iMin) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(basicTooltipBox3.write(iIntValue2, j2));
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = instance_delegatelambda0Var;
                                    }
                                    List list4 = arrayList;
                                    int size4 = list4.size();
                                    int iMax7 = i33;
                                    for (int i87 = 0; i87 < size4; i87++) {
                                        iMax7 = Math.max(iMax7, ((LazyListMeasuredItem) arrayList.get(i87)).IconCompatParcelizer);
                                    }
                                    boolean z27 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lazyListMeasuredItem, brazeContentCardsManager.read()}, getCieXyz.write())).booleanValue() && arrayList3.isEmpty() && arrayList.isEmpty();
                                    int iM3643constrainWidthK40F9xA = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, z24 ? iMax7 : i28);
                                    if (z24) {
                                        iMax7 = i28;
                                    }
                                    int iM3642constrainHeightK40F9xA2 = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, iMax7);
                                    int i88 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                    int i89 = i27;
                                    boolean z28 = i28 < Math.min(i88, i89);
                                    if (z28 && i77 != 0) {
                                        TriStateCheckbox.RemoteActionCompatParcelizer("non-zero itemsScrollOffset");
                                    }
                                    LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem;
                                    ArrayList arrayList5 = new ArrayList(arrayList.size() + arrayList3.size() + brazeContentCardsManager.IconCompatParcelizer());
                                    if (z28) {
                                        if (!arrayList3.isEmpty() || !arrayList.isEmpty()) {
                                            TriStateCheckbox.read("no extra items");
                                        }
                                        int iIconCompatParcelizer2 = brazeContentCardsManager.IconCompatParcelizer();
                                        int[] iArr = new int[iIconCompatParcelizer2];
                                        for (int i90 = 0; i90 < iIconCompatParcelizer2; i90++) {
                                            iArr[i90] = ((LazyListMeasuredItem) brazeContentCardsManager.get(i90)).ComponentActivity;
                                        }
                                        int[] iArr2 = new int[iIconCompatParcelizer2];
                                        if (z24) {
                                            if (vertical11 != null) {
                                                vertical11.read(baselineButtonTokens, i88, iArr, iArr2);
                                                basicTooltipBox = basicTooltipBox3;
                                            } else {
                                                throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                            }
                                        } else if (horizontal9 != null) {
                                            basicTooltipBox = basicTooltipBox3;
                                            horizontal9.RemoteActionCompatParcelizer(baselineButtonTokens, i88, iArr, LayoutDirection.Ltr, iArr2);
                                        } else {
                                            throw af$$ExternalSyntheticOutline1.m("null horizontalArrangement when isVertical == false");
                                        }
                                        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(iArr2);
                                        int i91 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.read;
                                        int i92 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.serializer;
                                        if ((i92 > 0 && i91 >= 0) || (i92 < 0 && i91 <= 0)) {
                                            int i93 = 0;
                                            while (true) {
                                                int i94 = iArr2[i93];
                                                LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) brazeContentCardsManager.get(i93);
                                                lazyListMeasuredItem5.position(i94, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                                arrayList5.add(lazyListMeasuredItem5);
                                                if (i93 == i91) {
                                                    break;
                                                }
                                                i93 += i92;
                                            }
                                        }
                                    } else {
                                        z24 = z24;
                                        basicTooltipBox = basicTooltipBox3;
                                        int size5 = list3.size();
                                        int i95 = i77;
                                        int i96 = 0;
                                        while (i96 < size5) {
                                            LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayList3.get(i96);
                                            i95 -= lazyListMeasuredItem6.PlaybackStateCompatCustomAction;
                                            lazyListMeasuredItem6.position(i95, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem6);
                                            i96++;
                                            i77 = i77;
                                        }
                                        int i97 = i77;
                                        int iIconCompatParcelizer3 = brazeContentCardsManager.IconCompatParcelizer();
                                        int i98 = i97;
                                        for (int i99 = 0; i99 < iIconCompatParcelizer3; i99++) {
                                            LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) brazeContentCardsManager.get(i99);
                                            lazyListMeasuredItem7.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem7);
                                            i98 += lazyListMeasuredItem7.PlaybackStateCompatCustomAction;
                                        }
                                        int size6 = list4.size();
                                        for (int i100 = 0; i100 < size6; i100++) {
                                            LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem) arrayList.get(i100);
                                            lazyListMeasuredItem8.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem8);
                                            i98 += lazyListMeasuredItem8.PlaybackStateCompatCustomAction;
                                        }
                                    }
                                    float f6 = f5;
                                    lazyLayoutItemAnimator.onMeasured((int) f6, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2, arrayList5, basicTooltipKtanchorSemantics114.serializer, basicTooltipBox, z24, zIsLookingAhead, z22, i30, i28);
                                    if (zIsLookingAhead) {
                                        i34 = iM3643constrainWidthK40F9xA;
                                        iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                    } else {
                                        long jM92getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                        if (IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m3849getZeroYbymL2g())) {
                                            i34 = iM3643constrainWidthK40F9xA;
                                            iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                        } else {
                                            int i101 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                            int iM3643constrainWidthK40F9xA2 = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, Math.max(iM3643constrainWidthK40F9xA, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                                            iM3642constrainHeightK40F9xA = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, Math.max(iM3642constrainHeightK40F9xA2, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                                            int i102 = z24 ? iM3642constrainHeightK40F9xA : iM3643constrainWidthK40F9xA2;
                                            if (i102 != i101) {
                                                int size7 = arrayList5.size();
                                                for (int i103 = 0; i103 < size7; i103++) {
                                                    ((LazyListMeasuredItem) arrayList5.get(i103)).MediaSessionCompatResultReceiverWrapper = i102;
                                                }
                                            }
                                            i34 = iM3643constrainWidthK40F9xA2;
                                        }
                                    }
                                    LazyListMeasuredItem lazyListMeasuredItem9 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                    int i104 = lazyListMeasuredItem9 != null ? lazyListMeasuredItem9.MediaMetadataCompat : 0;
                                    LazyListMeasuredItem lazyListMeasuredItem10 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                    int i105 = lazyListMeasuredItem10 != null ? lazyListMeasuredItem10.MediaMetadataCompat : 0;
                                    basicTooltipKtanchorSemantics114.read.getClass();
                                    AnchoredDraggableKt anchoredDraggableKt2 = ContextMenuScope.write;
                                    if (draggableAnchorsNode3 == null || arrayList5.isEmpty() || (i36 = anchoredDraggableKt2.RemoteActionCompatParcelizer) == 0) {
                                        f = f6;
                                        i35 = i57;
                                        z21 = true;
                                        obj = instance_delegatelambda0Var;
                                    } else {
                                        if (i105 - i104 < 0 || i36 == 0) {
                                            anchoredDraggableKt = anchoredDraggableKt2;
                                        } else {
                                            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i36)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                                            int i106 = ensuresubscribedtoinappmessageeventslambda7.write;
                                            int i107 = ensuresubscribedtoinappmessageeventslambda7.read;
                                            if (i106 <= i107) {
                                                iRemoteActionCompatParcelizer = -1;
                                                while (anchoredDraggableKt2.RemoteActionCompatParcelizer(i106) <= i104) {
                                                    iRemoteActionCompatParcelizer = anchoredDraggableKt2.RemoteActionCompatParcelizer(i106);
                                                    if (i106 == i107) {
                                                        break;
                                                    }
                                                    i106++;
                                                }
                                                i40 = -1;
                                            } else {
                                                i40 = -1;
                                                iRemoteActionCompatParcelizer = -1;
                                            }
                                            if (iRemoteActionCompatParcelizer == i40) {
                                                anchoredDraggableKt = ContextMenuScope.write;
                                            } else {
                                                anchoredDraggableKt = new AnchoredDraggableKt(1);
                                                anchoredDraggableKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        ArrayList arrayList7 = new ArrayList(arrayList5.size());
                                        int size8 = arrayList5.size();
                                        int i108 = 0;
                                        while (i108 < size8) {
                                            Object obj3 = arrayList5.get(i108);
                                            int i109 = ((LazyListMeasuredItem) ((FabBaselineTokens) obj3)).MediaMetadataCompat;
                                            int i112 = size8;
                                            int[] iArr3 = anchoredDraggableKt2.read;
                                            int i113 = anchoredDraggableKt2.RemoteActionCompatParcelizer;
                                            AnchoredDraggableKt anchoredDraggableKt3 = anchoredDraggableKt2;
                                            int i114 = 0;
                                            while (i114 < i113) {
                                                int i115 = i113;
                                                if (iArr3[i114] == i109) {
                                                    arrayList7.add(obj3);
                                                    break;
                                                }
                                                i114++;
                                                i113 = i115;
                                            }
                                            i108++;
                                            size8 = i112;
                                            anchoredDraggableKt2 = anchoredDraggableKt3;
                                        }
                                        int[] iArr4 = anchoredDraggableKt.read;
                                        int i116 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                                        int i117 = 0;
                                        while (i117 < i116) {
                                            int i118 = iArr4[i117];
                                            Iterator it = arrayList5.iterator();
                                            int i119 = 0;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    i37 = -1;
                                                    i119 = -1;
                                                    break;
                                                }
                                                if (((LazyListMeasuredItem) ((FabBaselineTokens) it.next())).MediaMetadataCompat == i118) {
                                                    i37 = -1;
                                                    break;
                                                }
                                                i119++;
                                            }
                                            if (i119 == i37) {
                                                basicTooltipBox2 = basicTooltipBox;
                                                objWrite = basicTooltipBox2.write(i118, j2);
                                                i38 = i119;
                                            } else {
                                                i38 = i119;
                                                basicTooltipBox2 = basicTooltipBox;
                                                objWrite = (FabBaselineTokens) arrayList5.remove(i38);
                                            }
                                            int[] iArr5 = iArr4;
                                            Object obj4 = objWrite;
                                            LazyListMeasuredItem lazyListMeasuredItem11 = (LazyListMeasuredItem) obj4;
                                            int i1110 = lazyListMeasuredItem11.PlaybackStateCompatCustomAction;
                                            float f7 = f6;
                                            if (i38 == -1) {
                                                iM3801getXimpl = Integer.MIN_VALUE;
                                            } else {
                                                long jM91getOffsetBjo55l4 = lazyListMeasuredItem11.m91getOffsetBjo55l4(0);
                                                if (lazyListMeasuredItem11.MediaSessionCompatQueueItem) {
                                                    iM3801getXimpl = IntOffset.m3802getYimpl(jM91getOffsetBjo55l4);
                                                } else {
                                                    iM3801getXimpl = IntOffset.m3801getXimpl(jM91getOffsetBjo55l4);
                                                }
                                            }
                                            int size9 = arrayList7.size();
                                            basicTooltipBox = basicTooltipBox2;
                                            int i1111 = 0;
                                            while (true) {
                                                if (i1111 >= size9) {
                                                    arrayList2 = arrayList7;
                                                    obj2 = null;
                                                    break;
                                                }
                                                obj2 = arrayList7.get(i1111);
                                                arrayList2 = arrayList7;
                                                if (((LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaMetadataCompat != i118) {
                                                    break;
                                                }
                                                i1111++;
                                                arrayList7 = arrayList2;
                                            }
                                            FabBaselineTokens fabBaselineTokens = (FabBaselineTokens) obj2;
                                            if (fabBaselineTokens != null) {
                                                LazyListMeasuredItem lazyListMeasuredItem12 = (LazyListMeasuredItem) fabBaselineTokens;
                                                long jM91getOffsetBjo55l5 = lazyListMeasuredItem12.m91getOffsetBjo55l4(0);
                                                if (lazyListMeasuredItem12.MediaSessionCompatQueueItem) {
                                                    iM3801getXimpl2 = IntOffset.m3802getYimpl(jM91getOffsetBjo55l5);
                                                } else {
                                                    iM3801getXimpl2 = IntOffset.m3801getXimpl(jM91getOffsetBjo55l5);
                                                }
                                            } else {
                                                iM3801getXimpl2 = Integer.MIN_VALUE;
                                            }
                                            if (iM3801getXimpl == Integer.MIN_VALUE) {
                                                iMax = i57;
                                                i39 = iMax;
                                            } else {
                                                i39 = i57;
                                                iMax = Math.max(i39, iM3801getXimpl);
                                            }
                                            if (iM3801getXimpl2 != Integer.MIN_VALUE) {
                                                iMax = Math.min(iMax, iM3801getXimpl2 - i1110);
                                            }
                                            lazyListMeasuredItem11.ParcelableVolumeInfo = true;
                                            lazyListMeasuredItem11.position(iMax, i34, iM3642constrainHeightK40F9xA);
                                            arrayList6.add(obj4);
                                            i117++;
                                            i57 = i39;
                                            iArr4 = iArr5;
                                            i116 = i116;
                                            arrayList7 = arrayList2;
                                            f6 = f7;
                                        }
                                        f = f6;
                                        i35 = i57;
                                        z21 = true;
                                        obj = arrayList6;
                                    }
                                    if (z27) {
                                        LazyListMeasuredItem lazyListMeasuredItem13 = (LazyListMeasuredItem) onContentCardDismissed.MediaMetadataCompat((List) arrayList5);
                                        if (lazyListMeasuredItem13 != null) {
                                            numValueOf = Integer.valueOf(lazyListMeasuredItem13.MediaMetadataCompat);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        LazyListMeasuredItem lazyListMeasuredItem14 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                        if (lazyListMeasuredItem14 != null) {
                                            numValueOf = Integer.valueOf(lazyListMeasuredItem14.MediaMetadataCompat);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z27) {
                                        LazyListMeasuredItem lazyListMeasuredItem15 = (LazyListMeasuredItem) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList5);
                                        if (lazyListMeasuredItem15 != null) {
                                            numValueOf2 = Integer.valueOf(lazyListMeasuredItem15.MediaMetadataCompat);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        LazyListMeasuredItem lazyListMeasuredItem16 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                        if (lazyListMeasuredItem16 != null) {
                                            numValueOf2 = Integer.valueOf(lazyListMeasuredItem16.MediaMetadataCompat);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z29 = (i26 < i32 || i28 > i89) ? z21 : false;
                                    MeasureResult measureResultLayout2 = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, i34 + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3642constrainHeightK40F9xA + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(populateViewStructure_androidKtpopulate7, arrayList5, obj, zIsLookingAhead, 1));
                                    int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                                    int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                    if (arrayList5.isEmpty()) {
                                        list = instance_delegatelambda0Var;
                                    } else {
                                        ArrayList arrayList8 = new ArrayList((Collection) obj);
                                        int size10 = arrayList5.size();
                                        for (int i120 = 0; i120 < size10; i120++) {
                                            FabBaselineTokens fabBaselineTokens2 = (FabBaselineTokens) arrayList5.get(i120);
                                            int i121 = ((LazyListMeasuredItem) fabBaselineTokens2).MediaMetadataCompat;
                                            if (iIntValue3 <= i121 && i121 <= iIntValue4) {
                                                arrayList8.add(fabBaselineTokens2);
                                            }
                                        }
                                        BrazeContentCardsManagerCompanion.write(arrayList8, ExtendedFabPrimaryTokens.IconCompatParcelizer);
                                        list = arrayList8;
                                    }
                                    if (z24) {
                                        selectionHandleIcon4 = SelectionHandleIcon.Vertical;
                                    } else {
                                        selectionHandleIcon4 = SelectionHandleIcon.Horizontal;
                                    }
                                    subcomposeMeasureScope = subcomposeMeasureScope2;
                                    lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem4, i30, z29, f, measureResultLayout2, f4, z26, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox.MediaSessionCompatResultReceiverWrapper, list, i35, i59, i32, selectionHandleIcon4, i45, iMo42roundToPx0680j_8);
                                }
                                LazyListState lazyListState5 = lazyListState3;
                                lazyListState5.read(lazyListMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = lazyListState5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                return lazyListMeasureResult;
                            } catch (Throwable th) {
                                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                throw th;
                            }
                        }
                    };
                    getpostalcode.write(checkboxTokens3);
                    objComponentActivity4 = checkboxTokens3;
                } else {
                    vertical4 = vertical8;
                    vertical10 = vertical9;
                    getpostalcode = getpostalcode2;
                    final DraggableAnchorsNode draggableAnchorsNode4 = draggableAnchorsNode;
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    z18 = true;
                    CheckboxTokens checkboxTokens4 = new CheckboxTokens() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: Code duplicated, block: B:292:0x0717  */
                        /* JADX WARN: Code duplicated, block: B:384:0x08e9  */
                        /* JADX WARN: Code duplicated, block: B:393:0x090e  */
                        @Override // o.CheckboxTokens
                        /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
                        public final MeasureResult mo89measure0kLqBqw(BaselineButtonTokens baselineButtonTokens, long j) {
                            SelectionHandleIcon selectionHandleIcon3;
                            int iMo42roundToPx0680j_4;
                            int iMo42roundToPx0680j_5;
                            float fMo64getSpacingD9Ej5fM;
                            int iM3626getMaxWidthimpl;
                            float fFloatValue;
                            LazyListState lazyListState3;
                            long j2;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            int i210;
                            int i211;
                            int i212;
                            int i30;
                            LazyListMeasuredItem lazyListMeasuredItem;
                            int i31;
                            int i32;
                            int i33;
                            List arrayList;
                            BasicTooltipBox basicTooltipBox;
                            int i34;
                            int iM3642constrainHeightK40F9xA;
                            float f;
                            int i35;
                            boolean z21;
                            Object obj;
                            Integer numValueOf;
                            Integer numValueOf2;
                            List list;
                            SelectionHandleIcon selectionHandleIcon4;
                            SubcomposeMeasureScope subcomposeMeasureScope;
                            LazyListMeasureResult lazyListMeasureResult;
                            int i36;
                            AnchoredDraggableKt anchoredDraggableKt;
                            int i37;
                            int i38;
                            BasicTooltipBox basicTooltipBox2;
                            Object objWrite;
                            int iM3801getXimpl;
                            ArrayList arrayList2;
                            Object obj2;
                            int iM3801getXimpl2;
                            int i39;
                            int iMax;
                            int i40;
                            int iRemoteActionCompatParcelizer;
                            int i41;
                            SelectionHandleIcon selectionHandleIcon5;
                            SubcomposeMeasureScope subcomposeMeasureScope2 = baselineButtonTokens.RemoteActionCompatParcelizer;
                            LazyListState lazyListState4 = lazyListState;
                            lazyListState4.PlaybackStateCompatCustomAction.getValue();
                            boolean z22 = lazyListState4.RatingCompat || subcomposeMeasureScope2.isLookingAhead();
                            boolean z23 = z;
                            if (z23) {
                                selectionHandleIcon3 = SelectionHandleIcon.Vertical;
                            } else {
                                selectionHandleIcon3 = SelectionHandleIcon.Horizontal;
                            }
                            getUptimeimpl.serializer(j, selectionHandleIcon3);
                            SwitchKt switchKt2 = switchKt;
                            if (z23) {
                                iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.read(subcomposeMeasureScope2.getLayoutDirection()));
                            } else {
                                iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.serializer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                            }
                            if (z23) {
                                iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.write(subcomposeMeasureScope2.getLayoutDirection()));
                            } else {
                                iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.IconCompatParcelizer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                            }
                            int iMo42roundToPx0680j_6 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.IconCompatParcelizer());
                            int iMo42roundToPx0680j_7 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.RemoteActionCompatParcelizer()) + iMo42roundToPx0680j_6;
                            int i42 = iMo42roundToPx0680j_4 + iMo42roundToPx0680j_5;
                            int i43 = z23 ? iMo42roundToPx0680j_7 : i42;
                            int i44 = z23 ? iMo42roundToPx0680j_6 : !z23 ? iMo42roundToPx0680j_4 : iMo42roundToPx0680j_5;
                            int i45 = i43 - i44;
                            long jM3645offsetNN6EwU = ConstraintsKt.m3645offsetNN6EwU(j, -i42, -iMo42roundToPx0680j_7);
                            BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111 = (BasicTooltipKtanchorSemantics111) registerinappmessagemanagerlambda7.invoke();
                            AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable4 = basicTooltipKtanchorSemantics111.IconCompatParcelizer;
                            int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(jM3645offsetNN6EwU);
                            int i46 = i44;
                            int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(jM3645offsetNN6EwU);
                            ((onHideTranslationui) anchoredDraggableKtanchoredDraggable4.RemoteActionCompatParcelizer).serializer(iM3626getMaxWidthimpl2);
                            ((onHideTranslationui) anchoredDraggableKtanchoredDraggable4.serializer).serializer(iM3625getMaxHeightimpl);
                            Arrangement.Horizontal horizontal9 = horizontal4;
                            Arrangement.Vertical vertical11 = vertical10;
                            if (z23) {
                                if (vertical11 != null) {
                                    fMo64getSpacingD9Ej5fM = vertical11.mo64getSpacingD9Ej5fM();
                                } else {
                                    throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                }
                            } else if (horizontal9 != null) {
                                fMo64getSpacingD9Ej5fM = horizontal9.mo64getSpacingD9Ej5fM();
                            } else {
                                throw af$$ExternalSyntheticOutline1.m("null horizontalAlignment when isVertical == false");
                            }
                            int iMo42roundToPx0680j_8 = subcomposeMeasureScope2.mo42roundToPx0680j_4(fMo64getSpacingD9Ej5fM);
                            int iSerializer = basicTooltipKtanchorSemantics111.serializer();
                            if (z23) {
                                iM3626getMaxWidthimpl = Constraints.m3625getMaxHeightimpl(j) - iMo42roundToPx0680j_7;
                            } else {
                                iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j) - i42;
                            }
                            int i47 = iM3626getMaxWidthimpl;
                            BasicTooltipBox basicTooltipBox3 = new BasicTooltipBox(jM3645offsetNN6EwU, z, basicTooltipKtanchorSemantics111, baselineButtonTokens, iSerializer, iMo42roundToPx0680j_8, horizontal8, vertical4, i46, i45, IntOffset.m3795constructorimpl((((long) iMo42roundToPx0680j_4) << 32) | (((long) iMo42roundToPx0680j_6) & 4294967295L)), lazyListState);
                            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                            try {
                                E5 e5 = lazyListState4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                int iMediaSessionCompatQueueItem = e5.MediaSessionCompatQueueItem();
                                int i48 = moveBydefault.read(iMediaSessionCompatQueueItem, basicTooltipKtanchorSemantics111, e5.RemoteActionCompatParcelizer);
                                if (iMediaSessionCompatQueueItem != i48) {
                                    ((onHideTranslationui) ((getPlatformAndroidManager) e5.IconCompatParcelizer)).serializer(i48);
                                    ((ExtendedFabSmallTokens) e5.serializer).IconCompatParcelizer(iMediaSessionCompatQueueItem);
                                }
                                int iMediaDescriptionCompat = e5.MediaDescriptionCompat();
                                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                List listIconCompatParcelizer = MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer(basicTooltipKtanchorSemantics111, lazyListState4.PlaybackStateCompat, lazyListState4.RemoteActionCompatParcelizer);
                                if (!subcomposeMeasureScope2.isLookingAhead() && z22) {
                                    fFloatValue = ((Number) ((onShowTranslationui) ((UpdatableAnimationState) lazyListState4.write.write).write).getValue()).floatValue();
                                } else {
                                    fFloatValue = lazyListState4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                                }
                                LazyLayoutItemAnimator lazyLayoutItemAnimator = lazyListState4.MediaSessionCompatToken;
                                boolean zIsLookingAhead = subcomposeMeasureScope2.isLookingAhead();
                                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = lazyListState4.MediaSessionCompatResultReceiverWrapper;
                                if (i46 < 0) {
                                    TriStateCheckbox.read("invalid beforeContentPadding");
                                }
                                if (i45 < 0) {
                                    TriStateCheckbox.read("invalid afterContentPadding");
                                }
                                SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                                BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics112 = basicTooltipBox3.PlaybackStateCompatCustomAction;
                                boolean z24 = z;
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                                int i49 = iSerializer;
                                if (i49 <= 0) {
                                    int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(jM3645offsetNN6EwU);
                                    int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jM3645offsetNN6EwU);
                                    lazyLayoutItemAnimator.onMeasured(0, iM3628getMinWidthimpl, iM3627getMinHeightimpl, new ArrayList(), basicTooltipKtanchorSemantics112.serializer, basicTooltipBox3, z24, zIsLookingAhead, z22, 0, 0);
                                    if (!zIsLookingAhead) {
                                        long jM92getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                        if (!IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m3849getZeroYbymL2g())) {
                                            iM3628getMinWidthimpl = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                                            iM3627getMinHeightimpl = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                                        }
                                    }
                                    MeasureResult measureResultLayout = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, iM3628getMinWidthimpl + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3627getMinHeightimpl + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new accessisRelatedToAutoCommit(20));
                                    int i50 = -i46;
                                    if (z24) {
                                        selectionHandleIcon5 = SelectionHandleIcon.Vertical;
                                    } else {
                                        selectionHandleIcon5 = SelectionHandleIcon.Horizontal;
                                    }
                                    lazyListState3 = lazyListState4;
                                    lazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, measureResultLayout, 0.0f, false, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox3.MediaSessionCompatResultReceiverWrapper, instance_delegatelambda0Var, i50, i47 + i45, 0, selectionHandleIcon5, i45, iMo42roundToPx0680j_8);
                                    subcomposeMeasureScope = subcomposeMeasureScope2;
                                } else {
                                    lazyListState3 = lazyListState4;
                                    if (i48 >= i49) {
                                        i48 = i49 - 1;
                                        iMediaDescriptionCompat = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i51 = iMediaDescriptionCompat - iRound;
                                    if (i48 == 0 && i51 < 0) {
                                        iRound += i51;
                                        i51 = 0;
                                    }
                                    BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
                                    int i52 = -i46;
                                    int i53 = i52 + (iMo42roundToPx0680j_8 < 0 ? iMo42roundToPx0680j_8 : 0);
                                    int i54 = i51 + i53;
                                    int iMax2 = 0;
                                    while (true) {
                                        j2 = basicTooltipBox3.MediaSessionCompatResultReceiverWrapper;
                                        if (i54 >= 0 || i48 <= 0) {
                                            break;
                                        }
                                        int i55 = i52;
                                        int i56 = i48 - 1;
                                        LazyListMeasuredItem lazyListMeasuredItemWrite = basicTooltipBox3.write(i56, j2);
                                        brazeContentCardsManager.add(0, lazyListMeasuredItemWrite);
                                        iMax2 = Math.max(iMax2, lazyListMeasuredItemWrite.IconCompatParcelizer);
                                        i54 += lazyListMeasuredItemWrite.PlaybackStateCompatCustomAction;
                                        i48 = i56;
                                        i52 = i55;
                                    }
                                    int i57 = i52;
                                    if (i54 < i53) {
                                        iRound -= i53 - i54;
                                        i54 = i53;
                                    }
                                    int i58 = i54 - i53;
                                    int i59 = i47 + i45;
                                    int i60 = i59 < 0 ? 0 : i59;
                                    int i61 = i58;
                                    int i62 = -i58;
                                    int i63 = i48;
                                    int i64 = 0;
                                    boolean z25 = false;
                                    while (i64 < brazeContentCardsManager.RemoteActionCompatParcelizer) {
                                        if (i62 >= i60) {
                                            brazeContentCardsManager.IconCompatParcelizer(i64);
                                            z25 = true;
                                        } else {
                                            i63++;
                                            i62 += ((LazyListMeasuredItem) brazeContentCardsManager.get(i64)).PlaybackStateCompatCustomAction;
                                            i64++;
                                        }
                                    }
                                    int i65 = iMax2;
                                    boolean z26 = z25;
                                    int i66 = i63;
                                    while (i66 < i49 && (i62 < i60 || i62 <= 0 || brazeContentCardsManager.isEmpty())) {
                                        int i67 = i60;
                                        LazyListMeasuredItem lazyListMeasuredItemWrite2 = basicTooltipBox3.write(i66, j2);
                                        BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics113 = basicTooltipKtanchorSemantics112;
                                        int i68 = lazyListMeasuredItemWrite2.PlaybackStateCompatCustomAction;
                                        i62 += i68;
                                        if (i62 <= i53) {
                                            i41 = i53;
                                            if (i66 != i49 - 1) {
                                                i61 -= i68;
                                                i48 = i66 + 1;
                                                z26 = true;
                                            }
                                            i66++;
                                            i60 = i67;
                                            basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                            i53 = i41;
                                        } else {
                                            i41 = i53;
                                        }
                                        int iMax3 = Math.max(i65, lazyListMeasuredItemWrite2.IconCompatParcelizer);
                                        brazeContentCardsManager.addLast(lazyListMeasuredItemWrite2);
                                        i65 = iMax3;
                                        i66++;
                                        i60 = i67;
                                        basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                        i53 = i41;
                                    }
                                    BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics114 = basicTooltipKtanchorSemantics112;
                                    int i69 = i47;
                                    if (i62 < i69) {
                                        int i70 = i69 - i62;
                                        int i71 = i62 + i70;
                                        int iMax4 = i65;
                                        int i72 = i61 - i70;
                                        while (i72 < i46 && i48 > 0) {
                                            int i73 = i66;
                                            int i74 = i48 - 1;
                                            int i75 = i69;
                                            LazyListMeasuredItem lazyListMeasuredItemWrite3 = basicTooltipBox3.write(i74, j2);
                                            i48 = i74;
                                            brazeContentCardsManager.add(0, lazyListMeasuredItemWrite3);
                                            iMax4 = Math.max(iMax4, lazyListMeasuredItemWrite3.IconCompatParcelizer);
                                            i72 += lazyListMeasuredItemWrite3.PlaybackStateCompatCustomAction;
                                            i69 = i75;
                                            i66 = i73;
                                        }
                                        i26 = i66;
                                        i27 = i69;
                                        i29 = i70 + iRound;
                                        if (i72 < 0) {
                                            i29 += i72;
                                            i28 = i71 + i72;
                                            i65 = iMax4;
                                            i210 = i48;
                                            i211 = 0;
                                        } else {
                                            i28 = i71;
                                            i211 = i72;
                                            i65 = iMax4;
                                            i210 = i48;
                                        }
                                    } else {
                                        i26 = i66;
                                        i27 = i69;
                                        i28 = i62;
                                        i29 = iRound;
                                        i210 = i48;
                                        i211 = i61;
                                    }
                                    int i76 = i65;
                                    float f2 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i29) || Math.abs(Math.round(fFloatValue)) < Math.abs(i29)) ? fFloatValue : i29;
                                    float f3 = fFloatValue - f2;
                                    float f4 = (!zIsLookingAhead || i29 <= iRound || f3 > 0.0f) ? 0.0f : (i29 - iRound) + f3;
                                    if (i211 < 0) {
                                        TriStateCheckbox.read("negative currentFirstItemScrollOffset");
                                    }
                                    int i77 = -i211;
                                    LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) brazeContentCardsManager.read();
                                    if (i46 > 0 || iMo42roundToPx0680j_8 < 0) {
                                        int iIconCompatParcelizer = brazeContentCardsManager.IconCompatParcelizer();
                                        LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem2;
                                        int i78 = i211;
                                        int i79 = 0;
                                        while (true) {
                                            if (i79 < iIconCompatParcelizer) {
                                                int i80 = ((LazyListMeasuredItem) brazeContentCardsManager.get(i79)).PlaybackStateCompatCustomAction;
                                                if (i78 != 0 && i80 <= i78) {
                                                    int i81 = iIconCompatParcelizer;
                                                    i212 = 1;
                                                    if (i79 == brazeContentCardsManager.IconCompatParcelizer() - 1) {
                                                        break;
                                                    }
                                                    i78 -= i80;
                                                    i79++;
                                                    lazyListMeasuredItem3 = (LazyListMeasuredItem) brazeContentCardsManager.get(i79);
                                                    iIconCompatParcelizer = i81;
                                                }
                                            }
                                            i212 = 1;
                                            break;
                                        }
                                        i30 = i78;
                                        lazyListMeasuredItem = lazyListMeasuredItem3;
                                        i31 = 0;
                                    } else {
                                        i30 = i211;
                                        lazyListMeasuredItem = lazyListMeasuredItem2;
                                        i31 = 0;
                                        i212 = 1;
                                    }
                                    int iMax5 = Math.max(i31, i210);
                                    int i82 = i210 - i212;
                                    List arrayList3 = null;
                                    if (iMax5 <= i82) {
                                        while (true) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(basicTooltipBox3.write(i82, j2));
                                            if (i82 == iMax5) {
                                                break;
                                            }
                                            i82--;
                                        }
                                    }
                                    List list2 = listIconCompatParcelizer;
                                    int size = list2.size() - 1;
                                    if (size >= 0) {
                                        while (true) {
                                            int i83 = size - 1;
                                            int iIntValue = ((Number) listIconCompatParcelizer.get(size)).intValue();
                                            if (iIntValue < iMax5) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(basicTooltipBox3.write(iIntValue, j2));
                                            }
                                            if (i83 < 0) {
                                                break;
                                            }
                                            size = i83;
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = instance_delegatelambda0Var;
                                    }
                                    List list3 = arrayList3;
                                    float f5 = f2;
                                    int iMax6 = i76;
                                    int i84 = 0;
                                    for (int size2 = list3.size(); i84 < size2; size2 = size2) {
                                        iMax6 = Math.max(iMax6, ((LazyListMeasuredItem) arrayList3.get(i84)).IconCompatParcelizer);
                                        i84++;
                                    }
                                    int iMin = Math.min(((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat, i49 - 1);
                                    int i85 = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat + 1;
                                    if (i85 <= iMin) {
                                        List arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i32 = i49;
                                            i33 = iMax6;
                                            arrayList = arrayList4;
                                            arrayList.add(basicTooltipBox3.write(i85, j2));
                                            if (i85 == iMin) {
                                                break;
                                            }
                                            i85++;
                                            arrayList4 = arrayList;
                                            iMax6 = i33;
                                            i49 = i32;
                                        }
                                    } else {
                                        i32 = i49;
                                        i33 = iMax6;
                                        arrayList = null;
                                    }
                                    if (arrayList != null && ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat > iMin) {
                                        iMin = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat;
                                    }
                                    int size3 = list2.size();
                                    for (int i86 = 0; i86 < size3; i86++) {
                                        int iIntValue2 = ((Number) listIconCompatParcelizer.get(i86)).intValue();
                                        if (iIntValue2 > iMin) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(basicTooltipBox3.write(iIntValue2, j2));
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = instance_delegatelambda0Var;
                                    }
                                    List list4 = arrayList;
                                    int size4 = list4.size();
                                    int iMax7 = i33;
                                    for (int i87 = 0; i87 < size4; i87++) {
                                        iMax7 = Math.max(iMax7, ((LazyListMeasuredItem) arrayList.get(i87)).IconCompatParcelizer);
                                    }
                                    boolean z27 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lazyListMeasuredItem, brazeContentCardsManager.read()}, getCieXyz.write())).booleanValue() && arrayList3.isEmpty() && arrayList.isEmpty();
                                    int iM3643constrainWidthK40F9xA = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, z24 ? iMax7 : i28);
                                    if (z24) {
                                        iMax7 = i28;
                                    }
                                    int iM3642constrainHeightK40F9xA2 = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, iMax7);
                                    int i88 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                    int i89 = i27;
                                    boolean z28 = i28 < Math.min(i88, i89);
                                    if (z28 && i77 != 0) {
                                        TriStateCheckbox.RemoteActionCompatParcelizer("non-zero itemsScrollOffset");
                                    }
                                    LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem;
                                    ArrayList arrayList5 = new ArrayList(arrayList.size() + arrayList3.size() + brazeContentCardsManager.IconCompatParcelizer());
                                    if (z28) {
                                        if (!arrayList3.isEmpty() || !arrayList.isEmpty()) {
                                            TriStateCheckbox.read("no extra items");
                                        }
                                        int iIconCompatParcelizer2 = brazeContentCardsManager.IconCompatParcelizer();
                                        int[] iArr = new int[iIconCompatParcelizer2];
                                        for (int i90 = 0; i90 < iIconCompatParcelizer2; i90++) {
                                            iArr[i90] = ((LazyListMeasuredItem) brazeContentCardsManager.get(i90)).ComponentActivity;
                                        }
                                        int[] iArr2 = new int[iIconCompatParcelizer2];
                                        if (z24) {
                                            if (vertical11 != null) {
                                                vertical11.read(baselineButtonTokens, i88, iArr, iArr2);
                                                basicTooltipBox = basicTooltipBox3;
                                            } else {
                                                throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                            }
                                        } else if (horizontal9 != null) {
                                            basicTooltipBox = basicTooltipBox3;
                                            horizontal9.RemoteActionCompatParcelizer(baselineButtonTokens, i88, iArr, LayoutDirection.Ltr, iArr2);
                                        } else {
                                            throw af$$ExternalSyntheticOutline1.m("null horizontalArrangement when isVertical == false");
                                        }
                                        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(iArr2);
                                        int i91 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.read;
                                        int i92 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.serializer;
                                        if ((i92 > 0 && i91 >= 0) || (i92 < 0 && i91 <= 0)) {
                                            int i93 = 0;
                                            while (true) {
                                                int i94 = iArr2[i93];
                                                LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) brazeContentCardsManager.get(i93);
                                                lazyListMeasuredItem5.position(i94, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                                arrayList5.add(lazyListMeasuredItem5);
                                                if (i93 == i91) {
                                                    break;
                                                }
                                                i93 += i92;
                                            }
                                        }
                                    } else {
                                        z24 = z24;
                                        basicTooltipBox = basicTooltipBox3;
                                        int size5 = list3.size();
                                        int i95 = i77;
                                        int i96 = 0;
                                        while (i96 < size5) {
                                            LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayList3.get(i96);
                                            i95 -= lazyListMeasuredItem6.PlaybackStateCompatCustomAction;
                                            lazyListMeasuredItem6.position(i95, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem6);
                                            i96++;
                                            i77 = i77;
                                        }
                                        int i97 = i77;
                                        int iIconCompatParcelizer3 = brazeContentCardsManager.IconCompatParcelizer();
                                        int i98 = i97;
                                        for (int i99 = 0; i99 < iIconCompatParcelizer3; i99++) {
                                            LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) brazeContentCardsManager.get(i99);
                                            lazyListMeasuredItem7.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem7);
                                            i98 += lazyListMeasuredItem7.PlaybackStateCompatCustomAction;
                                        }
                                        int size6 = list4.size();
                                        for (int i100 = 0; i100 < size6; i100++) {
                                            LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem) arrayList.get(i100);
                                            lazyListMeasuredItem8.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem8);
                                            i98 += lazyListMeasuredItem8.PlaybackStateCompatCustomAction;
                                        }
                                    }
                                    float f6 = f5;
                                    lazyLayoutItemAnimator.onMeasured((int) f6, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2, arrayList5, basicTooltipKtanchorSemantics114.serializer, basicTooltipBox, z24, zIsLookingAhead, z22, i30, i28);
                                    if (zIsLookingAhead) {
                                        i34 = iM3643constrainWidthK40F9xA;
                                        iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                    } else {
                                        long jM92getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                        if (IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m3849getZeroYbymL2g())) {
                                            i34 = iM3643constrainWidthK40F9xA;
                                            iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                        } else {
                                            int i101 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                            int iM3643constrainWidthK40F9xA2 = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, Math.max(iM3643constrainWidthK40F9xA, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                                            iM3642constrainHeightK40F9xA = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, Math.max(iM3642constrainHeightK40F9xA2, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                                            int i102 = z24 ? iM3642constrainHeightK40F9xA : iM3643constrainWidthK40F9xA2;
                                            if (i102 != i101) {
                                                int size7 = arrayList5.size();
                                                for (int i103 = 0; i103 < size7; i103++) {
                                                    ((LazyListMeasuredItem) arrayList5.get(i103)).MediaSessionCompatResultReceiverWrapper = i102;
                                                }
                                            }
                                            i34 = iM3643constrainWidthK40F9xA2;
                                        }
                                    }
                                    LazyListMeasuredItem lazyListMeasuredItem9 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                    int i104 = lazyListMeasuredItem9 != null ? lazyListMeasuredItem9.MediaMetadataCompat : 0;
                                    LazyListMeasuredItem lazyListMeasuredItem10 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                    int i105 = lazyListMeasuredItem10 != null ? lazyListMeasuredItem10.MediaMetadataCompat : 0;
                                    basicTooltipKtanchorSemantics114.read.getClass();
                                    AnchoredDraggableKt anchoredDraggableKt2 = ContextMenuScope.write;
                                    if (draggableAnchorsNode4 == null || arrayList5.isEmpty() || (i36 = anchoredDraggableKt2.RemoteActionCompatParcelizer) == 0) {
                                        f = f6;
                                        i35 = i57;
                                        z21 = true;
                                        obj = instance_delegatelambda0Var;
                                    } else {
                                        if (i105 - i104 < 0 || i36 == 0) {
                                            anchoredDraggableKt = anchoredDraggableKt2;
                                        } else {
                                            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i36)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                                            int i106 = ensuresubscribedtoinappmessageeventslambda7.write;
                                            int i107 = ensuresubscribedtoinappmessageeventslambda7.read;
                                            if (i106 <= i107) {
                                                iRemoteActionCompatParcelizer = -1;
                                                while (anchoredDraggableKt2.RemoteActionCompatParcelizer(i106) <= i104) {
                                                    iRemoteActionCompatParcelizer = anchoredDraggableKt2.RemoteActionCompatParcelizer(i106);
                                                    if (i106 == i107) {
                                                        break;
                                                    }
                                                    i106++;
                                                }
                                                i40 = -1;
                                            } else {
                                                i40 = -1;
                                                iRemoteActionCompatParcelizer = -1;
                                            }
                                            if (iRemoteActionCompatParcelizer == i40) {
                                                anchoredDraggableKt = ContextMenuScope.write;
                                            } else {
                                                anchoredDraggableKt = new AnchoredDraggableKt(1);
                                                anchoredDraggableKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        ArrayList arrayList7 = new ArrayList(arrayList5.size());
                                        int size8 = arrayList5.size();
                                        int i108 = 0;
                                        while (i108 < size8) {
                                            Object obj3 = arrayList5.get(i108);
                                            int i109 = ((LazyListMeasuredItem) ((FabBaselineTokens) obj3)).MediaMetadataCompat;
                                            int i112 = size8;
                                            int[] iArr3 = anchoredDraggableKt2.read;
                                            int i113 = anchoredDraggableKt2.RemoteActionCompatParcelizer;
                                            AnchoredDraggableKt anchoredDraggableKt3 = anchoredDraggableKt2;
                                            int i114 = 0;
                                            while (i114 < i113) {
                                                int i115 = i113;
                                                if (iArr3[i114] == i109) {
                                                    arrayList7.add(obj3);
                                                    break;
                                                }
                                                i114++;
                                                i113 = i115;
                                            }
                                            i108++;
                                            size8 = i112;
                                            anchoredDraggableKt2 = anchoredDraggableKt3;
                                        }
                                        int[] iArr4 = anchoredDraggableKt.read;
                                        int i116 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                                        int i117 = 0;
                                        while (i117 < i116) {
                                            int i118 = iArr4[i117];
                                            Iterator it = arrayList5.iterator();
                                            int i119 = 0;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    i37 = -1;
                                                    i119 = -1;
                                                    break;
                                                }
                                                if (((LazyListMeasuredItem) ((FabBaselineTokens) it.next())).MediaMetadataCompat == i118) {
                                                    i37 = -1;
                                                    break;
                                                }
                                                i119++;
                                            }
                                            if (i119 == i37) {
                                                basicTooltipBox2 = basicTooltipBox;
                                                objWrite = basicTooltipBox2.write(i118, j2);
                                                i38 = i119;
                                            } else {
                                                i38 = i119;
                                                basicTooltipBox2 = basicTooltipBox;
                                                objWrite = (FabBaselineTokens) arrayList5.remove(i38);
                                            }
                                            int[] iArr5 = iArr4;
                                            Object obj4 = objWrite;
                                            LazyListMeasuredItem lazyListMeasuredItem11 = (LazyListMeasuredItem) obj4;
                                            int i1110 = lazyListMeasuredItem11.PlaybackStateCompatCustomAction;
                                            float f7 = f6;
                                            if (i38 == -1) {
                                                iM3801getXimpl = Integer.MIN_VALUE;
                                            } else {
                                                long jM91getOffsetBjo55l4 = lazyListMeasuredItem11.m91getOffsetBjo55l4(0);
                                                if (lazyListMeasuredItem11.MediaSessionCompatQueueItem) {
                                                    iM3801getXimpl = IntOffset.m3802getYimpl(jM91getOffsetBjo55l4);
                                                } else {
                                                    iM3801getXimpl = IntOffset.m3801getXimpl(jM91getOffsetBjo55l4);
                                                }
                                            }
                                            int size9 = arrayList7.size();
                                            basicTooltipBox = basicTooltipBox2;
                                            int i1111 = 0;
                                            while (true) {
                                                if (i1111 >= size9) {
                                                    arrayList2 = arrayList7;
                                                    obj2 = null;
                                                    break;
                                                }
                                                obj2 = arrayList7.get(i1111);
                                                arrayList2 = arrayList7;
                                                if (((LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaMetadataCompat != i118) {
                                                    break;
                                                }
                                                i1111++;
                                                arrayList7 = arrayList2;
                                            }
                                            FabBaselineTokens fabBaselineTokens = (FabBaselineTokens) obj2;
                                            if (fabBaselineTokens != null) {
                                                LazyListMeasuredItem lazyListMeasuredItem12 = (LazyListMeasuredItem) fabBaselineTokens;
                                                long jM91getOffsetBjo55l5 = lazyListMeasuredItem12.m91getOffsetBjo55l4(0);
                                                if (lazyListMeasuredItem12.MediaSessionCompatQueueItem) {
                                                    iM3801getXimpl2 = IntOffset.m3802getYimpl(jM91getOffsetBjo55l5);
                                                } else {
                                                    iM3801getXimpl2 = IntOffset.m3801getXimpl(jM91getOffsetBjo55l5);
                                                }
                                            } else {
                                                iM3801getXimpl2 = Integer.MIN_VALUE;
                                            }
                                            if (iM3801getXimpl == Integer.MIN_VALUE) {
                                                iMax = i57;
                                                i39 = iMax;
                                            } else {
                                                i39 = i57;
                                                iMax = Math.max(i39, iM3801getXimpl);
                                            }
                                            if (iM3801getXimpl2 != Integer.MIN_VALUE) {
                                                iMax = Math.min(iMax, iM3801getXimpl2 - i1110);
                                            }
                                            lazyListMeasuredItem11.ParcelableVolumeInfo = true;
                                            lazyListMeasuredItem11.position(iMax, i34, iM3642constrainHeightK40F9xA);
                                            arrayList6.add(obj4);
                                            i117++;
                                            i57 = i39;
                                            iArr4 = iArr5;
                                            i116 = i116;
                                            arrayList7 = arrayList2;
                                            f6 = f7;
                                        }
                                        f = f6;
                                        i35 = i57;
                                        z21 = true;
                                        obj = arrayList6;
                                    }
                                    if (z27) {
                                        LazyListMeasuredItem lazyListMeasuredItem13 = (LazyListMeasuredItem) onContentCardDismissed.MediaMetadataCompat((List) arrayList5);
                                        if (lazyListMeasuredItem13 != null) {
                                            numValueOf = Integer.valueOf(lazyListMeasuredItem13.MediaMetadataCompat);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        LazyListMeasuredItem lazyListMeasuredItem14 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                        if (lazyListMeasuredItem14 != null) {
                                            numValueOf = Integer.valueOf(lazyListMeasuredItem14.MediaMetadataCompat);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z27) {
                                        LazyListMeasuredItem lazyListMeasuredItem15 = (LazyListMeasuredItem) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList5);
                                        if (lazyListMeasuredItem15 != null) {
                                            numValueOf2 = Integer.valueOf(lazyListMeasuredItem15.MediaMetadataCompat);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        LazyListMeasuredItem lazyListMeasuredItem16 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                        if (lazyListMeasuredItem16 != null) {
                                            numValueOf2 = Integer.valueOf(lazyListMeasuredItem16.MediaMetadataCompat);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z29 = (i26 < i32 || i28 > i89) ? z21 : false;
                                    MeasureResult measureResultLayout2 = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, i34 + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3642constrainHeightK40F9xA + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(populateViewStructure_androidKtpopulate7, arrayList5, obj, zIsLookingAhead, 1));
                                    int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                                    int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                    if (arrayList5.isEmpty()) {
                                        list = instance_delegatelambda0Var;
                                    } else {
                                        ArrayList arrayList8 = new ArrayList((Collection) obj);
                                        int size10 = arrayList5.size();
                                        for (int i120 = 0; i120 < size10; i120++) {
                                            FabBaselineTokens fabBaselineTokens2 = (FabBaselineTokens) arrayList5.get(i120);
                                            int i121 = ((LazyListMeasuredItem) fabBaselineTokens2).MediaMetadataCompat;
                                            if (iIntValue3 <= i121 && i121 <= iIntValue4) {
                                                arrayList8.add(fabBaselineTokens2);
                                            }
                                        }
                                        BrazeContentCardsManagerCompanion.write(arrayList8, ExtendedFabPrimaryTokens.IconCompatParcelizer);
                                        list = arrayList8;
                                    }
                                    if (z24) {
                                        selectionHandleIcon4 = SelectionHandleIcon.Vertical;
                                    } else {
                                        selectionHandleIcon4 = SelectionHandleIcon.Horizontal;
                                    }
                                    subcomposeMeasureScope = subcomposeMeasureScope2;
                                    lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem4, i30, z29, f, measureResultLayout2, f4, z26, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox.MediaSessionCompatResultReceiverWrapper, list, i35, i59, i32, selectionHandleIcon4, i45, iMo42roundToPx0680j_8);
                                }
                                LazyListState lazyListState5 = lazyListState3;
                                lazyListState5.read(lazyListMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = lazyListState5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                return lazyListMeasureResult;
                            } catch (Throwable th) {
                                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                throw th;
                            }
                        }
                    };
                    getpostalcode.write(checkboxTokens4);
                    objComponentActivity4 = checkboxTokens4;
                }
                CheckboxTokens checkboxTokens5 = (CheckboxTokens) objComponentActivity4;
                if (z) {
                    selectionHandleIcon = SelectionHandleIcon.Vertical;
                } else {
                    selectionHandleIcon = SelectionHandleIcon.Horizontal;
                }
                selectionHandleIcon2 = selectionHandleIcon;
                if (z2 != 0) {
                    getpostalcode.serializer(-2077147368);
                    Modifier.Companion companion2 = Modifier.Companion;
                    lazyListState2 = lazyListState;
                    if ((i7 ^ 6) > 4) {
                        i10 = 0;
                        z19 = false;
                    } else {
                        i10 = 0;
                        z19 = false;
                    }
                    z20 = getpostalcode.read(i10);
                    objComponentActivity5 = getpostalcode.ComponentActivity();
                    if (!(z20 | z19)) {
                        objComponentActivity5 = new settle(lazyListState2);
                        getpostalcode.write(objComponentActivity5);
                    } else {
                        objComponentActivity5 = new settle(lazyListState2);
                        getpostalcode.write(objComponentActivity5);
                    }
                    modifierIconCompatParcelizer = ExtendedFabPrimaryTokens.IconCompatParcelizer(companion2, (settle) objComponentActivity5, lazyListState2.RemoteActionCompatParcelizer, selectionHandleIcon2);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    lazyListState2 = lazyListState;
                    getpostalcode.serializer(-2076718545);
                    getpostalcode.IconCompatParcelizer(false);
                    modifierIconCompatParcelizer = Modifier.Companion;
                }
                PullToRefreshModifierNodeupdate1.write(registerinappmessagemanagerlambda7, DefaultPagerNestedScrollConnection.RemoteActionCompatParcelizer(AbstractApplier.write(modifier.then(lazyListState2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4).then(lazyListState2.IconCompatParcelizer), registerinappmessagemanagerlambda7, smallIconButtonTokens2, selectionHandleIcon2, z2).then(modifierIconCompatParcelizer).then(lazyListState2.MediaSessionCompatToken.write), lazyListState, selectionHandleIcon2, isnotgestureactionfoundation, z2, constructorimplVar, lazyListState2.MediaMetadataCompat, null), lazyListState2.ResultReceiver, checkboxTokens5, getpostalcode, 0);
                horizontal3 = horizontal8;
                vertical3 = vertical10;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                horizontal3 = horizontal;
                vertical3 = vertical;
                vertical4 = vertical2;
                horizontal4 = horizontal2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Alignment.Vertical vertical11 = vertical4;
                final Arrangement.Horizontal horizontal9 = horizontal4;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.BasicTooltipKtTooltipPopup2
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                        androidx.compose.foundation.lazy.LazyListKt.LazyList(modifier, lazyListState, switchKt, z, constructorimplVar, z2, isnotgestureactionfoundation, horizontal3, vertical3, vertical11, horizontal9, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i16 |= 384;
        if ((i2 & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i12 = Fields.CameraDistance;
            }
            i16 |= i12;
        }
        if ((306783379 & i4) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (getpostalcode2.write(i4 & 1, z3)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                i6 = i4 & (-234881025);
                if (i13 != 0) {
                    horizontal5 = null;
                } else {
                    horizontal5 = horizontal;
                }
                if (i14 != 0) {
                    vertical5 = null;
                } else {
                    vertical5 = vertical;
                }
                if (i15 != 0) {
                    vertical6 = null;
                } else {
                    vertical6 = vertical2;
                }
                if (i17 != 0) {
                    vertical7 = vertical6;
                    horizontal6 = horizontal5;
                    horizontal7 = null;
                } else {
                    vertical7 = vertical6;
                    horizontal6 = horizontal5;
                    horizontal7 = horizontal2;
                }
            } else {
                i6 = i4 & (-234881025);
                if (i13 != 0) {
                    horizontal5 = null;
                } else {
                    horizontal5 = horizontal;
                }
                if (i14 != 0) {
                    vertical5 = null;
                } else {
                    vertical5 = vertical;
                }
                if (i15 != 0) {
                    vertical6 = null;
                } else {
                    vertical6 = vertical2;
                }
                if (i17 != 0) {
                    vertical7 = vertical6;
                    horizontal6 = horizontal5;
                    horizontal7 = null;
                } else {
                    vertical7 = vertical6;
                    horizontal6 = horizontal5;
                    horizontal7 = horizontal2;
                }
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            int i112 = i6 >> 3;
            i7 = i112 & 14;
            int i113 = i7 | ((i16 >> 6) & 112);
            populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode2);
            if (((i113 & 14) ^ 6) <= 4) {
            }
            objComponentActivity = getpostalcode2.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!z4) {
                AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable4 = new AnchoredDraggableKtanchoredDraggable1();
                anchoredDraggableKtanchoredDraggable4.RemoteActionCompatParcelizer = CompositionKt.read(Integer.MAX_VALUE);
                anchoredDraggableKtanchoredDraggable4.serializer = CompositionKt.read(Integer.MAX_VALUE);
                AndroidContentCaptureManager androidContentCaptureManager6 = AndroidContentCaptureManager.read;
                objComponentActivity = new MapboxNavigation.AnonymousClass10(0, 1, onViewAttachedToWindow.class, CompositionKt.serializer(androidContentCaptureManager6, new n$$ExternalSyntheticLambda3(CompositionKt.serializer(androidContentCaptureManager6, new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7Serializer, 1)), lazyListState, anchoredDraggableKtanchoredDraggable4, 2)), "value", "getValue()Ljava/lang/Object;");
                getpostalcode2.write(objComponentActivity);
            } else {
                AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable5 = new AnchoredDraggableKtanchoredDraggable1();
                anchoredDraggableKtanchoredDraggable5.RemoteActionCompatParcelizer = CompositionKt.read(Integer.MAX_VALUE);
                anchoredDraggableKtanchoredDraggable5.serializer = CompositionKt.read(Integer.MAX_VALUE);
                AndroidContentCaptureManager androidContentCaptureManager7 = AndroidContentCaptureManager.read;
                objComponentActivity = new MapboxNavigation.AnonymousClass10(0, 1, onViewAttachedToWindow.class, CompositionKt.serializer(androidContentCaptureManager7, new n$$ExternalSyntheticLambda3(CompositionKt.serializer(androidContentCaptureManager7, new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7Serializer, 1)), lazyListState, anchoredDraggableKtanchoredDraggable5, 2)), "value", "getValue()Ljava/lang/Object;");
                getpostalcode2.write(objComponentActivity);
            }
            registerinappmessagemanagerlambda7 = (registerInAppMessageManagerlambda7) objComponentActivity;
            int i26 = i6 >> 9;
            int i27 = i7 | (i26 & 112);
            if (((i27 & 14) ^ 6) <= 4) {
            }
            if (((i27 & 112) ^ 48) <= 32) {
            }
            objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (!(z6 | z5)) {
                objComponentActivity2 = new SmallIconButtonTokens(z) { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                    public final /* synthetic */ boolean IconCompatParcelizer;
                    public final getPersonLastName write;

                    @Override // o.SmallIconButtonTokens
                    public final CollectionInfo serializer() {
                        boolean z21 = this.IconCompatParcelizer;
                        getPersonLastName getpersonlastname = this.write;
                        return z21 ? new CollectionInfo(((Number) getpersonlastname.getValue()).intValue(), 1) : new CollectionInfo(1, ((Number) getpersonlastname.getValue()).intValue());
                    }

                    @Override // o.SmallIconButtonTokens
                    public final int IconCompatParcelizer() {
                        LazyListState lazyListState3 = this.serializer;
                        return (-((LazyListMeasureResult) lazyListState3.serializer()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys) + ((LazyListMeasureResult) lazyListState3.serializer()).write;
                    }

                    @Override // o.SmallIconButtonTokens
                    public final float RemoteActionCompatParcelizer() {
                        LazyListState lazyListState3 = this.serializer;
                        int iMediaSessionCompatQueueItem = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem();
                        int iMediaDescriptionCompat = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                        return lazyListState3.write() ? (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat + 100.0f : (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat;
                    }

                    @Override // o.SmallIconButtonTokens
                    public final float read() {
                        LazyListState lazyListState3 = this.serializer;
                        return (lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem() * Constant.ERROR_UNKNOWN) + lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                    }

                    @Override // o.SmallIconButtonTokens
                    public final Object scrollToItem(int i28, PagerState$scrollToPage$2 pagerState$scrollToPage$2) {
                        CardView$1 cardView$1 = LazyListState.read;
                        LazyListState lazyListState3 = this.serializer;
                        lazyListState3.getClass();
                        Object objScroll = lazyListState3.scroll(applyMeasureResultfoundation.Default, new BlockRunner$cancel$1(lazyListState3, i28, (ShortNewsContentCardView) null), pagerState$scrollToPage$2);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        if (objScroll != coroutineSingletons) {
                            objScroll = createfromparcel;
                        }
                        return objScroll == coroutineSingletons ? objScroll : createfromparcel;
                    }

                    @Override // o.SmallIconButtonTokens
                    public final int write() {
                        LazyListState lazyListState3 = this.serializer;
                        return (int) (((LazyListMeasureResult) lazyListState3.serializer()).MediaSessionCompatToken == SelectionHandleIcon.Vertical ? ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() & 4294967295L : ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() >> 32);
                    }

                    {
                        this.IconCompatParcelizer = z;
                        this.write = CompositionKt.serializer(new AnchoredDraggableStatedraggableState1drag2(this.serializer, 0));
                    }
                };
                getpostalcode2.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new SmallIconButtonTokens(z) { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                    public final /* synthetic */ boolean IconCompatParcelizer;
                    public final getPersonLastName write;

                    @Override // o.SmallIconButtonTokens
                    public final CollectionInfo serializer() {
                        boolean z21 = this.IconCompatParcelizer;
                        getPersonLastName getpersonlastname = this.write;
                        return z21 ? new CollectionInfo(((Number) getpersonlastname.getValue()).intValue(), 1) : new CollectionInfo(1, ((Number) getpersonlastname.getValue()).intValue());
                    }

                    @Override // o.SmallIconButtonTokens
                    public final int IconCompatParcelizer() {
                        LazyListState lazyListState3 = this.serializer;
                        return (-((LazyListMeasureResult) lazyListState3.serializer()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys) + ((LazyListMeasureResult) lazyListState3.serializer()).write;
                    }

                    @Override // o.SmallIconButtonTokens
                    public final float RemoteActionCompatParcelizer() {
                        LazyListState lazyListState3 = this.serializer;
                        int iMediaSessionCompatQueueItem = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem();
                        int iMediaDescriptionCompat = lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                        return lazyListState3.write() ? (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat + 100.0f : (iMediaSessionCompatQueueItem * Constant.ERROR_UNKNOWN) + iMediaDescriptionCompat;
                    }

                    @Override // o.SmallIconButtonTokens
                    public final float read() {
                        LazyListState lazyListState3 = this.serializer;
                        return (lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem() * Constant.ERROR_UNKNOWN) + lazyListState3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat();
                    }

                    @Override // o.SmallIconButtonTokens
                    public final Object scrollToItem(int i28, PagerState$scrollToPage$2 pagerState$scrollToPage$2) {
                        CardView$1 cardView$1 = LazyListState.read;
                        LazyListState lazyListState3 = this.serializer;
                        lazyListState3.getClass();
                        Object objScroll = lazyListState3.scroll(applyMeasureResultfoundation.Default, new BlockRunner$cancel$1(lazyListState3, i28, (ShortNewsContentCardView) null), pagerState$scrollToPage$2);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        if (objScroll != coroutineSingletons) {
                            objScroll = createfromparcel;
                        }
                        return objScroll == coroutineSingletons ? objScroll : createfromparcel;
                    }

                    @Override // o.SmallIconButtonTokens
                    public final int write() {
                        LazyListState lazyListState3 = this.serializer;
                        return (int) (((LazyListMeasureResult) lazyListState3.serializer()).MediaSessionCompatToken == SelectionHandleIcon.Vertical ? ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() & 4294967295L : ((LazyListMeasureResult) lazyListState3.serializer()).m90getViewportSizeYbymL2g() >> 32);
                    }

                    {
                        this.IconCompatParcelizer = z;
                        this.write = CompositionKt.serializer(new AnchoredDraggableStatedraggableState1drag2(this.serializer, 0));
                    }
                };
                getpostalcode2.write(objComponentActivity2);
            }
            SmallIconButtonTokens smallIconButtonTokens3 = (SmallIconButtonTokens) objComponentActivity2;
            objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity3);
            }
            getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity3;
            graphicsContext = (GraphicsContext) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalGraphicsContext());
            if (((Boolean) getpostalcode2.write(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue()) {
                draggableAnchorsNode = up.IconCompatParcelizer;
            } else {
                draggableAnchorsNode = null;
            }
            int i28 = i16 << 18;
            i8 = (i6 & 65520) | (i26 & 3670016) | (i28 & 29360128) | (i28 & 234881024) | ((i16 << 27) & 1879048192);
            if (((i8 & 112) ^ 48) <= 32) {
            }
            if (((i8 & 896) ^ 384) <= 256) {
            }
            if (((i8 & 7168) ^ 3072) <= 2048) {
            }
            if (((57344 & i8) ^ 24576) > 16384) {
                i9 = 0;
                z10 = false;
            } else {
                i9 = 0;
                z10 = false;
            }
            z11 = getpostalcode2.read(i9);
            if (((i8 & 3670016) ^ 1572864) <= 1048576) {
            }
            horizontal8 = horizontal6;
            if (((29360128 & i8) ^ 12582912) <= 8388608) {
            }
            vertical8 = vertical7;
            if (((234881024 & i8) ^ 100663296) <= 67108864) {
            }
            horizontal4 = horizontal7;
            if (((1879048192 & i8) ^ 805306368) <= 536870912) {
            }
            z16 = getpostalcode2.read(graphicsContext);
            z17 = getpostalcode2.read(draggableAnchorsNode);
            vertical9 = vertical5;
            objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (!(z12 | z8 | z7 | z9 | z10 | z11 | z13 | z14 | z15 | z16 | z17)) {
                vertical4 = vertical8;
                vertical10 = vertical9;
                getpostalcode = getpostalcode2;
                final DraggableAnchorsNode draggableAnchorsNode5 = draggableAnchorsNode;
                androidContentCaptureManager2 = androidContentCaptureManager;
                z18 = true;
                CheckboxTokens checkboxTokens6 = new CheckboxTokens() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                    /* JADX WARN: Code duplicated, block: B:292:0x0717  */
                    /* JADX WARN: Code duplicated, block: B:384:0x08e9  */
                    /* JADX WARN: Code duplicated, block: B:393:0x090e  */
                    @Override // o.CheckboxTokens
                    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
                    public final MeasureResult mo89measure0kLqBqw(BaselineButtonTokens baselineButtonTokens, long j) {
                        SelectionHandleIcon selectionHandleIcon3;
                        int iMo42roundToPx0680j_4;
                        int iMo42roundToPx0680j_5;
                        float fMo64getSpacingD9Ej5fM;
                        int iM3626getMaxWidthimpl;
                        float fFloatValue;
                        LazyListState lazyListState3;
                        long j2;
                        int i29;
                        int i210;
                        int i211;
                        int i212;
                        int i213;
                        int i214;
                        int i215;
                        int i30;
                        LazyListMeasuredItem lazyListMeasuredItem;
                        int i31;
                        int i32;
                        int i33;
                        List arrayList;
                        BasicTooltipBox basicTooltipBox;
                        int i34;
                        int iM3642constrainHeightK40F9xA;
                        float f;
                        int i35;
                        boolean z21;
                        Object obj;
                        Integer numValueOf;
                        Integer numValueOf2;
                        List list;
                        SelectionHandleIcon selectionHandleIcon4;
                        SubcomposeMeasureScope subcomposeMeasureScope;
                        LazyListMeasureResult lazyListMeasureResult;
                        int i36;
                        AnchoredDraggableKt anchoredDraggableKt;
                        int i37;
                        int i38;
                        BasicTooltipBox basicTooltipBox2;
                        Object objWrite;
                        int iM3801getXimpl;
                        ArrayList arrayList2;
                        Object obj2;
                        int iM3801getXimpl2;
                        int i39;
                        int iMax;
                        int i40;
                        int iRemoteActionCompatParcelizer;
                        int i41;
                        SelectionHandleIcon selectionHandleIcon5;
                        SubcomposeMeasureScope subcomposeMeasureScope2 = baselineButtonTokens.RemoteActionCompatParcelizer;
                        LazyListState lazyListState4 = lazyListState;
                        lazyListState4.PlaybackStateCompatCustomAction.getValue();
                        boolean z22 = lazyListState4.RatingCompat || subcomposeMeasureScope2.isLookingAhead();
                        boolean z23 = z;
                        if (z23) {
                            selectionHandleIcon3 = SelectionHandleIcon.Vertical;
                        } else {
                            selectionHandleIcon3 = SelectionHandleIcon.Horizontal;
                        }
                        getUptimeimpl.serializer(j, selectionHandleIcon3);
                        SwitchKt switchKt2 = switchKt;
                        if (z23) {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.read(subcomposeMeasureScope2.getLayoutDirection()));
                        } else {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.serializer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                        }
                        if (z23) {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.write(subcomposeMeasureScope2.getLayoutDirection()));
                        } else {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.IconCompatParcelizer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                        }
                        int iMo42roundToPx0680j_6 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.IconCompatParcelizer());
                        int iMo42roundToPx0680j_7 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.RemoteActionCompatParcelizer()) + iMo42roundToPx0680j_6;
                        int i42 = iMo42roundToPx0680j_4 + iMo42roundToPx0680j_5;
                        int i43 = z23 ? iMo42roundToPx0680j_7 : i42;
                        int i44 = z23 ? iMo42roundToPx0680j_6 : !z23 ? iMo42roundToPx0680j_4 : iMo42roundToPx0680j_5;
                        int i45 = i43 - i44;
                        long jM3645offsetNN6EwU = ConstraintsKt.m3645offsetNN6EwU(j, -i42, -iMo42roundToPx0680j_7);
                        BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111 = (BasicTooltipKtanchorSemantics111) registerinappmessagemanagerlambda7.invoke();
                        AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable6 = basicTooltipKtanchorSemantics111.IconCompatParcelizer;
                        int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(jM3645offsetNN6EwU);
                        int i46 = i44;
                        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(jM3645offsetNN6EwU);
                        ((onHideTranslationui) anchoredDraggableKtanchoredDraggable6.RemoteActionCompatParcelizer).serializer(iM3626getMaxWidthimpl2);
                        ((onHideTranslationui) anchoredDraggableKtanchoredDraggable6.serializer).serializer(iM3625getMaxHeightimpl);
                        Arrangement.Horizontal horizontal10 = horizontal4;
                        Arrangement.Vertical vertical12 = vertical10;
                        if (z23) {
                            if (vertical12 != null) {
                                fMo64getSpacingD9Ej5fM = vertical12.mo64getSpacingD9Ej5fM();
                            } else {
                                throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                            }
                        } else if (horizontal10 != null) {
                            fMo64getSpacingD9Ej5fM = horizontal10.mo64getSpacingD9Ej5fM();
                        } else {
                            throw af$$ExternalSyntheticOutline1.m("null horizontalAlignment when isVertical == false");
                        }
                        int iMo42roundToPx0680j_8 = subcomposeMeasureScope2.mo42roundToPx0680j_4(fMo64getSpacingD9Ej5fM);
                        int iSerializer = basicTooltipKtanchorSemantics111.serializer();
                        if (z23) {
                            iM3626getMaxWidthimpl = Constraints.m3625getMaxHeightimpl(j) - iMo42roundToPx0680j_7;
                        } else {
                            iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j) - i42;
                        }
                        int i47 = iM3626getMaxWidthimpl;
                        BasicTooltipBox basicTooltipBox3 = new BasicTooltipBox(jM3645offsetNN6EwU, z, basicTooltipKtanchorSemantics111, baselineButtonTokens, iSerializer, iMo42roundToPx0680j_8, horizontal8, vertical4, i46, i45, IntOffset.m3795constructorimpl((((long) iMo42roundToPx0680j_4) << 32) | (((long) iMo42roundToPx0680j_6) & 4294967295L)), lazyListState);
                        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                        try {
                            E5 e5 = lazyListState4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            int iMediaSessionCompatQueueItem = e5.MediaSessionCompatQueueItem();
                            int i48 = moveBydefault.read(iMediaSessionCompatQueueItem, basicTooltipKtanchorSemantics111, e5.RemoteActionCompatParcelizer);
                            if (iMediaSessionCompatQueueItem != i48) {
                                ((onHideTranslationui) ((getPlatformAndroidManager) e5.IconCompatParcelizer)).serializer(i48);
                                ((ExtendedFabSmallTokens) e5.serializer).IconCompatParcelizer(iMediaSessionCompatQueueItem);
                            }
                            int iMediaDescriptionCompat = e5.MediaDescriptionCompat();
                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                            List listIconCompatParcelizer = MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer(basicTooltipKtanchorSemantics111, lazyListState4.PlaybackStateCompat, lazyListState4.RemoteActionCompatParcelizer);
                            if (!subcomposeMeasureScope2.isLookingAhead() && z22) {
                                fFloatValue = ((Number) ((onShowTranslationui) ((UpdatableAnimationState) lazyListState4.write.write).write).getValue()).floatValue();
                            } else {
                                fFloatValue = lazyListState4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            }
                            LazyLayoutItemAnimator lazyLayoutItemAnimator = lazyListState4.MediaSessionCompatToken;
                            boolean zIsLookingAhead = subcomposeMeasureScope2.isLookingAhead();
                            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = lazyListState4.MediaSessionCompatResultReceiverWrapper;
                            if (i46 < 0) {
                                TriStateCheckbox.read("invalid beforeContentPadding");
                            }
                            if (i45 < 0) {
                                TriStateCheckbox.read("invalid afterContentPadding");
                            }
                            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                            BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics112 = basicTooltipBox3.PlaybackStateCompatCustomAction;
                            boolean z24 = z;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                            int i49 = iSerializer;
                            if (i49 <= 0) {
                                int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(jM3645offsetNN6EwU);
                                int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jM3645offsetNN6EwU);
                                lazyLayoutItemAnimator.onMeasured(0, iM3628getMinWidthimpl, iM3627getMinHeightimpl, new ArrayList(), basicTooltipKtanchorSemantics112.serializer, basicTooltipBox3, z24, zIsLookingAhead, z22, 0, 0);
                                if (!zIsLookingAhead) {
                                    long jM92getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                    if (!IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m3849getZeroYbymL2g())) {
                                        iM3628getMinWidthimpl = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                                        iM3627getMinHeightimpl = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                                    }
                                }
                                MeasureResult measureResultLayout = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, iM3628getMinWidthimpl + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3627getMinHeightimpl + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new accessisRelatedToAutoCommit(20));
                                int i50 = -i46;
                                if (z24) {
                                    selectionHandleIcon5 = SelectionHandleIcon.Vertical;
                                } else {
                                    selectionHandleIcon5 = SelectionHandleIcon.Horizontal;
                                }
                                lazyListState3 = lazyListState4;
                                lazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, measureResultLayout, 0.0f, false, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox3.MediaSessionCompatResultReceiverWrapper, instance_delegatelambda0Var, i50, i47 + i45, 0, selectionHandleIcon5, i45, iMo42roundToPx0680j_8);
                                subcomposeMeasureScope = subcomposeMeasureScope2;
                            } else {
                                lazyListState3 = lazyListState4;
                                if (i48 >= i49) {
                                    i48 = i49 - 1;
                                    iMediaDescriptionCompat = 0;
                                }
                                int iRound = Math.round(fFloatValue);
                                int i51 = iMediaDescriptionCompat - iRound;
                                if (i48 == 0 && i51 < 0) {
                                    iRound += i51;
                                    i51 = 0;
                                }
                                BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
                                int i52 = -i46;
                                int i53 = i52 + (iMo42roundToPx0680j_8 < 0 ? iMo42roundToPx0680j_8 : 0);
                                int i54 = i51 + i53;
                                int iMax2 = 0;
                                while (true) {
                                    j2 = basicTooltipBox3.MediaSessionCompatResultReceiverWrapper;
                                    if (i54 >= 0 || i48 <= 0) {
                                        break;
                                    }
                                    int i55 = i52;
                                    int i56 = i48 - 1;
                                    LazyListMeasuredItem lazyListMeasuredItemWrite = basicTooltipBox3.write(i56, j2);
                                    brazeContentCardsManager.add(0, lazyListMeasuredItemWrite);
                                    iMax2 = Math.max(iMax2, lazyListMeasuredItemWrite.IconCompatParcelizer);
                                    i54 += lazyListMeasuredItemWrite.PlaybackStateCompatCustomAction;
                                    i48 = i56;
                                    i52 = i55;
                                }
                                int i57 = i52;
                                if (i54 < i53) {
                                    iRound -= i53 - i54;
                                    i54 = i53;
                                }
                                int i58 = i54 - i53;
                                int i59 = i47 + i45;
                                int i60 = i59 < 0 ? 0 : i59;
                                int i61 = i58;
                                int i62 = -i58;
                                int i63 = i48;
                                int i64 = 0;
                                boolean z25 = false;
                                while (i64 < brazeContentCardsManager.RemoteActionCompatParcelizer) {
                                    if (i62 >= i60) {
                                        brazeContentCardsManager.IconCompatParcelizer(i64);
                                        z25 = true;
                                    } else {
                                        i63++;
                                        i62 += ((LazyListMeasuredItem) brazeContentCardsManager.get(i64)).PlaybackStateCompatCustomAction;
                                        i64++;
                                    }
                                }
                                int i65 = iMax2;
                                boolean z26 = z25;
                                int i66 = i63;
                                while (i66 < i49 && (i62 < i60 || i62 <= 0 || brazeContentCardsManager.isEmpty())) {
                                    int i67 = i60;
                                    LazyListMeasuredItem lazyListMeasuredItemWrite2 = basicTooltipBox3.write(i66, j2);
                                    BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics113 = basicTooltipKtanchorSemantics112;
                                    int i68 = lazyListMeasuredItemWrite2.PlaybackStateCompatCustomAction;
                                    i62 += i68;
                                    if (i62 <= i53) {
                                        i41 = i53;
                                        if (i66 != i49 - 1) {
                                            i61 -= i68;
                                            i48 = i66 + 1;
                                            z26 = true;
                                        }
                                        i66++;
                                        i60 = i67;
                                        basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                        i53 = i41;
                                    } else {
                                        i41 = i53;
                                    }
                                    int iMax3 = Math.max(i65, lazyListMeasuredItemWrite2.IconCompatParcelizer);
                                    brazeContentCardsManager.addLast(lazyListMeasuredItemWrite2);
                                    i65 = iMax3;
                                    i66++;
                                    i60 = i67;
                                    basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                    i53 = i41;
                                }
                                BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics114 = basicTooltipKtanchorSemantics112;
                                int i69 = i47;
                                if (i62 < i69) {
                                    int i70 = i69 - i62;
                                    int i71 = i62 + i70;
                                    int iMax4 = i65;
                                    int i72 = i61 - i70;
                                    while (i72 < i46 && i48 > 0) {
                                        int i73 = i66;
                                        int i74 = i48 - 1;
                                        int i75 = i69;
                                        LazyListMeasuredItem lazyListMeasuredItemWrite3 = basicTooltipBox3.write(i74, j2);
                                        i48 = i74;
                                        brazeContentCardsManager.add(0, lazyListMeasuredItemWrite3);
                                        iMax4 = Math.max(iMax4, lazyListMeasuredItemWrite3.IconCompatParcelizer);
                                        i72 += lazyListMeasuredItemWrite3.PlaybackStateCompatCustomAction;
                                        i69 = i75;
                                        i66 = i73;
                                    }
                                    i29 = i66;
                                    i210 = i69;
                                    i212 = i70 + iRound;
                                    if (i72 < 0) {
                                        i212 += i72;
                                        i211 = i71 + i72;
                                        i65 = iMax4;
                                        i213 = i48;
                                        i214 = 0;
                                    } else {
                                        i211 = i71;
                                        i214 = i72;
                                        i65 = iMax4;
                                        i213 = i48;
                                    }
                                } else {
                                    i29 = i66;
                                    i210 = i69;
                                    i211 = i62;
                                    i212 = iRound;
                                    i213 = i48;
                                    i214 = i61;
                                }
                                int i76 = i65;
                                float f2 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i212) || Math.abs(Math.round(fFloatValue)) < Math.abs(i212)) ? fFloatValue : i212;
                                float f3 = fFloatValue - f2;
                                float f4 = (!zIsLookingAhead || i212 <= iRound || f3 > 0.0f) ? 0.0f : (i212 - iRound) + f3;
                                if (i214 < 0) {
                                    TriStateCheckbox.read("negative currentFirstItemScrollOffset");
                                }
                                int i77 = -i214;
                                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) brazeContentCardsManager.read();
                                if (i46 > 0 || iMo42roundToPx0680j_8 < 0) {
                                    int iIconCompatParcelizer = brazeContentCardsManager.IconCompatParcelizer();
                                    LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem2;
                                    int i78 = i214;
                                    int i79 = 0;
                                    while (true) {
                                        if (i79 < iIconCompatParcelizer) {
                                            int i80 = ((LazyListMeasuredItem) brazeContentCardsManager.get(i79)).PlaybackStateCompatCustomAction;
                                            if (i78 != 0 && i80 <= i78) {
                                                int i81 = iIconCompatParcelizer;
                                                i215 = 1;
                                                if (i79 == brazeContentCardsManager.IconCompatParcelizer() - 1) {
                                                    break;
                                                }
                                                i78 -= i80;
                                                i79++;
                                                lazyListMeasuredItem3 = (LazyListMeasuredItem) brazeContentCardsManager.get(i79);
                                                iIconCompatParcelizer = i81;
                                            }
                                        }
                                        i215 = 1;
                                        break;
                                    }
                                    i30 = i78;
                                    lazyListMeasuredItem = lazyListMeasuredItem3;
                                    i31 = 0;
                                } else {
                                    i30 = i214;
                                    lazyListMeasuredItem = lazyListMeasuredItem2;
                                    i31 = 0;
                                    i215 = 1;
                                }
                                int iMax5 = Math.max(i31, i213);
                                int i82 = i213 - i215;
                                List arrayList3 = null;
                                if (iMax5 <= i82) {
                                    while (true) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(basicTooltipBox3.write(i82, j2));
                                        if (i82 == iMax5) {
                                            break;
                                        }
                                        i82--;
                                    }
                                }
                                List list2 = listIconCompatParcelizer;
                                int size = list2.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i83 = size - 1;
                                        int iIntValue = ((Number) listIconCompatParcelizer.get(size)).intValue();
                                        if (iIntValue < iMax5) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(basicTooltipBox3.write(iIntValue, j2));
                                        }
                                        if (i83 < 0) {
                                            break;
                                        }
                                        size = i83;
                                    }
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = instance_delegatelambda0Var;
                                }
                                List list3 = arrayList3;
                                float f5 = f2;
                                int iMax6 = i76;
                                int i84 = 0;
                                for (int size2 = list3.size(); i84 < size2; size2 = size2) {
                                    iMax6 = Math.max(iMax6, ((LazyListMeasuredItem) arrayList3.get(i84)).IconCompatParcelizer);
                                    i84++;
                                }
                                int iMin = Math.min(((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat, i49 - 1);
                                int i85 = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat + 1;
                                if (i85 <= iMin) {
                                    List arrayList4 = null;
                                    while (true) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        i32 = i49;
                                        i33 = iMax6;
                                        arrayList = arrayList4;
                                        arrayList.add(basicTooltipBox3.write(i85, j2));
                                        if (i85 == iMin) {
                                            break;
                                        }
                                        i85++;
                                        arrayList4 = arrayList;
                                        iMax6 = i33;
                                        i49 = i32;
                                    }
                                } else {
                                    i32 = i49;
                                    i33 = iMax6;
                                    arrayList = null;
                                }
                                if (arrayList != null && ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat > iMin) {
                                    iMin = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat;
                                }
                                int size3 = list2.size();
                                for (int i86 = 0; i86 < size3; i86++) {
                                    int iIntValue2 = ((Number) listIconCompatParcelizer.get(i86)).intValue();
                                    if (iIntValue2 > iMin) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(basicTooltipBox3.write(iIntValue2, j2));
                                    }
                                }
                                if (arrayList == null) {
                                    arrayList = instance_delegatelambda0Var;
                                }
                                List list4 = arrayList;
                                int size4 = list4.size();
                                int iMax7 = i33;
                                for (int i87 = 0; i87 < size4; i87++) {
                                    iMax7 = Math.max(iMax7, ((LazyListMeasuredItem) arrayList.get(i87)).IconCompatParcelizer);
                                }
                                boolean z27 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lazyListMeasuredItem, brazeContentCardsManager.read()}, getCieXyz.write())).booleanValue() && arrayList3.isEmpty() && arrayList.isEmpty();
                                int iM3643constrainWidthK40F9xA = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, z24 ? iMax7 : i211);
                                if (z24) {
                                    iMax7 = i211;
                                }
                                int iM3642constrainHeightK40F9xA2 = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, iMax7);
                                int i88 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                int i89 = i210;
                                boolean z28 = i211 < Math.min(i88, i89);
                                if (z28 && i77 != 0) {
                                    TriStateCheckbox.RemoteActionCompatParcelizer("non-zero itemsScrollOffset");
                                }
                                LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem;
                                ArrayList arrayList5 = new ArrayList(arrayList.size() + arrayList3.size() + brazeContentCardsManager.IconCompatParcelizer());
                                if (z28) {
                                    if (!arrayList3.isEmpty() || !arrayList.isEmpty()) {
                                        TriStateCheckbox.read("no extra items");
                                    }
                                    int iIconCompatParcelizer2 = brazeContentCardsManager.IconCompatParcelizer();
                                    int[] iArr = new int[iIconCompatParcelizer2];
                                    for (int i90 = 0; i90 < iIconCompatParcelizer2; i90++) {
                                        iArr[i90] = ((LazyListMeasuredItem) brazeContentCardsManager.get(i90)).ComponentActivity;
                                    }
                                    int[] iArr2 = new int[iIconCompatParcelizer2];
                                    if (z24) {
                                        if (vertical12 != null) {
                                            vertical12.read(baselineButtonTokens, i88, iArr, iArr2);
                                            basicTooltipBox = basicTooltipBox3;
                                        } else {
                                            throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                        }
                                    } else if (horizontal10 != null) {
                                        basicTooltipBox = basicTooltipBox3;
                                        horizontal10.RemoteActionCompatParcelizer(baselineButtonTokens, i88, iArr, LayoutDirection.Ltr, iArr2);
                                    } else {
                                        throw af$$ExternalSyntheticOutline1.m("null horizontalArrangement when isVertical == false");
                                    }
                                    ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(iArr2);
                                    int i91 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.read;
                                    int i92 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.serializer;
                                    if ((i92 > 0 && i91 >= 0) || (i92 < 0 && i91 <= 0)) {
                                        int i93 = 0;
                                        while (true) {
                                            int i94 = iArr2[i93];
                                            LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) brazeContentCardsManager.get(i93);
                                            lazyListMeasuredItem5.position(i94, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem5);
                                            if (i93 == i91) {
                                                break;
                                            }
                                            i93 += i92;
                                        }
                                    }
                                } else {
                                    z24 = z24;
                                    basicTooltipBox = basicTooltipBox3;
                                    int size5 = list3.size();
                                    int i95 = i77;
                                    int i96 = 0;
                                    while (i96 < size5) {
                                        LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayList3.get(i96);
                                        i95 -= lazyListMeasuredItem6.PlaybackStateCompatCustomAction;
                                        lazyListMeasuredItem6.position(i95, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                        arrayList5.add(lazyListMeasuredItem6);
                                        i96++;
                                        i77 = i77;
                                    }
                                    int i97 = i77;
                                    int iIconCompatParcelizer3 = brazeContentCardsManager.IconCompatParcelizer();
                                    int i98 = i97;
                                    for (int i99 = 0; i99 < iIconCompatParcelizer3; i99++) {
                                        LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) brazeContentCardsManager.get(i99);
                                        lazyListMeasuredItem7.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                        arrayList5.add(lazyListMeasuredItem7);
                                        i98 += lazyListMeasuredItem7.PlaybackStateCompatCustomAction;
                                    }
                                    int size6 = list4.size();
                                    for (int i100 = 0; i100 < size6; i100++) {
                                        LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem) arrayList.get(i100);
                                        lazyListMeasuredItem8.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                        arrayList5.add(lazyListMeasuredItem8);
                                        i98 += lazyListMeasuredItem8.PlaybackStateCompatCustomAction;
                                    }
                                }
                                float f6 = f5;
                                lazyLayoutItemAnimator.onMeasured((int) f6, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2, arrayList5, basicTooltipKtanchorSemantics114.serializer, basicTooltipBox, z24, zIsLookingAhead, z22, i30, i211);
                                if (zIsLookingAhead) {
                                    i34 = iM3643constrainWidthK40F9xA;
                                    iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                } else {
                                    long jM92getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                    if (IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m3849getZeroYbymL2g())) {
                                        i34 = iM3643constrainWidthK40F9xA;
                                        iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                    } else {
                                        int i101 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                        int iM3643constrainWidthK40F9xA2 = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, Math.max(iM3643constrainWidthK40F9xA, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                                        iM3642constrainHeightK40F9xA = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, Math.max(iM3642constrainHeightK40F9xA2, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                                        int i102 = z24 ? iM3642constrainHeightK40F9xA : iM3643constrainWidthK40F9xA2;
                                        if (i102 != i101) {
                                            int size7 = arrayList5.size();
                                            for (int i103 = 0; i103 < size7; i103++) {
                                                ((LazyListMeasuredItem) arrayList5.get(i103)).MediaSessionCompatResultReceiverWrapper = i102;
                                            }
                                        }
                                        i34 = iM3643constrainWidthK40F9xA2;
                                    }
                                }
                                LazyListMeasuredItem lazyListMeasuredItem9 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                int i104 = lazyListMeasuredItem9 != null ? lazyListMeasuredItem9.MediaMetadataCompat : 0;
                                LazyListMeasuredItem lazyListMeasuredItem10 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                int i105 = lazyListMeasuredItem10 != null ? lazyListMeasuredItem10.MediaMetadataCompat : 0;
                                basicTooltipKtanchorSemantics114.read.getClass();
                                AnchoredDraggableKt anchoredDraggableKt2 = ContextMenuScope.write;
                                if (draggableAnchorsNode5 == null || arrayList5.isEmpty() || (i36 = anchoredDraggableKt2.RemoteActionCompatParcelizer) == 0) {
                                    f = f6;
                                    i35 = i57;
                                    z21 = true;
                                    obj = instance_delegatelambda0Var;
                                } else {
                                    if (i105 - i104 < 0 || i36 == 0) {
                                        anchoredDraggableKt = anchoredDraggableKt2;
                                    } else {
                                        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i36)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                                        int i106 = ensuresubscribedtoinappmessageeventslambda7.write;
                                        int i107 = ensuresubscribedtoinappmessageeventslambda7.read;
                                        if (i106 <= i107) {
                                            iRemoteActionCompatParcelizer = -1;
                                            while (anchoredDraggableKt2.RemoteActionCompatParcelizer(i106) <= i104) {
                                                iRemoteActionCompatParcelizer = anchoredDraggableKt2.RemoteActionCompatParcelizer(i106);
                                                if (i106 == i107) {
                                                    break;
                                                }
                                                i106++;
                                            }
                                            i40 = -1;
                                        } else {
                                            i40 = -1;
                                            iRemoteActionCompatParcelizer = -1;
                                        }
                                        if (iRemoteActionCompatParcelizer == i40) {
                                            anchoredDraggableKt = ContextMenuScope.write;
                                        } else {
                                            anchoredDraggableKt = new AnchoredDraggableKt(1);
                                            anchoredDraggableKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList(arrayList5.size());
                                    int size8 = arrayList5.size();
                                    int i108 = 0;
                                    while (i108 < size8) {
                                        Object obj3 = arrayList5.get(i108);
                                        int i109 = ((LazyListMeasuredItem) ((FabBaselineTokens) obj3)).MediaMetadataCompat;
                                        int i114 = size8;
                                        int[] iArr3 = anchoredDraggableKt2.read;
                                        int i115 = anchoredDraggableKt2.RemoteActionCompatParcelizer;
                                        AnchoredDraggableKt anchoredDraggableKt3 = anchoredDraggableKt2;
                                        int i116 = 0;
                                        while (i116 < i115) {
                                            int i117 = i115;
                                            if (iArr3[i116] == i109) {
                                                arrayList7.add(obj3);
                                                break;
                                            }
                                            i116++;
                                            i115 = i117;
                                        }
                                        i108++;
                                        size8 = i114;
                                        anchoredDraggableKt2 = anchoredDraggableKt3;
                                    }
                                    int[] iArr4 = anchoredDraggableKt.read;
                                    int i118 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                                    int i119 = 0;
                                    while (i119 < i118) {
                                        int i1110 = iArr4[i119];
                                        Iterator it = arrayList5.iterator();
                                        int i1111 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i37 = -1;
                                                i1111 = -1;
                                                break;
                                            }
                                            if (((LazyListMeasuredItem) ((FabBaselineTokens) it.next())).MediaMetadataCompat == i1110) {
                                                i37 = -1;
                                                break;
                                            }
                                            i1111++;
                                        }
                                        if (i1111 == i37) {
                                            basicTooltipBox2 = basicTooltipBox;
                                            objWrite = basicTooltipBox2.write(i1110, j2);
                                            i38 = i1111;
                                        } else {
                                            i38 = i1111;
                                            basicTooltipBox2 = basicTooltipBox;
                                            objWrite = (FabBaselineTokens) arrayList5.remove(i38);
                                        }
                                        int[] iArr5 = iArr4;
                                        Object obj4 = objWrite;
                                        LazyListMeasuredItem lazyListMeasuredItem11 = (LazyListMeasuredItem) obj4;
                                        int i1112 = lazyListMeasuredItem11.PlaybackStateCompatCustomAction;
                                        float f7 = f6;
                                        if (i38 == -1) {
                                            iM3801getXimpl = Integer.MIN_VALUE;
                                        } else {
                                            long jM91getOffsetBjo55l4 = lazyListMeasuredItem11.m91getOffsetBjo55l4(0);
                                            if (lazyListMeasuredItem11.MediaSessionCompatQueueItem) {
                                                iM3801getXimpl = IntOffset.m3802getYimpl(jM91getOffsetBjo55l4);
                                            } else {
                                                iM3801getXimpl = IntOffset.m3801getXimpl(jM91getOffsetBjo55l4);
                                            }
                                        }
                                        int size9 = arrayList7.size();
                                        basicTooltipBox = basicTooltipBox2;
                                        int i1113 = 0;
                                        while (true) {
                                            if (i1113 >= size9) {
                                                arrayList2 = arrayList7;
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = arrayList7.get(i1113);
                                            arrayList2 = arrayList7;
                                            if (((LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaMetadataCompat != i1110) {
                                                break;
                                            }
                                            i1113++;
                                            arrayList7 = arrayList2;
                                        }
                                        FabBaselineTokens fabBaselineTokens = (FabBaselineTokens) obj2;
                                        if (fabBaselineTokens != null) {
                                            LazyListMeasuredItem lazyListMeasuredItem12 = (LazyListMeasuredItem) fabBaselineTokens;
                                            long jM91getOffsetBjo55l5 = lazyListMeasuredItem12.m91getOffsetBjo55l4(0);
                                            if (lazyListMeasuredItem12.MediaSessionCompatQueueItem) {
                                                iM3801getXimpl2 = IntOffset.m3802getYimpl(jM91getOffsetBjo55l5);
                                            } else {
                                                iM3801getXimpl2 = IntOffset.m3801getXimpl(jM91getOffsetBjo55l5);
                                            }
                                        } else {
                                            iM3801getXimpl2 = Integer.MIN_VALUE;
                                        }
                                        if (iM3801getXimpl == Integer.MIN_VALUE) {
                                            iMax = i57;
                                            i39 = iMax;
                                        } else {
                                            i39 = i57;
                                            iMax = Math.max(i39, iM3801getXimpl);
                                        }
                                        if (iM3801getXimpl2 != Integer.MIN_VALUE) {
                                            iMax = Math.min(iMax, iM3801getXimpl2 - i1112);
                                        }
                                        lazyListMeasuredItem11.ParcelableVolumeInfo = true;
                                        lazyListMeasuredItem11.position(iMax, i34, iM3642constrainHeightK40F9xA);
                                        arrayList6.add(obj4);
                                        i119++;
                                        i57 = i39;
                                        iArr4 = iArr5;
                                        i118 = i118;
                                        arrayList7 = arrayList2;
                                        f6 = f7;
                                    }
                                    f = f6;
                                    i35 = i57;
                                    z21 = true;
                                    obj = arrayList6;
                                }
                                if (z27) {
                                    LazyListMeasuredItem lazyListMeasuredItem13 = (LazyListMeasuredItem) onContentCardDismissed.MediaMetadataCompat((List) arrayList5);
                                    if (lazyListMeasuredItem13 != null) {
                                        numValueOf = Integer.valueOf(lazyListMeasuredItem13.MediaMetadataCompat);
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    LazyListMeasuredItem lazyListMeasuredItem14 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                    if (lazyListMeasuredItem14 != null) {
                                        numValueOf = Integer.valueOf(lazyListMeasuredItem14.MediaMetadataCompat);
                                    } else {
                                        numValueOf = null;
                                    }
                                }
                                if (z27) {
                                    LazyListMeasuredItem lazyListMeasuredItem15 = (LazyListMeasuredItem) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList5);
                                    if (lazyListMeasuredItem15 != null) {
                                        numValueOf2 = Integer.valueOf(lazyListMeasuredItem15.MediaMetadataCompat);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                } else {
                                    LazyListMeasuredItem lazyListMeasuredItem16 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                    if (lazyListMeasuredItem16 != null) {
                                        numValueOf2 = Integer.valueOf(lazyListMeasuredItem16.MediaMetadataCompat);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                }
                                boolean z29 = (i29 < i32 || i211 > i89) ? z21 : false;
                                MeasureResult measureResultLayout2 = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, i34 + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3642constrainHeightK40F9xA + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(populateViewStructure_androidKtpopulate7, arrayList5, obj, zIsLookingAhead, 1));
                                int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                                int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                if (arrayList5.isEmpty()) {
                                    list = instance_delegatelambda0Var;
                                } else {
                                    ArrayList arrayList8 = new ArrayList((Collection) obj);
                                    int size10 = arrayList5.size();
                                    for (int i120 = 0; i120 < size10; i120++) {
                                        FabBaselineTokens fabBaselineTokens2 = (FabBaselineTokens) arrayList5.get(i120);
                                        int i121 = ((LazyListMeasuredItem) fabBaselineTokens2).MediaMetadataCompat;
                                        if (iIntValue3 <= i121 && i121 <= iIntValue4) {
                                            arrayList8.add(fabBaselineTokens2);
                                        }
                                    }
                                    BrazeContentCardsManagerCompanion.write(arrayList8, ExtendedFabPrimaryTokens.IconCompatParcelizer);
                                    list = arrayList8;
                                }
                                if (z24) {
                                    selectionHandleIcon4 = SelectionHandleIcon.Vertical;
                                } else {
                                    selectionHandleIcon4 = SelectionHandleIcon.Horizontal;
                                }
                                subcomposeMeasureScope = subcomposeMeasureScope2;
                                lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem4, i30, z29, f, measureResultLayout2, f4, z26, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox.MediaSessionCompatResultReceiverWrapper, list, i35, i59, i32, selectionHandleIcon4, i45, iMo42roundToPx0680j_8);
                            }
                            LazyListState lazyListState5 = lazyListState3;
                            lazyListState5.read(lazyListMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                            AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = lazyListState5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            return lazyListMeasureResult;
                        } catch (Throwable th) {
                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                            throw th;
                        }
                    }
                };
                getpostalcode.write(checkboxTokens6);
                objComponentActivity4 = checkboxTokens6;
            } else {
                vertical4 = vertical8;
                vertical10 = vertical9;
                getpostalcode = getpostalcode2;
                final DraggableAnchorsNode draggableAnchorsNode6 = draggableAnchorsNode;
                androidContentCaptureManager2 = androidContentCaptureManager;
                z18 = true;
                CheckboxTokens checkboxTokens7 = new CheckboxTokens() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                    /* JADX WARN: Code duplicated, block: B:292:0x0717  */
                    /* JADX WARN: Code duplicated, block: B:384:0x08e9  */
                    /* JADX WARN: Code duplicated, block: B:393:0x090e  */
                    @Override // o.CheckboxTokens
                    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
                    public final MeasureResult mo89measure0kLqBqw(BaselineButtonTokens baselineButtonTokens, long j) {
                        SelectionHandleIcon selectionHandleIcon3;
                        int iMo42roundToPx0680j_4;
                        int iMo42roundToPx0680j_5;
                        float fMo64getSpacingD9Ej5fM;
                        int iM3626getMaxWidthimpl;
                        float fFloatValue;
                        LazyListState lazyListState3;
                        long j2;
                        int i29;
                        int i210;
                        int i211;
                        int i212;
                        int i213;
                        int i214;
                        int i215;
                        int i30;
                        LazyListMeasuredItem lazyListMeasuredItem;
                        int i31;
                        int i32;
                        int i33;
                        List arrayList;
                        BasicTooltipBox basicTooltipBox;
                        int i34;
                        int iM3642constrainHeightK40F9xA;
                        float f;
                        int i35;
                        boolean z21;
                        Object obj;
                        Integer numValueOf;
                        Integer numValueOf2;
                        List list;
                        SelectionHandleIcon selectionHandleIcon4;
                        SubcomposeMeasureScope subcomposeMeasureScope;
                        LazyListMeasureResult lazyListMeasureResult;
                        int i36;
                        AnchoredDraggableKt anchoredDraggableKt;
                        int i37;
                        int i38;
                        BasicTooltipBox basicTooltipBox2;
                        Object objWrite;
                        int iM3801getXimpl;
                        ArrayList arrayList2;
                        Object obj2;
                        int iM3801getXimpl2;
                        int i39;
                        int iMax;
                        int i40;
                        int iRemoteActionCompatParcelizer;
                        int i41;
                        SelectionHandleIcon selectionHandleIcon5;
                        SubcomposeMeasureScope subcomposeMeasureScope2 = baselineButtonTokens.RemoteActionCompatParcelizer;
                        LazyListState lazyListState4 = lazyListState;
                        lazyListState4.PlaybackStateCompatCustomAction.getValue();
                        boolean z22 = lazyListState4.RatingCompat || subcomposeMeasureScope2.isLookingAhead();
                        boolean z23 = z;
                        if (z23) {
                            selectionHandleIcon3 = SelectionHandleIcon.Vertical;
                        } else {
                            selectionHandleIcon3 = SelectionHandleIcon.Horizontal;
                        }
                        getUptimeimpl.serializer(j, selectionHandleIcon3);
                        SwitchKt switchKt2 = switchKt;
                        if (z23) {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.read(subcomposeMeasureScope2.getLayoutDirection()));
                        } else {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.serializer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                        }
                        if (z23) {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.write(subcomposeMeasureScope2.getLayoutDirection()));
                        } else {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope2.mo42roundToPx0680j_4(PaddingKt.IconCompatParcelizer(switchKt2, subcomposeMeasureScope2.getLayoutDirection()));
                        }
                        int iMo42roundToPx0680j_6 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.IconCompatParcelizer());
                        int iMo42roundToPx0680j_7 = subcomposeMeasureScope2.mo42roundToPx0680j_4(switchKt2.RemoteActionCompatParcelizer()) + iMo42roundToPx0680j_6;
                        int i42 = iMo42roundToPx0680j_4 + iMo42roundToPx0680j_5;
                        int i43 = z23 ? iMo42roundToPx0680j_7 : i42;
                        int i44 = z23 ? iMo42roundToPx0680j_6 : !z23 ? iMo42roundToPx0680j_4 : iMo42roundToPx0680j_5;
                        int i45 = i43 - i44;
                        long jM3645offsetNN6EwU = ConstraintsKt.m3645offsetNN6EwU(j, -i42, -iMo42roundToPx0680j_7);
                        BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111 = (BasicTooltipKtanchorSemantics111) registerinappmessagemanagerlambda7.invoke();
                        AnchoredDraggableKtanchoredDraggable1 anchoredDraggableKtanchoredDraggable6 = basicTooltipKtanchorSemantics111.IconCompatParcelizer;
                        int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(jM3645offsetNN6EwU);
                        int i46 = i44;
                        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(jM3645offsetNN6EwU);
                        ((onHideTranslationui) anchoredDraggableKtanchoredDraggable6.RemoteActionCompatParcelizer).serializer(iM3626getMaxWidthimpl2);
                        ((onHideTranslationui) anchoredDraggableKtanchoredDraggable6.serializer).serializer(iM3625getMaxHeightimpl);
                        Arrangement.Horizontal horizontal10 = horizontal4;
                        Arrangement.Vertical vertical12 = vertical10;
                        if (z23) {
                            if (vertical12 != null) {
                                fMo64getSpacingD9Ej5fM = vertical12.mo64getSpacingD9Ej5fM();
                            } else {
                                throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                            }
                        } else if (horizontal10 != null) {
                            fMo64getSpacingD9Ej5fM = horizontal10.mo64getSpacingD9Ej5fM();
                        } else {
                            throw af$$ExternalSyntheticOutline1.m("null horizontalAlignment when isVertical == false");
                        }
                        int iMo42roundToPx0680j_8 = subcomposeMeasureScope2.mo42roundToPx0680j_4(fMo64getSpacingD9Ej5fM);
                        int iSerializer = basicTooltipKtanchorSemantics111.serializer();
                        if (z23) {
                            iM3626getMaxWidthimpl = Constraints.m3625getMaxHeightimpl(j) - iMo42roundToPx0680j_7;
                        } else {
                            iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j) - i42;
                        }
                        int i47 = iM3626getMaxWidthimpl;
                        BasicTooltipBox basicTooltipBox3 = new BasicTooltipBox(jM3645offsetNN6EwU, z, basicTooltipKtanchorSemantics111, baselineButtonTokens, iSerializer, iMo42roundToPx0680j_8, horizontal8, vertical4, i46, i45, IntOffset.m3795constructorimpl((((long) iMo42roundToPx0680j_4) << 32) | (((long) iMo42roundToPx0680j_6) & 4294967295L)), lazyListState);
                        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                        try {
                            E5 e5 = lazyListState4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            int iMediaSessionCompatQueueItem = e5.MediaSessionCompatQueueItem();
                            int i48 = moveBydefault.read(iMediaSessionCompatQueueItem, basicTooltipKtanchorSemantics111, e5.RemoteActionCompatParcelizer);
                            if (iMediaSessionCompatQueueItem != i48) {
                                ((onHideTranslationui) ((getPlatformAndroidManager) e5.IconCompatParcelizer)).serializer(i48);
                                ((ExtendedFabSmallTokens) e5.serializer).IconCompatParcelizer(iMediaSessionCompatQueueItem);
                            }
                            int iMediaDescriptionCompat = e5.MediaDescriptionCompat();
                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                            List listIconCompatParcelizer = MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer(basicTooltipKtanchorSemantics111, lazyListState4.PlaybackStateCompat, lazyListState4.RemoteActionCompatParcelizer);
                            if (!subcomposeMeasureScope2.isLookingAhead() && z22) {
                                fFloatValue = ((Number) ((onShowTranslationui) ((UpdatableAnimationState) lazyListState4.write.write).write).getValue()).floatValue();
                            } else {
                                fFloatValue = lazyListState4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            }
                            LazyLayoutItemAnimator lazyLayoutItemAnimator = lazyListState4.MediaSessionCompatToken;
                            boolean zIsLookingAhead = subcomposeMeasureScope2.isLookingAhead();
                            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = lazyListState4.MediaSessionCompatResultReceiverWrapper;
                            if (i46 < 0) {
                                TriStateCheckbox.read("invalid beforeContentPadding");
                            }
                            if (i45 < 0) {
                                TriStateCheckbox.read("invalid afterContentPadding");
                            }
                            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                            BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics112 = basicTooltipBox3.PlaybackStateCompatCustomAction;
                            boolean z24 = z;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                            int i49 = iSerializer;
                            if (i49 <= 0) {
                                int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(jM3645offsetNN6EwU);
                                int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jM3645offsetNN6EwU);
                                lazyLayoutItemAnimator.onMeasured(0, iM3628getMinWidthimpl, iM3627getMinHeightimpl, new ArrayList(), basicTooltipKtanchorSemantics112.serializer, basicTooltipBox3, z24, zIsLookingAhead, z22, 0, 0);
                                if (!zIsLookingAhead) {
                                    long jM92getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                    if (!IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m3849getZeroYbymL2g())) {
                                        iM3628getMinWidthimpl = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                                        iM3627getMinHeightimpl = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                                    }
                                }
                                MeasureResult measureResultLayout = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, iM3628getMinWidthimpl + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3627getMinHeightimpl + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new accessisRelatedToAutoCommit(20));
                                int i50 = -i46;
                                if (z24) {
                                    selectionHandleIcon5 = SelectionHandleIcon.Vertical;
                                } else {
                                    selectionHandleIcon5 = SelectionHandleIcon.Horizontal;
                                }
                                lazyListState3 = lazyListState4;
                                lazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, measureResultLayout, 0.0f, false, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox3.MediaSessionCompatResultReceiverWrapper, instance_delegatelambda0Var, i50, i47 + i45, 0, selectionHandleIcon5, i45, iMo42roundToPx0680j_8);
                                subcomposeMeasureScope = subcomposeMeasureScope2;
                            } else {
                                lazyListState3 = lazyListState4;
                                if (i48 >= i49) {
                                    i48 = i49 - 1;
                                    iMediaDescriptionCompat = 0;
                                }
                                int iRound = Math.round(fFloatValue);
                                int i51 = iMediaDescriptionCompat - iRound;
                                if (i48 == 0 && i51 < 0) {
                                    iRound += i51;
                                    i51 = 0;
                                }
                                BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
                                int i52 = -i46;
                                int i53 = i52 + (iMo42roundToPx0680j_8 < 0 ? iMo42roundToPx0680j_8 : 0);
                                int i54 = i51 + i53;
                                int iMax2 = 0;
                                while (true) {
                                    j2 = basicTooltipBox3.MediaSessionCompatResultReceiverWrapper;
                                    if (i54 >= 0 || i48 <= 0) {
                                        break;
                                    }
                                    int i55 = i52;
                                    int i56 = i48 - 1;
                                    LazyListMeasuredItem lazyListMeasuredItemWrite = basicTooltipBox3.write(i56, j2);
                                    brazeContentCardsManager.add(0, lazyListMeasuredItemWrite);
                                    iMax2 = Math.max(iMax2, lazyListMeasuredItemWrite.IconCompatParcelizer);
                                    i54 += lazyListMeasuredItemWrite.PlaybackStateCompatCustomAction;
                                    i48 = i56;
                                    i52 = i55;
                                }
                                int i57 = i52;
                                if (i54 < i53) {
                                    iRound -= i53 - i54;
                                    i54 = i53;
                                }
                                int i58 = i54 - i53;
                                int i59 = i47 + i45;
                                int i60 = i59 < 0 ? 0 : i59;
                                int i61 = i58;
                                int i62 = -i58;
                                int i63 = i48;
                                int i64 = 0;
                                boolean z25 = false;
                                while (i64 < brazeContentCardsManager.RemoteActionCompatParcelizer) {
                                    if (i62 >= i60) {
                                        brazeContentCardsManager.IconCompatParcelizer(i64);
                                        z25 = true;
                                    } else {
                                        i63++;
                                        i62 += ((LazyListMeasuredItem) brazeContentCardsManager.get(i64)).PlaybackStateCompatCustomAction;
                                        i64++;
                                    }
                                }
                                int i65 = iMax2;
                                boolean z26 = z25;
                                int i66 = i63;
                                while (i66 < i49 && (i62 < i60 || i62 <= 0 || brazeContentCardsManager.isEmpty())) {
                                    int i67 = i60;
                                    LazyListMeasuredItem lazyListMeasuredItemWrite2 = basicTooltipBox3.write(i66, j2);
                                    BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics113 = basicTooltipKtanchorSemantics112;
                                    int i68 = lazyListMeasuredItemWrite2.PlaybackStateCompatCustomAction;
                                    i62 += i68;
                                    if (i62 <= i53) {
                                        i41 = i53;
                                        if (i66 != i49 - 1) {
                                            i61 -= i68;
                                            i48 = i66 + 1;
                                            z26 = true;
                                        }
                                        i66++;
                                        i60 = i67;
                                        basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                        i53 = i41;
                                    } else {
                                        i41 = i53;
                                    }
                                    int iMax3 = Math.max(i65, lazyListMeasuredItemWrite2.IconCompatParcelizer);
                                    brazeContentCardsManager.addLast(lazyListMeasuredItemWrite2);
                                    i65 = iMax3;
                                    i66++;
                                    i60 = i67;
                                    basicTooltipKtanchorSemantics112 = basicTooltipKtanchorSemantics113;
                                    i53 = i41;
                                }
                                BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics114 = basicTooltipKtanchorSemantics112;
                                int i69 = i47;
                                if (i62 < i69) {
                                    int i70 = i69 - i62;
                                    int i71 = i62 + i70;
                                    int iMax4 = i65;
                                    int i72 = i61 - i70;
                                    while (i72 < i46 && i48 > 0) {
                                        int i73 = i66;
                                        int i74 = i48 - 1;
                                        int i75 = i69;
                                        LazyListMeasuredItem lazyListMeasuredItemWrite3 = basicTooltipBox3.write(i74, j2);
                                        i48 = i74;
                                        brazeContentCardsManager.add(0, lazyListMeasuredItemWrite3);
                                        iMax4 = Math.max(iMax4, lazyListMeasuredItemWrite3.IconCompatParcelizer);
                                        i72 += lazyListMeasuredItemWrite3.PlaybackStateCompatCustomAction;
                                        i69 = i75;
                                        i66 = i73;
                                    }
                                    i29 = i66;
                                    i210 = i69;
                                    i212 = i70 + iRound;
                                    if (i72 < 0) {
                                        i212 += i72;
                                        i211 = i71 + i72;
                                        i65 = iMax4;
                                        i213 = i48;
                                        i214 = 0;
                                    } else {
                                        i211 = i71;
                                        i214 = i72;
                                        i65 = iMax4;
                                        i213 = i48;
                                    }
                                } else {
                                    i29 = i66;
                                    i210 = i69;
                                    i211 = i62;
                                    i212 = iRound;
                                    i213 = i48;
                                    i214 = i61;
                                }
                                int i76 = i65;
                                float f2 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i212) || Math.abs(Math.round(fFloatValue)) < Math.abs(i212)) ? fFloatValue : i212;
                                float f3 = fFloatValue - f2;
                                float f4 = (!zIsLookingAhead || i212 <= iRound || f3 > 0.0f) ? 0.0f : (i212 - iRound) + f3;
                                if (i214 < 0) {
                                    TriStateCheckbox.read("negative currentFirstItemScrollOffset");
                                }
                                int i77 = -i214;
                                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) brazeContentCardsManager.read();
                                if (i46 > 0 || iMo42roundToPx0680j_8 < 0) {
                                    int iIconCompatParcelizer = brazeContentCardsManager.IconCompatParcelizer();
                                    LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem2;
                                    int i78 = i214;
                                    int i79 = 0;
                                    while (true) {
                                        if (i79 < iIconCompatParcelizer) {
                                            int i80 = ((LazyListMeasuredItem) brazeContentCardsManager.get(i79)).PlaybackStateCompatCustomAction;
                                            if (i78 != 0 && i80 <= i78) {
                                                int i81 = iIconCompatParcelizer;
                                                i215 = 1;
                                                if (i79 == brazeContentCardsManager.IconCompatParcelizer() - 1) {
                                                    break;
                                                }
                                                i78 -= i80;
                                                i79++;
                                                lazyListMeasuredItem3 = (LazyListMeasuredItem) brazeContentCardsManager.get(i79);
                                                iIconCompatParcelizer = i81;
                                            }
                                        }
                                        i215 = 1;
                                        break;
                                    }
                                    i30 = i78;
                                    lazyListMeasuredItem = lazyListMeasuredItem3;
                                    i31 = 0;
                                } else {
                                    i30 = i214;
                                    lazyListMeasuredItem = lazyListMeasuredItem2;
                                    i31 = 0;
                                    i215 = 1;
                                }
                                int iMax5 = Math.max(i31, i213);
                                int i82 = i213 - i215;
                                List arrayList3 = null;
                                if (iMax5 <= i82) {
                                    while (true) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(basicTooltipBox3.write(i82, j2));
                                        if (i82 == iMax5) {
                                            break;
                                        }
                                        i82--;
                                    }
                                }
                                List list2 = listIconCompatParcelizer;
                                int size = list2.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i83 = size - 1;
                                        int iIntValue = ((Number) listIconCompatParcelizer.get(size)).intValue();
                                        if (iIntValue < iMax5) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(basicTooltipBox3.write(iIntValue, j2));
                                        }
                                        if (i83 < 0) {
                                            break;
                                        }
                                        size = i83;
                                    }
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = instance_delegatelambda0Var;
                                }
                                List list3 = arrayList3;
                                float f5 = f2;
                                int iMax6 = i76;
                                int i84 = 0;
                                for (int size2 = list3.size(); i84 < size2; size2 = size2) {
                                    iMax6 = Math.max(iMax6, ((LazyListMeasuredItem) arrayList3.get(i84)).IconCompatParcelizer);
                                    i84++;
                                }
                                int iMin = Math.min(((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat, i49 - 1);
                                int i85 = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat((List) brazeContentCardsManager)).MediaMetadataCompat + 1;
                                if (i85 <= iMin) {
                                    List arrayList4 = null;
                                    while (true) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        i32 = i49;
                                        i33 = iMax6;
                                        arrayList = arrayList4;
                                        arrayList.add(basicTooltipBox3.write(i85, j2));
                                        if (i85 == iMin) {
                                            break;
                                        }
                                        i85++;
                                        arrayList4 = arrayList;
                                        iMax6 = i33;
                                        i49 = i32;
                                    }
                                } else {
                                    i32 = i49;
                                    i33 = iMax6;
                                    arrayList = null;
                                }
                                if (arrayList != null && ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat > iMin) {
                                    iMin = ((LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(arrayList)).MediaMetadataCompat;
                                }
                                int size3 = list2.size();
                                for (int i86 = 0; i86 < size3; i86++) {
                                    int iIntValue2 = ((Number) listIconCompatParcelizer.get(i86)).intValue();
                                    if (iIntValue2 > iMin) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(basicTooltipBox3.write(iIntValue2, j2));
                                    }
                                }
                                if (arrayList == null) {
                                    arrayList = instance_delegatelambda0Var;
                                }
                                List list4 = arrayList;
                                int size4 = list4.size();
                                int iMax7 = i33;
                                for (int i87 = 0; i87 < size4; i87++) {
                                    iMax7 = Math.max(iMax7, ((LazyListMeasuredItem) arrayList.get(i87)).IconCompatParcelizer);
                                }
                                boolean z27 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lazyListMeasuredItem, brazeContentCardsManager.read()}, getCieXyz.write())).booleanValue() && arrayList3.isEmpty() && arrayList.isEmpty();
                                int iM3643constrainWidthK40F9xA = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, z24 ? iMax7 : i211);
                                if (z24) {
                                    iMax7 = i211;
                                }
                                int iM3642constrainHeightK40F9xA2 = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, iMax7);
                                int i88 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                int i89 = i210;
                                boolean z28 = i211 < Math.min(i88, i89);
                                if (z28 && i77 != 0) {
                                    TriStateCheckbox.RemoteActionCompatParcelizer("non-zero itemsScrollOffset");
                                }
                                LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem;
                                ArrayList arrayList5 = new ArrayList(arrayList.size() + arrayList3.size() + brazeContentCardsManager.IconCompatParcelizer());
                                if (z28) {
                                    if (!arrayList3.isEmpty() || !arrayList.isEmpty()) {
                                        TriStateCheckbox.read("no extra items");
                                    }
                                    int iIconCompatParcelizer2 = brazeContentCardsManager.IconCompatParcelizer();
                                    int[] iArr = new int[iIconCompatParcelizer2];
                                    for (int i90 = 0; i90 < iIconCompatParcelizer2; i90++) {
                                        iArr[i90] = ((LazyListMeasuredItem) brazeContentCardsManager.get(i90)).ComponentActivity;
                                    }
                                    int[] iArr2 = new int[iIconCompatParcelizer2];
                                    if (z24) {
                                        if (vertical12 != null) {
                                            vertical12.read(baselineButtonTokens, i88, iArr, iArr2);
                                            basicTooltipBox = basicTooltipBox3;
                                        } else {
                                            throw af$$ExternalSyntheticOutline1.m("null verticalArrangement when isVertical == true");
                                        }
                                    } else if (horizontal10 != null) {
                                        basicTooltipBox = basicTooltipBox3;
                                        horizontal10.RemoteActionCompatParcelizer(baselineButtonTokens, i88, iArr, LayoutDirection.Ltr, iArr2);
                                    } else {
                                        throw af$$ExternalSyntheticOutline1.m("null horizontalArrangement when isVertical == false");
                                    }
                                    ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(iArr2);
                                    int i91 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.read;
                                    int i92 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.serializer;
                                    if ((i92 > 0 && i91 >= 0) || (i92 < 0 && i91 <= 0)) {
                                        int i93 = 0;
                                        while (true) {
                                            int i94 = iArr2[i93];
                                            LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) brazeContentCardsManager.get(i93);
                                            lazyListMeasuredItem5.position(i94, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                            arrayList5.add(lazyListMeasuredItem5);
                                            if (i93 == i91) {
                                                break;
                                            }
                                            i93 += i92;
                                        }
                                    }
                                } else {
                                    z24 = z24;
                                    basicTooltipBox = basicTooltipBox3;
                                    int size5 = list3.size();
                                    int i95 = i77;
                                    int i96 = 0;
                                    while (i96 < size5) {
                                        LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayList3.get(i96);
                                        i95 -= lazyListMeasuredItem6.PlaybackStateCompatCustomAction;
                                        lazyListMeasuredItem6.position(i95, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                        arrayList5.add(lazyListMeasuredItem6);
                                        i96++;
                                        i77 = i77;
                                    }
                                    int i97 = i77;
                                    int iIconCompatParcelizer3 = brazeContentCardsManager.IconCompatParcelizer();
                                    int i98 = i97;
                                    for (int i99 = 0; i99 < iIconCompatParcelizer3; i99++) {
                                        LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) brazeContentCardsManager.get(i99);
                                        lazyListMeasuredItem7.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                        arrayList5.add(lazyListMeasuredItem7);
                                        i98 += lazyListMeasuredItem7.PlaybackStateCompatCustomAction;
                                    }
                                    int size6 = list4.size();
                                    for (int i100 = 0; i100 < size6; i100++) {
                                        LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem) arrayList.get(i100);
                                        lazyListMeasuredItem8.position(i98, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2);
                                        arrayList5.add(lazyListMeasuredItem8);
                                        i98 += lazyListMeasuredItem8.PlaybackStateCompatCustomAction;
                                    }
                                }
                                float f6 = f5;
                                lazyLayoutItemAnimator.onMeasured((int) f6, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA2, arrayList5, basicTooltipKtanchorSemantics114.serializer, basicTooltipBox, z24, zIsLookingAhead, z22, i30, i211);
                                if (zIsLookingAhead) {
                                    i34 = iM3643constrainWidthK40F9xA;
                                    iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                } else {
                                    long jM92getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m92getMinSizeToFitDisappearingItemsYbymL2g();
                                    if (IntSize.m3842equalsimpl0(jM92getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m3849getZeroYbymL2g())) {
                                        i34 = iM3643constrainWidthK40F9xA;
                                        iM3642constrainHeightK40F9xA = iM3642constrainHeightK40F9xA2;
                                    } else {
                                        int i101 = z24 ? iM3642constrainHeightK40F9xA2 : iM3643constrainWidthK40F9xA;
                                        int iM3643constrainWidthK40F9xA2 = ConstraintsKt.m3643constrainWidthK40F9xA(jM3645offsetNN6EwU, Math.max(iM3643constrainWidthK40F9xA, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                                        iM3642constrainHeightK40F9xA = ConstraintsKt.m3642constrainHeightK40F9xA(jM3645offsetNN6EwU, Math.max(iM3642constrainHeightK40F9xA2, (int) (jM92getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                                        int i102 = z24 ? iM3642constrainHeightK40F9xA : iM3643constrainWidthK40F9xA2;
                                        if (i102 != i101) {
                                            int size7 = arrayList5.size();
                                            for (int i103 = 0; i103 < size7; i103++) {
                                                ((LazyListMeasuredItem) arrayList5.get(i103)).MediaSessionCompatResultReceiverWrapper = i102;
                                            }
                                        }
                                        i34 = iM3643constrainWidthK40F9xA2;
                                    }
                                }
                                LazyListMeasuredItem lazyListMeasuredItem9 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                int i104 = lazyListMeasuredItem9 != null ? lazyListMeasuredItem9.MediaMetadataCompat : 0;
                                LazyListMeasuredItem lazyListMeasuredItem10 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                int i105 = lazyListMeasuredItem10 != null ? lazyListMeasuredItem10.MediaMetadataCompat : 0;
                                basicTooltipKtanchorSemantics114.read.getClass();
                                AnchoredDraggableKt anchoredDraggableKt2 = ContextMenuScope.write;
                                if (draggableAnchorsNode6 == null || arrayList5.isEmpty() || (i36 = anchoredDraggableKt2.RemoteActionCompatParcelizer) == 0) {
                                    f = f6;
                                    i35 = i57;
                                    z21 = true;
                                    obj = instance_delegatelambda0Var;
                                } else {
                                    if (i105 - i104 < 0 || i36 == 0) {
                                        anchoredDraggableKt = anchoredDraggableKt2;
                                    } else {
                                        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i36)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                                        int i106 = ensuresubscribedtoinappmessageeventslambda7.write;
                                        int i107 = ensuresubscribedtoinappmessageeventslambda7.read;
                                        if (i106 <= i107) {
                                            iRemoteActionCompatParcelizer = -1;
                                            while (anchoredDraggableKt2.RemoteActionCompatParcelizer(i106) <= i104) {
                                                iRemoteActionCompatParcelizer = anchoredDraggableKt2.RemoteActionCompatParcelizer(i106);
                                                if (i106 == i107) {
                                                    break;
                                                }
                                                i106++;
                                            }
                                            i40 = -1;
                                        } else {
                                            i40 = -1;
                                            iRemoteActionCompatParcelizer = -1;
                                        }
                                        if (iRemoteActionCompatParcelizer == i40) {
                                            anchoredDraggableKt = ContextMenuScope.write;
                                        } else {
                                            anchoredDraggableKt = new AnchoredDraggableKt(1);
                                            anchoredDraggableKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList(arrayList5.size());
                                    int size8 = arrayList5.size();
                                    int i108 = 0;
                                    while (i108 < size8) {
                                        Object obj3 = arrayList5.get(i108);
                                        int i109 = ((LazyListMeasuredItem) ((FabBaselineTokens) obj3)).MediaMetadataCompat;
                                        int i114 = size8;
                                        int[] iArr3 = anchoredDraggableKt2.read;
                                        int i115 = anchoredDraggableKt2.RemoteActionCompatParcelizer;
                                        AnchoredDraggableKt anchoredDraggableKt3 = anchoredDraggableKt2;
                                        int i116 = 0;
                                        while (i116 < i115) {
                                            int i117 = i115;
                                            if (iArr3[i116] == i109) {
                                                arrayList7.add(obj3);
                                                break;
                                            }
                                            i116++;
                                            i115 = i117;
                                        }
                                        i108++;
                                        size8 = i114;
                                        anchoredDraggableKt2 = anchoredDraggableKt3;
                                    }
                                    int[] iArr4 = anchoredDraggableKt.read;
                                    int i118 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                                    int i119 = 0;
                                    while (i119 < i118) {
                                        int i1110 = iArr4[i119];
                                        Iterator it = arrayList5.iterator();
                                        int i1111 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i37 = -1;
                                                i1111 = -1;
                                                break;
                                            }
                                            if (((LazyListMeasuredItem) ((FabBaselineTokens) it.next())).MediaMetadataCompat == i1110) {
                                                i37 = -1;
                                                break;
                                            }
                                            i1111++;
                                        }
                                        if (i1111 == i37) {
                                            basicTooltipBox2 = basicTooltipBox;
                                            objWrite = basicTooltipBox2.write(i1110, j2);
                                            i38 = i1111;
                                        } else {
                                            i38 = i1111;
                                            basicTooltipBox2 = basicTooltipBox;
                                            objWrite = (FabBaselineTokens) arrayList5.remove(i38);
                                        }
                                        int[] iArr5 = iArr4;
                                        Object obj4 = objWrite;
                                        LazyListMeasuredItem lazyListMeasuredItem11 = (LazyListMeasuredItem) obj4;
                                        int i1112 = lazyListMeasuredItem11.PlaybackStateCompatCustomAction;
                                        float f7 = f6;
                                        if (i38 == -1) {
                                            iM3801getXimpl = Integer.MIN_VALUE;
                                        } else {
                                            long jM91getOffsetBjo55l4 = lazyListMeasuredItem11.m91getOffsetBjo55l4(0);
                                            if (lazyListMeasuredItem11.MediaSessionCompatQueueItem) {
                                                iM3801getXimpl = IntOffset.m3802getYimpl(jM91getOffsetBjo55l4);
                                            } else {
                                                iM3801getXimpl = IntOffset.m3801getXimpl(jM91getOffsetBjo55l4);
                                            }
                                        }
                                        int size9 = arrayList7.size();
                                        basicTooltipBox = basicTooltipBox2;
                                        int i1113 = 0;
                                        while (true) {
                                            if (i1113 >= size9) {
                                                arrayList2 = arrayList7;
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = arrayList7.get(i1113);
                                            arrayList2 = arrayList7;
                                            if (((LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaMetadataCompat != i1110) {
                                                break;
                                            }
                                            i1113++;
                                            arrayList7 = arrayList2;
                                        }
                                        FabBaselineTokens fabBaselineTokens = (FabBaselineTokens) obj2;
                                        if (fabBaselineTokens != null) {
                                            LazyListMeasuredItem lazyListMeasuredItem12 = (LazyListMeasuredItem) fabBaselineTokens;
                                            long jM91getOffsetBjo55l5 = lazyListMeasuredItem12.m91getOffsetBjo55l4(0);
                                            if (lazyListMeasuredItem12.MediaSessionCompatQueueItem) {
                                                iM3801getXimpl2 = IntOffset.m3802getYimpl(jM91getOffsetBjo55l5);
                                            } else {
                                                iM3801getXimpl2 = IntOffset.m3801getXimpl(jM91getOffsetBjo55l5);
                                            }
                                        } else {
                                            iM3801getXimpl2 = Integer.MIN_VALUE;
                                        }
                                        if (iM3801getXimpl == Integer.MIN_VALUE) {
                                            iMax = i57;
                                            i39 = iMax;
                                        } else {
                                            i39 = i57;
                                            iMax = Math.max(i39, iM3801getXimpl);
                                        }
                                        if (iM3801getXimpl2 != Integer.MIN_VALUE) {
                                            iMax = Math.min(iMax, iM3801getXimpl2 - i1112);
                                        }
                                        lazyListMeasuredItem11.ParcelableVolumeInfo = true;
                                        lazyListMeasuredItem11.position(iMax, i34, iM3642constrainHeightK40F9xA);
                                        arrayList6.add(obj4);
                                        i119++;
                                        i57 = i39;
                                        iArr4 = iArr5;
                                        i118 = i118;
                                        arrayList7 = arrayList2;
                                        f6 = f7;
                                    }
                                    f = f6;
                                    i35 = i57;
                                    z21 = true;
                                    obj = arrayList6;
                                }
                                if (z27) {
                                    LazyListMeasuredItem lazyListMeasuredItem13 = (LazyListMeasuredItem) onContentCardDismissed.MediaMetadataCompat((List) arrayList5);
                                    if (lazyListMeasuredItem13 != null) {
                                        numValueOf = Integer.valueOf(lazyListMeasuredItem13.MediaMetadataCompat);
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    LazyListMeasuredItem lazyListMeasuredItem14 = (LazyListMeasuredItem) brazeContentCardsManager.write();
                                    if (lazyListMeasuredItem14 != null) {
                                        numValueOf = Integer.valueOf(lazyListMeasuredItem14.MediaMetadataCompat);
                                    } else {
                                        numValueOf = null;
                                    }
                                }
                                if (z27) {
                                    LazyListMeasuredItem lazyListMeasuredItem15 = (LazyListMeasuredItem) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList5);
                                    if (lazyListMeasuredItem15 != null) {
                                        numValueOf2 = Integer.valueOf(lazyListMeasuredItem15.MediaMetadataCompat);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                } else {
                                    LazyListMeasuredItem lazyListMeasuredItem16 = (LazyListMeasuredItem) brazeContentCardsManager.RemoteActionCompatParcelizer();
                                    if (lazyListMeasuredItem16 != null) {
                                        numValueOf2 = Integer.valueOf(lazyListMeasuredItem16.MediaMetadataCompat);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                }
                                boolean z29 = (i29 < i32 || i211 > i89) ? z21 : false;
                                MeasureResult measureResultLayout2 = subcomposeMeasureScope2.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, i34 + i42), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3642constrainHeightK40F9xA + iMo42roundToPx0680j_7), simpleItemTouchHelperCallback, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(populateViewStructure_androidKtpopulate7, arrayList5, obj, zIsLookingAhead, 1));
                                int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                                int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                if (arrayList5.isEmpty()) {
                                    list = instance_delegatelambda0Var;
                                } else {
                                    ArrayList arrayList8 = new ArrayList((Collection) obj);
                                    int size10 = arrayList5.size();
                                    for (int i120 = 0; i120 < size10; i120++) {
                                        FabBaselineTokens fabBaselineTokens2 = (FabBaselineTokens) arrayList5.get(i120);
                                        int i121 = ((LazyListMeasuredItem) fabBaselineTokens2).MediaMetadataCompat;
                                        if (iIntValue3 <= i121 && i121 <= iIntValue4) {
                                            arrayList8.add(fabBaselineTokens2);
                                        }
                                    }
                                    BrazeContentCardsManagerCompanion.write(arrayList8, ExtendedFabPrimaryTokens.IconCompatParcelizer);
                                    list = arrayList8;
                                }
                                if (z24) {
                                    selectionHandleIcon4 = SelectionHandleIcon.Vertical;
                                } else {
                                    selectionHandleIcon4 = SelectionHandleIcon.Horizontal;
                                }
                                subcomposeMeasureScope = subcomposeMeasureScope2;
                                lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem4, i30, z29, f, measureResultLayout2, f4, z26, getcontentviewgroupparentlayout2, baselineButtonTokens, basicTooltipBox.MediaSessionCompatResultReceiverWrapper, list, i35, i59, i32, selectionHandleIcon4, i45, iMo42roundToPx0680j_8);
                            }
                            LazyListState lazyListState5 = lazyListState3;
                            lazyListState5.read(lazyListMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                            AnchoredDraggableKtanchoredDraggable11 anchoredDraggableKtanchoredDraggable11 = lazyListState5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            return lazyListMeasureResult;
                        } catch (Throwable th) {
                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                            throw th;
                        }
                    }
                };
                getpostalcode.write(checkboxTokens7);
                objComponentActivity4 = checkboxTokens7;
            }
            CheckboxTokens checkboxTokens8 = (CheckboxTokens) objComponentActivity4;
            if (z) {
                selectionHandleIcon = SelectionHandleIcon.Vertical;
            } else {
                selectionHandleIcon = SelectionHandleIcon.Horizontal;
            }
            selectionHandleIcon2 = selectionHandleIcon;
            if (z2 != 0) {
                getpostalcode.serializer(-2077147368);
                Modifier.Companion companion3 = Modifier.Companion;
                lazyListState2 = lazyListState;
                if ((i7 ^ 6) > 4) {
                    i10 = 0;
                    z19 = false;
                } else {
                    i10 = 0;
                    z19 = false;
                }
                z20 = getpostalcode.read(i10);
                objComponentActivity5 = getpostalcode.ComponentActivity();
                if (!(z20 | z19)) {
                    objComponentActivity5 = new settle(lazyListState2);
                    getpostalcode.write(objComponentActivity5);
                } else {
                    objComponentActivity5 = new settle(lazyListState2);
                    getpostalcode.write(objComponentActivity5);
                }
                modifierIconCompatParcelizer = ExtendedFabPrimaryTokens.IconCompatParcelizer(companion3, (settle) objComponentActivity5, lazyListState2.RemoteActionCompatParcelizer, selectionHandleIcon2);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                lazyListState2 = lazyListState;
                getpostalcode.serializer(-2076718545);
                getpostalcode.IconCompatParcelizer(false);
                modifierIconCompatParcelizer = Modifier.Companion;
            }
            PullToRefreshModifierNodeupdate1.write(registerinappmessagemanagerlambda7, DefaultPagerNestedScrollConnection.RemoteActionCompatParcelizer(AbstractApplier.write(modifier.then(lazyListState2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4).then(lazyListState2.IconCompatParcelizer), registerinappmessagemanagerlambda7, smallIconButtonTokens3, selectionHandleIcon2, z2).then(modifierIconCompatParcelizer).then(lazyListState2.MediaSessionCompatToken.write), lazyListState, selectionHandleIcon2, isnotgestureactionfoundation, z2, constructorimplVar, lazyListState2.MediaMetadataCompat, null), lazyListState2.ResultReceiver, checkboxTokens8, getpostalcode, 0);
            horizontal3 = horizontal8;
            vertical3 = vertical10;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            horizontal3 = horizontal;
            vertical3 = vertical;
            vertical4 = vertical2;
            horizontal4 = horizontal2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Alignment.Vertical vertical12 = vertical4;
            final Arrangement.Horizontal horizontal10 = horizontal4;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.BasicTooltipKtTooltipPopup2
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.foundation.lazy.LazyListKt.LazyList(modifier, lazyListState, switchKt, z, constructorimplVar, z2, isnotgestureactionfoundation, horizontal3, vertical3, vertical12, horizontal10, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
