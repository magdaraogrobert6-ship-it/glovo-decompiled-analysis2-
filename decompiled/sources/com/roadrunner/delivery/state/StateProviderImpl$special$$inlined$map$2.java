package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.HttpHeaders;
import com.roadrunner.delivery.repository.api.DeliveryInformation$DeliveryStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AndroidPopup_androidKtPopup41;
import o.AndroidViewHolderlayoutNode1coreModifier3;
import o.AndroidView_androidKtAndroidView1;
import o.AndroidView_androidKtAndroidView21;
import o.AndroidView_androidKtAndroidView22;
import o.AndroidView_androidKtAndroidView23;
import o.DefaultImplgetFontLoadStateinitCallback1;
import o.DeleteAllCommand;
import o.DeleteSurroundingTextCommand;
import o.EditCommand;
import o.EmojiCompatStatus_androidKt;
import o.HyphensCompanion;
import o.ImmutableBool;
import o.LocaleListCompanion;
import o.Locale_jvmAndAndroidKt;
import o.ShortNewsContentCardView;
import o.accessgetBalancedcp;
import o.accessgetGocp;
import o.accessgetHighQualitycp;
import o.copy38bxuX8;
import o.copy38bxuX8default;
import o.copyJdDtMQoui_textdefault;
import o.createFromParcel;
import o.drawMultiParagraph7AXcY_I;
import o.drawMultiParagraph7AXcY_Idefault;
import o.fastCoerceAtMost;
import o.getFailureResponseData;
import o.getMFromSpValuesannotations;
import o.getUnspecifiedrAG3T2k;
import o.getValueXSAIIZE;
import o.getViewInfosui_tooling;
import o.initui_tooling;
import o.invoke58bKbWc;
import o.isInsideContent;
import o.isItemDismissable;
import o.isNonLinearFontScalingActive;
import o.isTrackingEnabled;
import o.maybeRegisterBackCallback;
import o.onContentCardClicked;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.requireViewFactoryHolder;
import o.setSLookupTables;
import o.takeOrElseeAf_CNQ;
import o.timesmpE4wyQ;
import o.updateViewHolderParams6NefGtU;

