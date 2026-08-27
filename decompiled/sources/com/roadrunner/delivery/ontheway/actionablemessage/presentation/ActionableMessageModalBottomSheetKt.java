package com.roadrunner.delivery.ontheway.actionablemessage.presentation;

import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.mapbox.navigation.core.internal.dump.HelpDumpInterceptor$prettyString$1;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import io.sentry.SentryUUID;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultContentCardView;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.EditingBufferCompanion;
import o.accessisRenderNodeCompatiblecp;
import o.canReadPlayIds;
import o.computeVerticalScrollExtent;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftnOccac;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionableMessageModalBottomSheetKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1597250579);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
        if ((i & 6) == 0) {
            if (getpostalcode.read(boxScopeInstance)) {
                int i6 = IconCompatParcelizer + 89;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = IconCompatParcelizer + 19;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2 | 384;
        if (getpostalcode.write(i10 & 1, (i10 & 147) != 146)) {
            modifier2 = Modifier.Companion;
            Resources resources = (Resources) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources());
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i11 = serializer + 103;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                objComponentActivity = Dp.m3671boximpl(density.mo45toDpu2uoSUM(resources.getDisplayMetrics().heightPixels / 2));
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.write(modifier2, 1.0f), ((Dp) objComponentActivity).m3687unboximpl());
            boolean z = (i10 & 112) == 32;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new b1$$ExternalSyntheticLambda0(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity2);
            }
            Modifier modifier3 = canReadPlayIds.read(modifierM75height3ABfNKs, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode, 63);
            Brush.Companion companion = Brush.Companion;
            Color.Companion companion2 = Color.Companion;
            BoxKt.Box(boxScopeInstance.align(BackgroundKt.background$default(modifier3, Brush.Companion.m677verticalGradient8A3gB4$default(companion, SQLite.read(Color.m712boximpl(companion2.m757getTransparent0d7_KjU()), Color.m712boximpl(companion2.m748getBlack0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.8f, 2), Alignment.Companion.getBottomCenter()), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    public static final void ActionableMessageModalBottomSheet(final EditingBufferCompanion editingBufferCompanion, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        getTopLeftnOccac gettopleftnoccac;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        editingBufferCompanion.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(216439076);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 65;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode2.read(editingBufferCompanion)) {
                int i7 = serializer + 117;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        final int i9 = 0;
        if ((i8 & 19) != 18) {
            int i10 = serializer + 43;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode2.write(i8 & 1, z))) {
            final Modifier.Companion companion = Modifier.Companion;
            Object value = ExtrasKt.write(editingBufferCompanion.PlaybackStateCompatCustomAction, getpostalcode2, 0).getValue();
            if (value instanceof getTopLeftnOccac) {
                int i12 = serializer + 125;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                gettopleftnoccac = (getTopLeftnOccac) value;
            } else {
                gettopleftnoccac = null;
            }
            if (gettopleftnoccac == null) {
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getSelectionStartui_text
                        private static int MediaSessionCompatQueueItem = 1;
                        private static int RemoteActionCompatParcelizer;

                        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
                        
                            return r2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
                        
                            com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt.ActionableMessageModalBottomSheet(r5, r4, r7, o.ContentType_androidKt.RemoteActionCompatParcelizer(r3 | 1));
                            r7 = o.getSelectionStartui_text.MediaSessionCompatQueueItem + 109;
                            o.getSelectionStartui_text.RemoteActionCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
                        
                            if ((r7 % 2) != 0) goto L14;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
                        
                            return r2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
                        
                            r7 = null;
                            r7.hashCode();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
                        
                            throw null;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
                        
                            com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt.ActionableMessageModalBottomSheet(r5, r4, r7, o.ContentType_androidKt.RemoteActionCompatParcelizer(r3 | 1));
                         */
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                            /*
                                r6 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = o.getSelectionStartui_text.RemoteActionCompatParcelizer
                                int r1 = r1 + 87
                                int r2 = r1 % 128
                                o.getSelectionStartui_text.MediaSessionCompatQueueItem = r2
                                int r1 = r1 % r0
                                if (r1 != 0) goto L26
                                int r1 = r4
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                int r3 = r3
                                androidx.compose.ui.Modifier r4 = r2
                                o.EditingBufferCompanion r5 = r1
                                o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                                java.lang.Integer r8 = (java.lang.Integer) r8
                                r8.getClass()
                                r8 = 9
                                int r8 = r8 / 0
                                if (r1 == 0) goto L43
                                goto L39
                            L26:
                                int r1 = r4
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                int r3 = r3
                                androidx.compose.ui.Modifier r4 = r2
                                o.EditingBufferCompanion r5 = r1
                                o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                                java.lang.Integer r8 = (java.lang.Integer) r8
                                r8.getClass()
                                if (r1 == 0) goto L43
                            L39:
                                r8 = r3 | 1
                                int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                                com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt.ActionableMessageModalBottomSheet(r5, r4, r7, r8)
                                return r2
                            L43:
                                r8 = r3 | 1
                                int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                                com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt.ActionableMessageModalBottomSheet(r5, r4, r7, r8)
                                int r7 = o.getSelectionStartui_text.MediaSessionCompatQueueItem
                                int r7 = r7 + 109
                                int r8 = r7 % 128
                                o.getSelectionStartui_text.RemoteActionCompatParcelizer = r8
                                int r7 = r7 % r0
                                if (r7 != 0) goto L58
                                return r2
                            L58:
                                r7 = 0
                                r7.hashCode()
                                throw r7
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.getSelectionStartui_text.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    };
                    int i14 = serializer + 87;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                return;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(2);
                getpostalcode2.write(objComponentActivity);
            }
            SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 54, 0);
            Shape rectangleShape = RectangleShapeKt.getRectangleShape();
            Color.Companion companion2 = Color.Companion;
            long jM757getTransparent0d7_KjU = companion2.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU2 = companion2.m757getTransparent0d7_KjU();
            int i15 = i8 & 14;
            boolean z3 = i15 == 4;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (!z3) {
                int i16 = IconCompatParcelizer + 111;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    int i17 = 53 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        AutoAcceptOptionKt$AutoAcceptOption$1$1 autoAcceptOptionKt$AutoAcceptOption$1$1 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, editingBufferCompanion, EditingBufferCompanion.class, "clearAllMessages", "clearAllMessages()V", 0, 12);
                        getpostalcode2.write(autoAcceptOptionKt$AutoAcceptOption$1$1);
                        objComponentActivity2 = autoAcceptOptionKt$AutoAcceptOption$1$1;
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager) {
                    AutoAcceptOptionKt$AutoAcceptOption$1$1 autoAcceptOptionKt$AutoAcceptOption$1$2 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, editingBufferCompanion, EditingBufferCompanion.class, "clearAllMessages", "clearAllMessages()V", 0, 12);
                    getpostalcode2.write(autoAcceptOptionKt$AutoAcceptOption$1$2);
                    objComponentActivity2 = autoAcceptOptionKt$AutoAcceptOption$1$2;
                }
            } else {
                AutoAcceptOptionKt$AutoAcceptOption$1$1 autoAcceptOptionKt$AutoAcceptOption$1$3 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, editingBufferCompanion, EditingBufferCompanion.class, "clearAllMessages", "clearAllMessages()V", 0, 12);
                getpostalcode2.write(autoAcceptOptionKt$AutoAcceptOption$1$3);
                objComponentActivity2 = autoAcceptOptionKt$AutoAcceptOption$1$3;
            }
            modifier2 = companion;
            final int i18 = 0;
            ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), SizeKt.serializer(SizeKt.write(companion, 1.0f), (Alignment.Vertical) r7, 3), sheetStateRemoteActionCompatParcelizer, 0.0f, false, rectangleShape, jM757getTransparent0d7_KjU, 0L, 0.0f, jM757getTransparent0d7_KjU2, null, new DefaultContentCardView(1), null, ExtrasKt.write(1493742214, new PagerDefaults$$ExternalSyntheticLambda0(gettopleftnoccac, 10, editingBufferCompanion), getpostalcode2), getpostalcode2, 807100416, 3078, 4488);
            boolean z4 = i15 == 4;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z4 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.setSelectionui_text
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i19 = 2 % 2;
                        int i20 = write + 87;
                        serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        Object obj2 = null;
                        if (i20 % 2 == 0) {
                            ((getStrokeWidth) obj).getClass();
                            obj2.hashCode();
                            throw null;
                        }
                        int i21 = i18;
                        EditingBufferCompanion editingBufferCompanion2 = editingBufferCompanion;
                        getStrokeWidth getstrokewidth = (getStrokeWidth) obj;
                        getstrokewidth.getClass();
                        if (i21 == 0) {
                            return new setCompositionui_text(getstrokewidth, editingBufferCompanion2, 0);
                        }
                        setCompositionui_text setcompositionui_text = new setCompositionui_text(getstrokewidth, editingBufferCompanion2, 1);
                        int i22 = write + 111;
                        serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i22 % 2 != 0) {
                            return setcompositionui_text;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                };
                getpostalcode2.write(objComponentActivity3);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getpostalcode = getpostalcode2;
            RangesKt.RemoteActionCompatParcelizer(createfromparcel, (accessisRenderNodeCompatiblecp) null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode2, 6, 2);
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.IconCompatParcelizer;
            if (i15 == 4) {
                int i19 = serializer + 79;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    throw null;
                }
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            final int i20 = 1;
            if (z2 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.setSelectionui_text
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i110 = 2 % 2;
                        int i21 = write + 87;
                        serializer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        Object obj2 = null;
                        if (i21 % 2 == 0) {
                            ((getStrokeWidth) obj).getClass();
                            obj2.hashCode();
                            throw null;
                        }
                        int i22 = i20;
                        EditingBufferCompanion editingBufferCompanion2 = editingBufferCompanion;
                        getStrokeWidth getstrokewidth = (getStrokeWidth) obj;
                        getstrokewidth.getClass();
                        if (i22 == 0) {
                            return new setCompositionui_text(getstrokewidth, editingBufferCompanion2, 0);
                        }
                        setCompositionui_text setcompositionui_text = new setCompositionui_text(getstrokewidth, editingBufferCompanion2, 1);
                        int i23 = write + 111;
                        serializer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i23 % 2 != 0) {
                            return setcompositionui_text;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                };
                getpostalcode.write(objComponentActivity4);
            }
            RangesKt.RemoteActionCompatParcelizer(createfromparcel, processLifecycleOwner, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 6, 0);
            int i21 = serializer + 33;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            final int i23 = 1;
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getSelectionStartui_text
                private static int MediaSessionCompatQueueItem = 1;
                private static int RemoteActionCompatParcelizer;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = o.getSelectionStartui_text.RemoteActionCompatParcelizer
                        int r1 = r1 + 87
                        int r2 = r1 % 128
                        o.getSelectionStartui_text.MediaSessionCompatQueueItem = r2
                        int r1 = r1 % r0
                        if (r1 != 0) goto L26
                        int r1 = r4
                        o.createFromParcel r2 = o.createFromParcel.INSTANCE
                        int r3 = r3
                        androidx.compose.ui.Modifier r4 = r2
                        o.EditingBufferCompanion r5 = r1
                        o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                        java.lang.Integer r8 = (java.lang.Integer) r8
                        r8.getClass()
                        r8 = 9
                        int r8 = r8 / 0
                        if (r1 == 0) goto L43
                        goto L39
                    L26:
                        int r1 = r4
                        o.createFromParcel r2 = o.createFromParcel.INSTANCE
                        int r3 = r3
                        androidx.compose.ui.Modifier r4 = r2
                        o.EditingBufferCompanion r5 = r1
                        o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                        java.lang.Integer r8 = (java.lang.Integer) r8
                        r8.getClass()
                        if (r1 == 0) goto L43
                    L39:
                        r8 = r3 | 1
                        int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                        com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt.ActionableMessageModalBottomSheet(r5, r4, r7, r8)
                        return r2
                    L43:
                        r8 = r3 | 1
                        int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                        com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt.ActionableMessageModalBottomSheet(r5, r4, r7, r8)
                        int r7 = o.getSelectionStartui_text.MediaSessionCompatQueueItem
                        int r7 = r7 + 109
                        int r8 = r7 % 128
                        o.getSelectionStartui_text.RemoteActionCompatParcelizer = r8
                        int r7 = r7 % r0
                        if (r7 != 0) goto L58
                        return r2
                    L58:
                        r7 = 0
                        r7.hashCode()
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.getSelectionStartui_text.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            };
        }
    }

    public static final void ModalBottomSheetContent(getTopLeftnOccac gettopleftnoccac, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM noInspectorInfo;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1591528542);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 123;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 8) == 0 ? getpostalcode.read(gettopleftnoccac) : getpostalcode.IconCompatParcelizer(gettopleftnoccac)) {
                int i8 = serializer + 107;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i10 = serializer + 13;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i11 = IconCompatParcelizer + 19;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i12 = serializer + 23;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i14 = IconCompatParcelizer + 39;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 1048576 : Fields.BlendMode;
        }
        int i16 = 12582912 | i2;
        if (getpostalcode.write(i16 & 1, (4793491 & i16) != 4793490)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
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
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i17 = i16 >> 3;
            IconCompatParcelizer((i17 & 112) | 6, getpostalcode, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            Modifier modifierAlign = BoxScopeInstance.serializer.align(companion, companion2.getBottomCenter());
            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                z = true;
                noInspectorInfo = new HelpDumpInterceptor$prettyString$1(1, 4);
            } else {
                z = true;
                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
            }
            ActionableMessageCardContainerKt.ActionableMessageCardContainer(gettopleftnoccac, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, AspectRatioKt.write(modifierAlign, noInspectorInfo, AspectRatioKt.write), r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getpostalcode, (i17 & 896) | (i16 & 126) | (i17 & 7168) | (458752 & i16) | (i16 & 3670016));
            getpostalcode.IconCompatParcelizer(z);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(gettopleftnoccac, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, modifier2, i);
        }
    }
}
