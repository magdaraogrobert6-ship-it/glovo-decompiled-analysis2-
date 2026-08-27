package com.roadrunner.delivery.pickupdropoff.confirmbutton.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AsyncFontListLoaderloadWithTimeoutOrNull2;
import o.ComposeAnimationState;
import o.EmptyGroup;
import o.EnumColumnAdapter;
import o.FontListFontFamilyTypefaceAdapter;
import o.UnsupportedSearchInfo;
import o.buildCompositionParentHierarchy;
import o.executeAsList;
import o.fastFilterNotNull;
import o.fastFold;
import o.fastJoinTo;
import o.findCompatibleComposeMethod;
import o.getDismissOnBackPress;
import o.getNoopState;
import o.getOptimizationLevel;
import o.keyPosition;
import o.putdefault;
import o.setInitialStateToCurrentAnimationValue;
import o.setTransactionSuccessful;
import o.toFontFamily;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmButtonV1MapperImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final ConfirmationRepository IconCompatParcelizer;
    public final setInitialStateToCurrentAnimationValue RemoteActionCompatParcelizer;
    public final EnumColumnAdapter read;
    public final setTransactionSuccessful write;

    public ConfirmButtonV1MapperImpl(setInitialStateToCurrentAnimationValue setinitialstatetocurrentanimationvalue, EnumColumnAdapter enumColumnAdapter, ConfirmationRepository confirmationRepository, setTransactionSuccessful settransactionsuccessful) {
        setinitialstatetocurrentanimationvalue.getClass();
        enumColumnAdapter.getClass();
        confirmationRepository.getClass();
        settransactionsuccessful.getClass();
        this.RemoteActionCompatParcelizer = setinitialstatetocurrentanimationvalue;
        this.read = enumColumnAdapter;
        this.IconCompatParcelizer = confirmationRepository;
        this.write = settransactionsuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    public final Object invoke(fastFilterNotNull fastfilternotnull, ContinuationImpl continuationImpl) {
        findCompatibleComposeMethod findcompatiblecomposemethod;
        buildCompositionParentHierarchy buildcompositionparenthierarchy;
        Object next;
        UnsupportedSearchInfo unsupportedSearchInfo;
        String str;
        String str2;
        Map map;
        buildCompositionParentHierarchy buildcompositionparenthierarchy2;
        List list;
        Object next2;
        keyPosition keyposition;
        String str3;
        int i = 2 % 2;
        if (!(continuationImpl instanceof findCompatibleComposeMethod)) {
            findcompatiblecomposemethod = new findCompatibleComposeMethod(this, continuationImpl);
        } else {
            int i2 = MediaBrowserCompatMediaItem + 93;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            findcompatiblecomposemethod = (findCompatibleComposeMethod) continuationImpl;
            int i4 = findcompatiblecomposemethod.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                findcompatiblecomposemethod.read = i4 - Integer.MIN_VALUE;
            } else {
                findcompatiblecomposemethod = new findCompatibleComposeMethod(this, continuationImpl);
            }
        }
        Object confirmationResponse = findcompatiblecomposemethod.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = findcompatiblecomposemethod.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(confirmationResponse);
            List list2 = fastfilternotnull.components;
            if (list2 != null) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i6 = MediaBrowserCompatMediaItem + 103;
                    serializer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        next = it.next();
                    } else {
                        boolean z = it.next() instanceof fastFold;
                        throw null;
                    }
                } while (!(next instanceof fastFold));
                fastFold fastfold = (fastFold) next;
                if (fastfold != null) {
                    getDismissOnBackPress getdismissonbackpress = fastfold.button;
                    fastJoinTo fastjointo = fastfold.confirmationPrompt;
                    setInitialStateToCurrentAnimationValue setinitialstatetocurrentanimationvalue = this.RemoteActionCompatParcelizer;
                    ComposeAnimationState composeAnimationStateSerializer = setinitialstatetocurrentanimationvalue.serializer(getdismissonbackpress);
                    getNoopState getnoopstate = setinitialstatetocurrentanimationvalue.serializer(fastjointo.confirmButton).actionData;
                    if (!(getnoopstate instanceof UnsupportedSearchInfo)) {
                        unsupportedSearchInfo = null;
                    } else {
                        int i7 = serializer + 105;
                        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            unsupportedSearchInfo = (UnsupportedSearchInfo) getnoopstate;
                        } else {
                            throw null;
                        }
                    }
                    String str4 = composeAnimationStateSerializer.actionTitle;
                    if (unsupportedSearchInfo != null) {
                        int i8 = serializer + 1;
                        MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            str = unsupportedSearchInfo.path;
                            int i9 = 29 / 0;
                        } else {
                            str = unsupportedSearchInfo.path;
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        int i10 = MediaBrowserCompatMediaItem + 3;
                        serializer = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            str2 = "";
                        } else {
                            throw null;
                        }
                    } else {
                        str2 = str;
                    }
                    Object obj = (unsupportedSearchInfo == null || (map = unsupportedSearchInfo.data) == null) ? null : map.get("status");
                    buildcompositionparenthierarchy = new buildCompositionParentHierarchy("confirm_button", str4, false, obj instanceof String ? (String) obj : null, str2, new EmptyGroup(fastjointo.title, fastjointo.confirmButton.actionTitle, fastjointo.cancelButton.actionTitle));
                } else {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("ConfirmButtonV1MapperImpl: ButtonWithPrompt not found in the Delivery. Falling back to tasks-based path.", new Object[0]);
                    buildcompositionparenthierarchy = null;
                }
            } else {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("ConfirmButtonV1MapperImpl: ButtonWithPrompt not found in the Delivery. Falling back to tasks-based path.", new Object[0]);
                buildcompositionparenthierarchy = null;
            }
            if (buildcompositionparenthierarchy != null) {
                return buildcompositionparenthierarchy;
            }
            long j = fastfilternotnull.deliveryId;
            findcompatiblecomposemethod.read = 1;
            confirmationResponse = this.IconCompatParcelizer.getConfirmationResponse(j, findcompatiblecomposemethod);
            if (confirmationResponse == coroutineSingletons) {
                int i11 = MediaBrowserCompatMediaItem + 35;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
        } else if (i5 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(confirmationResponse);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AsyncFontListLoaderloadWithTimeoutOrNull2 asyncFontListLoaderloadWithTimeoutOrNull2 = (AsyncFontListLoaderloadWithTimeoutOrNull2) ((getOptimizationLevel) confirmationResponse).RemoteActionCompatParcelizer();
        if (asyncFontListLoaderloadWithTimeoutOrNull2 != null) {
            putdefault putdefaultVar = asyncFontListLoaderloadWithTimeoutOrNull2.data;
            if (putdefaultVar == null || (list = putdefaultVar.tasks) == null) {
                buildcompositionparenthierarchy2 = null;
            } else {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(next2 instanceof toFontFamily));
                toFontFamily tofontfamily = (toFontFamily) next2;
                if (tofontfamily == null) {
                    buildcompositionparenthierarchy2 = null;
                } else {
                    List list3 = tofontfamily.actions;
                    if (list3.isEmpty()) {
                        keyposition = null;
                    } else {
                        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = (FontListFontFamilyTypefaceAdapter) list3.get(0);
                        keyposition = new keyPosition(fontListFontFamilyTypefaceAdapter.path, tofontfamily.confirmationPrompt, tofontfamily.actionTitle, (String) fontListFontFamilyTypefaceAdapter.data.get("delivery_status"));
                    }
                    if (keyposition == null) {
                        buildcompositionparenthierarchy2 = null;
                    } else {
                        String str5 = putdefaultVar.actionTitle;
                        if (str5 == null) {
                            int i13 = MediaBrowserCompatMediaItem + 119;
                            serializer = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            str3 = "";
                        } else {
                            str3 = str5;
                        }
                        buildcompositionparenthierarchy2 = new buildCompositionParentHierarchy("confirm_button", str3, true, keyposition.IconCompatParcelizer, keyposition.RemoteActionCompatParcelizer, new EmptyGroup(keyposition.write, keyposition.read, this.write.IconCompatParcelizer(R.string.upload_receipt_retry_dialog_skip)));
                    }
                }
            }
            if (buildcompositionparenthierarchy2 != null) {
                return buildcompositionparenthierarchy2;
            }
        }
        EnumColumnAdapter.serializer(this.read, "pudo_confirm_button_not_shown", executeAsList.PUDO, "Confirmation buttons not being shown — riders unable to complete pick up and/or drop off flow");
        return null;
    }
}
