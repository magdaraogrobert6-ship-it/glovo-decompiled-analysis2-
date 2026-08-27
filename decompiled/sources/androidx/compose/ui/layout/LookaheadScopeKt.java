package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.DrawableTransformation;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class LookaheadScopeKt {
    private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 defaultPlacementApproachInProgress = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
            return Boolean.FALSE;
        }
    };

    public static final Modifier approachLayout(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return modifier.then(new ApproachLayoutElement(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0));
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = defaultPlacementApproachInProgress;
        }
        return approachLayout(modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    /* JADX INFO: renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m2243localLookaheadPositionOfFgt4K4Q(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        if (lookaheadCoordinates instanceof LookaheadLayoutCoordinates) {
            return ((LookaheadLayoutCoordinates) lookaheadCoordinates).mo2219localPositionOfS_NoaFU(lookaheadCoordinates2, j, z);
        }
        return lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates ? Offset.m469constructorimpl(((LookaheadLayoutCoordinates) lookaheadCoordinates2).mo2219localPositionOfS_NoaFU(lookaheadCoordinates, j, z) ^ (-9223372034707292160L)) : lookaheadCoordinates.mo2219localPositionOfS_NoaFU(lookaheadCoordinates, j, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutCoordinates lookaheadScopeCoordinates(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates) {
        if (layoutCoordinates instanceof LookaheadCapablePlaceable) {
            return lookaheadScope.getLookaheadScopeCoordinates(((LookaheadCapablePlaceable) layoutCoordinates).getPlacementScope());
        }
        DrawableTransformation.serializer(layoutCoordinates, "Invalid LayoutCoordinates: ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @UiComposable
    public static final void LookaheadScope(final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(441837433);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            Object obj = getCreditCardExpirationMonth.write;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
            Object[] objArr = 0;
            if (objComponentActivity == obj) {
                objComponentActivity = new LookaheadScopeImpl(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i3, objArr == true ? 1 : 0);
                getpostalcode.write(objComponentActivity);
            }
            Object obj2 = (LookaheadScopeImpl) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == obj) {
                objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final LayoutNode invoke() {
                        return new LayoutNode(true, 0, 2, null);
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            AndroidContentCaptureManagerCompanion.read(getpostalcode, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((LayoutNode) obj3);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(LayoutNode layoutNode) {
                    layoutNode.setVirtualLookaheadRoot$ui(true);
                }
            });
            AndroidContentCaptureManagerCompanion.write(getpostalcode, obj2, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((LayoutNode) obj3, (LookaheadScopeImpl) obj4);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(final LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
                    lookaheadScopeImpl.setScopeCoordinates(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final LayoutCoordinates invoke() {
                            LayoutNode parent$ui = layoutNode.getParent$ui();
                            parent$ui.getClass();
                            return parent$ui.getInnerCoordinator$ui().getCoordinates();
                        }

                        {
                            super(0);
                        }
                    });
                }
            });
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(obj2, getpostalcode, Integer.valueOf((i2 << 3) & 112));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((getBirthDateFull) obj3, ((Number) obj4).intValue());
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i4) {
                    LookaheadScopeKt.LookaheadScope(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }
            };
        }
    }
}
