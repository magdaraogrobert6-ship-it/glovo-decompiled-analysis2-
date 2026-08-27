package com.roadrunner.inappnotifications.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.KeepScreenOnKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.TooltipKt;
import o.UiMediaScopeImpl;
import o.addViewInt;
import o.buildMapping;
import o.copyejIjP34;
import o.dispatchAnimationFinished;
import o.findRelativeAdapterPositionIn;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getItemCount;
import o.getItemId;
import o.getItemViewType;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPostalCode;
import o.getPushAlert;
import o.getRootCause;
import o.getStateRestorationPolicy;
import o.handleUrlOverridelambda1;
import o.hasObservers;
import o.hasStableIds;
import o.notifyItemChanged;
import o.notifyItemInserted;
import o.notifyItemMoved;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.setRoundRectOutlineTNW_H78default;
import o.supportingTextPaddinga9UjIt4material3default;
import o.unregisterAdapterDataObserver;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InAppNotificationLayoutComponentsKt {
    private static int read = 1;
    private static int serializer;

    public static final void InAppRow(getStateRestorationPolicy getstaterestorationpolicy, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifierWrite;
        Modifier modifierWrite2;
        Modifier modifierWrite3;
        Modifier modifierWrite4;
        Modifier modifierWrite5;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2089624438);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(getstaterestorationpolicy)) {
                int i6 = serializer + 91;
                read = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 == 0 ? 5 : 4;
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
            int i7 = serializer + 117;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.read(modifier)) {
                int i9 = read + 105;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i11 = serializer + 95;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(659862174);
            for (hasObservers hasobservers : getstaterestorationpolicy.RemoteActionCompatParcelizer) {
                if (!(hasobservers instanceof notifyItemInserted)) {
                    if (hasobservers instanceof findRelativeAdapterPositionIn) {
                        getpostalcode.serializer(255470428);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, ((findRelativeAdapterPositionIn) hasobservers).RemoteActionCompatParcelizer)});
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (!(hasobservers instanceof notifyItemMoved)) {
                        if (hasobservers instanceof getItemId) {
                            getpostalcode.serializer(-670182620);
                            getItemId getitemid = (getItemId) hasobservers;
                            Float f = getitemid.write;
                            if (f != null) {
                                modifierWrite4 = copyejIjP34.write(Modifier.Companion, f.floatValue());
                            } else {
                                modifierWrite4 = Modifier.Companion;
                            }
                            unregisterAdapterDataObserver.serializer(getitemid, modifierWrite4, getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        } else if (hasobservers instanceof getItemViewType) {
                            getpostalcode.serializer(-669943083);
                            getItemViewType getitemviewtype = (getItemViewType) hasobservers;
                            Float f2 = getitemviewtype.read;
                            if (f2 != null) {
                                modifierWrite3 = copyejIjP34.write(Modifier.Companion, f2.floatValue());
                            } else {
                                modifierWrite3 = Modifier.Companion;
                            }
                            InAppNotificationButtonKt.read(getitemviewtype, modifierWrite3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, i2 & 896);
                            getpostalcode.IconCompatParcelizer(false);
                        } else if (hasobservers instanceof getItemCount) {
                            int i13 = serializer + 11;
                            read = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            getpostalcode.serializer(-669625023);
                            getItemCount getitemcount = (getItemCount) hasobservers;
                            Float f3 = getitemcount.serializer;
                            float f4 = 1.0f;
                            if (f3 != null) {
                                int i15 = serializer + 3;
                                read = i15 % Fields.SpotShadowColor;
                                if (i15 % 2 == 0) {
                                    modifierWrite2 = copyejIjP34.write(Modifier.Companion, f3.floatValue());
                                    f4 = 2.0f;
                                } else {
                                    modifierWrite2 = copyejIjP34.write(Modifier.Companion, f3.floatValue());
                                }
                                modifierWrite = SizeKt.write(modifierWrite2, f4);
                            } else {
                                modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
                            }
                            Modifier modifier2 = modifierWrite;
                            int i16 = serializer + 29;
                            read = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            int i18 = i2 >> 3;
                            dispatchAnimationFinished.IconCompatParcelizer(getitemcount, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, getpostalcode, (i18 & 7168) | (i2 & 112) | (i18 & 896));
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 255458394, false);
                        }
                    } else {
                        int i19 = serializer + 59;
                        read = i19 % Fields.SpotShadowColor;
                        if (i19 % 2 == 0) {
                            getpostalcode.serializer(255473152);
                            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, copyejIjP34.write(Modifier.Companion, ((notifyItemMoved) hasobservers).read)});
                            getpostalcode.IconCompatParcelizer(true);
                        } else {
                            getpostalcode.serializer(255473152);
                            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, copyejIjP34.write(Modifier.Companion, ((notifyItemMoved) hasobservers).read)});
                            getpostalcode.IconCompatParcelizer(false);
                        }
                    }
                } else {
                    int i20 = serializer + 51;
                    read = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        getpostalcode.serializer(-670711511);
                        notifyItemInserted notifyiteminserted = (notifyItemInserted) hasobservers;
                        Float f5 = notifyiteminserted.serializer;
                        if (f5 != null) {
                            modifierWrite5 = copyejIjP34.write(Modifier.Companion, f5.floatValue());
                        } else {
                            modifierWrite5 = Modifier.Companion;
                        }
                        TextKt.m131TextNvy7gAk(notifyiteminserted.write, modifierWrite5, ColorKt.Color(notifyiteminserted.read), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, notifyiteminserted.IconCompatParcelizer, getpostalcode, 0, 0, 130040);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-670711511);
                        Float f6 = ((notifyItemInserted) hasobservers).serializer;
                        throw null;
                    }
                }
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) getstaterestorationpolicy, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 14);
        }
    }

    public static final void Page(hasStableIds hasstableids, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        Modifier modifierIconCompatParcelizer;
        Modifier modifierWrite;
        Modifier modifierWrite2;
        Modifier modifierWrite3;
        boolean z;
        boolean z2;
        Modifier modifierWrite4;
        int i4;
        int i5 = 2 % 2;
        hasstableids.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-367217650);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(hasstableids) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = read + 15;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i4 = Fields.RotationZ;
            } else {
                int i8 = serializer + 17;
                read = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 == 0 ? 2021 : Fields.CameraDistance;
            }
            i2 |= i4;
            int i9 = serializer + 37;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        Object obj = null;
        if ((196608 & i) == 0) {
            int i11 = read + 95;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                i2 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
            } else {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        int i12 = i2;
        if (!(!getpostalcode.write(i12 & 1, (74899 & i12) != 74898))) {
            Modifier modifierWrite5 = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ColorKt.Color(hasstableids.read), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite5);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i13 = read + 61;
                    serializer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        getpostalcode.serializer(constructor);
                        int i14 = 54 / 0;
                    } else {
                        getpostalcode.serializer(constructor);
                    }
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(115953091);
                Iterator it = hasstableids.RemoteActionCompatParcelizer.iterator();
                while (it.hasNext()) {
                    notifyItemChanged notifyitemchanged = (notifyItemChanged) it.next();
                    if (notifyitemchanged instanceof notifyItemInserted) {
                        getpostalcode.serializer(-638645399);
                        notifyItemInserted notifyiteminserted = (notifyItemInserted) notifyitemchanged;
                        Float f = notifyiteminserted.serializer;
                        if (f != null) {
                            modifierWrite4 = SizeKt.write(SizeKt.serializer(ModalBottomSheetDialogWrapper.IconCompatParcelizer(Modifier.Companion, f.floatValue()), Alignment.Companion.getCenterVertically(), 2), 1.0f);
                        } else {
                            modifierWrite4 = SizeKt.write(Modifier.Companion, 1.0f);
                        }
                        int i15 = read + 7;
                        serializer = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 != 0) {
                            z = false;
                            addViewInt.RemoteActionCompatParcelizer(modifierWrite4, notifyiteminserted, getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(true);
                        } else {
                            z = false;
                            addViewInt.RemoteActionCompatParcelizer(modifierWrite4, notifyiteminserted, getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                    } else {
                        if (notifyitemchanged instanceof findRelativeAdapterPositionIn) {
                            getpostalcode.serializer(-638630401);
                            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, ((findRelativeAdapterPositionIn) notifyitemchanged).RemoteActionCompatParcelizer)});
                            z2 = false;
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            if (notifyitemchanged instanceof notifyItemMoved) {
                                getpostalcode.serializer(-638627677);
                                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, ModalBottomSheetDialogWrapper.IconCompatParcelizer(Modifier.Companion, ((notifyItemMoved) notifyitemchanged).read)});
                                z2 = false;
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (notifyitemchanged instanceof getItemId) {
                                int i16 = serializer + 83;
                                read = i16 % Fields.SpotShadowColor;
                                if (i16 % 2 != 0) {
                                    getpostalcode.serializer(1677465853);
                                    getItemId getitemid = (getItemId) notifyitemchanged;
                                    Float f2 = getitemid.write;
                                    if (f2 != null) {
                                        modifierWrite3 = SizeKt.write(ModalBottomSheetDialogWrapper.IconCompatParcelizer(Modifier.Companion, f2.floatValue()), 1.0f);
                                    } else {
                                        modifierWrite3 = SizeKt.write(Modifier.Companion, 1.0f);
                                    }
                                    z = false;
                                    unregisterAdapterDataObserver.serializer(getitemid, modifierWrite3, getpostalcode, 0);
                                    getpostalcode.IconCompatParcelizer(false);
                                } else {
                                    getpostalcode.serializer(1677465853);
                                    Float f3 = ((getItemId) notifyitemchanged).write;
                                    obj.hashCode();
                                    throw null;
                                }
                            } else if (notifyitemchanged instanceof getItemViewType) {
                                getpostalcode.serializer(1677804590);
                                getItemViewType getitemviewtype = (getItemViewType) notifyitemchanged;
                                Float f4 = getitemviewtype.read;
                                if (f4 != null) {
                                    modifierWrite2 = SizeKt.write(ModalBottomSheetDialogWrapper.IconCompatParcelizer(Modifier.Companion, f4.floatValue()), 1.0f);
                                } else {
                                    modifierWrite2 = SizeKt.write(Modifier.Companion, 1.0f);
                                }
                                InAppNotificationButtonKt.read(getitemviewtype, modifierWrite2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, i12 & 896);
                                getpostalcode.IconCompatParcelizer(false);
                                i3 = i12;
                            } else if (notifyitemchanged instanceof getStateRestorationPolicy) {
                                getpostalcode.serializer(1678190540);
                                getStateRestorationPolicy getstaterestorationpolicy = (getStateRestorationPolicy) notifyitemchanged;
                                Float f5 = getstaterestorationpolicy.read;
                                if (f5 != null) {
                                    modifierWrite = SizeKt.write(ModalBottomSheetDialogWrapper.IconCompatParcelizer(Modifier.Companion, f5.floatValue()), 1.0f);
                                } else {
                                    modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
                                }
                                it = it;
                                i3 = i12;
                                InAppRow(getstaterestorationpolicy, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierWrite, getpostalcode, i12 & 65520);
                                getpostalcode.IconCompatParcelizer(false);
                            } else {
                                it = it;
                                i3 = i12;
                                if (notifyitemchanged instanceof getItemCount) {
                                    getpostalcode.serializer(1678758522);
                                    getItemCount getitemcount = (getItemCount) notifyitemchanged;
                                    Float f6 = getitemcount.serializer;
                                    if (f6 != null) {
                                        modifierIconCompatParcelizer = ModalBottomSheetDialogWrapper.IconCompatParcelizer(Modifier.Companion, f6.floatValue());
                                    } else {
                                        modifierIconCompatParcelizer = Modifier.Companion;
                                    }
                                    Modifier modifier2 = modifierIconCompatParcelizer;
                                    int i17 = i3 >> 3;
                                    dispatchAnimationFinished.IconCompatParcelizer(getitemcount, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, getpostalcode, (i3 & 112) | (i17 & 896) | (i17 & 7168));
                                    getpostalcode.IconCompatParcelizer(false);
                                } else {
                                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -638645128, false);
                                }
                            }
                            int i18 = serializer + 47;
                            read = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            it = it;
                            i12 = i3;
                        }
                        i3 = i12;
                        int i110 = serializer + 47;
                        read = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        it = it;
                        i12 = i3;
                    }
                    i3 = i12;
                    int i112 = serializer + 47;
                    read = i112 % Fields.SpotShadowColor;
                    int i113 = i112 % 2;
                    it = it;
                    i12 = i3;
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) hasstableids, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0361  */
    public static final void AnimationPage(hasStableIds hasstableids, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        Object next;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 23;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        hasstableids.getClass();
        ArrayList<notifyItemChanged> arrayList = hasstableids.RemoteActionCompatParcelizer;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-691345886);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        int i6 = (i & 6) == 0 ? (!getpostalcode2.IconCompatParcelizer(hasstableids) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i6 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
            int i7 = serializer + 99;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 3 / 3;
            }
        }
        if ((i & 3072) == 0) {
            i6 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i9 = read + 69;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i2 = Fields.Clip;
            } else {
                i2 = 8192;
            }
            i6 |= i2;
        }
        if ((i & 196608) == 0) {
            i6 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 1048576 : Fields.BlendMode;
        }
        int i11 = i6;
        if (getpostalcode2.write(i11 & 1, (599187 & i11) != 599186)) {
            Modifier modifierKeepScreenOn = KeepScreenOnKt.keepScreenOn(BackgroundKt.m20backgroundbw27NRU(modifier, ColorKt.Color(hasstableids.read), RectangleShapeKt.getRectangleShape()));
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierKeepScreenOn);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i12 = read + 3;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    getpostalcode2.serializer(constructor);
                    int i13 = 51 / 0;
                } else {
                    getpostalcode2.serializer(constructor);
                }
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i14 = serializer + 113;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                next = it.next();
            } while (!(((notifyItemChanged) next) instanceof getItemCount));
            getItemCount getitemcount = next instanceof getItemCount ? (getItemCount) next : null;
            if (getitemcount != null) {
                int i16 = serializer + 3;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode2.serializer(1944672743);
                int i18 = i11 >> 3;
                dispatchAnimationFinished.IconCompatParcelizer(getitemcount, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier.Companion.then(SizeKt.read), getpostalcode2, (i18 & 7168) | (i11 & 112) | 24576 | (i18 & 896));
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(1944977690);
                getpostalcode2.IconCompatParcelizer(false);
            }
            Modifier.Companion companion2 = Modifier.Companion;
            WeakHashMap weakHashMap = TooltipKt.serializer;
            Modifier modifierWrite = SizeKt.write(PaddingKt.IconCompatParcelizer(companion2, OffsetKt.read(setRoundRectOutlineTNW_H78default.read(getpostalcode2).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode2)), 1.0f);
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment topEnd = companion3.getTopEnd();
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
            Modifier modifierAlign = boxScopeInstance.align(modifierWrite, topEnd);
            float f = Dimensions.setTabContainer;
            Modifier modifierWrite2 = PaddingKt.write(modifierAlign, f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.RemoteActionCompatParcelizer, companion3.getTop(), getpostalcode2, 54);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            boolean z = true;
            getRootCause.write(R.drawable.ic_bold_medium_cancel_thin, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, companion2, new getPushAlert(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0()), false, null, null, getpostalcode2, ((i11 >> 15) & 112) | 384, 240);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(WindowInsetsPaddingKt.windowInsetsPadding(boxScopeInstance.align(companion2, companion3.getBottomCenter()), setRoundRectOutlineTNW_H78default.read(getpostalcode).PlaybackStateCompat), Dimensions.getAnimatedVisibility, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.write, companion3.getCenterHorizontally(), getpostalcode, 54);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion4.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            getpostalcode.serializer(-1854662145);
            for (notifyItemChanged notifyitemchanged : arrayList) {
                if (notifyitemchanged instanceof notifyItemInserted) {
                    int i19 = read + 23;
                    serializer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    getpostalcode.serializer(-282399087);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i21 = read + 31;
                    int i22 = i21 % Fields.SpotShadowColor;
                    serializer = i22;
                    int i23 = i21 % 2;
                    if ((notifyitemchanged instanceof findRelativeAdapterPositionIn) || (notifyitemchanged instanceof notifyItemMoved)) {
                        int i110 = read + 23;
                        serializer = i110 % Fields.SpotShadowColor;
                        int i24 = i110 % 2;
                        getpostalcode.serializer(-282399087);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        int i25 = i22 + 43;
                        read = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        if (notifyitemchanged instanceof getItemId) {
                            int i111 = read + 23;
                            serializer = i111 % Fields.SpotShadowColor;
                            int i27 = i111 % 2;
                            getpostalcode.serializer(-282399087);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            int i28 = i22 + 63;
                            read = i28 % Fields.SpotShadowColor;
                            int i29 = i28 % 2;
                            if (notifyitemchanged instanceof getItemCount) {
                                int i112 = read + 23;
                                serializer = i112 % Fields.SpotShadowColor;
                                int i210 = i112 % 2;
                                getpostalcode.serializer(-282399087);
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (notifyitemchanged instanceof getItemViewType) {
                                getpostalcode.serializer(-282235159);
                                InAppNotificationButtonKt.read((getItemViewType) notifyitemchanged, Modifier.Companion, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i11 & 896) | 48);
                                getpostalcode.IconCompatParcelizer(false);
                            } else {
                                if (!(notifyitemchanged instanceof getStateRestorationPolicy)) {
                                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1099262184, false);
                                }
                                getpostalcode.serializer(-281969272);
                                InAppRow((getStateRestorationPolicy) notifyitemchanged, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, SizeKt.write(Modifier.Companion, 1.0f), getpostalcode, (i11 & 112) | 196608 | (i11 & 896) | (i11 & 7168) | (57344 & i11));
                                getpostalcode.IconCompatParcelizer(false);
                            }
                        }
                    }
                }
                z = true;
            }
            boolean z2 = z;
            af$$ExternalSyntheticOutline0.m(getpostalcode, false, z2, z2);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(hasstableids, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i);
        }
    }
}
