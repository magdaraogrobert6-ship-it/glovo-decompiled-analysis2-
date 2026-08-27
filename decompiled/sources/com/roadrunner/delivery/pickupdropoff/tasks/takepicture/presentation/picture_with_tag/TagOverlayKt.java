package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.TagOverlayKt$$ExternalSyntheticLambda3;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LayoutDirection;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.containsInclusive;
import o.createInAppMessageEventSubscriber;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.internalPathIteratorPeek;
import o.mainAxisk4lQ0M;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setEditorBoundsInfo;
import o.supportingTextPaddinga9UjIt4material3default;
import o.u3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TagOverlayKt {
    private static int serializer = 0;
    private static int write = 1;

    public static final void read(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1365242740);
        if ((i & 6) == 0) {
            int i4 = serializer + 41;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        boolean z = false;
        if ((i5 & 19) != 18) {
            int i6 = serializer + 107;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                z = true;
            }
        }
        if (getpostalcode.write(i5 & 1, z)) {
            modifier = Modifier.Companion;
            float f = Dimensions.setSplitBackground;
            FlowLayoutKt.serializer(PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, f, 0.0f, 0.0f, 13), Arrangement.IconCompatParcelizer(f), Arrangement.IconCompatParcelizer(f), null, 0, 0, ExtrasKt.write(-932396391, new TagOverlayKt$$ExternalSyntheticLambda3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 2), getpostalcode), getpostalcode, 1572864, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new u3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void TagOverlay(LayoutDirection layoutDirection, Modifier modifier, Animatable animatable, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Animatable animatable2;
        Animatable animatableWrite;
        Integer numValueOf;
        ?? r1;
        boolean z2;
        float f;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 87;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-137917648);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(layoutDirection);
            } else {
                int i8 = serializer + 115;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                zIconCompatParcelizer = getpostalcode.read(layoutDirection);
                int i10 = write + 91;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            if (zIconCompatParcelizer) {
                int i12 = serializer + 25;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i13 = serializer + 93;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i15 = write + 63;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                animatableWrite = animatable;
            } else {
                animatableWrite = mainAxisk4lQ0M.write(0.0f);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i17 = write + 59;
                serializer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.write(animatableWrite);
                objComponentActivity = animatableWrite;
            }
            Animatable animatable3 = (Animatable) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity2);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable3, null, 7), 3);
                getpostalcode.write(objComponentActivity3);
            }
            createinappmessageeventsubscriber.IconCompatParcelizer = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity4;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(animatable3);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new setEditorBoundsInfo(animatable3, 3);
                getpostalcode.write(objComponentActivity5);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5);
            float f2 = Dimensions.setTabContainer;
            Modifier modifierSerializer = ClickableKt.serializer(PaddingKt.write(modifierGraphicsLayer, f2), mutableInteractionSourceImpl, null, false, null, new containsInclusive(createinappmessageeventsubscriber, getcontentviewgroupparentlayout, animatable3, 1), 28);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                String str = layoutDirection.mainIcon;
                if (str == null) {
                    numValueOf = null;
                } else {
                    int iHashCode2 = str.hashCode();
                    if (iHashCode2 != -1039210502) {
                        if (iHashCode2 != 3347807) {
                            if (iHashCode2 == 1082290744 && str.equals("receipt")) {
                                numValueOf = Integer.valueOf(R.drawable.ic_bold_large_receipt_receipt);
                            } else {
                                numValueOf = null;
                            }
                        } else if (str.equals("menu")) {
                            numValueOf = Integer.valueOf(R.drawable.ic_bold_large_book_book_flip);
                        } else {
                            numValueOf = null;
                        }
                    } else if (str.equals("shopping_bag_check")) {
                        numValueOf = Integer.valueOf(R.drawable.ic_bold_large_essentials_shopping_bag_check);
                    } else {
                        numValueOf = null;
                    }
                }
                if (numValueOf != null) {
                    getpostalcode.serializer(-966896287);
                    int iIntValue = numValueOf.intValue();
                    Modifier.Companion companion3 = Modifier.Companion;
                    MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
                    int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.crop_frame, getpostalcode, 0);
                    int i19 = Painter.$stable | 48;
                    r1 = 0;
                    ImageKt.Image(painterPainterResource, "Camera click button", null, null, null, 0.0f, null, getpostalcode, i19, 124);
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(iIntValue, getpostalcode, 0), "Tags main icon", BoxScopeInstance.serializer.align(companion3, companion.getCenter()), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), getpostalcode, i19, 0);
                    z2 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    f = f2;
                    Object[] objArr = {getpostalcode, SizeKt.m86width3ABfNKs(companion3, f)};
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i20 = write + 113;
                    serializer = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        getpostalcode.serializer(-966896288);
                        getpostalcode.IconCompatParcelizer(true);
                    } else {
                        getpostalcode.serializer(-966896288);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    f = f2;
                    r1 = 0;
                    z2 = true;
                }
                Modifier modifierWrite2 = SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, f, 0.0f, 11), 1.0f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, r1);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                String str2 = layoutDirection.title;
                if (str2 != null) {
                    getpostalcode.serializer(-694440350);
                    TextKt.m131TextNvy7gAk(str2, null, Color.Companion.m759getWhite0d7_KjU(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode, 384, 0, 131066);
                    getpostalcode.IconCompatParcelizer((boolean) r1);
                } else {
                    int i21 = write + 21;
                    serializer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    getpostalcode.serializer(-694440351);
                    getpostalcode.IconCompatParcelizer((boolean) r1);
                }
                List list = layoutDirection.tags;
                if (list != null) {
                    getpostalcode.serializer(-694305438);
                    read(removeNodeAtDepth.RemoteActionCompatParcelizer(list), null, getpostalcode, r1);
                    getpostalcode.IconCompatParcelizer((boolean) r1);
                } else {
                    int i23 = serializer + 109;
                    write = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    getpostalcode.serializer(-694305439);
                    getpostalcode.IconCompatParcelizer((boolean) r1);
                }
                getpostalcode.IconCompatParcelizer(z2);
                getpostalcode.IconCompatParcelizer(z2);
                animatable2 = animatableWrite;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            animatable2 = animatable;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 2, modifier, (Object) layoutDirection, (Object) animatable2);
        }
    }
}
