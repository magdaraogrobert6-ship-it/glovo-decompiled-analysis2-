package com.roadrunner.freelancing.presentation.tab;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.freelancing.api.presentation.tab.WorkOpportunityTypeSelectorUiModel;
import com.roadrunner.home.HomeFragment;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.SizeKt;
import o.TextFieldDefaults;
import o.accessgetInstancedelegatecp;
import o.buildMapping;
import o.canReadPlayIds;
import o.createFromParcel;
import o.createNotificationChannel;
import o.createNotificationChannelGroup;
import o.createNotificationChannelGroups;
import o.createNotificationChannelGroupsCompat;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInternalPaintui_graphics;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.handleUrlOverridelambda1;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkOpportunityTypeSelectorKt {
    private static int serializer = 1;
    private static int write;

    public static final void WorkOpportunityTypeSelector(WorkOpportunityTypeSelectorUiModel workOpportunityTypeSelectorUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        workOpportunityTypeSelectorUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1915346561);
        if ((i & 6) == 0) {
            if (getpostalcode.read(workOpportunityTypeSelectorUiModel)) {
                int i5 = write + 23;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if (!getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i8 = serializer + 59;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            modifier2 = Modifier.Companion;
            createNotificationChannelGroups createnotificationchannelgroups = (createNotificationChannelGroups) ExtrasKt.write(((WorkOpportunityTypeSelectorUiModelImpl) workOpportunityTypeSelectorUiModel).RatingCompat, getpostalcode, 0).getValue();
            if (createnotificationchannelgroups instanceof createNotificationChannelGroup) {
                getpostalcode.serializer(-1892917115);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(createnotificationchannelgroups instanceof createNotificationChannel)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1892918349, false);
                }
                int i10 = serializer + 101;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(-1892915937);
                createNotificationChannel createnotificationchannel = (createNotificationChannel) createnotificationchannelgroups;
                boolean z = (i7 & 14) == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                    HomeFragment.AnonymousClass1 anonymousClass1 = new HomeFragment.AnonymousClass1(1, workOpportunityTypeSelectorUiModel, WorkOpportunityTypeSelectorUiModel.class, "onTypeSelected", "onTypeSelected(Lcom/roadrunner/freelancing/api/presentation/tab/WorkOpportunityTypeSelection;)V", 0, 12);
                    getpostalcode.write(anonymousClass1);
                    objComponentActivity = anonymousClass1;
                }
                WorkOpportunityTypeSelectorContent(createnotificationchannel, modifier2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, i7 & 112);
                getpostalcode.IconCompatParcelizer(false);
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, 7, workOpportunityTypeSelectorUiModel, modifier2);
            int i12 = write + 73;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
    }

    public static final void WorkOpportunityTypeSelectorContent(createNotificationChannel createnotificationchannel, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(165177076);
        Object obj = null;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i5 = write + 1;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    getpostalcode.read(createnotificationchannel);
                    obj.hashCode();
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(createnotificationchannel);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(createnotificationchannel);
            }
            if (zIconCompatParcelizer) {
                int i6 = serializer + 91;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = serializer + 95;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i10 = serializer + 1;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(modifier, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility, Dimensions.setTabContainer);
            float f = Dimensions.write;
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme();
            float f2 = Dimensions.menuHostHelperlambda0;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(BorderKt.write(PaddingKt.write(BorderKt.write(modifierRemoteActionCompatParcelizer, f, popupTheme, RoundedCornerShapeKt.IconCompatParcelizer(f2)), f), f, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RoundedCornerShapeKt.IconCompatParcelizer(f2)), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i12 = write + 109;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                getpostalcode.serializer(constructor);
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(-896351710);
            List list = createnotificationchannel.read;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SelectorSegment((createNotificationChannelGroupsCompat) it.next(), d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion), r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, i2 & 896);
                arrayList.add(createFromParcel.INSTANCE);
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 5, createnotificationchannel, modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    public static final void SelectorSegment(createNotificationChannelGroupsCompat createnotificationchannelgroupscompat, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1713245169);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i6 = write + 69;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(createnotificationchannelgroupscompat);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(createnotificationchannelgroupscompat);
            }
            if (zIconCompatParcelizer) {
                int i8 = serializer + 69;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 4 / 5;
                }
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = serializer + 49;
                write = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 != 0 ? 23593 : 256;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(companion3, 1.0f);
                if ((i2 & 896) == 256) {
                    int i11 = serializer + 41;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if ((i2 & 14) != 4) {
                    if ((i2 & 8) != 0) {
                        int i13 = serializer + 13;
                        write = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            z2 = getpostalcode.IconCompatParcelizer(createnotificationchannelgroupscompat);
                        } else {
                            getpostalcode.IconCompatParcelizer(createnotificationchannelgroupscompat);
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new d4$$ExternalSyntheticLambda2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 28, createnotificationchannelgroupscompat);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifier2 = canReadPlayIds.read(modifierWrite, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedInput_delegatelambda0);
                int i14 = createnotificationchannelgroupscompat.serializer;
                int i15 = createnotificationchannelgroupscompat.RemoteActionCompatParcelizer;
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier2, ColorResources_androidKt.colorResource(i14, getpostalcode, 0), gettopleftannotationsIconCompatParcelizer);
                float f = Dimensions.setSplitBackground;
                Modifier modifierWrite2 = PaddingKt.write(modifierM20backgroundbw27NRU, f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, companion.getCenterVertically(), getpostalcode, 54);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i16 = write + 75;
                    serializer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.serializer(constructor2);
                        obj.hashCode();
                        throw null;
                    }
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(createnotificationchannelgroupscompat.write, getpostalcode, 0), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(i15, getpostalcode, 0), getpostalcode, Painter.$stable | 48, 4);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(companion3, Dimensions.setPrimaryBackground)});
                TextKt.m131TextNvy7gAk(createnotificationchannelgroupscompat.read, null, ColorResources_androidKt.colorResource(i15, getpostalcode, 0), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, createnotificationchannelgroupscompat.RatingCompat, getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                if (createnotificationchannelgroupscompat.IconCompatParcelizer) {
                    int i17 = serializer + 67;
                    write = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    getpostalcode.serializer(1342883375);
                    BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(BoxScopeInstance.serializer.align(companion3, companion.getCenterStart()), f, 0.0f, 0.0f, 0.0f, 14), Dimensions.getNestedScrollAxes), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList(), RoundedCornerShapeKt.IconCompatParcelizer), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(1343167831);
                    getpostalcode.IconCompatParcelizer(false);
                    int i19 = serializer + 35;
                    write = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 != 0) {
                        int i20 = 3 / 3;
                    }
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 4, createnotificationchannelgroupscompat, modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
