package com.roadrunner.delivery.ontheway.destinationmarkers.domain;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import coil3.ExtrasKt;
import com.huawei.location.nlp.scan.FB;
import com.logistics.rider.glovo.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Actual_androidKt;
import o.AndroidViewHolder_androidKt;
import o.AndroidViewHolderlayoutNode12;
import o.AndroidViewHolderlayoutNode1coreModifier1;
import o.AndroidViewHolderlayoutNode1coreModifier3;
import o.AndroidViewHolderonNestedFling1;
import o.AndroidViewHolderrelease1;
import o.BrazeExternalSyntheticLambda206;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessgetNoOpScrollConnectionp;
import o.accessparseLanguageTag;
import o.createFromParcel;
import o.f3;
import o.f5;
import o.f7;
import o.f8;
import o.f9;
import o.fe;
import o.ffExternalSyntheticLambda2;
import o.fg;
import o.g0ExternalSyntheticLambda1;
import o.g0ExternalSyntheticLambda11;
import o.g0ExternalSyntheticLambda28;
import o.g1;
import o.g2;
import o.g4;
import o.g5;
import o.g8;
import o.gExternalSyntheticLambda0;
import o.getDescriptor;
import o.getEmpty;
import o.getStrictnessusljTpc;
import o.getUnregisteredInAppMessageannotations;
import o.getUnspecifiedrAG3T2kannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.opticalSizingR2X_6o;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.transferSessionPackageI;
import o.updateAdidI;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveDestinationMarkers$invoke$1 extends SuspendLambda implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public /* synthetic */ getDescriptor IconCompatParcelizer;
    public final /* synthetic */ WorkerWrapper.Builder MediaDescriptionCompat;
    public /* synthetic */ List RemoteActionCompatParcelizer;
    public /* synthetic */ List read;
    public /* synthetic */ getStrictnessusljTpc serializer;
    public /* synthetic */ AndroidViewHolderlayoutNode1coreModifier3 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveDestinationMarkers$invoke$1(WorkerWrapper.Builder builder, ShortNewsContentCardView shortNewsContentCardView) {
        super(6, shortNewsContentCardView);
        this.MediaDescriptionCompat = builder;
    }

    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = 2 % 2;
        ObserveDestinationMarkers$invoke$1 observeDestinationMarkers$invoke$1 = new ObserveDestinationMarkers$invoke$1(this.MediaDescriptionCompat, (ShortNewsContentCardView) obj6);
        observeDestinationMarkers$invoke$1.write = (AndroidViewHolderlayoutNode1coreModifier3) obj;
        observeDestinationMarkers$invoke$1.serializer = (getStrictnessusljTpc) obj2;
        observeDestinationMarkers$invoke$1.RemoteActionCompatParcelizer = (List) obj3;
        observeDestinationMarkers$invoke$1.read = (List) obj4;
        observeDestinationMarkers$invoke$1.IconCompatParcelizer = (getDescriptor) obj5;
        Object objInvokeSuspend = observeDestinationMarkers$invoke$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaBrowserCompatMediaItem + 37;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:257:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:259:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:260:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:262:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:264:0x0811  */
    /* JADX WARN: Code duplicated, block: B:274:0x083a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getStrictnessusljTpc getstrictnessusljtpc;
        List list;
        List list2;
        ?? arrayList;
        List list3;
        fe feVar;
        Iterable iterable;
        ArrayList arrayList2;
        List list4;
        f9 f9Var;
        List list5;
        g0ExternalSyntheticLambda1 g0externalsyntheticlambda1;
        Iterator it;
        String str;
        g5 g5Var;
        Object gexternalsyntheticlambda0;
        String strWrite;
        String str2;
        getStrictnessusljTpc getstrictnessusljtpc2;
        List list6;
        g5 g5Var2;
        Object gexternalsyntheticlambda1;
        int iIconCompatParcelizer;
        List list7;
        String str3;
        int i = 2 % 2;
        AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3 = this.write;
        getStrictnessusljTpc getstrictnessusljtpc3 = this.serializer;
        List list8 = this.RemoteActionCompatParcelizer;
        List list9 = this.read;
        getDescriptor getdescriptor = this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (androidViewHolderlayoutNode1coreModifier3 == null) {
            return new f9(instance_delegatelambda0Var);
        }
        WorkerWrapper.Builder builder = this.MediaDescriptionCompat;
        accessparseLanguageTag accessparselanguagetag = (accessparseLanguageTag) builder.MediaSessionCompatQueueItem;
        transferSessionPackageI transfersessionpackagei = accessparselanguagetag.MediaSessionCompatQueueItem;
        List list10 = list9;
        boolean z = ((FirebaseRemoteConfigImpl) ((BrazeExternalSyntheticLambda206) builder.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer).MediaMetadataCompat() && androidViewHolderlayoutNode1coreModifier3.enablePinConnections && list10.isEmpty();
        getdescriptor.getClass();
        List list11 = androidViewHolderlayoutNode1coreModifier3.pins;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list11) {
            AndroidViewHolderrelease1 androidViewHolderrelease1 = (AndroidViewHolderrelease1) obj2;
            List list12 = accessparselanguagetag.RemoteActionCompatParcelizer;
            if (!(list12 instanceof Collection) || !list12.isEmpty()) {
                Iterator it2 = list12.iterator();
                while (it2.hasNext()) {
                    if (((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) ((getUnregisteredInAppMessageannotations) it2.next())).read(androidViewHolderrelease1)) {
                        arrayList3.add(obj2);
                        break;
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            g0ExternalSyntheticLambda1 g0externalsyntheticlambda2 = new g0ExternalSyntheticLambda1(g5.ALWAYS);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (obj3 instanceof accessgetNoOpScrollConnectionp) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (true) {
                String str4 = "v3";
                if (!it3.hasNext()) {
                    getstrictnessusljtpc = getstrictnessusljtpc3;
                    list = list9;
                    getDescriptor getdescriptor2 = getdescriptor;
                    instance_delegatelambda0 instance_delegatelambda0Var2 = instance_delegatelambda0Var;
                    list2 = list10;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : arrayList3) {
                        int i2 = MediaSessionCompatQueueItem + 23;
                        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        if (obj4 instanceof AndroidViewHolderonNestedFling1) {
                            arrayList6.add(obj4);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(arrayList6, 10));
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        AndroidViewHolderonNestedFling1 androidViewHolderonNestedFling1 = (AndroidViewHolderonNestedFling1) it4.next();
                        String str5 = androidViewHolderonNestedFling1.style;
                        boolean z2 = androidViewHolderonNestedFling1.highlighted;
                        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = androidViewHolderonNestedFling1.address;
                        AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1 = androidViewHolderonNestedFling1.actionableDetails;
                        if (accessparselanguagetag.serializer(str5, z2, androidViewHolderlayoutNode1coreModifier1)) {
                            list5 = list8;
                            g0externalsyntheticlambda1 = g0externalsyntheticlambda2;
                            f8 f8Var = new f8(androidViewHolderlayoutNode12.RemoteActionCompatParcelizer(), androidViewHolderlayoutNode12.read());
                            String strSerializer = androidViewHolderlayoutNode1coreModifier1 != null ? androidViewHolderlayoutNode1coreModifier1.serializer() : null;
                            String str6 = strSerializer == null ? "" : strSerializer;
                            if (androidViewHolderlayoutNode1coreModifier1 != null) {
                                int i4 = MediaBrowserCompatMediaItem + 65;
                                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 != 0) {
                                    strWrite = androidViewHolderlayoutNode1coreModifier1.write();
                                    int i5 = 2 / 0;
                                } else {
                                    strWrite = androidViewHolderlayoutNode1coreModifier1.write();
                                }
                            } else {
                                strWrite = null;
                            }
                            if (strWrite == null) {
                                int i6 = MediaBrowserCompatMediaItem + 67;
                                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                str2 = "";
                            } else {
                                str2 = strWrite;
                            }
                            gexternalsyntheticlambda0 = new ffExternalSyntheticLambda2(f8Var, new f5(str6, str2, R.drawable.ic_bold_medium_essentials_user_circle, androidViewHolderlayoutNode1coreModifier1 != null ? androidViewHolderlayoutNode1coreModifier1.IconCompatParcelizer() : 0, null, 2112), g5.ALWAYS);
                            it = it4;
                            str = str4;
                        } else {
                            list5 = list8;
                            g0externalsyntheticlambda1 = g0externalsyntheticlambda2;
                            String str7 = androidViewHolderonNestedFling1.style;
                            it = it4;
                            if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) transfersessionpackagei, updateAdidI.IS_ACTIONABLE_PINS_ENABLED})).booleanValue() && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) str4, false)) {
                                str = str4;
                                gexternalsyntheticlambda0 = new gExternalSyntheticLambda0(new f8(androidViewHolderlayoutNode12.RemoteActionCompatParcelizer(), androidViewHolderlayoutNode12.read()), new g2(R.drawable.ic_bold_medium_essentials_user_circle, accessparseLanguageTag.read(androidViewHolderonNestedFling1), accessparseLanguageTag.read(androidViewHolderonNestedFling1), accessparseLanguageTag.read(androidViewHolderonNestedFling1), androidViewHolderlayoutNode1coreModifier1 != null ? androidViewHolderlayoutNode1coreModifier1.IconCompatParcelizer() : 0, null, accessparselanguagetag.read, androidViewHolderonNestedFling1.highlighted, false, 576), (z2 || z) ? f7.NONE : f7.TWO, !z2 ? g5.NEVER : g5.ALWAYS, 80);
                            } else {
                                str = str4;
                                f8 f8Var2 = new f8(androidViewHolderlayoutNode12.RemoteActionCompatParcelizer(), androidViewHolderlayoutNode12.read());
                                g0ExternalSyntheticLambda11 g0externalsyntheticlambda11 = new g0ExternalSyntheticLambda11(R.drawable.ic_bold_medium_essentials_user_circle, androidViewHolderonNestedFling1.read() ? R.color.primary_light_01 : R.color.neutral_100, androidViewHolderonNestedFling1.read() ? R.color.primary_light_01 : R.color.neutral_100, accessparselanguagetag.read, androidViewHolderonNestedFling1.highlighted, false, 144);
                                f7 f7Var = (z2 || z) ? f7.NONE : f7.TWO;
                                if (z2) {
                                    g5Var = g5.ALWAYS;
                                } else {
                                    int i8 = MediaSessionCompatQueueItem + 95;
                                    MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                                    if (i8 % 2 == 0) {
                                        g5 g5Var3 = g5.NEVER;
                                        throw null;
                                    }
                                    g5Var = g5.NEVER;
                                }
                                gexternalsyntheticlambda0 = new gExternalSyntheticLambda0(f8Var2, g0externalsyntheticlambda11, f7Var, g5Var, 80);
                            }
                        }
                        arrayList7.add(gexternalsyntheticlambda0);
                        list8 = list5;
                        g0externalsyntheticlambda2 = g0externalsyntheticlambda1;
                        it4 = it;
                        str4 = str;
                    }
                    List list13 = list8;
                    g0ExternalSyntheticLambda1 g0externalsyntheticlambda3 = g0externalsyntheticlambda2;
                    if (((FirebaseRemoteConfigImpl) accessparselanguagetag.IconCompatParcelizer.serializer).MediaSessionCompatToken()) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Entrance Pins V1 is not enabled on Remote Config. Skipping entrance pins.", new Object[0]);
                        arrayList = instance_delegatelambda0Var2;
                    } else {
                        ArrayList<AndroidViewHolder_androidKt> arrayList8 = new ArrayList();
                        Iterator it5 = arrayList3.iterator();
                        while (!(!it5.hasNext())) {
                            Object next = it5.next();
                            if (next instanceof AndroidViewHolder_androidKt) {
                                arrayList8.add(next);
                            }
                        }
                        arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayList8, 10));
                        for (AndroidViewHolder_androidKt androidViewHolder_androidKt : arrayList8) {
                            AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode13 = androidViewHolder_androidKt.address;
                            boolean z3 = androidViewHolder_androidKt.highlighted;
                            arrayList.add(new gExternalSyntheticLambda0(new f8(androidViewHolderlayoutNode13.RemoteActionCompatParcelizer(), androidViewHolder_androidKt.address.read()), new g0ExternalSyntheticLambda28(accessparselanguagetag.serializer, z3), f7.NONE, !z3 ? g5.NEVER : g5.ALWAYS, 81));
                        }
                    }
                    getEmpty getempty = accessparselanguagetag.write;
                    opticalSizingR2X_6o opticalsizingr2x_6o = getempty.read;
                    if (arrayList3.isEmpty()) {
                        list3 = list13;
                        arrayList2 = arrayList5;
                        iterable = instance_delegatelambda0Var2;
                        feVar = null;
                    } else {
                        List listSerializer = onContentCardDismissed.serializer(arrayList3, new FB(23));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj5 : listSerializer) {
                            Integer numValueOf = Integer.valueOf(((AndroidViewHolderrelease1) obj5).write());
                            Object arrayList9 = linkedHashMap.get(numValueOf);
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList9);
                            }
                            ((List) arrayList9).add(obj5);
                        }
                        Collection collectionValues = linkedHashMap.values();
                        ArrayList arrayList10 = new ArrayList(accessgetInstancedelegatecp.write(collectionValues, 10));
                        Iterator it6 = collectionValues.iterator();
                        while (it6.hasNext()) {
                            arrayList10.add(onContentCardDismissed.serializer((List) it6.next(), new FB(24)));
                        }
                        ArrayList arrayList11 = new ArrayList();
                        Iterator it7 = arrayList10.iterator();
                        while (it7.hasNext()) {
                            List listSerializer2 = onContentCardDismissed.serializer((List) it7.next(), new FB(25));
                            List list14 = listSerializer2;
                            if (!(list14 instanceof Collection) || !list14.isEmpty()) {
                                Iterator it8 = list14.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        if (((AndroidViewHolderrelease1) it8.next()).read()) {
                                            if (getdescriptor2 instanceof g8) {
                                                AndroidViewHolderrelease1 androidViewHolderrelease2 = (AndroidViewHolderrelease1) onContentCardDismissed.read(listSerializer2);
                                                list4 = list13;
                                                arrayList11.addAll(opticalSizingR2X_6o.serializer(opticalsizingr2x_6o, ((g8) getdescriptor2).serializer(), new f8(androidViewHolderrelease2.serializer().RemoteActionCompatParcelizer(), androidViewHolderrelease2.serializer().read()), g5.NEVER, 0, "LAYER_TYPE_ROAD_com.roadrunner_df_intra_connector_" + UUID.randomUUID(), 8));
                                                break;
                                            }
                                        }
                                    }
                                    list4 = list13;
                                    break;
                                }
                            }
                            list4 = list13;
                            break;
                            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onContentCardDismissed.ResultReceiver(list14)) {
                                AndroidViewHolderrelease1 androidViewHolderrelease3 = (AndroidViewHolderrelease1) onviewattachedtowindowlambda0.serializer;
                                AndroidViewHolderrelease1 androidViewHolderrelease4 = (AndroidViewHolderrelease1) onviewattachedtowindowlambda0.write;
                                arrayList11.addAll(opticalSizingR2X_6o.serializer(opticalsizingr2x_6o, new f8(androidViewHolderrelease3.serializer().RemoteActionCompatParcelizer(), androidViewHolderrelease3.serializer().read()), new f8(androidViewHolderrelease4.serializer().RemoteActionCompatParcelizer(), androidViewHolderrelease4.serializer().read()), g5.NEVER, 0, "LAYER_TYPE_ROAD_com.roadrunner_df_intra_connector_" + UUID.randomUUID(), 8));
                            }
                            it7 = it7;
                            arrayList5 = arrayList5;
                            list13 = list4;
                        }
                        list3 = list13;
                        ArrayList arrayList12 = arrayList5;
                        if (z) {
                            int i9 = MediaSessionCompatQueueItem + 13;
                            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                Object obj6 = null;
                                arrayList10.isEmpty();
                                obj6.hashCode();
                                throw null;
                            }
                            if (!arrayList10.isEmpty()) {
                                AndroidViewHolderrelease1 androidViewHolderrelease5 = (AndroidViewHolderrelease1) onContentCardDismissed.MediaMetadataCompat((List) onContentCardDismissed.read((List) arrayList10));
                                if (androidViewHolderrelease5 != null) {
                                    arrayList11.addAll(opticalsizingr2x_6o.write(new f8(androidViewHolderrelease5.serializer().RemoteActionCompatParcelizer(), androidViewHolderrelease5.serializer().read()), g5.NEVER, ColorKt.m776toArgb8_81llA(getempty.write.IconCompatParcelizer().setCompoundDrawablesRelative())));
                                }
                                int size = arrayList10.size();
                                int i10 = 0;
                                while (i10 < size - 1) {
                                    int i11 = MediaBrowserCompatMediaItem + 61;
                                    MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                                    int i12 = i11 % 2;
                                    AndroidViewHolderrelease1 androidViewHolderrelease6 = (AndroidViewHolderrelease1) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList10.get(i10));
                                    i10++;
                                    AndroidViewHolderrelease1 androidViewHolderrelease7 = (AndroidViewHolderrelease1) onContentCardDismissed.MediaMetadataCompat((List) arrayList10.get(i10));
                                    if (androidViewHolderrelease6 != null) {
                                        int i13 = MediaBrowserCompatMediaItem + 71;
                                        MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                                        if (i13 % 2 != 0) {
                                            throw null;
                                        }
                                        if (androidViewHolderrelease7 != null) {
                                            arrayList11.addAll(opticalSizingR2X_6o.serializer(opticalsizingr2x_6o, new f8(androidViewHolderrelease6.serializer().RemoteActionCompatParcelizer(), androidViewHolderrelease6.serializer().read()), new f8(androidViewHolderrelease7.serializer().RemoteActionCompatParcelizer(), androidViewHolderrelease7.serializer().read()), g5.NEVER, 0, null, 24));
                                        }
                                    }
                                }
                            }
                        }
                        feVar = null;
                        iterable = arrayList11;
                        arrayList2 = arrayList12;
                    }
                    f9Var = new f9(onContentCardDismissed.IconCompatParcelizer(iterable, onContentCardDismissed.RemoteActionCompatParcelizer((Collection) onContentCardDismissed.IconCompatParcelizer((Iterable) arrayList, onContentCardDismissed.IconCompatParcelizer(arrayList7, arrayList2)), (Object) g0externalsyntheticlambda3)));
                    break;
                }
                accessgetNoOpScrollConnectionp accessgetnoopscrollconnectionp = (accessgetNoOpScrollConnectionp) it3.next();
                String str8 = accessgetnoopscrollconnectionp.style;
                Iterator it9 = it3;
                boolean z4 = accessgetnoopscrollconnectionp.highlighted;
                instance_delegatelambda0 instance_delegatelambda0Var3 = instance_delegatelambda0Var;
                AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode14 = accessgetnoopscrollconnectionp.address;
                List list15 = list9;
                AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier2 = accessgetnoopscrollconnectionp.actionableDetails;
                if (accessparselanguagetag.serializer(str8, z4, androidViewHolderlayoutNode1coreModifier2)) {
                    getstrictnessusljtpc2 = getstrictnessusljtpc3;
                    f8 f8Var3 = new f8(androidViewHolderlayoutNode14.RemoteActionCompatParcelizer(), androidViewHolderlayoutNode14.read());
                    String strSerializer2 = androidViewHolderlayoutNode1coreModifier2 != null ? androidViewHolderlayoutNode1coreModifier2.serializer() : null;
                    String str9 = strSerializer2 == null ? "" : strSerializer2;
                    String strWrite2 = androidViewHolderlayoutNode1coreModifier2 != null ? androidViewHolderlayoutNode1coreModifier2.write() : null;
                    gexternalsyntheticlambda1 = new ffExternalSyntheticLambda2(f8Var3, new f5(str9, strWrite2 == null ? "" : strWrite2, R.drawable.ic_bold_medium_essentials_shop, androidViewHolderlayoutNode1coreModifier2 != null ? androidViewHolderlayoutNode1coreModifier2.IconCompatParcelizer() : 0, g1.CIRCLE, 64), g5.ALWAYS);
                    list6 = list10;
                } else {
                    getstrictnessusljtpc2 = getstrictnessusljtpc3;
                    String str10 = accessgetnoopscrollconnectionp.style;
                    list6 = list10;
                    if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) transfersessionpackagei, updateAdidI.IS_ACTIONABLE_PINS_ENABLED})).booleanValue() && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str10, (CharSequence) "v3", false)) {
                        f8 f8Var4 = new f8(androidViewHolderlayoutNode14.RemoteActionCompatParcelizer(), androidViewHolderlayoutNode14.read());
                        int i14 = accessparseLanguageTag.read(accessgetnoopscrollconnectionp);
                        int i15 = accessparseLanguageTag.read(accessgetnoopscrollconnectionp);
                        int i16 = accessparseLanguageTag.read(accessgetnoopscrollconnectionp);
                        if (androidViewHolderlayoutNode1coreModifier2 != null) {
                            int i17 = MediaBrowserCompatMediaItem + 89;
                            MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
                            if (i17 % 2 != 0) {
                                androidViewHolderlayoutNode1coreModifier2.IconCompatParcelizer();
                                Object obj7 = null;
                                obj7.hashCode();
                                throw null;
                            }
                            iIconCompatParcelizer = androidViewHolderlayoutNode1coreModifier2.IconCompatParcelizer();
                        } else {
                            iIconCompatParcelizer = 0;
                        }
                        gexternalsyntheticlambda1 = new gExternalSyntheticLambda0(f8Var4, new g2(R.drawable.ic_bold_medium_essentials_shop, i14, i15, i16, iIconCompatParcelizer, g1.CIRCLE, accessparselanguagetag.read, accessgetnoopscrollconnectionp.highlighted, false, Fields.RotationY), (z4 || z) ? f7.NONE : f7.ONE, !z4 ? g5.NEVER : g5.ALWAYS, 80);
                    } else {
                        f8 f8Var5 = new f8(androidViewHolderlayoutNode14.RemoteActionCompatParcelizer(), androidViewHolderlayoutNode14.read());
                        g0ExternalSyntheticLambda11 g0externalsyntheticlambda12 = new g0ExternalSyntheticLambda11(R.drawable.ic_bold_medium_essentials_shop, accessgetnoopscrollconnectionp.read() ? R.color.primary_light_01 : R.color.neutral_100, accessgetnoopscrollconnectionp.read() ? R.color.primary_light_01 : R.color.neutral_100, accessparselanguagetag.read, accessgetnoopscrollconnectionp.highlighted, false, 144);
                        f7 f7Var2 = (z4 || z) ? f7.NONE : f7.ONE;
                        if (z4) {
                            g5Var2 = g5.ALWAYS;
                        } else {
                            int i18 = MediaBrowserCompatMediaItem + 121;
                            MediaSessionCompatQueueItem = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            g5Var2 = g5.NEVER;
                        }
                        gexternalsyntheticlambda1 = new gExternalSyntheticLambda0(f8Var5, g0externalsyntheticlambda12, f7Var2, g5Var2, 80);
                    }
                }
                arrayList5.add(gexternalsyntheticlambda1);
                getdescriptor = getdescriptor;
                it3 = it9;
                instance_delegatelambda0Var = instance_delegatelambda0Var3;
                list9 = list15;
                getstrictnessusljtpc3 = getstrictnessusljtpc2;
                list10 = list6;
            }
        } else {
            f9Var = new f9(instance_delegatelambda0Var);
            getstrictnessusljtpc = getstrictnessusljtpc3;
            list3 = list8;
            list = list9;
            list2 = list10;
            feVar = null;
        }
        boolean zRemoteActionCompatParcelizer = Actual_androidKt.RemoteActionCompatParcelizer(getstrictnessusljtpc);
        List list16 = f9Var.write;
        if (!zRemoteActionCompatParcelizer) {
            if (!(getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations) || (list7 = list3) == null || list7.isEmpty()) {
                return !list2.isEmpty() ? new f9(onContentCardDismissed.IconCompatParcelizer(list, list16)) : f9Var;
            }
            return new f9(onContentCardDismissed.IconCompatParcelizer(list3, list16));
        }
        ArrayList arrayList13 = new ArrayList();
        Iterator it10 = list16.iterator();
        while (!(!it10.hasNext())) {
            fe ffexternalsyntheticlambda2 = (fe) it10.next();
            if (ffexternalsyntheticlambda2 instanceof gExternalSyntheticLambda0) {
                gExternalSyntheticLambda0 gexternalsyntheticlambda2 = (gExternalSyntheticLambda0) ffexternalsyntheticlambda2;
                Options.Companion companion = gexternalsyntheticlambda2.IconCompatParcelizer;
                if (companion.RemoteActionCompatParcelizer()) {
                    g5 g5Var4 = g5.NEVER;
                    boolean z5 = gexternalsyntheticlambda2.RemoteActionCompatParcelizer;
                    f8 f8Var6 = gexternalsyntheticlambda2.MediaDescriptionCompat;
                    f7 f7Var3 = gexternalsyntheticlambda2.read;
                    g4 g4Var = gexternalsyntheticlambda2.RatingCompat;
                    String str11 = gexternalsyntheticlambda2.write;
                    f8Var6.getClass();
                    companion.getClass();
                    f7Var3.getClass();
                    g4Var.getClass();
                    g5Var4.getClass();
                    str11.getClass();
                    ffexternalsyntheticlambda2 = new gExternalSyntheticLambda0(z5, f8Var6, companion, f7Var3, g4Var, g5Var4, str11);
                } else if (ffexternalsyntheticlambda2 instanceof g0ExternalSyntheticLambda1) {
                    g5 g5Var5 = g5.NEVER;
                    g4 g4Var2 = ((g0ExternalSyntheticLambda1) ffexternalsyntheticlambda2).read;
                    g4Var2.getClass();
                    g5Var5.getClass();
                    ffexternalsyntheticlambda2 = new g0ExternalSyntheticLambda1(g4Var2, g5Var5);
                } else if (ffexternalsyntheticlambda2 instanceof ffExternalSyntheticLambda2) {
                    ffExternalSyntheticLambda2 ffexternalsyntheticlambda3 = (ffExternalSyntheticLambda2) ffexternalsyntheticlambda2;
                    g5 g5Var6 = g5.NEVER;
                    f8 f8Var7 = ffexternalsyntheticlambda3.write;
                    f5 f5Var = ffexternalsyntheticlambda3.IconCompatParcelizer;
                    f3 f3Var = ffexternalsyntheticlambda3.RemoteActionCompatParcelizer;
                    g4 g4Var3 = ffexternalsyntheticlambda3.MediaDescriptionCompat;
                    String str12 = ffexternalsyntheticlambda3.read;
                    f8Var7.getClass();
                    f5Var.getClass();
                    f3Var.getClass();
                    g4Var3.getClass();
                    g5Var6.getClass();
                    str12.getClass();
                    ffexternalsyntheticlambda2 = new ffExternalSyntheticLambda2(f8Var7, f5Var, f3Var, g4Var3, g5Var6, str12);
                } else if (!(ffexternalsyntheticlambda2 instanceof fg) && (str3 = ((fg) ffexternalsyntheticlambda2).write) != null) {
                    int i20 = MediaSessionCompatQueueItem + 21;
                    MediaBrowserCompatMediaItem = i20 % Fields.SpotShadowColor;
                    if (!(i20 % 2 == 0 ? hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str3, (CharSequence) "df_intra_connector", true) : hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str3, (CharSequence) "df_intra_connector", false))) {
                    }
                }
            } else if (ffexternalsyntheticlambda2 instanceof g0ExternalSyntheticLambda1) {
                g5 g5Var7 = g5.NEVER;
                g4 g4Var4 = ((g0ExternalSyntheticLambda1) ffexternalsyntheticlambda2).read;
                g4Var4.getClass();
                g5Var7.getClass();
                ffexternalsyntheticlambda2 = new g0ExternalSyntheticLambda1(g4Var4, g5Var7);
            } else if (ffexternalsyntheticlambda2 instanceof ffExternalSyntheticLambda2) {
                ffExternalSyntheticLambda2 ffexternalsyntheticlambda4 = (ffExternalSyntheticLambda2) ffexternalsyntheticlambda2;
                g5 g5Var8 = g5.NEVER;
                f8 f8Var8 = ffexternalsyntheticlambda4.write;
                f5 f5Var2 = ffexternalsyntheticlambda4.IconCompatParcelizer;
                f3 f3Var2 = ffexternalsyntheticlambda4.RemoteActionCompatParcelizer;
                g4 g4Var5 = ffexternalsyntheticlambda4.MediaDescriptionCompat;
                String str13 = ffexternalsyntheticlambda4.read;
                f8Var8.getClass();
                f5Var2.getClass();
                f3Var2.getClass();
                g4Var5.getClass();
                g5Var8.getClass();
                str13.getClass();
                ffexternalsyntheticlambda2 = new ffExternalSyntheticLambda2(f8Var8, f5Var2, f3Var2, g4Var5, g5Var8, str13);
            } else {
                ffexternalsyntheticlambda2 = !(ffexternalsyntheticlambda2 instanceof fg) ? feVar : feVar;
            }
            if (ffexternalsyntheticlambda2 != null) {
                arrayList13.add(ffexternalsyntheticlambda2);
            }
        }
        return new f9(arrayList13);
    }
}
