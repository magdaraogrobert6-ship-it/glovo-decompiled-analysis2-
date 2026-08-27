package com.roadrunner.delivery.accept.tags.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import o.ActualStringDelegate;
import o.AndroidPopup_androidKtPopup41;
import o.AndroidViewBindingKtExternalSyntheticLambda7;
import o.AndroidViewBindinglambda00;
import o.AndroidViewBindinglambda7000;
import o.AndroidViewHolderCompanionOnCommitAffectingUpdate1;
import o.PlatformLocaleKt;
import o.ShortNewsContentCardView;
import o.Synchronization_jvmKt;
import o.TextInputServiceAndroidstopInput2;
import o.TransformedText;
import o.accessgetInstancedelegatecp;
import o.accessgetOwnerp;
import o.accessinsetToLayoutPosition;
import o.accesssetSizep;
import o.accessupdateWithEmojiCompat;
import o.asExecutorlambda0;
import o.asExecutorlambda00;
import o.createFromParcel;
import o.drawParagraphs7AXcY_I;
import o.fastCoerceAtMost;
import o.getBinding;
import o.getPlatformLocaleDelegate;
import o.invokeKlQnJC8;
import o.isItemDismissable;
import o.isOpen;
import o.onItemDismiss;
import o.removeNodeAtDepth;
import o.sendInputCommand;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveTagsUiState$invoke$$inlined$map$1$2 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowCollector write;

    public /* synthetic */ ObserveTagsUiState$invoke$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = flowCollector;
    }

    public /* synthetic */ ObserveTagsUiState$invoke$$inlined$map$1$2(FlowCollector flowCollector, Object obj, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private final Object emit$com$roadrunner$delivery$ontheway$deliverynotes$data$DeliveryNotesRepository$observeDeliveryDetails$$inlined$data$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        asExecutorlambda00 asexecutorlambda00;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof asExecutorlambda00) {
            asexecutorlambda00 = (asExecutorlambda00) shortNewsContentCardView;
            int i2 = asexecutorlambda00.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 45;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                asexecutorlambda00.write = i2 - Integer.MIN_VALUE;
            } else {
                asexecutorlambda00 = new asExecutorlambda00(this, shortNewsContentCardView);
            }
        } else {
            asexecutorlambda00 = new asExecutorlambda00(this, shortNewsContentCardView);
        }
        Object obj2 = asexecutorlambda00.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = asexecutorlambda00.write;
        Object obj3 = null;
        if (i5 != 0) {
            int i6 = IconCompatParcelizer + 117;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj4 = ((onItemDismiss) obj).IconCompatParcelizer;
            if (!(obj4 instanceof isItemDismissable)) {
                int i7 = read + 113;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = (AndroidPopup_androidKtPopup41) obj4;
                if (!(androidPopup_androidKtPopup41 instanceof fastCoerceAtMost)) {
                    androidPopup_androidKtPopup41 = null;
                }
                obj4 = (fastCoerceAtMost) androidPopup_androidKtPopup41;
            }
            onItemDismiss onitemdismiss = new onItemDismiss(obj4);
            asexecutorlambda00.write = 1;
            if (this.write.emit(onitemdismiss, asexecutorlambda00) == coroutineSingletons) {
                int i9 = IconCompatParcelizer + 65;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return coroutineSingletons;
                }
                obj3.hashCode();
                throw null;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    private final Object emit$com$roadrunner$delivery$ontheway$header$implementation$data$DestinationHeaderRepository$observeDeliveryDetail$$inlined$data$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ActualStringDelegate actualStringDelegate;
        int i = 2 % 2;
        int i2 = read + 31;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = null;
        if (i2 % 2 == 0) {
            boolean z = shortNewsContentCardView instanceof ActualStringDelegate;
            throw null;
        }
        if (shortNewsContentCardView instanceof ActualStringDelegate) {
            actualStringDelegate = (ActualStringDelegate) shortNewsContentCardView;
            int i3 = actualStringDelegate.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                actualStringDelegate.write = i3 - Integer.MIN_VALUE;
            } else {
                actualStringDelegate = new ActualStringDelegate(this, shortNewsContentCardView);
            }
        } else {
            actualStringDelegate = new ActualStringDelegate(this, shortNewsContentCardView);
        }
        Object obj2 = actualStringDelegate.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = actualStringDelegate.write;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
            if (!(obj3 instanceof isItemDismissable)) {
                AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup42 = (AndroidPopup_androidKtPopup41) obj3;
                if (androidPopup_androidKtPopup42 instanceof fastCoerceAtMost) {
                    androidPopup_androidKtPopup41 = androidPopup_androidKtPopup42;
                } else {
                    int i5 = read + 75;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                }
                obj3 = (fastCoerceAtMost) androidPopup_androidKtPopup41;
            }
            onItemDismiss onitemdismiss = new onItemDismiss(obj3);
            actualStringDelegate.write = 1;
            if (this.write.emit(onitemdismiss, actualStringDelegate) == coroutineSingletons) {
                int i6 = read + 25;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    private final Object emit$com$roadrunner$delivery$ontheway$observer$DistanceToDestinationLifecycleObserverImpl$observeDestination$$inlined$data$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Synchronization_jvmKt synchronization_jvmKt;
        int i = 2 % 2;
        int i2 = read + 107;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (shortNewsContentCardView instanceof Synchronization_jvmKt) {
            int i5 = i3 + 19;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            synchronization_jvmKt = (Synchronization_jvmKt) shortNewsContentCardView;
            int i7 = synchronization_jvmKt.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                synchronization_jvmKt.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                synchronization_jvmKt = new Synchronization_jvmKt(this, shortNewsContentCardView);
            }
        } else {
            synchronization_jvmKt = new Synchronization_jvmKt(this, shortNewsContentCardView);
        }
        Object obj2 = synchronization_jvmKt.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = synchronization_jvmKt.RemoteActionCompatParcelizer;
        if (i8 != 0) {
            int i9 = IconCompatParcelizer + 21;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0 ? i8 != 1 : i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
            if (!(obj3 instanceof isItemDismissable)) {
                AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = (AndroidPopup_androidKtPopup41) obj3;
                obj3 = (fastCoerceAtMost) (androidPopup_androidKtPopup41 instanceof fastCoerceAtMost ? androidPopup_androidKtPopup41 : null);
            }
            onItemDismiss onitemdismiss = new onItemDismiss(obj3);
            synchronization_jvmKt.RemoteActionCompatParcelizer = 1;
            if (this.write.emit(onitemdismiss, synchronization_jvmKt) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    private final Object emit$com$roadrunner$delivery$ontheway$crowdsourcing$terms$domain$ObserveTermsAndConditionsUrl$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        sendInputCommand sendinputcommand;
        List list;
        Object next;
        int i = 2 % 2;
        int i2 = read + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        String str = null;
        if (i2 % 2 == 0) {
            boolean z = shortNewsContentCardView instanceof sendInputCommand;
            throw null;
        }
        if (shortNewsContentCardView instanceof sendInputCommand) {
            sendinputcommand = (sendInputCommand) shortNewsContentCardView;
            int i3 = sendinputcommand.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sendinputcommand.serializer = i3 - Integer.MIN_VALUE;
            } else {
                sendinputcommand = new sendInputCommand(this, shortNewsContentCardView);
            }
        } else {
            sendinputcommand = new sendInputCommand(this, shortNewsContentCardView);
        }
        Object obj2 = sendinputcommand.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = sendinputcommand.serializer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            accessinsetToLayoutPosition accessinsettolayoutposition = (accessinsetToLayoutPosition) obj;
            if (accessinsettolayoutposition != null && (list = accessinsettolayoutposition.components) != null) {
                int i5 = read + 107;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof AndroidViewHolderCompanionOnCommitAffectingUpdate1));
                AndroidViewHolderCompanionOnCommitAffectingUpdate1 androidViewHolderCompanionOnCommitAffectingUpdate1 = (AndroidViewHolderCompanionOnCommitAffectingUpdate1) next;
                if (androidViewHolderCompanionOnCommitAffectingUpdate1 != null) {
                    int i7 = IconCompatParcelizer + 13;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    str = androidViewHolderCompanionOnCommitAffectingUpdate1.url;
                    int i9 = IconCompatParcelizer + 101;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            }
            sendinputcommand.serializer = 1;
            if (this.write.emit(str, sendinputcommand) == coroutineSingletons) {
                int i11 = read + 89;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 9 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = read + 93;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            int i15 = read + 23;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                int i16 = 2 % 5;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    private final Object emit$com$roadrunner$delivery$ontheway$deliverynotes$domain$ObserveDeliveryNotesLink$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        isOpen isopen;
        AndroidViewBindinglambda00 androidViewBindinglambda00;
        List list;
        int i = 2 % 2;
        if (!(shortNewsContentCardView instanceof isOpen)) {
            isopen = new isOpen(this, shortNewsContentCardView);
        } else {
            isopen = (isOpen) shortNewsContentCardView;
            int i2 = isopen.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                isopen.serializer = i2 - Integer.MIN_VALUE;
                int i3 = IconCompatParcelizer + 101;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                isopen = new isOpen(this, shortNewsContentCardView);
            }
        }
        Object obj2 = isopen.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = isopen.serializer;
        Object obj3 = null;
        if (i5 != 0) {
            int i6 = read + 105;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj4 = ((onItemDismiss) obj).IconCompatParcelizer;
            if (obj4 instanceof isItemDismissable) {
                obj4 = null;
            }
            fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj4;
            Object textInputServiceAndroidstopInput2 = invokeKlQnJC8.read;
            if (fastcoerceatmost != null && (androidViewBindinglambda00 = fastcoerceatmost.destinationInfoComponent) != null && (list = androidViewBindinglambda00.components) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i7 = IconCompatParcelizer + 23;
                    read = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        boolean z = it.next() instanceof AndroidViewBindinglambda7000;
                        throw null;
                    }
                    Object next = it.next();
                    if (next instanceof AndroidViewBindinglambda7000) {
                        obj3 = next;
                        break;
                    }
                }
                AndroidViewBindinglambda7000 androidViewBindinglambda7000 = (AndroidViewBindinglambda7000) obj3;
                if (androidViewBindinglambda7000 == null) {
                    int i8 = IconCompatParcelizer + 95;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else {
                    textInputServiceAndroidstopInput2 = new TextInputServiceAndroidstopInput2(androidViewBindinglambda7000.title, androidViewBindinglambda7000.pageTitle, androidViewBindinglambda7000.text, androidViewBindinglambda7000.link);
                }
            }
            isopen.serializer = 1;
            if (this.write.emit(textInputServiceAndroidstopInput2, isopen) == coroutineSingletons) {
                int i10 = read + 59;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    private final Object emit$com$roadrunner$delivery$ontheway$deliverynotes$domain$ObserveDeliveryNotes$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        TransformedText transformedText;
        Object next;
        Object next2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 105;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (shortNewsContentCardView instanceof TransformedText) {
            int i5 = i2 + 111;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            transformedText = (TransformedText) shortNewsContentCardView;
            int i7 = transformedText.IconCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                transformedText.IconCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                transformedText = new TransformedText(this, shortNewsContentCardView);
            }
        } else {
            transformedText = new TransformedText(this, shortNewsContentCardView);
        }
        Object obj2 = transformedText.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = transformedText.IconCompatParcelizer;
        Object obj3 = null;
        if (i8 != 0) {
            int i9 = IconCompatParcelizer + 103;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0 ? i8 != 1 : i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = read + 61;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return null;
                }
                obj3.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj4 = ((onItemDismiss) obj).IconCompatParcelizer;
            if (obj4 instanceof isItemDismissable) {
                obj4 = null;
            }
            fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj4;
            Object accessupdatewithemojicompat = asExecutorlambda0.IconCompatParcelizer;
            if (fastcoerceatmost != null) {
                int i11 = IconCompatParcelizer + 31;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                AndroidViewBindinglambda00 androidViewBindinglambda00 = fastcoerceatmost.destinationInfoComponent;
                if (androidViewBindinglambda00 == null) {
                    int i13 = read + 41;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        int i14 = 48 / 0;
                    }
                } else {
                    List list = androidViewBindinglambda00.components;
                    if (list != null) {
                        int i15 = read + 95;
                        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            list.iterator();
                            obj3.hashCode();
                            throw null;
                        }
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(next instanceof AndroidViewBindingKtExternalSyntheticLambda7));
                        AndroidViewBindingKtExternalSyntheticLambda7 androidViewBindingKtExternalSyntheticLambda7 = (AndroidViewBindingKtExternalSyntheticLambda7) next;
                        if (androidViewBindingKtExternalSyntheticLambda7 != null) {
                            Iterator it2 = androidViewBindingKtExternalSyntheticLambda7.items.iterator();
                            while (it2.hasNext()) {
                                int i16 = read + 77;
                                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                                if (i16 % 2 == 0) {
                                    next2 = it2.next();
                                    int i17 = 54 / 0;
                                    if (next2 instanceof getBinding) {
                                        obj3 = next2;
                                        break;
                                    }
                                } else {
                                    next2 = it2.next();
                                    if (next2 instanceof getBinding) {
                                        obj3 = next2;
                                        break;
                                    }
                                }
                            }
                            getBinding getbinding = (getBinding) obj3;
                            if (getbinding != null) {
                                String str = getbinding.text;
                                if (str == null) {
                                    int i18 = IconCompatParcelizer + 51;
                                    read = i18 % Fields.SpotShadowColor;
                                    if (i18 % 2 != 0) {
                                        int i19 = 3 % 3;
                                    }
                                } else {
                                    accessupdatewithemojicompat = new accessupdateWithEmojiCompat(androidViewBindingKtExternalSyntheticLambda7.title, str, getbinding.read(), getbinding.RemoteActionCompatParcelizer());
                                }
                            }
                        }
                    }
                }
            }
            transformedText.IconCompatParcelizer = 1;
            if (this.write.emit(accessupdatewithemojicompat, transformedText) == coroutineSingletons) {
                int i20 = read + 7;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    private final Object emit$com$roadrunner$delivery$ontheway$entrancepicture$details$ObserveEntrancePictureDetails$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        drawParagraphs7AXcY_I drawparagraphs7axcy_i;
        accessgetOwnerp accessgetownerp;
        List list;
        getBinding getbinding;
        Object getplatformlocaledelegate;
        List list2;
        Object next;
        List list3;
        Object next2;
        List list4;
        Object next3;
        List list5;
        Object next4;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof drawParagraphs7AXcY_I) {
            drawparagraphs7axcy_i = (drawParagraphs7AXcY_I) shortNewsContentCardView;
            int i2 = drawparagraphs7axcy_i.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drawparagraphs7axcy_i.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                drawparagraphs7axcy_i = new drawParagraphs7AXcY_I(this, shortNewsContentCardView);
            }
        } else {
            drawparagraphs7axcy_i = new drawParagraphs7AXcY_I(this, shortNewsContentCardView);
        }
        Object obj2 = drawparagraphs7axcy_i.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = drawparagraphs7axcy_i.RemoteActionCompatParcelizer;
        String str = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            AndroidViewBindinglambda00 androidViewBindinglambda00 = (AndroidViewBindinglambda00) obj;
            if (androidViewBindinglambda00 == null || (list5 = androidViewBindinglambda00.components) == null) {
                accessgetownerp = null;
            } else {
                Iterator it = list5.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (!(next4 instanceof accessgetOwnerp));
                accessgetownerp = (accessgetOwnerp) next4;
            }
            if (accessgetownerp == null || (list4 = accessgetownerp.components) == null) {
                list = null;
            } else {
                int i4 = read + 13;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Iterator it2 = list4.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    int i6 = IconCompatParcelizer + 49;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        next3 = it2.next();
                    } else {
                        boolean z = it2.next() instanceof accessinsetToLayoutPosition;
                        str.hashCode();
                        throw null;
                    }
                } while (!(next3 instanceof accessinsetToLayoutPosition));
                accessinsetToLayoutPosition accessinsettolayoutposition = (accessinsetToLayoutPosition) next3;
                if (accessinsettolayoutposition != null) {
                    list = accessinsettolayoutposition.pictures;
                } else {
                    list = null;
                }
            }
            String str2 = accessgetownerp != null ? accessgetownerp.address : null;
            String str3 = accessgetownerp != null ? accessgetownerp.title : null;
            if (androidViewBindinglambda00 == null || (list2 = androidViewBindinglambda00.components) == null) {
                getbinding = null;
            } else {
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    int i7 = IconCompatParcelizer + 69;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    next = it3.next();
                } while (!(next instanceof AndroidViewBindingKtExternalSyntheticLambda7));
                AndroidViewBindingKtExternalSyntheticLambda7 androidViewBindingKtExternalSyntheticLambda7 = (AndroidViewBindingKtExternalSyntheticLambda7) next;
                if (androidViewBindingKtExternalSyntheticLambda7 == null || (list3 = androidViewBindingKtExternalSyntheticLambda7.items) == null) {
                    getbinding = null;
                } else {
                    Iterator it4 = list3.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        int i9 = read + 83;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            next2 = it4.next();
                        } else {
                            boolean z2 = it4.next() instanceof getBinding;
                            throw null;
                        }
                    } while (!(next2 instanceof getBinding));
                    getbinding = (getBinding) next2;
                }
            }
            String str4 = getbinding != null ? getbinding.text : null;
            List list6 = list;
            if (list6 != null) {
                int i10 = read + 81;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    if (!list6.isEmpty()) {
                        if (str2 == null) {
                        }
                    }
                } else {
                    int i11 = 3 / 0;
                    if (!list6.isEmpty()) {
                        if (str2 == null && str3 != null) {
                            List list7 = list;
                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                            Iterator it5 = list7.iterator();
                            while (it5.hasNext()) {
                                int i12 = read + 71;
                                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                                if (i12 % 2 == 0) {
                                    arrayList.add(((accesssetSizep) it5.next()).url);
                                    int i13 = 70 / 0;
                                } else {
                                    arrayList.add(((accesssetSizep) it5.next()).url);
                                }
                            }
                            getplatformlocaledelegate = new getPlatformLocaleDelegate(0, removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList), str3, str2, str4, null, false, false);
                        }
                    }
                }
                getplatformlocaledelegate = PlatformLocaleKt.read;
            } else {
                getplatformlocaledelegate = PlatformLocaleKt.read;
            }
            drawparagraphs7axcy_i.RemoteActionCompatParcelizer = 1;
            if (this.write.emit(getplatformlocaledelegate, drawparagraphs7axcy_i) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i3 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:246:0x0388  */
    /* JADX WARN: Code duplicated, block: B:271:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:288:0x0416  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:309:0x045c  */
    /* JADX WARN: Code duplicated, block: B:333:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:346:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:364:0x050b  */
    /* JADX WARN: Code duplicated, block: B:384:0x0554  */
    /* JADX WARN: Code duplicated, block: B:406:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:423:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:449:0x0643 A[PHI: r0 r1
  0x0643: PHI (r0v35 o.generateBatchErrorMessagelambda00) = (r0v34 o.generateBatchErrorMessagelambda00), (r0v37 o.generateBatchErrorMessagelambda00) binds: [B:448:0x0641, B:445:0x0637] A[DONT_GENERATE, DONT_INLINE]
  0x0643: PHI (r1v44 int) = (r1v43 int), (r1v46 int) binds: [B:448:0x0641, B:445:0x0637] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:450:0x0647  */
    /* JADX WARN: Code duplicated, block: B:465:0x067f  */
    /* JADX WARN: Code duplicated, block: B:485:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:507:0x071e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:543:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:564:0x082f  */
    /* JADX WARN: Code duplicated, block: B:601:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:623:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:652:0x095c  */
    /* JADX WARN: Code duplicated, block: B:683:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:700:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[LOOP:12: B:331:0x04a3->B:732:?, LOOP_END, SYNTHETIC] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v34 java.lang.Object, still in use, count: 2, list:
          (r14v34 java.lang.Object) from 0x086b: INSTANCE_OF (r14v34 java.lang.Object) A[WRAPPED] (LINE:2105) o.AndroidDialog_androidKtDialogdialog111
          (r14v34 java.lang.Object) from 0x0871: PHI (r14 I:??) = (r14v31 java.lang.Object), (r14v34 java.lang.Object) binds: [B:583:0x0870, B:736:0x0871] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object r13, o.ShortNewsContentCardView r14) {
        /*
            Method dump skipped, instruction units count: 2670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }
}
