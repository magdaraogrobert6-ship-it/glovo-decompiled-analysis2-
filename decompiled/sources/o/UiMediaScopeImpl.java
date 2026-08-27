package o;

import androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import com.roadrunner.customerchat.selfservice.presentation.screen.CustomerChatWebChatContainerKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardContainerKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.CrowdSourcingFloatingImageButtonKt;
import com.roadrunner.delivery.ontheway.header.api.DestinationHeaderUiModel;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.compose.CardCashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.compose.QrPaymentKt;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryScreenKt;
import com.roadrunner.freelancing.api.infraboost.WorkNowWithInfraBoostUiModel;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostKt;
import com.roadrunner.inappnotifications.presentation.InAppNotificationLayoutComponentsKt;
import com.roadrunner.liveness.failure.presentation.compose.LivenessFailureScreenKt;
import com.roadrunner.liveness.instruction.presentation.compose.FooterComponentKt;
import com.roadrunner.login.presentation.signin.SignInContentKt;
import com.roadrunner.recentdeliveries.presentation.components.DeliveryKt;
import com.roadrunner.rider.state.ondemand.bonus.compose.OnDemandWithBonusNotWorkingKt;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.rrds.compose.component.feedback.communicator.MessageBarKt;
import com.roadrunner.vendor.review.presentation.VendorReviewScreenKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UiMediaScopeImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatToken = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ UiMediaScopeImpl(hasStableIds hasstableids, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, int i) {
        this.write = 11;
        this.IconCompatParcelizer = hasstableids;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = modifier;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ UiMediaScopeImpl(getEnterjXw82LU getenterjxw82lu, CashPaymentTaskUiItem cashPaymentTaskUiItem, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, androidx.compose.ui.Modifier modifier, int i) {
        this.write = 7;
        this.IconCompatParcelizer = getenterjxw82lu;
        this.serializer = cashPaymentTaskUiItem;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ UiMediaScopeImpl(TooltipDefaults tooltipDefaults, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4) {
        this.write = 0;
        this.IconCompatParcelizer = tooltipDefaults;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        this.MediaDescriptionCompat = i;
        this.RatingCompat = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
        this.MediaSessionCompatQueueItem = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.MediaMetadataCompat = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
    }

    public /* synthetic */ UiMediaScopeImpl(AdjustThirdPartySharing adjustThirdPartySharing, xb xbVar, accessisMainThread accessismainthread, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, androidx.compose.ui.Modifier modifier, int i) {
        this.write = 17;
        this.IconCompatParcelizer = adjustThirdPartySharing;
        this.RemoteActionCompatParcelizer = xbVar;
        this.serializer = accessismainthread;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ UiMediaScopeImpl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.write = i2;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.serializer = obj4;
        this.RatingCompat = obj5;
        this.MediaMetadataCompat = obj6;
        this.MediaSessionCompatQueueItem = obj7;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ UiMediaScopeImpl(Object obj, Object obj2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, isInvalidIndex isinvalidindex, Object obj3, Object obj4, int i, int i2) {
        this.write = i2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RatingCompat = isinvalidindex;
        this.MediaMetadataCompat = obj3;
        this.MediaSessionCompatQueueItem = obj4;
        this.MediaDescriptionCompat = i;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0613  */
    /* JADX WARN: Code duplicated, block: B:57:0x050c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0516  */
    /* JADX WARN: Code duplicated, block: B:61:0x051e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0523  */
    /* JADX WARN: Code duplicated, block: B:64:0x052c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0532  */
    /* JADX WARN: Code duplicated, block: B:70:0x053a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0546  */
    /* JADX WARN: Code duplicated, block: B:73:0x0550  */
    /* JADX WARN: Code duplicated, block: B:74:0x0555  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int width;
        int iMo42roundToPx0680j_4;
        int i;
        int iMo42roundToPx0680j_5;
        int iMo42roundToPx0680j_6;
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls;
        final Integer numValueOf;
        final int i2;
        float fMo45toDpu2uoSUM;
        int iIntValue;
        int iMo42roundToPx0680j_7;
        int iMo42roundToPx0680j_8;
        int i3 = 2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.MediaSessionCompatQueueItem;
        Object obj4 = this.MediaMetadataCompat;
        Object obj5 = this.RatingCompat;
        Object obj6 = this.read;
        Object obj7 = this.RemoteActionCompatParcelizer;
        int i5 = this.MediaDescriptionCompat;
        Object obj8 = this.serializer;
        Object obj9 = this.IconCompatParcelizer;
        switch (i4) {
            case 0:
                final TooltipDefaults tooltipDefaults = (TooltipDefaults) obj9;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5;
                ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj3;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4;
                final androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = (androidx.compose.ui.layout.SubcomposeMeasureScope) obj;
                androidx.compose.ui.unit.Constraints constraints = (androidx.compose.ui.unit.Constraints) obj2;
                float f = androidx.compose.material3.ScaffoldKt.IconCompatParcelizer;
                final int iM3626getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(constraints.m3632unboximpl());
                final int iM3625getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(constraints.m3632unboximpl());
                long jM3616copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m3616copyZbe2FdA$default(constraints.m3632unboximpl(), 0, 0, 0, 0, 10, null);
                int i6 = tooltipDefaults.read(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                int iRemoteActionCompatParcelizer = tooltipDefaults.RemoteActionCompatParcelizer(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
                int i7 = tooltipDefaults.read(subcomposeMeasureScope);
                final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) onContentCardDismissed.read((List) subcomposeMeasureScope.subcompose(getHasPhysicalKeyboard.TopBar, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6))).mo2209measureBRTryo0(jM3616copyZbe2FdA$default);
                androidx.compose.ui.layout.Measurable measurable = (androidx.compose.ui.layout.Measurable) onContentCardDismissed.read((List) subcomposeMeasureScope.subcompose(getHasPhysicalKeyboard.Snackbar, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj7));
                int i8 = (-i6) - iRemoteActionCompatParcelizer;
                int i9 = -i7;
                final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo1 = measurable.mo2209measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m3645offsetNN6EwU(jM3616copyZbe2FdA$default, i8, i9));
                final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo2 = ((androidx.compose.ui.layout.Measurable) onContentCardDismissed.read((List) subcomposeMeasureScope.subcompose(getHasPhysicalKeyboard.Fab, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj8))).mo2209measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m3645offsetNN6EwU(jM3616copyZbe2FdA$default, i8, i9));
                Integer numValueOf2 = null;
                if (placeableMo2209measureBRTryo2.getWidth() == 0) {
                    int i10 = MediaBrowserCompatMediaItem + 87;
                    MediaSessionCompatToken = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        placeableMo2209measureBRTryo2.getHeight();
                        throw null;
                    }
                    if (placeableMo2209measureBRTryo2.getHeight() == 0) {
                        infiniteAnimationPolicyDefaultImpls = null;
                    } else {
                        width = placeableMo2209measureBRTryo2.getWidth();
                        int height = placeableMo2209measureBRTryo2.getHeight();
                        if (i5 == 0) {
                            if (subcomposeMeasureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                                iMo42roundToPx0680j_4 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                                iMo42roundToPx0680j_6 = iMo42roundToPx0680j_4 + i6;
                            } else {
                                iMo42roundToPx0680j_5 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                                iMo42roundToPx0680j_6 = ((iM3626getMaxWidthimpl - iMo42roundToPx0680j_5) - width) - iRemoteActionCompatParcelizer;
                            }
                        } else if (i5 != 2 && i5 != 3) {
                            iMo42roundToPx0680j_6 = (((iM3626getMaxWidthimpl - width) + i6) - iRemoteActionCompatParcelizer) / 2;
                        } else if (subcomposeMeasureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                            i = MediaSessionCompatToken + 105;
                            MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                iMo42roundToPx0680j_6 = ((subcomposeMeasureScope.mo42roundToPx0680j_4(f) + iM3626getMaxWidthimpl) >> width) % iRemoteActionCompatParcelizer;
                            } else {
                                iMo42roundToPx0680j_5 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                                iMo42roundToPx0680j_6 = ((iM3626getMaxWidthimpl - iMo42roundToPx0680j_5) - width) - iRemoteActionCompatParcelizer;
                            }
                        } else {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                            iMo42roundToPx0680j_6 = iMo42roundToPx0680j_4 + i6;
                        }
                        infiniteAnimationPolicyDefaultImpls = new InfiniteAnimationPolicyDefaultImpls(iMo42roundToPx0680j_6, height);
                    }
                } else {
                    width = placeableMo2209measureBRTryo2.getWidth();
                    int height2 = placeableMo2209measureBRTryo2.getHeight();
                    if (i5 == 0) {
                        if (subcomposeMeasureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                            iMo42roundToPx0680j_6 = iMo42roundToPx0680j_4 + i6;
                        } else {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                            iMo42roundToPx0680j_6 = ((iM3626getMaxWidthimpl - iMo42roundToPx0680j_5) - width) - iRemoteActionCompatParcelizer;
                        }
                    } else if (i5 != 2) {
                        iMo42roundToPx0680j_6 = (((iM3626getMaxWidthimpl - width) + i6) - iRemoteActionCompatParcelizer) / 2;
                    } else if (subcomposeMeasureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                        i = MediaSessionCompatToken + 105;
                        MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            iMo42roundToPx0680j_6 = ((subcomposeMeasureScope.mo42roundToPx0680j_4(f) + iM3626getMaxWidthimpl) >> width) % iRemoteActionCompatParcelizer;
                        } else {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                            iMo42roundToPx0680j_6 = ((iM3626getMaxWidthimpl - iMo42roundToPx0680j_5) - width) - iRemoteActionCompatParcelizer;
                        }
                    } else {
                        iMo42roundToPx0680j_4 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                        iMo42roundToPx0680j_6 = iMo42roundToPx0680j_4 + i6;
                    }
                    infiniteAnimationPolicyDefaultImpls = new InfiniteAnimationPolicyDefaultImpls(iMo42roundToPx0680j_6, height2);
                }
                final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo3 = ((androidx.compose.ui.layout.Measurable) onContentCardDismissed.read((List) subcomposeMeasureScope.subcompose(getHasPhysicalKeyboard.BottomBar, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0))).mo2209measureBRTryo0(jM3616copyZbe2FdA$default);
                boolean z = placeableMo2209measureBRTryo3.getWidth() == 0 && placeableMo2209measureBRTryo3.getHeight() == 0;
                if (infiniteAnimationPolicyDefaultImpls != null) {
                    int i11 = MediaBrowserCompatMediaItem + 49;
                    MediaSessionCompatToken = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        int i12 = infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer;
                        numValueOf2.hashCode();
                        throw null;
                    }
                    int i13 = infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer;
                    if (z || i5 == 3) {
                        iMo42roundToPx0680j_7 = subcomposeMeasureScope.mo42roundToPx0680j_4(f) + i13;
                        iMo42roundToPx0680j_8 = tooltipDefaults.read(subcomposeMeasureScope);
                    } else {
                        iMo42roundToPx0680j_7 = placeableMo2209measureBRTryo3.getHeight() + i13;
                        iMo42roundToPx0680j_8 = subcomposeMeasureScope.mo42roundToPx0680j_4(f);
                    }
                    numValueOf = Integer.valueOf(iMo42roundToPx0680j_8 + iMo42roundToPx0680j_7);
                } else {
                    numValueOf = null;
                }
                int height3 = placeableMo2209measureBRTryo1.getHeight();
                if (height3 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        int height4 = placeableMo2209measureBRTryo3.getHeight();
                        if (!z) {
                            int i14 = MediaBrowserCompatMediaItem + 11;
                            MediaSessionCompatToken = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            numValueOf2 = Integer.valueOf(height4);
                        }
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : tooltipDefaults.read(subcomposeMeasureScope);
                    }
                    i2 = iIntValue + height3;
                } else {
                    i2 = 0;
                }
                SheetDefaultsKt sheetDefaultsKt = new SheetDefaultsKt(tooltipDefaults, subcomposeMeasureScope);
                if (placeableMo2209measureBRTryo0.getWidth() == 0) {
                    int i16 = MediaSessionCompatToken + 27;
                    MediaBrowserCompatMediaItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    if (placeableMo2209measureBRTryo0.getHeight() == 0) {
                        fMo45toDpu2uoSUM = sheetDefaultsKt.IconCompatParcelizer();
                    } else {
                        fMo45toDpu2uoSUM = subcomposeMeasureScope.mo45toDpu2uoSUM(placeableMo2209measureBRTryo0.getHeight());
                    }
                } else {
                    fMo45toDpu2uoSUM = subcomposeMeasureScope.mo45toDpu2uoSUM(placeableMo2209measureBRTryo0.getHeight());
                }
                ((onShowTranslationui) scaffoldKt$ScaffoldLayout$contentPadding$1$1.write).setValue(new SwitchDefaults(androidx.compose.foundation.layout.PaddingKt.serializer(sheetDefaultsKt, subcomposeMeasureScope.getLayoutDirection()), fMo45toDpu2uoSUM, androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(sheetDefaultsKt, subcomposeMeasureScope.getLayoutDirection()), z ? sheetDefaultsKt.RemoteActionCompatParcelizer() : subcomposeMeasureScope.mo45toDpu2uoSUM(placeableMo2209measureBRTryo3.getHeight())));
                final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo4 = ((androidx.compose.ui.layout.Measurable) onContentCardDismissed.read((List) subcomposeMeasureScope.subcompose(getHasPhysicalKeyboard.MainContent, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1))).mo2209measureBRTryo0(jM3616copyZbe2FdA$default);
                final InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2 = infiniteAnimationPolicyDefaultImpls;
                androidx.compose.ui.layout.MeasureResult measureResultLayout$default = androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, iM3626getMaxWidthimpl, iM3625getMaxHeightimpl, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.setDocked
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj10) {
                        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj10;
                        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeableMo2209measureBRTryo4, 0, 0, 0.0f, 4, null);
                        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeableMo2209measureBRTryo0, 0, 0, 0.0f, 4, null);
                        androidx.compose.ui.layout.Placeable placeable = placeableMo2209measureBRTryo1;
                        int width2 = placeable.getWidth();
                        int i18 = iM3626getMaxWidthimpl;
                        androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = subcomposeMeasureScope2.getLayoutDirection();
                        TooltipDefaults tooltipDefaults2 = tooltipDefaults;
                        int iRemoteActionCompatParcelizer2 = ((tooltipDefaults2.read(subcomposeMeasureScope2, layoutDirection) + (i18 - width2)) - tooltipDefaults2.RemoteActionCompatParcelizer(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) / 2;
                        int i19 = iM3625getMaxHeightimpl;
                        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, iRemoteActionCompatParcelizer2, i19 - i2, 0.0f, 4, null);
                        androidx.compose.ui.layout.Placeable placeable2 = placeableMo2209measureBRTryo3;
                        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, 0, i19 - placeable2.getHeight(), 0.0f, 4, null);
                        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls3 = infiniteAnimationPolicyDefaultImpls2;
                        if (infiniteAnimationPolicyDefaultImpls3 != null) {
                            int i20 = infiniteAnimationPolicyDefaultImpls3.serializer;
                            Integer num = numValueOf;
                            num.getClass();
                            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeableMo2209measureBRTryo2, i20, i19 - num.intValue(), 0.0f, 4, null);
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, 4, null);
                int i18 = MediaSessionCompatToken + 61;
                MediaBrowserCompatMediaItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return measureResultLayout$default;
            case 1:
                ((Integer) obj2).getClass();
                ((DragAndDropTargetModifierNode) obj9).read(this.read, this.RemoteActionCompatParcelizer, (Boolean) obj8, this.RatingCompat, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5) | 1);
                return createfromparcel;
            case 2:
                ((Integer) obj2).getClass();
                registerOnRectChangedCallback.read((getQueryContext) obj9, (invalidateCallbacksFor) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 3:
                ((Integer) obj2).getClass();
                CustomerChatWebChatContainerKt.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (DragAndDropTargetModifierNode) obj6, (getParagraph) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 4:
                ((Integer) obj2).getClass();
                ActionableMessageCardContainerKt.ActionableMessageCardContainer((getTopLeftnOccac) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8, (androidx.compose.ui.Modifier) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 5:
                ((Integer) obj2).getClass();
                CrowdSourcingFloatingImageButtonKt.read((copyYTHSh70) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 6:
                ((Integer) obj2).getClass();
                DestinationHeaderKt.DestinationHeader((DestinationHeaderUiModel) obj9, (getPreviouseUduSuoannotations) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (Nonelambda0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 7:
                ((Integer) obj2).getClass();
                CardCashPaymentKt.ChangeAmount((getEnterjXw82LU) obj9, (CashPaymentTaskUiItem) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj7, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                QrPaymentKt.CashComposable((C0195provider) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                DarkModeDiscoveryScreenKt.RemoteActionCompatParcelizer((String) obj9, (String) obj6, (String) obj7, (String) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 10:
                ((Integer) obj2).getClass();
                WorkNowWithInfraBoostKt.WorkNowWithInfraBoost((getWindowInsetsAnimationCompat) obj9, (getStableInsets) obj6, (logPushStoryPageClickedlambda11) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj8, (WorkNowWithInfraBoostUiModel) obj5, (getActionList) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 11:
                ((Integer) obj2).getClass();
                InAppNotificationLayoutComponentsKt.AnimationPage((hasStableIds) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i20 = MediaBrowserCompatMediaItem + 89;
                MediaSessionCompatToken = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i21 = i20 % 2;
                return createfromparcel;
            case 12:
                ((Integer) obj2).getClass();
                LivenessFailureScreenKt.FailureScreen((accessstopTrackingTable) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 13:
                ((Integer) obj2).getClass();
                FooterComponentKt.FooterComponent((String) obj9, (String) obj6, (String) obj7, (String) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 14:
                ((Integer) obj2).getClass();
                setTargetOffsetTopAndBottom.RemoteActionCompatParcelizer((setLegacyRequestDisallowInterceptTouchEventEnabled) obj9, (Integer) obj6, (Integer) obj7, (getWrapper) obj8, (setNavigationOnClickListener) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 15:
                ((Integer) obj2).getClass();
                SignInContentKt.SignInContent((d4ExternalSyntheticLambda2) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getInvalidationTracker) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 16:
                ((Integer) obj2).getClass();
                DeliveryKt.Delivery((teardownAllGlobalParametersS) obj9, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 17:
                ((Integer) obj2).getClass();
                OnDemandWithBonusNotWorkingKt.OnDemandWithBonusNotWorkingColumn((AdjustThirdPartySharing) obj9, (xb) obj7, (accessisMainThread) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 18:
                ((Integer) obj2).getClass();
                androidx.recyclerview.widget.ScrollbarHelper.NestRiderStateSummary((saveInteger) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (com.huawei.wisesecurity.ucs_credential.g0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 19:
                ((Integer) obj2).getClass();
                MessagePopUpKt.MessageDialogContent((generatePOSTBodyString) obj9, (androidx.compose.ui.Modifier) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 20:
                ((Integer) obj2).getClass();
                MessageBarKt.ExpandableContent((PopulateViewStructure_androidKtpopulate7) obj9, (shouldRetryToSendWithUrlStrategy) obj6, (coil3.compose.AsyncImagePainter) obj7, (String) obj8, (String) obj5, (String) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 21:
                ((Integer) obj2).getClass();
                r8lambdaby9RGqpZEQ9dvO9shdh2_1OJRpw.read((String) obj9, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            default:
                ((Integer) obj2).getClass();
                VendorReviewScreenKt.IconCompatParcelizer((logPurchase) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
                return createfromparcel;
        }
    }
}
