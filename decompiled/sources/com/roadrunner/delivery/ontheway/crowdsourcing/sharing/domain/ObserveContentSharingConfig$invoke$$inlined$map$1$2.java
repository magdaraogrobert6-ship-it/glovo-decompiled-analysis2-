package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import o.AndroidViewBindinglambda00;
import o.C0199requestDisallowInterceptTouchEvent;
import o.ShortNewsContentCardView;
import o.TextFieldValueKt;
import o.accessgetOwnerp;
import o.accessinsetToLayoutPosition;
import o.copy3r_uNRQdefault;
import o.createFromParcel;
import o.getSelectiond9O1mEE;
import o.r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk;
import o.setOnRequestDisallowInterceptTouchEventui;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveContentSharingConfig$invoke$$inlined$map$1$2 implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ copy3r_uNRQdefault write;

    public /* synthetic */ ObserveContentSharingConfig$invoke$$inlined$map$1$2(FlowCollector flowCollector, copy3r_uNRQdefault copy3r_unrqdefault, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = flowCollector;
        this.write = copy3r_unrqdefault;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        TextFieldValueKt textFieldValueKt;
        C0199requestDisallowInterceptTouchEvent c0199requestDisallowInterceptTouchEvent;
        C0199requestDisallowInterceptTouchEvent c0199requestDisallowInterceptTouchEvent2;
        Object next;
        List list;
        Object next2;
        List list2;
        Object obj2;
        getSelectiond9O1mEE getselectiond9o1mee;
        int i;
        r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk r8lambda6tztbw4pjan6bllsogyhmp8jczk;
        Object obj3;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        copy3r_uNRQdefault copy3r_unrqdefault = this.write;
        FlowCollector flowCollector = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            if (shortNewsContentCardView instanceof getSelectiond9O1mEE) {
                getselectiond9o1mee = (getSelectiond9O1mEE) shortNewsContentCardView;
                int i4 = getselectiond9o1mee.IconCompatParcelizer;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    getselectiond9o1mee.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
                } else {
                    getselectiond9o1mee = new getSelectiond9O1mEE(this, shortNewsContentCardView);
                }
            } else {
                getselectiond9o1mee = new getSelectiond9O1mEE(this, shortNewsContentCardView);
            }
            Object obj4 = getselectiond9o1mee.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = getselectiond9o1mee.IconCompatParcelizer;
            if (i5 != 0) {
                int i6 = serializer + 107;
                int i7 = i6 % Fields.SpotShadowColor;
                IconCompatParcelizer = i7;
                int i8 = i6 % 2;
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = i7 + 11;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj4);
            C0199requestDisallowInterceptTouchEvent c0199requestDisallowInterceptTouchEvent3 = (C0199requestDisallowInterceptTouchEvent) obj;
            if (c0199requestDisallowInterceptTouchEvent3 != null) {
                copy3r_unrqdefault.getClass();
                int i11 = c0199requestDisallowInterceptTouchEvent3.pictureLimit;
                setTransactionSuccessful settransactionsuccessful = copy3r_unrqdefault.read;
                String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_sharing_title);
                String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_sharing_images_label);
                String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_sharing_submit_button);
                String strIconCompatParcelizer4 = settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_camera_overlay_title);
                String strIconCompatParcelizer5 = settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_camera_overlay_tag_face);
                Integer numValueOf = Integer.valueOf(R.drawable.ic_blocked);
                InAppCameraOverlay.Tags tags = new InAppCameraOverlay.Tags(Integer.valueOf(R.drawable.ic_megaphone), strIconCompatParcelizer4, SQLite.read(new InAppCameraOverlay.TagItem(strIconCompatParcelizer5, numValueOf), new InAppCameraOverlay.TagItem(settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_camera_overlay_tag_license_plate), numValueOf), new InAppCameraOverlay.TagItem(settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_camera_overlay_tag_personal_data), numValueOf)));
                Iterator it = c0199requestDisallowInterceptTouchEvent3.components.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    Object next3 = it.next();
                    if (next3 instanceof setOnRequestDisallowInterceptTouchEventui) {
                        obj3 = next3;
                        break;
                    }
                }
                r8lambda6tztbw4pjan6bllsogyhmp8jczk = new r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk(i11, strIconCompatParcelizer, strIconCompatParcelizer2, strIconCompatParcelizer3, tags, (setOnRequestDisallowInterceptTouchEventui) obj3);
                i = 1;
            } else {
                i = 1;
                r8lambda6tztbw4pjan6bllsogyhmp8jczk = null;
            }
            getselectiond9o1mee.IconCompatParcelizer = i;
            return flowCollector.emit(r8lambda6tztbw4pjan6bllsogyhmp8jczk, getselectiond9o1mee) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (shortNewsContentCardView instanceof TextFieldValueKt) {
            textFieldValueKt = (TextFieldValueKt) shortNewsContentCardView;
            int i12 = textFieldValueKt.IconCompatParcelizer;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                textFieldValueKt.IconCompatParcelizer = i12 - Integer.MIN_VALUE;
            } else {
                textFieldValueKt = new TextFieldValueKt(this, shortNewsContentCardView);
            }
        } else {
            textFieldValueKt = new TextFieldValueKt(this, shortNewsContentCardView);
        }
        Object obj5 = textFieldValueKt.serializer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = textFieldValueKt.IconCompatParcelizer;
        if (i13 != 0) {
            int i14 = IconCompatParcelizer + 11;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (i13 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj5);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj5);
        AndroidViewBindinglambda00 androidViewBindinglambda00 = (AndroidViewBindinglambda00) obj;
        if (androidViewBindinglambda00 != null) {
            copy3r_unrqdefault.getClass();
            List list3 = androidViewBindinglambda00.components;
            if (list3 != null) {
                Iterator it2 = list3.iterator();
                int i16 = IconCompatParcelizer + 119;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    int i18 = serializer + 23;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        boolean z = it2.next() instanceof accessgetOwnerp;
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                    next = it2.next();
                } while (!(next instanceof accessgetOwnerp));
                accessgetOwnerp accessgetownerp = (accessgetOwnerp) next;
                if (accessgetownerp == null || (list = accessgetownerp.components) == null) {
                    c0199requestDisallowInterceptTouchEvent = null;
                } else {
                    Iterator it3 = list.iterator();
                    int i19 = IconCompatParcelizer + 59;
                    serializer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    while (true) {
                        if (!it3.hasNext()) {
                            c0199requestDisallowInterceptTouchEvent = null;
                            next2 = null;
                            break;
                        }
                        int i21 = IconCompatParcelizer + 43;
                        serializer = i21 % Fields.SpotShadowColor;
                        if (i21 % 2 == 0) {
                            boolean z2 = it3.next() instanceof accessinsetToLayoutPosition;
                            throw null;
                        }
                        next2 = it3.next();
                        if (next2 instanceof accessinsetToLayoutPosition) {
                            c0199requestDisallowInterceptTouchEvent = null;
                            break;
                        }
                    }
                    accessinsetToLayoutPosition accessinsettolayoutposition = (accessinsetToLayoutPosition) next2;
                    if (accessinsettolayoutposition != null && (list2 = accessinsettolayoutposition.components) != null) {
                        Iterator it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj2 = c0199requestDisallowInterceptTouchEvent;
                                break;
                            }
                            Object next4 = it4.next();
                            if (next4 instanceof C0199requestDisallowInterceptTouchEvent) {
                                obj2 = next4;
                                break;
                            }
                        }
                        c0199requestDisallowInterceptTouchEvent2 = (C0199requestDisallowInterceptTouchEvent) obj2;
                    }
                }
                c0199requestDisallowInterceptTouchEvent2 = c0199requestDisallowInterceptTouchEvent;
            } else {
                c0199requestDisallowInterceptTouchEvent = null;
                c0199requestDisallowInterceptTouchEvent2 = c0199requestDisallowInterceptTouchEvent;
            }
        } else {
            c0199requestDisallowInterceptTouchEvent = null;
            c0199requestDisallowInterceptTouchEvent2 = c0199requestDisallowInterceptTouchEvent;
        }
        textFieldValueKt.IconCompatParcelizer = 1;
        return flowCollector.emit(c0199requestDisallowInterceptTouchEvent2, textFieldValueKt) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }
}