/* JADX INFO: loaded from: classes3.dex */
public final class StateProviderImpl$special$$inlined$map$2 implements Flow {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Flow RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX INFO: renamed from: com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int serializer = 1;
        private static int write;
        public final /* synthetic */ FlowCollector IconCompatParcelizer;
        public final /* synthetic */ int read;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.read = i;
            this.IconCompatParcelizer = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, int i) {
            this.read = i;
            this.IconCompatParcelizer = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:109:0x0191  */
        /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:142:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:14:0x0041  */
        /* JADX WARN: Code duplicated, block: B:164:0x024b  */
        /* JADX WARN: Code duplicated, block: B:185:0x0294  */
        /* JADX WARN: Code duplicated, block: B:206:0x02e2  */
        /* JADX WARN: Code duplicated, block: B:232:0x033c  */
        /* JADX WARN: Code duplicated, block: B:247:0x039a  */
        /* JADX WARN: Code duplicated, block: B:262:0x03db  */
        /* JADX WARN: Code duplicated, block: B:290:0x0460  */
        /* JADX WARN: Code duplicated, block: B:322:0x04c7  */
        /* JADX WARN: Code duplicated, block: B:344:0x0515  */
        /* JADX WARN: Code duplicated, block: B:364:0x055b  */
        /* JADX WARN: Code duplicated, block: B:37:0x0093  */
        /* JADX WARN: Code duplicated, block: B:386:0x05a9  */
        /* JADX WARN: Code duplicated, block: B:417:0x0611  */
        /* JADX WARN: Code duplicated, block: B:439:0x065f  */
        /* JADX WARN: Code duplicated, block: B:461:0x06ad  */
        /* JADX WARN: Code duplicated, block: B:485:0x0703  */
        /* JADX WARN: Code duplicated, block: B:509:0x075f  */
        /* JADX WARN: Code duplicated, block: B:534:0x07b3  */
        /* JADX WARN: Code duplicated, block: B:556:0x0801  */
        /* JADX WARN: Code duplicated, block: B:573:0x0840  */
        /* JADX WARN: Code duplicated, block: B:593:0x088d  */
        /* JADX WARN: Code duplicated, block: B:608:0x08c7  */
        /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:623:0x0901  */
        /* JADX WARN: Code duplicated, block: B:639:0x0944  */
        /* JADX WARN: Code duplicated, block: B:81:0x0130  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AndroidView_androidKtAndroidView21 androidView_androidKtAndroidView21;
            getValueXSAIIZE getvaluexsaiize;
            DeleteAllCommand deleteAllCommand;
            DeleteSurroundingTextCommand deleteSurroundingTextCommand;
            EditCommand editCommand;
            Locale_jvmAndAndroidKt locale_jvmAndAndroidKt;
            LocaleListCompanion localeListCompanion;
            drawMultiParagraph7AXcY_Idefault drawmultiparagraph7axcy_idefault;
            drawMultiParagraph7AXcY_I drawmultiparagraph7axcy_i;
            DefaultImplgetFontLoadStateinitCallback1 defaultImplgetFontLoadStateinitCallback1;
            EmojiCompatStatus_androidKt emojiCompatStatus_androidKt;
            ImmutableBool immutableBool;
            isNonLinearFontScalingActive isnonlinearfontscalingactive;
            accessgetHighQualitycp accessgethighqualitycp;
            accessgetBalancedcp accessgetbalancedcp;
            getUnspecifiedrAG3T2k getunspecifiedrag3t2k;
            Object isitemdismissable;
            AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3;
            copy38bxuX8 copy38bxux8;
            copy38bxuX8default copy38bxux8default;
            copyJdDtMQoui_textdefault copyjddtmqoui_textdefault;
            initui_tooling initui_toolingVar;
            getViewInfosui_tooling getviewinfosui_tooling;
            takeOrElseeAf_CNQ takeorelseeaf_cnq;
            setSLookupTables setslookuptables;
            getMFromSpValuesannotations getmfromspvaluesannotations;
            requireViewFactoryHolder requireviewfactoryholder;
            String str;
            AndroidView_androidKtAndroidView23 androidView_androidKtAndroidView23;
            updateViewHolderParams6NefGtU updateviewholderparams6nefgtu;
            AndroidView_androidKtAndroidView22 androidView_androidKtAndroidView22;
            AndroidView_androidKtAndroidView1 androidView_androidKtAndroidView1;
            int i = 2 % 2;
            int i2 = serializer + 89;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            FlowCollector flowCollector = this.IconCompatParcelizer;
            boolean z = false;
            Object accessgetgocp = null;
            switch (i4) {
                case 0:
                    if (shortNewsContentCardView instanceof AndroidView_androidKtAndroidView21) {
                        androidView_androidKtAndroidView21 = (AndroidView_androidKtAndroidView21) shortNewsContentCardView;
                        int i5 = androidView_androidKtAndroidView21.write;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            androidView_androidKtAndroidView21.write = i5 - Integer.MIN_VALUE;
                        } else {
                            androidView_androidKtAndroidView21 = new AndroidView_androidKtAndroidView21(this, shortNewsContentCardView);
                        }
                    } else {
                        androidView_androidKtAndroidView21 = new AndroidView_androidKtAndroidView21(this, shortNewsContentCardView);
                    }
                    Object obj2 = androidView_androidKtAndroidView21.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = androidView_androidKtAndroidView21.write;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i7 = write + 41;
                        serializer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (obj3 instanceof isItemDismissable) {
                        accessgetgocp = obj3;
                    } else {
                        maybeRegisterBackCallback mayberegisterbackcallback = (maybeRegisterBackCallback) obj3;
                        if (mayberegisterbackcallback != null) {
                            accessgetgocp = mayberegisterbackcallback.data;
                        }
                    }
                    onItemDismiss onitemdismiss = new onItemDismiss(accessgetgocp);
                    androidView_androidKtAndroidView21.write = 1;
                    return flowCollector.emit(onitemdismiss, androidView_androidKtAndroidView21) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                case 1:
                    if (shortNewsContentCardView instanceof getValueXSAIIZE) {
                        getvaluexsaiize = (getValueXSAIIZE) shortNewsContentCardView;
                        int i9 = getvaluexsaiize.RemoteActionCompatParcelizer;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            getvaluexsaiize.RemoteActionCompatParcelizer = i9 - Integer.MIN_VALUE;
                        } else {
                            getvaluexsaiize = new getValueXSAIIZE(this, shortNewsContentCardView);
                        }
                    } else {
                        getvaluexsaiize = new getValueXSAIIZE(this, shortNewsContentCardView);
                    }
                    Object obj4 = getvaluexsaiize.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = getvaluexsaiize.RemoteActionCompatParcelizer;
                    if (i10 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        Set set = ((timesmpE4wyQ) obj).MediaBrowserCompatMediaItem;
                        getvaluexsaiize.RemoteActionCompatParcelizer = 1;
                        return flowCollector.emit(set, getvaluexsaiize) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                    }
                    if (i10 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 2:
                    if (shortNewsContentCardView instanceof DeleteAllCommand) {
                        deleteAllCommand = (DeleteAllCommand) shortNewsContentCardView;
                        int i11 = deleteAllCommand.serializer;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            deleteAllCommand.serializer = i11 - Integer.MIN_VALUE;
                        } else {
                            deleteAllCommand = new DeleteAllCommand(this, shortNewsContentCardView);
                        }
                    } else {
                        deleteAllCommand = new DeleteAllCommand(this, shortNewsContentCardView);
                    }
                    Object obj5 = deleteAllCommand.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = deleteAllCommand.serializer;
                    if (i12 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj5);
                        isTrackingEnabled istrackingenabled = ((getFailureResponseData) obj).RemoteActionCompatParcelizer;
                        deleteAllCommand.serializer = 1;
                        return flowCollector.emit(istrackingenabled, deleteAllCommand) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
                    }
                    if (i12 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj5);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 3:
                    if (shortNewsContentCardView instanceof DeleteSurroundingTextCommand) {
                        deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) shortNewsContentCardView;
                        int i13 = deleteSurroundingTextCommand.write;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            deleteSurroundingTextCommand.write = i13 - Integer.MIN_VALUE;
                        } else {
                            deleteSurroundingTextCommand = new DeleteSurroundingTextCommand(this, shortNewsContentCardView);
                        }
                    } else {
                        deleteSurroundingTextCommand = new DeleteSurroundingTextCommand(this, shortNewsContentCardView);
                    }
                    Object obj6 = deleteSurroundingTextCommand.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = deleteSurroundingTextCommand.write;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj6);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj6);
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
                    invoke58bKbWc invoke58bkbwc = (invoke58bKbWc) onviewattachedtowindowlambda0.serializer;
                    invoke58bKbWc invoke58bkbwc2 = (invoke58bKbWc) onviewattachedtowindowlambda0.write;
                    if (invoke58bkbwc == invoke58bKbWc.DROPOFF_IN_PROGRESS && invoke58bkbwc2 == invoke58bKbWc.NO_DELIVERIES) {
                        z = true;
                    }
                    deleteSurroundingTextCommand.write = 1;
                    return flowCollector.emit(Boolean.valueOf(z), deleteSurroundingTextCommand) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
                case 4:
                    if (shortNewsContentCardView instanceof EditCommand) {
                        editCommand = (EditCommand) shortNewsContentCardView;
                        int i15 = editCommand.read;
                        if ((i15 & Integer.MIN_VALUE) != 0) {
                            editCommand.read = i15 - Integer.MIN_VALUE;
                        } else {
                            editCommand = new EditCommand(this, shortNewsContentCardView);
                        }
                    } else {
                        editCommand = new EditCommand(this, shortNewsContentCardView);
                    }
                    Object obj7 = editCommand.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = editCommand.read;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj7);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj7);
                    if (!((Boolean) obj).booleanValue()) {
                        return createfromparcel;
                    }
                    editCommand.read = 1;
                    return flowCollector.emit(obj, editCommand) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
                case 5:
                    if (shortNewsContentCardView instanceof Locale_jvmAndAndroidKt) {
                        locale_jvmAndAndroidKt = (Locale_jvmAndAndroidKt) shortNewsContentCardView;
                        int i17 = locale_jvmAndAndroidKt.serializer;
                        if ((i17 & Integer.MIN_VALUE) != 0) {
                            locale_jvmAndAndroidKt.serializer = i17 - Integer.MIN_VALUE;
                        } else {
                            locale_jvmAndAndroidKt = new Locale_jvmAndAndroidKt(this, shortNewsContentCardView);
                        }
                    } else {
                        locale_jvmAndAndroidKt = new Locale_jvmAndAndroidKt(this, shortNewsContentCardView);
                    }
                    Object obj8 = locale_jvmAndAndroidKt.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = locale_jvmAndAndroidKt.serializer;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj8);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj8);
                    Object obj9 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj9 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = (AndroidPopup_androidKtPopup41) obj9;
                        obj9 = (fastCoerceAtMost) (androidPopup_androidKtPopup41 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup41 : null);
                    }
                    onItemDismiss onitemdismiss2 = new onItemDismiss(obj9);
                    locale_jvmAndAndroidKt.serializer = 1;
                    return flowCollector.emit(onitemdismiss2, locale_jvmAndAndroidKt) == coroutineSingletons6 ? coroutineSingletons6 : createfromparcel;
                case 6:
                    if (shortNewsContentCardView instanceof LocaleListCompanion) {
                        localeListCompanion = (LocaleListCompanion) shortNewsContentCardView;
                        int i19 = localeListCompanion.RemoteActionCompatParcelizer;
                        if ((i19 & Integer.MIN_VALUE) != 0) {
                            localeListCompanion.RemoteActionCompatParcelizer = i19 - Integer.MIN_VALUE;
                        } else {
                            localeListCompanion = new LocaleListCompanion(this, shortNewsContentCardView);
                        }
                    } else {
                        localeListCompanion = new LocaleListCompanion(this, shortNewsContentCardView);
                    }
                    Object obj10 = localeListCompanion.write;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = localeListCompanion.RemoteActionCompatParcelizer;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj10);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj10);
                    Object obj11 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (obj11 instanceof isItemDismissable) {
                        int i21 = write + 83;
                        serializer = i21 % Fields.SpotShadowColor;
                        if (i21 % 2 == 0) {
                            accessgetgocp.hashCode();
                            throw null;
                        }
                        obj11 = null;
                    }
                    fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj11;
                    accessgetgocp = fastcoerceatmost != null ? fastcoerceatmost.mapComponent : null;
                    localeListCompanion.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(accessgetgocp, localeListCompanion) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
                case 7:
                    if (shortNewsContentCardView instanceof drawMultiParagraph7AXcY_Idefault) {
                        drawmultiparagraph7axcy_idefault = (drawMultiParagraph7AXcY_Idefault) shortNewsContentCardView;
                        int i22 = drawmultiparagraph7axcy_idefault.read;
                        if ((i22 & Integer.MIN_VALUE) != 0) {
                            drawmultiparagraph7axcy_idefault.read = i22 - Integer.MIN_VALUE;
                        } else {
                            drawmultiparagraph7axcy_idefault = new drawMultiParagraph7AXcY_Idefault(this, shortNewsContentCardView);
                        }
                    } else {
                        drawmultiparagraph7axcy_idefault = new drawMultiParagraph7AXcY_Idefault(this, shortNewsContentCardView);
                    }
                    Object obj12 = drawmultiparagraph7axcy_idefault.write;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = drawmultiparagraph7axcy_idefault.read;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj12);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj12);
                    Object obj13 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj13 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup42 = (AndroidPopup_androidKtPopup41) obj13;
                        if (androidPopup_androidKtPopup42 instanceof fastCoerceAtMost) {
                            accessgetgocp = androidPopup_androidKtPopup42;
                        } else {
                            int i24 = write + 119;
                            serializer = i24 % Fields.SpotShadowColor;
                            if (i24 % 2 == 0) {
                                int i25 = 48 / 0;
                            }
                        }
                        obj13 = (fastCoerceAtMost) accessgetgocp;
                    }
                    onItemDismiss onitemdismiss3 = new onItemDismiss(obj13);
                    drawmultiparagraph7axcy_idefault.read = 1;
                    return flowCollector.emit(onitemdismiss3, drawmultiparagraph7axcy_idefault) == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel;
                case 8:
                    if (shortNewsContentCardView instanceof drawMultiParagraph7AXcY_I) {
                        drawmultiparagraph7axcy_i = (drawMultiParagraph7AXcY_I) shortNewsContentCardView;
                        int i26 = drawmultiparagraph7axcy_i.IconCompatParcelizer;
                        if ((i26 & Integer.MIN_VALUE) != 0) {
                            drawmultiparagraph7axcy_i.IconCompatParcelizer = i26 - Integer.MIN_VALUE;
                        } else {
                            drawmultiparagraph7axcy_i = new drawMultiParagraph7AXcY_I(this, shortNewsContentCardView);
                        }
                    } else {
                        drawmultiparagraph7axcy_i = new drawMultiParagraph7AXcY_I(this, shortNewsContentCardView);
                    }
                    Object obj14 = drawmultiparagraph7axcy_i.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = drawmultiparagraph7axcy_i.IconCompatParcelizer;
                    if (i27 != 0) {
                        if (i27 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj14);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj14);
                    Object obj15 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (obj15 instanceof isItemDismissable) {
                        obj15 = null;
                    }
                    fastCoerceAtMost fastcoerceatmost2 = (fastCoerceAtMost) obj15;
                    if (fastcoerceatmost2 != null) {
                        int i28 = serializer + 11;
                        write = i28 % Fields.SpotShadowColor;
                        if (i28 % 2 != 0) {
                            accessgetgocp = fastcoerceatmost2.destinationInfoComponent;
                            int i29 = 86 / 0;
                        } else {
                            accessgetgocp = fastcoerceatmost2.destinationInfoComponent;
                        }
                    }
                    drawmultiparagraph7axcy_i.IconCompatParcelizer = 1;
                    return flowCollector.emit(accessgetgocp, drawmultiparagraph7axcy_i) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
                case 9:
                    if (shortNewsContentCardView instanceof DefaultImplgetFontLoadStateinitCallback1) {
                        defaultImplgetFontLoadStateinitCallback1 = (DefaultImplgetFontLoadStateinitCallback1) shortNewsContentCardView;
                        int i30 = defaultImplgetFontLoadStateinitCallback1.IconCompatParcelizer;
                        if ((i30 & Integer.MIN_VALUE) != 0) {
                            defaultImplgetFontLoadStateinitCallback1.IconCompatParcelizer = i30 - Integer.MIN_VALUE;
                        } else {
                            defaultImplgetFontLoadStateinitCallback1 = new DefaultImplgetFontLoadStateinitCallback1(this, shortNewsContentCardView);
                        }
                    } else {
                        defaultImplgetFontLoadStateinitCallback1 = new DefaultImplgetFontLoadStateinitCallback1(this, shortNewsContentCardView);
                    }
                    Object obj16 = defaultImplgetFontLoadStateinitCallback1.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = defaultImplgetFontLoadStateinitCallback1.IconCompatParcelizer;
                    if (i31 != 0) {
                        if (i31 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj16);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj16);
                    Object obj17 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj17 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup43 = (AndroidPopup_androidKtPopup41) obj17;
                        obj17 = (fastCoerceAtMost) (androidPopup_androidKtPopup43 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup43 : null);
                    }
                    onItemDismiss onitemdismiss4 = new onItemDismiss(obj17);
                    defaultImplgetFontLoadStateinitCallback1.IconCompatParcelizer = 1;
                    return flowCollector.emit(onitemdismiss4, defaultImplgetFontLoadStateinitCallback1) == coroutineSingletons10 ? coroutineSingletons10 : createfromparcel;
                case 10:
                    if (shortNewsContentCardView instanceof EmojiCompatStatus_androidKt) {
                        emojiCompatStatus_androidKt = (EmojiCompatStatus_androidKt) shortNewsContentCardView;
                        int i32 = emojiCompatStatus_androidKt.read;
                        if ((i32 & Integer.MIN_VALUE) != 0) {
                            emojiCompatStatus_androidKt.read = i32 - Integer.MIN_VALUE;
                        } else {
                            emojiCompatStatus_androidKt = new EmojiCompatStatus_androidKt(this, shortNewsContentCardView);
                        }
                    } else {
                        emojiCompatStatus_androidKt = new EmojiCompatStatus_androidKt(this, shortNewsContentCardView);
                    }
                    Object obj18 = emojiCompatStatus_androidKt.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = emojiCompatStatus_androidKt.read;
                    if (i33 != 0) {
                        if (i33 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj18);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj18);
                    Object obj19 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj19 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup44 = (AndroidPopup_androidKtPopup41) obj19;
                        obj19 = (fastCoerceAtMost) (androidPopup_androidKtPopup44 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup44 : null);
                    }
                    onItemDismiss onitemdismiss5 = new onItemDismiss(obj19);
                    emojiCompatStatus_androidKt.read = 1;
                    return flowCollector.emit(onitemdismiss5, emojiCompatStatus_androidKt) == coroutineSingletons11 ? coroutineSingletons11 : createfromparcel;
                case 11:
                    if (shortNewsContentCardView instanceof ImmutableBool) {
                        immutableBool = (ImmutableBool) shortNewsContentCardView;
                        int i34 = immutableBool.IconCompatParcelizer;
                        if ((i34 & Integer.MIN_VALUE) != 0) {
                            immutableBool.IconCompatParcelizer = i34 - Integer.MIN_VALUE;
                        } else {
                            immutableBool = new ImmutableBool(this, shortNewsContentCardView);
                        }
                    } else {
                        immutableBool = new ImmutableBool(this, shortNewsContentCardView);
                    }
                    Object obj20 = immutableBool.serializer;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = immutableBool.IconCompatParcelizer;
                    if (i35 != 0) {
                        if (i35 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj20);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj20);
                    Object isitemdismissable2 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(isitemdismissable2 instanceof isItemDismissable)) {
                        try {
                            fastCoerceAtMost fastcoerceatmost3 = (fastCoerceAtMost) isitemdismissable2;
                            isitemdismissable2 = fastcoerceatmost3 != null ? fastcoerceatmost3.mapComponent : null;
                        } catch (Throwable th) {
                            isitemdismissable2 = new isItemDismissable(th);
                        }
                        break;
                    }
                    if (isitemdismissable2 instanceof isItemDismissable) {
                        isitemdismissable2 = null;
                    }
                    AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier4 = (AndroidViewHolderlayoutNode1coreModifier3) isitemdismissable2;
                    if (androidViewHolderlayoutNode1coreModifier4 != null) {
                        DestinationLocation destinationLocation = androidViewHolderlayoutNode1coreModifier4.destinationLocation;
                        accessgetgocp = new accessgetGocp(destinationLocation.serializer(), destinationLocation.RemoteActionCompatParcelizer());
                    }
                    immutableBool.IconCompatParcelizer = 1;
                    return flowCollector.emit(accessgetgocp, immutableBool) == coroutineSingletons12 ? coroutineSingletons12 : createfromparcel;
                case 12:
                    if (shortNewsContentCardView instanceof isNonLinearFontScalingActive) {
                        isnonlinearfontscalingactive = (isNonLinearFontScalingActive) shortNewsContentCardView;
                        int i36 = isnonlinearfontscalingactive.RemoteActionCompatParcelizer;
                        if ((i36 & Integer.MIN_VALUE) != 0) {
                            isnonlinearfontscalingactive.RemoteActionCompatParcelizer = i36 - Integer.MIN_VALUE;
                        } else {
                            isnonlinearfontscalingactive = new isNonLinearFontScalingActive(this, shortNewsContentCardView);
                        }
                    } else {
                        isnonlinearfontscalingactive = new isNonLinearFontScalingActive(this, shortNewsContentCardView);
                    }
                    Object obj21 = isnonlinearfontscalingactive.serializer;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = isnonlinearfontscalingactive.RemoteActionCompatParcelizer;
                    if (i37 != 0) {
                        if (i37 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj21);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj21);
                    Object obj22 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj22 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup45 = (AndroidPopup_androidKtPopup41) obj22;
                        obj22 = (fastCoerceAtMost) (androidPopup_androidKtPopup45 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup45 : null);
                    }
                    onItemDismiss onitemdismiss6 = new onItemDismiss(obj22);
                    isnonlinearfontscalingactive.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(onitemdismiss6, isnonlinearfontscalingactive) == coroutineSingletons13 ? coroutineSingletons13 : createfromparcel;
                case 13:
                    if (shortNewsContentCardView instanceof accessgetHighQualitycp) {
                        accessgethighqualitycp = (accessgetHighQualitycp) shortNewsContentCardView;
                        int i38 = accessgethighqualitycp.RemoteActionCompatParcelizer;
                        if ((i38 & Integer.MIN_VALUE) != 0) {
                            accessgethighqualitycp.RemoteActionCompatParcelizer = i38 - Integer.MIN_VALUE;
                        } else {
                            accessgethighqualitycp = new accessgetHighQualitycp(this, shortNewsContentCardView);
                        }
                    } else {
                        accessgethighqualitycp = new accessgetHighQualitycp(this, shortNewsContentCardView);
                    }
                    Object obj23 = accessgethighqualitycp.read;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i39 = accessgethighqualitycp.RemoteActionCompatParcelizer;
                    if (i39 != 0) {
                        if (i39 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj23);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj23);
                    if (!(obj instanceof HyphensCompanion)) {
                        return createfromparcel;
                    }
                    accessgethighqualitycp.RemoteActionCompatParcelizer = 1;
                    if (flowCollector.emit(obj, accessgethighqualitycp) != coroutineSingletons14) {
                        return createfromparcel;
                    }
                    int i40 = write + 61;
                    serializer = i40 % Fields.SpotShadowColor;
                    if (i40 % 2 == 0) {
                        int i41 = 83 / 0;
                    }
                    return coroutineSingletons14;
                case 14:
                    if (shortNewsContentCardView instanceof accessgetBalancedcp) {
                        accessgetbalancedcp = (accessgetBalancedcp) shortNewsContentCardView;
                        int i42 = accessgetbalancedcp.RemoteActionCompatParcelizer;
                        if ((i42 & Integer.MIN_VALUE) != 0) {
                            accessgetbalancedcp.RemoteActionCompatParcelizer = i42 - Integer.MIN_VALUE;
                        } else {
                            accessgetbalancedcp = new accessgetBalancedcp(this, shortNewsContentCardView);
                        }
                    } else {
                        accessgetbalancedcp = new accessgetBalancedcp(this, shortNewsContentCardView);
                    }
                    Object obj24 = accessgetbalancedcp.read;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i43 = accessgetbalancedcp.RemoteActionCompatParcelizer;
                    if (i43 != 0) {
                        if (i43 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj24);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj24);
                    Object obj25 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj25 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup46 = (AndroidPopup_androidKtPopup41) obj25;
                        obj25 = (fastCoerceAtMost) (androidPopup_androidKtPopup46 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup46 : null);
                    }
                    onItemDismiss onitemdismiss7 = new onItemDismiss(obj25);
                    accessgetbalancedcp.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(onitemdismiss7, accessgetbalancedcp) == coroutineSingletons15 ? coroutineSingletons15 : createfromparcel;
                case 15:
                    if (shortNewsContentCardView instanceof getUnspecifiedrAG3T2k) {
                        getunspecifiedrag3t2k = (getUnspecifiedrAG3T2k) shortNewsContentCardView;
                        int i44 = getunspecifiedrag3t2k.read;
                        if ((i44 & Integer.MIN_VALUE) != 0) {
                            getunspecifiedrag3t2k.read = i44 - Integer.MIN_VALUE;
                        } else {
                            getunspecifiedrag3t2k = new getUnspecifiedrAG3T2k(this, shortNewsContentCardView);
                        }
                    } else {
                        getunspecifiedrag3t2k = new getUnspecifiedrAG3T2k(this, shortNewsContentCardView);
                    }
                    Object obj26 = getunspecifiedrag3t2k.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i45 = getunspecifiedrag3t2k.read;
                    if (i45 != 0) {
                        if (i45 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj26);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj26);
                    Object obj27 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj27 instanceof isItemDismissable)) {
                        try {
                            fastCoerceAtMost fastcoerceatmost4 = (fastCoerceAtMost) obj27;
                            if (fastcoerceatmost4 == null || (androidViewHolderlayoutNode1coreModifier3 = fastcoerceatmost4.mapComponent) == null) {
                                obj27 = null;
                            } else {
                                DestinationLocation destinationLocation2 = androidViewHolderlayoutNode1coreModifier3.destinationLocation;
                                isitemdismissable = new accessgetGocp(destinationLocation2.serializer(), destinationLocation2.RemoteActionCompatParcelizer());
                                obj27 = isitemdismissable;
                            }
                        } catch (Throwable th2) {
                            isitemdismissable = new isItemDismissable(th2);
                        }
                    }
                    accessgetgocp = obj27 instanceof isItemDismissable ? null : obj27;
                    getunspecifiedrag3t2k.read = 1;
                    return flowCollector.emit(accessgetgocp, getunspecifiedrag3t2k) == coroutineSingletons16 ? coroutineSingletons16 : createfromparcel;
                case 16:
                    if (shortNewsContentCardView instanceof copy38bxuX8) {
                        copy38bxux8 = (copy38bxuX8) shortNewsContentCardView;
                        int i46 = copy38bxux8.read;
                        if ((i46 & Integer.MIN_VALUE) != 0) {
                            copy38bxux8.read = i46 - Integer.MIN_VALUE;
                        } else {
                            copy38bxux8 = new copy38bxuX8(this, shortNewsContentCardView);
                            int i47 = write + 21;
                            serializer = i47 % Fields.SpotShadowColor;
                            int i48 = i47 % 2;
                        }
                    } else {
                        copy38bxux8 = new copy38bxuX8(this, shortNewsContentCardView);
                        int i49 = write + 21;
                        serializer = i49 % Fields.SpotShadowColor;
                        int i410 = i49 % 2;
                    }
                    Object obj28 = copy38bxux8.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i50 = copy38bxux8.read;
                    if (i50 != 0) {
                        if (i50 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj28);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj28);
                    Map map = (Map) obj;
                    if (map.values().isEmpty()) {
                        return createfromparcel;
                    }
                    Collection collectionValues = map.values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            if (!SQLite.read(DeliveryInformation$DeliveryStatus.PICKED_UP, DeliveryInformation$DeliveryStatus.LEFT_PICKUP, DeliveryInformation$DeliveryStatus.NEAR_DROPOFF).contains((DeliveryInformation$DeliveryStatus) it.next())) {
                                return createfromparcel;
                            }
                        }
                    }
                    copy38bxux8.read = 1;
                    return flowCollector.emit(obj, copy38bxux8) == coroutineSingletons17 ? coroutineSingletons17 : createfromparcel;
                case 17:
                    if (shortNewsContentCardView instanceof copy38bxuX8default) {
                        copy38bxux8default = (copy38bxuX8default) shortNewsContentCardView;
                        int i51 = copy38bxux8default.read;
                        if ((i51 & Integer.MIN_VALUE) != 0) {
                            int i52 = write + 101;
                            serializer = i52 % Fields.SpotShadowColor;
                            int i53 = i52 % 2;
                            copy38bxux8default.read = i51 - Integer.MIN_VALUE;
                        } else {
                            copy38bxux8default = new copy38bxuX8default(this, shortNewsContentCardView);
                        }
                    } else {
                        copy38bxux8default = new copy38bxuX8default(this, shortNewsContentCardView);
                    }
                    Object obj29 = copy38bxux8default.serializer;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i54 = copy38bxux8default.read;
                    if (i54 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj29);
                        copy38bxux8default.read = 1;
                        return flowCollector.emit(createfromparcel, copy38bxux8default) == coroutineSingletons18 ? coroutineSingletons18 : createfromparcel;
                    }
                    if (i54 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i55 = serializer + 57;
                    write = i55 % Fields.SpotShadowColor;
                    int i56 = i55 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj29);
                    return createfromparcel;
                case 18:
                    if (shortNewsContentCardView instanceof copyJdDtMQoui_textdefault) {
                        copyjddtmqoui_textdefault = (copyJdDtMQoui_textdefault) shortNewsContentCardView;
                        int i57 = copyjddtmqoui_textdefault.read;
                        if ((i57 & Integer.MIN_VALUE) != 0) {
                            copyjddtmqoui_textdefault.read = i57 - Integer.MIN_VALUE;
                        } else {
                            copyjddtmqoui_textdefault = new copyJdDtMQoui_textdefault(this, shortNewsContentCardView);
                        }
                    } else {
                        copyjddtmqoui_textdefault = new copyJdDtMQoui_textdefault(this, shortNewsContentCardView);
                    }
                    Object obj30 = copyjddtmqoui_textdefault.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i58 = copyjddtmqoui_textdefault.read;
                    if (i58 != 0) {
                        if (i58 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj30);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj30);
                    isTrackingEnabled istrackingenabled2 = ((getFailureResponseData) obj).RemoteActionCompatParcelizer;
                    istrackingenabled2.getClass();
                    boolean zContains = onContentCardClicked.MediaSessionCompatQueueItem(new isTrackingEnabled[]{isTrackingEnabled.AVAILABLE, isTrackingEnabled.ENDING, isTrackingEnabled.READY, isTrackingEnabled.WORKING}).contains(istrackingenabled2);
                    copyjddtmqoui_textdefault.read = 1;
                    return flowCollector.emit(Boolean.valueOf(zContains), copyjddtmqoui_textdefault) == coroutineSingletons19 ? coroutineSingletons19 : createfromparcel;
                case 19:
                    Object objEmit = flowCollector.emit((isInsideContent) obj, shortNewsContentCardView);
                    return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : createfromparcel;
                case 20:
                    if (shortNewsContentCardView instanceof initui_tooling) {
                        int i59 = write + 45;
                        serializer = i59 % Fields.SpotShadowColor;
                        int i60 = i59 % 2;
                        initui_toolingVar = (initui_tooling) shortNewsContentCardView;
                        int i61 = initui_toolingVar.write;
                        if ((i61 & Integer.MIN_VALUE) != 0) {
                            initui_toolingVar.write = i61 - Integer.MIN_VALUE;
                        } else {
                            initui_toolingVar = new initui_tooling(this, shortNewsContentCardView);
                        }
                    } else {
                        initui_toolingVar = new initui_tooling(this, shortNewsContentCardView);
                    }
                    Object obj31 = initui_toolingVar.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i62 = initui_toolingVar.write;
                    if (i62 != 0) {
                        if (i62 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj31);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj31);
                    Object obj32 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj32 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup47 = (AndroidPopup_androidKtPopup41) obj32;
                        obj32 = (fastCoerceAtMost) (androidPopup_androidKtPopup47 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup47 : null);
                    }
                    onItemDismiss onitemdismiss8 = new onItemDismiss(obj32);
                    initui_toolingVar.write = 1;
                    return flowCollector.emit(onitemdismiss8, initui_toolingVar) == coroutineSingletons20 ? coroutineSingletons20 : createfromparcel;
                case 21:
                    if (shortNewsContentCardView instanceof getViewInfosui_tooling) {
                        getviewinfosui_tooling = (getViewInfosui_tooling) shortNewsContentCardView;
                        int i63 = getviewinfosui_tooling.IconCompatParcelizer;
                        if ((i63 & Integer.MIN_VALUE) != 0) {
                            getviewinfosui_tooling.IconCompatParcelizer = i63 - Integer.MIN_VALUE;
                        } else {
                            getviewinfosui_tooling = new getViewInfosui_tooling(this, shortNewsContentCardView);
                        }
                    } else {
                        getviewinfosui_tooling = new getViewInfosui_tooling(this, shortNewsContentCardView);
                    }
                    Object obj33 = getviewinfosui_tooling.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i64 = getviewinfosui_tooling.IconCompatParcelizer;
                    if (i64 != 0) {
                        if (i64 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj33);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj33);
                    Object obj34 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (obj34 instanceof isItemDismissable) {
                        obj34 = null;
                    }
                    fastCoerceAtMost fastcoerceatmost5 = (fastCoerceAtMost) obj34;
                    accessgetgocp = fastcoerceatmost5 != null ? fastcoerceatmost5.deliveriesComponent : null;
                    getviewinfosui_tooling.IconCompatParcelizer = 1;
                    return flowCollector.emit(accessgetgocp, getviewinfosui_tooling) == coroutineSingletons21 ? coroutineSingletons21 : createfromparcel;
                case 22:
                    if (shortNewsContentCardView instanceof takeOrElseeAf_CNQ) {
                        takeorelseeaf_cnq = (takeOrElseeAf_CNQ) shortNewsContentCardView;
                        int i65 = takeorelseeaf_cnq.RemoteActionCompatParcelizer;
                        if ((i65 & Integer.MIN_VALUE) != 0) {
                            takeorelseeaf_cnq.RemoteActionCompatParcelizer = i65 - Integer.MIN_VALUE;
                        } else {
                            takeorelseeaf_cnq = new takeOrElseeAf_CNQ(this, shortNewsContentCardView);
                        }
                    } else {
                        takeorelseeaf_cnq = new takeOrElseeAf_CNQ(this, shortNewsContentCardView);
                    }
                    Object obj35 = takeorelseeaf_cnq.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i66 = takeorelseeaf_cnq.RemoteActionCompatParcelizer;
                    if (i66 != 0) {
                        if (i66 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj35);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj35);
                    Object obj36 = ((onItemDismiss) obj).IconCompatParcelizer;
                    onItemDismiss onitemdismiss9 = new onItemDismiss(((obj36 instanceof isItemDismissable) || (obj36 = (AndroidPopup_androidKtPopup41) obj36) != null) ? obj36 : null);
                    takeorelseeaf_cnq.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(onitemdismiss9, takeorelseeaf_cnq) == coroutineSingletons22 ? coroutineSingletons22 : createfromparcel;
                case 23:
                    if (shortNewsContentCardView instanceof setSLookupTables) {
                        setslookuptables = (setSLookupTables) shortNewsContentCardView;
                        int i67 = setslookuptables.write;
                        if ((i67 & Integer.MIN_VALUE) != 0) {
                            setslookuptables.write = i67 - Integer.MIN_VALUE;
                        } else {
                            setslookuptables = new setSLookupTables(this, shortNewsContentCardView);
                        }
                    } else {
                        setslookuptables = new setSLookupTables(this, shortNewsContentCardView);
                    }
                    Object obj37 = setslookuptables.serializer;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i68 = setslookuptables.write;
                    if (i68 != 0) {
                        if (i68 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj37);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj37);
                    Object obj38 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(obj38 instanceof isItemDismissable)) {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup48 = (AndroidPopup_androidKtPopup41) obj38;
                        obj38 = (fastCoerceAtMost) (androidPopup_androidKtPopup48 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup48 : null);
                    }
                    onItemDismiss onitemdismiss10 = new onItemDismiss(obj38);
                    setslookuptables.write = 1;
                    return flowCollector.emit(onitemdismiss10, setslookuptables) == coroutineSingletons23 ? coroutineSingletons23 : createfromparcel;
                case 24:
                    if (shortNewsContentCardView instanceof getMFromSpValuesannotations) {
                        getmfromspvaluesannotations = (getMFromSpValuesannotations) shortNewsContentCardView;
                        int i69 = getmfromspvaluesannotations.IconCompatParcelizer;
                        if ((i69 & Integer.MIN_VALUE) != 0) {
                            getmfromspvaluesannotations.IconCompatParcelizer = i69 - Integer.MIN_VALUE;
                        } else {
                            getmfromspvaluesannotations = new getMFromSpValuesannotations(this, shortNewsContentCardView);
                        }
                    } else {
                        getmfromspvaluesannotations = new getMFromSpValuesannotations(this, shortNewsContentCardView);
                    }
                    Object obj39 = getmfromspvaluesannotations.write;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i70 = getmfromspvaluesannotations.IconCompatParcelizer;
                    if (i70 != 0) {
                        if (i70 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj39);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj39);
                    Object obj40 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (obj40 instanceof isItemDismissable) {
                        obj40 = null;
                    }
                    fastCoerceAtMost fastcoerceatmost6 = (fastCoerceAtMost) obj40;
                    accessgetgocp = fastcoerceatmost6 != null ? fastcoerceatmost6.deliveriesListComponent : null;
                    getmfromspvaluesannotations.IconCompatParcelizer = 1;
                    return flowCollector.emit(accessgetgocp, getmfromspvaluesannotations) == coroutineSingletons24 ? coroutineSingletons24 : createfromparcel;
                case 25:
                    if (shortNewsContentCardView instanceof requireViewFactoryHolder) {
                        requireviewfactoryholder = (requireViewFactoryHolder) shortNewsContentCardView;
                        int i71 = requireviewfactoryholder.serializer;
                        if ((i71 & Integer.MIN_VALUE) != 0) {
                            requireviewfactoryholder.serializer = i71 - Integer.MIN_VALUE;
                        } else {
                            requireviewfactoryholder = new requireViewFactoryHolder(this, shortNewsContentCardView);
                        }
                    } else {
                        requireviewfactoryholder = new requireViewFactoryHolder(this, shortNewsContentCardView);
                    }
                    Object obj41 = requireviewfactoryholder.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i72 = requireviewfactoryholder.serializer;
                    if (i72 != 0) {
                        if (i72 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj41);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj41);
                    Object obj42 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (obj42 instanceof isItemDismissable) {
                        accessgetgocp = obj42;
                    } else {
                        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup49 = (AndroidPopup_androidKtPopup41) obj42;
                        if (androidPopup_androidKtPopup49 != null && (str = androidPopup_androidKtPopup49.read()) != null) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != -1770724968) {
                                if (iHashCode != -1423461112) {
                                    if (iHashCode == 31657374 && str.equals("deliveries_detail")) {
                                        accessgetgocp = StateV3$ScreenType.DeliveriesDetail;
                                    } else {
                                        accessgetgocp = StateV3$ScreenType.Unknown;
                                    }
                                } else if (str.equals(HttpHeaders.ACCEPT)) {
                                    accessgetgocp = StateV3$ScreenType.Accept;
                                } else {
                                    accessgetgocp = StateV3$ScreenType.Unknown;
                                }
                            } else if (str.equals("auto_accept")) {
                                accessgetgocp = StateV3$ScreenType.AutoAccept;
                            } else {
                                accessgetgocp = StateV3$ScreenType.Unknown;
                            }
                        }
                    }
                    onItemDismiss onitemdismiss11 = new onItemDismiss(accessgetgocp);
                    requireviewfactoryholder.serializer = 1;
                    return flowCollector.emit(onitemdismiss11, requireviewfactoryholder) == coroutineSingletons25 ? coroutineSingletons25 : createfromparcel;
                case 26:
                    if (shortNewsContentCardView instanceof AndroidView_androidKtAndroidView23) {
                        androidView_androidKtAndroidView23 = (AndroidView_androidKtAndroidView23) shortNewsContentCardView;
                        int i73 = androidView_androidKtAndroidView23.read;
                        if ((i73 & Integer.MIN_VALUE) != 0) {
                            androidView_androidKtAndroidView23.read = i73 - Integer.MIN_VALUE;
                        } else {
                            androidView_androidKtAndroidView23 = new AndroidView_androidKtAndroidView23(this, shortNewsContentCardView);
                        }
                    } else {
                        androidView_androidKtAndroidView23 = new AndroidView_androidKtAndroidView23(this, shortNewsContentCardView);
                    }
                    Object obj43 = androidView_androidKtAndroidView23.write;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i74 = androidView_androidKtAndroidView23.read;
                    if (i74 != 0) {
                        if (i74 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj43);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj43);
                    Object obj44 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (obj44 instanceof isItemDismissable) {
                        accessgetgocp = obj44;
                    } else {
                        maybeRegisterBackCallback mayberegisterbackcallback2 = (maybeRegisterBackCallback) obj44;
                        if (mayberegisterbackcallback2 != null) {
                            accessgetgocp = mayberegisterbackcallback2.externalComponents;
                        }
                    }
                    onItemDismiss onitemdismiss12 = new onItemDismiss(accessgetgocp);
                    androidView_androidKtAndroidView23.read = 1;
                    return flowCollector.emit(onitemdismiss12, androidView_androidKtAndroidView23) == coroutineSingletons26 ? coroutineSingletons26 : createfromparcel;
                case 27:
                    if (shortNewsContentCardView instanceof updateViewHolderParams6NefGtU) {
                        updateviewholderparams6nefgtu = (updateViewHolderParams6NefGtU) shortNewsContentCardView;
                        int i75 = updateviewholderparams6nefgtu.write;
                        if ((i75 & Integer.MIN_VALUE) != 0) {
                            updateviewholderparams6nefgtu.write = i75 - Integer.MIN_VALUE;
                        } else {
                            updateviewholderparams6nefgtu = new updateViewHolderParams6NefGtU(this, shortNewsContentCardView);
                        }
                    } else {
                        updateviewholderparams6nefgtu = new updateViewHolderParams6NefGtU(this, shortNewsContentCardView);
                    }
                    Object obj45 = updateviewholderparams6nefgtu.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i76 = updateviewholderparams6nefgtu.write;
                    if (i76 != 0) {
                        if (i76 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj45);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj45);
                    Object isitemdismissable3 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(isitemdismissable3 instanceof isItemDismissable)) {
                        try {
                            maybeRegisterBackCallback mayberegisterbackcallback3 = (maybeRegisterBackCallback) isitemdismissable3;
                            isitemdismissable3 = mayberegisterbackcallback3 != null ? mayberegisterbackcallback3.metadata : null;
                        } catch (Throwable th3) {
                            isitemdismissable3 = new isItemDismissable(th3);
                        }
                        break;
                    }
                    onItemDismiss onitemdismiss13 = new onItemDismiss(isitemdismissable3);
                    updateviewholderparams6nefgtu.write = 1;
                    return flowCollector.emit(onitemdismiss13, updateviewholderparams6nefgtu) == coroutineSingletons27 ? coroutineSingletons27 : createfromparcel;
                case 28:
                    if (shortNewsContentCardView instanceof AndroidView_androidKtAndroidView22) {
                        androidView_androidKtAndroidView22 = (AndroidView_androidKtAndroidView22) shortNewsContentCardView;
                        int i77 = androidView_androidKtAndroidView22.serializer;
                        if ((i77 & Integer.MIN_VALUE) != 0) {
                            androidView_androidKtAndroidView22.serializer = i77 - Integer.MIN_VALUE;
                        } else {
                            androidView_androidKtAndroidView22 = new AndroidView_androidKtAndroidView22(this, shortNewsContentCardView);
                        }
                    } else {
                        androidView_androidKtAndroidView22 = new AndroidView_androidKtAndroidView22(this, shortNewsContentCardView);
                    }
                    Object obj46 = androidView_androidKtAndroidView22.read;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i78 = androidView_androidKtAndroidView22.serializer;
                    if (i78 != 0) {
                        if (i78 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj46);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj46);
                    Object isitemdismissable4 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(isitemdismissable4 instanceof isItemDismissable)) {
                        try {
                            maybeRegisterBackCallback mayberegisterbackcallback4 = (maybeRegisterBackCallback) isitemdismissable4;
                            isitemdismissable4 = mayberegisterbackcallback4 != null ? mayberegisterbackcallback4.trackingEvents : null;
                        } catch (Throwable th4) {
                            isitemdismissable4 = new isItemDismissable(th4);
                        }
                        break;
                    }
                    onItemDismiss onitemdismiss14 = new onItemDismiss(isitemdismissable4);
                    androidView_androidKtAndroidView22.serializer = 1;
                    return flowCollector.emit(onitemdismiss14, androidView_androidKtAndroidView22) == coroutineSingletons28 ? coroutineSingletons28 : createfromparcel;
                default:
                    if (shortNewsContentCardView instanceof AndroidView_androidKtAndroidView1) {
                        androidView_androidKtAndroidView1 = (AndroidView_androidKtAndroidView1) shortNewsContentCardView;
                        int i79 = androidView_androidKtAndroidView1.IconCompatParcelizer;
                        if ((i79 & Integer.MIN_VALUE) != 0) {
                            androidView_androidKtAndroidView1.IconCompatParcelizer = i79 - Integer.MIN_VALUE;
                        } else {
                            androidView_androidKtAndroidView1 = new AndroidView_androidKtAndroidView1(this, shortNewsContentCardView);
                        }
                    } else {
                        androidView_androidKtAndroidView1 = new AndroidView_androidKtAndroidView1(this, shortNewsContentCardView);
                    }
                    Object obj47 = androidView_androidKtAndroidView1.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i80 = androidView_androidKtAndroidView1.IconCompatParcelizer;
                    if (i80 != 0) {
                        if (i80 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj47);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj47);
                    Object isitemdismissable5 = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(isitemdismissable5 instanceof isItemDismissable)) {
                        try {
                            maybeRegisterBackCallback mayberegisterbackcallback5 = (maybeRegisterBackCallback) isitemdismissable5;
                            isitemdismissable5 = mayberegisterbackcallback5 != null ? mayberegisterbackcallback5.messages : null;
                        } catch (Throwable th5) {
                            isitemdismissable5 = new isItemDismissable(th5);
                        }
                        break;
                    }
                    onItemDismiss onitemdismiss15 = new onItemDismiss(isitemdismissable5);
                    androidView_androidKtAndroidView1.IconCompatParcelizer = 1;
                    return flowCollector.emit(onitemdismiss15, androidView_androidKtAndroidView1) == coroutineSingletons29 ? coroutineSingletons29 : createfromparcel;
            }
        }
    }

    public /* synthetic */ StateProviderImpl$special$$inlined$map$2(Flow flow, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 15;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Flow flow = this.RemoteActionCompatParcelizer;
        int i6 = 22;
        int i7 = 14;
        int i8 = 13;
        int i9 = 12;
        int i10 = 10;
        int i11 = 3;
        int i12 = 23;
        int i13 = 5;
        int i14 = 7;
        Object obj = null;
        switch (i5) {
            case 0:
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, 0), shortNewsContentCardView);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i15 = IconCompatParcelizer + 65;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    return objCollect;
                }
                obj.hashCode();
                throw null;
            case 1:
                Object objCollect2 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 2:
                Object objCollect3 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i11), shortNewsContentCardView);
                if (objCollect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i16 = read + 5;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                return objCollect3;
            case 3:
                Object objCollect4 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, 4), shortNewsContentCardView);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : createfromparcel;
            case 4:
                Object objCollect5 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i13), shortNewsContentCardView);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : createfromparcel;
            case 5:
                Object objCollect6 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i14), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : createfromparcel;
            case 6:
                Object objCollect7 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, 8), shortNewsContentCardView);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : createfromparcel;
            case 7:
                Object objCollect8 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i10), shortNewsContentCardView);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : createfromparcel;
            case 8:
                Object objCollect9 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i9), shortNewsContentCardView);
                if (objCollect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i18 = IconCompatParcelizer + 11;
                read = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    return objCollect9;
                }
                obj.hashCode();
                throw null;
            case 9:
                Object objCollect10 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i8), shortNewsContentCardView);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : createfromparcel;
            case 10:
                Object objCollect11 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i7), shortNewsContentCardView);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : createfromparcel;
            case 11:
                Object objCollect12 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, 15), shortNewsContentCardView);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : createfromparcel;
            case 12:
                Object objCollect13 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, 16), shortNewsContentCardView);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : createfromparcel;
            case 13:
                Object objCollect14 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i6), shortNewsContentCardView);
                if (objCollect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i19 = IconCompatParcelizer + 39;
                read = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    return objCollect14;
                }
                obj.hashCode();
                throw null;
            case 14:
                Object objCollect15 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, i12), shortNewsContentCardView);
                return objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect15 : createfromparcel;
            case 15:
                Object objCollect16 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, 24), shortNewsContentCardView);
                if (objCollect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i20 = read + 7;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    return objCollect16;
                }
                obj.hashCode();
                throw null;
            case 16:
                Object objCollect17 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, 26), shortNewsContentCardView);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : createfromparcel;
            case 17:
                Object objCollect18 = ((AbstractFlow) flow).collect(new AnonymousClass2(flowCollector, i11), shortNewsContentCardView);
                return objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect18 : createfromparcel;
            case 18:
                Object objCollect19 = flow.collect(new AnonymousClass2(flowCollector, i13), shortNewsContentCardView);
                if (objCollect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i21 = IconCompatParcelizer + 95;
                read = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    return objCollect19;
                }
                obj.hashCode();
                throw null;
            case 19:
                Object objCollect20 = flow.collect(new AnonymousClass2(flowCollector, i14), shortNewsContentCardView);
                return objCollect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect20 : createfromparcel;
            case 20:
                Object objCollect21 = flow.collect(new AnonymousClass2(flowCollector, 9), shortNewsContentCardView);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : createfromparcel;
            case 21:
                Object objCollect22 = flow.collect(new AnonymousClass2(flowCollector, i10), shortNewsContentCardView);
                if (objCollect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i22 = IconCompatParcelizer + 101;
                read = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    return objCollect22;
                }
                throw null;
            case 22:
                Object objCollect23 = flow.collect(new AnonymousClass2(flowCollector, i9), shortNewsContentCardView);
                if (objCollect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i23 = read + 7;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                return objCollect23;
            case 23:
                Object objCollect24 = flow.collect(new AnonymousClass2(flowCollector, i8), shortNewsContentCardView);
                return objCollect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect24 : createfromparcel;
            case 24:
                Object objCollect25 = flow.collect(new AnonymousClass2(flowCollector, i7), shortNewsContentCardView);
                if (objCollect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i25 = read + 23;
                IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                return objCollect25;
            case 25:
                Object objCollect26 = flow.collect(new AnonymousClass2(flowCollector, 20), shortNewsContentCardView);
                return objCollect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect26 : createfromparcel;
            case 26:
                Object objCollect27 = flow.collect(new AnonymousClass2(flowCollector, i6), shortNewsContentCardView);
                return objCollect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect27 : createfromparcel;
            case 27:
                Object objCollect28 = flow.collect(new AnonymousClass2(flowCollector, i12), shortNewsContentCardView);
                return objCollect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect28 : createfromparcel;
            case 28:
                Object objCollect29 = flow.collect(new AnonymousClass2(flowCollector, 25), shortNewsContentCardView);
                return objCollect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect29 : createfromparcel;
            default:
                Object objCollect30 = flow.collect(new AnonymousClass2(flowCollector, 26), shortNewsContentCardView);
                return objCollect30 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect30 : createfromparcel;
        }
    }
}
